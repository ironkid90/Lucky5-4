package U1;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1756a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1757b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1758c;

    public a(String str, String str2) {
        this.f1756a = str;
        this.f1757b = null;
        this.f1758c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f1756a.equals(aVar.f1756a)) {
            return false;
        }
        return this.f1758c.equals(aVar.f1758c);
    }

    public final int hashCode() {
        return this.f1758c.hashCode() + (this.f1756a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f1756a + ", function: " + this.f1758c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f1756a = str;
        this.f1757b = str2;
        this.f1758c = str3;
    }
}
