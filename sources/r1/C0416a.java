package r1;

import A2.i;
import I2.K;
import L.k;
import Z0.a;
import Z0.b;
import Z0.c;
import a1.d;
import a1.q;
import java.util.concurrent.Executor;

/* renamed from: r1.a  reason: case insensitive filesystem */
public final class C0416a implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final C0416a f4447g = new C0416a(0);

    /* renamed from: h  reason: collision with root package name */
    public static final C0416a f4448h = new C0416a(1);

    /* renamed from: i  reason: collision with root package name */
    public static final C0416a f4449i = new C0416a(2);

    /* renamed from: j  reason: collision with root package name */
    public static final C0416a f4450j = new C0416a(3);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4451f;

    public /* synthetic */ C0416a(int i3) {
        this.f4451f = i3;
    }

    public final Object a(T1.d dVar) {
        switch (this.f4451f) {
            case 0:
                Object d3 = dVar.d(new q(a.class, Executor.class));
                i.d(d3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d3);
            case 1:
                Object d4 = dVar.d(new q(c.class, Executor.class));
                i.d(d4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d4);
            case k.FLOAT_FIELD_NUMBER:
                Object d5 = dVar.d(new q(b.class, Executor.class));
                i.d(d5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d5);
            default:
                Object d6 = dVar.d(new q(Z0.d.class, Executor.class));
                i.d(d6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new K((Executor) d6);
        }
    }
}
