package k2;

import C0.r;
import L.k;
import a.C0094a;
import android.content.SharedPreferences;
import c2.C0134b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k2.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0288c implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3909f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0286a f3910g;

    public /* synthetic */ C0288c(C0286a aVar, int i3) {
        this.f3909f = i3;
        this.f3910g = aVar;
    }

    public final void j(Object obj, r rVar) {
        switch (this.f3909f) {
            case 0:
                C0286a aVar = this.f3910g;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(0, Boolean.valueOf(aVar.f3905f.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                } catch (Throwable th) {
                    arrayList = C0094a.Q(th);
                }
                rVar.q(arrayList);
                return;
            case 1:
                C0286a aVar2 = this.f3910g;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    arrayList2.add(0, Boolean.valueOf(aVar2.f3905f.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                } catch (Throwable th2) {
                    arrayList2 = C0094a.Q(th2);
                }
                rVar.q(arrayList2);
                return;
            case k.FLOAT_FIELD_NUMBER:
                C0286a aVar3 = this.f3910g;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = (ArrayList) obj;
                try {
                    arrayList4.add(0, aVar3.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                } catch (Throwable th3) {
                    arrayList4 = C0094a.Q(th3);
                }
                rVar.q(arrayList4);
                return;
            case k.INTEGER_FIELD_NUMBER:
                C0286a aVar4 = this.f3910g;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = (ArrayList) obj;
                try {
                    arrayList6.add(0, Boolean.valueOf(aVar4.f3905f.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                } catch (Throwable th4) {
                    arrayList6 = C0094a.Q(th4);
                }
                rVar.q(arrayList6);
                return;
            case k.LONG_FIELD_NUMBER:
                C0286a aVar5 = this.f3910g;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = (ArrayList) obj;
                String str = (String) arrayList9.get(0);
                Double d3 = (Double) arrayList9.get(1);
                try {
                    aVar5.getClass();
                    String d4 = Double.toString(d3.doubleValue());
                    SharedPreferences.Editor edit = aVar5.f3905f.edit();
                    arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                } catch (Throwable th5) {
                    arrayList8 = C0094a.Q(th5);
                }
                rVar.q(arrayList8);
                return;
            case k.STRING_FIELD_NUMBER:
                C0286a aVar6 = this.f3910g;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = (ArrayList) obj;
                try {
                    arrayList10.add(0, Boolean.valueOf(aVar6.f3905f.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                } catch (Throwable th6) {
                    arrayList10 = C0094a.Q(th6);
                }
                rVar.q(arrayList10);
                return;
            case k.STRING_SET_FIELD_NUMBER:
                C0286a aVar7 = this.f3910g;
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = (ArrayList) obj;
                String str2 = (String) arrayList13.get(0);
                List list = (List) arrayList13.get(1);
                try {
                    SharedPreferences.Editor edit2 = aVar7.f3905f.edit();
                    arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar7.f3906g.g(list)).commit()));
                } catch (Throwable th7) {
                    arrayList12 = C0094a.Q(th7);
                }
                rVar.q(arrayList12);
                return;
            case k.DOUBLE_FIELD_NUMBER:
                C0286a aVar8 = this.f3910g;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = (ArrayList) obj;
                try {
                    arrayList14.add(0, aVar8.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                } catch (Throwable th8) {
                    arrayList14 = C0094a.Q(th8);
                }
                rVar.q(arrayList14);
                return;
            default:
                C0286a aVar9 = this.f3910g;
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = (ArrayList) obj;
                try {
                    arrayList16.add(0, aVar9.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                } catch (Throwable th9) {
                    arrayList16 = C0094a.Q(th9);
                }
                rVar.q(arrayList16);
                return;
        }
    }
}
