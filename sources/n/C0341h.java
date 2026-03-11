package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.h  reason: case insensitive filesystem */
public final class C0341h implements Set {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4078f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0334a f4079g;

    public /* synthetic */ C0341h(C0334a aVar, int i3) {
        this.f4078f = i3;
        this.f4079g = aVar;
    }

    public final boolean add(Object obj) {
        switch (this.f4078f) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f4078f) {
            case 0:
                C0334a aVar = this.f4079g;
                int d3 = aVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (aVar.f4048d) {
                        case 0:
                            ((C0335b) aVar.f4049e).put(key, value);
                            break;
                        default:
                            ((C0336c) aVar.f4049e).add(key);
                            break;
                    }
                }
                if (d3 != aVar.d()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.f4078f) {
            case 0:
                this.f4079g.a();
                return;
            default:
                this.f4079g.a();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = (java.util.Map.Entry) r5;
        r0 = r5.getKey();
        r2 = r4.f4079g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f4078f
            switch(r0) {
                case 0: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            n.a r0 = r4.f4079g
            int r5 = r0.e(r5)
            if (r5 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            n.a r2 = r4.f4079g
            int r0 = r2.e(r0)
            if (r0 >= 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            r3 = 1
            java.lang.Object r0 = r2.b(r0, r3)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L_0x0039
            if (r0 == 0) goto L_0x003a
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x003a
        L_0x0039:
            r1 = r3
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0341h.contains(java.lang.Object):boolean");
    }

    public final boolean containsAll(Collection collection) {
        switch (this.f4078f) {
            case 0:
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                Map c3 = this.f4079g.c();
                for (Object containsKey : collection) {
                    if (!c3.containsKey(containsKey)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4078f) {
            case 0:
                return C0334a.h(this, obj);
            default:
                return C0334a.h(this, obj);
        }
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        switch (this.f4078f) {
            case 0:
                C0334a aVar = this.f4079g;
                int i6 = 0;
                for (int d3 = aVar.d() - 1; d3 >= 0; d3--) {
                    Object b3 = aVar.b(d3, 0);
                    Object b4 = aVar.b(d3, 1);
                    if (b3 == null) {
                        i3 = 0;
                    } else {
                        i3 = b3.hashCode();
                    }
                    if (b4 == null) {
                        i4 = 0;
                    } else {
                        i4 = b4.hashCode();
                    }
                    i6 += i3 ^ i4;
                }
                return i6;
            default:
                C0334a aVar2 = this.f4079g;
                int i7 = 0;
                for (int d4 = aVar2.d() - 1; d4 >= 0; d4--) {
                    Object b5 = aVar2.b(d4, 0);
                    if (b5 == null) {
                        i5 = 0;
                    } else {
                        i5 = b5.hashCode();
                    }
                    i7 += i5;
                }
                return i7;
        }
    }

    public final boolean isEmpty() {
        switch (this.f4078f) {
            case 0:
                if (this.f4079g.d() == 0) {
                    return true;
                }
                return false;
            default:
                if (this.f4079g.d() == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.f4078f) {
            case 0:
                return new C0342i(this.f4079g);
            default:
                return new C0340g(this.f4079g, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f4078f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0334a aVar = this.f4079g;
                int e2 = aVar.e(obj);
                if (e2 < 0) {
                    return false;
                }
                aVar.g(e2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f4078f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f4079g.c();
                int size = c3.size();
                for (Object remove : collection) {
                    c3.remove(remove);
                }
                if (size != c3.size()) {
                    return true;
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f4078f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f4079g.c();
                int size = c3.size();
                Iterator it = c3.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                if (size != c3.size()) {
                    return true;
                }
                return false;
        }
    }

    public final int size() {
        switch (this.f4078f) {
            case 0:
                return this.f4079g.d();
            default:
                return this.f4079g.d();
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f4078f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f4079g.i(0, objArr);
        }
    }

    public final Object[] toArray() {
        switch (this.f4078f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0334a aVar = this.f4079g;
                int d3 = aVar.d();
                Object[] objArr = new Object[d3];
                for (int i3 = 0; i3 < d3; i3++) {
                    objArr[i3] = aVar.b(i3, 0);
                }
                return objArr;
        }
    }
}
