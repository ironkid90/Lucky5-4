package N2;

import A2.i;
import A2.m;
import I2.C0071w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1202f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1203g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1204h;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    static {
        Class<k> cls = k.class;
        Class<Object> cls2 = Object.class;
        f1202f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1203g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f1204h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r6 = ((N2.r) r6).f1218a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r5.get(r4) == r3) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N2.k g() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1203g
            java.lang.Object r1 = r0.get(r9)
            N2.k r1 = (N2.k) r1
            r2 = 0
            r3 = r1
        L_0x000a:
            r4 = r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f1202f
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L_0x0024
            if (r1 != r3) goto L_0x0016
            return r3
        L_0x0016:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L_0x001d
            return r3
        L_0x001d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L_0x0016
            goto L_0x0000
        L_0x0024:
            boolean r7 = r9.m()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r6 != 0) goto L_0x002e
            return r3
        L_0x002e:
            boolean r7 = r6 instanceof N2.q
            if (r7 == 0) goto L_0x0038
            N2.q r6 = (N2.q) r6
            r6.a(r3)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r6 instanceof N2.r
            if (r7 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0051
            N2.r r6 = (N2.r) r6
            N2.k r6 = r6.f1218a
        L_0x0042:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L_0x004a
            r3 = r4
            goto L_0x000a
        L_0x004a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L_0x0042
            goto L_0x0000
        L_0x0051:
            java.lang.Object r3 = r0.get(r3)
            N2.k r3 = (N2.k) r3
            goto L_0x000b
        L_0x0058:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            A2.i.c(r6, r4)
            r4 = r6
            N2.k r4 = (N2.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.k.g():N2.k");
    }

    public final void h(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1203g;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (k() == kVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                        if (m()) {
                            kVar.g();
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1202f.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k l() {
        r rVar;
        k kVar;
        Object k3 = k();
        if (k3 instanceof r) {
            rVar = (r) k3;
        } else {
            rVar = null;
        }
        if (rVar != null && (kVar = rVar.f1218a) != null) {
            return kVar;
        }
        i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) k3;
    }

    public boolean m() {
        return k() instanceof r;
    }

    public String toString() {
        return new m(this, C0071w.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + C0071w.c(this);
    }
}
