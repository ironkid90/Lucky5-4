package L1;

import A2.i;
import B.m;
import C0.u;
import L.k;
import M1.e;
import N1.b;
import S1.r;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import c2.g;
import c2.n;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;
import i1.C0218a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import s1.C0438K;
import s1.C0456q;
import s1.C0465z;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f930f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f931g;

    public /* synthetic */ d(int i3, Object obj) {
        this.f930f = i3;
        this.f931g = obj;
    }

    public final void run() {
        switch (this.f930f) {
            case 0:
                break;
            case 1:
                b bVar = (b) this.f931g;
                g gVar = bVar.f1173g;
                ConnectivityManager connectivityManager = (ConnectivityManager) bVar.f1172f.f100g;
                gVar.a(m.q(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case k.FLOAT_FIELD_NUMBER:
                ((W1.d) this.f931g).f1909b.f1916e.prefetchDefaultFontManager();
                return;
            case k.INTEGER_FIELD_NUMBER:
                W1.b bVar2 = ((C0456q) ((Map.Entry) this.f931g).getKey()).f4585a;
                if (bVar2.b()) {
                    C0152a aVar = FirebaseMessaging.f2860l;
                    ((FirebaseMessaging) bVar2.f1902e).k();
                    return;
                }
                return;
            case k.LONG_FIELD_NUMBER:
                t tVar = (t) this.f931g;
                i.e(tVar, "this$0");
                int i3 = tVar.f2538g;
                l lVar = tVar.f2542k;
                if (i3 == 0) {
                    tVar.f2539h = true;
                    lVar.d(androidx.lifecycle.d.ON_PAUSE);
                }
                if (tVar.f2537f == 0 && tVar.f2539h) {
                    lVar.d(androidx.lifecycle.d.ON_STOP);
                    tVar.f2540i = true;
                    return;
                }
                return;
            case k.STRING_FIELD_NUMBER:
                ((io.flutter.plugin.platform.l) this.f931g).g(false);
                return;
            case k.STRING_SET_FIELD_NUMBER:
                Toast toast = (Toast) ((n) this.f931g).f2790h;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case k.DOUBLE_FIELD_NUMBER:
                ((u) this.f931g).getClass();
                return;
            case k.BYTES_FIELD_NUMBER:
                C0465z zVar = (C0465z) this.f931g;
                synchronized (((ArrayDeque) zVar.f4630j)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) zVar.f4627g).edit();
                    String str = (String) zVar.f4628h;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) zVar.f4630j).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) zVar.f4629i);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            case 9:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                C0438K k3 = (C0438K) this.f931g;
                sb2.append(k3.f4526a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                k3.f4527b.d((Object) null);
                return;
            default:
                x0.k kVar = (x0.k) this.f931g;
                kVar.getClass();
                ((y0.i) kVar.f4804d).g(new r(15, kVar));
                return;
        }
        while (true) {
            f fVar = (f) this.f931g;
            ArrayList arrayList = fVar.f938f;
            if (!arrayList.isEmpty() && fVar.f944l == null) {
                ((e) arrayList.get(0)).f1097a.run();
                arrayList.remove(0);
            } else {
                return;
            }
        }
    }

    public /* synthetic */ d(Map.Entry entry, C0218a aVar) {
        this.f930f = 3;
        this.f931g = entry;
    }
}
