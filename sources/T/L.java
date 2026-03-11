package T;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    public int f1586a;

    /* renamed from: b  reason: collision with root package name */
    public int f1587b;

    /* renamed from: c  reason: collision with root package name */
    public int f1588c;

    /* renamed from: d  reason: collision with root package name */
    public int f1589d;

    /* renamed from: e  reason: collision with root package name */
    public int f1590e;

    public final boolean a() {
        int i3;
        int i4;
        int i5;
        int i6 = this.f1586a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.f1589d;
            int i9 = this.f1587b;
            if (i8 > i9) {
                i5 = 1;
            } else if (i8 == i9) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            if ((i5 & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.f1589d;
            int i11 = this.f1588c;
            if (i10 > i11) {
                i4 = 1;
            } else if (i10 == i11) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.f1590e;
            int i13 = this.f1587b;
            if (i12 > i13) {
                i3 = 1;
            } else if (i12 == i13) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.f1590e;
            int i15 = this.f1588c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i6 & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
