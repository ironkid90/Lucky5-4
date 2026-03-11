package A;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: A.g  reason: case insensitive filesystem */
public final class C0006g {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f48a;

    public C0006g(DisplayCutout displayCutout) {
        this.f48a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0006g.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f48a, ((C0006g) obj).f48a);
    }

    public final int hashCode() {
        return this.f48a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f48a + "}";
    }
}
