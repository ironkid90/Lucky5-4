package k2;

import A2.i;
import B.m;
import F2.c;
import I.C0028d;
import I.P;
import I2.C0069u;
import K.e;
import L.b;
import M.d;
import M0.a;
import R2.f;
import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import r2.C0420d;
import z2.l;

/* renamed from: k2.J  reason: case insensitive filesystem */
public abstract class C0282J {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c[] f3895a;

    /* renamed from: b  reason: collision with root package name */
    public static final L.c f3896b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: r2.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            A2.l r1 = new A2.l
            A2.b r2 = A2.b.f68f
            java.lang.String r3 = "sharedPreferencesDataStore"
            java.lang.String r4 = "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"
            java.lang.Class<k2.J> r5 = k2.C0282J.class
            r1.<init>(r2, r5, r3, r4)
            A2.s r2 = A2.r.f87a
            r2.getClass()
            F2.c[] r2 = new F2.c[r0]
            r3 = 0
            r2[r3] = r1
            f3895a = r2
            L.a r1 = L.a.f911g
            P2.c r2 = I2.C.f716b
            I2.g0 r3 = new I2.g0
            r4 = 0
            r3.<init>(r4)
            r2.getClass()
            r2.j r4 = r2.C0426j.f4457f
            if (r3 != r4) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            r2.b r4 = new r2.b
            r4.<init>(r0)
            java.lang.Object r0 = r3.e(r2, r4)
            r2 = r0
            r2.i r2 = (r2.C0425i) r2
        L_0x0038:
            N2.e r0 = I2.C0071w.a(r2)
            L.c r2 = new L.c
            r2.<init>(r1, r0)
            f3896b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C0282J.<clinit>():void");
    }

    public static final m a(Context context) {
        m mVar;
        L.c cVar = f3896b;
        c cVar2 = f3895a[0];
        cVar.getClass();
        i.e(context, "thisRef");
        i.e(cVar2, "property");
        m mVar2 = cVar.f918d;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (cVar.f917c) {
            try {
                if (cVar.f918d == null) {
                    Context applicationContext = context.getApplicationContext();
                    l lVar = cVar.f915a;
                    i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.j(applicationContext);
                    C0069u uVar = cVar.f916b;
                    b bVar = new b(0, applicationContext, cVar);
                    i.e(list, "migrations");
                    cVar.f918d = new m(8, (Object) new m(8, (Object) new P(new e(f.f1385a, new d(0, bVar)), a.A(new C0028d(list, (C0420d) null)), new j1.e(2), uVar)));
                }
                mVar = cVar.f918d;
                i.b(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        i.e(str, "key");
        if (set != null) {
            return set.contains(str);
        }
        if ((obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double)) {
            return true;
        }
        return false;
    }

    public static final Object c(Object obj, G0.f fVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        i.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            i.d(substring, "substring(...)");
            fVar.getClass();
            i.e(substring, "listString");
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
            i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
            ArrayList arrayList = new ArrayList();
            for (Object next : (List) readObject) {
                if (next instanceof String) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } else if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        } else {
            String substring2 = str.substring(40);
            i.d(substring2, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring2));
        }
    }
}
