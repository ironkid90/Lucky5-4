package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2554a;

    /* renamed from: b  reason: collision with root package name */
    public int f2555b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2554a.equals(((AudioAttributesImplApi21) obj).f2554a);
    }

    public final int hashCode() {
        return this.f2554a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2554a;
    }
}
