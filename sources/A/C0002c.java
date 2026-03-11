package A;

import C0.f;
import L.k;
import W0.a;
import W0.h;
import a1.d;
import a1.m;
import a1.q;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import r0.i;
import r0.o;
import u1.C0494a;
import u1.C0495b;
import u1.C0496c;
import y0.g;

/* renamed from: A.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0002c implements d, a, g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f39f;

    public /* synthetic */ C0002c(int i3) {
        this.f39f = i3;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [u1.c, java.lang.Object] */
    public Object a(T1.d dVar) {
        C0496c cVar;
        switch (this.f39f) {
            case k.STRING_FIELD_NUMBER /*5*/:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2853a.get();
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2855c.get();
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2854b.get();
            case k.BYTES_FIELD_NUMBER /*8*/:
                m mVar = ExecutorsRegistrar.f2853a;
                return b1.k.f2699f;
            case 10:
                return o.b((Context) dVar.a(Context.class));
            case 11:
                return o.b((Context) dVar.a(Context.class));
            case 12:
                return o.b((Context) dVar.a(Context.class));
            case 13:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            default:
                Set e2 = dVar.e(q.a(C0494a.class));
                C0496c cVar2 = C0496c.f4717b;
                C0496c cVar3 = cVar2;
                if (cVar2 == null) {
                    synchronized (C0496c.class) {
                        try {
                            C0496c cVar4 = C0496c.f4717b;
                            cVar = cVar4;
                            if (cVar4 == null) {
                                ? obj = new Object();
                                obj.f4718a = new HashSet();
                                C0496c.f4717b = obj;
                                cVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    cVar3 = cVar;
                }
                return new C0495b(e2, cVar3);
        }
    }

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                f a2 = i.a();
                a2.W(rawQuery.getString(1));
                a2.f129i = B0.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    bArr = null;
                } else {
                    bArr = Base64.decode(string, 0);
                }
                a2.f128h = bArr;
                arrayList.add(a2.u());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    public Object o(h hVar) {
        switch (this.f39f) {
            case 14:
                return 403;
            default:
                return -1;
        }
    }

    public /* synthetic */ C0002c(b2.f fVar) {
        this.f39f = 9;
    }
}
