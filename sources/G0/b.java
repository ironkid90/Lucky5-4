package G0;

import D0.j;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new j(9);

    /* renamed from: a  reason: collision with root package name */
    public final g f380a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f381b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f382c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f383d;

    /* renamed from: e  reason: collision with root package name */
    public final int f384e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f385f;

    public b(g gVar, boolean z3, boolean z4, int[] iArr, int i3, int[] iArr2) {
        this.f380a = gVar;
        this.f381b = z3;
        this.f382c = z4;
        this.f383d = iArr;
        this.f384e = i3;
        this.f385f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.T(parcel, 1, this.f380a, i3);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(this.f381b ? 1 : 0);
        C0094a.Y(parcel, 3, 4);
        parcel.writeInt(this.f382c ? 1 : 0);
        int[] iArr = this.f383d;
        if (iArr != null) {
            int W3 = C0094a.W(parcel, 4);
            parcel.writeIntArray(iArr);
            C0094a.X(parcel, W3);
        }
        C0094a.Y(parcel, 5, 4);
        parcel.writeInt(this.f384e);
        int[] iArr2 = this.f385f;
        if (iArr2 != null) {
            int W4 = C0094a.W(parcel, 6);
            parcel.writeIntArray(iArr2);
            C0094a.X(parcel, W4);
        }
        C0094a.X(parcel, W2);
    }
}
