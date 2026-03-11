package y1;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: y1.a  reason: case insensitive filesystem */
public final class C0520a implements GenericArrayType, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Type f4835f;

    public C0520a(Type type) {
        this.f4835f = d.b(type);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType) || !d.f(this, (GenericArrayType) obj)) {
            return false;
        }
        return true;
    }

    public final Type getGenericComponentType() {
        return this.f4835f;
    }

    public final int hashCode() {
        return this.f4835f.hashCode();
    }

    public final String toString() {
        return d.l(this.f4835f) + "[]";
    }
}
