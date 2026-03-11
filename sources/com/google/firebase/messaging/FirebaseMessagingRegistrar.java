package com.google.firebase.messaging;

import L1.k;
import M0.a;
import X0.g;
import a1.C0096a;
import a1.b;
import a1.i;
import a1.q;
import androidx.annotation.Keep;
import c1.C0132b;
import com.google.firebase.components.ComponentRegistrar;
import i1.c;
import j1.C0263b;
import java.util.Arrays;
import java.util.List;
import k1.C0272a;
import m1.C0330d;
import o0.C0357e;
import u1.C0495b;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(C0272a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.b(C0495b.class), bVar.b(j1.g.class), (C0330d) bVar.a(C0330d.class), bVar.c(qVar), (c) bVar.a(c.class));
        }
        throw new ClassCastException();
    }

    @Keep
    public List<C0096a> getComponents() {
        q qVar = new q(C0132b.class, C0357e.class);
        boolean z3 = false;
        k kVar = new k(FirebaseMessaging.class, new Class[0]);
        kVar.f957a = LIBRARY_NAME;
        kVar.a(i.a(g.class));
        kVar.a(new i(C0272a.class, 0, 0));
        kVar.a(new i(C0495b.class, 0, 1));
        kVar.a(new i(j1.g.class, 0, 1));
        kVar.a(i.a(C0330d.class));
        kVar.a(new i(qVar, 0, 1));
        kVar.a(i.a(c.class));
        kVar.f962f = new C0263b(qVar, 1);
        if (kVar.f960d == 0) {
            z3 = true;
        }
        if (z3) {
            kVar.f960d = 1;
            return Arrays.asList(new C0096a[]{kVar.f(), a.f(LIBRARY_NAME, "24.1.2")});
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
