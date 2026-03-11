package p0;

import A0.a;
import android.content.Context;
import android.net.ConnectivityManager;
import b2.h;
import java.net.MalformedURLException;
import java.net.URL;
import q0.C0396a;
import q0.b;
import q0.c;
import q0.e;
import q0.f;
import q0.i;
import q0.j;
import q0.k;
import q0.l;
import q0.n;
import q0.o;
import q0.q;
import q0.r;
import q0.s;
import q0.v;
import s0.g;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final h f4178a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f4179b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4180c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f4181d = b(C0360a.f4166c);

    /* renamed from: e  reason: collision with root package name */
    public final a f4182e;

    /* renamed from: f  reason: collision with root package name */
    public final a f4183f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4184g;

    public d(Context context, a aVar, a aVar2) {
        g1.d dVar = new g1.d();
        c cVar = c.f4323a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f4336a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        q0.d dVar2 = q0.d.f4325a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        b bVar = b.f4310a;
        dVar.a(C0396a.class, bVar);
        dVar.a(q0.h.class, bVar);
        e eVar = e.f4328a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        q0.g gVar = q0.g.f4344a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f2990d = true;
        this.f4178a = new h(4, dVar);
        this.f4180c = context;
        this.f4179b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4182e = aVar2;
        this.f4183f = aVar;
        this.f4184g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(A2.h.g("Invalid url: ", str), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (((q0.t) q0.t.f4379f.get(r0)) != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r0.h a(r0.h r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f4179b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            T1.d r7 = r7.c()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r2 = r7.f1708f
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x011c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r7.h(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r7.h(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r7.h(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r7.h(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r7.h(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r7.h(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r7.h(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.lang.Object r4 = r7.f1708f
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x0116
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x007a
            android.util.SparseArray r2 = q0.u.f4381f
            r2 = r1
            goto L_0x007e
        L_0x007a:
            int r2 = r0.getType()
        L_0x007e:
            java.lang.Object r4 = r7.f1708f
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x0110
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x0094
            android.util.SparseArray r0 = q0.t.f4379f
        L_0x0092:
            r0 = r2
            goto L_0x00a9
        L_0x0094:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x009f
            android.util.SparseArray r0 = q0.t.f4379f
            r0 = 100
            goto L_0x00a9
        L_0x009f:
            android.util.SparseArray r4 = q0.t.f4379f
            java.lang.Object r4 = r4.get(r0)
            q0.t r4 = (q0.t) r4
            if (r4 == 0) goto L_0x0092
        L_0x00a9:
            java.lang.Object r4 = r7.f1708f
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x010a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.h(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.h(r3, r0)
            android.content.Context r0 = r6.f4180c
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getSimOperator()
            java.lang.String r4 = "mcc_mnc"
            r7.h(r4, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f4 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00f4 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00f4 }
            goto L_0x00fc
        L_0x00f4:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            a.C0094a.q(r2, r3, r0)
        L_0x00fc:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r7.h(r1, r0)
            r0.h r7 = r7.j()
            return r7
        L_0x010a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0110:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0116:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x011c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.d.a(r0.h):r0.h");
    }
}
