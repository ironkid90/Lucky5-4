package Q0;

import A2.h;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1297a = 0;

    static {
        a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(h.e("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
