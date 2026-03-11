package M;

import A2.i;
import F0.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C0363c;
import q2.C0401d;
import q2.C0403f;
import q2.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1071a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1072b;

    public b(Map map, boolean z3) {
        i.e(map, "preferencesMap");
        this.f1071a = map;
        this.f1072b = new h(z3);
    }

    public final Map a() {
        C0363c cVar;
        Set<Map.Entry> entrySet = this.f1071a.entrySet();
        int a02 = o.a0(C0403f.c0(entrySet));
        if (a02 < 16) {
            a02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a02);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(copyOf, "copyOf(this, size)");
                cVar = new C0363c(key, copyOf);
            } else {
                cVar = new C0363c(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(cVar.f4187f, cVar.f4188g);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f1072b.f322g).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        i.e(eVar, "key");
        Object obj = this.f1071a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(e eVar, Object obj) {
        b();
        Map map = this.f1071a;
        if (obj == null) {
            b();
            map.remove(eVar);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(C0401d.j0((Set) obj));
            i.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(eVar, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            i.d(copyOf, "copyOf(this, size)");
            map.put(eVar, copyOf);
        } else {
            map.put(eVar, obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof M.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            M.b r7 = (M.b) r7
            java.util.Map r0 = r7.f1071a
            java.util.Map r2 = r6.f1071a
            r3 = 1
            if (r0 != r2) goto L_0x0010
            return r3
        L_0x0010:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L_0x001b
            return r1
        L_0x001b:
            java.util.Map r7 = r7.f1071a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r1 = r3
            goto L_0x0063
        L_0x0025:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x002d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L_0x0060
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L_0x005b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0060
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0060
            r0 = r3
            goto L_0x0061
        L_0x005b:
            boolean r0 = A2.i.a(r0, r4)
            goto L_0x0061
        L_0x0060:
            r0 = r1
        L_0x0061:
            if (r0 != 0) goto L_0x002d
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        for (Map.Entry value : this.f1071a.entrySet()) {
            Object value2 = value.getValue();
            if (value2 instanceof byte[]) {
                i3 = Arrays.hashCode((byte[]) value2);
            } else {
                i3 = value2.hashCode();
            }
            i4 += i3;
        }
        return i4;
    }

    public final String toString() {
        return C0401d.e0(this.f1071a.entrySet(), ",\n", "{\n", "\n}", a.f1070g, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
