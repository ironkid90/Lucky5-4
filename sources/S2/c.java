package S2;

import A2.i;
import D0.g;
import M.d;
import R2.b;
import R2.f;
import R2.l;
import j1.e;
import java.util.ArrayList;
import java.util.List;
import p2.C0363c;
import p2.C0366f;

public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final l f1533c = e.a("/", false);

    /* renamed from: b  reason: collision with root package name */
    public final C0366f f1534b;

    static {
        String str = l.f1393g;
    }

    public c(ClassLoader classLoader) {
        this.f1534b = new C0366f(new d(1, classLoader));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [R2.a, java.lang.Object] */
    public final R2.e b(l lVar) {
        l lVar2;
        l lVar3;
        l lVar4;
        i.e(lVar, "path");
        if (!g.e(lVar)) {
            return null;
        }
        l lVar5 = f1533c;
        lVar5.getClass();
        i.e(lVar, "child");
        l b3 = b.b(lVar5, lVar, true);
        int a2 = b.a(b3);
        b bVar = b3.f1394f;
        if (a2 == -1) {
            lVar2 = null;
        } else {
            lVar2 = new l(bVar.l(0, a2));
        }
        int a3 = b.a(lVar5);
        b bVar2 = lVar5.f1394f;
        if (a3 == -1) {
            lVar3 = null;
        } else {
            lVar3 = new l(bVar2.l(0, a3));
        }
        if (i.a(lVar2, lVar3)) {
            ArrayList a4 = b3.a();
            ArrayList a5 = lVar5.a();
            int min = Math.min(a4.size(), a5.size());
            int i3 = 0;
            while (i3 < min && i.a(a4.get(i3), a5.get(i3))) {
                i3++;
            }
            if (i3 == min && bVar.b() == bVar2.b()) {
                String str = l.f1393g;
                lVar4 = e.a(".", false);
            } else if (a5.subList(i3, a5.size()).indexOf(b.f1532e) == -1) {
                ? obj = new Object();
                b c3 = b.c(lVar5);
                if (c3 == null && (c3 = b.c(b3)) == null) {
                    c3 = b.f(l.f1393g);
                }
                int size = a5.size();
                for (int i4 = i3; i4 < size; i4++) {
                    obj.m(b.f1532e);
                    obj.m(c3);
                }
                int size2 = a4.size();
                while (i3 < size2) {
                    obj.m((b) a4.get(i3));
                    obj.m(c3);
                    i3++;
                }
                lVar4 = b.d(obj, false);
            } else {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b3 + " and " + lVar5).toString());
            }
            String n3 = lVar4.f1394f.n();
            for (C0363c cVar : (List) this.f1534b.a()) {
                R2.e b4 = ((f) cVar.f4187f).b(((l) cVar.f4188g).d(n3));
                if (b4 != null) {
                    return b4;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b3 + " and " + lVar5).toString());
    }
}
