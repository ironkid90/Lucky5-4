package j$.time.format;

import j$.time.chrono.s;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public final class p {

    /* renamed from: f  reason: collision with root package name */
    private static final C0537a f5096f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private p f5097a;

    /* renamed from: b  reason: collision with root package name */
    private final p f5098b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f5099c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5100d;

    /* renamed from: e  reason: collision with root package name */
    private int f5101e;

    /* JADX WARNING: type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', a.ERA);
        hashMap.put('y', a.YEAR_OF_ERA);
        hashMap.put('u', a.YEAR);
        r rVar = j.f5169a;
        hashMap.put('Q', rVar);
        hashMap.put('q', rVar);
        a aVar = a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', a.DAY_OF_YEAR);
        hashMap.put('d', a.DAY_OF_MONTH);
        hashMap.put('F', a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        a aVar2 = a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', a.AMPM_OF_DAY);
        hashMap.put('H', a.HOUR_OF_DAY);
        hashMap.put('k', a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', a.HOUR_OF_AMPM);
        hashMap.put('h', a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', a.MINUTE_OF_HOUR);
        hashMap.put('s', a.SECOND_OF_MINUTE);
        a aVar3 = a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', a.NANO_OF_DAY);
        hashMap.put('g', l.f5176a);
    }

    public p() {
        this.f5097a = this;
        this.f5099c = new ArrayList();
        this.f5101e = -1;
        this.f5098b = null;
        this.f5100d = false;
    }

    private p(p pVar) {
        this.f5097a = this;
        this.f5099c = new ArrayList();
        this.f5101e = -1;
        this.f5098b = pVar;
        this.f5100d = true;
    }

    public final void q() {
        d(m.SENSITIVE);
    }

    public final void p() {
        d(m.INSENSITIVE);
    }

    public final void s() {
        d(m.STRICT);
    }

    public final void r() {
        d(m.LENIENT);
    }

    public final void k(r rVar, int i3) {
        Objects.requireNonNull(rVar, "field");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i3);
        }
        j(new i(rVar, i3, i3, z.NOT_NEGATIVE));
    }

    public final void l(r rVar, int i3, int i4, z zVar) {
        if (i3 == i4 && zVar == z.NOT_NEGATIVE) {
            k(rVar, i4);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(zVar, "signStyle");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i4);
        } else if (i4 >= i3) {
            j(new i(rVar, i3, i4, zVar));
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i4 + " < " + i3);
        }
    }

    private void j(i iVar) {
        i iVar2;
        p pVar = this.f5097a;
        int i3 = pVar.f5101e;
        if (i3 >= 0) {
            i iVar3 = (i) pVar.f5099c.get(i3);
            int i4 = iVar.f5072b;
            int i5 = iVar.f5073c;
            if (i4 == i5 && iVar.f5074d == z.NOT_NEGATIVE) {
                iVar2 = iVar3.d(i5);
                d(iVar.c());
                this.f5097a.f5101e = i3;
            } else {
                iVar2 = iVar3.c();
                this.f5097a.f5101e = d(iVar);
            }
            this.f5097a.f5099c.set(i3, iVar2);
            return;
        }
        pVar.f5101e = d(iVar);
    }

    public final void b(a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.C().g()) {
            d(gVar);
            return;
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
    }

    public final void i(a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        A a2 = A.FULL;
        d(new o(aVar, a2, new b(new v(Collections.singletonMap(a2, linkedHashMap)))));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j$.time.format.f, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void h() {
        d(j.f5077e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new n(f5096f, 1));
    }

    public final void e(char c3) {
        d(new d(c3));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(str, 0));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void o() {
        p pVar = this.f5097a;
        pVar.f5101e = -1;
        this.f5097a = new p(pVar);
    }

    public final void n() {
        p pVar = this.f5097a;
        if (pVar.f5098b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (pVar.f5099c.size() > 0) {
            p pVar2 = this.f5097a;
            e eVar = new e(pVar2.f5099c, pVar2.f5100d);
            this.f5097a = this.f5097a.f5098b;
            d(eVar);
        } else {
            this.f5097a = this.f5097a.f5098b;
        }
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.f5097a;
        pVar.getClass();
        pVar.f5099c.add(fVar);
        p pVar2 = this.f5097a;
        pVar2.f5101e = -1;
        return pVar2.f5099c.size() - 1;
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), y.SMART, (s) null);
    }

    /* access modifiers changed from: package-private */
    public final DateTimeFormatter u(y yVar, s sVar) {
        return v(Locale.getDefault(), yVar, sVar);
    }

    private DateTimeFormatter v(Locale locale, y yVar, s sVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f5097a.f5098b != null) {
            n();
        }
        e eVar = new e(this.f5099c, false);
        w wVar = w.f5115a;
        return new DateTimeFormatter(eVar, locale, yVar, sVar);
    }
}
