package G2;

import M0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q2.l;

public abstract class c extends d {
    public static List I(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f4396f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a.A(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
