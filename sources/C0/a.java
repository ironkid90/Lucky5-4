package C0;

import a.C0094a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends H0.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public final Intent f107a;

    public a(Intent intent) {
        this.f107a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.T(parcel, 1, this.f107a, i3);
        C0094a.X(parcel, W2);
    }
}
