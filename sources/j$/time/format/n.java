package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.temporal.a;
import j$.time.zone.j;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

final class n implements f {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f5088c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f5089d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5090a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5091b;

    public /* synthetic */ n(Object obj, int i3) {
        this.f5090a = i3;
        this.f5091b = obj;
    }

    public final boolean p(t tVar, StringBuilder sb) {
        switch (this.f5090a) {
            case 0:
                sb.append((String) this.f5091b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) tVar.f((C0537a) this.f5091b);
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.s());
                return true;
        }
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        int i4;
        switch (this.f5090a) {
            case 0:
                if (i3 > charSequence.length() || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f5091b;
                if (!qVar.r(charSequence, i3, str, 0, str.length())) {
                    return ~i3;
                }
                return str.length() + i3;
            default:
                int length = charSequence.length();
                if (i3 <= length) {
                    if (i3 != length) {
                        char charAt = charSequence.charAt(i3);
                        if (charAt == '+' || charAt == '-') {
                            return a(qVar, charSequence, i3, i3, j.f5077e);
                        }
                        int i5 = i3 + 2;
                        if (length >= i5) {
                            char charAt2 = charSequence.charAt(i3 + 1);
                            if (qVar.a(charAt, 'U') && qVar.a(charAt2, 'T')) {
                                int i6 = i3 + 3;
                                if (length < i6 || !qVar.a(charSequence.charAt(i5), 'C')) {
                                    return a(qVar, charSequence, i3, i5, j.f5078f);
                                }
                                return a(qVar, charSequence, i3, i6, j.f5078f);
                            } else if (qVar.a(charAt, 'G') && length >= (i4 = i3 + 3) && qVar.a(charAt2, 'M') && qVar.a(charSequence.charAt(i5), 'T')) {
                                int i7 = i3 + 4;
                                if (length < i7 || !qVar.a(charSequence.charAt(i4), '0')) {
                                    return a(qVar, charSequence, i3, i4, j.f5078f);
                                }
                                qVar.m(ZoneId.of("GMT0"));
                                return i7;
                            }
                        }
                        Set a2 = j.a();
                        int size = a2.size();
                        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = qVar.j() ? f5088c : f5089d;
                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                            synchronized (this) {
                                try {
                                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = qVar.j() ? f5088c : f5089d;
                                    if (simpleImmutableEntry2 == null || ((Integer) simpleImmutableEntry2.getKey()).intValue() != size) {
                                        simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(a2, qVar));
                                        if (qVar.j()) {
                                            f5088c = simpleImmutableEntry2;
                                        } else {
                                            f5089d = simpleImmutableEntry2;
                                        }
                                    }
                                } catch (Throwable th) {
                                    while (true) {
                                        throw th;
                                        break;
                                    }
                                }
                            }
                        }
                        ParsePosition parsePosition = new ParsePosition(i3);
                        String c3 = ((l) simpleImmutableEntry.getValue()).c(charSequence, parsePosition);
                        if (c3 != null) {
                            qVar.m(ZoneId.of(c3));
                            return parsePosition.getIndex();
                        } else if (qVar.a(charAt, 'Z')) {
                            qVar.m(ZoneOffset.UTC);
                            return i3 + 1;
                        }
                    }
                    return ~i3;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    private static int a(q qVar, CharSequence charSequence, int i3, int i4, j jVar) {
        String upperCase = charSequence.subSequence(i3, i4).toString().toUpperCase();
        if (i4 >= charSequence.length()) {
            qVar.m(ZoneId.of(upperCase));
            return i4;
        } else if (charSequence.charAt(i4) == '0' || qVar.a(charSequence.charAt(i4), 'Z')) {
            qVar.m(ZoneId.of(upperCase));
            return i4;
        } else {
            q c3 = qVar.c();
            int r3 = jVar.r(c3, charSequence, i4);
            if (r3 < 0) {
                try {
                    if (jVar == j.f5077e) {
                        return ~i3;
                    }
                    qVar.m(ZoneId.of(upperCase));
                    return i4;
                } catch (c unused) {
                    return ~i3;
                }
            } else {
                qVar.m(ZoneId.J(upperCase, ZoneOffset.c0((int) c3.i(a.OFFSET_SECONDS).longValue())));
                return r3;
            }
        }
    }

    public final String toString() {
        switch (this.f5090a) {
            case 0:
                String replace = ((String) this.f5091b).replace("'", "''");
                return "'" + replace + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
