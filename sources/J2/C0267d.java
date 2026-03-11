package j2;

import L.k;
import Y1.a;
import Y1.b;
import android.content.Context;
import android.util.Log;
import c2.C0134b;
import c2.f;
import j1.e;
import java.io.File;
import java.util.ArrayList;
import s1.C0464y;

/* renamed from: j2.d  reason: case insensitive filesystem */
public class C0267d implements b {

    /* renamed from: f  reason: collision with root package name */
    public Context f3856f;

    public static void b(f fVar, C0267d dVar) {
        e h3 = fVar.h();
        C0265b bVar = C0265b.f3853d;
        C0464y yVar = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, h3);
        if (dVar != null) {
            yVar.l(new C0264a(dVar, 0));
        } else {
            yVar.l((C0134b) null);
        }
        C0464y yVar2 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, fVar.h());
        if (dVar != null) {
            yVar2.l(new C0264a(dVar, 1));
        } else {
            yVar2.l((C0134b) null);
        }
        C0464y yVar3 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, fVar.h());
        if (dVar != null) {
            yVar3.l(new C0264a(dVar, 2));
        } else {
            yVar3.l((C0134b) null);
        }
        C0464y yVar4 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, fVar.h());
        if (dVar != null) {
            yVar4.l(new C0264a(dVar, 3));
        } else {
            yVar4.l((C0134b) null);
        }
        C0464y yVar5 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, fVar.h());
        if (dVar != null) {
            yVar5.l(new C0264a(dVar, 4));
        } else {
            yVar5.l((C0134b) null);
        }
        C0464y yVar6 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, fVar.h());
        if (dVar != null) {
            yVar6.l(new C0264a(dVar, 5));
        } else {
            yVar6.l((C0134b) null);
        }
        C0464y yVar7 = new C0464y(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, fVar.h());
        if (dVar != null) {
            yVar7.l(new C0264a(dVar, 6));
        } else {
            yVar7.l((C0134b) null);
        }
    }

    public final ArrayList a(C0266c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f3856f;
        switch (cVar.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case k.FLOAT_FIELD_NUMBER:
                str = "podcasts";
                break;
            case k.INTEGER_FIELD_NUMBER:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public final void onAttachedToEngine(a aVar) {
        try {
            b(aVar.f1965b, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f3856f = aVar.f1964a;
    }

    public final void onDetachedFromEngine(a aVar) {
        b(aVar.f1965b, (C0267d) null);
    }
}
