package G0;

import O0.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

public final class q extends a {

    /* renamed from: d  reason: collision with root package name */
    public com.google.android.gms.common.internal.a f437d;

    /* renamed from: e  reason: collision with root package name */
    public final int f438e;

    public q(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f437d = aVar;
        this.f438e = i3;
    }

    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            Q0.a.b(parcel);
            o.f(this.f437d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f437d;
            aVar.getClass();
            s sVar = new s(aVar, parcel.readInt(), parcel.readStrongBinder(), (Bundle) Q0.a.a(parcel, Bundle.CREATOR));
            p pVar = aVar.f2835e;
            pVar.sendMessage(pVar.obtainMessage(1, this.f438e, -1, sVar));
            this.f437d = null;
        } else if (i3 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) Q0.a.a(parcel, Bundle.CREATOR);
            Q0.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i3 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            u uVar = (u) Q0.a.a(parcel, u.CREATOR);
            Q0.a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f437d;
            o.f(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            o.e(uVar);
            aVar2.f2851u = uVar;
            Bundle bundle2 = uVar.f444a;
            o.f(this.f437d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f437d;
            aVar3.getClass();
            s sVar2 = new s(aVar3, readInt, readStrongBinder, bundle2);
            p pVar2 = aVar3.f2835e;
            pVar2.sendMessage(pVar2.obtainMessage(1, this.f438e, -1, sVar2));
            this.f437d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
