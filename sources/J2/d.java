package J2;

import A2.i;
import M0.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import p2.C0364d;

public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = a.h(th);
        }
        if (obj instanceof C0364d) {
            obj = null;
        }
        c cVar = (c) obj;
    }

    public static final Handler a(Looper looper) {
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
