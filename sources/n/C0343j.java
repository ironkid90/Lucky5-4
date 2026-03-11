package n;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: n.j  reason: case insensitive filesystem */
public final class C0343j implements Collection {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0334a f4084f;

    public C0343j(C0334a aVar) {
        this.f4084f = aVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f4084f.a();
    }

    public final boolean contains(Object obj) {
        if (this.f4084f.f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f4084f.d() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C0340g(this.f4084f, 1);
    }

    public final boolean remove(Object obj) {
        C0334a aVar = this.f4084f;
        int f3 = aVar.f(obj);
        if (f3 < 0) {
            return false;
        }
        aVar.g(f3);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C0334a aVar = this.f4084f;
        int d3 = aVar.d();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < d3) {
            if (collection.contains(aVar.b(i3, 1))) {
                aVar.g(i3);
                i3--;
                d3--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    public final boolean retainAll(Collection collection) {
        C0334a aVar = this.f4084f;
        int d3 = aVar.d();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < d3) {
            if (!collection.contains(aVar.b(i3, 1))) {
                aVar.g(i3);
                i3--;
                d3--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    public final int size() {
        return this.f4084f.d();
    }

    public final Object[] toArray() {
        C0334a aVar = this.f4084f;
        int d3 = aVar.d();
        Object[] objArr = new Object[d3];
        for (int i3 = 0; i3 < d3; i3++) {
            objArr[i3] = aVar.b(i3, 1);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f4084f.i(1, objArr);
    }
}
