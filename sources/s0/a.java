package s0;

import L.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f4470a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4471b;

    public a(long j3, int i3) {
        if (i3 != 0) {
            this.f4470a = i3;
            this.f4471b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(this.f4470a, aVar.f4470a) || this.f4471b != aVar.f4471b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f4471b;
        return ((j.b(this.f4470a) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i3 = this.f4470a;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i3 == 3) {
            str = "FATAL_ERROR";
        } else if (i3 != 4) {
            str = "null";
        } else {
            str = "INVALID_PAYLOAD";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f4471b);
        sb.append("}");
        return sb.toString();
    }
}
