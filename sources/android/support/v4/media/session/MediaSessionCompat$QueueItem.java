package android.support.v4.media.session;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new j(19);

    /* renamed from: a  reason: collision with root package name */
    public final MediaDescriptionCompat f2052a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2053b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f2052a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f2053b = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f2052a + ", Id=" + this.f2053b + " }";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        this.f2052a.writeToParcel(parcel, i3);
        parcel.writeLong(this.f2053b);
    }
}
