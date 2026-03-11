package w1;

import E1.b;
import E1.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4731a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f4732b;

    public /* synthetic */ i(r rVar, int i3) {
        this.f4731a = i3;
        this.f4732b = rVar;
    }

    public final Object a(b bVar) {
        switch (this.f4731a) {
            case 0:
                return new AtomicLong(((Number) this.f4732b.a(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(Long.valueOf(((Number) this.f4732b.a(bVar)).longValue()));
                }
                bVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList.get(i3)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.w() != 9) {
                    return this.f4732b.a(bVar);
                }
                bVar.s();
                return null;
        }
    }

    public final void b(c cVar, Object obj) {
        switch (this.f4731a) {
            case 0:
                this.f4732b.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    this.f4732b.b(cVar, Long.valueOf(atomicLongArray.get(i3)));
                }
                cVar.e();
                return;
            default:
                if (obj == null) {
                    cVar.j();
                    return;
                } else {
                    this.f4732b.b(cVar, obj);
                    return;
                }
        }
    }
}
