package T1;

import android.util.SparseArray;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.Iterator;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1677a;

    public a(c cVar) {
        this.f1677a = cVar;
    }

    public final void a() {
        c cVar = this.f1677a;
        Iterator it = cVar.v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            l lVar = cVar.f1698s;
            SparseArray sparseArray = lVar.f3406p;
            if (sparseArray.size() <= 0) {
                break;
            }
            lVar.f3415z.i(sparseArray.keyAt(0));
        }
        while (true) {
            k kVar = cVar.f1699t;
            SparseArray sparseArray2 = kVar.f3389l;
            if (sparseArray2.size() > 0) {
                kVar.f3395r.d(sparseArray2.keyAt(0));
            } else {
                cVar.f1690k.f2736b = null;
                return;
            }
        }
    }

    public final void b() {
    }
}
