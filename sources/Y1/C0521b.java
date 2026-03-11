package y1;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: y1.b  reason: case insensitive filesystem */
public final class C0521b implements ParameterizedType, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Type f4836f;

    /* renamed from: g  reason: collision with root package name */
    public final Type f4837g;

    /* renamed from: h  reason: collision with root package name */
    public final Type[] f4838h;

    public C0521b(Type type, Type type2, Type... typeArr) {
        Type type3;
        boolean z3;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z4 = true;
            if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (type == null && !z3) {
                z4 = false;
            }
            d.c(z4);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = d.b(type);
        }
        this.f4836f = type3;
        this.f4837g = d.b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f4838h = typeArr2;
        int length = typeArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f4838h[i3].getClass();
            d.d(this.f4838h[i3]);
            Type[] typeArr3 = this.f4838h;
            typeArr3[i3] = d.b(typeArr3[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType) || !d.f(this, (ParameterizedType) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4838h.clone();
    }

    public final Type getOwnerType() {
        return this.f4836f;
    }

    public final Type getRawType() {
        return this.f4837g;
    }

    public final int hashCode() {
        int i3;
        int hashCode = Arrays.hashCode(this.f4838h) ^ this.f4837g.hashCode();
        Type type = this.f4836f;
        if (type != null) {
            i3 = type.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        Type[] typeArr = this.f4838h;
        int length = typeArr.length;
        Type type = this.f4837g;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.l(type));
        sb.append("<");
        sb.append(d.l(typeArr[0]));
        for (int i3 = 1; i3 < length; i3++) {
            sb.append(", ");
            sb.append(d.l(typeArr[i3]));
        }
        sb.append(">");
        return sb.toString();
    }
}
