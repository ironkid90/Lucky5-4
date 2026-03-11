package z1;

import D1.a;
import java.util.Calendar;
import java.util.GregorianCalendar;
import w1.k;
import w1.r;
import w1.s;

public final class j implements s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4903f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f4904g;

    public /* synthetic */ j(r rVar, int i3) {
        this.f4903f = i3;
        this.f4904g = rVar;
    }

    public final r create(k kVar, a aVar) {
        switch (this.f4903f) {
            case 0:
                if (aVar.f220a == Number.class) {
                    return (k) this.f4904g;
                }
                return null;
            default:
                Class<Calendar> cls = Calendar.class;
                Class<GregorianCalendar> cls2 = aVar.f220a;
                if (cls2 == cls || cls2 == GregorianCalendar.class) {
                    return (k) this.f4904g;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f4903f) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((k) this.f4904g) + "]";
            default:
                return super.toString();
        }
    }
}
