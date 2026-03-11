package a1;

import A2.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final q f2019a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2020b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2021c;

    public i(Class cls, int i3, int i4) {
        this(q.a(cls), i3, i4);
    }

    public static i a(Class cls) {
        return new i(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f2019a.equals(iVar.f2019a) && this.f2020b == iVar.f2020b && this.f2021c == iVar.f2021c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2019a.hashCode() ^ 1000003) * 1000003) ^ this.f2020b) * 1000003) ^ this.f2021c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2019a);
        sb.append(", type=");
        int i3 = this.f2020b;
        if (i3 == 1) {
            str = "required";
        } else if (i3 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i4 = this.f2021c;
        if (i4 == 0) {
            str2 = "direct";
        } else if (i4 == 1) {
            str2 = "provider";
        } else if (i4 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(h.e("Unsupported injection: ", i4));
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public i(q qVar, int i3, int i4) {
        this.f2019a = qVar;
        this.f2020b = i3;
        this.f2021c = i4;
    }
}
