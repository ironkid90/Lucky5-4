package q;

import android.media.AudioAttributes;

/* renamed from: q.o  reason: case insensitive filesystem */
public abstract class C0385o {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i3) {
        return builder.setContentType(i3);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i3) {
        return builder.setLegacyStreamType(i3);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i3) {
        return builder.setUsage(i3);
    }
}
