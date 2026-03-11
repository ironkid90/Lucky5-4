package T;

/* renamed from: T.b  reason: case insensitive filesystem */
public final class C0081b {

    /* renamed from: a  reason: collision with root package name */
    public long f1592a = 0;

    /* renamed from: b  reason: collision with root package name */
    public C0081b f1593b;

    public final int a(int i3) {
        C0081b bVar = this.f1593b;
        if (bVar == null) {
            if (i3 >= 64) {
                return Long.bitCount(this.f1592a);
            }
            return Long.bitCount(this.f1592a & ((1 << i3) - 1));
        } else if (i3 < 64) {
            return Long.bitCount(this.f1592a & ((1 << i3) - 1));
        } else {
            return Long.bitCount(this.f1592a) + bVar.a(i3 - 64);
        }
    }

    public final boolean b(int i3) {
        if (i3 >= 64) {
            if (this.f1593b == null) {
                this.f1593b = new C0081b();
            }
            return this.f1593b.b(i3 - 64);
        } else if ((this.f1592a & (1 << i3)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void c() {
        this.f1592a = 0;
        C0081b bVar = this.f1593b;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final String toString() {
        if (this.f1593b == null) {
            return Long.toBinaryString(this.f1592a);
        }
        return this.f1593b.toString() + "xx" + Long.toBinaryString(this.f1592a);
    }
}
