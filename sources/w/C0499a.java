package w;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: w.a  reason: case insensitive filesystem */
public abstract class C0499a {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, c cVar) {
        cVar.getClass();
        configuration.setLocales((LocaleList) null);
    }
}
