package android.support.v4.media.session;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new j(22);

    /* renamed from: a  reason: collision with root package name */
    public int f2056a;

    /* renamed from: b  reason: collision with root package name */
    public int f2057b;

    /* renamed from: c  reason: collision with root package name */
    public int f2058c;

    /* renamed from: d  reason: collision with root package name */
    public int f2059d;

    /* renamed from: e  reason: collision with root package name */
    public int f2060e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2056a);
        parcel.writeInt(this.f2058c);
        parcel.writeInt(this.f2059d);
        parcel.writeInt(this.f2060e);
        parcel.writeInt(this.f2057b);
    }
}
