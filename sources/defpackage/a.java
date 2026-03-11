package defpackage;

/* renamed from: a  reason: default package */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f1966a;

    public a(Boolean bool) {
        this.f1966a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return M0.a.l(M0.a.A(this.f1966a), M0.a.A(((a) obj).f1966a));
    }

    public final int hashCode() {
        return M0.a.A(this.f1966a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f1966a + ")";
    }
}
