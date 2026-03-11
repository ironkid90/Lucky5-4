package j;

import A.A;
import A.C;
import A.E;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.ai9poker.app.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class q0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    public static q0 f3762j;

    /* renamed from: k  reason: collision with root package name */
    public static q0 f3763k;

    /* renamed from: a  reason: collision with root package name */
    public final View f3764a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f3765b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3766c;

    /* renamed from: d  reason: collision with root package name */
    public final p0 f3767d = new p0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final p0 f3768e = new p0(this, 1);

    /* renamed from: f  reason: collision with root package name */
    public int f3769f;

    /* renamed from: g  reason: collision with root package name */
    public int f3770g;

    /* renamed from: h  reason: collision with root package name */
    public r0 f3771h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3772i;

    public q0(View view, CharSequence charSequence) {
        int i3;
        this.f3764a = view;
        this.f3765b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = E.f2a;
        if (Build.VERSION.SDK_INT >= 28) {
            i3 = C.a(viewConfiguration);
        } else {
            i3 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f3766c = i3;
        this.f3769f = Integer.MAX_VALUE;
        this.f3770g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(q0 q0Var) {
        q0 q0Var2 = f3762j;
        if (q0Var2 != null) {
            q0Var2.f3764a.removeCallbacks(q0Var2.f3767d);
        }
        f3762j = q0Var;
        if (q0Var != null) {
            q0Var.f3764a.postDelayed(q0Var.f3767d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        q0 q0Var = f3763k;
        View view = this.f3764a;
        if (q0Var == this) {
            f3763k = null;
            r0 r0Var = this.f3771h;
            if (r0Var != null) {
                View view2 = (View) r0Var.f3774g;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) r0Var.f3773f).getSystemService("window")).removeView(view2);
                }
                this.f3771h = null;
                this.f3769f = Integer.MAX_VALUE;
                this.f3770g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3762j == this) {
            b((q0) null);
        }
        view.removeCallbacks(this.f3768e);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [j.r0, java.lang.Object] */
    public final void c(boolean z3) {
        int i3;
        int i4;
        int i5;
        String str;
        long j3;
        long longPressTimeout;
        long j4;
        String str2;
        int i6;
        int i7;
        Field field = A.f0a;
        View view = this.f3764a;
        if (view.isAttachedToWindow()) {
            b((q0) null);
            q0 q0Var = f3763k;
            if (q0Var != null) {
                q0Var.a();
            }
            f3763k = this;
            this.f3772i = z3;
            Context context = view.getContext();
            ? obj = new Object();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            obj.f3776i = layoutParams;
            obj.f3777j = new Rect();
            obj.f3778k = new int[2];
            obj.f3779l = new int[2];
            obj.f3773f = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            obj.f3774g = inflate;
            obj.f3775h = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(r0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131689476;
            layoutParams.flags = 24;
            this.f3771h = obj;
            int i8 = this.f3769f;
            int i9 = this.f3770g;
            boolean z4 = this.f3772i;
            View view2 = (View) obj.f3774g;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) obj.f3773f;
            if (!(parent == null || view2.getParent() == null)) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) obj.f3775h).setText(this.f3765b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f3776i;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i3 = i9 + dimensionPixelOffset2;
                i4 = i9 - dimensionPixelOffset2;
            } else {
                i3 = view.getHeight();
                i4 = 0;
            }
            layoutParams2.gravity = 49;
            Resources resources = context2.getResources();
            if (z4) {
                i5 = R.dimen.tooltip_y_offset_touch;
            } else {
                i5 = R.dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    } else if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    } else {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str = "window";
            } else {
                Rect rect = (Rect) obj.f3777j;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str2 = "window";
                    i6 = 0;
                } else {
                    Resources resources2 = context2.getResources();
                    str2 = "window";
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i7 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i7 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, i7, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) obj.f3779l;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) obj.f3778k;
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i10;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i10 + i8) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[1];
                int i12 = ((i4 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + i3 + dimensionPixelOffset3;
                if (z4) {
                    if (i12 >= 0) {
                        layoutParams2.y = i12;
                    } else {
                        layoutParams2.y = i13;
                    }
                } else if (measuredHeight + i13 <= rect.height()) {
                    layoutParams2.y = i13;
                } else {
                    layoutParams2.y = i12;
                }
                str = str2;
            }
            ((WindowManager) context2.getSystemService(str)).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f3772i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j3 = j4 - longPressTimeout;
            }
            p0 p0Var = this.f3768e;
            view.removeCallbacks(p0Var);
            view.postDelayed(p0Var, j3);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3771h != null && this.f3772i) {
            return false;
        }
        View view2 = this.f3764a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f3769f = Integer.MAX_VALUE;
                this.f3770g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f3771h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int abs = Math.abs(x2 - this.f3769f);
            int i3 = this.f3766c;
            if (abs > i3 || Math.abs(y2 - this.f3770g) > i3) {
                this.f3769f = x2;
                this.f3770g = y2;
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f3769f = view.getWidth() / 2;
        this.f3770g = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
