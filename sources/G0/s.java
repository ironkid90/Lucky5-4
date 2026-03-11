package G0;

import B.m;
import E0.c;
import E0.d;
import F0.h;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

public final class s extends l {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f441g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f442h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        this.f442h = aVar;
        this.f441g = iBinder;
    }

    public final void a(D0.a aVar) {
        m mVar = this.f442h.f2845o;
        if (mVar != null) {
            ((d) mVar.f100g).c(aVar);
        }
        System.currentTimeMillis();
    }

    public final boolean b() {
        IBinder iBinder = this.f441g;
        try {
            o.e(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.f442h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                String r3 = aVar.r();
                Log.w("GmsClient", "service descriptor mismatch: " + r3 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o3 = aVar.o(iBinder);
            if (o3 == null || (!a.u(aVar, 2, 4, o3) && !a.u(aVar, 3, 4, o3))) {
                return false;
            }
            aVar.f2849s = null;
            h hVar = aVar.f2844n;
            if (hVar == null) {
                return true;
            }
            ((c) hVar.f322g).b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
