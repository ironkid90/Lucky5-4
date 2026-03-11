package X0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n.C0343j;

public final class f extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f1932b = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1933a;

    public f(Context context) {
        this.f1933a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f1934k) {
            try {
                Iterator it = ((C0343j) g.f1935l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).g();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f1933a.unregisterReceiver(this);
    }
}
