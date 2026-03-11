package z1;

import D1.a;
import c2.n;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import l0.C0312b;
import w1.i;
import w1.k;
import w1.r;
import w1.s;
import y1.d;
import y1.m;

/* renamed from: z1.b  reason: case insensitive filesystem */
public final class C0526b implements s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4885f;

    /* renamed from: g  reason: collision with root package name */
    public final n f4886g;

    public /* synthetic */ C0526b(n nVar, int i3) {
        this.f4885f = i3;
        this.f4886g = nVar;
    }

    public static r a(n nVar, k kVar, a aVar, x1.a aVar2) {
        r rVar;
        C0312b bVar;
        Object r3 = nVar.i(new a(aVar2.value())).r();
        if (r3 instanceof r) {
            rVar = (r) r3;
        } else if (r3 instanceof s) {
            rVar = ((s) r3).create(kVar, aVar);
        } else if (r3 instanceof C0312b) {
            if (r3 instanceof C0312b) {
                bVar = (C0312b) r3;
            } else {
                bVar = null;
            }
            rVar = new q(bVar, kVar, aVar, (p) null);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + r3.getClass().getName() + " as a @JsonAdapter for " + d.l(aVar.f221b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (rVar == null || !aVar2.nullSafe()) {
            return rVar;
        }
        return new i(rVar, 2);
    }

    public final r create(k kVar, a aVar) {
        Type[] typeArr;
        r rVar;
        Type type = Object.class;
        n nVar = this.f4886g;
        switch (this.f4885f) {
            case 0:
                Class<Collection> cls = Collection.class;
                Class cls2 = aVar.f220a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type2 = aVar.f221b;
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                d.c(cls.isAssignableFrom(cls2));
                Type k3 = d.k(type2, cls2, d.g(type2, cls2, cls), new HashMap());
                if (k3 instanceof WildcardType) {
                    k3 = ((WildcardType) k3).getUpperBounds()[0];
                }
                if (k3 instanceof ParameterizedType) {
                    type = ((ParameterizedType) k3).getActualTypeArguments()[0];
                }
                return new C0525a(kVar, type, kVar.c(new a(type)), nVar.i(aVar));
            case 1:
                x1.a aVar2 = (x1.a) aVar.f220a.getAnnotation(x1.a.class);
                if (aVar2 == null) {
                    return null;
                }
                return a(nVar, kVar, aVar, aVar2);
            default:
                Class<Map> cls3 = Map.class;
                if (!cls3.isAssignableFrom(aVar.f220a)) {
                    return null;
                }
                Type type3 = aVar.f221b;
                Class h3 = d.h(type3);
                if (type3 == Properties.class) {
                    Class<String> cls4 = String.class;
                    typeArr = new Type[]{cls4, cls4};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    d.c(cls3.isAssignableFrom(h3));
                    Type k4 = d.k(type3, h3, d.g(type3, h3, cls3), new HashMap());
                    if (k4 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) k4).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                if (type4 == Boolean.TYPE || type4 == Boolean.class) {
                    rVar = u.f4942c;
                } else {
                    rVar = kVar.c(new a(type4));
                }
                r rVar2 = rVar;
                r c3 = kVar.c(new a(typeArr[1]));
                m i3 = nVar.i(aVar);
                return new i(this, kVar, typeArr[0], rVar2, typeArr[1], c3, i3);
        }
    }
}
