package n;

public final class l implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f4092i = new Object();

    /* renamed from: f  reason: collision with root package name */
    public int[] f4093f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f4094g;

    /* renamed from: h  reason: collision with root package name */
    public int f4095h;

    public final void a(int i3, Object obj) {
        int i4 = this.f4095h;
        if (i4 == 0 || i3 > this.f4093f[i4 - 1]) {
            if (i4 >= this.f4093f.length) {
                int i5 = (i4 + 1) * 4;
                int i6 = 4;
                while (true) {
                    if (i6 >= 32) {
                        break;
                    }
                    int i7 = (1 << i6) - 12;
                    if (i5 <= i7) {
                        i5 = i7;
                        break;
                    }
                    i6++;
                }
                int i8 = i5 / 4;
                int[] iArr = new int[i8];
                Object[] objArr = new Object[i8];
                int[] iArr2 = this.f4093f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f4094g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4093f = iArr;
                this.f4094g = objArr;
            }
            this.f4093f[i4] = i3;
            this.f4094g[i4] = obj;
            this.f4095h = i4 + 1;
            return;
        }
        int a2 = C0337d.a(this.f4095h, i3, this.f4093f);
        if (a2 >= 0) {
            this.f4094g[a2] = obj;
            return;
        }
        int i9 = ~a2;
        int i10 = this.f4095h;
        if (i9 < i10) {
            Object[] objArr3 = this.f4094g;
            if (objArr3[i9] == f4092i) {
                this.f4093f[i9] = i3;
                objArr3[i9] = obj;
                return;
            }
        }
        if (i10 >= this.f4093f.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArr3 = new int[i14];
            Object[] objArr4 = new Object[i14];
            int[] iArr4 = this.f4093f;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f4094g;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f4093f = iArr3;
            this.f4094g = objArr4;
        }
        int i15 = this.f4095h - i9;
        if (i15 != 0) {
            int[] iArr5 = this.f4093f;
            int i16 = i9 + 1;
            System.arraycopy(iArr5, i9, iArr5, i16, i15);
            Object[] objArr6 = this.f4094g;
            System.arraycopy(objArr6, i9, objArr6, i16, this.f4095h - i9);
        }
        this.f4093f[i9] = i3;
        this.f4094g[i9] = obj;
        this.f4095h++;
    }

    public final Object clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f4093f = (int[]) this.f4093f.clone();
            lVar.f4094g = (Object[]) this.f4094g.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i3 = this.f4095h;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f4095h; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4093f[i4]);
            sb.append('=');
            Object obj = this.f4094g[i4];
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
