package R2;

import A2.i;
import java.util.concurrent.atomic.AtomicReference;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f1410a = new q(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f1411b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f1412c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1411b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f1412c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        int i3;
        i.e(qVar, "segment");
        if (qVar.f1408f != null || qVar.f1409g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!qVar.f1406d) {
            AtomicReference atomicReference = f1412c[(int) (Thread.currentThread().getId() & (((long) f1411b) - 1))];
            q qVar2 = f1410a;
            q qVar3 = (q) atomicReference.getAndSet(qVar2);
            if (qVar3 != qVar2) {
                if (qVar3 != null) {
                    i3 = qVar3.f1405c;
                } else {
                    i3 = 0;
                }
                if (i3 >= 65536) {
                    atomicReference.set(qVar3);
                    return;
                }
                qVar.f1408f = qVar3;
                qVar.f1404b = 0;
                qVar.f1405c = i3 + 8192;
                atomicReference.set(qVar);
            }
        }
    }

    public static final q b() {
        AtomicReference atomicReference = f1412c[(int) (Thread.currentThread().getId() & (((long) f1411b) - 1))];
        q qVar = f1410a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set((Object) null);
            return new q();
        }
        atomicReference.set(qVar2.f1408f);
        qVar2.f1408f = null;
        qVar2.f1405c = 0;
        return qVar2;
    }
}
