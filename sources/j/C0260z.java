package j;

import C0.e;
import F.f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ai9poker.app.R;
import java.lang.reflect.Field;

/* renamed from: j.z  reason: case insensitive filesystem */
public abstract class C0260z extends ListView {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3815f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public int f3816g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3817h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3818i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f3819j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f3820k;

    /* renamed from: l  reason: collision with root package name */
    public final Field f3821l;

    /* renamed from: m  reason: collision with root package name */
    public C0259y f3822m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3823n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f3824o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3825p;

    /* renamed from: q  reason: collision with root package name */
    public f f3826q;

    /* renamed from: r  reason: collision with root package name */
    public e f3827r;

    public C0260z(Context context, boolean z3) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f3824o = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3821l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i3, int i4) {
        int i5;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            if (i9 > 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i3, i5);
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return i4;
            }
        }
        return i6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            int r3 = r18.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001c
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r6 = r4
            goto L_0x0129
        L_0x0015:
            r6 = r5
            goto L_0x0129
        L_0x0018:
            r0 = r17
            r6 = r4
            goto L_0x001f
        L_0x001c:
            r0 = r17
            r6 = r5
        L_0x001f:
            int r0 = r2.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r7 = r2.getX(r0)
            int r7 = (int) r7
            float r0 = r2.getY(r0)
            int r0 = (int) r0
            int r8 = r1.pointToPosition(r7, r0)
            r9 = -1
            if (r8 != r9) goto L_0x003a
            r5 = r4
            goto L_0x0129
        L_0x003a:
            int r6 = r16.getFirstVisiblePosition()
            int r6 = r8 - r6
            android.view.View r6 = r1.getChildAt(r6)
            float r7 = (float) r7
            float r10 = (float) r0
            r1.f3825p = r4
            r1.drawableHotspotChanged(r7, r10)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0054
            r1.setPressed(r4)
        L_0x0054:
            r16.layoutChildren()
            int r0 = r1.f3820k
            if (r0 == r9) goto L_0x0071
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x0071
            if (r0 == r6) goto L_0x0071
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x0071
            r0.setPressed(r5)
        L_0x0071:
            r1.f3820k = r8
            int r0 = r6.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r6.getTop()
            float r11 = (float) r11
            float r11 = r10 - r11
            r6.drawableHotspotChanged(r0, r11)
            boolean r0 = r6.isPressed()
            if (r0 != 0) goto L_0x008d
            r6.setPressed(r4)
        L_0x008d:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0097
            if (r8 == r9) goto L_0x0097
            r12 = r4
            goto L_0x0098
        L_0x0097:
            r12 = r5
        L_0x0098:
            if (r12 == 0) goto L_0x009d
            r11.setVisible(r5, r5)
        L_0x009d:
            java.lang.reflect.Field r0 = r1.f3821l
            int r13 = r6.getLeft()
            int r14 = r6.getTop()
            int r15 = r6.getRight()
            int r5 = r6.getBottom()
            android.graphics.Rect r9 = r1.f3815f
            r9.set(r13, r14, r15, r5)
            int r5 = r9.left
            int r13 = r1.f3816g
            int r5 = r5 - r13
            r9.left = r5
            int r5 = r9.top
            int r13 = r1.f3817h
            int r5 = r5 - r13
            r9.top = r5
            int r5 = r9.right
            int r13 = r1.f3818i
            int r5 = r5 + r13
            r9.right = r5
            int r5 = r9.bottom
            int r13 = r1.f3819j
            int r5 = r5 + r13
            r9.bottom = r5
            boolean r5 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00e9 }
            boolean r13 = r6.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e9 }
            if (r13 == r5) goto L_0x00ed
            r5 = r5 ^ r4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x00e9 }
            r0.set(r1, r5)     // Catch:{ IllegalAccessException -> 0x00e9 }
            r5 = -1
            if (r8 == r5) goto L_0x00ed
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ed:
            if (r12 == 0) goto L_0x0108
            float r0 = r9.exactCenterX()
            float r5 = r9.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x0100
            r9 = r4
        L_0x00fe:
            r12 = 0
            goto L_0x0102
        L_0x0100:
            r9 = 0
            goto L_0x00fe
        L_0x0102:
            r11.setVisible(r9, r12)
            u.C0489a.e(r11, r0, r5)
        L_0x0108:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0114
            r5 = -1
            if (r8 == r5) goto L_0x0114
            u.C0489a.e(r0, r7, r10)
        L_0x0114:
            j.y r0 = r1.f3822m
            if (r0 == 0) goto L_0x011b
            r5 = 0
            r0.f3814g = r5
        L_0x011b:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0127
            long r9 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r6, r8, r9)
        L_0x0127:
            r6 = r4
            r5 = 0
        L_0x0129:
            if (r6 == 0) goto L_0x012d
            if (r5 == 0) goto L_0x0146
        L_0x012d:
            r3 = 0
            r1.f3825p = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r0 = r1.f3820k
            int r5 = r16.getFirstVisiblePosition()
            int r0 = r0 - r5
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x0146
            r0.setPressed(r3)
        L_0x0146:
            if (r6 == 0) goto L_0x015d
            F.f r0 = r1.f3826q
            if (r0 != 0) goto L_0x0153
            F.f r0 = new F.f
            r0.<init>(r1)
            r1.f3826q = r0
        L_0x0153:
            F.f r0 = r1.f3826q
            boolean r3 = r0.f286p
            r0.f286p = r4
            r0.onTouch(r1, r2)
            goto L_0x016b
        L_0x015d:
            F.f r0 = r1.f3826q
            if (r0 == 0) goto L_0x016b
            boolean r2 = r0.f286p
            if (r2 == 0) goto L_0x0168
            r0.d()
        L_0x0168:
            r2 = 0
            r0.f286p = r2
        L_0x016b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0260z.b(int, android.view.MotionEvent):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3815f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f3827r == null) {
            super.drawableStateChanged();
            C0259y yVar = this.f3822m;
            if (yVar != null) {
                yVar.f3814g = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f3825p && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f3824o || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f3824o || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f3824o || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f3824o || !this.f3823n) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.f3827r = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3827r == null) {
            e eVar = new e(13, (Object) this);
            this.f3827r = eVar;
            post(eVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3825p && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3820k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        e eVar = this.f3827r;
        if (eVar != null) {
            C0260z zVar = (C0260z) eVar.f124g;
            zVar.f3827r = null;
            zVar.removeCallbacks(eVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f3823n = z3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [j.y, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        C0259y yVar = null;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f3813f;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.f3813f = drawable;
            drawable.setCallback(drawable2);
            drawable2.f3814g = true;
            yVar = drawable2;
        }
        this.f3822m = yVar;
        super.setSelector(yVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3816g = rect.left;
        this.f3817h = rect.top;
        this.f3818i = rect.right;
        this.f3819j = rect.bottom;
    }
}
