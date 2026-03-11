package G0;

import D0.c;
import D0.j;
import H0.a;
import a.C0094a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new j(8);

    /* renamed from: a  reason: collision with root package name */
    public Bundle f444a;

    /* renamed from: b  reason: collision with root package name */
    public c[] f445b;

    /* renamed from: c  reason: collision with root package name */
    public int f446c;

    /* renamed from: d  reason: collision with root package name */
    public b f447d;

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.R(parcel, 1, this.f444a);
        C0094a.V(parcel, 2, this.f445b, i3);
        C0094a.Y(parcel, 3, 4);
        parcel.writeInt(this.f446c);
        C0094a.T(parcel, 4, this.f447d, i3);
        C0094a.X(parcel, W2);
    }
}
