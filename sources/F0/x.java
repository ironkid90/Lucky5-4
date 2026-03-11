package F0;

import C0.r;
import D0.c;
import H1.a;
import W0.i;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class x extends q {

    /* renamed from: b  reason: collision with root package name */
    public final i f359b;

    public x(i iVar) {
        super(4);
        this.f359b = iVar;
    }

    public final boolean a(l lVar) {
        if (lVar.f331h.get((Object) null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    public final c[] b(l lVar) {
        if (lVar.f331h.get((Object) null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public final void c(Status status) {
        this.f359b.c(new a(status));
    }

    public final void d(RuntimeException runtimeException) {
        this.f359b.c(runtimeException);
    }

    public final void e(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e2) {
            c(q.g(e2));
            throw e2;
        } catch (RemoteException e3) {
            c(q.g(e3));
        } catch (RuntimeException e4) {
            this.f359b.c(e4);
        }
    }

    public final void h(l lVar) {
        if (lVar.f331h.remove((Object) null) == null) {
            this.f359b.d(Boolean.FALSE);
            return;
        }
        throw new ClassCastException();
    }

    public final /* bridge */ /* synthetic */ void f(r rVar, boolean z3) {
    }
}
