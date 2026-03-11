package F;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class j extends View.BaseSavedState {
    public static final Parcelable.Creator<j> CREATOR = new D0.j(4);

    /* renamed from: a  reason: collision with root package name */
    public int f288a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f288a + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f288a);
    }
}
