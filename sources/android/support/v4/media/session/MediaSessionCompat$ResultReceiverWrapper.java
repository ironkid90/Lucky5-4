package android.support.v4.media.session;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new j(20);

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f2054a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        this.f2054a.writeToParcel(parcel, i3);
    }
}
