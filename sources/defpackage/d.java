package defpackage;

import A2.i;
import C0.r;
import F0.h;
import Q1.a;
import S1.C0078d;
import android.util.Log;
import c2.C0134b;
import java.util.List;
import q2.C0402e;

/* renamed from: d  reason: default package */
public final /* synthetic */ class d implements C0134b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2877f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f2878g;

    public /* synthetic */ d(a aVar, int i3) {
        this.f2877f = i3;
        this.f2878g = aVar;
    }

    public final void j(Object obj, r rVar) {
        List list;
        List list2;
        boolean z3;
        switch (this.f2877f) {
            case 0:
                a aVar = this.f2878g;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                i.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                try {
                    aVar.a((b) obj2);
                    list = M0.a.A((Object) null);
                } catch (Throwable th) {
                    String simpleName = th.getClass().getSimpleName();
                    String th2 = th.toString();
                    Throwable cause = th.getCause();
                    String stackTraceString = Log.getStackTraceString(th);
                    list = C0402e.b0(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
                }
                rVar.q(list);
                return;
            default:
                try {
                    h hVar = this.f2878g.f1298f;
                    i.b(hVar);
                    C0078d dVar = (C0078d) hVar.f322g;
                    if (dVar != null) {
                        i.b(dVar);
                        if ((dVar.getWindow().getAttributes().flags & 128) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        list2 = M0.a.A(new a(Boolean.valueOf(z3)));
                        rVar.q(list2);
                        return;
                    }
                    throw new H1.a(7);
                } catch (Throwable th3) {
                    String simpleName2 = th3.getClass().getSimpleName();
                    String th4 = th3.toString();
                    Throwable cause2 = th3.getCause();
                    String stackTraceString2 = Log.getStackTraceString(th3);
                    list2 = C0402e.b0(simpleName2, th4, "Cause: " + cause2 + ", Stacktrace: " + stackTraceString2);
                }
        }
    }
}
