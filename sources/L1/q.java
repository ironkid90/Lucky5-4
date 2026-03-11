package L1;

import C0.l;
import L.k;
import Y1.a;
import Y1.b;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import b2.f;
import c2.m;
import c2.o;
import c2.p;
import c2.x;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class q implements b, o {

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f987h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f988i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f989j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f990k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static int f991l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static String f992m;

    /* renamed from: n  reason: collision with root package name */
    public static int f993n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static int f994o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static int f995p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static j f996q;

    /* renamed from: f  reason: collision with root package name */
    public Context f997f;

    /* renamed from: g  reason: collision with root package name */
    public c2.q f998g;

    public static void a(q qVar, f fVar) {
        qVar.getClass();
        try {
            if (a.a(fVar.f936d)) {
                Log.d("Sqflite", fVar.h() + "closing database ");
            }
            fVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + f995p);
        }
        synchronized (f989j) {
            try {
                if (f988i.isEmpty() && f996q != null) {
                    if (a.a(fVar.f936d)) {
                        Log.d("Sqflite", fVar.h() + "stopping thread");
                    }
                    f996q.e();
                    f996q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f b(m mVar, f fVar) {
        Integer num = (Integer) mVar.a("id");
        int intValue = num.intValue();
        f fVar2 = (f) f988i.get(num);
        if (fVar2 != null) {
            return fVar2;
        }
        fVar.a("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    public static HashMap c(int i3, boolean z3, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i3));
        if (z3) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z4) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    public final void onAttachedToEngine(a aVar) {
        this.f997f = aVar.f1964a;
        x xVar = x.f2798a;
        c2.f fVar = aVar.f1965b;
        c2.q qVar = new c2.q(fVar, "com.tekartik.sqflite", xVar, fVar.h());
        this.f998g = qVar;
        qVar.b(this);
    }

    public final void onDetachedFromEngine(a aVar) {
        this.f997f = null;
        this.f998g.b((o) null);
        this.f998g = null;
    }

    /* JADX WARNING: type inference failed for: r5v19, types: [L1.l, java.lang.Object] */
    public final void onMethodCall(m mVar, p pVar) {
        f fVar;
        String str;
        boolean z3;
        boolean z4;
        int i3;
        k kVar;
        f fVar2;
        String str2;
        m mVar2 = mVar;
        String str3 = mVar2.f2785a;
        str3.getClass();
        boolean z5 = false;
        char c3 = 65535;
        switch (str3.hashCode()) {
            case -1319569547:
                if (str3.equals("execute")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str3.equals("closeDatabase")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str3.equals("options")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str3.equals("insert")) {
                    c3 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str3.equals("update")) {
                    c3 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str3.equals("androidSetLocale")) {
                    c3 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str3.equals("deleteDatabase")) {
                    c3 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str3.equals("debugMode")) {
                    c3 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str3.equals("openDatabase")) {
                    c3 = 8;
                    break;
                }
                break;
            case 93509434:
                if (str3.equals("batch")) {
                    c3 = 9;
                    break;
                }
                break;
            case 95458899:
                if (str3.equals("debug")) {
                    c3 = 10;
                    break;
                }
                break;
            case 107944136:
                if (str3.equals("query")) {
                    c3 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str3.equals("databaseExists")) {
                    c3 = 12;
                    break;
                }
                break;
            case 1193546321:
                if (str3.equals("queryCursorNext")) {
                    c3 = 13;
                    break;
                }
                break;
            case 1385449135:
                if (str3.equals("getPlatformVersion")) {
                    c3 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str3.equals("getDatabasesPath")) {
                    c3 = 15;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                f fVar3 = (f) pVar;
                f b3 = b(mVar2, fVar3);
                if (b3 != null) {
                    f996q.d(b3, new n(mVar2, fVar3, b3, 4));
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) mVar2.a("id");
                int intValue = num.intValue();
                f fVar4 = (f) pVar;
                f b4 = b(mVar2, fVar4);
                if (b4 != null) {
                    if (a.a(b4.f936d)) {
                        Log.d("Sqflite", b4.h() + "closing " + intValue + " " + b4.f934b);
                    }
                    String str4 = b4.f934b;
                    synchronized (f989j) {
                        try {
                            f988i.remove(num);
                            if (b4.f933a) {
                                f987h.remove(str4);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    f996q.d(b4, new l(this, b4, fVar4));
                    return;
                }
                return;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                Object a2 = mVar2.a("androidThreadPriority");
                if (a2 != null) {
                    f993n = ((Integer) a2).intValue();
                }
                Object a3 = mVar2.a("androidThreadCount");
                if (a3 != null && !a3.equals(Integer.valueOf(f994o))) {
                    f994o = ((Integer) a3).intValue();
                    j jVar = f996q;
                    if (jVar != null) {
                        jVar.e();
                        f996q = null;
                    }
                }
                Integer num2 = (Integer) mVar2.a("logLevel");
                if (num2 != null) {
                    f991l = num2.intValue();
                }
                ((f) pVar).b((Object) null);
                return;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                f fVar5 = (f) pVar;
                f b5 = b(mVar2, fVar5);
                if (b5 != null) {
                    f996q.d(b5, new n(mVar2, fVar5, b5, 1));
                    return;
                }
                return;
            case k.LONG_FIELD_NUMBER /*4*/:
                f fVar6 = (f) pVar;
                f b6 = b(mVar2, fVar6);
                if (b6 != null) {
                    f996q.d(b6, new n(mVar2, fVar6, b6, 5));
                    return;
                }
                return;
            case k.STRING_FIELD_NUMBER /*5*/:
                f fVar7 = (f) pVar;
                f b7 = b(mVar2, fVar7);
                if (b7 != null) {
                    f996q.d(b7, new n(mVar2, b7, fVar7));
                    return;
                }
                return;
            case k.STRING_SET_FIELD_NUMBER:
                String str5 = (String) mVar2.a("path");
                synchronized (f989j) {
                    try {
                        if (a.b(f991l)) {
                            Log.d("Sqflite", "Look for " + str5 + " in " + f987h.keySet());
                        }
                        HashMap hashMap = f987h;
                        Integer num3 = (Integer) hashMap.get(str5);
                        if (num3 != null) {
                            HashMap hashMap2 = f988i;
                            f fVar8 = (f) hashMap2.get(num3);
                            if (fVar8 != null && fVar8.f941i.isOpen()) {
                                if (a.b(f991l)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar8.h());
                                    sb.append("found single instance ");
                                    if (fVar8.j()) {
                                        str = "(in transaction) ";
                                    } else {
                                        str = "";
                                    }
                                    sb.append(str);
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str5);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str5);
                                fVar = fVar8;
                            }
                        }
                        fVar = null;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                p pVar2 = new p(this, fVar, str5, (f) pVar, 0);
                j jVar2 = f996q;
                if (jVar2 != null) {
                    jVar2.d(fVar, pVar2);
                    return;
                } else {
                    pVar2.run();
                    return;
                }
            case k.DOUBLE_FIELD_NUMBER:
                boolean equals = Boolean.TRUE.equals(mVar2.f2786b);
                if (!equals) {
                    f991l = 0;
                } else if (equals) {
                    f991l = 1;
                }
                ((f) pVar).b((Object) null);
                return;
            case k.BYTES_FIELD_NUMBER:
                String str6 = (String) mVar2.a("path");
                Boolean bool = (Boolean) mVar2.a("readOnly");
                if (str6 == null || str6.equals(":memory:")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Boolean.FALSE.equals(mVar2.a("singleInstance")) || z3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    synchronized (f989j) {
                        try {
                            if (a.b(f991l)) {
                                Log.d("Sqflite", "Look for " + str6 + " in " + f987h.keySet());
                            }
                            Integer num4 = (Integer) f987h.get(str6);
                            if (!(num4 == null || (fVar2 = (f) f988i.get(num4)) == null)) {
                                if (!fVar2.f941i.isOpen()) {
                                    if (a.b(f991l)) {
                                        Log.d("Sqflite", fVar2.h() + "single instance database of " + str6 + " not opened");
                                        break;
                                    }
                                } else {
                                    if (a.b(f991l)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(fVar2.h());
                                        sb2.append("re-opened single instance ");
                                        if (fVar2.j()) {
                                            str2 = "(in transaction) ";
                                        } else {
                                            str2 = "";
                                        }
                                        sb2.append(str2);
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str6);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((f) pVar).b(c(num4.intValue(), true, fVar2.j()));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                Object obj = f989j;
                synchronized (obj) {
                    i3 = f995p + 1;
                    f995p = i3;
                }
                f fVar9 = new f(this.f997f, str6, i3, z4, f991l);
                synchronized (obj) {
                    try {
                        if (f996q == null) {
                            int i4 = f994o;
                            int i5 = f993n;
                            if (i4 == 1) {
                                ? obj2 = new Object();
                                obj2.f964a = i5;
                                kVar = obj2;
                            } else {
                                kVar = new k(i4, i5);
                            }
                            f996q = kVar;
                            kVar.b();
                            if (a.a(fVar9.f936d)) {
                                Log.d("Sqflite", fVar9.h() + "starting worker pool with priority " + f993n);
                            }
                        }
                        fVar9.f940h = f996q;
                        if (a.a(fVar9.f936d)) {
                            Log.d("Sqflite", fVar9.h() + "opened " + i3 + " " + str6);
                        }
                        j jVar3 = f996q;
                        String str7 = str6;
                        f fVar10 = fVar9;
                        o oVar = r8;
                        o oVar2 = new o(z3, str7, (f) pVar, bool, fVar10, mVar, z4, i3);
                        jVar3.d(fVar10, oVar);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 9:
                f fVar11 = (f) pVar;
                f b8 = b(mVar2, fVar11);
                if (b8 != null) {
                    f996q.d(b8, new n(b8, mVar2, fVar11));
                    return;
                }
                return;
            case 10:
                HashMap hashMap3 = new HashMap();
                if ("get".equals((String) mVar2.a("cmd"))) {
                    int i6 = f991l;
                    if (i6 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i6));
                    }
                    HashMap hashMap4 = f988i;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            f fVar12 = (f) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", fVar12.f934b);
                            hashMap6.put("singleInstance", Boolean.valueOf(fVar12.f933a));
                            int i7 = fVar12.f936d;
                            if (i7 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i7));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                ((f) pVar).b(hashMap3);
                return;
            case 11:
                f fVar13 = (f) pVar;
                f b9 = b(mVar2, fVar13);
                if (b9 != null) {
                    f996q.d(b9, new n(mVar2, fVar13, b9, 2));
                    return;
                }
                return;
            case 12:
                try {
                    z5 = new File((String) mVar2.a("path")).exists();
                } catch (Exception unused) {
                }
                ((f) pVar).b(Boolean.valueOf(z5));
                return;
            case 13:
                f fVar14 = (f) pVar;
                f b10 = b(mVar2, fVar14);
                if (b10 != null) {
                    f996q.d(b10, new n(mVar2, fVar14, b10, 0));
                    return;
                }
                return;
            case 14:
                ((f) pVar).b("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                if (f992m == null) {
                    f992m = this.f997f.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((f) pVar).b(f992m);
                return;
            default:
                ((f) pVar).c();
                return;
        }
    }
}
