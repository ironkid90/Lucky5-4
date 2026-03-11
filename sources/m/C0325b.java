package m;

import android.os.LocaleList;

/* renamed from: m.b  reason: case insensitive filesystem */
public abstract class C0325b {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
