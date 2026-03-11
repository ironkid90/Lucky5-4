package N2;

import I2.B;
import I2.C0063n;
import I2.C0064o;
import I2.C0067s;
import I2.C0071w;
import I2.I;
import I2.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.C0365e;
import q2.C0399b;
import r2.C0420d;
import r2.C0425i;
import t2.C0484b;
import t2.C0485c;

public final class h extends B implements C0485c, C0420d {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1192m = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i  reason: collision with root package name */
    public final C0067s f1193i;

    /* renamed from: j  reason: collision with root package name */
    public final C0484b f1194j;

    /* renamed from: k  reason: collision with root package name */
    public Object f1195k = a.f1181c;

    /* renamed from: l  reason: collision with root package name */
    public final Object f1196l;

    public h(C0067s sVar, C0484b bVar) {
        super(-1);
        this.f1193i = sVar;
        this.f1194j = bVar;
        this.f1196l = a.l(bVar.h());
    }

    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0064o) {
            ((C0064o) obj).f777b.j(cancellationException);
        }
    }

    public final C0485c g() {
        C0484b bVar = this.f1194j;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final C0425i h() {
        return this.f1194j.h();
    }

    public final Object j() {
        Object obj = this.f1195k;
        this.f1195k = a.f1181c;
        return obj;
    }

    public final void m(Object obj) {
        Object obj2;
        C0425i h3;
        Object m3;
        C0484b bVar = this.f1194j;
        C0425i h4 = bVar.h();
        Throwable a2 = C0365e.a(obj);
        if (a2 == null) {
            obj2 = obj;
        } else {
            obj2 = new C0063n(a2, false);
        }
        C0067s sVar = this.f1193i;
        if (sVar.h()) {
            this.f1195k = obj2;
            this.f714h = 0;
            sVar.g(h4, this);
            return;
        }
        I a3 = i0.a();
        if (a3.f723h >= 4294967296L) {
            this.f1195k = obj2;
            this.f714h = 0;
            C0399b bVar2 = a3.f725j;
            if (bVar2 == null) {
                bVar2 = new C0399b();
                a3.f725j = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.k(true);
        try {
            h3 = bVar.h();
            m3 = a.m(h3, this.f1196l);
            bVar.m(obj);
            a.h(h3, m3);
            do {
            } while (a3.m());
        } catch (Throwable th) {
            a3.i(true);
            throw th;
        }
        a3.i(true);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1193i + ", " + C0071w.l(this.f1194j) + ']';
    }

    public final C0420d c() {
        return this;
    }
}
