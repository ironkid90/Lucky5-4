package X0;

import a1.C0096a;
import a1.d;
import a1.f;
import a1.i;
import a1.q;
import android.content.Context;
import i1.C0219b;
import j1.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l1.C0313a;
import q1.C0397a;

public final /* synthetic */ class c implements C0313a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1929c;

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.f1927a = i3;
        this.f1928b = obj;
        this.f1929c = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [T1.d, java.lang.Object] */
    public final Object get() {
        boolean z3;
        switch (this.f1927a) {
            case 0:
                g gVar = (g) this.f1928b;
                return new C0397a((Context) this.f1929c, gVar.f(), (C0219b) gVar.f1939d.a(C0219b.class));
            case 1:
                f fVar = (f) this.f1928b;
                fVar.getClass();
                C0096a aVar = (C0096a) this.f1929c;
                d dVar = aVar.f2001f;
                ? obj = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (i iVar : aVar.f1998c) {
                    int i3 = iVar.f2021c;
                    if (i3 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = iVar.f2020b;
                    q qVar = iVar.f2019a;
                    if (z3) {
                        if (i4 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i3 == 2) {
                        hashSet3.add(qVar);
                    } else if (i4 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                Set set = aVar.f2002g;
                if (!set.isEmpty()) {
                    hashSet.add(q.a(C0219b.class));
                }
                obj.f1703a = Collections.unmodifiableSet(hashSet);
                obj.f1704b = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                obj.f1705c = Collections.unmodifiableSet(hashSet4);
                obj.f1706d = Collections.unmodifiableSet(hashSet5);
                obj.f1707e = set;
                obj.f1708f = fVar;
                return dVar.a(obj);
            default:
                return new h((Context) this.f1929c, (String) this.f1928b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f1927a = 2;
        this.f1929c = context;
        this.f1928b = str;
    }
}
