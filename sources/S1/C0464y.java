package s1;

import A.C0002c;
import C0.r;
import D0.g;
import M1.d;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import c2.C0133a;
import c2.C0134b;
import c2.C0135c;
import c2.f;
import c2.l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import io.flutter.view.j;
import j1.e;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import o2.a;
import t0.C0477b;
import x0.C0512d;
import x0.k;
import z0.C0524c;

/* renamed from: s1.y  reason: case insensitive filesystem */
public final class C0464y implements d, C0477b {

    /* renamed from: j  reason: collision with root package name */
    public static C0464y f4621j;

    /* renamed from: f  reason: collision with root package name */
    public Object f4622f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4623g;

    /* renamed from: h  reason: collision with root package name */
    public Object f4624h;

    /* renamed from: i  reason: collision with root package name */
    public Object f4625i;

    public C0464y(f fVar, String str, l lVar, e eVar) {
        this.f4623g = fVar;
        this.f4622f = str;
        this.f4624h = lVar;
        this.f4625i = eVar;
    }

    public static synchronized C0464y e() {
        C0464y yVar;
        synchronized (C0464y.class) {
            try {
                if (f4621j == null) {
                    f4621j = new C0464y(0);
                }
                yVar = f4621j;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return yVar;
    }

    public void a(String str, HashMap hashMap) {
        this.f4622f = "sqlite_error";
        this.f4624h = str;
        this.f4625i = hashMap;
    }

    public void b(Serializable serializable) {
        this.f4623g = serializable;
    }

    public SpannableString c() {
        if (((String) this.f4622f) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f4622f);
        ArrayList arrayList = (ArrayList) this.f4623g;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int b3 = L.j.b(jVar.f3553c);
                if (b3 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f3551a, jVar.f3552b, 0);
                } else if (b3 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((h) jVar).f3550d)), jVar.f3551a, jVar.f3552b, 0);
                }
            }
        }
        String str = (String) this.f4625i;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f4625i), 0, ((String) this.f4622f).length(), 0);
        }
        String str2 = (String) this.f4624h;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f4624h)), 0, ((String) this.f4622f).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(t2.C0484b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof I.C0033i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            I.i r0 = (I.C0033i) r0
            int r1 = r0.f631l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f631l = r1
            goto L_0x0018
        L_0x0013:
            I.i r0 = new I.i
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f629j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f631l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            s1.y r0 = r0.f628i
            M0.a.V(r7)
            goto L_0x0064
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            s1.y r0 = r0.f628i
            M0.a.V(r7)
            goto L_0x0074
        L_0x003a:
            M0.a.V(r7)
            java.lang.Object r7 = r6.f4624h
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f4625i
            I.P r2 = (I.P) r2
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x004e
            goto L_0x0067
        L_0x004e:
            I.Z r7 = r2.f()
            I.l r4 = new I.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f628i = r6
            r0.f631l = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r6
        L_0x0064:
            I.c r7 = (I.C0027c) r7
            goto L_0x0076
        L_0x0067:
            r0.f628i = r6
            r0.f631l = r4
            r7 = 0
            java.lang.Object r7 = I.P.e(r2, r7, r0)
            if (r7 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r0 = r6
        L_0x0074:
            I.c r7 = (I.C0027c) r7
        L_0x0076:
            java.lang.Object r0 = r0.f4625i
            I.P r0 = (I.P) r0
            B.m r0 = r0.f575m
            r0.s(r7)
            p2.h r7 = p2.C0368h.f4194a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0464y.d(t2.b):java.lang.Object");
    }

    public File f(Context context) {
        ((G0.f) this.f4623g).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public boolean g(Context context) {
        boolean z3;
        if (((Boolean) this.f4624h) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4624h = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f4623g).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4624h).booleanValue();
    }

    public Object get() {
        return new k((Executor) ((a) this.f4622f).get(), (y0.d) ((a) this.f4623g).get(), (C0512d) ((C0.f) this.f4624h).get(), (C0524c) ((a) this.f4625i).get());
    }

    public boolean h(Context context) {
        boolean z3;
        if (((Boolean) this.f4623g) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4623g = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f4623g).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4623g).booleanValue();
    }

    public void i(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0002c) this.f4625i) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [Q2.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC, Splitter:B:29:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(t2.C0484b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof I.U
            if (r0 == 0) goto L_0x0013
            r0 = r8
            I.U r0 = (I.U) r0
            int r1 = r0.f590m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f590m = r1
            goto L_0x0018
        L_0x0013:
            I.U r0 = new I.U
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f588k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f590m
            p2.h r3 = p2.C0368h.f4194a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            Q2.a r1 = r0.f587j
            s1.y r0 = r0.f586i
            M0.a.V(r8)     // Catch:{ all -> 0x0031 }
            goto L_0x0087
        L_0x0031:
            r8 = move-exception
            goto L_0x0099
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            Q2.a r2 = r0.f587j
            s1.y r5 = r0.f586i
            M0.a.V(r8)
            r8 = r2
            goto L_0x0066
        L_0x0044:
            M0.a.V(r8)
            java.lang.Object r8 = r7.f4623g
            I2.l r8 = (I2.C0061l) r8
            java.lang.Object r8 = r8.E()
            boolean r8 = r8 instanceof I2.M
            if (r8 != 0) goto L_0x0054
            return r3
        L_0x0054:
            r0.f586i = r7
            java.lang.Object r8 = r7.f4622f
            Q2.d r8 = (Q2.d) r8
            r0.f587j = r8
            r0.f590m = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r5 = r7
        L_0x0066:
            java.lang.Object r2 = r5.f4623g     // Catch:{ all -> 0x0097 }
            I2.l r2 = (I2.C0061l) r2     // Catch:{ all -> 0x0097 }
            java.lang.Object r2 = r2.E()     // Catch:{ all -> 0x0097 }
            boolean r2 = r2 instanceof I2.M     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0078
            Q2.d r8 = (Q2.d) r8
            r8.e(r6)
            return r3
        L_0x0078:
            r0.f586i = r5     // Catch:{ all -> 0x0097 }
            r0.f587j = r8     // Catch:{ all -> 0x0097 }
            r0.f590m = r4     // Catch:{ all -> 0x0097 }
            java.lang.Object r0 = r5.d(r0)     // Catch:{ all -> 0x0097 }
            if (r0 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r1 = r8
            r0 = r5
        L_0x0087:
            java.lang.Object r8 = r0.f4623g     // Catch:{ all -> 0x0031 }
            I2.l r8 = (I2.C0061l) r8     // Catch:{ all -> 0x0031 }
            r8.K(r3)     // Catch:{ all -> 0x0031 }
            Q2.d r1 = (Q2.d) r1
            r1.e(r6)
            return r3
        L_0x0094:
            r1 = r8
            r8 = r0
            goto L_0x0099
        L_0x0097:
            r0 = move-exception
            goto L_0x0094
        L_0x0099:
            Q2.d r1 = (Q2.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0464y.j(t2.b):java.lang.Object");
    }

    public void k(Serializable serializable, C0135c cVar) {
        C0133a aVar;
        ByteBuffer b3 = ((l) this.f4624h).b(serializable);
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new C0133a(0, this, cVar);
        }
        ((f) this.f4623g).r((String) this.f4622f, b3, aVar);
    }

    public void l(C0134b bVar) {
        String str = (String) this.f4622f;
        f fVar = (f) this.f4623g;
        r rVar = null;
        e eVar = (e) this.f4625i;
        if (eVar != null) {
            if (bVar != null) {
                rVar = new r(this, bVar, 29, false);
            }
            fVar.l(str, rVar, eVar);
            return;
        }
        if (bVar != null) {
            rVar = new r(this, bVar, 29, false);
        }
        fVar.q(str, rVar);
    }

    public C0464y(int i3) {
        switch (i3) {
            case L.k.DOUBLE_FIELD_NUMBER:
                G0.f fVar = new G0.f(14);
                g gVar = new g(14, false);
                this.f4622f = new HashSet();
                this.f4623g = fVar;
                this.f4624h = gVar;
                return;
            default:
                this.f4622f = null;
                this.f4623g = null;
                this.f4624h = null;
                this.f4625i = new ArrayDeque();
                return;
        }
    }
}
