package j$.time.temporal;

enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f5168a;

    private i(String str) {
        this.f5168a = str;
    }

    public final m p(m mVar, long j3) {
        int i3 = c.f5164a[ordinal()];
        if (i3 == 1) {
            r rVar = j.f5171c;
            return mVar.b(Math.addExact((long) mVar.i(rVar), j3), rVar);
        } else if (i3 == 2) {
            return mVar.d(j3 / 4, b.YEARS).d((j3 % 4) * 3, b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final String toString() {
        return this.f5168a;
    }
}
