package F0;

import C0.r;
import D0.c;
import D0.g;
import H1.a;
import W0.i;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

public final class w extends q {

    /* renamed from: b  reason: collision with root package name */
    public final v f356b;

    /* renamed from: c  reason: collision with root package name */
    public final i f357c;

    /* renamed from: d  reason: collision with root package name */
    public final g f358d;

    public w(v vVar, i iVar, g gVar) {
        super(2);
        this.f357c = iVar;
        this.f356b = vVar;
        this.f358d = gVar;
        if (vVar.f353a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final boolean a(l lVar) {
        return this.f356b.f353a;
    }

    public final c[] b(l lVar) {
        return (c[]) this.f356b.f354b;
    }

    public final void c(Status status) {
        a aVar;
        this.f358d.getClass();
        if (status.f2828c != null) {
            aVar = new a(status);
        } else {
            aVar = new a(status);
        }
        this.f357c.c(aVar);
    }

    public final void d(RuntimeException runtimeException) {
        this.f357c.c(runtimeException);
    }

    public final void e(l lVar) {
        i iVar = this.f357c;
        try {
            this.f356b.a(lVar.f327d, iVar);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            c(q.g(e3));
        } catch (RuntimeException e4) {
            iVar.c(e4);
        }
    }

    public final void f(r rVar, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        i iVar = this.f357c;
        ((Map) rVar.f161h).put(iVar, valueOf);
        iVar.f1875a.f(new r(rVar, iVar, 3, false));
    }
}
