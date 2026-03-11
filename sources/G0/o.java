package G0;

import O0.e;
import android.os.Looper;
import android.text.TextUtils;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f433a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f434b;

    /* renamed from: c  reason: collision with root package name */
    public static int f435c;

    public static void a(e eVar) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != eVar.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = eVar.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
