package A2;

import F2.b;
import a.C0094a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p2.C0363c;
import q2.C0402e;
import q2.C0403f;
import z2.a;
import z2.c;
import z2.d;
import z2.f;
import z2.g;
import z2.h;
import z2.i;
import z2.j;
import z2.k;
import z2.l;
import z2.m;
import z2.n;
import z2.o;
import z2.p;
import z2.q;
import z2.r;
import z2.s;
import z2.t;
import z2.u;
import z2.v;
import z2.w;

public final class e implements b, d {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f75b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f76a;

    static {
        List b02 = C0402e.b0(a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, z2.b.class, c.class, d.class, z2.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(C0403f.c0(b02));
        int i3 = 0;
        for (Object next : b02) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(new C0363c((Class) next, Integer.valueOf(i3)));
                i3 = i4;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f75b = q2.o.c0(arrayList);
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f76a = cls;
    }

    public final Class a() {
        return this.f76a;
    }

    public final String b() {
        String d3;
        Class cls = this.f76a;
        i.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return H2.l.l0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return H2.l.l0(simpleName, enclosingConstructor.getName() + '$');
            }
            int f02 = H2.l.f0(simpleName, '$', false, 6);
            if (f02 == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(f02 + 1, simpleName.length());
            i.d(substring, "substring(...)");
            return substring;
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (d3 = t.d(componentType.getName())) != null) {
                str = d3.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String d4 = t.d(cls.getName());
            if (d4 == null) {
                return cls.getSimpleName();
            }
            return d4;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e) || !C0094a.v(this).equals(C0094a.v((b) obj))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0094a.v(this).hashCode();
    }

    public final String toString() {
        return this.f76a + " (Kotlin reflection is not available)";
    }
}
