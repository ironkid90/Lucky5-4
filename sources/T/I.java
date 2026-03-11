package T;

import D0.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new j(12);

    /* renamed from: a  reason: collision with root package name */
    public int f1567a;

    /* renamed from: b  reason: collision with root package name */
    public int f1568b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f1569c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1570d;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1567a + ", mGapDir=" + this.f1568b + ", mHasUnwantedGapAfter=" + this.f1570d + ", mGapPerSpan=" + Arrays.toString(this.f1569c) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1567a);
        parcel.writeInt(this.f1568b);
        parcel.writeInt(this.f1570d ? 1 : 0);
        int[] iArr = this.f1569c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f1569c);
    }
}
