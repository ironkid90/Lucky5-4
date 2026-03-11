package com.google.firebase.ktx;

import I2.C0067s;
import L1.k;
import Z0.a;
import Z0.b;
import Z0.c;
import Z0.d;
import a1.C0096a;
import a1.i;
import a1.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import q2.C0402e;
import r1.C0416a;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<C0096a> getComponents() {
        Class<a> cls = a.class;
        Class<C0067s> cls2 = C0067s.class;
        k a2 = C0096a.a(new q(cls, cls2));
        Class<Executor> cls3 = Executor.class;
        a2.a(new i(new q(cls, cls3), 1, 0));
        a2.f962f = C0416a.f4447g;
        C0096a f3 = a2.f();
        Class<c> cls4 = c.class;
        k a3 = C0096a.a(new q(cls4, cls2));
        a3.a(new i(new q(cls4, cls3), 1, 0));
        a3.f962f = C0416a.f4448h;
        C0096a f4 = a3.f();
        Class<b> cls5 = b.class;
        k a4 = C0096a.a(new q(cls5, cls2));
        a4.a(new i(new q(cls5, cls3), 1, 0));
        a4.f962f = C0416a.f4449i;
        C0096a f5 = a4.f();
        Class<d> cls6 = d.class;
        k a5 = C0096a.a(new q(cls6, cls2));
        a5.a(new i(new q(cls6, cls3), 1, 0));
        a5.f962f = C0416a.f4450j;
        return C0402e.b0(f3, f4, f5, a5.f());
    }
}
