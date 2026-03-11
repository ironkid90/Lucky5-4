package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.C0528b;
import j$.time.chrono.l;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.util.Locale;
import java.util.Objects;

final class t {

    /* renamed from: a  reason: collision with root package name */
    private TemporalAccessor f5110a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f5111b;

    /* renamed from: c  reason: collision with root package name */
    private int f5112c;

    t(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        l a2 = dateTimeFormatter.a();
        if (a2 != null) {
            l lVar = (l) temporalAccessor.a(s.a());
            ZoneId zoneId = (ZoneId) temporalAccessor.a(s.g());
            C0528b bVar = null;
            a2 = Objects.equals(a2, lVar) ? null : a2;
            if (a2 != null) {
                l lVar2 = a2 != null ? a2 : lVar;
                if (a2 != null) {
                    if (temporalAccessor.f(a.EPOCH_DAY)) {
                        bVar = lVar2.t(temporalAccessor);
                    } else if (!(a2 == j$.time.chrono.s.f5038d && lVar == null)) {
                        a[] values = a.values();
                        int length = values.length;
                        int i3 = 0;
                        while (i3 < length) {
                            a aVar = values[i3];
                            if (!aVar.T() || !temporalAccessor.f(aVar)) {
                                i3++;
                            } else {
                                throw new RuntimeException("Unable to apply override chronology '" + a2 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new s(bVar, temporalAccessor, lVar2, zoneId);
            }
        }
        this.f5110a = temporalAccessor;
        this.f5111b = dateTimeFormatter;
    }

    /* access modifiers changed from: package-private */
    public final TemporalAccessor d() {
        return this.f5110a;
    }

    /* access modifiers changed from: package-private */
    public final Locale c() {
        return this.f5111b.c();
    }

    /* access modifiers changed from: package-private */
    public final w b() {
        return this.f5111b.b();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f5112c++;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f5112c--;
    }

    /* access modifiers changed from: package-private */
    public final Object f(C0537a aVar) {
        TemporalAccessor temporalAccessor = this.f5110a;
        Object a2 = temporalAccessor.a(aVar);
        if (a2 != null || this.f5112c != 0) {
            return a2;
        }
        throw new RuntimeException("Unable to extract " + aVar + " from temporal " + temporalAccessor);
    }

    /* access modifiers changed from: package-private */
    public final Long e(r rVar) {
        int i3 = this.f5112c;
        TemporalAccessor temporalAccessor = this.f5110a;
        if (i3 <= 0 || temporalAccessor.f(rVar)) {
            return Long.valueOf(temporalAccessor.g(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.f5110a.toString();
    }
}
