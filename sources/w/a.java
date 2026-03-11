package W;

import android.os.Trace;

public abstract class a {
    public static void a(String str, int i3) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(String str, int i3) {
        Trace.endAsyncSection(str, i3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
