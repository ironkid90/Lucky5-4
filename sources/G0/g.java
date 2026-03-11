package G0;

import D0.j;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new j(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f413a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f414b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f415c;

    /* renamed from: d  reason: collision with root package name */
    public final int f416d;

    /* renamed from: e  reason: collision with root package name */
    public final int f417e;

    public g(int i3, boolean z3, boolean z4, int i4, int i5) {
        this.f413a = i3;
        this.f414b = z3;
        this.f415c = z4;
        this.f416d = i4;
        this.f417e = i5;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f413a);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(this.f414b ? 1 : 0);
        C0094a.Y(parcel, 3, 4);
        parcel.writeInt(this.f415c ? 1 : 0);
        C0094a.Y(parcel, 4, 4);
        parcel.writeInt(this.f416d);
        C0094a.Y(parcel, 5, 4);
        parcel.writeInt(this.f417e);
        C0094a.X(parcel, W2);
    }
}
