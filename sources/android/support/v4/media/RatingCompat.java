package android.support.v4.media;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new j(18);

    /* renamed from: a  reason: collision with root package name */
    public final int f2050a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2051b;

    public RatingCompat(int i3, float f3) {
        this.f2050a = i3;
        this.f2051b = f3;
    }

    public final int describeContents() {
        return this.f2050a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f2050a);
        sb.append(" rating=");
        float f3 = this.f2051b;
        if (f3 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f3);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2050a);
        parcel.writeFloat(this.f2051b);
    }
}
