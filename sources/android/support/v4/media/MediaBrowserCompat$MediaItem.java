package android.support.v4.media;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new j(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f2038a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f2039b;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f2038a = parcel.readInt();
        this.f2039b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f2038a + ", mDescription=" + this.f2039b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2038a);
        this.f2039b.writeToParcel(parcel, i3);
    }
}
