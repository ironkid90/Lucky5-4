package t0;

import o2.a;

/* renamed from: t0.a  reason: case insensitive filesystem */
public final class C0476a implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f4657h = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile C0477b f4658f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f4659g;

    /* JADX WARNING: type inference failed for: r0v1, types: [o2.a, java.lang.Object, t0.a] */
    public static a a(C0477b bVar) {
        if (bVar instanceof C0476a) {
            return bVar;
        }
        ? obj = new Object();
        obj.f4659g = f4657h;
        obj.f4658f = bVar;
        return obj;
    }

    public final Object get() {
        Object obj = this.f4659g;
        Object obj2 = f4657h;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4659g;
                    if (obj == obj2) {
                        obj = this.f4658f.get();
                        Object obj3 = this.f4659g;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f4659g = obj;
                        this.f4658f = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
