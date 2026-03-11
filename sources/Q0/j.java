package q0;

public final class j extends q {

    /* renamed from: a  reason: collision with root package name */
    public final h f4360a;

    public j(h hVar) {
        this.f4360a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        p pVar = p.f4377f;
        ((j) qVar).getClass();
        if (!pVar.equals(pVar) || !this.f4360a.equals(((j) qVar).f4360a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((p.f4377f.hashCode() ^ 1000003) * 1000003) ^ this.f4360a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f4377f + ", androidClientInfo=" + this.f4360a + "}";
    }
}
