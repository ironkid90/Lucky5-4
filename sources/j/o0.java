package j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class o0 implements C0257w {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f3743a;

    /* renamed from: b  reason: collision with root package name */
    public int f3744b;

    /* renamed from: c  reason: collision with root package name */
    public View f3745c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f3746d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f3747e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f3748f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3749g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f3750h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f3751i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3752j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f3753k;

    /* renamed from: l  reason: collision with root package name */
    public int f3754l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f3755m;

    public final void a(int i3) {
        View view;
        int i4 = this.f3744b ^ i3;
        this.f3744b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f3744b & 4;
                Toolbar toolbar = this.f3743a;
                if (i5 != 0) {
                    Drawable drawable = this.f3748f;
                    if (drawable == null) {
                        drawable = this.f3755m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f3743a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f3750h);
                    toolbar2.setSubtitle(this.f3751i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) != 0 && (view = this.f3745c) != null) {
                if ((i3 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f3744b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3752j);
            Toolbar toolbar = this.f3743a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3754l);
            } else {
                toolbar.setNavigationContentDescription(this.f3752j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f3744b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f3747e;
            if (drawable == null) {
                drawable = this.f3746d;
            }
        } else {
            drawable = this.f3746d;
        }
        this.f3743a.setLogo(drawable);
    }
}
