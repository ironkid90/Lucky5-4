package H;

import L.k;
import T.B;
import android.os.Parcel;
import android.os.Parcelable;
import j.b0;
import j.n0;

public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f482a;

    public /* synthetic */ b(int i3) {
        this.f482a = i3;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f482a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f483b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new B(parcel, classLoader);
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return new b0(parcel, classLoader);
            default:
                return new n0(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i3) {
        switch (this.f482a) {
            case 0:
                return new c[i3];
            case 1:
                return new B[i3];
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return new b0[i3];
            default:
                return new n0[i3];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f482a) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return c.f483b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new B(parcel, (ClassLoader) null);
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return new b0(parcel, (ClassLoader) null);
            default:
                return new n0(parcel, (ClassLoader) null);
        }
    }
}
