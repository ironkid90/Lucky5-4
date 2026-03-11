package N1;

import B.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import c2.g;
import c2.h;

public final class b extends BroadcastReceiver implements h {

    /* renamed from: f  reason: collision with root package name */
    public final m f1172f;

    /* renamed from: g  reason: collision with root package name */
    public g f1173g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1174h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    public a f1175i;

    public b(Context context, m mVar) {
        this.f1172f = mVar;
    }

    public final void m(g gVar) {
        this.f1173g = gVar;
        a aVar = new a(this);
        this.f1175i = aVar;
        m mVar = this.f1172f;
        ((ConnectivityManager) mVar.f100g).registerDefaultNetworkCallback(aVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) mVar.f100g;
        this.f1174h.post(new L1.h(2, this, m.q(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    public final void onReceive(Context context, Intent intent) {
        g gVar = this.f1173g;
        if (gVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1172f.f100g;
            gVar.a(m.q(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }

    public final void r() {
        a aVar = this.f1175i;
        if (aVar != null) {
            ((ConnectivityManager) this.f1172f.f100g).unregisterNetworkCallback(aVar);
            this.f1175i = null;
        }
    }
}
