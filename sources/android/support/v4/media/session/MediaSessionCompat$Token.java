package android.support.v4.media.session;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new j(21);

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f2055a;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f2055a = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f2055a;
        if (parcelable != null) {
            Parcelable parcelable2 = mediaSessionCompat$Token.f2055a;
            if (parcelable2 == null) {
                return false;
            }
            return parcelable.equals(parcelable2);
        } else if (mediaSessionCompat$Token.f2055a == null) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        Parcelable parcelable = this.f2055a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2055a, i3);
    }
}
