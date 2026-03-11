package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class a0 implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public int f2403f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2404g;

    /* renamed from: h  reason: collision with root package name */
    public Iterator f2405h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Y f2406i;

    public a0(Y y2) {
        this.f2406i = y2;
    }

    public final Iterator a() {
        if (this.f2405h == null) {
            this.f2405h = this.f2406i.f2396g.entrySet().iterator();
        }
        return this.f2405h;
    }

    public final boolean hasNext() {
        int i3 = this.f2403f + 1;
        Y y2 = this.f2406i;
        if (i3 < y2.f2395f.size()) {
            return true;
        }
        if (y2.f2396g.isEmpty() || !a().hasNext()) {
            return false;
        }
        return true;
    }

    public final Object next() {
        this.f2404g = true;
        int i3 = this.f2403f + 1;
        this.f2403f = i3;
        Y y2 = this.f2406i;
        if (i3 < y2.f2395f.size()) {
            return (Map.Entry) y2.f2395f.get(this.f2403f);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f2404g) {
            this.f2404g = false;
            int i3 = Y.f2394k;
            Y y2 = this.f2406i;
            y2.b();
            if (this.f2403f < y2.f2395f.size()) {
                int i4 = this.f2403f;
                this.f2403f = i4 - 1;
                y2.h(i4);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
