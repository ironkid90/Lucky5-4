package k2;

import A2.i;

/* renamed from: k2.M  reason: case insensitive filesystem */
public final class C0285M {

    /* renamed from: a  reason: collision with root package name */
    public final String f3903a;

    /* renamed from: b  reason: collision with root package name */
    public final C0283K f3904b;

    public C0285M(String str, C0283K k3) {
        this.f3903a = str;
        this.f3904b = k3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0285M)) {
            return false;
        }
        C0285M m3 = (C0285M) obj;
        if (i.a(this.f3903a, m3.f3903a) && this.f3904b == m3.f3904b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        String str = this.f3903a;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        return this.f3904b.hashCode() + (i3 * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f3903a + ", type=" + this.f3904b + ")";
    }
}
