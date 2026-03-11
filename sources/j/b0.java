package j;

import H.b;
import H.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class b0 extends c {
    public static final Parcelable.Creator<b0> CREATOR = new b(2);

    /* renamed from: c  reason: collision with root package name */
    public boolean f3653c;

    public b0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3653c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3653c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f3653c));
    }
}
