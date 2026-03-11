package T1;

import C0.j;
import C0.t;
import C0.u;
import W0.p;
import Z1.b;
import a1.q;
import a1.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import c2.s;
import com.ai9poker.app.R;
import f.C0159a;
import i1.C0219b;
import j.C0250o;
import j.C0258x;
import j.N;
import j.g0;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l1.C0313a;
import r0.h;
import r0.k;
import t.C0467a;

public final class d implements b, a1.b {

    /* renamed from: a  reason: collision with root package name */
    public Object f1703a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1704b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1705c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1706d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1707e;

    /* renamed from: f  reason: collision with root package name */
    public Object f1708f;

    public static boolean i(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList k(Context context, int i3) {
        int b3 = g0.b(context, R.attr.colorControlHighlight);
        int a2 = g0.a(context, R.attr.colorButtonNormal);
        int[] iArr = g0.f3687b;
        int[] iArr2 = g0.f3689d;
        int a3 = C0467a.a(b3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, g0.f3688c, g0.f3691f}, new int[]{a2, a3, C0467a.a(b3, i3), i3});
    }

    public static void o(Drawable drawable, int i3) {
        PorterDuffColorFilter e2;
        PorterDuff.Mode mode = C0250o.f3740b;
        if (C0258x.a(drawable)) {
            drawable = drawable.mutate();
        }
        synchronized (C0250o.class) {
            e2 = N.e(i3, mode);
        }
        drawable.setColorFilter(e2);
    }

    public Object a(Class cls) {
        if (((Set) this.f1703a).contains(q.a(cls))) {
            Object a2 = ((a1.b) this.f1708f).a(cls);
            if (!cls.equals(C0219b.class)) {
                return a2;
            }
            return new r((Set) this.f1707e, (C0219b) a2);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public C0313a b(Class cls) {
        return c(q.a(cls));
    }

    public C0313a c(q qVar) {
        if (((Set) this.f1704b).contains(qVar)) {
            return ((a1.b) this.f1708f).c(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    public Object d(q qVar) {
        if (((Set) this.f1703a).contains(qVar)) {
            return ((a1.b) this.f1708f).d(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + qVar + ".");
    }

    public Set e(q qVar) {
        if (((Set) this.f1705c).contains(qVar)) {
            return ((a1.b) this.f1708f).e(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    public C0313a f(q qVar) {
        if (((Set) this.f1706d).contains(qVar)) {
            return ((a1.b) this.f1708f).f(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    public void g(s sVar) {
        ((HashSet) this.f1705c).add(sVar);
    }

    public void h(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1708f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public h j() {
        String str;
        if (((String) this.f1703a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((k) this.f1705c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1706d) == null) {
            str = str + " eventMillis";
        }
        if (((Long) this.f1707e) == null) {
            str = str + " uptimeMillis";
        }
        if (((HashMap) this.f1708f) == null) {
            str = str + " autoMetadata";
        }
        if (str.isEmpty()) {
            return new h((String) this.f1703a, (Integer) this.f1704b, (k) this.f1705c, ((Long) this.f1706d).longValue(), ((Long) this.f1707e).longValue(), (HashMap) this.f1708f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public p l(p pVar) {
        return pVar.h(new Object(), new S1.r(8, this));
    }

    public ColorStateList m(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            Object obj = C0159a.f2941a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        } else if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            Object obj2 = C0159a.f2941a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        } else if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c3 = g0.c(context, R.attr.colorSwitchThumbNormal);
            if (c3 == null || !c3.isStateful()) {
                iArr[0] = g0.f3687b;
                iArr2[0] = g0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = g0.f3690e;
                iArr2[1] = g0.b(context, R.attr.colorControlActivated);
                iArr[2] = g0.f3691f;
                iArr2[2] = g0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = g0.f3687b;
                iArr[0] = iArr3;
                iArr2[0] = c3.getColorForState(iArr3, 0);
                iArr[1] = g0.f3690e;
                iArr2[1] = g0.b(context, R.attr.colorControlActivated);
                iArr[2] = g0.f3691f;
                iArr2[2] = c3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return k(context, g0.b(context, R.attr.colorButtonNormal));
        } else {
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return k(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return k(context, g0.b(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                Object obj3 = C0159a.f2941a;
                return context.getColorStateList(R.color.abc_tint_spinner);
            } else if (i((int[]) this.f1704b, i3)) {
                return g0.c(context, R.attr.colorControlNormal);
            } else {
                if (i((int[]) this.f1707e, i3)) {
                    Object obj4 = C0159a.f2941a;
                    return context.getColorStateList(R.color.abc_tint_default);
                } else if (i((int[]) this.f1708f, i3)) {
                    Object obj5 = C0159a.f2941a;
                    return context.getColorStateList(R.color.abc_tint_btn_checkable);
                } else if (i3 != R.drawable.abc_seekbar_thumb_material) {
                    return null;
                } else {
                    Object obj6 = C0159a.f2941a;
                    return context.getColorStateList(R.color.abc_tint_seek_thumb);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r0 = "scope"
            r8.putString(r0, r7)
            java.lang.String r7 = "sender"
            r8.putString(r7, r6)
            java.lang.String r7 = "subtype"
            r8.putString(r7, r6)
            java.lang.String r6 = "gmp_app_id"
            java.lang.Object r7 = r5.f1703a
            X0.g r7 = (X0.g) r7
            r7.a()
            X0.h r7 = r7.f1938c
            java.lang.String r7 = r7.f1947b
            r8.putString(r6, r7)
            java.lang.String r6 = "gmsv"
            java.lang.Object r7 = r5.f1704b
            s1.s r7 = (s1.C0458s) r7
            monitor-enter(r7)
            int r0 = r7.f4592d     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r7.c(r0)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x003a
            int r0 = r0.versionCode     // Catch:{ all -> 0x0037 }
            r7.f4592d = r0     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r6 = move-exception
            goto L_0x015d
        L_0x003a:
            int r0 = r7.f4592d     // Catch:{ all -> 0x0037 }
            monitor-exit(r7)
            java.lang.String r7 = java.lang.Integer.toString(r0)
            r8.putString(r6, r7)
            java.lang.String r6 = "osv"
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r8.putString(r6, r7)
            java.lang.String r6 = "app_ver"
            java.lang.Object r7 = r5.f1704b
            s1.s r7 = (s1.C0458s) r7
            java.lang.String r7 = r7.a()
            r8.putString(r6, r7)
            java.lang.String r6 = "app_ver_name"
            java.lang.Object r7 = r5.f1704b
            r0 = r7
            s1.s r0 = (s1.C0458s) r0
            monitor-enter(r0)
            java.lang.String r7 = r0.f4591c     // Catch:{ all -> 0x006c }
            if (r7 != 0) goto L_0x006f
            r0.e()     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r6 = move-exception
            goto L_0x015b
        L_0x006f:
            java.lang.String r7 = r0.f4591c     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            r8.putString(r6, r7)
            java.lang.String r6 = "firebase-app-name-hash"
            java.lang.Object r7 = r5.f1703a
            X0.g r7 = (X0.g) r7
            r7.a()
            java.lang.String r7 = r7.f1937b
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            byte[] r7 = r7.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            byte[] r7 = r0.digest(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            r0 = 11
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            java.lang.String r7 = "[HASH-ERROR]"
        L_0x0097:
            r8.putString(r6, r7)
            java.lang.Object r6 = r5.f1708f     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            m1.d r6 = (m1.C0330d) r6     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            m1.c r6 = (m1.C0329c) r6     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            W0.p r6 = r6.d()     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            java.lang.Object r6 = android.support.v4.media.session.a.d(r6)     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            m1.a r6 = (m1.C0327a) r6     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            java.lang.String r6 = r6.f4018a     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            if (r7 != 0) goto L_0x00bc
            java.lang.String r7 = "Goog-Firebase-Installations-Auth"
            r8.putString(r7, r6)     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            goto L_0x00cb
        L_0x00b8:
            r6 = move-exception
            goto L_0x00c4
        L_0x00ba:
            r6 = move-exception
            goto L_0x00c4
        L_0x00bc:
            java.lang.String r6 = "FirebaseMessaging"
            java.lang.String r7 = "FIS auth token is empty"
            android.util.Log.w(r6, r7)     // Catch:{ ExecutionException -> 0x00ba, InterruptedException -> 0x00b8 }
            goto L_0x00cb
        L_0x00c4:
            java.lang.String r7 = "FirebaseMessaging"
            java.lang.String r0 = "Failed to get FIS auth token"
            android.util.Log.e(r7, r0, r6)
        L_0x00cb:
            java.lang.String r6 = "appid"
            java.lang.Object r7 = r5.f1708f
            m1.d r7 = (m1.C0330d) r7
            m1.c r7 = (m1.C0329c) r7
            W0.p r7 = r7.c()
            java.lang.Object r7 = android.support.v4.media.session.a.d(r7)
            java.lang.String r7 = (java.lang.String) r7
            r8.putString(r6, r7)
            java.lang.String r6 = "cliv"
            java.lang.String r7 = "fcm-24.1.2"
            r8.putString(r6, r7)
            java.lang.Object r6 = r5.f1707e
            l1.a r6 = (l1.C0313a) r6
            java.lang.Object r6 = r6.get()
            j1.g r6 = (j1.g) r6
            java.lang.Object r7 = r5.f1706d
            l1.a r7 = (l1.C0313a) r7
            java.lang.Object r7 = r7.get()
            u1.b r7 = (u1.C0495b) r7
            if (r6 == 0) goto L_0x015a
            if (r7 == 0) goto L_0x015a
            j1.d r6 = (j1.d) r6
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0157 }
            X0.c r2 = r6.f3842a     // Catch:{ all -> 0x0157 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0157 }
            j1.h r2 = (j1.h) r2     // Catch:{ all -> 0x0157 }
            monitor-enter(r2)     // Catch:{ all -> 0x0157 }
            boolean r0 = r2.g(r0)     // Catch:{ all -> 0x0154 }
            monitor-exit(r2)     // Catch:{ all -> 0x0157 }
            r1 = 1
            if (r0 == 0) goto L_0x0139
            monitor-enter(r2)     // Catch:{ all -> 0x0157 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r2.d(r3)     // Catch:{ all -> 0x0136 }
            android.content.SharedPreferences r3 = r2.f3850a     // Catch:{ all -> 0x0136 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0136 }
            java.lang.String r4 = "last-used-date"
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r0)     // Catch:{ all -> 0x0136 }
            r3.commit()     // Catch:{ all -> 0x0136 }
            r2.f(r0)     // Catch:{ all -> 0x0136 }
            monitor-exit(r2)     // Catch:{ all -> 0x0157 }
            monitor-exit(r6)
            r6 = 3
            goto L_0x013b
        L_0x0136:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0136 }
            throw r7     // Catch:{ all -> 0x0157 }
        L_0x0139:
            monitor-exit(r6)
            r6 = r1
        L_0x013b:
            if (r6 == r1) goto L_0x015a
            java.lang.String r0 = "Firebase-Client-Log-Type"
            int r6 = L.j.b(r6)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r8.putString(r0, r6)
            java.lang.String r6 = "Firebase-Client"
            java.lang.String r7 = r7.a()
            r8.putString(r6, r7)
            goto L_0x015a
        L_0x0154:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0154 }
            throw r7     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0157 }
            throw r7
        L_0x015a:
            return
        L_0x015b:
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r6
        L_0x015d:
            monitor-exit(r7)     // Catch:{ all -> 0x0037 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.d.n(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public p p(String str, String str2, Bundle bundle) {
        int i3;
        try {
            n(str, str2, bundle);
            C0.b bVar = (C0.b) this.f1705c;
            u uVar = bVar.f113c;
            int c3 = uVar.c();
            j jVar = j.f133h;
            if (c3 >= 12000000) {
                t a2 = t.a(bVar.f112b);
                synchronized (a2) {
                    i3 = a2.f171d;
                    a2.f171d = i3 + 1;
                }
                return a2.b(new C0.s(i3, 1, bundle, 1)).h(jVar, C0.d.f119g);
            } else if (uVar.d() != 0) {
                return bVar.a(bundle).i(jVar, new C0.r(1, (Object) bVar, (Object) bundle));
            } else {
                IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
                p pVar = new p();
                pVar.k(iOException);
                return pVar;
            }
        } catch (InterruptedException | ExecutionException e2) {
            p pVar2 = new p();
            pVar2.k(e2);
            return pVar2;
        }
    }
}
