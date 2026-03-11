package i2;

import A.C0002c;
import C0.f;
import L.k;
import W0.a;
import W0.c;
import a1.C0096a;
import a1.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import n.C0335b;
import o0.C0356d;
import s1.C0446g;
import s1.C0449j;
import u1.C0494a;
import x0.j;
import y0.C0519a;
import y0.b;
import y0.g;
import y0.h;
import y0.i;
import z0.C0523b;

/* renamed from: i2.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0224e implements c, a, d, C0523b, g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3243f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3244g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3245h;

    public /* synthetic */ C0224e(int i3, Object obj, Object obj2) {
        this.f3243f = i3;
        this.f3244g = obj;
        this.f3245h = obj2;
    }

    public Object a(T1.d dVar) {
        String str;
        switch (this.f3243f) {
            case k.LONG_FIELD_NUMBER:
                Context context = (Context) dVar.a(Context.class);
                switch (((C0002c) this.f3245h).f39f) {
                    case 1:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case k.FLOAT_FIELD_NUMBER:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case k.INTEGER_FIELD_NUMBER:
                        int i3 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i3 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new C0494a((String) this.f3244g, str);
            default:
                String str2 = (String) this.f3244g;
                C0096a aVar = (C0096a) this.f3245h;
                try {
                    Trace.beginSection(str2);
                    return aVar.f2001f.a(dVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        i iVar = (i) this.f3244g;
        C0519a aVar = iVar.f4827i;
        int i3 = aVar.f4811b;
        r0.i iVar2 = (r0.i) this.f3245h;
        ArrayList d3 = iVar.d(sQLiteDatabase, iVar2, i3);
        for (C0356d dVar : C0356d.values()) {
            if (dVar != iVar2.f4428c) {
                int size = aVar.f4811b - d3.size();
                if (size <= 0) {
                    break;
                }
                f a2 = r0.i.a();
                a2.W(iVar2.f4426a);
                if (dVar != null) {
                    a2.f129i = dVar;
                    a2.f128h = iVar2.f4427b;
                    d3.addAll(iVar.d(sQLiteDatabase, a2.u(), size));
                } else {
                    throw new NullPointerException("Null priority");
                }
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < d3.size(); i4++) {
            sb.append(((b) d3.get(i4)).f4815a);
            if (i4 < d3.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new h(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d3.listIterator();
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar.f4815a))) {
                T1.d c3 = bVar.f4817c.c();
                long j4 = bVar.f4815a;
                for (h hVar : (Set) hashMap.get(Long.valueOf(j4))) {
                    c3.h(hVar.f4821a, hVar.f4822b);
                }
                listIterator.set(new b(j4, bVar.f4816b, c3.j()));
            }
        }
        return d3;
    }

    public Object b() {
        switch (this.f3243f) {
            case k.STRING_SET_FIELD_NUMBER:
                i iVar = (i) ((j) this.f3244g).f4794c;
                iVar.getClass();
                Iterable iterable = (Iterable) this.f3245h;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                iVar.a().compileStatement("DELETE FROM events WHERE _id in " + i.h(iterable)).execute();
                return null;
            default:
                j jVar = (j) this.f3245h;
                jVar.getClass();
                for (Map.Entry entry : ((HashMap) this.f3244g).entrySet()) {
                    ((i) jVar.f4800i).e((long) ((Integer) entry.getValue()).intValue(), u0.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    public Object o(W0.h hVar) {
        C0449j jVar = (C0449j) this.f3244g;
        String str = (String) this.f3245h;
        synchronized (jVar) {
            ((C0335b) jVar.f4570b).remove(str);
        }
        return hVar;
    }

    public void p(W0.h hVar) {
        String str;
        switch (this.f3243f) {
            case 1:
                ((C0226g) this.f3244g).getClass();
                boolean e2 = hVar.e();
                b2.f fVar = (b2.f) this.f3245h;
                if (e2) {
                    fVar.b(hVar.c());
                    return;
                }
                Exception b3 = hVar.b();
                if (b3 != null) {
                    str = b3.getMessage();
                } else {
                    str = null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", "unknown");
                if (b3 != null) {
                    hashMap.put("message", b3.getMessage());
                } else {
                    hashMap.put("message", "An unknown error has occurred.");
                }
                fVar.a("firebase_messaging", str, hashMap);
                return;
            default:
                ((C0446g) this.f3244g).a((Intent) this.f3245h);
                return;
        }
    }

    public /* synthetic */ C0224e(j jVar, HashMap hashMap) {
        this.f3243f = 7;
        this.f3245h = jVar;
        this.f3244g = hashMap;
    }
}
