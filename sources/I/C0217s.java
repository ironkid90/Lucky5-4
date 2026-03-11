package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i.s  reason: case insensitive filesystem */
public final class C0217s extends C0207i implements SubMenu {
    public final C0207i v;

    /* renamed from: w  reason: collision with root package name */
    public final C0208j f3229w;

    public C0217s(Context context, C0207i iVar, C0208j jVar) {
        super(context);
        this.v = iVar;
        this.f3229w = jVar;
    }

    public final boolean d(C0208j jVar) {
        return this.v.d(jVar);
    }

    public final boolean e(C0207i iVar, MenuItem menuItem) {
        super.e(iVar, menuItem);
        return this.v.e(iVar, menuItem);
    }

    public final boolean f(C0208j jVar) {
        return this.v.f(jVar);
    }

    public final MenuItem getItem() {
        return this.f3229w;
    }

    public final C0207i j() {
        return this.v.j();
    }

    public final boolean l() {
        return this.v.l();
    }

    public final boolean m() {
        return this.v.m();
    }

    public final boolean n() {
        return this.v.n();
    }

    public final void setGroupDividerEnabled(boolean z3) {
        this.v.setGroupDividerEnabled(z3);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        q(0, (CharSequence) null, 0, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f3229w.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z3) {
        this.v.setQwertyMode(z3);
    }

    public final SubMenu setHeaderIcon(int i3) {
        q(0, (CharSequence) null, i3, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i3) {
        q(i3, (CharSequence) null, 0, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i3) {
        this.f3229w.setIcon(i3);
        return this;
    }
}
