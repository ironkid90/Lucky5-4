package d0;

import java.util.Collection;
import java.util.List;
import q2.C0401d;
import z2.l;

/* renamed from: d0.j  reason: case insensitive filesystem */
public final class C0148j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2906a;

    public C0148j(List list) {
        this.f2906a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C0148j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f2906a.equals(((C0148j) obj).f2906a);
    }

    public final int hashCode() {
        return this.f2906a.hashCode();
    }

    public final String toString() {
        return C0401d.e0((Collection) this.f2906a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", (l) null, 56);
    }
}
