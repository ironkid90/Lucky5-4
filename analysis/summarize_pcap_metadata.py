from __future__ import annotations

import argparse
import ipaddress
import json
import struct
from collections import defaultdict
from pathlib import Path


LINKTYPE_ETHERNET = 1
LINKTYPE_RAW = 101


def read_cstr_len(data: bytes, offset: int, length_bytes: int) -> tuple[int, int]:
    if offset + length_bytes > len(data):
        raise ValueError("truncated length field")
    if length_bytes == 1:
        length = data[offset]
    elif length_bytes == 2:
        length = struct.unpack_from("!H", data, offset)[0]
    else:
        raise ValueError("unsupported length_bytes")
    return length, offset + length_bytes


def parse_tls_sni(payload: bytes) -> str | None:
    if len(payload) < 5 or payload[0] != 22:
        return None
    record_len = struct.unpack_from("!H", payload, 3)[0]
    if len(payload) < 5 + record_len:
        return None
    body = payload[5 : 5 + record_len]
    if len(body) < 4 or body[0] != 1:
        return None
    hs_len = int.from_bytes(body[1:4], "big")
    if len(body) < 4 + hs_len:
        return None
    p = 4
    if p + 2 + 32 > len(body):
        return None
    p += 2 + 32
    sess_len, p = read_cstr_len(body, p, 1)
    p += sess_len
    cipher_len, p = read_cstr_len(body, p, 2)
    p += cipher_len
    comp_len, p = read_cstr_len(body, p, 1)
    p += comp_len
    if p == len(body):
        return None
    ext_len, p = read_cstr_len(body, p, 2)
    end = p + ext_len
    while p + 4 <= min(end, len(body)):
        ext_type = struct.unpack_from("!H", body, p)[0]
        ext_size = struct.unpack_from("!H", body, p + 2)[0]
        p += 4
        ext = body[p : p + ext_size]
        p += ext_size
        if ext_type != 0 or len(ext) < 5:
            continue
        list_len = struct.unpack_from("!H", ext, 0)[0]
        q = 2
        list_end = min(2 + list_len, len(ext))
        while q + 3 <= list_end:
            name_type = ext[q]
            name_len = struct.unpack_from("!H", ext, q + 1)[0]
            q += 3
            host = ext[q : q + name_len]
            q += name_len
            if name_type == 0:
                try:
                    return host.decode("ascii", "ignore")
                except Exception:
                    return None
    return None


def parse_ipv4_packet(frame: bytes) -> dict | None:
    if len(frame) < 20:
        return None
    version_ihl = frame[0]
    version = version_ihl >> 4
    if version != 4:
        return None
    ihl = (version_ihl & 0x0F) * 4
    if len(frame) < ihl or ihl < 20:
        return None
    proto = frame[9]
    src_ip = str(ipaddress.ip_address(frame[12:16]))
    dst_ip = str(ipaddress.ip_address(frame[16:20]))
    payload = frame[ihl:]
    entry = {
        "ip_version": 4,
        "protocol": proto,
        "src_ip": src_ip,
        "dst_ip": dst_ip,
        "payload": payload,
    }
    if proto == 6 and len(payload) >= 20:
        src_port, dst_port = struct.unpack_from("!HH", payload, 0)
        data_offset = ((payload[12] >> 4) & 0x0F) * 4
        if len(payload) < data_offset:
            return None
        entry.update(
            {
                "transport": "tcp",
                "src_port": src_port,
                "dst_port": dst_port,
                "app_payload": payload[data_offset:],
            }
        )
    elif proto == 17 and len(payload) >= 8:
        src_port, dst_port = struct.unpack_from("!HH", payload, 0)
        entry.update(
            {
                "transport": "udp",
                "src_port": src_port,
                "dst_port": dst_port,
                "app_payload": payload[8:],
            }
        )
    else:
        entry["transport"] = None
        entry["app_payload"] = b""
    return entry


def decode_linktype(frame: bytes, linktype: int) -> dict | None:
    if linktype == LINKTYPE_RAW:
        return parse_ipv4_packet(frame)
    if linktype == LINKTYPE_ETHERNET:
        if len(frame) < 14:
            return None
        eth_type = struct.unpack_from("!H", frame, 12)[0]
        if eth_type == 0x0800:
            return parse_ipv4_packet(frame[14:])
        return None
    return None


def summarize_pcap(path: Path) -> dict:
    data = path.read_bytes()
    if len(data) < 24:
        raise ValueError("pcap too small")
    magic = data[:4]
    if magic != b"\xd4\xc3\xb2\xa1":
        raise ValueError("unsupported pcap format or endianness")
    _magic, _vmaj, _vmin, _thiszone, _sigfigs, snaplen, linktype = struct.unpack_from("<IHHIIII", data, 0)
    offset = 24

    flows: dict[tuple, dict] = {}
    sni_hosts = defaultdict(int)
    packet_count = 0
    tls_client_hellos = 0
    first_ts = None
    last_ts = None

    while offset + 16 <= len(data):
        ts_sec, ts_usec, incl_len, _orig_len = struct.unpack_from("<IIII", data, offset)
        offset += 16
        frame = data[offset : offset + incl_len]
        offset += incl_len
        packet_count += 1
        ts = ts_sec + ts_usec / 1_000_000
        first_ts = ts if first_ts is None else min(first_ts, ts)
        last_ts = ts if last_ts is None else max(last_ts, ts)

        pkt = decode_linktype(frame, linktype)
        if not pkt or not pkt.get("transport"):
            continue

        key = (pkt["transport"], pkt["src_ip"], pkt["src_port"], pkt["dst_ip"], pkt["dst_port"])
        if key not in flows:
            flows[key] = {
                "transport": pkt["transport"],
                "src_ip": pkt["src_ip"],
                "src_port": pkt["src_port"],
                "dst_ip": pkt["dst_ip"],
                "dst_port": pkt["dst_port"],
                "packets": 0,
                "bytes": 0,
            }
        flows[key]["packets"] += 1
        flows[key]["bytes"] += len(pkt["app_payload"])

        if pkt["transport"] == "tcp" and pkt["app_payload"]:
            sni = parse_tls_sni(pkt["app_payload"])
            if sni:
                tls_client_hellos += 1
                sni_hosts[sni] += 1

    top_flows = sorted(flows.values(), key=lambda x: (x["packets"], x["bytes"]), reverse=True)[:20]
    return {
        "file": str(path),
        "linktype": linktype,
        "snaplen": snaplen,
        "packets": packet_count,
        "duration_seconds": None if first_ts is None or last_ts is None else round(last_ts - first_ts, 6),
        "tls_client_hellos": tls_client_hellos,
        "sni_hosts": dict(sorted(sni_hosts.items(), key=lambda kv: kv[1], reverse=True)),
        "top_flows": top_flows,
    }


def main() -> None:
    parser = argparse.ArgumentParser(description="Summarize non-decrypted PCAP metadata.")
    parser.add_argument("pcaps", nargs="+", type=Path)
    parser.add_argument("--json-out", type=Path, default=None)
    args = parser.parse_args()

    summaries = [summarize_pcap(path) for path in args.pcaps]
    if args.json_out:
        args.json_out.write_text(json.dumps(summaries, indent=2), encoding="utf-8")

    for summary in summaries:
        print(f"# {Path(summary['file']).name}")
        print(f"packets={summary['packets']} duration_seconds={summary['duration_seconds']} linktype={summary['linktype']}")
        print(f"tls_client_hellos={summary['tls_client_hellos']}")
        if summary["sni_hosts"]:
            print("sni_hosts:")
            for host, count in summary["sni_hosts"].items():
                print(f"  {host}: {count}")
        print("top_flows:")
        for flow in summary["top_flows"][:10]:
            print(
                f"  {flow['transport']} {flow['src_ip']}:{flow['src_port']} -> "
                f"{flow['dst_ip']}:{flow['dst_port']} packets={flow['packets']} bytes={flow['bytes']}"
            )
        print()


if __name__ == "__main__":
    main()
