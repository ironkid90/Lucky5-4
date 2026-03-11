package androidx.window.layout.adapter.sidecar;

import A2.i;
import C0.f;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.C0148j;
import g0.C0174f;
import g0.C0175g;
import g0.C0177i;
import java.util.Collection;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0177i f2656a;

    public SidecarCompat$TranslatingCallback(C0177i iVar) {
        this.f2656a = iVar;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface d3;
        i.e(sidecarDeviceState, "newDeviceState");
        Collection<Activity> values = this.f2656a.f2970c.values();
        C0177i iVar = this.f2656a;
        for (Activity activity : values) {
            IBinder a2 = C0175g.a(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(a2 == null || (d3 = iVar.d()) == null)) {
                sidecarWindowLayoutInfo = d3.getWindowLayoutInfo(a2);
            }
            f a3 = iVar.f2972e;
            if (a3 != null) {
                a3.R(activity, iVar.f2969b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        i.e(iBinder, "windowToken");
        i.e(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f2656a.f2970c.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        C0174f b3 = this.f2656a.f2969b;
        SidecarInterface d3 = this.f2656a.d();
        if (d3 == null || (sidecarDeviceState = d3.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        C0148j e2 = b3.e(sidecarWindowLayoutInfo, sidecarDeviceState);
        f a2 = this.f2656a.f2972e;
        if (a2 != null) {
            a2.R(activity, e2);
        }
    }
}
