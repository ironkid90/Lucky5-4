package j$.time;

import j$.time.zone.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f4979a;
    private static final long serialVersionUID = 8352817235686L;

    /* access modifiers changed from: package-private */
    public abstract void T(ObjectOutput objectOutput);

    public abstract f r();

    public abstract String s();

    static {
        int i3 = 0;
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        while (i3 < 28) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) == null) {
                i3++;
            } else {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f4979a = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId of(String str) {
        return C(str, true);
    }

    public static ZoneId J(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.Z() != 0) {
                str = str.concat(zoneOffset.s());
            }
            return new y(str, f.h(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
    }

    static ZoneId C(String str, boolean z3) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.a0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return S(str, 3, z3);
        }
        if (str.startsWith("UT")) {
            return S(str, 2, z3);
        }
        return y.W(str, z3);
    }

    private static ZoneId S(String str, int i3, boolean z3) {
        String substring = str.substring(0, i3);
        if (str.length() == i3) {
            return J(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i3) != '+' && str.charAt(i3) != '-') {
            return y.W(str, z3);
        }
        try {
            ZoneOffset a02 = ZoneOffset.a0(str.substring(i3));
            if (a02 == ZoneOffset.UTC) {
                return J(substring, a02);
            }
            return J(substring, a02);
        } catch (c e2) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e2);
        }
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != y.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return s().equals(((ZoneId) obj).s());
        }
        return false;
    }

    public int hashCode() {
        return s().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return s();
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }
}
