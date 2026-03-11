package j;

import H.b;
import H.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class n0 extends c {
    public static final Parcelable.Creator<n0> CREATOR = new b(3);

    /* renamed from: c  reason: collision with root package name */
    public int f3738c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3739d;

    public n0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z3;
        this.f3738c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3739d = z3;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f3738c);
        parcel.writeInt(this.f3739d ? 1 : 0);
    }
}
