package d2;

import A.C0011l;
import A2.h;
import F0.v;
import S1.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import i.C0204f;
import i.C0207i;
import i.C0208j;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.platform.k;
import j.J;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import r.C0408a;
import s1.C0464y;
import t0.C0477b;
import y1.m;

/* renamed from: d2.a  reason: case insensitive filesystem */
public final class C0152a implements J, C0477b, m {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2911f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2912g;

    public /* synthetic */ C0152a(int i3, Object obj) {
        this.f2911f = i3;
        this.f2912g = obj;
    }

    public static String c(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public static boolean f(int i3) {
        if ((48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: i.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(i.C0207i r10, i.C0208j r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2912g
            i.f r0 = (i.C0204f) r0
            android.os.Handler r1 = r0.f3129k
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f3131m
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            i.e r6 = (i.C0203e) r6
            i.i r6 = r6.f3118b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = r5
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            i.e r2 = (i.C0203e) r2
        L_0x0035:
            r5 = r2
            L1.p r1 = new L1.p
            r8 = 1
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r11 = r0.f3129k
            r11.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0152a.a(i.i, i.j):void");
    }

    public void b(C0207i iVar, C0208j jVar) {
        ((C0204f) this.f2912g).f3129k.removeCallbacksAndMessages(iVar);
    }

    public void d(int i3) {
        h.j(((k) this.f2912g).f3389l.get(i3));
        Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
    }

    public String e(String str, String str2) {
        b bVar = (b) this.f2912g;
        Context context = bVar.f2914b;
        if (str2 != null) {
            Locale a2 = b.a(str2);
            Configuration configuration = new Configuration(bVar.f2914b.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = bVar.f2914b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", bVar.f2914b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void g(int i3, b2.k kVar) {
        b2.m mVar;
        j jVar = (j) this.f2912g;
        jVar.c();
        jVar.f3361f = kVar;
        jVar.f3360e = new C0011l(2, i3);
        jVar.f3363h.e(jVar);
        C0464y yVar = kVar.f2758j;
        if (yVar != null) {
            mVar = (b2.m) yVar.f4624h;
        } else {
            mVar = null;
        }
        jVar.f3363h = new g(mVar, jVar.f3356a);
        jVar.d(kVar);
        jVar.f3364i = true;
        if (jVar.f3360e.f55b == 3) {
            jVar.f3371p = false;
        }
        jVar.f3368m = null;
        jVar.f3363h.a(jVar);
    }

    public Object get() {
        switch (this.f2911f) {
            case 10:
                return this.f2912g;
            default:
                return new y0.k(Integer.valueOf(y0.k.f4831i).intValue(), (Context) ((C0152a) this.f2912g).f2912g, "com.google.android.datatransport.events");
        }
    }

    public void h(double d3, double d4, double[] dArr) {
        boolean z3;
        double d5 = d3;
        double d6 = d4;
        double[] dArr2 = dArr;
        j jVar = (j) this.f2912g;
        jVar.getClass();
        double[] dArr3 = new double[4];
        if (dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        double d7 = dArr2[12];
        double d8 = dArr2[15];
        double d9 = d7 / d8;
        dArr3[1] = d9;
        dArr3[0] = d9;
        double d10 = dArr2[13] / d8;
        dArr3[3] = d10;
        dArr3[2] = d10;
        v vVar = new v(z3, dArr2, dArr3);
        vVar.b(d5, 0.0d);
        vVar.b(d5, d6);
        vVar.b(0.0d, d6);
        double d11 = (double) jVar.f3356a.getContext().getResources().getDisplayMetrics().density;
        jVar.f3368m = new Rect((int) (dArr3[0] * d11), (int) (dArr3[2] * d11), (int) Math.ceil(dArr3[1] * d11), (int) Math.ceil(dArr3[3] * d11));
    }

    public void i(b2.m mVar) {
        b2.m mVar2;
        int i3;
        int i4;
        j jVar = (j) this.f2912g;
        o oVar = jVar.f3356a;
        if (!jVar.f3364i && (mVar2 = jVar.f3370o) != null && (i3 = mVar2.f2768d) >= 0 && (i4 = mVar2.f2769e) > i3) {
            int i5 = i4 - i3;
            int i6 = mVar.f2769e;
            int i7 = mVar.f2768d;
            boolean z3 = true;
            if (i5 == i6 - i7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= i5) {
                        z3 = false;
                        break;
                    } else if (mVar2.f2765a.charAt(i8 + i3) != mVar.f2765a.charAt(i8 + i7)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            jVar.f3364i = z3;
        }
        jVar.f3370o = mVar;
        jVar.f3363h.f(mVar);
        if (jVar.f3364i) {
            jVar.f3357b.restartInput(oVar);
            jVar.f3364i = false;
        }
    }

    public Object r() {
        Type type = (Type) this.f2912g;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    public C0152a() {
        this.f2911f = 5;
        this.f2912g = new HashMap();
    }

    public C0152a(Context context) {
        boolean isEmpty;
        this.f2911f = 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f2912g = sharedPreferences;
        File file = new File(C0408a.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
                }
            }
        }
    }
}
