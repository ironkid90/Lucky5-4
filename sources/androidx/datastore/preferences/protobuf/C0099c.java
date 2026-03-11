package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
public abstract class C0099c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f2408a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2409b;

    static {
        Class<?> cls;
        boolean z3;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2408a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f2409b = z3;
    }

    public static boolean a() {
        if (f2408a == null || f2409b) {
            return false;
        }
        return true;
    }
}
