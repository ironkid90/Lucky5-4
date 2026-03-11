package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.zone.f;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public final class ZoneOffset extends ZoneId implements TemporalAccessor, n, Comparable<ZoneOffset>, Serializable {
    public static final ZoneOffset UTC = c0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f4980d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f4981e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f4982f = c0(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f4983g = c0(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f4984b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f4985c;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j$.time.ZoneOffset a0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = f4981e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            r1 = 3
            if (r0 == r1) goto L_0x007f
            r4 = 5
            if (r0 == r4) goto L_0x005a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0050
            r5 = 7
            if (r0 == r5) goto L_0x0043
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
            int r2 = d0(r7, r5, r2)
            goto L_0x0085
        L_0x0037:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0043:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            int r2 = d0(r7, r4, r3)
            goto L_0x0085
        L_0x0050:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
        L_0x0058:
            r2 = r3
            goto L_0x0085
        L_0x005a:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            goto L_0x0058
        L_0x0063:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L_0x007f:
            int r0 = d0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0085:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x009e
            if (r3 != r5) goto L_0x0092
            goto L_0x009e
        L_0x0092:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x009e:
            if (r3 != r5) goto L_0x00a8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = b0(r7, r0, r1)
            return r7
        L_0x00a8:
            j$.time.ZoneOffset r7 = b0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.a0(java.lang.String):j$.time.ZoneOffset");
    }

    private static int d0(String str, int i3, boolean z3) {
        if (!z3 || str.charAt(i3 - 1) == ':') {
            char charAt = str.charAt(i3);
            char charAt2 = str.charAt(i3 + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: " + str);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: " + str);
    }

    public static ZoneOffset b0(int i3, int i4, int i5) {
        if (i3 < -18 || i3 > 18) {
            throw new RuntimeException("Zone offset hours not in valid range: value " + i3 + " is not in the range -18 to 18");
        }
        if (i3 > 0) {
            if (i4 < 0 || i5 < 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i3 < 0) {
            if (i4 > 0 || i5 > 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i4 > 0 && i5 < 0) || (i4 < 0 && i5 > 0)) {
            throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i4 < -59 || i4 > 59) {
            throw new RuntimeException("Zone offset minutes not in valid range: value " + i4 + " is not in the range -59 to 59");
        } else if (i5 < -59 || i5 > 59) {
            throw new RuntimeException("Zone offset seconds not in valid range: value " + i5 + " is not in the range -59 to 59");
        } else if (Math.abs(i3) != 18 || (i4 | i5) == 0) {
            return c0((i4 * 60) + (i3 * 3600) + i5);
        } else {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset c0(int i3) {
        if (i3 < -64800 || i3 > 64800) {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i3 % 900 != 0) {
            return new ZoneOffset(i3);
        } else {
            Integer valueOf = Integer.valueOf(i3);
            ConcurrentHashMap concurrentHashMap = f4980d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i3));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f4981e.putIfAbsent(zoneOffset2.f4985c, zoneOffset2);
            return zoneOffset2;
        }
    }

    private ZoneOffset(int i3) {
        String str;
        this.f4984b = i3;
        if (i3 == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i3);
            StringBuilder sb = new StringBuilder();
            int i4 = abs / 3600;
            int i5 = (abs / 60) % 60;
            sb.append(i3 < 0 ? "-" : "+");
            sb.append(i4 < 10 ? "0" : "");
            sb.append(i4);
            String str2 = ":";
            sb.append(i5 < 10 ? ":0" : str2);
            sb.append(i5);
            int i6 = abs % 60;
            if (i6 != 0) {
                sb.append(i6 < 10 ? ":0" : str2);
                sb.append(i6);
            }
            str = sb.toString();
        }
        this.f4985c = str;
    }

    public final int Z() {
        return this.f4984b;
    }

    public final String s() {
        return this.f4985c;
    }

    public final f r() {
        return f.h(this);
    }

    public final boolean f(r rVar) {
        if (rVar instanceof a) {
            if (rVar == a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (rVar == null || !rVar.W(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final int i(r rVar) {
        if (rVar == a.OFFSET_SECONDS) {
            return this.f4984b;
        }
        if (!(rVar instanceof a)) {
            return super.l(rVar).a(g(rVar), rVar);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final long g(r rVar) {
        if (rVar == a.OFFSET_SECONDS) {
            return (long) this.f4984b;
        }
        if (!(rVar instanceof a)) {
            return rVar.r(this);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final Object a(t tVar) {
        return (tVar == s.d() || tVar == s.f()) ? this : super.a(tVar);
    }

    public final m c(m mVar) {
        return mVar.b((long) this.f4984b, a.OFFSET_SECONDS);
    }

    /* renamed from: W */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f4984b - this.f4984b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        if (this.f4984b == ((ZoneOffset) obj).f4984b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4984b;
    }

    public final String toString() {
        return this.f4985c;
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void T(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        f0(objectOutput);
    }

    /* access modifiers changed from: package-private */
    public final void f0(DataOutput dataOutput) {
        int i3 = this.f4984b;
        int i4 = i3 % 900 == 0 ? i3 / 900 : 127;
        dataOutput.writeByte(i4);
        if (i4 == 127) {
            dataOutput.writeInt(i3);
        }
    }

    static ZoneOffset e0(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? c0(objectInput.readInt()) : c0(readByte * 900);
    }
}
