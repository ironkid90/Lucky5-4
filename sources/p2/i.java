package P2;

import android.view.KeyCharacterMap;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f1270a;

    public i() {
        this.f1270a = 0;
    }

    public Character a(int i3) {
        char c3 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i4 = i3 & Integer.MAX_VALUE;
            int i5 = this.f1270a;
            if (i5 != 0) {
                this.f1270a = KeyCharacterMap.getDeadChar(i5, i4);
            } else {
                this.f1270a = i4;
            }
        } else {
            int i6 = this.f1270a;
            if (i6 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f1270a = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public i(int i3) {
        this.f1270a = i3;
    }
}
