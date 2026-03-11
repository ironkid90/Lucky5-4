package com.google.firebase.concurrent;

import A.C0002c;
import L1.k;
import Z0.a;
import Z0.b;
import Z0.c;
import Z0.d;
import a1.C0096a;
import a1.e;
import a1.m;
import a1.q;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final m f2853a = new m(new e(2));

    /* renamed from: b  reason: collision with root package name */
    public static final m f2854b = new m(new e(3));

    /* renamed from: c  reason: collision with root package name */
    public static final m f2855c = new m(new e(4));

    /* renamed from: d  reason: collision with root package name */
    public static final m f2856d = new m(new e(5));

    public final List getComponents() {
        Class<a> cls = a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        q qVar = new q(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        q[] qVarArr = {new q(cls, cls3), new q(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q h3 : qVarArr) {
            android.support.v4.media.session.a.h(h3, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        C0096a aVar = new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0002c(5), hashSet3);
        Class<b> cls5 = b.class;
        q qVar2 = new q(cls5, cls2);
        q[] qVarArr2 = {new q(cls5, cls3), new q(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar2);
        for (q h4 : qVarArr2) {
            android.support.v4.media.session.a.h(h4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        C0096a aVar2 = new C0096a((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0002c(6), hashSet6);
        Class<c> cls6 = c.class;
        q qVar3 = new q(cls6, cls2);
        q[] qVarArr3 = {new q(cls6, cls3), new q(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar3);
        for (q h5 : qVarArr3) {
            android.support.v4.media.session.a.h(h5, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        C0096a aVar3 = new C0096a((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0002c(7), hashSet9);
        k a2 = C0096a.a(new q(d.class, cls4));
        a2.f962f = new C0002c(8);
        return Arrays.asList(new C0096a[]{aVar, aVar2, aVar3, a2.f()});
    }
}
