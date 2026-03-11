package Q2;

import B.m;
import I.K;
import I2.C0054e;
import N2.a;
import N2.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0368h;

public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1308b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1309c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1310d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1311e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1312f;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final K f1313a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    static {
        Class<h> cls = h.class;
        Class<Object> cls2 = Object.class;
        f1308b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f1309c = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        f1310d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        f1311e = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        f1312f = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public h(int i3) {
        if (i3 < 0 || i3 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0, (j) null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i3;
        this.f1313a = new K(2, this);
    }

    public final void a(c cVar) {
        Object c3;
        f fVar;
        long j3;
        c cVar2 = cVar;
        while (true) {
            int andDecrement = f1312f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0368h hVar = C0368h.f4194a;
                K k3 = this.f1313a;
                if (andDecrement > 0) {
                    cVar2.f(hVar, k3);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1310d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1311e.getAndIncrement(this);
                f fVar2 = f.f1306n;
                long j4 = andIncrement / ((long) i.f1319f);
                while (true) {
                    c3 = a.c(jVar, j4, fVar2);
                    if (a.f(c3)) {
                        break;
                    }
                    u d3 = a.d(c3);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        fVar = fVar2;
                        j3 = j4;
                        if (uVar.f1221h >= d3.f1221h) {
                            break;
                        } else if (!d3.i()) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d3.e()) {
                                        d3.d();
                                    }
                                    fVar2 = fVar;
                                    j4 = j3;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    }
                    fVar2 = fVar;
                    j4 = j3;
                }
                j jVar2 = (j) a.d(c3);
                int i3 = (int) (andIncrement % ((long) i.f1319f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f1320j;
                while (!atomicReferenceArray.compareAndSet(i3, (Object) null, cVar2)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        m mVar = i.f1315b;
                        m mVar2 = i.f1316c;
                        while (!atomicReferenceArray.compareAndSet(i3, mVar, mVar2)) {
                            if (atomicReferenceArray.get(i3) != mVar) {
                            }
                        }
                        cVar2.f(hVar, k3);
                        return;
                    }
                }
                cVar2.a(jVar2, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Object c3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1312f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1 || atomicIntegerFieldUpdater.compareAndSet(this, i3, 1)) {
                    }
                    i3 = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1308b;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f1309c.getAndIncrement(this);
                long j3 = andIncrement2 / ((long) i.f1319f);
                g gVar = g.f1307n;
                while (true) {
                    c3 = a.c(jVar, j3, gVar);
                    if (a.f(c3)) {
                        break;
                    }
                    u d3 = a.d(c3);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f1221h >= d3.f1221h) {
                            break;
                        } else if (d3.i()) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d3.e()) {
                                        d3.d();
                                    }
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    }
                }
                j jVar2 = (j) a.d(c3);
                jVar2.a();
                int i4 = (jVar2.f1221h > j3 ? 1 : (jVar2.f1221h == j3 ? 0 : -1));
                boolean z4 = false;
                if (i4 <= 0) {
                    int i5 = (int) (andIncrement2 % ((long) i.f1319f));
                    m mVar = i.f1315b;
                    AtomicReferenceArray atomicReferenceArray = jVar2.f1320j;
                    Object andSet = atomicReferenceArray.getAndSet(i5, mVar);
                    if (andSet == null) {
                        int i6 = i.f1314a;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                m mVar2 = i.f1315b;
                                m mVar3 = i.f1317d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i5, mVar2, mVar3)) {
                                        if (atomicReferenceArray.get(i5) != mVar2) {
                                            break;
                                        }
                                    } else {
                                        z4 = true;
                                        break;
                                    }
                                }
                                z3 = true ^ z4;
                                continue;
                            } else if (atomicReferenceArray.get(i5) == i.f1316c) {
                                continue;
                                break;
                            } else {
                                i7++;
                            }
                        }
                    } else if (andSet != i.f1318e) {
                        if (andSet instanceof C0054e) {
                            C0054e eVar = (C0054e) andSet;
                            m k3 = eVar.k(C0368h.f4194a, this.f1313a);
                            if (k3 != null) {
                                eVar.o(k3);
                                continue;
                            }
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
                z3 = false;
                continue;
            } else {
                return;
            }
        } while (!z3);
    }
}
