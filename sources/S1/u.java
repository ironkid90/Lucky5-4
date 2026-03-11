package S1;

import C0.f;
import T1.c;
import U1.b;
import a.C0094a;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.KeyEvent;
import c2.q;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import u1.C0496c;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1515f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1516g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f1517h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f1518i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f1519j;

    public /* synthetic */ u(f fVar, W1.f fVar2, C0496c cVar, long j3) {
        this.f1515f = 2;
        this.f1516g = fVar;
        this.f1517h = fVar2;
        this.f1519j = cVar;
        this.f1518i = j3;
    }

    public final void run() {
        switch (this.f1515f) {
            case 0:
                v vVar = (v) this.f1516g;
                vVar.getClass();
                vVar.b(false, Long.valueOf(((y) this.f1517h).f1525b), Long.valueOf(this.f1518i), ((KeyEvent) this.f1519j).getEventTime());
                return;
            case 1:
                v vVar2 = (v) this.f1516g;
                vVar2.getClass();
                vVar2.b(false, Long.valueOf(((y) this.f1517h).f1525b), Long.valueOf(this.f1518i), ((KeyEvent) this.f1519j).getEventTime());
                return;
            default:
                f fVar = (f) this.f1516g;
                fVar.getClass();
                String str = (String) ((W1.f) this.f1517h).f1915d.f1900c;
                AssetManager assets = C0094a.f1971k.getAssets();
                if (!((AtomicBoolean) fVar.f128h).get()) {
                    C0496c cVar = (C0496c) this.f1519j;
                    if (cVar != null) {
                        Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(cVar.b()));
                        fVar.f129i = new c(C0094a.f1971k, cVar.b());
                    } else {
                        Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                        fVar.f129i = new c(C0094a.f1971k, (String[]) null);
                    }
                    FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f1518i);
                    if (lookupCallbackInformation == null) {
                        Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                        return;
                    }
                    b bVar = ((c) fVar.f129i).f1682c;
                    q qVar = new q(bVar, "plugins.flutter.io/firebase_messaging_background");
                    fVar.f127g = qVar;
                    qVar.b(fVar);
                    bVar.a(new f((Object) assets, (Object) str, (Object) lookupCallbackInformation, 9));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u(v vVar, y yVar, long j3, KeyEvent keyEvent, int i3) {
        this.f1515f = i3;
        this.f1516g = vVar;
        this.f1517h = yVar;
        this.f1518i = j3;
        this.f1519j = keyEvent;
    }
}
