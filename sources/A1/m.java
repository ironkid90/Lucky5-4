package a1;

import l1.C0313a;

public final class m implements C0313a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2025c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f2026a = f2025c;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0313a f2027b;

    public m(C0313a aVar) {
        this.f2027b = aVar;
    }

    public final Object get() {
        Object obj = this.f2026a;
        Object obj2 = f2025c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f2026a;
                    if (obj == obj2) {
                        obj = this.f2027b.get();
                        this.f2026a = obj;
                        this.f2027b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
