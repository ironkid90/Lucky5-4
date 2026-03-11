package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.C0528b;
import j$.time.chrono.l;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.w;

final class s implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0528b f5106a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f5107b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f5108c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f5109d;

    s(C0528b bVar, TemporalAccessor temporalAccessor, l lVar, ZoneId zoneId) {
        this.f5106a = bVar;
        this.f5107b = temporalAccessor;
        this.f5108c = lVar;
        this.f5109d = zoneId;
    }

    public final boolean f(r rVar) {
        C0528b bVar = this.f5106a;
        if (bVar == null || !rVar.T()) {
            return this.f5107b.f(rVar);
        }
        return bVar.f(rVar);
    }

    public final w l(r rVar) {
        C0528b bVar = this.f5106a;
        if (bVar == null || !rVar.T()) {
            return this.f5107b.l(rVar);
        }
        return bVar.l(rVar);
    }

    public final long g(r rVar) {
        C0528b bVar = this.f5106a;
        if (bVar == null || !rVar.T()) {
            return this.f5107b.g(rVar);
        }
        return bVar.g(rVar);
    }

    public final Object a(t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return this.f5108c;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return this.f5109d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return this.f5107b.a(tVar);
        }
        return tVar.j(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        l lVar = this.f5108c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = str2;
        }
        ZoneId zoneId = this.f5109d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f5107b + str + str2;
    }
}
