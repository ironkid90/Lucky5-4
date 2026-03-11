package a1;

import X0.b;
import i1.C0219b;
import i1.c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import s1.C0456q;

public final class k implements c, C0219b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2022a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f2023b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final b1.k f2024c;

    public k() {
        b1.k kVar = b1.k.f2699f;
        this.f2024c = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (java.util.Map) r4.f2022a.get(X0.b.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r0 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r0 = r0.entrySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        if (r0.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new L1.d(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i1.C0218a r5) {
        /*
            r4 = this;
            r5.getClass()
            monitor-enter(r4)
            java.util.ArrayDeque r0 = r4.f2023b     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            r0.add(r5)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r5 = move-exception
            goto L_0x004b
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            monitor-enter(r4)
            java.util.HashMap r0 = r4.f2022a     // Catch:{ all -> 0x0022 }
            java.lang.Class<X0.b> r1 = X0.b.class
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0022 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0024
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r5 = move-exception
            goto L_0x0049
        L_0x0024:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0022 }
        L_0x0028:
            monitor-exit(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            L1.d r3 = new L1.d
            r3.<init>((java.util.Map.Entry) r1, (i1.C0218a) r5)
            r2.execute(r3)
            goto L_0x002d
        L_0x0048:
            return
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r5
        L_0x004b:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.a(i1.a):void");
    }

    public final void b(C0456q qVar) {
        Class<b> cls = b.class;
        b1.k kVar = this.f2024c;
        synchronized (this) {
            try {
                kVar.getClass();
                if (!this.f2022a.containsKey(cls)) {
                    this.f2022a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2022a.get(cls)).put(qVar, kVar);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(s1.C0456q r3) {
        /*
            r2 = this;
            java.lang.Class<X0.b> r0 = X0.b.class
            monitor-enter(r2)
            r3.getClass()     // Catch:{ all -> 0x0027 }
            java.util.HashMap r1 = r2.f2022a     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            java.util.HashMap r1 = r2.f2022a     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0027 }
            r1.remove(r3)     // Catch:{ all -> 0x0027 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0029
            java.util.HashMap r3 = r2.f2022a     // Catch:{ all -> 0x0027 }
            r3.remove(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0029
        L_0x0027:
            r3 = move-exception
            goto L_0x002b
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.c(s1.q):void");
    }
}
