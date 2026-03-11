package w1;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: w1.e  reason: case insensitive filesystem */
public final class C0506e extends g {
    public C0506e() {
        super("LOWER_CASE_WITH_DASHES", 4);
    }

    public final String b(Field field) {
        return g.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
    }
}
