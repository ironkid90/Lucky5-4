package E2;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final c f259i = new a(1, 0, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (E2.c) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof E2.c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            E2.c r0 = (E2.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            E2.c r3 = (E2.c) r3
            int r0 = r3.f252f
            int r1 = r2.f252f
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f253g
            int r0 = r2.f253g
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f252f * 31) + this.f253g;
    }

    public final boolean isEmpty() {
        if (this.f252f > this.f253g) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f252f + ".." + this.f253g;
    }
}
