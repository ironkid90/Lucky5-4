package w1;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
/* renamed from: w1.c  reason: case insensitive filesystem */
public final class C0504c extends g {
    public C0504c() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    public final String b(Field field) {
        return g.c(g.a(field.getName(), " "));
    }
}
