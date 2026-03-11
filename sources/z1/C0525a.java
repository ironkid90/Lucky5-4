package z1;

import C1.a;
import E1.c;
import L.k;
import com.dexterous.flutterlocalnotifications.i;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import w1.r;
import x1.b;
import y1.m;

/* renamed from: z1.a  reason: case insensitive filesystem */
public final class C0525a extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4881d = new a(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4882a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4883b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4884c;

    public C0525a(Class cls) {
        this.f4882a = 3;
        this.f4884c = new HashMap();
        this.f4883b = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new t(field));
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    b bVar = (b) field.getAnnotation(b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            ((HashMap) this.f4884c).put(put, enumR);
                        }
                    }
                    ((HashMap) this.f4884c).put(name, enumR);
                    ((HashMap) this.f4883b).put(enumR, name);
                }
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object a(E1.b bVar) {
        switch (this.f4882a) {
            case 0:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(((r) ((i) this.f4883b).f2818c).a(bVar));
                }
                bVar.e();
                int size = arrayList.size();
                Object newInstance = Array.newInstance((Class) this.f4884c, size);
                for (int i3 = 0; i3 < size; i3++) {
                    Array.set(newInstance, i3, arrayList.get(i3));
                }
                return newInstance;
            case 1:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                Collection collection = (Collection) ((m) this.f4884c).r();
                bVar.a();
                while (bVar.j()) {
                    collection.add(((r) ((i) this.f4883b).f2818c).a(bVar));
                }
                bVar.e();
                return collection;
            case k.FLOAT_FIELD_NUMBER:
                Object a2 = ((r) this.f4883b).f4935h.a(bVar);
                if (a2 != null) {
                    Class cls = (Class) this.f4884c;
                    if (!cls.isInstance(a2)) {
                        throw new RuntimeException("Expected a " + cls.getName() + " but was " + a2.getClass().getName());
                    }
                }
                return a2;
            default:
                if (bVar.w() != 9) {
                    return (Enum) ((HashMap) this.f4884c).get(bVar.u());
                }
                bVar.s();
                return null;
        }
    }

    public final void b(c cVar, Object obj) {
        String str;
        switch (this.f4882a) {
            case 0:
                if (obj == null) {
                    cVar.j();
                    return;
                }
                cVar.b();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    ((i) this.f4883b).b(cVar, Array.get(obj, i3));
                }
                cVar.e();
                return;
            case 1:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.j();
                    return;
                }
                cVar.b();
                for (Object b3 : collection) {
                    ((i) this.f4883b).b(cVar, b3);
                }
                cVar.e();
                return;
            case k.FLOAT_FIELD_NUMBER:
                ((r) this.f4883b).f4935h.b(cVar, obj);
                return;
            default:
                Enum enumR = (Enum) obj;
                if (enumR == null) {
                    str = null;
                } else {
                    str = (String) ((HashMap) this.f4883b).get(enumR);
                }
                cVar.p(str);
                return;
        }
    }

    public C0525a(w1.k kVar, Type type, r rVar, m mVar) {
        this.f4882a = 1;
        this.f4883b = new i(kVar, rVar, type);
        this.f4884c = mVar;
    }

    public C0525a(w1.k kVar, r rVar, Class cls) {
        this.f4882a = 0;
        this.f4883b = new i(kVar, rVar, (Type) cls);
        this.f4884c = cls;
    }

    public C0525a(r rVar, Class cls) {
        this.f4882a = 2;
        this.f4883b = rVar;
        this.f4884c = cls;
    }
}
