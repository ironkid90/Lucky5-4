package T;

import D0.j;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T.m  reason: case insensitive filesystem */
public final class C0092m implements Parcelable {
    public static final Parcelable.Creator<C0092m> CREATOR = new j(11);

    /* renamed from: a  reason: collision with root package name */
    public int f1651a;

    /* renamed from: b  reason: collision with root package name */
    public int f1652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1653c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1651a);
        parcel.writeInt(this.f1652b);
        parcel.writeInt(this.f1653c ? 1 : 0);
    }
}
