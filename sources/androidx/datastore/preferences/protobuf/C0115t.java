package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t  reason: case insensitive filesystem */
public final class C0115t implements L {

    /* renamed from: b  reason: collision with root package name */
    public static final C0115t f2493b = new C0115t(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2494a;

    public /* synthetic */ C0115t(int i3) {
        this.f2494a = i3;
    }

    public final boolean a(Class cls) {
        switch (this.f2494a) {
            case 0:
                return C0118w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public final V b(Class cls) {
        switch (this.f2494a) {
            case 0:
                Class<C0118w> cls2 = C0118w.class;
                if (cls2.isAssignableFrom(cls)) {
                    try {
                        return (V) C0118w.f(cls.asSubclass(cls2)).e(3);
                    } catch (Exception e2) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
