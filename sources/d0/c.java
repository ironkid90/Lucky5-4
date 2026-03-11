package D0;

import C0.r;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new j(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f196a;

    /* renamed from: b  reason: collision with root package name */
    public final int f197b;

    /* renamed from: c  reason: collision with root package name */
    public final long f198c;

    public c() {
        this.f196a = "CLIENT_TELEMETRY";
        this.f198c = 1;
        this.f197b = -1;
    }

    public final long a() {
        long j3 = this.f198c;
        if (j3 == -1) {
            return (long) this.f197b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f196a;
            if (((str == null || !str.equals(cVar.f196a)) && (str != null || cVar.f196a != null)) || a() != cVar.a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f196a, Long.valueOf(a())});
    }

    public final String toString() {
        r rVar = new r((Object) this);
        rVar.B(this.f196a, "name");
        rVar.B(Long.valueOf(a()), "version");
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.U(parcel, 1, this.f196a);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(this.f197b);
        long a2 = a();
        C0094a.Y(parcel, 3, 8);
        parcel.writeLong(a2);
        C0094a.X(parcel, W2);
    }

    public c(long j3, String str, int i3) {
        this.f196a = str;
        this.f197b = i3;
        this.f198c = j3;
    }
}
