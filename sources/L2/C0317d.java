package l2;

import C0.f;
import C0.r;
import L.k;
import M0.a;
import S1.C0078d;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c2.C0134b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: l2.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0317d implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4009f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f4010g;

    public /* synthetic */ C0317d(f fVar, int i3) {
        this.f4009f = i3;
        this.f4010g = fVar;
    }

    public final void j(Object obj, r rVar) {
        Boolean bool;
        switch (this.f4009f) {
            case 0:
                f fVar = this.f4010g;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(0, fVar.v((String) ((ArrayList) obj).get(0)));
                } catch (Throwable th) {
                    arrayList = a.Z(th);
                }
                rVar.q(arrayList);
                return;
            case 1:
                f fVar2 = this.f4010g;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = (ArrayList) obj;
                String str = (String) arrayList3.get(0);
                Map map = (Map) arrayList3.get(1);
                try {
                    if (((C0078d) fVar2.f129i) != null) {
                        ((C0078d) fVar2.f129i).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", f.F(map)));
                        bool = Boolean.TRUE;
                        arrayList2.add(0, bool);
                        rVar.q(arrayList2);
                        return;
                    }
                    throw new C0315b();
                } catch (ActivityNotFoundException unused) {
                    bool = Boolean.FALSE;
                } catch (Throwable th2) {
                    arrayList2 = a.Z(th2);
                }
            case k.FLOAT_FIELD_NUMBER:
                f fVar3 = this.f4010g;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = (ArrayList) obj;
                try {
                    arrayList4.add(0, fVar3.S((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0318e) arrayList5.get(2), (C0314a) arrayList5.get(3)));
                } catch (Throwable th3) {
                    arrayList4 = a.Z(th3);
                }
                rVar.q(arrayList4);
                return;
            case k.INTEGER_FIELD_NUMBER:
                f fVar4 = this.f4010g;
                ArrayList arrayList6 = new ArrayList();
                try {
                    arrayList6.add(0, fVar4.a0());
                } catch (Throwable th4) {
                    arrayList6 = a.Z(th4);
                }
                rVar.q(arrayList6);
                return;
            default:
                f fVar5 = this.f4010g;
                ArrayList arrayList7 = new ArrayList();
                try {
                    fVar5.getClass();
                    ((Context) fVar5.f128h).sendBroadcast(new Intent("close action"));
                    arrayList7.add(0, (Object) null);
                } catch (Throwable th5) {
                    arrayList7 = a.Z(th5);
                }
                rVar.q(arrayList7);
                return;
        }
    }
}
