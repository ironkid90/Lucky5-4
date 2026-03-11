package D0;

import O0.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f209b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(D0.d r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f209b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f208a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.i.<init>(D0.d, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = e.f201a;
        d dVar = this.f209b;
        Context context = this.f208a;
        int b3 = dVar.b(context, i4);
        AtomicBoolean atomicBoolean = f.f202a;
        if (b3 == 1 || b3 == 2 || b3 == 3 || b3 == 9) {
            Intent a2 = dVar.a(b3, context, "n");
            if (a2 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 201326592);
            }
            dVar.f(context, b3, pendingIntent);
        }
    }
}
