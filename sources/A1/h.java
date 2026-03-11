package a1;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final q f2017a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2018b;

    public h(q qVar, boolean z3) {
        this.f2017a = qVar;
        this.f2018b = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!hVar.f2017a.equals(this.f2017a) || hVar.f2018b != this.f2018b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f2017a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2018b).hashCode();
    }
}
