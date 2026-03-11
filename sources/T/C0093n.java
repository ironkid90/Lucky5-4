package T;

import O.b;
import android.view.View;

/* renamed from: T.n  reason: case insensitive filesystem */
public final class C0093n extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1654b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0093n(t tVar, int i3) {
        super(tVar);
        this.f1654b = i3;
    }

    public final int b(View view) {
        switch (this.f1654b) {
            case 0:
                ((t) this.f1232a).getClass();
                return view.getRight() + ((u) view.getLayoutParams()).f1666a.right + ((u) view.getLayoutParams()).rightMargin;
            default:
                ((t) this.f1232a).getClass();
                return view.getBottom() + ((u) view.getLayoutParams()).f1666a.bottom + ((u) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f1654b) {
            case 0:
                ((t) this.f1232a).getClass();
                return (view.getLeft() - ((u) view.getLayoutParams()).f1666a.left) - ((u) view.getLayoutParams()).leftMargin;
            default:
                ((t) this.f1232a).getClass();
                return (view.getTop() - ((u) view.getLayoutParams()).f1666a.top) - ((u) view.getLayoutParams()).topMargin;
        }
    }

    public final int d() {
        switch (this.f1654b) {
            case 0:
                t tVar = (t) this.f1232a;
                return tVar.f1664f - tVar.t();
            default:
                t tVar2 = (t) this.f1232a;
                return tVar2.f1665g - tVar2.r();
        }
    }

    public final int e() {
        switch (this.f1654b) {
            case 0:
                return ((t) this.f1232a).s();
            default:
                return ((t) this.f1232a).u();
        }
    }

    public final int f() {
        switch (this.f1654b) {
            case 0:
                t tVar = (t) this.f1232a;
                return (tVar.f1664f - tVar.s()) - tVar.t();
            default:
                t tVar2 = (t) this.f1232a;
                return (tVar2.f1665g - tVar2.u()) - tVar2.r();
        }
    }
}
