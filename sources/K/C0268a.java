package k;

import M0.a;

/* renamed from: k.a  reason: case insensitive filesystem */
public final class C0268a extends a {

    /* renamed from: e  reason: collision with root package name */
    public static volatile C0268a f3857e;

    /* renamed from: d  reason: collision with root package name */
    public final C0271d f3858d = new C0271d();

    public static C0268a b0() {
        if (f3857e != null) {
            return f3857e;
        }
        synchronized (C0268a.class) {
            try {
                if (f3857e == null) {
                    f3857e = new C0268a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f3857e;
    }
}
