package p2;

import A2.i;

/* renamed from: p2.b  reason: case insensitive filesystem */
public final class C0362b implements Comparable {

    /* renamed from: g  reason: collision with root package name */
    public static final C0362b f4185g = new C0362b();

    /* renamed from: f  reason: collision with root package name */
    public final int f4186f = 131584;

    public final int compareTo(Object obj) {
        C0362b bVar = (C0362b) obj;
        i.e(bVar, "other");
        return this.f4186f - bVar.f4186f;
    }

    public final boolean equals(Object obj) {
        C0362b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0362b) {
            bVar = (C0362b) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        if (this.f4186f == bVar.f4186f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4186f;
    }

    public final String toString() {
        return "2.2.0";
    }
}
