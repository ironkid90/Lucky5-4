package y1;

import D1.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w1.k;
import w1.r;
import w1.s;

public final class f implements s, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final f f4848h;

    /* renamed from: f  reason: collision with root package name */
    public List f4849f;

    /* renamed from: g  reason: collision with root package name */
    public List f4850g;

    /* JADX WARNING: type inference failed for: r0v0, types: [y1.f, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.f4849f = Collections.emptyList();
        obj.f4850g = Collections.emptyList();
        f4848h = obj;
    }

    public static boolean b(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0 || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    public final void a(boolean z3) {
        List list;
        if (z3) {
            list = this.f4849f;
        } else {
            list = this.f4850g;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final r create(k kVar, a aVar) {
        boolean z3;
        boolean z4;
        boolean b3 = b(aVar.f220a);
        if (!b3) {
            a(true);
            z3 = false;
        } else {
            z3 = true;
        }
        if (!b3) {
            a(false);
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 || z4) {
            return new e(this, z4, z3, kVar, aVar);
        }
        return null;
    }
}
