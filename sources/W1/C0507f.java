package w1;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: w1.f  reason: case insensitive filesystem */
public final class C0507f extends g {
    public C0507f() {
        super("LOWER_CASE_WITH_DOTS", 5);
    }

    public final String b(Field field) {
        return g.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
    }
}
