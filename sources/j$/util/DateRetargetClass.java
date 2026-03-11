package j$.util;

import j$.time.Instant;
import java.util.Date;

public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.S(date.getTime());
    }
}
