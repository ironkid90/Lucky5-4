package k;

import M0.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;

/* renamed from: k.d  reason: case insensitive filesystem */
public final class C0271d extends a {

    /* renamed from: d  reason: collision with root package name */
    public final Object f3860d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Handler f3861e;

    public C0271d() {
        Executors.newFixedThreadPool(4, new C0269b());
    }

    public static Handler b0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0270c.a(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
