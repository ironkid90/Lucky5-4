package j$.time.temporal;

public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f5163a;

    private b(String str) {
        this.f5163a = str;
    }

    public final m p(m mVar, long j3) {
        return mVar.d(j3, this);
    }

    public final String toString() {
        return this.f5163a;
    }
}
