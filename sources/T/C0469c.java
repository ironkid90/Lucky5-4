package t;

import android.graphics.Insets;

/* renamed from: t.c  reason: case insensitive filesystem */
public final class C0469c {

    /* renamed from: e  reason: collision with root package name */
    public static final C0469c f4635e = new C0469c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4636a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4637b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4638c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4639d;

    public C0469c(int i3, int i4, int i5, int i6) {
        this.f4636a = i3;
        this.f4637b = i4;
        this.f4638c = i5;
        this.f4639d = i6;
    }

    public static C0469c a(int i3, int i4, int i5, int i6) {
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return f4635e;
        }
        return new C0469c(i3, i4, i5, i6);
    }

    public static C0469c b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return C0468b.a(this.f4636a, this.f4637b, this.f4638c, this.f4639d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0469c.class != obj.getClass()) {
            return false;
        }
        C0469c cVar = (C0469c) obj;
        if (this.f4639d == cVar.f4639d && this.f4636a == cVar.f4636a && this.f4638c == cVar.f4638c && this.f4637b == cVar.f4637b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f4636a * 31) + this.f4637b) * 31) + this.f4638c) * 31) + this.f4639d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4636a + ", top=" + this.f4637b + ", right=" + this.f4638c + ", bottom=" + this.f4639d + '}';
    }
}
