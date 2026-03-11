package y1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public k f4853f;

    /* renamed from: g  reason: collision with root package name */
    public k f4854g = null;

    /* renamed from: h  reason: collision with root package name */
    public int f4855h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l f4856i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f4857j;

    public i(l lVar, int i3) {
        this.f4857j = i3;
        this.f4856i = lVar;
        this.f4853f = lVar.f4873j.f4863i;
        this.f4855h = lVar.f4872i;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f4853f;
        l lVar = this.f4856i;
        if (kVar == lVar.f4873j) {
            throw new NoSuchElementException();
        } else if (lVar.f4872i == this.f4855h) {
            this.f4853f = kVar.f4863i;
            this.f4854g = kVar;
            return kVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        if (this.f4853f != this.f4856i.f4873j) {
            return true;
        }
        return false;
    }

    public Object next() {
        switch (this.f4857j) {
            case 1:
                return b().f4865k;
            default:
                return a();
        }
    }

    public final void remove() {
        k kVar = this.f4854g;
        if (kVar != null) {
            l lVar = this.f4856i;
            lVar.c(kVar, true);
            this.f4854g = null;
            this.f4855h = lVar.f4872i;
            return;
        }
        throw new IllegalStateException();
    }
}
