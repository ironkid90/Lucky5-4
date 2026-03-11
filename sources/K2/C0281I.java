package k2;

import A2.i;
import C0.f;
import I2.C0071w;
import M.e;
import M.g;
import Y1.a;
import Y1.b;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p2.C0368h;
import q2.C0401d;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;

/* renamed from: k2.I  reason: case insensitive filesystem */
public final class C0281I implements b, C0291f {

    /* renamed from: f  reason: collision with root package name */
    public Context f3892f;

    /* renamed from: g  reason: collision with root package name */
    public f f3893g;

    /* renamed from: h  reason: collision with root package name */
    public final G0.f f3894h = new G0.f(13);

    public static final Object d(C0281I i3, String str, String str2, C0488f fVar) {
        i3.getClass();
        e eVar = new e(str);
        Context context = i3.f3892f;
        if (context != null) {
            Object l3 = C0282J.a(context).l(new g(new C0295j(eVar, str2, (C0420d) null), (C0420d) null), fVar);
            if (l3 == C0466a.f4632f) {
                return l3;
            }
            return C0368h.f4194a;
        }
        i.g("context");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(k2.C0281I r11, java.util.List r12, t2.C0484b r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof k2.u
            if (r0 == 0) goto L_0x0016
            r0 = r13
            k2.u r0 = (k2.u) r0
            int r1 = r0.f3969p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f3969p = r1
            goto L_0x001b
        L_0x0016:
            k2.u r0 = new k2.u
            r0.<init>(r11, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f3967n
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f3969p
            r3 = 0
            java.lang.String r4 = "context"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r6) goto L_0x0043
            if (r2 != r5) goto L_0x003b
            M.e r11 = r0.f3966m
            java.util.Iterator r12 = r0.f3965l
            java.util.Map r2 = r0.f3964k
            java.util.Set r6 = r0.f3963j
            k2.I r7 = r0.f3962i
            M0.a.V(r13)
            goto L_0x00c9
        L_0x003b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0043:
            java.util.Map r11 = r0.f3964k
            java.util.Set r12 = r0.f3963j
            k2.I r2 = r0.f3962i
            M0.a.V(r13)
            goto L_0x0088
        L_0x004d:
            M0.a.V(r13)
            if (r12 == 0) goto L_0x0057
            java.util.Set r12 = q2.C0401d.j0(r12)
            goto L_0x0058
        L_0x0057:
            r12 = r3
        L_0x0058:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r0.f3962i = r11
            r0.f3963j = r12
            r0.f3964k = r13
            r0.f3969p = r6
            android.content.Context r2 = r11.f3892f
            if (r2 == 0) goto L_0x00e7
            B.m r2 = k2.C0282J.a(r2)
            java.lang.Object r2 = r2.f100g
            I.h r2 = (I.C0032h) r2
            L2.d r2 = r2.o()
            b2.h r6 = new b2.h
            r7 = 11
            r6.<init>(r7, r2)
            java.lang.Object r2 = L2.t.c(r6, r0)
            if (r2 != r1) goto L_0x0084
            goto L_0x00e6
        L_0x0084:
            r10 = r2
            r2 = r11
            r11 = r13
            r13 = r10
        L_0x0088:
            java.util.Set r13 = (java.util.Set) r13
            if (r13 == 0) goto L_0x00e5
            java.util.Iterator r13 = r13.iterator()
            r6 = r12
            r12 = r13
            r7 = r2
            r2 = r11
        L_0x0094:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto L_0x00e3
            java.lang.Object r11 = r12.next()
            M.e r11 = (M.e) r11
            r0.f3962i = r7
            r0.f3963j = r6
            r0.f3964k = r2
            r0.f3965l = r12
            r0.f3966m = r11
            r0.f3969p = r5
            android.content.Context r13 = r7.f3892f
            if (r13 == 0) goto L_0x00df
            B.m r13 = k2.C0282J.a(r13)
            java.lang.Object r13 = r13.f100g
            I.h r13 = (I.C0032h) r13
            L2.d r13 = r13.o()
            k2.n r8 = new k2.n
            r9 = 3
            r8.<init>(r13, r11, r9)
            java.lang.Object r13 = L2.t.c(r8, r0)
            if (r13 != r1) goto L_0x00c9
            goto L_0x00e6
        L_0x00c9:
            java.lang.String r8 = r11.f1078a
            boolean r8 = k2.C0282J.b(r8, r13, r6)
            if (r8 == 0) goto L_0x0094
            G0.f r8 = r7.f3894h
            java.lang.Object r13 = k2.C0282J.c(r13, r8)
            if (r13 == 0) goto L_0x0094
            java.lang.String r11 = r11.f1078a
            r2.put(r11, r13)
            goto L_0x0094
        L_0x00df:
            A2.i.g(r4)
            throw r3
        L_0x00e3:
            r1 = r2
            goto L_0x00e6
        L_0x00e5:
            r1 = r11
        L_0x00e6:
            return r1
        L_0x00e7:
            A2.i.g(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C0281I.g(k2.I, java.util.List, t2.b):java.lang.Object");
    }

    public final void a(String str, String str2, C0292g gVar) {
        C0071w.k(new C0280H(this, str, str2, (C0420d) null));
    }

    public final C0285M b(String str, C0292g gVar) {
        C0285M m3;
        String i3 = i(str, gVar);
        if (i3 == null) {
            return null;
        }
        if (i3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new C0285M(i3, C0283K.JSON_ENCODED);
        }
        if (i3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            m3 = new C0285M((String) null, C0283K.PLATFORM_ENCODED);
        } else {
            m3 = new C0285M((String) null, C0283K.UNEXPECTED_STRING);
        }
        return m3;
    }

    public final void c(String str, long j3, C0292g gVar) {
        C0071w.k(new C0279G(str, this, j3, (C0420d) null));
    }

    public final void e(String str, List list, C0292g gVar) {
        C0071w.k(new C0274B(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f3894h.a(list)), (C0420d) null));
    }

    public final List f(List list, C0292g gVar) {
        return C0401d.h0(((Map) C0071w.k(new t(this, list, (C0420d) null))).keySet());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, A2.q] */
    public final String i(String str, C0292g gVar) {
        ? obj = new Object();
        C0071w.k(new w(str, this, obj, (C0420d) null));
        return (String) obj.f86f;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, A2.q] */
    public final Boolean j(String str, C0292g gVar) {
        ? obj = new Object();
        C0071w.k(new C0300o(str, this, obj, (C0420d) null));
        return (Boolean) obj.f86f;
    }

    public final Map k(List list, C0292g gVar) {
        return (Map) C0071w.k(new C0296k(this, list, (C0420d) null));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, A2.q] */
    public final Double l(String str, C0292g gVar) {
        ? obj = new Object();
        C0071w.k(new C0302q(str, this, obj, (C0420d) null));
        return (Double) obj.f86f;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, A2.q] */
    public final Long m(String str, C0292g gVar) {
        ? obj = new Object();
        C0071w.k(new C0304s(str, this, obj, (C0420d) null));
        return (Long) obj.f86f;
    }

    public final ArrayList n(String str, C0292g gVar) {
        List list;
        String i3 = i(str, gVar);
        ArrayList arrayList = null;
        if (i3 != null && !i3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && i3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) C0282J.c(i3, this.f3894h)) != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof String) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final void o(String str, boolean z3, C0292g gVar) {
        C0071w.k(new C0273A(str, this, z3, (C0420d) null));
    }

    public final void onAttachedToEngine(a aVar) {
        i.e(aVar, "binding");
        c2.f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        Context context = aVar.f1964a;
        i.d(context, "getApplicationContext(...)");
        this.f3892f = context;
        try {
            C0291f.f3915e.getClass();
            C0290e.b(fVar, this, "data_store");
            this.f3893g = new f(fVar, context, this.f3894h);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0286a().onAttachedToEngine(aVar);
    }

    public final void onDetachedFromEngine(a aVar) {
        i.e(aVar, "binding");
        c2.f fVar = aVar.f1965b;
        i.d(fVar, "getBinaryMessenger(...)");
        C0291f.f3915e.getClass();
        C0290e.b(fVar, (C0291f) null, "data_store");
        f fVar2 = this.f3893g;
        if (fVar2 != null) {
            C0290e.b((c2.f) fVar2.f128h, (C0291f) null, "shared_preferences");
        }
        this.f3893g = null;
    }

    public final void q(String str, double d3, C0292g gVar) {
        C0071w.k(new C0276D(str, this, d3, (C0420d) null));
    }

    public final void s(String str, String str2, C0292g gVar) {
        C0071w.k(new C0277E(this, str, str2, (C0420d) null));
    }

    public final void t(List list, C0292g gVar) {
        C0071w.k(new C0294i(this, list, (C0420d) null));
    }
}
