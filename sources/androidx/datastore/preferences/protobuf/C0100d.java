package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
public final class C0100d implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public int f2416f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final int f2417g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0103g f2418h;

    public C0100d(C0103g gVar) {
        this.f2418h = gVar;
        this.f2417g = gVar.size();
    }

    public final boolean hasNext() {
        if (this.f2416f < this.f2417g) {
            return true;
        }
        return false;
    }

    public final Object next() {
        int i3 = this.f2416f;
        if (i3 < this.f2417g) {
            this.f2416f = i3 + 1;
            return Byte.valueOf(this.f2418h.f(i3));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
