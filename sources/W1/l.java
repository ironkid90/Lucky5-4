package w1;

import java.util.ArrayList;
import java.util.Iterator;

public final class l extends m implements Iterable {

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4740f = new ArrayList();

    public final boolean a() {
        ArrayList arrayList = this.f4740f;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).a();
        }
        throw new IllegalStateException();
    }

    public final String c() {
        ArrayList arrayList = this.f4740f;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof l) && ((l) obj).f4740f.equals(this.f4740f))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4740f.hashCode();
    }

    public final Iterator iterator() {
        return this.f4740f.iterator();
    }
}
