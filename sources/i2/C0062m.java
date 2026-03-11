package I2;

import A2.i;
import java.util.concurrent.CancellationException;
import z2.l;

/* renamed from: I2.m  reason: case insensitive filesystem */
public final class C0062m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f769a;

    /* renamed from: b  reason: collision with root package name */
    public final E f770b;

    /* renamed from: c  reason: collision with root package name */
    public final l f771c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f772d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f773e;

    public C0062m(Object obj, E e2, l lVar, Object obj2, Throwable th) {
        this.f769a = obj;
        this.f770b = e2;
        this.f771c = lVar;
        this.f772d = obj2;
        this.f773e = th;
    }

    public static C0062m a(C0062m mVar, E e2, CancellationException cancellationException, int i3) {
        Object obj = mVar.f769a;
        if ((i3 & 2) != 0) {
            e2 = mVar.f770b;
        }
        E e3 = e2;
        l lVar = mVar.f771c;
        Object obj2 = mVar.f772d;
        Throwable th = cancellationException;
        if ((i3 & 16) != 0) {
            th = mVar.f773e;
        }
        mVar.getClass();
        return new C0062m(obj, e3, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0062m)) {
            return false;
        }
        C0062m mVar = (C0062m) obj;
        if (i.a(this.f769a, mVar.f769a) && i.a(this.f770b, mVar.f770b) && i.a(this.f771c, mVar.f771c) && i.a(this.f772d, mVar.f772d) && i.a(this.f773e, mVar.f773e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        Object obj = this.f769a;
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.hashCode();
        }
        int i8 = i3 * 31;
        E e2 = this.f770b;
        if (e2 == null) {
            i4 = 0;
        } else {
            i4 = e2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        l lVar = this.f771c;
        if (lVar == null) {
            i5 = 0;
        } else {
            i5 = lVar.hashCode();
        }
        int i10 = (i9 + i5) * 31;
        Object obj2 = this.f772d;
        if (obj2 == null) {
            i6 = 0;
        } else {
            i6 = obj2.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        Throwable th = this.f773e;
        if (th != null) {
            i7 = th.hashCode();
        }
        return i11 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f769a + ", cancelHandler=" + this.f770b + ", onCancellation=" + this.f771c + ", idempotentResume=" + this.f772d + ", cancelCause=" + this.f773e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0062m(Object obj, E e2, l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : e2, (i3 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i3 & 16) != 0 ? null : cancellationException);
    }
}
