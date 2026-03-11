package o0;

/* renamed from: o0.b  reason: case insensitive filesystem */
public final class C0354b {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f4140a;

    public C0354b(Integer num) {
        this.f4140a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0354b)) {
            return false;
        }
        C0354b bVar = (C0354b) obj;
        Integer num = this.f4140a;
        if (num != null) {
            return num.equals(bVar.f4140a);
        }
        if (bVar.f4140a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        Integer num = this.f4140a;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        return i3 ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f4140a + "}";
    }
}
