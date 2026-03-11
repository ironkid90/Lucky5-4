package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.l;
import j$.time.chrono.s;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.a;
import j$.time.temporal.r;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

final class q {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f5102a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5103b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5104c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f5105d;

    q(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f5105d = arrayList;
        this.f5102a = dateTimeFormatter;
        arrayList.add(new x());
    }

    /* access modifiers changed from: package-private */
    public final q c() {
        q qVar = new q(this.f5102a);
        qVar.f5103b = this.f5103b;
        qVar.f5104c = this.f5104c;
        return qVar;
    }

    /* access modifiers changed from: package-private */
    public final Locale h() {
        return this.f5102a.c();
    }

    /* access modifiers changed from: package-private */
    public final w f() {
        return this.f5102a.b();
    }

    /* access modifiers changed from: package-private */
    public final l g() {
        l lVar = d().f5118c;
        if (lVar != null) {
            return lVar;
        }
        l a2 = this.f5102a.a();
        return a2 == null ? s.f5038d : a2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(char c3, char c4) {
        if (this.f5103b) {
            return c3 == c4;
        }
        return b(c3, c4);
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f5103b;
    }

    /* access modifiers changed from: package-private */
    public final void l(boolean z3) {
        this.f5103b = z3;
    }

    /* access modifiers changed from: package-private */
    public final boolean r(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5) {
        if (i3 + i5 > charSequence.length() || i4 + i5 > charSequence2.length()) {
            return false;
        }
        if (this.f5103b) {
            for (int i6 = 0; i6 < i5; i6++) {
                if (charSequence.charAt(i3 + i6) != charSequence2.charAt(i4 + i6)) {
                    return false;
                }
            }
            return true;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            char charAt = charSequence.charAt(i3 + i7);
            char charAt2 = charSequence2.charAt(i4 + i7);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    static boolean b(char c3, char c4) {
        return c3 == c4 || Character.toUpperCase(c3) == Character.toUpperCase(c4) || Character.toLowerCase(c3) == Character.toLowerCase(c4);
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f5104c;
    }

    /* access modifiers changed from: package-private */
    public final void p(boolean z3) {
        this.f5104c = z3;
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        ArrayList arrayList = this.f5105d;
        x d3 = d();
        d3.getClass();
        x xVar = new x();
        xVar.f5116a.putAll(d3.f5116a);
        xVar.f5117b = d3.f5117b;
        xVar.f5118c = d3.f5118c;
        xVar.f5119d = d3.f5119d;
        arrayList.add(xVar);
    }

    /* access modifiers changed from: package-private */
    public final void e(boolean z3) {
        ArrayList arrayList = this.f5105d;
        if (z3) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private x d() {
        ArrayList arrayList = this.f5105d;
        return (x) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final TemporalAccessor s(y yVar) {
        x d3 = d();
        d3.f5118c = g();
        ZoneId zoneId = d3.f5117b;
        if (zoneId == null) {
            this.f5102a.getClass();
            zoneId = null;
        }
        d3.f5117b = zoneId;
        d3.r(yVar);
        return d3;
    }

    /* access modifiers changed from: package-private */
    public final Long i(a aVar) {
        return (Long) d().f5116a.get(aVar);
    }

    /* access modifiers changed from: package-private */
    public final int n(r rVar, long j3, int i3, int i4) {
        Objects.requireNonNull(rVar, "field");
        Long l3 = (Long) d().f5116a.put(rVar, Long.valueOf(j3));
        return (l3 == null || l3.longValue() == j3) ? i4 : ~i3;
    }

    /* access modifiers changed from: package-private */
    public final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f5117b = zoneId;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        d().f5119d = true;
    }

    public final String toString() {
        return d().toString();
    }
}
