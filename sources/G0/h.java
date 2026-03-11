package G0;

import D0.j;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new j(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f418a;

    /* renamed from: b  reason: collision with root package name */
    public List f419b;

    public h(int i3, List list) {
        this.f418a = i3;
        this.f419b = list;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f418a);
        List list = this.f419b;
        if (list != null) {
            int W3 = C0094a.W(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                Parcelable parcelable = (Parcelable) list.get(i4);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            C0094a.X(parcel, W3);
        }
        C0094a.X(parcel, W2);
    }
}
