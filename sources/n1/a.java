package N1;

import B.m;
import L1.d;
import L1.h;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f1171a;

    public a(b bVar) {
        this.f1171a = bVar;
    }

    public final void onAvailable(Network network) {
        b bVar = this.f1171a;
        bVar.f1174h.post(new h(2, bVar, m.q(((ConnectivityManager) bVar.f1172f.f100g).getNetworkCapabilities(network))));
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        b bVar = this.f1171a;
        bVar.f1172f.getClass();
        bVar.f1174h.post(new h(2, bVar, m.q(networkCapabilities)));
    }

    public final void onLost(Network network) {
        b bVar = this.f1171a;
        bVar.getClass();
        bVar.f1174h.postDelayed(new d(1, (Object) bVar), 500);
    }
}
