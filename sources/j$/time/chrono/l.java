package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.c;
import j$.time.format.y;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.s;
import j$.time.temporal.w;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface l extends Comparable {
    C0528b A(int i3, int i4);

    List D();

    C0528b G(int i3, int i4, int i5);

    C0528b L();

    m N(int i3);

    C0528b P(Map map, y yVar);

    String R();

    w U(a aVar);

    C0528b q(long j3);

    String s();

    C0528b t(TemporalAccessor temporalAccessor);

    int w(m mVar, int i3);

    ChronoZonedDateTime y(Instant instant, ZoneId zoneId);

    static l F(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.a(s.a());
        s sVar = s.f5038d;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    C0531e x(LocalDateTime localDateTime) {
        try {
            return t(localDateTime).K(j$.time.l.J(localDateTime));
        } catch (c e2) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e2);
        }
    }
}
