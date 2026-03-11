package T;

import D0.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new j(13);

    /* renamed from: a  reason: collision with root package name */
    public int f1571a;

    /* renamed from: b  reason: collision with root package name */
    public int f1572b;

    /* renamed from: c  reason: collision with root package name */
    public int f1573c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f1574d;

    /* renamed from: e  reason: collision with root package name */
    public int f1575e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1576f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f1577g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1578h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1579i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1580j;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1571a);
        parcel.writeInt(this.f1572b);
        parcel.writeInt(this.f1573c);
        if (this.f1573c > 0) {
            parcel.writeIntArray(this.f1574d);
        }
        parcel.writeInt(this.f1575e);
        if (this.f1575e > 0) {
            parcel.writeIntArray(this.f1576f);
        }
        parcel.writeInt(this.f1578h ? 1 : 0);
        parcel.writeInt(this.f1579i ? 1 : 0);
        parcel.writeInt(this.f1580j ? 1 : 0);
        parcel.writeList(this.f1577g);
    }
}
