package j$.time.format;

import j$.time.chrono.l;
import j$.time.chrono.s;
import j$.time.i;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.j;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: f  reason: collision with root package name */
    public static final DateTimeFormatter f5056f;

    /* renamed from: a  reason: collision with root package name */
    private final e f5057a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f5058b;

    /* renamed from: c  reason: collision with root package name */
    private final w f5059c;

    /* renamed from: d  reason: collision with root package name */
    private final y f5060d;

    /* renamed from: e  reason: collision with root package name */
    private final s f5061e;

    static {
        p pVar = new p();
        a aVar = a.YEAR;
        z zVar = z.EXCEEDS_PAD;
        pVar.l(aVar, 4, 10, zVar);
        pVar.e('-');
        a aVar2 = a.MONTH_OF_YEAR;
        pVar.k(aVar2, 2);
        pVar.e('-');
        a aVar3 = a.DAY_OF_MONTH;
        pVar.k(aVar3, 2);
        y yVar = y.STRICT;
        s sVar = s.f5038d;
        DateTimeFormatter u3 = pVar.u(yVar, sVar);
        ISO_LOCAL_DATE = u3;
        p pVar2 = new p();
        pVar2.p();
        pVar2.a(u3);
        pVar2.h();
        pVar2.u(yVar, sVar);
        p pVar3 = new p();
        pVar3.p();
        pVar3.a(u3);
        pVar3.o();
        pVar3.h();
        pVar3.u(yVar, sVar);
        p pVar4 = new p();
        a aVar4 = a.HOUR_OF_DAY;
        pVar4.k(aVar4, 2);
        pVar4.e(':');
        a aVar5 = a.MINUTE_OF_HOUR;
        pVar4.k(aVar5, 2);
        pVar4.o();
        pVar4.e(':');
        a aVar6 = a.SECOND_OF_MINUTE;
        pVar4.k(aVar6, 2);
        pVar4.o();
        pVar4.b(a.NANO_OF_SECOND);
        DateTimeFormatter u4 = pVar4.u(yVar, (s) null);
        p pVar5 = new p();
        pVar5.p();
        pVar5.a(u4);
        pVar5.h();
        pVar5.u(yVar, (s) null);
        p pVar6 = new p();
        pVar6.p();
        pVar6.a(u4);
        pVar6.o();
        pVar6.h();
        pVar6.u(yVar, (s) null);
        p pVar7 = new p();
        pVar7.p();
        pVar7.a(u3);
        pVar7.e('T');
        pVar7.a(u4);
        DateTimeFormatter u5 = pVar7.u(yVar, sVar);
        ISO_LOCAL_DATE_TIME = u5;
        p pVar8 = new p();
        pVar8.p();
        pVar8.a(u5);
        pVar8.r();
        pVar8.h();
        pVar8.s();
        DateTimeFormatter u6 = pVar8.u(yVar, sVar);
        p pVar9 = new p();
        pVar9.a(u6);
        pVar9.o();
        pVar9.e('[');
        pVar9.q();
        pVar9.m();
        pVar9.e(']');
        pVar9.u(yVar, sVar);
        p pVar10 = new p();
        pVar10.a(u5);
        pVar10.o();
        pVar10.h();
        pVar10.o();
        pVar10.e('[');
        pVar10.q();
        pVar10.m();
        pVar10.e(']');
        pVar10.u(yVar, sVar);
        p pVar11 = new p();
        pVar11.p();
        pVar11.l(aVar, 4, 10, zVar);
        pVar11.e('-');
        pVar11.k(a.DAY_OF_YEAR, 3);
        pVar11.o();
        pVar11.h();
        pVar11.u(yVar, sVar);
        p pVar12 = new p();
        pVar12.p();
        pVar12.l(j.f5171c, 4, 10, zVar);
        pVar12.f("-W");
        pVar12.k(j.f5170b, 2);
        pVar12.e('-');
        a aVar7 = a.DAY_OF_WEEK;
        pVar12.k(aVar7, 1);
        pVar12.o();
        pVar12.h();
        pVar12.u(yVar, sVar);
        p pVar13 = new p();
        pVar13.p();
        pVar13.c();
        f5056f = pVar13.u(yVar, (s) null);
        p pVar14 = new p();
        pVar14.p();
        pVar14.k(aVar, 4);
        pVar14.k(aVar2, 2);
        pVar14.k(aVar3, 2);
        pVar14.o();
        pVar14.r();
        pVar14.g("+HHMMss", "Z");
        pVar14.s();
        pVar14.u(yVar, sVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        s sVar2 = sVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        p pVar15 = new p();
        pVar15.p();
        pVar15.r();
        pVar15.o();
        pVar15.i(aVar7, hashMap);
        pVar15.f(", ");
        pVar15.n();
        pVar15.l(aVar3, 1, 2, z.NOT_NEGATIVE);
        pVar15.e(' ');
        pVar15.i(aVar2, hashMap2);
        pVar15.e(' ');
        pVar15.k(aVar, 4);
        pVar15.e(' ');
        pVar15.k(aVar4, 2);
        pVar15.e(':');
        pVar15.k(aVar5, 2);
        pVar15.o();
        pVar15.e(':');
        pVar15.k(aVar6, 2);
        pVar15.n();
        pVar15.e(' ');
        pVar15.g("+HHMM", "GMT");
        pVar15.u(y.SMART, sVar2);
    }

    DateTimeFormatter(e eVar, Locale locale, y yVar, s sVar) {
        w wVar = w.f5115a;
        this.f5057a = eVar;
        Objects.requireNonNull(locale, "locale");
        this.f5058b = locale;
        this.f5059c = wVar;
        Objects.requireNonNull(yVar, "resolverStyle");
        this.f5060d = yVar;
        this.f5061e = sVar;
    }

    public final Locale c() {
        return this.f5058b;
    }

    public final w b() {
        return this.f5059c;
    }

    public final l a() {
        return this.f5061e;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f5057a.p(new t(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final Object d(CharSequence charSequence, i iVar) {
        String str;
        Objects.requireNonNull(charSequence, "text");
        try {
            return ((x) e(charSequence)).a(iVar);
        } catch (r e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException("Text '" + str + "' could not be parsed: " + e3.getMessage(), e3);
            charSequence.toString();
            throw runtimeException;
        }
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        q qVar = new q(this);
        int r3 = this.f5057a.r(qVar, charSequence, parsePosition.getIndex());
        if (r3 < 0) {
            parsePosition.setErrorIndex(~r3);
            qVar = null;
        } else {
            parsePosition.setIndex(r3);
        }
        if (qVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return qVar.s(this.f5060d);
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str2 = "Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new r(str2, charSequence);
        }
        String str3 = "Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new r(str3, charSequence);
    }

    /* access modifiers changed from: package-private */
    public final e f() {
        return this.f5057a.a();
    }

    public final String toString() {
        String eVar = this.f5057a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }
}
