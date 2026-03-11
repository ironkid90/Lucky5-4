package androidx.media;

import Y.a;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2554a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f2554a, 1);
        audioAttributesImplApi26.f2555b = aVar.f(audioAttributesImplApi26.f2555b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f2554a, 1);
        aVar.j(audioAttributesImplApi26.f2555b, 2);
    }
}
