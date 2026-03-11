package H2;

import B2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator, a {

    /* renamed from: f  reason: collision with root package name */
    public final String f496f;

    /* renamed from: g  reason: collision with root package name */
    public int f497g;

    /* renamed from: h  reason: collision with root package name */
    public int f498h;

    /* renamed from: i  reason: collision with root package name */
    public int f499i;

    /* renamed from: j  reason: collision with root package name */
    public int f500j;

    public d(String str) {
        this.f496f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r1 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r9 = this;
            int r0 = r9.f497g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            if (r0 != r2) goto L_0x0009
            r1 = r2
        L_0x0009:
            return r1
        L_0x000a:
            int r0 = r9.f500j
            r3 = 2
            if (r0 >= 0) goto L_0x0012
            r9.f497g = r3
            return r1
        L_0x0012:
            java.lang.String r0 = r9.f496f
            int r1 = r0.length()
            int r4 = r9.f498h
            int r5 = r0.length()
        L_0x001e:
            if (r4 >= r5) goto L_0x0043
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L_0x002f
            if (r6 == r7) goto L_0x002f
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002f:
            if (r6 != r7) goto L_0x0040
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L_0x0040
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r3 = r2
        L_0x0041:
            r1 = r4
            goto L_0x0044
        L_0x0043:
            r3 = -1
        L_0x0044:
            r9.f497g = r2
            r9.f500j = r3
            r9.f499i = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.d.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.f497g = 0;
            int i3 = this.f499i;
            int i4 = this.f498h;
            this.f498h = this.f500j + i3;
            return this.f496f.subSequence(i4, i3).toString();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
