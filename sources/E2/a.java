package E2;

import java.util.Iterator;

public class a implements Iterable, B2.a {

    /* renamed from: f  reason: collision with root package name */
    public final int f252f;

    /* renamed from: g  reason: collision with root package name */
    public final int f253g;

    /* renamed from: h  reason: collision with root package name */
    public final int f254h;

    public a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i5 != Integer.MIN_VALUE) {
            this.f252f = i3;
            if (i5 > 0) {
                if (i3 < i4) {
                    int i6 = i4 % i5;
                    int i7 = i3 % i5;
                    int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                    i4 -= i8 < 0 ? i8 + i5 : i8;
                }
            } else if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i3 > i4) {
                int i9 = -i5;
                int i10 = i3 % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
            this.f253g = i4;
            this.f254h = i5;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (E2.a) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof E2.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            E2.a r0 = (E2.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            E2.a r3 = (E2.a) r3
            int r0 = r3.f252f
            int r1 = r2.f252f
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f253g
            int r1 = r3.f253g
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f254h
            int r3 = r3.f254h
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f252f * 31) + this.f253g) * 31) + this.f254h;
    }

    public boolean isEmpty() {
        int i3 = this.f254h;
        int i4 = this.f253g;
        int i5 = this.f252f;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new b(this.f252f, this.f253g, this.f254h);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f253g;
        int i4 = this.f252f;
        int i5 = this.f254h;
        if (i5 > 0) {
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
