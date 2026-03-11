package I2;

public final class F implements M {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f718f;

    public F(boolean z3) {
        this.f718f = z3;
    }

    public final boolean b() {
        return this.f718f;
    }

    public final b0 f() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f718f) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
