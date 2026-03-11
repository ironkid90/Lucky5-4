package A;

import android.view.WindowInsets;

public abstract class U {
    public static int a(int i3) {
        int a2;
        int i4 = 0;
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i3 & i5) != 0) {
                if (i5 == 1) {
                    a2 = WindowInsets.Type.statusBars();
                } else if (i5 == 2) {
                    a2 = WindowInsets.Type.navigationBars();
                } else if (i5 == 4) {
                    a2 = WindowInsets.Type.captionBar();
                } else if (i5 == 8) {
                    a2 = WindowInsets.Type.ime();
                } else if (i5 == 16) {
                    a2 = WindowInsets.Type.systemGestures();
                } else if (i5 == 32) {
                    a2 = WindowInsets.Type.mandatorySystemGestures();
                } else if (i5 == 64) {
                    a2 = WindowInsets.Type.tappableElement();
                } else if (i5 == 128) {
                    a2 = WindowInsets.Type.displayCutout();
                }
                i4 |= a2;
            }
        }
        return i4;
    }
}
