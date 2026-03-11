package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.g  reason: case insensitive filesystem */
public final class C0340g implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public final int f4073f;

    /* renamed from: g  reason: collision with root package name */
    public int f4074g;

    /* renamed from: h  reason: collision with root package name */
    public int f4075h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4076i = false;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C0334a f4077j;

    public C0340g(C0334a aVar, int i3) {
        this.f4077j = aVar;
        this.f4073f = i3;
        this.f4074g = aVar.d();
    }

    public final boolean hasNext() {
        if (this.f4075h < this.f4074g) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            Object b3 = this.f4077j.b(this.f4075h, this.f4073f);
            this.f4075h++;
            this.f4076i = true;
            return b3;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f4076i) {
            int i3 = this.f4075h - 1;
            this.f4075h = i3;
            this.f4074g--;
            this.f4076i = false;
            this.f4077j.g(i3);
            return;
        }
        throw new IllegalStateException();
    }
}
