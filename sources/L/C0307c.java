package l;

import java.util.Map;

/* renamed from: l.c  reason: case insensitive filesystem */
public final class C0307c implements Map.Entry {

    /* renamed from: f  reason: collision with root package name */
    public final Object f3991f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3992g;

    /* renamed from: h  reason: collision with root package name */
    public C0307c f3993h;

    /* renamed from: i  reason: collision with root package name */
    public C0307c f3994i;

    public C0307c(Object obj, Object obj2) {
        this.f3991f = obj;
        this.f3992g = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0307c)) {
            return false;
        }
        C0307c cVar = (C0307c) obj;
        if (!this.f3991f.equals(cVar.f3991f) || !this.f3992g.equals(cVar.f3992g)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f3991f;
    }

    public final Object getValue() {
        return this.f3992g;
    }

    public final int hashCode() {
        return this.f3991f.hashCode() ^ this.f3992g.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3991f + "=" + this.f3992g;
    }
}
