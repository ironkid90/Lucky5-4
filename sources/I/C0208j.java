package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import f.C0159a;
import java.util.ArrayList;
import u.C0489a;

/* renamed from: i.j  reason: case insensitive filesystem */
public final class C0208j implements MenuItem {

    /* renamed from: A  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3171A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3172B = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f3173a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3174b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3176d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3177e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3178f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3179g;

    /* renamed from: h  reason: collision with root package name */
    public char f3180h;

    /* renamed from: i  reason: collision with root package name */
    public int f3181i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f3182j;

    /* renamed from: k  reason: collision with root package name */
    public int f3183k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3184l;

    /* renamed from: m  reason: collision with root package name */
    public int f3185m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final C0207i f3186n;

    /* renamed from: o  reason: collision with root package name */
    public C0217s f3187o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3188p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3189q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3190r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3191s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3192t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3193u = false;
    public boolean v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3194w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f3195x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f3196y;

    /* renamed from: z  reason: collision with root package name */
    public View f3197z;

    public C0208j(C0207i iVar, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f3186n = iVar;
        this.f3173a = i4;
        this.f3174b = i3;
        this.f3175c = i5;
        this.f3176d = i6;
        this.f3177e = charSequence;
        this.f3196y = 0;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f3194w && (this.f3193u || this.v)) {
            drawable = drawable.mutate();
            if (this.f3193u) {
                C0489a.h(drawable, this.f3191s);
            }
            if (this.v) {
                C0489a.i(drawable, this.f3192t);
            }
            this.f3194w = false;
        }
        return drawable;
    }

    public final boolean c() {
        if ((this.f3196y & 8) == 0 || this.f3197z == null) {
            return false;
        }
        return true;
    }

    public final boolean collapseActionView() {
        if ((this.f3196y & 8) == 0) {
            return false;
        }
        if (this.f3197z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3171A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3186n.d(this);
        }
        return false;
    }

    public final boolean d() {
        if ((this.f3195x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final C0208j e(CharSequence charSequence) {
        this.f3189q = charSequence;
        this.f3186n.o(false);
        return this;
    }

    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3171A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3186n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f3195x |= 32;
        } else {
            this.f3195x &= -33;
        }
    }

    public final C0208j g(CharSequence charSequence) {
        this.f3190r = charSequence;
        this.f3186n.o(false);
        return this;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f3197z;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f3183k;
    }

    public final char getAlphabeticShortcut() {
        return this.f3182j;
    }

    public final CharSequence getContentDescription() {
        return this.f3189q;
    }

    public final int getGroupId() {
        return this.f3174b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f3184l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f3185m;
        if (i3 == 0) {
            return null;
        }
        Drawable a2 = C0159a.a(this.f3186n.f3151a, i3);
        this.f3185m = 0;
        this.f3184l = a2;
        return b(a2);
    }

    public final ColorStateList getIconTintList() {
        return this.f3191s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3192t;
    }

    public final Intent getIntent() {
        return this.f3179g;
    }

    public final int getItemId() {
        return this.f3173a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f3181i;
    }

    public final char getNumericShortcut() {
        return this.f3180h;
    }

    public final int getOrder() {
        return this.f3175c;
    }

    public final SubMenu getSubMenu() {
        return this.f3187o;
    }

    public final CharSequence getTitle() {
        return this.f3177e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3178f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f3177e;
    }

    public final CharSequence getTooltipText() {
        return this.f3190r;
    }

    public final boolean hasSubMenu() {
        if (this.f3187o != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f3172B;
    }

    public final boolean isCheckable() {
        if ((this.f3195x & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f3195x & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f3195x & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f3195x & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i3;
        this.f3197z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f3173a) > 0) {
            view.setId(i3);
        }
        C0207i iVar = this.f3186n;
        iVar.f3161k = true;
        iVar.o(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f3182j == c3) {
            return this;
        }
        this.f3182j = Character.toLowerCase(c3);
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.f3195x;
        boolean z4 = z3 | (i3 & true);
        this.f3195x = z4 ? 1 : 0;
        if (i3 != z4) {
            this.f3186n.o(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z3) {
        boolean z4;
        int i3;
        int i4 = this.f3195x;
        int i5 = 2;
        if ((i4 & 4) != 0) {
            C0207i iVar = this.f3186n;
            iVar.getClass();
            ArrayList arrayList = iVar.f3156f;
            int size = arrayList.size();
            iVar.s();
            for (int i6 = 0; i6 < size; i6++) {
                C0208j jVar = (C0208j) arrayList.get(i6);
                if (jVar.f3174b == this.f3174b && (jVar.f3195x & 4) != 0 && jVar.isCheckable()) {
                    if (jVar == this) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i7 = jVar.f3195x;
                    int i8 = i7 & -3;
                    if (z4) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i9 = i3 | i8;
                    jVar.f3195x = i9;
                    if (i7 != i9) {
                        jVar.f3186n.o(false);
                    }
                }
            }
            iVar.r();
        } else {
            int i10 = i4 & -3;
            if (!z3) {
                i5 = 0;
            }
            int i11 = i10 | i5;
            this.f3195x = i11;
            if (i4 != i11) {
                this.f3186n.o(false);
            }
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f3195x |= 16;
        } else {
            this.f3195x &= -17;
        }
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3185m = 0;
        this.f3184l = drawable;
        this.f3194w = true;
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3191s = colorStateList;
        this.f3193u = true;
        this.f3194w = true;
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3192t = mode;
        this.v = true;
        this.f3194w = true;
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3179g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        if (this.f3180h == c3) {
            return this;
        }
        this.f3180h = c3;
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3171A = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3188p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c3, char c4) {
        this.f3180h = c3;
        this.f3182j = Character.toLowerCase(c4);
        this.f3186n.o(false);
        return this;
    }

    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 == 0 || i4 == 1 || i4 == 2) {
            this.f3196y = i3;
            C0207i iVar = this.f3186n;
            iVar.f3161k = true;
            iVar.o(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3177e = charSequence;
        this.f3186n.o(false);
        C0217s sVar = this.f3187o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3178f = charSequence;
        this.f3186n.o(false);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z3) {
        int i3;
        int i4 = this.f3195x;
        int i5 = i4 & -9;
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        int i6 = i3 | i5;
        this.f3195x = i6;
        if (i4 != i6) {
            C0207i iVar = this.f3186n;
            iVar.f3158h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3177e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f3182j == c3 && this.f3183k == i3) {
            return this;
        }
        this.f3182j = Character.toLowerCase(c3);
        this.f3183k = KeyEvent.normalizeMetaState(i3);
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f3180h == c3 && this.f3181i == i3) {
            return this;
        }
        this.f3180h = c3;
        this.f3181i = KeyEvent.normalizeMetaState(i3);
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f3180h = c3;
        this.f3181i = KeyEvent.normalizeMetaState(i3);
        this.f3182j = Character.toLowerCase(c4);
        this.f3183k = KeyEvent.normalizeMetaState(i4);
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setIcon(int i3) {
        this.f3184l = null;
        this.f3185m = i3;
        this.f3194w = true;
        this.f3186n.o(false);
        return this;
    }

    public final MenuItem setTitle(int i3) {
        setTitle((CharSequence) this.f3186n.f3151a.getString(i3));
        return this;
    }

    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f3186n.f3151a;
        View inflate = LayoutInflater.from(context).inflate(i3, new LinearLayout(context), false);
        this.f3197z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f3173a) > 0) {
            inflate.setId(i4);
        }
        C0207i iVar = this.f3186n;
        iVar.f3161k = true;
        iVar.o(true);
        return this;
    }
}
