package j$.time.temporal;

public enum a implements r {
    NANO_OF_SECOND("NanoOfSecond", w.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", w.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", w.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", w.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", w.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", w.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", w.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", w.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", w.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", w.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", w.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", w.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", w.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", w.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", w.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", w.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", w.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", w.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", w.k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", w.k(365, 366)),
    EPOCH_DAY("EpochDay", w.j(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", w.k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", w.j(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", w.j(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", w.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", w.k(999999999, 1000000000)),
    YEAR("Year", w.j(-999999999, 999999999), 0),
    ERA("Era", w.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", w.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", w.j(-64800, 64800));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f5160a;

    /* renamed from: b  reason: collision with root package name */
    private final w f5161b;

    private a(String str, w wVar) {
        this.f5160a = str;
        this.f5161b = wVar;
    }

    private a(String str, w wVar, int i3) {
        this.f5160a = str;
        this.f5161b = wVar;
    }

    public final w C() {
        return this.f5161b;
    }

    public final boolean T() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean b0() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void a0(long j3) {
        this.f5161b.b(j3, this);
    }

    public final int Z(long j3) {
        return this.f5161b.a(j3, this);
    }

    public final boolean W(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(this);
    }

    public final w J(TemporalAccessor temporalAccessor) {
        return temporalAccessor.l(this);
    }

    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(this);
    }

    public final m p(m mVar, long j3) {
        return mVar.b(j3, this);
    }

    public final String toString() {
        return this.f5160a;
    }
}
