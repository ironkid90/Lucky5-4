package a0;

import H2.l;
import M.d;
import java.math.BigInteger;
import p2.C0366f;

public final class i implements Comparable {

    /* renamed from: k  reason: collision with root package name */
    public static final i f1990k = new i(0, 1, 0, "");

    /* renamed from: f  reason: collision with root package name */
    public final int f1991f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1992g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1993h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1994i;

    /* renamed from: j  reason: collision with root package name */
    public final C0366f f1995j = new C0366f(new d(3, this));

    static {
        new i(0, 0, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i3, int i4, int i5, String str) {
        this.f1991f = i3;
        this.f1992g = i4;
        this.f1993h = i5;
        this.f1994i = str;
    }

    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        A2.i.e(iVar, "other");
        Object a2 = this.f1995j.a();
        A2.i.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f1995j.a();
        A2.i.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (a0.i) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof a0.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            a0.i r4 = (a0.i) r4
            int r0 = r4.f1991f
            int r2 = r3.f1991f
            if (r2 != r0) goto L_0x001b
            int r0 = r3.f1992g
            int r2 = r4.f1992g
            if (r0 != r2) goto L_0x001b
            int r0 = r3.f1993h
            int r4 = r4.f1993h
            if (r0 != r4) goto L_0x001b
            r1 = 1
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((527 + this.f1991f) * 31) + this.f1992g) * 31) + this.f1993h;
    }

    public final String toString() {
        String str;
        String str2 = this.f1994i;
        if (!l.h0(str2)) {
            str = "-" + str2;
        } else {
            str = "";
        }
        return this.f1991f + '.' + this.f1992g + '.' + this.f1993h + str;
    }
}
