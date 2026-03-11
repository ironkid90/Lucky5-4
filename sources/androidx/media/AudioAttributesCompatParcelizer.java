package androidx.media;

import Y.a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f2553a;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        audioAttributesCompat.f2553a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2553a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
