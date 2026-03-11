package w1;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: w1.d  reason: case insensitive filesystem */
public final class C0505d extends g {
    public C0505d() {
        super("LOWER_CASE_WITH_UNDERSCORES", 3);
    }

    public final String b(Field field) {
        return g.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
    }
}
