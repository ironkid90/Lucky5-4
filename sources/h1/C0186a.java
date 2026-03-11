package h1;

/* renamed from: h1.a  reason: case insensitive filesystem */
public final class C0186a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f3036a;

    public C0186a(int i3) {
        this.f3036a = i3;
    }

    public final Class annotationType() {
        return e.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        C0186a aVar = (C0186a) ((e) obj);
        if (this.f3036a == aVar.f3036a) {
            d dVar = d.f3038f;
            aVar.getClass();
            if (dVar.equals(dVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (14552422 ^ this.f3036a) + (d.f3038f.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3036a + "intEncoding=" + d.f3038f + ')';
    }
}
