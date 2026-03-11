package o0;

/* renamed from: o0.c  reason: case insensitive filesystem */
public final class C0355c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4141a;

    public C0355c(String str) {
        if (str != null) {
            this.f4141a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0355c)) {
            return false;
        }
        return this.f4141a.equals(((C0355c) obj).f4141a);
    }

    public final int hashCode() {
        return this.f4141a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f4141a + "\"}";
    }
}
