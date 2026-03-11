package x0;

import A0.a;
import java.util.HashMap;
import o0.C0356d;

/* renamed from: x0.b  reason: case insensitive filesystem */
public final class C0510b {

    /* renamed from: a  reason: collision with root package name */
    public final a f4767a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4768b;

    public C0510b(a aVar, HashMap hashMap) {
        this.f4767a = aVar;
        this.f4768b = hashMap;
    }

    public final long a(C0356d dVar, long j3, int i3) {
        long j4;
        long c3 = j3 - this.f4767a.c();
        C0511c cVar = (C0511c) this.f4768b.get(dVar);
        long j5 = cVar.f4769a;
        int i4 = i3 - 1;
        if (j5 > 1) {
            j4 = j5;
        } else {
            j4 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i4) * ((double) j5) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j4 * ((long) i4))))), c3), cVar.f4770b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0510b)) {
            return false;
        }
        C0510b bVar = (C0510b) obj;
        if (!this.f4767a.equals(bVar.f4767a) || !this.f4768b.equals(bVar.f4768b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f4767a.hashCode() ^ 1000003) * 1000003) ^ this.f4768b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4767a + ", values=" + this.f4768b + "}";
    }
}
