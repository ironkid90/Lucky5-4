package H2;

import A2.i;
import B2.a;
import E2.c;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, a {

    /* renamed from: f  reason: collision with root package name */
    public int f486f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f487g;

    /* renamed from: h  reason: collision with root package name */
    public int f488h;

    /* renamed from: i  reason: collision with root package name */
    public c f489i;

    /* renamed from: j  reason: collision with root package name */
    public int f490j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ c f491k;

    public b(c cVar) {
        this.f491k = cVar;
        int i3 = cVar.f493b;
        int length = cVar.f492a.length();
        if (length >= 0) {
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 > length) {
                i3 = length;
            }
            this.f487g = i3;
            this.f488h = i3;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [E2.a, E2.c] */
    /* JADX WARNING: type inference failed for: r5v2, types: [E2.a] */
    /* JADX WARNING: type inference failed for: r0v8, types: [E2.a, E2.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r7 < r3) goto L_0x001d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f488h
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            r8.f486f = r1
            r0 = 0
            r8.f489i = r0
            goto L_0x0081
        L_0x000c:
            H2.c r2 = r8.f491k
            int r3 = r2.f494c
            r4 = 1
            java.lang.String r5 = r2.f492a
            r6 = -1
            if (r3 <= 0) goto L_0x001d
            int r7 = r8.f490j
            int r7 = r7 + r4
            r8.f490j = r7
            if (r7 >= r3) goto L_0x0023
        L_0x001d:
            int r3 = r5.length()
            if (r0 <= r3) goto L_0x0033
        L_0x0023:
            E2.c r0 = new E2.c
            int r1 = r8.f487g
            int r2 = H2.l.c0(r5)
            r0.<init>(r1, r2, r4)
            r8.f489i = r0
            r8.f488h = r6
            goto L_0x007f
        L_0x0033:
            H2.k r0 = r2.f495d
            int r2 = r8.f488h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.i(r5, r2)
            p2.c r0 = (p2.C0363c) r0
            if (r0 != 0) goto L_0x0053
            E2.c r0 = new E2.c
            int r1 = r8.f487g
            int r2 = H2.l.c0(r5)
            r0.<init>(r1, r2, r4)
            r8.f489i = r0
            r8.f488h = r6
            goto L_0x007f
        L_0x0053:
            java.lang.Object r2 = r0.f4187f
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f4188g
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f487g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r5) goto L_0x006c
            E2.c r3 = E2.c.f259i
            goto L_0x0074
        L_0x006c:
            E2.c r5 = new E2.c
            int r6 = r2 + -1
            r5.<init>(r3, r6, r4)
            r3 = r5
        L_0x0074:
            r8.f489i = r3
            int r2 = r2 + r0
            r8.f487g = r2
            if (r0 != 0) goto L_0x007c
            r1 = r4
        L_0x007c:
            int r2 = r2 + r1
            r8.f488h = r2
        L_0x007f:
            r8.f486f = r4
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.b.a():void");
    }

    public final boolean hasNext() {
        if (this.f486f == -1) {
            a();
        }
        if (this.f486f == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.f486f == -1) {
            a();
        }
        if (this.f486f != 0) {
            c cVar = this.f489i;
            i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f489i = null;
            this.f486f = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
