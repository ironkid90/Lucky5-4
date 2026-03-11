package E2;

import B2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, a {

    /* renamed from: f  reason: collision with root package name */
    public final int f255f;

    /* renamed from: g  reason: collision with root package name */
    public final int f256g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f257h;

    /* renamed from: i  reason: collision with root package name */
    public int f258i;

    public b(int i3, int i4, int i5) {
        this.f255f = i5;
        this.f256g = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f257h = z3;
        this.f258i = !z3 ? i4 : i3;
    }

    public final int a() {
        int i3 = this.f258i;
        if (i3 != this.f256g) {
            this.f258i = this.f255f + i3;
        } else if (this.f257h) {
            this.f257h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i3;
    }

    public final boolean hasNext() {
        return this.f257h;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
