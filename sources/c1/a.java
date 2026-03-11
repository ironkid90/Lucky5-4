package C1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import w1.k;
import w1.r;
import w1.s;
import y1.d;
import z1.C0525a;
import z1.c;
import z1.l;

public final class a implements s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f175f;

    public /* synthetic */ a(int i3) {
        this.f175f = i3;
    }

    public final r create(k kVar, D1.a aVar) {
        Type type;
        switch (this.f175f) {
            case 0:
                if (aVar.f220a == Date.class) {
                    return new b(0);
                }
                return null;
            case 1:
                if (aVar.f220a == Time.class) {
                    return new b(1);
                }
                return null;
            case L.k.FLOAT_FIELD_NUMBER /*2*/:
                if (aVar.f220a != Timestamp.class) {
                    return null;
                }
                kVar.getClass();
                return new b(kVar.c(new D1.a(java.util.Date.class)));
            case L.k.INTEGER_FIELD_NUMBER /*3*/:
                Type type2 = aVar.f221b;
                boolean z3 = type2 instanceof GenericArrayType;
                if (!z3 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                    return null;
                }
                if (z3) {
                    type = ((GenericArrayType) type2).getGenericComponentType();
                } else {
                    type = ((Class) type2).getComponentType();
                }
                return new C0525a(kVar, kVar.c(new D1.a(type)), d.h(type));
            case L.k.LONG_FIELD_NUMBER /*4*/:
                if (aVar.f220a == java.util.Date.class) {
                    return new c();
                }
                return null;
            case L.k.STRING_FIELD_NUMBER /*5*/:
                if (aVar.f220a == Object.class) {
                    return new l(kVar);
                }
                return null;
            default:
                Class<Enum> cls = Enum.class;
                Class<? super Object> cls2 = aVar.f220a;
                if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                    return null;
                }
                if (!cls2.isEnum()) {
                    cls2 = cls2.getSuperclass();
                }
                return new C0525a(cls2);
        }
    }
}
