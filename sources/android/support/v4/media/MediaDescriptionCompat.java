package android.support.v4.media;

import D0.j;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new j(16);

    /* renamed from: a  reason: collision with root package name */
    public final String f2040a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f2041b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f2042c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f2043d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f2044e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f2045f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f2046g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f2047h;

    /* renamed from: i  reason: collision with root package name */
    public MediaDescription f2048i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2040a = str;
        this.f2041b = charSequence;
        this.f2042c = charSequence2;
        this.f2043d = charSequence3;
        this.f2044e = bitmap;
        this.f2045f = uri;
        this.f2046g = bundle;
        this.f2047h = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f2041b + ", " + this.f2042c + ", " + this.f2043d;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        MediaDescription mediaDescription = this.f2048i;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f2040a);
            builder.setTitle(this.f2041b);
            builder.setSubtitle(this.f2042c);
            builder.setDescription(this.f2043d);
            builder.setIconBitmap(this.f2044e);
            builder.setIconUri(this.f2045f);
            builder.setExtras(this.f2046g);
            builder.setMediaUri(this.f2047h);
            mediaDescription = builder.build();
            this.f2048i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i3);
    }
}
