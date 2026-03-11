package O0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a extends Binder implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1233c = 1;

    public a(String str) {
        attachInterface(this, str);
    }

    public boolean d(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f1233c) {
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return d(i3, parcel, parcel2);
            default:
                return super.onTransact(i3, parcel, parcel2, i4);
        }
    }

    public IBinder asBinder() {
        return this;
    }
}
