package c;

import D0.j;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new j(24);

    /* renamed from: a  reason: collision with root package name */
    public b f2775a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f2775a == null) {
                    this.f2775a = new c(this);
                }
                parcel.writeStrongBinder(this.f2775a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i3, Bundle bundle) {
    }
}
