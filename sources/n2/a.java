package N2;

import A2.h;
import A2.i;
import B.m;
import H0.b;
import I2.C0071w;
import I2.h0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r2.C0425i;
import z2.l;
import z2.p;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final m f1179a = new m(11, (Object) "NO_DECISION");

    /* renamed from: b  reason: collision with root package name */
    public static final m f1180b = new m(11, (Object) "CLOSED");

    /* renamed from: c  reason: collision with root package name */
    public static final m f1181c = new m(11, (Object) "UNDEFINED");

    /* renamed from: d  reason: collision with root package name */
    public static final m f1182d = new m(11, (Object) "REUSABLE_CLAIMED");

    /* renamed from: e  reason: collision with root package name */
    public static final m f1183e = new m(11, (Object) "CONDITION_FALSE");

    /* renamed from: f  reason: collision with root package name */
    public static final m f1184f = new m(11, (Object) "NO_THREAD_ELEMENTS");

    public static final void a(l lVar, Object obj, C0425i iVar) {
        b b3 = b(lVar, obj, (b) null);
        if (b3 != null) {
            C0071w.e(b3, iVar);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.RuntimeException, H0.b] */
    public static final b b(l lVar, Object obj, b bVar) {
        try {
            lVar.j(obj);
        } catch (Throwable th) {
            if (bVar == null || bVar.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            android.support.v4.media.session.a.c(bVar, th);
        }
        return bVar;
    }

    public static final Object c(u uVar, long j3, p pVar) {
        while (true) {
            if (uVar.f1221h >= j3 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f1187f.get(uVar);
            m mVar = f1180b;
            if (obj == mVar) {
                return mVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.i(Long.valueOf(uVar.f1221h + 1), uVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1187f;
                    if (!atomicReferenceFieldUpdater.compareAndSet(uVar, (Object) null, uVar2)) {
                        if (atomicReferenceFieldUpdater.get(uVar) != null) {
                            break;
                        }
                    } else if (uVar.c()) {
                        uVar.d();
                    }
                }
            }
            uVar = uVar2;
        }
    }

    public static final u d(Object obj) {
        if (obj != f1180b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, C0425i iVar) {
        Throwable th2;
        for (J2.b g2 : f.f1190a) {
            try {
                g2.g(th, iVar);
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    android.support.v4.media.session.a.c(th2, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        try {
            android.support.v4.media.session.a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        if (obj == f1180b) {
            return true;
        }
        return false;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(C0425i iVar, Object obj) {
        if (obj != f1184f) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                h0[] h0VarArr = zVar.f1230b;
                int length = h0VarArr.length - 1;
                if (length >= 0) {
                    h0 h0Var = h0VarArr[length];
                    i.b((Object) null);
                    Object obj2 = zVar.f1229a[length];
                    throw null;
                }
                return;
            }
            Object e2 = iVar.e((Object) null, x.f1225i);
            i.c(e2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            h.j(e2);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r5.X() != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        if (r5.X() != false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(r2.C0420d r8, java.lang.Object r9, z2.l r10) {
        /*
            boolean r0 = r8 instanceof N2.h
            if (r0 == 0) goto L_0x00c8
            N2.h r8 = (N2.h) r8
            java.lang.Throwable r0 = p2.C0365e.a(r9)
            if (r0 != 0) goto L_0x0016
            if (r10 == 0) goto L_0x0014
            I2.o r0 = new I2.o
            r0.<init>(r9, r10)
            goto L_0x001d
        L_0x0014:
            r0 = r9
            goto L_0x001d
        L_0x0016:
            I2.n r10 = new I2.n
            r1 = 0
            r10.<init>(r0, r1)
            r0 = r10
        L_0x001d:
            t2.b r10 = r8.f1194j
            r10.h()
            I2.s r1 = r8.f1193i
            boolean r2 = r1.h()
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r8.f1195k = r0
            r8.f714h = r3
            r2.i r9 = r10.h()
            r1.g(r9, r8)
            goto L_0x00cb
        L_0x0038:
            I2.I r1 = I2.i0.a()
            long r4 = r1.f723h
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            r8.f1195k = r0
            r8.f714h = r3
            q2.b r9 = r1.f725j
            if (r9 != 0) goto L_0x0056
            q2.b r9 = new q2.b
            r9.<init>()
            r1.f725j = r9
        L_0x0056:
            r9.addLast(r8)
            goto L_0x00cb
        L_0x005b:
            r1.k(r3)
            r2 = 0
            r2.i r4 = r10.h()     // Catch:{ all -> 0x0084 }
            I2.t r5 = I2.C0068t.f786g     // Catch:{ all -> 0x0084 }
            r2.g r4 = r4.n(r5)     // Catch:{ all -> 0x0084 }
            I2.Q r4 = (I2.Q) r4     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0086
            boolean r5 = r4.b()     // Catch:{ all -> 0x0084 }
            if (r5 != 0) goto L_0x0086
            I2.a0 r4 = (I2.a0) r4     // Catch:{ all -> 0x0084 }
            java.util.concurrent.CancellationException r9 = r4.A()     // Catch:{ all -> 0x0084 }
            r8.b(r0, r9)     // Catch:{ all -> 0x0084 }
            p2.d r9 = M0.a.h(r9)     // Catch:{ all -> 0x0084 }
            r8.m(r9)     // Catch:{ all -> 0x0084 }
            goto L_0x00a8
        L_0x0084:
            r9 = move-exception
            goto L_0x00bf
        L_0x0086:
            java.lang.Object r0 = r8.f1196l     // Catch:{ all -> 0x0084 }
            r2.i r4 = r10.h()     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = m(r4, r0)     // Catch:{ all -> 0x0084 }
            B.m r5 = f1184f     // Catch:{ all -> 0x0084 }
            if (r0 == r5) goto L_0x0099
            I2.k0 r5 = I2.C0071w.n(r10, r4, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x009a
        L_0x0099:
            r5 = r2
        L_0x009a:
            r10.m(r9)     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00a5
            boolean r9 = r5.X()     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x00a8
        L_0x00a5:
            h(r4, r0)     // Catch:{ all -> 0x0084 }
        L_0x00a8:
            boolean r9 = r1.m()     // Catch:{ all -> 0x0084 }
            if (r9 != 0) goto L_0x00a8
        L_0x00ae:
            r1.i(r3)
            goto L_0x00cb
        L_0x00b2:
            r9 = move-exception
            if (r5 == 0) goto L_0x00bb
            boolean r10 = r5.X()     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x00be
        L_0x00bb:
            h(r4, r0)     // Catch:{ all -> 0x0084 }
        L_0x00be:
            throw r9     // Catch:{ all -> 0x0084 }
        L_0x00bf:
            r8.i(r9, r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ae
        L_0x00c3:
            r8 = move-exception
            r1.i(r3)
            throw r8
        L_0x00c8:
            r8.m(r9)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.a.i(r2.d, java.lang.Object, z2.l):void");
    }

    public static final long j(String str, long j3, long j4, long j5) {
        String str2;
        int i3 = w.f1223a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        Long m0 = H2.l.m0(str2);
        if (m0 != null) {
            long longValue = m0.longValue();
            if (j4 <= longValue && longValue <= j5) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int k(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) j(str, (long) i3, (long) i4, (long) i5);
    }

    public static final Object l(C0425i iVar) {
        Object e2 = iVar.e(0, x.f1224h);
        i.b(e2);
        return e2;
    }

    public static final Object m(C0425i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f1184f;
        }
        if (obj instanceof Integer) {
            return iVar.e(new z(((Number) obj).intValue(), iVar), x.f1226j);
        }
        h.j(obj);
        throw null;
    }
}
