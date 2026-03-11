package androidx.datastore.preferences.protobuf;

import java.util.Map;

public final class Z implements Map.Entry, Comparable {

    /* renamed from: f  reason: collision with root package name */
    public final Comparable f2400f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2401g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Y f2402h;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f2402h = y2;
        this.f2400f = comparable;
        this.f2401g = obj;
    }

    public final int compareTo(Object obj) {
        return this.f2400f.compareTo(((Z) obj).f2400f);
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2400f;
        if (comparable != null) {
            z3 = comparable.equals(key);
        } else if (key == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Object obj2 = this.f2401g;
            Object value = entry.getValue();
            if (obj2 != null) {
                z4 = obj2.equals(value);
            } else if (value == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final Object getKey() {
        return this.f2400f;
    }

    public final Object getValue() {
        return this.f2401g;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        Comparable comparable = this.f2400f;
        if (comparable == null) {
            i3 = 0;
        } else {
            i3 = comparable.hashCode();
        }
        Object obj = this.f2401g;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i4 ^ i3;
    }

    public final Object setValue(Object obj) {
        this.f2402h.b();
        Object obj2 = this.f2401g;
        this.f2401g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2400f + "=" + this.f2401g;
    }
}
