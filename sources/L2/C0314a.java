package l2;

import java.util.Objects;

/* renamed from: l2.a  reason: case insensitive filesystem */
public final class C0314a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f4006a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0314a.class != obj.getClass()) {
            return false;
        }
        return this.f4006a.equals(((C0314a) obj).f4006a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4006a});
    }
}
