package androidx.media;

import Y.a;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2554a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f2554a, 1);
        audioAttributesImplApi21.f2555b = aVar.f(audioAttributesImplApi21.f2555b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f2554a, 1);
        aVar.j(audioAttributesImplApi21.f2555b, 2);
    }
}
