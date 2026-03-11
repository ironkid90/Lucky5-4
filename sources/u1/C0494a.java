package u1;

/* renamed from: u1.a  reason: case insensitive filesystem */
public final class C0494a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4713a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4714b;

    public C0494a(String str, String str2) {
        this.f4713a = str;
        if (str2 != null) {
            this.f4714b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0494a)) {
            return false;
        }
        C0494a aVar = (C0494a) obj;
        if (!this.f4713a.equals(aVar.f4713a) || !this.f4714b.equals(aVar.f4714b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f4713a.hashCode() ^ 1000003) * 1000003) ^ this.f4714b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.f4713a + ", version=" + this.f4714b + "}";
    }
}
