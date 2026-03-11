package j1;

import java.util.ArrayList;

/* renamed from: j1.a  reason: case insensitive filesystem */
public final class C0262a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3836a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3837b;

    public C0262a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f3836a = str;
            this.f3837b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0262a)) {
            return false;
        }
        C0262a aVar = (C0262a) obj;
        if (!this.f3836a.equals(aVar.f3836a) || !this.f3837b.equals(aVar.f3837b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3836a.hashCode() ^ 1000003) * 1000003) ^ this.f3837b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3836a + ", usedDates=" + this.f3837b + "}";
    }
}
