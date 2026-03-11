package g0;

import S1.m;
import android.app.Activity;
import d2.C0152a;
import e0.C0154a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g0.k  reason: case insensitive filesystem */
public final class C0179k implements C0154a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile C0179k f2976c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f2977d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final C0177i f2978a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f2979b = new CopyOnWriteArrayList();

    public C0179k(C0177i iVar) {
        this.f2978a = iVar;
        if (iVar != null) {
            iVar.h(new C0152a(1, this));
        }
    }

    public final void a(m mVar) {
        synchronized (f2977d) {
            try {
                if (this.f2978a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f2979b.iterator();
                    while (it.hasNext()) {
                        C0178j jVar = (C0178j) it.next();
                        if (jVar.f2974b == mVar) {
                            arrayList.add(jVar);
                        }
                    }
                    this.f2979b.removeAll(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Activity activity = ((C0178j) it2.next()).f2973a;
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2979b;
                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                            Iterator it3 = copyOnWriteArrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((C0178j) it3.next()).f2973a.equals(activity)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C0177i iVar = this.f2978a;
                        if (iVar != null) {
                            iVar.f(activity);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: d0.j} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079 A[Catch:{ all -> 0x0022 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r9, R.d r10, S1.m r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.app.Activity r9 = (android.app.Activity) r9
            goto L_0x0009
        L_0x0008:
            r9 = r1
        L_0x0009:
            q2.l r0 = q2.l.f4396f
            if (r9 == 0) goto L_0x00ad
            java.util.concurrent.locks.ReentrantLock r2 = f2977d
            r2.lock()
            g0.i r3 = r8.f2978a     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0025
            d0.j r9 = new d0.j     // Catch:{ all -> 0x0022 }
            r9.<init>(r0)     // Catch:{ all -> 0x0022 }
            r11.accept(r9)     // Catch:{ all -> 0x0022 }
            r2.unlock()
            return
        L_0x0022:
            r9 = move-exception
            goto L_0x00a9
        L_0x0025:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.f2979b
            r5 = 0
            if (r4 == 0) goto L_0x0031
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0031
            goto L_0x004a
        L_0x0031:
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x0022 }
        L_0x0035:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x004a
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0022 }
            g0.j r7 = (g0.C0178j) r7     // Catch:{ all -> 0x0022 }
            android.app.Activity r7 = r7.f2973a     // Catch:{ all -> 0x0022 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0035
            r5 = 1
        L_0x004a:
            g0.j r6 = new g0.j     // Catch:{ all -> 0x0022 }
            r6.<init>(r9, r10, r11)     // Catch:{ all -> 0x0022 }
            r4.add(r6)     // Catch:{ all -> 0x0022 }
            if (r5 != 0) goto L_0x0079
            android.view.Window r10 = r9.getWindow()     // Catch:{ all -> 0x0022 }
            if (r10 == 0) goto L_0x0062
            android.view.WindowManager$LayoutParams r10 = r10.getAttributes()     // Catch:{ all -> 0x0022 }
            if (r10 == 0) goto L_0x0062
            android.os.IBinder r1 = r10.token     // Catch:{ all -> 0x0022 }
        L_0x0062:
            if (r1 == 0) goto L_0x0068
            r3.g(r1, r9)     // Catch:{ all -> 0x0022 }
            goto L_0x00a3
        L_0x0068:
            g0.h r10 = new g0.h     // Catch:{ all -> 0x0022 }
            r10.<init>(r3, r9)     // Catch:{ all -> 0x0022 }
            android.view.Window r9 = r9.getWindow()     // Catch:{ all -> 0x0022 }
            android.view.View r9 = r9.getDecorView()     // Catch:{ all -> 0x0022 }
            r9.addOnAttachStateChangeListener(r10)     // Catch:{ all -> 0x0022 }
            goto L_0x00a3
        L_0x0079:
            java.util.Iterator r10 = r4.iterator()     // Catch:{ all -> 0x0022 }
        L_0x007d:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0022 }
            r4 = r3
            g0.j r4 = (g0.C0178j) r4     // Catch:{ all -> 0x0022 }
            android.app.Activity r4 = r4.f2973a     // Catch:{ all -> 0x0022 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x007d
            goto L_0x0094
        L_0x0093:
            r3 = r1
        L_0x0094:
            g0.j r3 = (g0.C0178j) r3     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x009a
            d0.j r1 = r3.f2975c     // Catch:{ all -> 0x0022 }
        L_0x009a:
            if (r1 == 0) goto L_0x00a3
            r6.f2975c = r1     // Catch:{ all -> 0x0022 }
            S1.m r9 = r6.f2974b     // Catch:{ all -> 0x0022 }
            r9.accept(r1)     // Catch:{ all -> 0x0022 }
        L_0x00a3:
            r2.unlock()
            p2.h r1 = p2.C0368h.f4194a
            goto L_0x00ad
        L_0x00a9:
            r2.unlock()
            throw r9
        L_0x00ad:
            if (r1 != 0) goto L_0x00b7
            d0.j r9 = new d0.j
            r9.<init>(r0)
            r11.accept(r9)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0179k.b(android.content.Context, R.d, S1.m):void");
    }
}
