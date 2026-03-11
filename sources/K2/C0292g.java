package k2;

import A2.i;

/* renamed from: k2.g  reason: case insensitive filesystem */
public final class C0292g {

    /* renamed from: a  reason: collision with root package name */
    public final String f3916a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3917b;

    public C0292g(String str, boolean z3) {
        this.f3916a = str;
        this.f3917b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292g)) {
            return false;
        }
        C0292g gVar = (C0292g) obj;
        if (i.a(this.f3916a, gVar.f3916a) && this.f3917b == gVar.f3917b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        String str = this.f3916a;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        return Boolean.hashCode(this.f3917b) + (i3 * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f3916a + ", useDataStore=" + this.f3917b + ")";
    }
}
