package com.dexterous.flutterlocalnotifications;

import D1.a;
import E1.b;
import E1.c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import w1.m;
import w1.o;
import w1.p;
import w1.q;
import w1.r;
import y1.d;
import y1.j;
import y1.k;
import y1.l;
import z1.f;
import z1.h;
import z1.n;
import z1.u;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2816a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2817b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2818c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2819d;

    public i(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f2819d = runtimeTypeAdapterFactory;
        this.f2817b = linkedHashMap;
        this.f2818c = linkedHashMap2;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [E1.b, z1.f] */
    public final Object a(b bVar) {
        switch (this.f2816a) {
            case 0:
                m j3 = d.j(bVar);
                p b3 = j3.b();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f2819d;
                m mVar = (m) b3.f4742f.remove(runtimeTypeAdapterFactory.typeFieldName);
                if (mVar != null) {
                    String c3 = mVar.c();
                    r rVar = (r) ((LinkedHashMap) this.f2817b).get(c3);
                    if (rVar != null) {
                        try {
                            ? bVar2 = new b(f.f4889y);
                            bVar2.f4891u = new Object[32];
                            bVar2.v = 0;
                            bVar2.f4892w = new String[32];
                            bVar2.f4893x = new int[32];
                            bVar2.H(j3);
                            return rVar.a(bVar2);
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw new RuntimeException("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " subtype named " + c3 + "; did you forget to register a subtype?");
                    }
                } else {
                    throw new RuntimeException("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " because it does not define a field named " + runtimeTypeAdapterFactory.typeFieldName);
                }
            default:
                return ((r) this.f2818c).a(bVar);
        }
    }

    public final void b(c cVar, Object obj) {
        Type type;
        Object obj2 = this.f2818c;
        Object obj3 = this.f2819d;
        switch (this.f2816a) {
            case 0:
                Class<?> cls = obj.getClass();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) obj3;
                String str = (String) runtimeTypeAdapterFactory.subtypeToLabel.get(cls);
                r rVar = (r) ((LinkedHashMap) obj2).get(cls);
                if (rVar != null) {
                    rVar.getClass();
                    try {
                        h hVar = new h();
                        rVar.b(hVar, obj);
                        ArrayList arrayList = hVar.f4896p;
                        if (arrayList.isEmpty()) {
                            p b3 = hVar.f4898r.b();
                            String access$000 = runtimeTypeAdapterFactory.typeFieldName;
                            l lVar = b3.f4742f;
                            if (!lVar.containsKey(access$000)) {
                                p pVar = new p();
                                String access$0002 = runtimeTypeAdapterFactory.typeFieldName;
                                q qVar = new q(str);
                                l lVar2 = pVar.f4742f;
                                lVar2.put(access$0002, qVar);
                                Iterator it = ((j) lVar.entrySet()).iterator();
                                while (((y1.i) it).hasNext()) {
                                    k b4 = ((y1.i) it).b();
                                    String str2 = (String) b4.getKey();
                                    Object obj4 = (m) b4.getValue();
                                    if (obj4 == null) {
                                        obj4 = o.f4741f;
                                    }
                                    lVar2.put(str2, obj4);
                                }
                                z1.r rVar2 = u.f4940a;
                                z1.k.d(cVar, pVar);
                                return;
                            }
                            throw new RuntimeException("cannot serialize " + cls.getName() + " because it already defines a field named " + runtimeTypeAdapterFactory.typeFieldName);
                        }
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    throw new RuntimeException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
            default:
                Type type2 = (Type) obj3;
                if (obj == null || (type2 != Object.class && !(type2 instanceof TypeVariable) && !(type2 instanceof Class))) {
                    type = type2;
                } else {
                    type = obj.getClass();
                }
                r rVar3 = (r) obj2;
                if (type != type2) {
                    r c3 = ((w1.k) this.f2817b).c(new a(type));
                    if (!(c3 instanceof n) || (rVar3 instanceof n)) {
                        rVar3 = c3;
                    }
                }
                rVar3.b(cVar, obj);
                return;
        }
    }

    public i(w1.k kVar, r rVar, Type type) {
        this.f2817b = kVar;
        this.f2818c = rVar;
        this.f2819d = type;
    }
}
