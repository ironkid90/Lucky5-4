package I2;

import A2.i;
import P2.h;
import P2.k;
import android.support.v4.media.session.a;
import java.util.concurrent.CancellationException;
import r2.C0420d;

public abstract class B extends h {

    /* renamed from: h  reason: collision with root package name */
    public int f714h;

    public B(int i3) {
        super(0, k.f1278g);
        this.f714h = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract C0420d c();

    public Throwable d(Object obj) {
        C0063n nVar;
        if (obj instanceof C0063n) {
            nVar = (C0063n) obj;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            return nVar.f775a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                a.c(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            i.b(th);
            C0071w.e(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().h());
        }
    }

    public abstract Object j();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r5.X() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if (r5.X() != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            p2.h r0 = p2.C0368h.f4194a
            P2.i r1 = r11.f1269g
            r2.d r2 = r11.c()     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            A2.i.c(r2, r3)     // Catch:{ all -> 0x0025 }
            N2.h r2 = (N2.h) r2     // Catch:{ all -> 0x0025 }
            t2.b r3 = r2.f1194j     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r2.f1196l     // Catch:{ all -> 0x0025 }
            r2.i r4 = r3.h()     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = N2.a.m(r4, r2)     // Catch:{ all -> 0x0025 }
            B.m r5 = N2.a.f1184f     // Catch:{ all -> 0x0025 }
            r6 = 0
            if (r2 == r5) goto L_0x0028
            I2.k0 r5 = I2.C0071w.n(r3, r4, r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            goto L_0x009d
        L_0x0028:
            r5 = r6
        L_0x0029:
            r2.i r7 = r3.h()     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r11.j()     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r9 = r11.d(r8)     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x004a
            int r10 = r11.f714h     // Catch:{ all -> 0x0048 }
            boolean r10 = I2.C0071w.g(r10)     // Catch:{ all -> 0x0048 }
            if (r10 == 0) goto L_0x004a
            I2.t r10 = I2.C0068t.f786g     // Catch:{ all -> 0x0048 }
            r2.g r7 = r7.n(r10)     // Catch:{ all -> 0x0048 }
            I2.Q r7 = (I2.Q) r7     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r3 = move-exception
            goto L_0x0091
        L_0x004a:
            r7 = r6
        L_0x004b:
            if (r7 == 0) goto L_0x0064
            boolean r10 = r7.b()     // Catch:{ all -> 0x0048 }
            if (r10 != 0) goto L_0x0064
            I2.a0 r7 = (I2.a0) r7     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CancellationException r7 = r7.A()     // Catch:{ all -> 0x0048 }
            r11.b(r8, r7)     // Catch:{ all -> 0x0048 }
            p2.d r7 = M0.a.h(r7)     // Catch:{ all -> 0x0048 }
            r3.m(r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0075
        L_0x0064:
            if (r9 == 0) goto L_0x006e
            p2.d r7 = M0.a.h(r9)     // Catch:{ all -> 0x0048 }
            r3.m(r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0075
        L_0x006e:
            java.lang.Object r7 = r11.e(r8)     // Catch:{ all -> 0x0048 }
            r3.m(r7)     // Catch:{ all -> 0x0048 }
        L_0x0075:
            if (r5 == 0) goto L_0x007d
            boolean r3 = r5.X()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0080
        L_0x007d:
            N2.a.h(r4, r2)     // Catch:{ all -> 0x0025 }
        L_0x0080:
            r1.getClass()     // Catch:{ all -> 0x0084 }
            goto L_0x0089
        L_0x0084:
            r0 = move-exception
            p2.d r0 = M0.a.h(r0)
        L_0x0089:
            java.lang.Throwable r0 = p2.C0365e.a(r0)
            r11.i(r6, r0)
            goto L_0x00ad
        L_0x0091:
            if (r5 == 0) goto L_0x0099
            boolean r5 = r5.X()     // Catch:{ all -> 0x0025 }
            if (r5 == 0) goto L_0x009c
        L_0x0099:
            N2.a.h(r4, r2)     // Catch:{ all -> 0x0025 }
        L_0x009c:
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x009d:
            r1.getClass()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a6
        L_0x00a1:
            r0 = move-exception
            p2.d r0 = M0.a.h(r0)
        L_0x00a6:
            java.lang.Throwable r0 = p2.C0365e.a(r0)
            r11.i(r2, r0)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.B.run():void");
    }

    public Object e(Object obj) {
        return obj;
    }
}
