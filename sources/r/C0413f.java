package r;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: r.f  reason: case insensitive filesystem */
public abstract class C0413f {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3);
    }
}
