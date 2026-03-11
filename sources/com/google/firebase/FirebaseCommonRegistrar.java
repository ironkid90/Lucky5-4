package com.google.firebase;

import A.C0002c;
import L1.k;
import a1.C0096a;
import a1.i;
import a1.q;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.a;
import com.google.firebase.components.ComponentRegistrar;
import j1.C0263b;
import j1.d;
import j1.e;
import j1.f;
import j1.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p2.C0362b;
import u1.C0494a;
import u1.C0495b;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<C0495b> cls = C0495b.class;
        hashSet.add(q.a(cls));
        for (Class cls2 : new Class[0]) {
            a.h(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        i iVar = new i(C0494a.class, 2, 0);
        if (!hashSet.contains(iVar.f2019a)) {
            hashSet2.add(iVar);
            arrayList.add(new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0002c(16), hashSet3));
            q qVar = new q(Z0.a.class, Executor.class);
            k kVar = new k(d.class, new Class[]{f.class, g.class});
            kVar.a(i.a(Context.class));
            kVar.a(i.a(X0.g.class));
            kVar.a(new i(e.class, 2, 0));
            kVar.a(new i((Class) cls, 1, 1));
            kVar.a(new i(qVar, 1, 0));
            kVar.f962f = new C0263b(qVar, 0);
            arrayList.add(kVar.f());
            arrayList.add(M0.a.f("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
            arrayList.add(M0.a.f("fire-core", "21.0.0"));
            arrayList.add(M0.a.f("device-name", a(Build.PRODUCT)));
            arrayList.add(M0.a.f("device-model", a(Build.DEVICE)));
            arrayList.add(M0.a.f("device-brand", a(Build.BRAND)));
            arrayList.add(M0.a.p("android-target-sdk", new C0002c(1)));
            arrayList.add(M0.a.p("android-min-sdk", new C0002c(2)));
            arrayList.add(M0.a.p("android-platform", new C0002c(3)));
            arrayList.add(M0.a.p("android-installer", new C0002c(4)));
            try {
                C0362b.f4185g.getClass();
                str = "2.2.0";
            } catch (NoClassDefFoundError unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(M0.a.f("kotlin", str));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
