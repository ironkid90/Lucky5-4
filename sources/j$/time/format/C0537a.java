package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.s;
import j$.time.temporal.t;

/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0537a implements t {
    public final Object j(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.a(s.g());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
