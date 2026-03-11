package android.support.v4.media.session;

import D0.j;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new j(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f2061a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2062b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2063c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2064d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2065e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2066f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f2067g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2068h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f2069i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2070j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f2071k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        public final String f2072a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f2073b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2074c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f2075d;

        public CustomAction(Parcel parcel) {
            this.f2072a = parcel.readString();
            this.f2073b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2074c = parcel.readInt();
            this.f2075d = parcel.readBundle(a.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f2073b + ", mIcon=" + this.f2074c + ", mExtras=" + this.f2075d;
        }

        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f2072a);
            TextUtils.writeToParcel(this.f2073b, parcel, i3);
            parcel.writeInt(this.f2074c);
            parcel.writeBundle(this.f2075d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f2061a = parcel.readInt();
        this.f2062b = parcel.readLong();
        this.f2064d = parcel.readFloat();
        this.f2068h = parcel.readLong();
        this.f2063c = parcel.readLong();
        this.f2065e = parcel.readLong();
        this.f2067g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2069i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f2070j = parcel.readLong();
        this.f2071k = parcel.readBundle(a.class.getClassLoader());
        this.f2066f = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f2061a + ", position=" + this.f2062b + ", buffered position=" + this.f2063c + ", speed=" + this.f2064d + ", updated=" + this.f2068h + ", actions=" + this.f2065e + ", error code=" + this.f2066f + ", error message=" + this.f2067g + ", custom actions=" + this.f2069i + ", active item id=" + this.f2070j + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2061a);
        parcel.writeLong(this.f2062b);
        parcel.writeFloat(this.f2064d);
        parcel.writeLong(this.f2068h);
        parcel.writeLong(this.f2063c);
        parcel.writeLong(this.f2065e);
        TextUtils.writeToParcel(this.f2067g, parcel, i3);
        parcel.writeTypedList(this.f2069i);
        parcel.writeLong(this.f2070j);
        parcel.writeBundle(this.f2071k);
        parcel.writeInt(this.f2066f);
    }
}
