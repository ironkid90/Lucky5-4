package T;

import A.A;
import C0.e;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: T.g  reason: case insensitive filesystem */
public final class C0086g {

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f1608x = {16842919};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f1609y = new int[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f1610a;

    /* renamed from: b  reason: collision with root package name */
    public final StateListDrawable f1611b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f1612c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1613d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1614e;

    /* renamed from: f  reason: collision with root package name */
    public final StateListDrawable f1615f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f1616g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1617h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1618i;

    /* renamed from: j  reason: collision with root package name */
    public float f1619j;

    /* renamed from: k  reason: collision with root package name */
    public float f1620k;

    /* renamed from: l  reason: collision with root package name */
    public int f1621l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f1622m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f1623n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1624o = false;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1625p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f1626q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1627r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1628s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1629t = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public final ValueAnimator f1630u;
    public int v;

    /* renamed from: w  reason: collision with root package name */
    public final e f1631w;

    public C0086g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        boolean z3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1630u = ofFloat;
        this.v = 0;
        e eVar = new e(6, (Object) this);
        this.f1631w = eVar;
        Object obj = new Object();
        this.f1611b = stateListDrawable;
        this.f1612c = drawable;
        this.f1615f = stateListDrawable2;
        this.f1616g = drawable2;
        this.f1613d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f1614e = Math.max(i3, drawable.getIntrinsicWidth());
        this.f1617h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f1618i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f1610a = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0084e(this));
        ofFloat.addUpdateListener(new C0085f(this));
        RecyclerView recyclerView2 = this.f1623n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                t tVar = recyclerView2.f2626n;
                if (tVar != null) {
                    tVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f2627o;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    if (recyclerView2.getOverScrollMode() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    recyclerView2.setWillNotDraw(z3);
                }
                recyclerView2.m();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f1623n;
                recyclerView3.f2628p.remove(this);
                if (recyclerView3.f2629q == this) {
                    recyclerView3.f2629q = null;
                }
                ArrayList arrayList2 = this.f1623n.f2611d0;
                if (arrayList2 != null) {
                    arrayList2.remove(obj);
                }
                this.f1623n.removeCallbacks(eVar);
            }
            this.f1623n = recyclerView;
            if (recyclerView != null) {
                t tVar2 = recyclerView.f2626n;
                if (tVar2 != null) {
                    tVar2.a("Cannot add item decoration during a scroll  or layout");
                }
                ArrayList arrayList3 = recyclerView.f2627o;
                if (arrayList3.isEmpty()) {
                    recyclerView.setWillNotDraw(false);
                }
                arrayList3.add(this);
                recyclerView.m();
                recyclerView.requestLayout();
                this.f1623n.f2628p.add(this);
                RecyclerView recyclerView4 = this.f1623n;
                if (recyclerView4.f2611d0 == null) {
                    recyclerView4.f2611d0 = new ArrayList();
                }
                recyclerView4.f2611d0.add(obj);
            }
        }
    }

    public static int d(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / ((float) i6)) * ((float) i7));
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    public final boolean a(float f3, float f4) {
        if (f4 < ((float) (this.f1622m - this.f1617h)) || f3 < ((float) (0 - (0 / 2))) || f3 > ((float) ((0 / 2) + 0))) {
            return false;
        }
        return true;
    }

    public final boolean b(float f3, float f4) {
        boolean z3;
        RecyclerView recyclerView = this.f1623n;
        Field field = A.f0a;
        if (recyclerView.getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = this.f1613d;
        if (z3) {
            if (f3 > ((float) (i3 / 2))) {
                return false;
            }
        } else if (f3 < ((float) (this.f1621l - i3))) {
            return false;
        }
        int i4 = 0 / 2;
        if (f4 < ((float) (0 - i4)) || f4 > ((float) (i4 + 0))) {
            return false;
        }
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i3 = this.f1626q;
        if (i3 == 1) {
            boolean b3 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b3 && !a2) {
                return false;
            }
            if (a2) {
                this.f1627r = 1;
                this.f1620k = (float) ((int) motionEvent.getX());
            } else if (b3) {
                this.f1627r = 2;
                this.f1619j = (float) ((int) motionEvent.getY());
            }
            e(2);
        } else if (i3 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i3) {
        e eVar = this.f1631w;
        StateListDrawable stateListDrawable = this.f1611b;
        if (i3 == 2 && this.f1626q != 2) {
            stateListDrawable.setState(f1608x);
            this.f1623n.removeCallbacks(eVar);
        }
        if (i3 == 0) {
            this.f1623n.invalidate();
        } else {
            f();
        }
        if (this.f1626q == 2 && i3 != 2) {
            stateListDrawable.setState(f1609y);
            this.f1623n.removeCallbacks(eVar);
            this.f1623n.postDelayed(eVar, (long) 1200);
        } else if (i3 == 1) {
            this.f1623n.removeCallbacks(eVar);
            this.f1623n.postDelayed(eVar, (long) 1500);
        }
        this.f1626q = i3;
    }

    public final void f() {
        int i3 = this.v;
        ValueAnimator valueAnimator = this.f1630u;
        if (i3 != 0) {
            if (i3 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.v = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
