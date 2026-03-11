package androidx.datastore.preferences.protobuf;

public final class E implements L {

    /* renamed from: a  reason: collision with root package name */
    public L[] f2349a;

    public final boolean a(Class cls) {
        for (L a2 : this.f2349a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final V b(Class cls) {
        for (L l3 : this.f2349a) {
            if (l3.a(cls)) {
                return l3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
