package D1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import y1.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Class f220a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f221b;

    /* renamed from: c  reason: collision with root package name */
    public final int f222c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type b3 = d.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f221b = b3;
            this.f220a = d.h(b3);
            this.f222c = b3.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.f(this.f221b, ((a) obj).f221b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f222c;
    }

    public final String toString() {
        return d.l(this.f221b);
    }

    public a(Type type) {
        type.getClass();
        Type b3 = d.b(type);
        this.f221b = b3;
        this.f220a = d.h(b3);
        this.f222c = b3.hashCode();
    }
}
