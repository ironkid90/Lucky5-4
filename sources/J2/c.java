package J2;

import A2.i;
import I2.C;
import I2.C0067s;
import I2.C0068t;
import I2.C0074z;
import I2.Q;
import N2.o;
import P2.d;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import r2.C0425i;

public final class c extends C0067s implements C0074z {
    private volatile c _immediate;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f805h;

    /* renamed from: i  reason: collision with root package name */
    public final String f806i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f807j;

    /* renamed from: k  reason: collision with root package name */
    public final c f808k;

    public c(Handler handler, String str, boolean z3) {
        this.f805h = handler;
        this.f806i = str;
        this.f807j = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f808k = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c) || ((c) obj).f805h != this.f805h) {
            return false;
        }
        return true;
    }

    public final void g(C0425i iVar, Runnable runnable) {
        if (!this.f805h.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            Q q3 = (Q) iVar.n(C0068t.f786g);
            if (q3 != null) {
                q3.a(cancellationException);
            }
            C.f716b.g(iVar, runnable);
        }
    }

    public final boolean h() {
        if (!this.f807j || !i.a(Looper.myLooper(), this.f805h.getLooper())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f805h);
    }

    public final String toString() {
        String str;
        c cVar;
        d dVar = C.f715a;
        c cVar2 = o.f1214a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f808k;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f806i;
        if (str2 == null) {
            str2 = this.f805h.toString();
        }
        if (!this.f807j) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, (String) null, false);
    }
}
