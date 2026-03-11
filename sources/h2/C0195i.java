package h2;

import java.util.Map;
import java.util.Objects;

/* renamed from: h2.i  reason: case insensitive filesystem */
public final class C0195i {

    /* renamed from: a  reason: collision with root package name */
    public String f3092a;

    /* renamed from: b  reason: collision with root package name */
    public C0194h f3093b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f3094c;

    /* renamed from: d  reason: collision with root package name */
    public Map f3095d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0195i.class != obj.getClass()) {
            return false;
        }
        C0195i iVar = (C0195i) obj;
        if (!this.f3092a.equals(iVar.f3092a) || !this.f3093b.equals(iVar.f3093b) || !Objects.equals(this.f3094c, iVar.f3094c) || !this.f3095d.equals(iVar.f3095d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f3092a, this.f3093b, this.f3094c, this.f3095d});
    }
}
