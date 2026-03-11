package a1;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Class f2034a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f2035b;

    public q(Class cls, Class cls2) {
        this.f2034a = cls;
        this.f2035b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f2035b.equals(qVar.f2035b)) {
            return false;
        }
        return this.f2034a.equals(qVar.f2034a);
    }

    public final int hashCode() {
        return this.f2034a.hashCode() + (this.f2035b.hashCode() * 31);
    }

    public final String toString() {
        Class<p> cls = p.class;
        Class cls2 = this.f2035b;
        Class<p> cls3 = this.f2034a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
