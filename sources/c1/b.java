package C1;

import E1.c;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import w1.r;

public final class b extends r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f176c = new a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final a f177d = new a(1);

    /* renamed from: e  reason: collision with root package name */
    public static final a f178e = new a(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f179a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f180b;

    public b(int i3) {
        this.f179a = i3;
        switch (i3) {
            case 1:
                this.f180b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f180b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    public final Object a(E1.b bVar) {
        switch (this.f179a) {
            case 0:
                synchronized (this) {
                    if (bVar.w() == 9) {
                        bVar.s();
                        return null;
                    }
                    try {
                        Date date = new Date(((SimpleDateFormat) this.f180b).parse(bVar.u()).getTime());
                        return date;
                    } catch (ParseException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            case 1:
                synchronized (this) {
                    if (bVar.w() == 9) {
                        bVar.s();
                        return null;
                    }
                    try {
                        Time time = new Time(((SimpleDateFormat) this.f180b).parse(bVar.u()).getTime());
                        return time;
                    } catch (ParseException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            default:
                java.util.Date date2 = (java.util.Date) ((r) this.f180b).a(bVar);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    public final void b(c cVar, Object obj) {
        String str;
        String str2;
        switch (this.f179a) {
            case 0:
                Date date = (Date) obj;
                synchronized (this) {
                    if (date == null) {
                        str = null;
                    } else {
                        str = ((SimpleDateFormat) this.f180b).format(date);
                    }
                    cVar.p(str);
                }
                return;
            case 1:
                Time time = (Time) obj;
                synchronized (this) {
                    if (time == null) {
                        str2 = null;
                    } else {
                        str2 = ((SimpleDateFormat) this.f180b).format(time);
                    }
                    cVar.p(str2);
                }
                return;
            default:
                ((r) this.f180b).b(cVar, (Timestamp) obj);
                return;
        }
    }

    public b(r rVar) {
        this.f179a = 2;
        this.f180b = rVar;
    }
}
