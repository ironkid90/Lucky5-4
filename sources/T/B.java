package T;

import H.b;
import H.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class B extends c {
    public static final Parcelable.Creator<B> CREATOR = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public Parcelable f1552c;

    public B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1552c = parcel.readParcelable(classLoader == null ? t.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f1552c, 0);
    }
}
