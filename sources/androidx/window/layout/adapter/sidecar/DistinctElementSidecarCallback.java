package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g0.C0174f;
import java.util.WeakHashMap;

public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2651a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f2652b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f2653c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final C0174f f2654d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f2655e;

    public DistinctElementSidecarCallback(C0174f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f2654d = fVar;
        this.f2655e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.f2651a) {
                try {
                    C0174f fVar = this.f2654d;
                    SidecarDeviceState sidecarDeviceState2 = this.f2652b;
                    fVar.getClass();
                    if (!C0174f.a(sidecarDeviceState2, sidecarDeviceState)) {
                        this.f2652b = sidecarDeviceState;
                        this.f2655e.onDeviceStateChanged(sidecarDeviceState);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f2651a) {
            try {
                this.f2654d.getClass();
                if (!C0174f.d((SidecarWindowLayoutInfo) this.f2653c.get(iBinder), sidecarWindowLayoutInfo)) {
                    this.f2653c.put(iBinder, sidecarWindowLayoutInfo);
                    this.f2655e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
