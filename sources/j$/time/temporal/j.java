package j$.time.temporal;

import j$.time.chrono.C0527a;
import j$.time.chrono.l;
import j$.time.chrono.s;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final r f5169a = h.QUARTER_OF_YEAR;

    /* renamed from: b  reason: collision with root package name */
    public static final r f5170b = h.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: c  reason: collision with root package name */
    public static final r f5171c = h.WEEK_BASED_YEAR;

    static {
        i iVar = i.WEEK_BASED_YEARS;
        i iVar2 = i.WEEK_BASED_YEARS;
    }

    static boolean a(TemporalAccessor temporalAccessor) {
        return ((C0527a) l.F(temporalAccessor)).equals(s.f5038d);
    }
}
