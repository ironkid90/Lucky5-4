package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n.i  reason: case insensitive filesystem */
public final class C0342i implements Iterator, Map.Entry {

    /* renamed from: f  reason: collision with root package name */
    public int f4080f;

    /* renamed from: g  reason: collision with root package name */
    public int f4081g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4082h = false;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0334a f4083i;

    public C0342i(C0334a aVar) {
        this.f4083i = aVar;
        this.f4080f = aVar.d() - 1;
        this.f4081g = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f4082h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i3 = this.f4081g;
            C0334a aVar = this.f4083i;
            Object b3 = aVar.b(i3, 0);
            if (key != b3 && (key == null || !key.equals(b3))) {
                return false;
            }
            Object value = entry.getValue();
            Object b4 = aVar.b(this.f4081g, 1);
            if (value == b4 || (value != null && value.equals(b4))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f4082h) {
            return this.f4083i.b(this.f4081g, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f4082h) {
            return this.f4083i.b(this.f4081g, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f4081g < this.f4080f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        if (this.f4082h) {
            int i4 = this.f4081g;
            C0334a aVar = this.f4083i;
            int i5 = 0;
            Object b3 = aVar.b(i4, 0);
            Object b4 = aVar.b(this.f4081g, 1);
            if (b3 == null) {
                i3 = 0;
            } else {
                i3 = b3.hashCode();
            }
            if (b4 != null) {
                i5 = b4.hashCode();
            }
            return i3 ^ i5;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f4081g++;
            this.f4082h = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f4082h) {
            this.f4083i.g(this.f4081g);
            this.f4081g--;
            this.f4080f--;
            this.f4082h = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f4082h) {
            C0334a aVar = this.f4083i;
            int i3 = this.f4081g;
            switch (aVar.f4048d) {
                case 0:
                    int i4 = (i3 << 1) + 1;
                    Object[] objArr = ((C0335b) aVar.f4049e).f4090g;
                    Object obj2 = objArr[i4];
                    objArr[i4] = obj;
                    return obj2;
                default:
                    throw new UnsupportedOperationException("not a map");
            }
        } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
