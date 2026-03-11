package y1;

import java.util.Map;

public final class k implements Map.Entry {

    /* renamed from: f  reason: collision with root package name */
    public k f4860f;

    /* renamed from: g  reason: collision with root package name */
    public k f4861g;

    /* renamed from: h  reason: collision with root package name */
    public k f4862h;

    /* renamed from: i  reason: collision with root package name */
    public k f4863i;

    /* renamed from: j  reason: collision with root package name */
    public k f4864j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f4865k;

    /* renamed from: l  reason: collision with root package name */
    public Object f4866l;

    /* renamed from: m  reason: collision with root package name */
    public int f4867m;

    public k() {
        this.f4865k = null;
        this.f4864j = this;
        this.f4863i = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f4865k
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x0032
            goto L_0x001c
        L_0x0012:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0032
        L_0x001c:
            java.lang.Object r0 = r3.f4866l
            if (r0 != 0) goto L_0x0027
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L_0x0032
            goto L_0x0031
        L_0x0027:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f4865k;
    }

    public final Object getValue() {
        return this.f4866l;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        Object obj = this.f4865k;
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.hashCode();
        }
        Object obj2 = this.f4866l;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i4 ^ i3;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f4866l;
        this.f4866l = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4865k + "=" + this.f4866l;
    }

    public k(k kVar, Object obj, k kVar2, k kVar3) {
        this.f4860f = kVar;
        this.f4865k = obj;
        this.f4867m = 1;
        this.f4863i = kVar2;
        this.f4864j = kVar3;
        kVar3.f4863i = this;
        kVar2.f4864j = this;
    }
}
