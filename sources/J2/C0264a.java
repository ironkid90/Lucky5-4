package j2;

import C0.r;
import L.k;
import android.content.Context;
import android.support.v4.media.session.a;
import c2.C0134b;
import java.io.File;
import java.util.ArrayList;

/* renamed from: j2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0264a implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3851f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0267d f3852g;

    public /* synthetic */ C0264a(C0267d dVar, int i3) {
        this.f3851f = i3;
        this.f3852g = dVar;
    }

    public final void j(Object obj, r rVar) {
        switch (this.f3851f) {
            case 0:
                C0267d dVar = this.f3852g;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(0, dVar.f3856f.getCacheDir().getPath());
                } catch (Throwable th) {
                    arrayList = a.G(th);
                }
                rVar.q(arrayList);
                return;
            case 1:
                C0267d dVar2 = this.f3852g;
                ArrayList arrayList2 = new ArrayList();
                try {
                    Context context = dVar2.f3856f;
                    File filesDir = context.getFilesDir();
                    if (filesDir == null) {
                        filesDir = new File(context.getDataDir().getPath(), "files");
                    }
                    arrayList2.add(0, filesDir.getPath());
                } catch (Throwable th2) {
                    arrayList2 = a.G(th2);
                }
                rVar.q(arrayList2);
                return;
            case k.FLOAT_FIELD_NUMBER:
                C0267d dVar3 = this.f3852g;
                ArrayList arrayList3 = new ArrayList();
                try {
                    Context context2 = dVar3.f3856f;
                    File dir = context2.getDir("flutter", 0);
                    if (dir == null) {
                        dir = new File(context2.getDataDir().getPath(), "app_flutter");
                    }
                    arrayList3.add(0, dir.getPath());
                } catch (Throwable th3) {
                    arrayList3 = a.G(th3);
                }
                rVar.q(arrayList3);
                return;
            case k.INTEGER_FIELD_NUMBER:
                C0267d dVar4 = this.f3852g;
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.add(0, dVar4.f3856f.getCacheDir().getPath());
                } catch (Throwable th4) {
                    arrayList4 = a.G(th4);
                }
                rVar.q(arrayList4);
                return;
            case k.LONG_FIELD_NUMBER:
                C0267d dVar5 = this.f3852g;
                ArrayList arrayList5 = new ArrayList();
                try {
                    String str = null;
                    File externalFilesDir = dVar5.f3856f.getExternalFilesDir((String) null);
                    if (externalFilesDir != null) {
                        str = externalFilesDir.getAbsolutePath();
                    }
                    arrayList5.add(0, str);
                } catch (Throwable th5) {
                    arrayList5 = a.G(th5);
                }
                rVar.q(arrayList5);
                return;
            case k.STRING_FIELD_NUMBER:
                C0267d dVar6 = this.f3852g;
                ArrayList arrayList6 = new ArrayList();
                try {
                    dVar6.getClass();
                    ArrayList arrayList7 = new ArrayList();
                    for (File file : dVar6.f3856f.getExternalCacheDirs()) {
                        if (file != null) {
                            arrayList7.add(file.getAbsolutePath());
                        }
                    }
                    arrayList6.add(0, arrayList7);
                } catch (Throwable th6) {
                    arrayList6 = a.G(th6);
                }
                rVar.q(arrayList6);
                return;
            default:
                C0267d dVar7 = this.f3852g;
                ArrayList arrayList8 = new ArrayList();
                try {
                    arrayList8.add(0, dVar7.a((C0266c) ((ArrayList) obj).get(0)));
                } catch (Throwable th7) {
                    arrayList8 = a.G(th7);
                }
                rVar.q(arrayList8);
                return;
        }
    }
}
