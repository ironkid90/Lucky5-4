package C1;

import java.sql.Date;
import java.sql.Timestamp;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f181a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f182b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f183c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f184d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f181a = z3;
        if (z3) {
            new z1.d(Date.class);
            new z1.d(Timestamp.class);
            f182b = b.f176c;
            f183c = b.f177d;
            f184d = b.f178e;
            return;
        }
        f182b = null;
        f183c = null;
        f184d = null;
    }
}
