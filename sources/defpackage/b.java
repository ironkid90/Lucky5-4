package defpackage;

import M0.a;

/* renamed from: b  reason: default package */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f2657a;

    public b(Boolean bool) {
        this.f2657a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.l(a.A(this.f2657a), a.A(((b) obj).f2657a));
    }

    public final int hashCode() {
        return a.A(this.f2657a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f2657a + ")";
    }
}
