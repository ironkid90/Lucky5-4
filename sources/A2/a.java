package A2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator, B2.a {

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f66f;

    /* renamed from: g  reason: collision with root package name */
    public int f67g;

    public a(Object[] objArr) {
        this.f66f = objArr;
    }

    public final boolean hasNext() {
        if (this.f67g < this.f66f.length) {
            return true;
        }
        return false;
    }

    public final Object next() {
        try {
            Object[] objArr = this.f66f;
            int i3 = this.f67g;
            this.f67g = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f67g--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
