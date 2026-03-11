package u1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u1.b  reason: case insensitive filesystem */
public final class C0495b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4715a;

    /* renamed from: b  reason: collision with root package name */
    public final C0496c f4716b;

    public C0495b(Set set, C0496c cVar) {
        this.f4715a = b(set);
        this.f4716b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0494a aVar = (C0494a) it.next();
            sb.append(aVar.f4713a);
            sb.append('/');
            sb.append(aVar.f4714b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C0496c cVar = this.f4716b;
        synchronized (cVar.f4718a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f4718a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f4715a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (cVar.f4718a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f4718a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
