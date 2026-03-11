package F0;

import D0.c;
import E0.a;
import G0.h;
import G0.o;
import I0.d;
import O0.b;
import W0.i;
import W0.m;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import androidx.lifecycle.e;
import androidx.lifecycle.l;
import java.util.ArrayDeque;
import l.C0310f;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public boolean f353a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f354b;

    /* renamed from: c  reason: collision with root package name */
    public Object f355c;

    public v() {
        this.f354b = new Object();
    }

    /* JADX INFO: finally extract failed */
    public void a(a aVar, i iVar) {
        IInterface iInterface;
        h hVar = (h) ((h) this.f355c).f322g;
        hVar.getClass();
        d dVar = (d) aVar;
        synchronized (dVar.f2836f) {
            if (dVar.f2843m == 5) {
                throw new DeadObjectException();
            } else if (dVar.c()) {
                iInterface = dVar.f2840j;
                o.f(iInterface, "Client is connected but service is null");
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        I0.a aVar2 = (I0.a) iInterface;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f695d);
        int i3 = b.f1234a;
        h hVar2 = (h) hVar.f322g;
        if (hVar2 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            hVar2.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f694c.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            iVar.b((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void b(double d3, double d4) {
        boolean z3 = this.f353a;
        double[] dArr = (double[]) this.f354b;
        double d5 = 1.0d;
        if (!z3) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f355c;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, androidx.lifecycle.j] */
    public void c() {
        ? r02 = this.f354b;
        l b3 = r02.b();
        if (b3.f2511c == e.f2501g) {
            b3.a(new U.a(0, r02));
            U.d dVar = (U.d) this.f355c;
            dVar.getClass();
            if (!dVar.f1752a) {
                b3.a(new U.b(dVar));
                dVar.f1752a = true;
                this.f353a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(m mVar) {
        synchronized (this.f354b) {
            try {
                if (((ArrayDeque) this.f355c) == null) {
                    this.f355c = new ArrayDeque();
                }
                ((ArrayDeque) this.f355c).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.f354b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (W0.m) ((java.util.ArrayDeque) r2.f355c).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.f353a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(W0.h r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f354b
            monitor-enter(r0)
            java.lang.Object r1 = r2.f355c     // Catch:{ all -> 0x002f }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r2.f353a     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x000e
            goto L_0x0031
        L_0x000e:
            r1 = 1
            r2.f353a = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
        L_0x0012:
            java.lang.Object r1 = r2.f354b
            monitor-enter(r1)
            java.lang.Object r0 = r2.f355c     // Catch:{ all -> 0x0026 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            W0.m r0 = (W0.m) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            r3 = 0
            r2.f353a = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r3 = move-exception
            goto L_0x002d
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.a(r3)
            goto L_0x0012
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r3
        L_0x002f:
            r3 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.v.e(W0.h):void");
    }

    public v(h hVar, c[] cVarArr, boolean z3) {
        this.f355c = hVar;
        this.f354b = cVarArr;
        boolean z4 = false;
        if (cVarArr != null && z3) {
            z4 = true;
        }
        this.f353a = z4;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, U.d] */
    public v(U.e eVar) {
        this.f354b = eVar;
        ? obj = new Object();
        obj.f1754c = new C0310f();
        this.f355c = obj;
    }

    public v(boolean z3, double[] dArr, double[] dArr2) {
        this.f353a = z3;
        this.f354b = dArr;
        this.f355c = dArr2;
    }
}
