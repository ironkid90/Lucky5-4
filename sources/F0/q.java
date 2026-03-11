package F0;

import C0.r;
import D0.a;
import D0.c;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f348a;

    public q(int i3) {
        this.f348a = i3;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (a) null);
    }

    public abstract boolean a(l lVar);

    public abstract c[] b(l lVar);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(l lVar);

    public abstract void f(r rVar, boolean z3);
}
