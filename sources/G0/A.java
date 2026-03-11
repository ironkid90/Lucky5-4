package G0;

import Q0.a;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class A implements d, IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f378c;

    public A(IBinder iBinder) {
        this.f378c = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f378c.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f378c;
    }
}
