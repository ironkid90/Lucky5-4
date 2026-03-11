package n;

/* renamed from: n.e  reason: case insensitive filesystem */
public final class C0338e implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f4063j = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f4064f = false;

    /* renamed from: g  reason: collision with root package name */
    public long[] f4065g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f4066h;

    /* renamed from: i  reason: collision with root package name */
    public int f4067i;

    public C0338e() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f4065g = new long[i6];
        this.f4066h = new Object[i6];
    }

    public final void a() {
        int i3 = this.f4067i;
        long[] jArr = this.f4065g;
        Object[] objArr = this.f4066h;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f4063j) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f4064f = false;
        this.f4067i = i4;
    }

    public final void b(long j3, Object obj) {
        int b3 = C0337d.b(this.f4065g, this.f4067i, j3);
        if (b3 >= 0) {
            this.f4066h[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f4067i;
        if (i3 < i4) {
            Object[] objArr = this.f4066h;
            if (objArr[i3] == f4063j) {
                this.f4065g[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f4064f && i4 >= this.f4065g.length) {
            a();
            i3 = ~C0337d.b(this.f4065g, this.f4067i, j3);
        }
        int i5 = this.f4067i;
        if (i5 >= this.f4065g.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.f4065g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4066h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4065g = jArr;
            this.f4066h = objArr2;
        }
        int i10 = this.f4067i - i3;
        if (i10 != 0) {
            long[] jArr3 = this.f4065g;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f4066h;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f4067i - i3);
        }
        this.f4065g[i3] = j3;
        this.f4066h[i3] = obj;
        this.f4067i++;
    }

    public final Object clone() {
        try {
            C0338e eVar = (C0338e) super.clone();
            eVar.f4065g = (long[]) this.f4065g.clone();
            eVar.f4066h = (Object[]) this.f4066h.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        if (this.f4064f) {
            a();
        }
        if (this.f4067i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4067i * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4067i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f4064f) {
                a();
            }
            sb.append(this.f4065g[i3]);
            sb.append('=');
            if (this.f4064f) {
                a();
            }
            Object obj = this.f4066h[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
