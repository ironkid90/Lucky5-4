package N2;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1186a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f1186a = method;
    }
}
