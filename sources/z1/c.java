package z1;

import C1.a;
import E1.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import w1.r;
import y1.g;

public final class c extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4887b = new a(4);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4888a;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f4888a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (g.f4851a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    public final Object a(b bVar) {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        String u3 = bVar.u();
        synchronized (this) {
            Iterator it = this.f4888a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(u3);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                Date b3 = A1.a.b(u3, new ParsePosition(0));
                return b3;
            } catch (ParseException e2) {
                throw new RuntimeException(u3, e2);
            }
        }
    }

    public final void b(E1.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.j();
            } else {
                cVar.p(((DateFormat) this.f4888a.get(0)).format(date));
            }
        }
    }
}
