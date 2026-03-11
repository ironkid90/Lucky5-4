package X0;

import A2.i;
import I2.K;
import L.k;
import Z0.a;
import Z0.c;
import a1.d;
import a1.q;
import java.util.concurrent.Executor;

public final class b implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final b f1922g = new b(1);

    /* renamed from: h  reason: collision with root package name */
    public static final b f1923h = new b(2);

    /* renamed from: i  reason: collision with root package name */
    public static final b f1924i = new b(3);

    /* renamed from: j  reason: collision with root package name */
    public static final b f1925j = new b(4);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1926f;

    public /* synthetic */ b(int i3) {
        this.f1926f = i3;
    }

    public Object a(T1.d dVar) {
        switch (this.f1926f) {
            case 1:
                Object d3 = dVar.d(new q(a.class, Executor.class));
                i.d(d3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d3);
            case k.FLOAT_FIELD_NUMBER:
                Object d4 = dVar.d(new q(c.class, Executor.class));
                i.d(d4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d4);
            case k.INTEGER_FIELD_NUMBER:
                Object d5 = dVar.d(new q(Z0.b.class, Executor.class));
                i.d(d5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d5);
            default:
                Object d6 = dVar.d(new q(Z0.d.class, Executor.class));
                i.d(d6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d6);
        }
    }
}
