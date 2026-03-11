package N;

import android.util.Log;
import java.io.Writer;

public final class j extends Writer {

    /* renamed from: f  reason: collision with root package name */
    public final String f1168f = "FragmentManager";

    /* renamed from: g  reason: collision with root package name */
    public final StringBuilder f1169g = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f1169g;
        if (sb.length() > 0) {
            Log.d(this.f1168f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == 10) {
                a();
            } else {
                this.f1169g.append(c3);
            }
        }
    }
}
