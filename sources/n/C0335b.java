package n;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: n.b  reason: case insensitive filesystem */
public final class C0335b extends k implements Map {

    /* renamed from: m  reason: collision with root package name */
    public C0334a f4050m;

    public final Set entrySet() {
        if (this.f4050m == null) {
            this.f4050m = new C0334a(0, this);
        }
        C0334a aVar = this.f4050m;
        if (aVar.f4045a == null) {
            aVar.f4045a = new C0341h(aVar, 0);
        }
        return aVar.f4045a;
    }

    public final Set keySet() {
        if (this.f4050m == null) {
            this.f4050m = new C0334a(0, this);
        }
        C0334a aVar = this.f4050m;
        if (aVar.f4046b == null) {
            aVar.f4046b = new C0341h(aVar, 1);
        }
        return aVar.f4046b;
    }

    public final void putAll(Map map) {
        int size = map.size() + this.f4091h;
        int i3 = this.f4091h;
        int[] iArr = this.f4089f;
        if (iArr.length < size) {
            Object[] objArr = this.f4090g;
            a(size);
            if (this.f4091h > 0) {
                System.arraycopy(iArr, 0, this.f4089f, 0, i3);
                System.arraycopy(objArr, 0, this.f4090g, 0, i3 << 1);
            }
            k.b(iArr, objArr, i3);
        }
        if (this.f4091h == i3) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final Collection values() {
        if (this.f4050m == null) {
            this.f4050m = new C0334a(0, this);
        }
        C0334a aVar = this.f4050m;
        if (aVar.f4047c == null) {
            aVar.f4047c = new C0343j(aVar);
        }
        return aVar.f4047c;
    }
}
