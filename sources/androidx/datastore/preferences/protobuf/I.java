package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class I extends LinkedHashMap {

    /* renamed from: g  reason: collision with root package name */
    public static final I f2356g;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2357f = true;

    static {
        I i3 = new I();
        f2356g = i3;
        i3.f2357f = false;
    }

    public final void a() {
        if (!this.f2357f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, androidx.datastore.preferences.protobuf.I] */
    public final I b() {
        if (isEmpty()) {
            return new I();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f2357f = true;
        return linkedHashMap;
    }

    public final void clear() {
        a();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto L_0x000c
        L_0x000a:
            r7 = r0
            goto L_0x005b
        L_0x000c:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
        L_0x0016:
            r7 = r1
            goto L_0x005b
        L_0x0018:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0058
        L_0x0054:
            boolean r3 = r4.equals(r3)
        L_0x0058:
            if (r3 != 0) goto L_0x0020
            goto L_0x0016
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            r1 = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                Charset charset = C0120y.f2497a;
                i3 = r6;
                for (byte b3 : (byte[]) key) {
                    i3 = (i3 * 31) + b3;
                }
                if (i3 == 0) {
                    i3 = 1;
                }
            } else {
                i3 = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = C0120y.f2497a;
                i4 = r5;
                for (byte b4 : (byte[]) value) {
                    i4 = (i4 * 31) + b4;
                }
                if (i4 == 0) {
                    i4 = 1;
                }
            } else {
                i4 = value.hashCode();
            }
            i5 += i3 ^ i4;
        }
        return i5;
    }

    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = C0120y.f2497a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        a();
        for (Object next : map.keySet()) {
            Charset charset = C0120y.f2497a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
