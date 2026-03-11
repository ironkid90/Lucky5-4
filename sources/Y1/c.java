package y1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class c implements WildcardType, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Type f4839f;

    /* renamed from: g  reason: collision with root package name */
    public final Type f4840g;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (typeArr2.length <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        d.c(z3);
        if (typeArr.length == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        d.c(z4);
        if (typeArr2.length == 1) {
            typeArr2[0].getClass();
            d.d(typeArr2[0]);
            Class<Object> cls = Object.class;
            d.c(typeArr[0] != cls ? false : z5);
            this.f4840g = d.b(typeArr2[0]);
            this.f4839f = cls;
            return;
        }
        typeArr[0].getClass();
        d.d(typeArr[0]);
        this.f4840g = null;
        this.f4839f = d.b(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType) || !d.f(this, (WildcardType) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getLowerBounds() {
        Type type = this.f4840g;
        if (type == null) {
            return d.f4841a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f4839f};
    }

    public final int hashCode() {
        int i3;
        Type type = this.f4840g;
        if (type != null) {
            i3 = type.hashCode() + 31;
        } else {
            i3 = 1;
        }
        return i3 ^ (this.f4839f.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f4840g;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Class<Object> cls = Object.class;
        Type type2 = this.f4839f;
        if (type2 == cls) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
