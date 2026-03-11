package n;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: n.a  reason: case insensitive filesystem */
public final class C0334a {

    /* renamed from: a  reason: collision with root package name */
    public C0341h f4045a;

    /* renamed from: b  reason: collision with root package name */
    public C0341h f4046b;

    /* renamed from: c  reason: collision with root package name */
    public C0343j f4047c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4048d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4049e;

    public /* synthetic */ C0334a(int i3, Object obj) {
        this.f4048d = i3;
        this.f4049e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.f4048d) {
            case 0:
                ((C0335b) this.f4049e).clear();
                return;
            default:
                ((C0336c) this.f4049e).clear();
                return;
        }
    }

    public final Object b(int i3, int i4) {
        switch (this.f4048d) {
            case 0:
                return ((C0335b) this.f4049e).f4090g[(i3 << 1) + i4];
            default:
                return ((C0336c) this.f4049e).f4058g[i3];
        }
    }

    public final Map c() {
        switch (this.f4048d) {
            case 0:
                return (C0335b) this.f4049e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f4048d) {
            case 0:
                return ((C0335b) this.f4049e).f4091h;
            default:
                return ((C0336c) this.f4049e).f4059h;
        }
    }

    public final int e(Object obj) {
        switch (this.f4048d) {
            case 0:
                return ((C0335b) this.f4049e).d(obj);
            default:
                return ((C0336c) this.f4049e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f4048d) {
            case 0:
                return ((C0335b) this.f4049e).f(obj);
            default:
                return ((C0336c) this.f4049e).indexOf(obj);
        }
    }

    public final void g(int i3) {
        switch (this.f4048d) {
            case 0:
                ((C0335b) this.f4049e).h(i3);
                return;
            default:
                ((C0336c) this.f4049e).e(i3);
                return;
        }
    }

    public final Object[] i(int i3, Object[] objArr) {
        int d3 = d();
        if (objArr.length < d3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d3);
        }
        for (int i4 = 0; i4 < d3; i4++) {
            objArr[i4] = b(i4, i3);
        }
        if (objArr.length > d3) {
            objArr[d3] = null;
        }
        return objArr;
    }
}
