package C0;

import M0.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f118a;

    public /* synthetic */ c(int i3) {
        this.f118a = i3;
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f118a) {
            case 0:
                int X2 = a.X(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < X2) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        a.T(parcel, readInt);
                    } else {
                        intent = (Intent) a.i(parcel, readInt, Intent.CREATOR);
                    }
                }
                a.o(parcel, X2);
                return new a(intent);
            default:
                return new i(parcel.readStrongBinder());
        }
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f118a) {
            case 0:
                return new a[i3];
            default:
                return new i[i3];
        }
    }
}
