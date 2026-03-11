package P2;

import N2.a;
import N2.w;
import java.util.concurrent.TimeUnit;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1272a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f1273b = a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1274c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f1275d = a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final long f1276e = TimeUnit.SECONDS.toNanos(a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static final f f1277f = f.f1266a;

    /* renamed from: g  reason: collision with root package name */
    public static final i f1278g = new i(0);

    /* renamed from: h  reason: collision with root package name */
    public static final i f1279h = new i(1);

    static {
        String str;
        int i3 = w.f1223a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1272a = str;
        int i4 = w.f1223a;
        if (i4 < 2) {
            i4 = 2;
        }
        f1274c = a.k("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
    }
}
