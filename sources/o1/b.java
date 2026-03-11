package o1;

import L.j;
import L1.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4151a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4152b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4153c;

    public b(long j3, String str, int i3) {
        this.f4151a = str;
        this.f4152b = j3;
        this.f4153c = i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [L1.l, java.lang.Object] */
    public static l a() {
        ? obj = new Object();
        obj.f966c = 0L;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f4151a;
        if (str != null ? str.equals(bVar.f4151a) : bVar.f4151a == null) {
            if (this.f4152b == bVar.f4152b) {
                int i3 = bVar.f4153c;
                int i4 = this.f4153c;
                if (i4 == 0) {
                    if (i3 == 0) {
                        return true;
                    }
                } else if (j.a(i4, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        String str = this.f4151a;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        long j3 = this.f4152b;
        int i5 = (((i3 ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i6 = this.f4153c;
        if (i6 != 0) {
            i4 = j.b(i6);
        }
        return i4 ^ i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f4151a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f4152b);
        sb.append(", responseCode=");
        int i3 = this.f4153c;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 == 2) {
            str = "BAD_CONFIG";
        } else if (i3 != 3) {
            str = "null";
        } else {
            str = "AUTH_ERROR";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
