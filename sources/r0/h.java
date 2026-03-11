package r0;

import T1.d;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f4420a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f4421b;

    /* renamed from: c  reason: collision with root package name */
    public final k f4422c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4423d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4424e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f4425f;

    public h(String str, Integer num, k kVar, long j3, long j4, HashMap hashMap) {
        this.f4420a = str;
        this.f4421b = num;
        this.f4422c = kVar;
        this.f4423d = j3;
        this.f4424e = j4;
        this.f4425f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f4425f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f4425f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [T1.d, java.lang.Object] */
    public final d c() {
        ? obj = new Object();
        String str = this.f4420a;
        if (str != null) {
            obj.f1703a = str;
            obj.f1704b = this.f4421b;
            k kVar = this.f4422c;
            if (kVar != null) {
                obj.f1705c = kVar;
                obj.f1706d = Long.valueOf(this.f4423d);
                obj.f1707e = Long.valueOf(this.f4424e);
                obj.f1708f = new HashMap(this.f4425f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4420a.equals(hVar.f4420a)) {
            Integer num = hVar.f4421b;
            Integer num2 = this.f4421b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f4422c.equals(hVar.f4422c) && this.f4423d == hVar.f4423d && this.f4424e == hVar.f4424e && this.f4425f.equals(hVar.f4425f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (this.f4420a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f4421b;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        long j3 = this.f4423d;
        long j4 = this.f4424e;
        return ((((((((hashCode ^ i3) * 1000003) ^ this.f4422c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f4425f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f4420a + ", code=" + this.f4421b + ", encodedPayload=" + this.f4422c + ", eventMillis=" + this.f4423d + ", uptimeMillis=" + this.f4424e + ", autoMetadata=" + this.f4425f + "}";
    }
}
