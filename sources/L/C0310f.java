package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.f  reason: case insensitive filesystem */
public class C0310f implements Iterable {

    /* renamed from: f  reason: collision with root package name */
    public C0307c f3998f;

    /* renamed from: g  reason: collision with root package name */
    public C0307c f3999g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakHashMap f4000h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f4001i = 0;

    public C0307c a(Object obj) {
        C0307c cVar = this.f3998f;
        while (cVar != null && !cVar.f3991f.equals(obj)) {
            cVar = cVar.f3993h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        C0307c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f4001i--;
        WeakHashMap weakHashMap = this.f4000h;
        if (!weakHashMap.isEmpty()) {
            for (C0309e a3 : weakHashMap.keySet()) {
                a3.a(a2);
            }
        }
        C0307c cVar = a2.f3994i;
        if (cVar != null) {
            cVar.f3993h = a2.f3993h;
        } else {
            this.f3998f = a2.f3993h;
        }
        C0307c cVar2 = a2.f3993h;
        if (cVar2 != null) {
            cVar2.f3994i = cVar;
        } else {
            this.f3999g = cVar;
        }
        a2.f3993h = null;
        a2.f3994i = null;
        return a2.f3992g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((l.C0306b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof l.C0310f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            l.f r7 = (l.C0310f) r7
            int r1 = r6.f4001i
            int r3 = r7.f4001i
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            l.b r3 = (l.C0306b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            l.b r4 = (l.C0306b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            l.b r7 = (l.C0306b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0310f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0306b bVar = (C0306b) it;
            if (!bVar.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        C0306b bVar = new C0306b(this.f3998f, this.f3999g, 0);
        this.f4000h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0306b bVar = (C0306b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
