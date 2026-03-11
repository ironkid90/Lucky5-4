package M0;

import android.content.Context;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f1088b;

    /* renamed from: a  reason: collision with root package name */
    public b f1089a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, M0.c] */
    static {
        ? obj = new Object();
        obj.f1089a = null;
        f1088b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f1088b;
        synchronized (cVar) {
            try {
                if (cVar.f1089a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f1089a = new b(context);
                }
                bVar = cVar.f1089a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return bVar;
    }
}
