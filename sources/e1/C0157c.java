package e1;

import java.util.Collections;
import java.util.Map;

/* renamed from: e1.c  reason: case insensitive filesystem */
public final class C0157c {

    /* renamed from: a  reason: collision with root package name */
    public final String f2938a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f2939b;

    public C0157c(String str, Map map) {
        this.f2938a = str;
        this.f2939b = map;
    }

    public static C0157c a(String str) {
        return new C0157c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0157c)) {
            return false;
        }
        C0157c cVar = (C0157c) obj;
        if (!this.f2938a.equals(cVar.f2938a) || !this.f2939b.equals(cVar.f2939b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2939b.hashCode() + (this.f2938a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2938a + ", properties=" + this.f2939b.values() + "}";
    }
}
