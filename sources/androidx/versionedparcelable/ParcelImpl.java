package androidx.versionedparcelable;

import D0.j;
import Y.b;
import Y.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new j(14);

    /* renamed from: a  reason: collision with root package name */
    public final c f2650a;

    public ParcelImpl(Parcel parcel) {
        this.f2650a = new b(parcel).h();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).l(this.f2650a);
    }
}
