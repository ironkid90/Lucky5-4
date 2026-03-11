package P2;

import I2.C0067s;
import I2.J;
import java.util.concurrent.Executor;
import r2.C0425i;
import r2.C0426j;

public final class c extends J implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final c f1263h = new C0067s();

    /* renamed from: i  reason: collision with root package name */
    public static final C0067s f1264i;

    /* JADX WARNING: type inference failed for: r0v0, types: [P2.c, I2.s] */
    /* JADX WARNING: type inference failed for: r2v3, types: [N2.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            P2.c r0 = new P2.c
            r0.<init>()
            f1263h = r0
            P2.l r0 = P2.l.f1280h
            int r1 = N2.w.f1223a
            r2 = 64
            if (r2 >= r1) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r4 = 0
            int r1 = N2.a.k(r3, r1, r4, r4, r2)
            r0.getClass()
            java.lang.String r2 = "Expected positive parallelism level, but got "
            r3 = 1
            if (r1 < r3) goto L_0x0040
            int r4 = P2.k.f1275d
            if (r1 < r4) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r1 < r3) goto L_0x0032
            N2.i r2 = new N2.i
            r2.<init>(r0, r1)
            r0 = r2
        L_0x002f:
            f1264i = r0
            return
        L_0x0032:
            java.lang.String r0 = A2.h.e(r2, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0040:
            java.lang.String r0 = A2.h.e(r2, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.c.<clinit>():void");
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public final void execute(Runnable runnable) {
        g(C0426j.f4457f, runnable);
    }

    public final void g(C0425i iVar, Runnable runnable) {
        f1264i.g(iVar, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
