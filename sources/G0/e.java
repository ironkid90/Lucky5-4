package G0;

import D0.j;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new j(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f402a;

    /* renamed from: b  reason: collision with root package name */
    public final int f403b;

    /* renamed from: c  reason: collision with root package name */
    public final int f404c;

    /* renamed from: d  reason: collision with root package name */
    public final long f405d;

    /* renamed from: e  reason: collision with root package name */
    public final long f406e;

    /* renamed from: f  reason: collision with root package name */
    public final String f407f;

    /* renamed from: g  reason: collision with root package name */
    public final String f408g;

    /* renamed from: h  reason: collision with root package name */
    public final int f409h;

    /* renamed from: i  reason: collision with root package name */
    public final int f410i;

    public e(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f402a = i3;
        this.f403b = i4;
        this.f404c = i5;
        this.f405d = j3;
        this.f406e = j4;
        this.f407f = str;
        this.f408g = str2;
        this.f409h = i6;
        this.f410i = i7;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f402a);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(this.f403b);
        C0094a.Y(parcel, 3, 4);
        parcel.writeInt(this.f404c);
        C0094a.Y(parcel, 4, 8);
        parcel.writeLong(this.f405d);
        C0094a.Y(parcel, 5, 8);
        parcel.writeLong(this.f406e);
        C0094a.U(parcel, 6, this.f407f);
        C0094a.U(parcel, 7, this.f408g);
        C0094a.Y(parcel, 8, 4);
        parcel.writeInt(this.f409h);
        C0094a.Y(parcel, 9, 4);
        parcel.writeInt(this.f410i);
        C0094a.X(parcel, W2);
    }
}
