package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class c extends Binder implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f2773d = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f2774c;

    public c(d dVar) {
        this.f2774c = dVar;
        attachInterface(this, b.f2772b);
    }

    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        Object obj;
        String str = b.f2772b;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i4);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            d dVar = this.f2774c;
            dVar.getClass();
            dVar.a(readInt, (Bundle) obj);
            return true;
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
