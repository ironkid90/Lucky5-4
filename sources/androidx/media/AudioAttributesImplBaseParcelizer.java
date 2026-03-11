package androidx.media;

import Y.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2556a = aVar.f(audioAttributesImplBase.f2556a, 1);
        audioAttributesImplBase.f2557b = aVar.f(audioAttributesImplBase.f2557b, 2);
        audioAttributesImplBase.f2558c = aVar.f(audioAttributesImplBase.f2558c, 3);
        audioAttributesImplBase.f2559d = aVar.f(audioAttributesImplBase.f2559d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f2556a, 1);
        aVar.j(audioAttributesImplBase.f2557b, 2);
        aVar.j(audioAttributesImplBase.f2558c, 3);
        aVar.j(audioAttributesImplBase.f2559d, 4);
    }
}
