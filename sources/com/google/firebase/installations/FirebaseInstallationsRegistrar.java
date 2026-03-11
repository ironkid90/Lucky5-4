package com.google.firebase.installations;

import A.C0002c;
import L1.k;
import S1.r;
import X0.g;
import Z0.a;
import a1.C0096a;
import a1.b;
import a1.i;
import a1.q;
import androidx.annotation.Keep;
import b1.j;
import com.google.firebase.components.ComponentRegistrar;
import j1.e;
import j1.f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m1.C0329c;
import m1.C0330d;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static C0330d lambda$getComponents$0(b bVar) {
        return new C0329c((g) bVar.a(g.class), bVar.b(f.class), (ExecutorService) bVar.d(new q(a.class, ExecutorService.class)), new j((Executor) bVar.d(new q(Z0.b.class, Executor.class))));
    }

    public List<C0096a> getComponents() {
        k kVar = new k(C0330d.class, new Class[0]);
        kVar.f957a = LIBRARY_NAME;
        kVar.a(i.a(g.class));
        kVar.a(new i(f.class, 0, 1));
        kVar.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        kVar.a(new i(new q(Z0.b.class, Executor.class), 1, 0));
        kVar.f962f = new C0002c(13);
        C0096a f3 = kVar.f();
        e eVar = new e(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(e.class));
        return Arrays.asList(new C0096a[]{f3, new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new r(1, eVar), hashSet3), M0.a.f(LIBRARY_NAME, "18.0.0")});
    }
}
