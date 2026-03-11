package com.google.firebase.datatransport;

import A.C0002c;
import L1.k;
import a1.C0096a;
import a1.i;
import a1.q;
import android.content.Context;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import c1.C0131a;
import c1.C0132b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import o0.C0357e;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C0096a> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<C0357e> cls = C0357e.class;
        hashSet.add(q.a(cls));
        for (Class cls2 : new Class[0]) {
            a.h(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        Class<Context> cls3 = Context.class;
        i a2 = i.a(cls3);
        if (!hashSet.contains(a2.f2019a)) {
            hashSet2.add(a2);
            C0096a aVar = new C0096a(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0002c(10), hashSet3);
            k a3 = C0096a.a(new q(C0131a.class, cls));
            a3.a(i.a(cls3));
            a3.f962f = new C0002c(11);
            C0096a f3 = a3.f();
            k a4 = C0096a.a(new q(C0132b.class, cls));
            a4.a(i.a(cls3));
            a4.f962f = new C0002c(12);
            return Arrays.asList(new C0096a[]{aVar, f3, a4.f(), M0.a.f(LIBRARY_NAME, "18.2.0")});
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
