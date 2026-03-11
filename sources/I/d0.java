package I;

import A2.i;
import android.support.v4.media.session.a;
import r2.C0418b;
import r2.C0423g;
import r2.C0424h;
import r2.C0425i;
import r2.C0426j;
import z2.p;

public final class d0 implements C0423g {

    /* renamed from: f  reason: collision with root package name */
    public final d0 f615f;

    /* renamed from: g  reason: collision with root package name */
    public final P f616g;

    public d0(d0 d0Var, P p3) {
        i.e(p3, "instance");
        this.f615f = d0Var;
        this.f616g = p3;
    }

    public final C0425i c(C0424h hVar) {
        return a.y(this, hVar);
    }

    public final C0425i d(C0425i iVar) {
        i.e(iVar, "context");
        if (iVar == C0426j.f4457f) {
            return this;
        }
        return (C0425i) iVar.e(this, new C0418b(1));
    }

    public final Object e(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    public final void f(P p3) {
        if (this.f616g != p3) {
            d0 d0Var = this.f615f;
            if (d0Var != null) {
                d0Var.f(p3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    public final C0424h getKey() {
        return c0.f611f;
    }

    public final C0423g n(C0424h hVar) {
        return a.s(this, hVar);
    }
}
