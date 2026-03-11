package q0;

public final class n extends v {

    /* renamed from: a  reason: collision with root package name */
    public final u f4375a;

    /* renamed from: b  reason: collision with root package name */
    public final t f4376b;

    public n(u uVar, t tVar) {
        this.f4375a = uVar;
        this.f4376b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f4375a;
        if (uVar != null ? uVar.equals(((n) vVar).f4375a) : ((n) vVar).f4375a == null) {
            t tVar = this.f4376b;
            if (tVar == null) {
                if (((n) vVar).f4376b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f4376b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        u uVar = this.f4375a;
        if (uVar == null) {
            i3 = 0;
        } else {
            i3 = uVar.hashCode();
        }
        int i5 = (i3 ^ 1000003) * 1000003;
        t tVar = this.f4376b;
        if (tVar != null) {
            i4 = tVar.hashCode();
        }
        return i4 ^ i5;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4375a + ", mobileSubtype=" + this.f4376b + "}";
    }
}
