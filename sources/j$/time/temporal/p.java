package j$.time.temporal;

import L.k;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.l;
import j$.time.h;

public final /* synthetic */ class p implements t, n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5179a;

    public /* synthetic */ p(int i3) {
        this.f5179a = i3;
    }

    public m c(m mVar) {
        a aVar = a.DAY_OF_MONTH;
        return mVar.b(mVar.l(aVar).d(), aVar);
    }

    public Object j(TemporalAccessor temporalAccessor) {
        switch (this.f5179a) {
            case 1:
                return (ZoneId) temporalAccessor.a(s.f5180a);
            case k.FLOAT_FIELD_NUMBER:
                return (l) temporalAccessor.a(s.f5181b);
            case k.INTEGER_FIELD_NUMBER:
                return (u) temporalAccessor.a(s.f5182c);
            case k.LONG_FIELD_NUMBER:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.f(aVar)) {
                    return ZoneOffset.c0(temporalAccessor.i(aVar));
                }
                return null;
            case k.STRING_FIELD_NUMBER:
                ZoneId zoneId = (ZoneId) temporalAccessor.a(s.f5180a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.a(s.f5183d);
            case k.STRING_SET_FIELD_NUMBER:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.f(aVar2)) {
                    return h.i0(temporalAccessor.g(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.f(aVar3)) {
                    return j$.time.l.d0(temporalAccessor.g(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5179a) {
            case 1:
                return "ZoneId";
            case k.FLOAT_FIELD_NUMBER:
                return "Chronology";
            case k.INTEGER_FIELD_NUMBER:
                return "Precision";
            case k.LONG_FIELD_NUMBER:
                return "ZoneOffset";
            case k.STRING_FIELD_NUMBER:
                return "Zone";
            case k.STRING_SET_FIELD_NUMBER:
                return "LocalDate";
            case k.DOUBLE_FIELD_NUMBER:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
