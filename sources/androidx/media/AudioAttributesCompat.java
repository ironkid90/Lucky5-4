package androidx.media;

import Y.c;
import android.util.SparseIntArray;

public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2552b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f2553a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2553a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f2553a);
        }
        if (audioAttributesCompat.f2553a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2553a.hashCode();
    }

    public final String toString() {
        return this.f2553a.toString();
    }
}
