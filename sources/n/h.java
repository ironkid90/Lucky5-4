package N;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f1161a;

    public List a() {
        ArrayList arrayList;
        if (this.f1161a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1161a) {
            arrayList = new ArrayList(this.f1161a);
        }
        return arrayList;
    }
}
