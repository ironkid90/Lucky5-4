package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class c0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c0 f2410f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2411a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2412b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2413c;

    /* renamed from: d  reason: collision with root package name */
    public int f2414d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2415e;

    public c0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f2411a = i3;
        this.f2412b = iArr;
        this.f2413c = objArr;
        this.f2415e = z3;
    }

    public final void a(int i3) {
        int[] iArr = this.f2412b;
        if (i3 > iArr.length) {
            int i4 = this.f2411a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2412b = Arrays.copyOf(iArr, i3);
            this.f2413c = Arrays.copyOf(this.f2413c, i3);
        }
    }

    public final int b() {
        int x02;
        int i3 = this.f2414d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2411a; i5++) {
            int i6 = this.f2412b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                x02 = C0109m.x0(((Long) this.f2413c[i5]).longValue(), i7);
            } else if (i8 == 1) {
                ((Long) this.f2413c[i5]).getClass();
                x02 = C0109m.j0(i7);
            } else if (i8 == 2) {
                x02 = C0109m.f0(i7, (C0103g) this.f2413c[i5]);
            } else if (i8 == 3) {
                i4 = ((c0) this.f2413c[i5]).b() + (C0109m.u0(i7) * 2) + i4;
            } else if (i8 == 5) {
                ((Integer) this.f2413c[i5]).getClass();
                x02 = C0109m.i0(i7);
            } else {
                throw new IllegalStateException(A.b());
            }
            i4 = x02 + i4;
        }
        this.f2414d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (this.f2415e) {
            a(this.f2411a + 1);
            int[] iArr = this.f2412b;
            int i4 = this.f2411a;
            iArr[i4] = i3;
            this.f2413c[i4] = obj;
            this.f2411a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(F f3) {
        if (this.f2411a != 0) {
            f3.getClass();
            for (int i3 = 0; i3 < this.f2411a; i3++) {
                int i4 = this.f2412b[i3];
                Object obj = this.f2413c[i3];
                int i5 = i4 >>> 3;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    f3.j(((Long) obj).longValue(), i5);
                } else if (i6 == 1) {
                    f3.f(((Long) obj).longValue(), i5);
                } else if (i6 == 2) {
                    f3.b(i5, (C0103g) obj);
                } else if (i6 == 3) {
                    C0109m mVar = (C0109m) f3.f2351a;
                    mVar.O0(i5, 3);
                    ((c0) obj).d(f3);
                    mVar.O0(i5, 4);
                } else if (i6 == 5) {
                    f3.e(i5, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(A.b());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i3 = this.f2411a;
        if (i3 == c0Var.f2411a) {
            int[] iArr = this.f2412b;
            int[] iArr2 = c0Var.f2412b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.f2413c;
                    Object[] objArr2 = c0Var.f2413c;
                    int i5 = this.f2411a;
                    int i6 = 0;
                    while (i6 < i5) {
                        if (objArr[i6].equals(objArr2[i6])) {
                            i6++;
                        }
                    }
                    return true;
                } else if (iArr[i4] != iArr2[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2411a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f2412b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f2413c;
        int i9 = this.f2411a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
