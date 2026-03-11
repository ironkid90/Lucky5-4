package L1;

import a1.C0096a;
import a1.d;
import a1.i;
import a1.q;
import android.support.v4.media.session.a;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public Object f957a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f958b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f959c;

    /* renamed from: d  reason: collision with root package name */
    public int f960d;

    /* renamed from: e  reason: collision with root package name */
    public final int f961e;

    /* renamed from: f  reason: collision with root package name */
    public Object f962f;

    /* renamed from: g  reason: collision with root package name */
    public final Serializable f963g;

    public k(int i3, int i4) {
        this.f962f = new LinkedList();
        this.f958b = new HashSet();
        this.f959c = new HashSet();
        this.f963g = new HashMap();
        this.f957a = "Sqflite";
        this.f960d = i3;
        this.f961e = i4;
    }

    public void a(i iVar) {
        if (!((HashSet) this.f958b).contains(iVar.f2019a)) {
            ((HashSet) this.f959c).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public synchronized void b() {
        for (int i3 = 0; i3 < this.f960d; i3++) {
            i iVar = new i(((String) this.f957a) + i3, this.f961e);
            iVar.a(new h(this, iVar));
            ((HashSet) this.f958b).add(iVar);
        }
    }

    public synchronized void c(g gVar) {
        ((LinkedList) this.f962f).add(gVar);
        Iterator it = new HashSet((HashSet) this.f958b).iterator();
        while (it.hasNext()) {
            h((i) it.next());
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 143 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        r0 = ((java.util.HashSet) r4.f959c).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r1 = (L1.i) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = r1.f953c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        r3.quit();
        r1.f953c = null;
        r1.f954d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.Serializable r0 = r4.f958b     // Catch:{ all -> 0x0029 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0029 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0029 }
        L_0x0009:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0029 }
            r2 = 0
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0029 }
            L1.i r1 = (L1.i) r1     // Catch:{ all -> 0x0029 }
            monitor-enter(r1)     // Catch:{ all -> 0x0029 }
            android.os.HandlerThread r3 = r1.f953c     // Catch:{ all -> 0x0023 }
            if (r3 == 0) goto L_0x0025
            r3.quit()     // Catch:{ all -> 0x0023 }
            r1.f953c = r2     // Catch:{ all -> 0x0023 }
            r1.f954d = r2     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            goto L_0x0009
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            goto L_0x0054
        L_0x002b:
            java.io.Serializable r0 = r4.f959c     // Catch:{ all -> 0x0029 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0029 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0029 }
        L_0x0033:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0029 }
            L1.i r1 = (L1.i) r1     // Catch:{ all -> 0x0029 }
            monitor-enter(r1)     // Catch:{ all -> 0x0029 }
            android.os.HandlerThread r3 = r1.f953c     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004e
            r3.quit()     // Catch:{ all -> 0x004c }
            r1.f953c = r2     // Catch:{ all -> 0x004c }
            r1.f954d = r2     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r0 = move-exception
            goto L_0x0050
        L_0x004e:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            goto L_0x0033
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0052:
            monitor-exit(r4)
            return
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.k.e():void");
    }

    public C0096a f() {
        boolean z3;
        if (((d) this.f962f) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return new C0096a((String) this.f957a, new HashSet((HashSet) this.f958b), new HashSet((HashSet) this.f959c), this.f960d, this.f961e, (d) this.f962f, (HashSet) this.f963g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized g g(i iVar) {
        g gVar;
        try {
            ListIterator listIterator = ((LinkedList) this.f962f).listIterator();
            while (true) {
                i iVar2 = null;
                if (!listIterator.hasNext()) {
                    return null;
                }
                gVar = (g) listIterator.next();
                if (gVar.a() != null) {
                    iVar2 = (i) ((HashMap) this.f963g).get(gVar.a());
                }
                if (iVar2 == null || iVar2 == iVar) {
                    listIterator.remove();
                }
            }
            listIterator.remove();
            return gVar;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void h(i iVar) {
        try {
            g g2 = g(iVar);
            if (g2 != null) {
                ((HashSet) this.f959c).add(iVar);
                ((HashSet) this.f958b).remove(iVar);
                if (g2.a() != null) {
                    ((HashMap) this.f963g).put(g2.a(), iVar);
                }
                iVar.f954d.post(new h(0, iVar, g2));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public k(Class cls, Class[] clsArr) {
        this.f957a = null;
        HashSet hashSet = new HashSet();
        this.f958b = hashSet;
        this.f959c = new HashSet();
        this.f960d = 0;
        this.f961e = 0;
        this.f963g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            a.h(cls2, "Null interface");
            ((HashSet) this.f958b).add(q.a(cls2));
        }
    }

    public k(q qVar, q[] qVarArr) {
        this.f957a = null;
        HashSet hashSet = new HashSet();
        this.f958b = hashSet;
        this.f959c = new HashSet();
        this.f960d = 0;
        this.f961e = 0;
        this.f963g = new HashSet();
        hashSet.add(qVar);
        for (q h3 : qVarArr) {
            a.h(h3, "Null interface");
        }
        Collections.addAll((HashSet) this.f958b, qVarArr);
    }

    public k(Integer num, int i3, Boolean bool, Integer num2, int i4, Integer num3, Boolean bool2) {
        this.f957a = num;
        this.f960d = i3;
        this.f962f = bool;
        this.f958b = num2;
        this.f961e = i4;
        this.f959c = num3;
        this.f963g = bool2;
    }
}
