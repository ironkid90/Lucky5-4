package q2;

import A2.i;
import B2.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: q2.a  reason: case insensitive filesystem */
public final class C0398a implements Collection, a {

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f4389f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4390g;

    public C0398a(Object[] objArr, boolean z3) {
        this.f4389f = objArr;
        this.f4390g = z3;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f4389f;
        i.e(objArr, "<this>");
        if (C0400c.L(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f4389f.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new A2.a(this.f4389f);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f4389f.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f4389f;
        i.e(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (this.f4390g && objArr.getClass().equals(cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        return i.i(this, objArr);
    }
}
