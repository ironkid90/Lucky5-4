package t;

import android.graphics.Color;

/* renamed from: t.a  reason: case insensitive filesystem */
public abstract class C0467a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4634a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i5, b(Color.red(i3), alpha2, Color.red(i4), alpha, i5), b(Color.green(i3), alpha2, Color.green(i4), alpha, i5), b(Color.blue(i3), alpha2, Color.blue(i4), alpha, i5));
    }

    public static int b(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }
}
