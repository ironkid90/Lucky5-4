package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import y1.j;

public final class Y extends AbstractMap {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f2394k = 0;

    /* renamed from: f  reason: collision with root package name */
    public List f2395f;

    /* renamed from: g  reason: collision with root package name */
    public Map f2396g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2397h;

    /* renamed from: i  reason: collision with root package name */
    public volatile j f2398i;

    /* renamed from: j  reason: collision with root package name */
    public Map f2399j;

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.Y, java.util.AbstractMap] */
    public static Y f() {
        ? abstractMap = new AbstractMap();
        abstractMap.f2395f = Collections.emptyList();
        abstractMap.f2396g = Collections.emptyMap();
        abstractMap.f2399j = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f2395f.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f2395f.get(i4)).f2400f);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            } else if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f2395f.get(i6)).f2400f);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else if (compareTo2 <= 0) {
                return i6;
            } else {
                i5 = i6 + 1;
            }
        }
        i3 = i5 + 1;
        return -i3;
    }

    public final void b() {
        if (this.f2397h) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f2395f.get(i3);
    }

    public final void clear() {
        b();
        if (!this.f2395f.isEmpty()) {
            this.f2395f.clear();
        }
        if (!this.f2396g.isEmpty()) {
            this.f2396g.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) >= 0 || this.f2396g.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set d() {
        if (this.f2396g.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f2396g.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2396g.isEmpty() && !(this.f2396g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2396g = treeMap;
            this.f2399j = treeMap.descendingMap();
        }
        return (SortedMap) this.f2396g;
    }

    public final Set entrySet() {
        if (this.f2398i == null) {
            this.f2398i = new j(this, 2);
        }
        return this.f2398i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y2 = (Y) obj;
        int size = size();
        if (size != y2.size()) {
            return false;
        }
        int size2 = this.f2395f.size();
        if (size2 != y2.f2395f.size()) {
            return ((AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i3 = 0; i3 < size2; i3++) {
            if (!c(i3).equals(y2.c(i3))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f2396g.equals(y2.f2396g);
        }
        return true;
    }

    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((Z) this.f2395f.get(a2)).setValue(obj);
        }
        b();
        if (this.f2395f.isEmpty() && !(this.f2395f instanceof ArrayList)) {
            this.f2395f = new ArrayList(16);
        }
        int i3 = -(a2 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2395f.size() == 16) {
            Z z3 = (Z) this.f2395f.remove(15);
            e().put(z3.f2400f, z3.f2401g);
        }
        this.f2395f.add(i3, new Z(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((Z) this.f2395f.get(a2)).f2401g;
        }
        return this.f2396g.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((Z) this.f2395f.remove(i3)).f2401g;
        if (!this.f2396g.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2395f;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final int hashCode() {
        int size = this.f2395f.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((Z) this.f2395f.get(i4)).hashCode();
        }
        if (this.f2396g.size() > 0) {
            return i3 + this.f2396g.hashCode();
        }
        return i3;
    }

    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f2396g.isEmpty()) {
            return null;
        }
        return this.f2396g.remove(comparable);
    }

    public final int size() {
        return this.f2396g.size() + this.f2395f.size();
    }
}
