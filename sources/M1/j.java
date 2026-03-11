package m1;

import android.text.TextUtils;
import j1.e;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n1.C0346b;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final long f4041b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4042c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static j f4043d;

    /* renamed from: a  reason: collision with root package name */
    public final e f4044a;

    public j(e eVar) {
        this.f4044a = eVar;
    }

    public final boolean a(C0346b bVar) {
        if (TextUtils.isEmpty(bVar.f4106c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4044a.getClass();
        if (bVar.f4109f + bVar.f4108e < timeUnit.toSeconds(System.currentTimeMillis()) + f4041b) {
            return true;
        }
        return false;
    }
}
