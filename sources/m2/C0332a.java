package m2;

import a.C0094a;
import android.os.Trace;

/* renamed from: m2.a  reason: case insensitive filesystem */
public abstract class C0332a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(C0094a.N(a(str)));
    }
}
