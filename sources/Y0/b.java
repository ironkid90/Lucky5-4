package y0;

import r0.h;
import r0.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f4815a;

    /* renamed from: b  reason: collision with root package name */
    public final i f4816b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4817c;

    public b(long j3, i iVar, h hVar) {
        this.f4815a = j3;
        this.f4816b = iVar;
        this.f4817c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4815a != bVar.f4815a || !this.f4816b.equals(bVar.f4816b) || !this.f4817c.equals(bVar.f4817c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f4815a;
        return ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f4816b.hashCode()) * 1000003) ^ this.f4817c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4815a + ", transportContext=" + this.f4816b + ", event=" + this.f4817c + "}";
    }
}
