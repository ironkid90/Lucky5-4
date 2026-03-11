package M0;

import C0.f;
import D0.g;
import android.content.Context;
import c2.n;
import d2.C0152a;
import o2.a;
import r0.j;
import r0.l;
import s0.e;
import s1.C0465z;
import t0.C0476a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f1087a;

    public /* synthetic */ b(Context context) {
        this.f1087a = context;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, r0.j] */
    /* JADX WARNING: type inference failed for: r5v2, types: [j.r0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Object, s1.y] */
    public j a() {
        Context context = this.f1087a;
        if (context != null) {
            ? obj = new Object();
            obj.f4429f = C0476a.a(l.f4437a);
            C0152a aVar = new C0152a(10, context);
            obj.f4430g = aVar;
            obj.f4431h = C0476a.a(new n(13, (Object) aVar, (Object) new e(aVar, 0)));
            C0152a aVar2 = obj.f4430g;
            obj.f4432i = new C0152a(11, aVar2);
            a a2 = C0476a.a(new n(15, (Object) obj.f4432i, (Object) C0476a.a(new e(aVar2, 1))));
            obj.f4433j = a2;
            g gVar = new g(16, false);
            C0152a aVar3 = obj.f4430g;
            f fVar = new f((Object) aVar3, (Object) a2, (Object) gVar, 26);
            a aVar4 = obj.f4429f;
            a aVar5 = obj.f4431h;
            C0465z zVar = new C0465z(aVar4, aVar5, fVar, a2, a2);
            ? obj2 = new Object();
            obj2.f3773f = aVar3;
            obj2.f3774g = aVar5;
            obj2.f3775h = a2;
            obj2.f3776i = fVar;
            obj2.f3777j = aVar4;
            obj2.f3778k = a2;
            obj2.f3779l = a2;
            ? obj3 = new Object();
            obj3.f4622f = aVar4;
            obj3.f4623g = a2;
            obj3.f4624h = fVar;
            obj3.f4625i = a2;
            obj.f4434k = C0476a.a(new f((Object) zVar, (Object) obj2, (Object) obj3, 24));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
