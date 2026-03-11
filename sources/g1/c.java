package g1;

import e1.f;
import e1.g;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f2982a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f2982a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public final void a(Object obj, Object obj2) {
        ((g) obj2).a(f2982a.format((Date) obj));
    }
}
