package r2;

import A2.i;
import android.support.v4.media.session.a;
import z2.p;

/* renamed from: r2.a  reason: case insensitive filesystem */
public abstract class C0417a implements C0423g {

    /* renamed from: f  reason: collision with root package name */
    public final C0424h f4452f;

    public C0417a(C0424h hVar) {
        this.f4452f = hVar;
    }

    public C0425i c(C0424h hVar) {
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

    public final C0424h getKey() {
        return this.f4452f;
    }

    public C0423g n(C0424h hVar) {
        return a.s(this, hVar);
    }
}
