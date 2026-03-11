package k2;

import A2.i;
import C0.r;
import L.k;
import M0.a;
import c2.C0134b;
import java.util.List;

/* renamed from: k2.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0289d implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3911f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0291f f3912g;

    public /* synthetic */ C0289d(C0291f fVar, int i3) {
        this.f3911f = i3;
        this.f3912g = fVar;
    }

    public final void j(Object obj, r rVar) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        switch (this.f3911f) {
            case 0:
                C0291f fVar = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj2 = list16.get(0);
                i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = list16.get(1);
                i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj3;
                Object obj4 = list16.get(2);
                i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar.s(str, str2, (C0292g) obj4);
                    list = a.A((Object) null);
                } catch (Throwable th) {
                    list = android.support.v4.media.session.a.b(th);
                }
                rVar.q(list);
                return;
            case 1:
                C0291f fVar2 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj5 = list17.get(0);
                i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj5;
                Object obj6 = list17.get(1);
                i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                List list18 = (List) obj6;
                Object obj7 = list17.get(2);
                i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar2.e(str3, list18, (C0292g) obj7);
                    list2 = a.A((Object) null);
                } catch (Throwable th2) {
                    list2 = android.support.v4.media.session.a.b(th2);
                }
                rVar.q(list2);
                return;
            case k.FLOAT_FIELD_NUMBER:
                C0291f fVar3 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list19 = (List) obj;
                Object obj8 = list19.get(0);
                i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) obj8;
                Object obj9 = list19.get(1);
                i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list3 = a.A(fVar3.i(str4, (C0292g) obj9));
                } catch (Throwable th3) {
                    list3 = android.support.v4.media.session.a.b(th3);
                }
                rVar.q(list3);
                return;
            case k.INTEGER_FIELD_NUMBER:
                C0291f fVar4 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list20 = (List) obj;
                Object obj10 = list20.get(0);
                i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) obj10;
                Object obj11 = list20.get(1);
                i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list4 = a.A(fVar4.j(str5, (C0292g) obj11));
                } catch (Throwable th4) {
                    list4 = android.support.v4.media.session.a.b(th4);
                }
                rVar.q(list4);
                return;
            case k.LONG_FIELD_NUMBER:
                C0291f fVar5 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list21 = (List) obj;
                Object obj12 = list21.get(0);
                i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj12;
                Object obj13 = list21.get(1);
                i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list5 = a.A(fVar5.l(str6, (C0292g) obj13));
                } catch (Throwable th5) {
                    list5 = android.support.v4.media.session.a.b(th5);
                }
                rVar.q(list5);
                return;
            case k.STRING_FIELD_NUMBER:
                C0291f fVar6 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list22 = (List) obj;
                Object obj14 = list22.get(0);
                i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                String str7 = (String) obj14;
                Object obj15 = list22.get(1);
                i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list6 = a.A(fVar6.m(str7, (C0292g) obj15));
                } catch (Throwable th6) {
                    list6 = android.support.v4.media.session.a.b(th6);
                }
                rVar.q(list6);
                return;
            case k.STRING_SET_FIELD_NUMBER:
                C0291f fVar7 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list23 = (List) obj;
                Object obj16 = list23.get(0);
                i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                String str8 = (String) obj16;
                Object obj17 = list23.get(1);
                i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj17).booleanValue();
                Object obj18 = list23.get(2);
                i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar7.o(str8, booleanValue, (C0292g) obj18);
                    list7 = a.A((Object) null);
                } catch (Throwable th7) {
                    list7 = android.support.v4.media.session.a.b(th7);
                }
                rVar.q(list7);
                return;
            case k.DOUBLE_FIELD_NUMBER:
                C0291f fVar8 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list24 = (List) obj;
                Object obj19 = list24.get(0);
                i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                String str9 = (String) obj19;
                Object obj20 = list24.get(1);
                i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list8 = a.A(fVar8.n(str9, (C0292g) obj20));
                } catch (Throwable th8) {
                    list8 = android.support.v4.media.session.a.b(th8);
                }
                rVar.q(list8);
                return;
            case k.BYTES_FIELD_NUMBER:
                C0291f fVar9 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list25 = (List) obj;
                Object obj21 = list25.get(0);
                i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                String str10 = (String) obj21;
                Object obj22 = list25.get(1);
                i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list9 = a.A(fVar9.b(str10, (C0292g) obj22));
                } catch (Throwable th9) {
                    list9 = android.support.v4.media.session.a.b(th9);
                }
                rVar.q(list9);
                return;
            case 9:
                C0291f fVar10 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list26 = (List) obj;
                List list27 = (List) list26.get(0);
                Object obj23 = list26.get(1);
                i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar10.t(list27, (C0292g) obj23);
                    list10 = a.A((Object) null);
                } catch (Throwable th10) {
                    list10 = android.support.v4.media.session.a.b(th10);
                }
                rVar.q(list10);
                return;
            case 10:
                C0291f fVar11 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list28 = (List) obj;
                List list29 = (List) list28.get(0);
                Object obj24 = list28.get(1);
                i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list11 = a.A(fVar11.k(list29, (C0292g) obj24));
                } catch (Throwable th11) {
                    list11 = android.support.v4.media.session.a.b(th11);
                }
                rVar.q(list11);
                return;
            case 11:
                C0291f fVar12 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list30 = (List) obj;
                List list31 = (List) list30.get(0);
                Object obj25 = list30.get(1);
                i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    list12 = a.A(fVar12.f(list31, (C0292g) obj25));
                } catch (Throwable th12) {
                    list12 = android.support.v4.media.session.a.b(th12);
                }
                rVar.q(list12);
                return;
            case 12:
                C0291f fVar13 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list32 = (List) obj;
                Object obj26 = list32.get(0);
                i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                String str11 = (String) obj26;
                Object obj27 = list32.get(1);
                i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                String str12 = (String) obj27;
                Object obj28 = list32.get(2);
                i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar13.a(str11, str12, (C0292g) obj28);
                    list13 = a.A((Object) null);
                } catch (Throwable th13) {
                    list13 = android.support.v4.media.session.a.b(th13);
                }
                rVar.q(list13);
                return;
            case 13:
                C0291f fVar14 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list33 = (List) obj;
                Object obj29 = list33.get(0);
                i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                String str13 = (String) obj29;
                Object obj30 = list33.get(1);
                i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj30).longValue();
                Object obj31 = list33.get(2);
                i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar14.c(str13, longValue, (C0292g) obj31);
                    list14 = a.A((Object) null);
                } catch (Throwable th14) {
                    list14 = android.support.v4.media.session.a.b(th14);
                }
                rVar.q(list14);
                return;
            default:
                C0291f fVar15 = this.f3912g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list34 = (List) obj;
                Object obj32 = list34.get(0);
                i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                String str14 = (String) obj32;
                Object obj33 = list34.get(1);
                i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                double doubleValue = ((Double) obj33).doubleValue();
                Object obj34 = list34.get(2);
                i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                try {
                    fVar15.q(str14, doubleValue, (C0292g) obj34);
                    list15 = a.A((Object) null);
                } catch (Throwable th15) {
                    list15 = android.support.v4.media.session.a.b(th15);
                }
                rVar.q(list15);
                return;
        }
    }
}
