package G0;

import D0.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class n implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f432c;

    public n(IBinder iBinder) {
        this.f432c = iBinder;
    }

    public final void a(q qVar, c cVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(qVar);
            obtain.writeInt(1);
            j.a(cVar, obtain, 0);
            this.f432c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f432c;
    }
}
