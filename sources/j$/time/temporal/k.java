package j$.time.temporal;

import j$.time.chrono.l;
import j$.time.format.y;
import java.util.HashMap;

enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a  reason: collision with root package name */
    private final transient String f5173a;

    /* renamed from: b  reason: collision with root package name */
    private final transient w f5174b;

    /* renamed from: c  reason: collision with root package name */
    private final transient long f5175c;

    public final boolean T() {
        return true;
    }

    private k(String str, long j3) {
        this.f5173a = str;
        this.f5174b = w.j(-365243219162L + j3, 365241780471L + j3);
        this.f5175c = j3;
    }

    public final w C() {
        return this.f5174b;
    }

    public final w J(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(a.EPOCH_DAY)) {
            return this.f5174b;
        }
        throw new RuntimeException("Unsupported field: " + this);
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY) + this.f5175c;
    }

    public final m p(m mVar, long j3) {
        if (this.f5174b.i(j3)) {
            return mVar.b(Math.subtractExact(j3, this.f5175c), a.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.f5173a + " " + j3);
    }

    public final TemporalAccessor S(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        l F3 = l.F(temporalAccessor);
        y yVar2 = y.LENIENT;
        long j3 = this.f5175c;
        if (yVar == yVar2) {
            return F3.q(Math.subtractExact(longValue, j3));
        }
        this.f5174b.b(longValue, this);
        return F3.q(longValue - j3);
    }

    public final String toString() {
        return this.f5173a;
    }
}
