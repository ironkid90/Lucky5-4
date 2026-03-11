package j$.time.temporal;

/* 'enum' modifier removed */
final class e extends h {
    e() {
        super("QUARTER_OF_YEAR", 1);
    }

    public final w C() {
        return w.j(1, 4);
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.MONTH_OF_YEAR) && j.a(temporalAccessor);
    }

    public final long r(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return (temporalAccessor.g(a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new RuntimeException("Unsupported field: QuarterOfYear");
    }

    public final w J(TemporalAccessor temporalAccessor) {
        if (W(temporalAccessor)) {
            return C();
        }
        throw new RuntimeException("Unsupported field: QuarterOfYear");
    }

    public final m p(m mVar, long j3) {
        long r3 = r(mVar);
        C().b(j3, this);
        a aVar = a.MONTH_OF_YEAR;
        return mVar.b(((j3 - r3) * 3) + mVar.g(aVar), aVar);
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}
