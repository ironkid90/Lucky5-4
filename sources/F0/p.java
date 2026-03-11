package F0;

import C0.e;
import C0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import s1.C0429B;

public final class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f345a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Context f346b;

    /* renamed from: c  reason: collision with root package name */
    public Object f347c;

    public /* synthetic */ p() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C0429B b3 = (C0429B) this.f347c;
        if (b3 != null) {
            Context context = b3.f4490h.f2864b;
            this.f346b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f345a) {
            case 0:
                Uri data = intent.getData();
                String str = null;
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                }
                if ("com.google.android.gms".equals(str)) {
                    ((e) ((r) this.f347c).f161h).getClass();
                    throw null;
                }
                return;
            default:
                C0429B b3 = (C0429B) this.f347c;
                if (b3 != null && b3.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    C0429B b4 = (C0429B) this.f347c;
                    b4.f4490h.getClass();
                    FirebaseMessaging.b(b4, 0);
                    Context context2 = this.f346b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f347c = null;
                    return;
                }
                return;
        }
    }

    public p(r rVar) {
        this.f347c = rVar;
    }
}
