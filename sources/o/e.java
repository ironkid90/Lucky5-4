package o;

import M0.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4123d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4124e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4125f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4126g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4127h;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4123d = atomicReferenceFieldUpdater;
        this.f4124e = atomicReferenceFieldUpdater2;
        this.f4125f = atomicReferenceFieldUpdater3;
        this.f4126g = atomicReferenceFieldUpdater4;
        this.f4127h = atomicReferenceFieldUpdater5;
    }

    public final void F(g gVar, g gVar2) {
        this.f4124e.lazySet(gVar, gVar2);
    }

    public final void G(g gVar, Thread thread) {
        this.f4123d.lazySet(gVar, thread);
    }

    public final boolean b(h hVar, d dVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar2 = d.f4121b;
        do {
            atomicReferenceFieldUpdater = this.f4126g;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    public final boolean c(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4127h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    public final boolean d(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4125f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
