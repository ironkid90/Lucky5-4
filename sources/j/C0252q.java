package j;

import U.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import c2.n;
import f.C0159a;

/* renamed from: j.q  reason: case insensitive filesystem */
public class C0252q extends ImageView {

    /* renamed from: f  reason: collision with root package name */
    public final C0249n f3760f;

    /* renamed from: g  reason: collision with root package name */
    public final n f3761g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0252q(Context context, int i3) {
        super(context, (AttributeSet) null, i3);
        h0.a(context);
        C0249n nVar = new C0249n(this);
        this.f3760f = nVar;
        nVar.b((AttributeSet) null, i3);
        n nVar2 = new n((ImageView) this);
        this.f3761g = nVar2;
        nVar2.l(i3);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0249n nVar = this.f3760f;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f3761g;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar;
        C0249n nVar = this.f3760f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1754c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar;
        C0249n nVar = this.f3760f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1755d;
    }

    public ColorStateList getSupportImageTintList() {
        d dVar;
        n nVar = this.f3761g;
        if (nVar == null || (dVar = (d) nVar.f2790h) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1754c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d dVar;
        n nVar = this.f3761g;
        if (nVar == null || (dVar = (d) nVar.f2790h) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1755d;
    }

    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.f3761g.f2789g).getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0249n nVar = this.f3760f;
        if (nVar != null) {
            nVar.f3734c = -1;
            nVar.d((ColorStateList) null);
            nVar.a();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0249n nVar = this.f3760f;
        if (nVar != null) {
            nVar.c(i3);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f3761g;
        if (nVar != null) {
            nVar.f();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f3761g;
        if (nVar != null) {
            nVar.f();
        }
    }

    public void setImageResource(int i3) {
        n nVar = this.f3761g;
        if (nVar != null) {
            ImageView imageView = (ImageView) nVar.f2789g;
            if (i3 != 0) {
                Drawable a2 = C0159a.a(imageView.getContext(), i3);
                if (a2 != null) {
                    Rect rect = C0258x.f3811a;
                }
                imageView.setImageDrawable(a2);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            nVar.f();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f3761g;
        if (nVar != null) {
            nVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0249n nVar = this.f3760f;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0249n nVar = this.f3760f;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f3761g;
        if (nVar != null) {
            if (((d) nVar.f2790h) == null) {
                nVar.f2790h = new Object();
            }
            d dVar = (d) nVar.f2790h;
            dVar.f1754c = colorStateList;
            dVar.f1753b = true;
            nVar.f();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f3761g;
        if (nVar != null) {
            if (((d) nVar.f2790h) == null) {
                nVar.f2790h = new Object();
            }
            d dVar = (d) nVar.f2790h;
            dVar.f1755d = mode;
            dVar.f1752a = true;
            nVar.f();
        }
    }
}
