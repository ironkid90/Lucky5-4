package A;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: A.i  reason: case insensitive filesystem */
public final class C0008i {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f49a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f50b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f51c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f52d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f53e;

    public C0008i(ViewGroup viewGroup) {
        this.f51c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent e2;
        if (!this.f52d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return F.a(e2, this.f51c, f3, f4, z3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f3, float f4) {
        ViewParent e2;
        if (!this.f52d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return F.b(e2, this.f51c, f3, f4);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean c(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        ViewParent e2;
        int i6;
        int i7;
        if (!this.f52d || (e2 = e(i5)) == null) {
            return false;
        }
        if (i3 != 0 || i4 != 0) {
            ViewGroup viewGroup = this.f51c;
            if (iArr2 != null) {
                viewGroup.getLocationInWindow(iArr2);
                i7 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i7 = 0;
                i6 = 0;
            }
            if (iArr == null) {
                if (this.f53e == null) {
                    this.f53e = new int[2];
                }
                iArr = this.f53e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            if (e2 instanceof C0009j) {
                ((C0009j) e2).d(i3, i4, iArr, i5);
            } else if (i5 == 0) {
                try {
                    F.c(e2, viewGroup, i3, i4, iArr);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
                }
            }
            if (iArr2 != null) {
                viewGroup.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i7;
                iArr2[1] = iArr2[1] - i6;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e2;
        int i8;
        int i9;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i10 = i7;
        if (!this.f52d || (e2 = e(i10)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f51c;
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i8 = iArr4[1];
        } else {
            i9 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f53e == null) {
                this.f53e = new int[2];
            }
            int[] iArr5 = this.f53e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof C0010k) {
            ((C0010k) e2).e(viewGroup, i3, i4, i5, i6, i7, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i5;
            iArr3[1] = iArr3[1] + i6;
            if (e2 instanceof C0009j) {
                ((C0009j) e2).b(viewGroup, i3, i4, i5, i6, i7);
            } else if (i10 == 0) {
                try {
                    F.d(e2, viewGroup, i3, i4, i5, i6);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e3);
                }
            }
        }
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i8;
        }
        return true;
    }

    public final ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f49a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f50b;
    }

    public final boolean f(int i3) {
        if (e(i3) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3, int i4) {
        boolean z3;
        if (f(i4)) {
            return true;
        }
        if (this.f52d) {
            View view = this.f51c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof C0009j;
                if (z4) {
                    z3 = ((C0009j) parent).f(view2, view, i3, i4);
                } else {
                    if (i4 == 0) {
                        try {
                            z3 = F.f(parent, view2, view, i3);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z3 = false;
                }
                if (z3) {
                    if (i4 == 0) {
                        this.f49a = parent;
                    } else if (i4 == 1) {
                        this.f50b = parent;
                    }
                    if (z4) {
                        ((C0009j) parent).a(view2, view, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            F.e(parent, view2, view, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i3) {
        ViewParent e2 = e(i3);
        if (e2 != null) {
            boolean z3 = e2 instanceof C0009j;
            ViewGroup viewGroup = this.f51c;
            if (z3) {
                ((C0009j) e2).c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    F.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i3 == 0) {
                this.f49a = null;
            } else if (i3 == 1) {
                this.f50b = null;
            }
        }
    }
}
