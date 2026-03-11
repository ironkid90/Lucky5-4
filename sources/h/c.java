package H;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f483b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f484a;

    public c() {
        this.f484a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f484a, i3);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f484a = parcelable == f483b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f484a = readParcelable == null ? f483b : readParcelable;
    }
}
