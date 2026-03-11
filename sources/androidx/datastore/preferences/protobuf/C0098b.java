package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.b  reason: case insensitive filesystem */
public abstract class C0098b extends AbstractList implements C0119x {

    /* renamed from: f  reason: collision with root package name */
    public boolean f2407f;

    public final void a() {
        if (!this.f2407f) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    public final void clear() {
        a();
        super.clear();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!get(i3).equals(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = (i3 * 31) + get(i4).hashCode();
        }
        return i3;
    }

    public abstract Object remove(int i3);

    public final boolean remove(Object obj) {
        a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    public final boolean addAll(int i3, Collection collection) {
        a();
        return super.addAll(i3, collection);
    }
}
