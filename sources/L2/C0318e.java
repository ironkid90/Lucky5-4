package l2;

import java.util.Map;
import java.util.Objects;

/* renamed from: l2.e  reason: case insensitive filesystem */
public final class C0318e {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f4011a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f4012b;

    /* renamed from: c  reason: collision with root package name */
    public Map f4013c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0318e.class != obj.getClass()) {
            return false;
        }
        C0318e eVar = (C0318e) obj;
        if (!this.f4011a.equals(eVar.f4011a) || !this.f4012b.equals(eVar.f4012b) || !this.f4013c.equals(eVar.f4013c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4011a, this.f4012b, this.f4013c});
    }
}
