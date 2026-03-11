package G0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

public final class r implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f440b;

    public r(a aVar, int i3) {
        this.f440b = aVar;
        this.f439a = i3;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n nVar;
        int i3;
        int i4;
        a aVar = this.f440b;
        if (iBinder == null) {
            synchronized (aVar.f2836f) {
                i3 = aVar.f2843m;
            }
            if (i3 == 3) {
                aVar.f2850t = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            p pVar = aVar.f2835e;
            pVar.sendMessage(pVar.obtainMessage(i4, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.f2837g) {
            try {
                a aVar2 = this.f440b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof n)) {
                    nVar = new n(iBinder);
                } else {
                    nVar = (n) queryLocalInterface;
                }
                aVar2.f2838h = nVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        a aVar3 = this.f440b;
        int i5 = this.f439a;
        aVar3.getClass();
        t tVar = new t(aVar3, 0);
        p pVar2 = aVar3.f2835e;
        pVar2.sendMessage(pVar2.obtainMessage(7, i5, -1, tVar));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.f440b.f2837g) {
            aVar = this.f440b;
            aVar.f2838h = null;
        }
        int i3 = this.f439a;
        p pVar = aVar.f2835e;
        pVar.sendMessage(pVar.obtainMessage(6, i3, 1));
    }
}
