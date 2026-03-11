package androidx.recyclerview.widget;

import A.A;
import A.C0008i;
import A.C0017s;
import A2.h;
import A2.i;
import B.m;
import C0.e;
import D0.g;
import G0.f;
import H.c;
import T.B;
import T.C;
import T.C0081b;
import T.C0086g;
import T.C0087h;
import T.C0089j;
import T.D;
import T.E;
import T.G;
import T.N;
import T.o;
import T.p;
import T.q;
import T.r;
import T.s;
import T.t;
import T.u;
import T.v;
import T.w;
import T.x;
import T.y;
import T.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.ArrayList;
import w.d;

public class RecyclerView extends ViewGroup {
    public static final int[] m0 = {16843830};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f2584n0 = {16842987};

    /* renamed from: o0  reason: collision with root package name */
    public static final Class[] f2585o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final o f2586p0 = new Object();

    /* renamed from: A  reason: collision with root package name */
    public boolean f2587A;

    /* renamed from: B  reason: collision with root package name */
    public int f2588B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2589C;

    /* renamed from: D  reason: collision with root package name */
    public r f2590D;

    /* renamed from: E  reason: collision with root package name */
    public EdgeEffect f2591E;

    /* renamed from: F  reason: collision with root package name */
    public EdgeEffect f2592F;

    /* renamed from: G  reason: collision with root package name */
    public EdgeEffect f2593G;

    /* renamed from: H  reason: collision with root package name */
    public EdgeEffect f2594H;

    /* renamed from: I  reason: collision with root package name */
    public s f2595I;
    public int J;

    /* renamed from: K  reason: collision with root package name */
    public int f2596K;

    /* renamed from: L  reason: collision with root package name */
    public VelocityTracker f2597L;

    /* renamed from: M  reason: collision with root package name */
    public int f2598M;

    /* renamed from: N  reason: collision with root package name */
    public int f2599N;

    /* renamed from: O  reason: collision with root package name */
    public int f2600O;

    /* renamed from: P  reason: collision with root package name */
    public int f2601P;

    /* renamed from: Q  reason: collision with root package name */
    public int f2602Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f2603R;

    /* renamed from: S  reason: collision with root package name */
    public final int f2604S;

    /* renamed from: T  reason: collision with root package name */
    public final float f2605T;

    /* renamed from: U  reason: collision with root package name */
    public final float f2606U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2607V;

    /* renamed from: W  reason: collision with root package name */
    public final E f2608W;

    /* renamed from: a0  reason: collision with root package name */
    public C0089j f2609a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C0087h f2610b0;
    public final C c0;

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f2611d0;

    /* renamed from: e0  reason: collision with root package name */
    public final f f2612e0;

    /* renamed from: f  reason: collision with root package name */
    public final z f2613f = new z(this);

    /* renamed from: f0  reason: collision with root package name */
    public G f2614f0;

    /* renamed from: g  reason: collision with root package name */
    public B f2615g;

    /* renamed from: g0  reason: collision with root package name */
    public C0008i f2616g0;

    /* renamed from: h  reason: collision with root package name */
    public final C0.f f2617h;

    /* renamed from: h0  reason: collision with root package name */
    public final int[] f2618h0;

    /* renamed from: i  reason: collision with root package name */
    public final C0.f f2619i;
    public final int[] i0;

    /* renamed from: j  reason: collision with root package name */
    public final g f2620j = new g(9);

    /* renamed from: j0  reason: collision with root package name */
    public final int[] f2621j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2622k;
    public final ArrayList k0;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f2623l = new Rect();

    /* renamed from: l0  reason: collision with root package name */
    public final e f2624l0;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f2625m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    public t f2626n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f2627o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f2628p;

    /* renamed from: q  reason: collision with root package name */
    public C0086g f2629q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2630r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2631s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2632t;

    /* renamed from: u  reason: collision with root package name */
    public int f2633u;
    public boolean v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2634w;

    /* renamed from: x  reason: collision with root package name */
    public int f2635x;

    /* renamed from: y  reason: collision with root package name */
    public final AccessibilityManager f2636y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2637z;

    /* JADX WARNING: type inference failed for: r0v6, types: [T.o, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f2585o0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [T.r, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [T.s, T.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Object, T.h] */
    /* JADX WARNING: type inference failed for: r3v17, types: [T.C, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r22, android.util.AttributeSet r23) {
        /*
            r21 = this;
            r10 = r21
            r11 = r22
            r12 = r23
            r0 = 7
            r1 = 8
            r13 = 0
            r10.<init>(r11, r12, r13)
            T.z r2 = new T.z
            r2.<init>(r10)
            r10.f2613f = r2
            D0.g r2 = new D0.g
            r3 = 9
            r2.<init>((int) r3)
            r10.f2620j = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.f2623l = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.f2625m = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.f2627o = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.f2628p = r2
            r10.f2633u = r13
            r10.f2637z = r13
            r10.f2587A = r13
            r10.f2588B = r13
            r10.f2589C = r13
            T.r r2 = new T.r
            r2.<init>()
            r10.f2590D = r2
            T.c r2 = new T.c
            r2.<init>()
            r14 = 0
            r2.f1655a = r14
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1656b = r3
            r3 = 250(0xfa, double:1.235E-321)
            r2.f1657c = r3
            r2.f1658d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1594e = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1595f = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1596g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1597h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1598i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1599j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1600k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1601l = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1602m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1603n = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1604o = r3
            r10.f2595I = r2
            r10.J = r13
            r2 = -1
            r10.f2596K = r2
            r3 = 1
            r10.f2605T = r3
            r10.f2606U = r3
            r15 = 1
            r10.f2607V = r15
            T.E r3 = new T.E
            r3.<init>(r10)
            r10.f2608W = r3
            T.h r3 = new T.h
            r3.<init>()
            r10.f2610b0 = r3
            T.C r3 = new T.C
            r3.<init>()
            r3.f1553a = r13
            r3.f1554b = r13
            r3.f1555c = r13
            r3.f1556d = r13
            r3.f1557e = r13
            r10.c0 = r3
            G0.f r3 = new G0.f
            r3.<init>(r1)
            r10.f2612e0 = r3
            r9 = 2
            int[] r4 = new int[r9]
            r10.f2618h0 = r4
            int[] r4 = new int[r9]
            r10.i0 = r4
            int[] r4 = new int[r9]
            r10.f2621j0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10.k0 = r4
            C0.e r4 = new C0.e
            r4.<init>((int) r0, (java.lang.Object) r10)
            r10.f2624l0 = r4
            if (r12 == 0) goto L_0x0113
            int[] r4 = f2584n0
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r4, r13, r13)
            boolean r5 = r4.getBoolean(r13, r15)
            r10.f2622k = r5
            r4.recycle()
            goto L_0x0115
        L_0x0113:
            r10.f2622k = r15
        L_0x0115:
            r10.setScrollContainer(r15)
            r10.setFocusableInTouchMode(r15)
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r22)
            int r5 = r4.getScaledTouchSlop()
            r10.f2602Q = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x0132
            java.lang.reflect.Method r7 = A.E.f2a
            float r7 = A.B.a(r4)
            goto L_0x0136
        L_0x0132:
            float r7 = A.E.a(r4, r11)
        L_0x0136:
            r10.f2605T = r7
            if (r5 < r6) goto L_0x013f
            float r7 = A.B.b(r4)
            goto L_0x0143
        L_0x013f:
            float r7 = A.E.a(r4, r11)
        L_0x0143:
            r10.f2606U = r7
            int r7 = r4.getScaledMinimumFlingVelocity()
            r10.f2603R = r7
            int r4 = r4.getScaledMaximumFlingVelocity()
            r10.f2604S = r4
            int r4 = r21.getOverScrollMode()
            if (r4 != r9) goto L_0x0159
            r4 = r15
            goto L_0x015a
        L_0x0159:
            r4 = r13
        L_0x015a:
            r10.setWillNotDraw(r4)
            T.s r4 = r10.f2595I
            r4.f1655a = r3
            C0.f r3 = new C0.f
            D0.g r4 = new D0.g
            r4.<init>((androidx.recyclerview.widget.RecyclerView) r10)
            r3.<init>((D0.g) r4)
            r10.f2617h = r3
            C0.f r3 = new C0.f
            B.m r4 = new B.m
            r7 = 15
            r4.<init>((int) r7, (java.lang.Object) r10)
            r3.<init>((B.m) r4)
            r10.f2619i = r3
            java.lang.reflect.Field r3 = A.A.f0a
            if (r5 < r6) goto L_0x0184
            int r3 = A.C0019u.c(r21)
            goto L_0x0185
        L_0x0184:
            r3 = r13
        L_0x0185:
            if (r3 != 0) goto L_0x018c
            if (r5 < r6) goto L_0x018c
            A.C0019u.m(r10, r1)
        L_0x018c:
            int r1 = r21.getImportantForAccessibility()
            if (r1 != 0) goto L_0x0195
            r10.setImportantForAccessibility(r15)
        L_0x0195:
            android.content.Context r1 = r21.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.f2636y = r1
            T.G r1 = new T.G
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r12 == 0) goto L_0x03b0
            int[] r3 = S.a.f1419a
            android.content.res.TypedArray r8 = r11.obtainStyledAttributes(r12, r3, r13, r13)
            java.lang.String r0 = r8.getString(r0)
            int r3 = r8.getInt(r15, r2)
            if (r3 != r2) goto L_0x01c2
            r10.setDescendantFocusability(r1)
        L_0x01c2:
            boolean r1 = r8.getBoolean(r9, r13)
            r7 = 4
            r6 = 3
            if (r1 == 0) goto L_0x0237
            r1 = 5
            android.graphics.drawable.Drawable r1 = r8.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r1 = 6
            android.graphics.drawable.Drawable r4 = r8.getDrawable(r1)
            android.graphics.drawable.Drawable r1 = r8.getDrawable(r6)
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            android.graphics.drawable.Drawable r16 = r8.getDrawable(r7)
            if (r3 == 0) goto L_0x021f
            if (r4 == 0) goto L_0x021f
            if (r5 == 0) goto L_0x021f
            if (r16 == 0) goto L_0x021f
            android.content.Context r1 = r21.getContext()
            android.content.res.Resources r1 = r1.getResources()
            T.g r2 = new T.g
            r6 = 2131099737(0x7f060059, float:1.7811836E38)
            int r18 = r1.getDimensionPixelSize(r6)
            r6 = 2131099739(0x7f06005b, float:1.781184E38)
            int r19 = r1.getDimensionPixelSize(r6)
            r6 = 2131099738(0x7f06005a, float:1.7811838E38)
            int r20 = r1.getDimensionPixelOffset(r6)
            r1 = r2
            r2 = r21
            r17 = 3
            r6 = r16
            r14 = r7
            r7 = r18
            r18 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x023e
        L_0x021f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r21.h()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0237:
            r17 = r6
            r14 = r7
            r18 = r8
            r19 = r9
        L_0x023e:
            r18.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r0 == 0) goto L_0x03a2
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x03a2
            char r2 = r0.charAt(r13)
            r3 = 46
            if (r2 != r3) goto L_0x026c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r22.getPackageName()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x026a:
            r2 = r0
            goto L_0x0292
        L_0x026c:
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0275
            goto L_0x026a
        L_0x0275:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r4 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x026a
        L_0x0292:
            boolean r0 = r21.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            if (r0 == 0) goto L_0x02af
            java.lang.Class r0 = r21.getClass()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            goto L_0x02b3
        L_0x02a1:
            r0 = move-exception
            goto L_0x0310
        L_0x02a3:
            r0 = move-exception
            goto L_0x032e
        L_0x02a6:
            r0 = move-exception
            goto L_0x034c
        L_0x02a9:
            r0 = move-exception
            goto L_0x0368
        L_0x02ac:
            r0 = move-exception
            goto L_0x0384
        L_0x02af:
            java.lang.ClassLoader r0 = r22.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
        L_0x02b3:
            java.lang.Class r0 = r0.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.Class<T.t> r3 = T.t.class
            java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.Class[] r0 = f2585o0     // Catch:{ NoSuchMethodException -> 0x02d7 }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x02d7 }
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ NoSuchMethodException -> 0x02d7 }
            r4[r13] = r11     // Catch:{ NoSuchMethodException -> 0x02d7 }
            r4[r15] = r12     // Catch:{ NoSuchMethodException -> 0x02d7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ NoSuchMethodException -> 0x02d7 }
            r4[r19] = r5     // Catch:{ NoSuchMethodException -> 0x02d7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ NoSuchMethodException -> 0x02d7 }
            r4[r17] = r5     // Catch:{ NoSuchMethodException -> 0x02d7 }
        L_0x02d5:
            r14 = r4
            goto L_0x02df
        L_0x02d7:
            r0 = move-exception
            r5 = r0
            r4 = 0
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x02ed }
            goto L_0x02d5
        L_0x02df:
            r0.setAccessible(r15)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            T.t r0 = (T.t) r0     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            goto L_0x03a2
        L_0x02ed:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.String r5 = r23.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02ac, InvocationTargetException -> 0x02a9, InstantiationException -> 0x02a6, IllegalAccessException -> 0x02a3, ClassCastException -> 0x02a1 }
        L_0x0310:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x032e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x034c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r23.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0368:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r23.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0384:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x03a2:
            int[] r0 = m0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r13)
            boolean r15 = r0.getBoolean(r13, r15)
            r0.recycle()
            goto L_0x03b3
        L_0x03b0:
            r10.setDescendantFocusability(r1)
        L_0x03b3:
            r10.setNestedScrollingEnabled(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0008i getScrollingChildHelper() {
        if (this.f2616g0 == null) {
            this.f2616g0 = new C0008i(this);
        }
        return this.f2616g0;
    }

    public static void j(View view) {
        if (view != null) {
            ((u) view.getLayoutParams()).getClass();
        }
    }

    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        t tVar = this.f2626n;
        if (tVar != null) {
            tVar.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b(String str) {
        if (this.f2588B > 0) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
            }
            throw new IllegalStateException(str);
        } else if (this.f2589C > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2591E;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z3 = false;
        } else {
            this.f2591E.onRelease();
            z3 = this.f2591E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2593G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2593G.onRelease();
            z3 |= this.f2593G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2592F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2592F.onRelease();
            z3 |= this.f2592F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2594H;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2594H.onRelease();
            z3 |= this.f2594H.isFinished();
        }
        if (z3) {
            Field field = A.f0a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof u) || !this.f2626n.d((u) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.b()) {
            return this.f2626n.f(this.c0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.b()) {
            this.f2626n.g(this.c0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.b()) {
            return this.f2626n.h(this.c0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.c()) {
            return this.f2626n.i(this.c0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.c()) {
            this.f2626n.j(this.c0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        t tVar = this.f2626n;
        if (tVar != null && tVar.c()) {
            return this.f2626n.k(this.c0);
        }
        return 0;
    }

    public final void d() {
        C0.f fVar = this.f2617h;
        if (!this.f2632t || this.f2637z) {
            int i3 = d.f4721a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
        } else if (((ArrayList) fVar.f127g).size() > 0) {
            fVar.getClass();
            if (((ArrayList) fVar.f127g).size() > 0) {
                int i4 = d.f4721a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, (int[]) null);
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f2627o;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C0086g gVar = (C0086g) arrayList.get(i5);
            if (gVar.f1621l != gVar.f1623n.getWidth() || gVar.f1622m != gVar.f1623n.getHeight()) {
                gVar.f1621l = gVar.f1623n.getWidth();
                gVar.f1622m = gVar.f1623n.getHeight();
                gVar.e(0);
            } else if (gVar.v != 0) {
                if (gVar.f1624o) {
                    int i6 = gVar.f1621l;
                    int i7 = gVar.f1613d;
                    int i8 = i6 - i7;
                    int i9 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = gVar.f1611b;
                    stateListDrawable.setBounds(0, 0, i7, 0);
                    int i10 = gVar.f1622m;
                    Drawable drawable = gVar.f1612c;
                    drawable.setBounds(0, 0, gVar.f1614e, i10);
                    RecyclerView recyclerView = gVar.f1623n;
                    Field field = A.f0a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate((float) i7, (float) i9);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate((float) (-i7), (float) (-i9));
                    } else {
                        canvas.translate((float) i8, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, (float) i9);
                        stateListDrawable.draw(canvas);
                        canvas.translate((float) (-i8), (float) (-i9));
                    }
                }
                if (gVar.f1625p) {
                    int i11 = gVar.f1622m;
                    int i12 = gVar.f1617h;
                    int i13 = i11 - i12;
                    int i14 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = gVar.f1615f;
                    stateListDrawable2.setBounds(0, 0, 0, i12);
                    int i15 = gVar.f1621l;
                    Drawable drawable2 = gVar.f1616g;
                    drawable2.setBounds(0, 0, i15, gVar.f1618i);
                    canvas.translate(0.0f, (float) i13);
                    drawable2.draw(canvas);
                    canvas.translate((float) i14, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate((float) (-i14), (float) (-i13));
                }
            }
        }
        EdgeEffect edgeEffect = this.f2591E;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            if (this.f2622k) {
                i4 = getPaddingBottom();
            } else {
                i4 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i4), 0.0f);
            EdgeEffect edgeEffect2 = this.f2591E;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2592F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2622k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2592F;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z5 = false;
            } else {
                z5 = true;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2593G;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f2622k) {
                i3 = getPaddingTop();
            } else {
                i3 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i3), (float) (-width));
            EdgeEffect edgeEffect6 = this.f2593G;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2594H;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2622k) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f2594H;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z3 |= z7;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.f2595I == null || arrayList.size() <= 0 || !this.f2595I.b()) {
            z6 = z3;
        }
        if (z6) {
            Field field2 = A.f0a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = A.f0a;
        setMeasuredDimension(t.e(i3, paddingRight, getMinimumWidth()), t.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, i5);
    }

    public final View focusSearch(View view, int i3) {
        int i4;
        int i5;
        this.f2626n.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (!(findNextFocus == null || findNextFocus == this || i(findNextFocus) == null)) {
                if (view == null || i(view) == null) {
                    return findNextFocus;
                }
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2623l;
                char c3 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f2625m;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f2626n.f1660b;
                Field field = A.f0a;
                if (recyclerView.getLayoutDirection() == 1) {
                    i4 = -1;
                } else {
                    i4 = 1;
                }
                int i6 = rect.left;
                int i7 = rect2.left;
                if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                    i5 = 1;
                } else {
                    int i8 = rect.right;
                    int i9 = rect2.right;
                    if ((i8 > i9 || i6 >= i9) && i6 > i7) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                    c3 = 1;
                } else {
                    int i12 = rect.bottom;
                    int i13 = rect2.bottom;
                    if ((i12 > i13 || i10 >= i13) && i10 > i11) {
                        c3 = 65535;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 != 66) {
                                    if (i3 != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i3 + h());
                                    } else if (c3 > 0) {
                                        return findNextFocus;
                                    }
                                } else if (i5 > 0) {
                                    return findNextFocus;
                                }
                            } else if (c3 < 0) {
                                return findNextFocus;
                            }
                        } else if (i5 < 0) {
                            return findNextFocus;
                        }
                    } else if (c3 > 0) {
                        return findNextFocus;
                    } else {
                        if (c3 == 0 && i5 * i4 >= 0) {
                            return findNextFocus;
                        }
                    }
                } else if (c3 < 0) {
                    return findNextFocus;
                } else {
                    if (c3 == 0 && i5 * i4 <= 0) {
                        return findNextFocus;
                    }
                }
            }
            return super.focusSearch(view, i3);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i3);
        } else {
            o(findNextFocus, (View) null);
            return view;
        }
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, (int[]) null);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t tVar = this.f2626n;
        if (tVar != null) {
            return tVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t tVar = this.f2626n;
        if (tVar != null) {
            return tVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public p getAdapter() {
        return null;
    }

    public int getBaseline() {
        t tVar = this.f2626n;
        if (tVar == null) {
            return super.getBaseline();
        }
        tVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    public boolean getClipToPadding() {
        return this.f2622k;
    }

    public G getCompatAccessibilityDelegate() {
        return this.f2614f0;
    }

    public r getEdgeEffectFactory() {
        return this.f2590D;
    }

    public s getItemAnimator() {
        return this.f2595I;
    }

    public int getItemDecorationCount() {
        return this.f2627o.size();
    }

    public t getLayoutManager() {
        return this.f2626n;
    }

    public int getMaxFlingVelocity() {
        return this.f2604S;
    }

    public int getMinFlingVelocity() {
        return this.f2603R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2607V;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, T.y] */
    public y getRecycledViewPool() {
        z zVar = this.f2613f;
        if (zVar.f1674e == null) {
            ? obj = new Object();
            obj.f1668a = new SparseArray();
            obj.f1669b = 0;
            zVar.f1674e = obj;
        }
        return zVar.f1674e;
    }

    public int getScrollState() {
        return this.J;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2626n + ", context:" + getContext();
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean isAttachedToWindow() {
        return this.f2630r;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f52d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        if (!this.f2632t || this.f2637z || ((ArrayList) this.f2617h.f127g).size() > 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        int L3 = this.f2619i.L();
        for (int i3 = 0; i3 < L3; i3++) {
            ((u) this.f2619i.K(i3).getLayoutParams()).f1667b = true;
        }
        ArrayList arrayList = this.f2613f.f1671b;
        if (arrayList.size() > 0) {
            h.j(arrayList.get(0));
            throw null;
        }
    }

    public final void n(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2596K) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f2596K = motionEvent.getPointerId(i3);
            int x2 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f2600O = x2;
            this.f2598M = x2;
            int y2 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f2601P = y2;
            this.f2599N = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2623l;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof u) {
            u uVar = (u) layoutParams;
            if (!uVar.f1667b) {
                int i3 = rect.left;
                Rect rect2 = uVar.f1666a;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        t tVar = this.f2626n;
        boolean z4 = !this.f2632t;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        tVar.G(this, view, this.f2623l, z4, z3);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [T.j, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r1 >= 30.0f) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2588B = r0
            r1 = 1
            r5.f2630r = r1
            boolean r2 = r5.f2632t
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            r0 = r1
        L_0x0014:
            r5.f2632t = r0
            T.t r0 = r5.f2626n
            if (r0 == 0) goto L_0x001c
            r0.f1663e = r1
        L_0x001c:
            java.lang.ThreadLocal r0 = T.C0089j.f1640j
            java.lang.Object r1 = r0.get()
            T.j r1 = (T.C0089j) r1
            r5.f2609a0 = r1
            if (r1 != 0) goto L_0x0064
            T.j r1 = new T.j
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1642f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1645i = r2
            r5.f2609a0 = r1
            java.lang.reflect.Field r1 = A.A.f0a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0058:
            T.j r2 = r5.f2609a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1644h = r3
            r0.set(r2)
        L_0x0064:
            T.j r0 = r5.f2609a0
            java.util.ArrayList r0 = r0.f1642f
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        s sVar = this.f2595I;
        if (sVar != null) {
            sVar.a();
        }
        setScrollState(0);
        E e2 = this.f2608W;
        e2.f1564l.removeCallbacks(e2);
        e2.f1560h.abortAnimation();
        this.f2630r = false;
        t tVar = this.f2626n;
        if (tVar != null) {
            tVar.f1663e = false;
            tVar.z(this);
        }
        this.k0.clear();
        removeCallbacks(this.f2624l0);
        this.f2620j.getClass();
        do {
            F0.y yVar = N.f1591a;
            int i3 = yVar.f360a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = (Object[]) yVar.f361b;
                Object obj2 = objArr[i4];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                yVar.f360a--;
                obj = obj2;
                continue;
            }
        } while (obj != null);
        C0089j jVar = this.f2609a0;
        if (jVar != null) {
            jVar.f1642f.remove(this);
            this.f2609a0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2627o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0086g) arrayList.get(i3)).getClass();
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float f4;
        if (this.f2626n != null && !this.v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f2626n.c()) {
                    f4 = -motionEvent.getAxisValue(9);
                } else {
                    f4 = 0.0f;
                }
                if (this.f2626n.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (!(f4 == 0.0f && f3 == 0.0f)) {
                        q((int) (f3 * this.f2605T), (int) (f4 * this.f2606U), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2626n.c()) {
                        f4 = -axisValue;
                    } else if (this.f2626n.b()) {
                        f3 = axisValue;
                        f4 = 0.0f;
                        q((int) (f3 * this.f2605T), (int) (f4 * this.f2606U), motionEvent);
                    }
                }
                f4 = 0.0f;
                f3 = 0.0f;
                q((int) (f3 * this.f2605T), (int) (f4 * this.f2606U), motionEvent);
            }
            f3 = 0.0f;
            q((int) (f3 * this.f2605T), (int) (f4 * this.f2606U), motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.v) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2629q = null;
        }
        ArrayList arrayList = this.f2628p;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            C0086g gVar = (C0086g) arrayList.get(i3);
            if (!gVar.c(motionEvent) || action == 3) {
                i3++;
            } else {
                this.f2629q = gVar;
                p();
                setScrollState(0);
                return true;
            }
        }
        t tVar = this.f2626n;
        if (tVar == null) {
            return false;
        }
        boolean b3 = tVar.b();
        boolean c3 = this.f2626n.c();
        if (this.f2597L == null) {
            this.f2597L = VelocityTracker.obtain();
        }
        this.f2597L.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2634w) {
                this.f2634w = false;
            }
            this.f2596K = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2600O = x2;
            this.f2598M = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2601P = y2;
            this.f2599N = y2;
            if (this.J == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2621j0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (c3) {
                b3 |= true;
            }
            getScrollingChildHelper().g(b3 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2597L.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2596K);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2596K + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.J != 1) {
                int i4 = x3 - this.f2598M;
                int i5 = y3 - this.f2599N;
                if (!b3 || Math.abs(i4) <= this.f2602Q) {
                    z3 = false;
                } else {
                    this.f2600O = x3;
                    z3 = true;
                }
                if (c3 && Math.abs(i5) > this.f2602Q) {
                    this.f2601P = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2596K = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2600O = x4;
            this.f2598M = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2601P = y4;
            this.f2599N = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        if (this.J == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = d.f4721a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f2632t = true;
    }

    public final void onMeasure(int i3, int i4) {
        t tVar = this.f2626n;
        if (tVar == null) {
            e(i3, i4);
        } else if (tVar.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f2626n.f1660b.e(i3, i4);
        } else if (this.f2631s) {
            this.f2626n.f1660b.e(i3, i4);
        } else {
            C c3 = this.c0;
            if (c3.f1557e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c3.getClass();
            this.f2633u++;
            this.f2626n.f1660b.e(i3, i4);
            if (this.f2633u < 1) {
                this.f2633u = 1;
            }
            this.f2633u--;
            c3.f1555c = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (this.f2588B > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B b3 = (B) parcelable;
        this.f2615g = b3;
        super.onRestoreInstanceState(b3.f484a);
        t tVar = this.f2626n;
        if (tVar != null && (parcelable2 = this.f2615g.f1552c) != null) {
            tVar.B(parcelable2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, T.B, H.c] */
    public final Parcelable onSaveInstanceState() {
        ? cVar = new c(super.onSaveInstanceState());
        B b3 = this.f2615g;
        if (b3 != null) {
            cVar.f1552c = b3.f1552c;
        } else {
            t tVar = this.f2626n;
            if (tVar != null) {
                cVar.f1552c = tVar.C();
            } else {
                cVar.f1552c = null;
            }
        }
        return cVar;
    }

    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 != i5 || i4 != i6) {
            this.f2594H = null;
            this.f2592F = null;
            this.f2593G = null;
            this.f2591E = null;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f3;
        float f4;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        MotionEvent motionEvent2 = motionEvent;
        int i8 = 0;
        if (this.v || this.f2634w) {
            return false;
        }
        int action = motionEvent.getAction();
        C0086g gVar = this.f2629q;
        if (gVar != null) {
            if (action == 0) {
                this.f2629q = null;
            } else {
                if (gVar.f1626q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b3 = gVar.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = gVar.a(motionEvent.getX(), motionEvent.getY());
                        if (b3 || a2) {
                            if (a2) {
                                gVar.f1627r = 1;
                                gVar.f1620k = (float) ((int) motionEvent.getX());
                            } else if (b3) {
                                gVar.f1627r = 2;
                                gVar.f1619j = (float) ((int) motionEvent.getY());
                            }
                            gVar.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && gVar.f1626q == 2) {
                        gVar.f1619j = 0.0f;
                        gVar.f1620k = 0.0f;
                        gVar.e(1);
                        gVar.f1627r = 0;
                    } else if (motionEvent.getAction() == 2 && gVar.f1626q == 2) {
                        gVar.f();
                        int i9 = gVar.f1627r;
                        int i10 = gVar.f1610a;
                        if (i9 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = gVar.f1629t;
                            iArr[0] = i10;
                            int i11 = gVar.f1621l - i10;
                            iArr[1] = i11;
                            float max = Math.max((float) i10, Math.min((float) i11, x2));
                            if (Math.abs(((float) 0) - max) >= 2.0f) {
                                float f5 = gVar.f1620k;
                                int computeHorizontalScrollRange = gVar.f1623n.computeHorizontalScrollRange();
                                gVar.f1623n.computeHorizontalScrollOffset();
                                int d3 = C0086g.d(f5, max, iArr, computeHorizontalScrollRange, 0, gVar.f1621l);
                                if (d3 != 0) {
                                    gVar.f1623n.scrollBy(d3, 0);
                                }
                                gVar.f1620k = max;
                            }
                        }
                        if (gVar.f1627r == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = gVar.f1628s;
                            iArr2[0] = i10;
                            int i12 = gVar.f1622m - i10;
                            iArr2[1] = i12;
                            float max2 = Math.max((float) i10, Math.min((float) i12, y2));
                            if (Math.abs(((float) 0) - max2) >= 2.0f) {
                                float f6 = gVar.f1619j;
                                int computeVerticalScrollRange = gVar.f1623n.computeVerticalScrollRange();
                                gVar.f1623n.computeVerticalScrollOffset();
                                int d4 = C0086g.d(f6, max2, iArr2, computeVerticalScrollRange, 0, gVar.f1622m);
                                if (d4 != 0) {
                                    gVar.f1623n.scrollBy(0, d4);
                                }
                                gVar.f1619j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f2629q = null;
                }
                p();
                setScrollState(0);
                return true;
            }
        }
        if (action != 0) {
            ArrayList arrayList = this.f2628p;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C0086g gVar2 = (C0086g) arrayList.get(i13);
                if (gVar2.c(motionEvent2)) {
                    this.f2629q = gVar2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        t tVar = this.f2626n;
        if (tVar == null) {
            return false;
        }
        boolean b4 = tVar.b();
        boolean c3 = this.f2626n.c();
        if (this.f2597L == null) {
            this.f2597L = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2621j0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation((float) iArr3[0], (float) iArr3[1]);
        if (actionMasked == 0) {
            this.f2596K = motionEvent2.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f2600O = x3;
            this.f2598M = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f2601P = y3;
            this.f2599N = y3;
            if (c3) {
                b4 |= true;
            }
            getScrollingChildHelper().g(b4 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2597L.addMovement(obtain);
            VelocityTracker velocityTracker = this.f2597L;
            int i14 = this.f2604S;
            velocityTracker.computeCurrentVelocity(1000, (float) i14);
            if (b4) {
                f3 = -this.f2597L.getXVelocity(this.f2596K);
            } else {
                f3 = 0.0f;
            }
            if (c3) {
                f4 = -this.f2597L.getYVelocity(this.f2596K);
            } else {
                f4 = 0.0f;
            }
            if (!(f3 == 0.0f && f4 == 0.0f)) {
                int i15 = (int) f3;
                int i16 = (int) f4;
                t tVar2 = this.f2626n;
                if (tVar2 == null) {
                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.v) {
                    boolean b5 = tVar2.b();
                    boolean c4 = this.f2626n.c();
                    int i17 = this.f2603R;
                    if (!b5 || Math.abs(i15) < i17) {
                        i15 = 0;
                    }
                    if (!c4 || Math.abs(i16) < i17) {
                        i16 = 0;
                    }
                    if (!(i15 == 0 && i16 == 0)) {
                        float f7 = (float) i15;
                        float f8 = (float) i16;
                        if (!dispatchNestedPreFling(f7, f8)) {
                            if (b5 || c4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            dispatchNestedFling(f7, f8, z3);
                            if (z3) {
                                if (c4) {
                                    b5 |= true;
                                }
                                getScrollingChildHelper().g(b5 ? 1 : 0, 1);
                                int i18 = -i14;
                                int max3 = Math.max(i18, Math.min(i15, i14));
                                int max4 = Math.max(i18, Math.min(i16, i14));
                                E e2 = this.f2608W;
                                e2.f1564l.setScrollState(2);
                                e2.f1559g = 0;
                                e2.f1558f = 0;
                                e2.f1560h.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                e2.a();
                                p();
                                obtain.recycle();
                                return true;
                            }
                        }
                    }
                }
            }
            setScrollState(0);
            p();
            obtain.recycle();
            return true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent2.findPointerIndex(this.f2596K);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2596K + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
            int i19 = this.f2600O - x4;
            int i20 = this.f2601P - y4;
            boolean f9 = f(i19, i20, this.i0, this.f2618h0, 0);
            int[] iArr4 = this.f2618h0;
            if (f9) {
                int[] iArr5 = this.i0;
                i19 -= iArr5[0];
                i20 -= iArr5[1];
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                iArr3[0] = iArr3[0] + iArr4[0];
                iArr3[1] = iArr3[1] + iArr4[1];
            }
            if (this.J != 1) {
                if (!b4 || Math.abs(i4) <= (i7 = this.f2602Q)) {
                    z4 = false;
                } else {
                    if (i4 > 0) {
                        i4 -= i7;
                    } else {
                        i4 += i7;
                    }
                    z4 = true;
                }
                if (c3 && Math.abs(i3) > (i6 = this.f2602Q)) {
                    if (i3 > 0) {
                        i3 -= i6;
                    } else {
                        i3 += i6;
                    }
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
            int i21 = i3;
            if (this.J == 1) {
                this.f2600O = x4 - iArr4[0];
                this.f2601P = y4 - iArr4[1];
                if (b4) {
                    i5 = i4;
                } else {
                    i5 = 0;
                }
                if (c3) {
                    i8 = i21;
                }
                q(i5, i8, obtain);
                C0089j jVar = this.f2609a0;
                if (!(jVar == null || (i4 == 0 && i21 == 0))) {
                    jVar.a(this, i4, i21);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2596K = motionEvent2.getPointerId(actionIndex);
            int x5 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
            this.f2600O = x5;
            this.f2598M = x5;
            int y5 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
            this.f2601P = y5;
            this.f2599N = y5;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        this.f2597L.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2597L;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        s(0);
        EdgeEffect edgeEffect = this.f2591E;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f2591E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2592F;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f2592F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2593G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f2593G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2594H;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f2594H.isFinished();
        }
        if (z3) {
            Field field = A.f0a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            r10 = this;
            r10.d()
            java.util.ArrayList r0 = r10.f2627o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            r10.invalidate()
        L_0x000e:
            int[] r0 = r10.f2618h0
            r1 = 0
            boolean r2 = r10.g(r0, r1)
            r3 = 1
            if (r2 == 0) goto L_0x003f
            int r11 = r10.f2600O
            r12 = r0[r1]
            int r11 = r11 - r12
            r10.f2600O = r11
            int r11 = r10.f2601P
            r2 = r0[r3]
            int r11 = r11 - r2
            r10.f2601P = r11
            if (r13 == 0) goto L_0x002d
            float r11 = (float) r12
            float r12 = (float) r2
            r13.offsetLocation(r11, r12)
        L_0x002d:
            int[] r11 = r10.f2621j0
            r12 = r11[r1]
            r13 = r0[r1]
            int r12 = r12 + r13
            r11[r1] = r12
            r12 = r11[r3]
            r13 = r0[r3]
            int r12 = r12 + r13
            r11[r3] = r12
            goto L_0x01de
        L_0x003f:
            int r0 = r10.getOverScrollMode()
            r2 = 2
            if (r0 == r2) goto L_0x01de
            if (r13 == 0) goto L_0x01db
            int r0 = r13.getSource()
            r2 = 8194(0x2002, float:1.1482E-41)
            r0 = r0 & r2
            if (r0 != r2) goto L_0x0053
            goto L_0x01db
        L_0x0053:
            float r0 = r13.getX()
            float r2 = (float) r1
            float r13 = r13.getY()
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 >= 0) goto L_0x00bd
            android.widget.EdgeEffect r1 = r10.f2591E
            if (r1 == 0) goto L_0x0068
            goto L_0x00a7
        L_0x0068:
            T.r r1 = r10.f2590D
            r1.getClass()
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            android.content.Context r7 = r10.getContext()
            r1.<init>(r7)
            r10.f2591E = r1
            boolean r7 = r10.f2622k
            if (r7 == 0) goto L_0x009c
            int r7 = r10.getMeasuredHeight()
            int r8 = r10.getPaddingTop()
            int r7 = r7 - r8
            int r8 = r10.getPaddingBottom()
            int r7 = r7 - r8
            int r8 = r10.getMeasuredWidth()
            int r9 = r10.getPaddingLeft()
            int r8 = r8 - r9
            int r9 = r10.getPaddingRight()
            int r8 = r8 - r9
            r1.setSize(r7, r8)
            goto L_0x00a7
        L_0x009c:
            int r7 = r10.getMeasuredHeight()
            int r8 = r10.getMeasuredWidth()
            r1.setSize(r7, r8)
        L_0x00a7:
            android.widget.EdgeEffect r1 = r10.f2591E
            float r7 = -r2
            int r8 = r10.getWidth()
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = r10.getHeight()
            float r8 = (float) r8
            float r13 = r13 / r8
            float r13 = r6 - r13
            F.c.a(r1, r7, r13)
        L_0x00bb:
            r1 = r3
            goto L_0x0118
        L_0x00bd:
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0118
            android.widget.EdgeEffect r1 = r10.f2593G
            if (r1 == 0) goto L_0x00c6
            goto L_0x0105
        L_0x00c6:
            T.r r1 = r10.f2590D
            r1.getClass()
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            android.content.Context r7 = r10.getContext()
            r1.<init>(r7)
            r10.f2593G = r1
            boolean r7 = r10.f2622k
            if (r7 == 0) goto L_0x00fa
            int r7 = r10.getMeasuredHeight()
            int r8 = r10.getPaddingTop()
            int r7 = r7 - r8
            int r8 = r10.getPaddingBottom()
            int r7 = r7 - r8
            int r8 = r10.getMeasuredWidth()
            int r9 = r10.getPaddingLeft()
            int r8 = r8 - r9
            int r9 = r10.getPaddingRight()
            int r8 = r8 - r9
            r1.setSize(r7, r8)
            goto L_0x0105
        L_0x00fa:
            int r7 = r10.getMeasuredHeight()
            int r8 = r10.getMeasuredWidth()
            r1.setSize(r7, r8)
        L_0x0105:
            android.widget.EdgeEffect r1 = r10.f2593G
            int r7 = r10.getWidth()
            float r7 = (float) r7
            float r7 = r2 / r7
            int r8 = r10.getHeight()
            float r8 = (float) r8
            float r13 = r13 / r8
            F.c.a(r1, r7, r13)
            goto L_0x00bb
        L_0x0118:
            if (r5 >= 0) goto L_0x0171
            android.widget.EdgeEffect r13 = r10.f2592F
            if (r13 == 0) goto L_0x011f
            goto L_0x015e
        L_0x011f:
            T.r r13 = r10.f2590D
            r13.getClass()
            android.widget.EdgeEffect r13 = new android.widget.EdgeEffect
            android.content.Context r1 = r10.getContext()
            r13.<init>(r1)
            r10.f2592F = r13
            boolean r1 = r10.f2622k
            if (r1 == 0) goto L_0x0153
            int r1 = r10.getMeasuredWidth()
            int r5 = r10.getPaddingLeft()
            int r1 = r1 - r5
            int r5 = r10.getPaddingRight()
            int r1 = r1 - r5
            int r5 = r10.getMeasuredHeight()
            int r6 = r10.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r10.getPaddingBottom()
            int r5 = r5 - r6
            r13.setSize(r1, r5)
            goto L_0x015e
        L_0x0153:
            int r1 = r10.getMeasuredWidth()
            int r5 = r10.getMeasuredHeight()
            r13.setSize(r1, r5)
        L_0x015e:
            android.widget.EdgeEffect r13 = r10.f2592F
            float r1 = -r2
            int r5 = r10.getHeight()
            float r5 = (float) r5
            float r1 = r1 / r5
            int r5 = r10.getWidth()
            float r5 = (float) r5
            float r0 = r0 / r5
            F.c.a(r13, r1, r0)
            goto L_0x01ce
        L_0x0171:
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x01cd
            android.widget.EdgeEffect r13 = r10.f2594H
            if (r13 == 0) goto L_0x017a
            goto L_0x01b9
        L_0x017a:
            T.r r13 = r10.f2590D
            r13.getClass()
            android.widget.EdgeEffect r13 = new android.widget.EdgeEffect
            android.content.Context r1 = r10.getContext()
            r13.<init>(r1)
            r10.f2594H = r13
            boolean r1 = r10.f2622k
            if (r1 == 0) goto L_0x01ae
            int r1 = r10.getMeasuredWidth()
            int r5 = r10.getPaddingLeft()
            int r1 = r1 - r5
            int r5 = r10.getPaddingRight()
            int r1 = r1 - r5
            int r5 = r10.getMeasuredHeight()
            int r7 = r10.getPaddingTop()
            int r5 = r5 - r7
            int r7 = r10.getPaddingBottom()
            int r5 = r5 - r7
            r13.setSize(r1, r5)
            goto L_0x01b9
        L_0x01ae:
            int r1 = r10.getMeasuredWidth()
            int r5 = r10.getMeasuredHeight()
            r13.setSize(r1, r5)
        L_0x01b9:
            android.widget.EdgeEffect r13 = r10.f2594H
            int r1 = r10.getHeight()
            float r1 = (float) r1
            float r1 = r2 / r1
            int r5 = r10.getWidth()
            float r5 = (float) r5
            float r0 = r0 / r5
            float r6 = r6 - r0
            F.c.a(r13, r1, r6)
            goto L_0x01ce
        L_0x01cd:
            r3 = r1
        L_0x01ce:
            if (r3 != 0) goto L_0x01d6
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x01d6
            if (r13 == 0) goto L_0x01db
        L_0x01d6:
            java.lang.reflect.Field r13 = A.A.f0a
            r10.postInvalidateOnAnimation()
        L_0x01db:
            r10.c(r11, r12)
        L_0x01de:
            boolean r11 = r10.awakenScrollBars()
            if (r11 != 0) goto L_0x01e7
            r10.invalidate()
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i3, int i4) {
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        t tVar = this.f2626n;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.v) {
            if (!tVar.b()) {
                i5 = 0;
            } else {
                i5 = i3;
            }
            if (!this.f2626n.c()) {
                i6 = 0;
            } else {
                i6 = i4;
            }
            if (i5 != 0 || i6 != 0) {
                E e2 = this.f2608W;
                e2.getClass();
                int abs = Math.abs(i5);
                int abs2 = Math.abs(i6);
                if (abs > abs2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i6 * i6) + (i5 * i5)));
                RecyclerView recyclerView = e2.f1564l;
                if (z3) {
                    i7 = recyclerView.getWidth();
                } else {
                    i7 = recyclerView.getHeight();
                }
                int i9 = i7 / 2;
                float f3 = (float) i7;
                float f4 = (float) i9;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f3) - 0.5f) * 0.47123894f))) * f4) + f4;
                if (sqrt > 0) {
                    i8 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z3) {
                        abs = abs2;
                    }
                    i8 = (int) (((((float) abs) / f3) + 1.0f) * 300.0f);
                }
                int min = Math.min(i8, 2000);
                o oVar = f2586p0;
                if (e2.f1561i != oVar) {
                    e2.f1561i = oVar;
                    e2.f1560h = new OverScroller(recyclerView.getContext(), oVar);
                }
                recyclerView.setScrollState(2);
                e2.f1559g = 0;
                e2.f1558f = 0;
                e2.f1560h.startScroll(0, 0, i5, i6, min);
                e2.a();
            }
        }
    }

    public final void removeDetachedView(View view, boolean z3) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z3);
    }

    public final void requestChildFocus(View view, View view2) {
        this.f2626n.getClass();
        if (this.f2588B <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f2626n.G(this, view, rect, z3, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f2628p;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0086g) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void requestLayout() {
        if (this.f2633u == 0 && !this.v) {
            super.requestLayout();
        }
    }

    public final void s(int i3) {
        getScrollingChildHelper().h(i3);
    }

    public final void scrollBy(int i3, int i4) {
        t tVar = this.f2626n;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.v) {
            boolean b3 = tVar.b();
            boolean c3 = this.f2626n.c();
            if (b3 || c3) {
                if (!b3) {
                    i3 = 0;
                }
                if (!c3) {
                    i4 = 0;
                }
                q(i3, i4, (MotionEvent) null);
            }
        }
    }

    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i3;
        if (this.f2588B > 0) {
            int i4 = 0;
            if (accessibilityEvent != null) {
                i3 = accessibilityEvent.getContentChangeTypes();
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                i4 = i3;
            }
            this.f2635x |= i4;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(G g2) {
        this.f2614f0 = g2;
        A.a(this, g2);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object, T.y] */
    public void setAdapter(p pVar) {
        setLayoutFrozen(false);
        s sVar = this.f2595I;
        if (sVar != null) {
            sVar.a();
        }
        t tVar = this.f2626n;
        z zVar = this.f2613f;
        if (tVar != null) {
            tVar.E();
            this.f2626n.F(zVar);
        }
        zVar.f1670a.clear();
        ArrayList arrayList = zVar.f1671b;
        int size = arrayList.size() - 1;
        if (size < 0) {
            arrayList.clear();
            C0087h hVar = zVar.f1675f.f2610b0;
            hVar.getClass();
            hVar.f1634c = 0;
            C0.f fVar = this.f2617h;
            fVar.U((ArrayList) fVar.f127g);
            fVar.U((ArrayList) fVar.f129i);
            zVar.f1670a.clear();
            ArrayList arrayList2 = zVar.f1671b;
            int size2 = arrayList2.size() - 1;
            if (size2 < 0) {
                arrayList2.clear();
                RecyclerView recyclerView = zVar.f1675f;
                C0087h hVar2 = recyclerView.f2610b0;
                hVar2.getClass();
                hVar2.f1634c = 0;
                if (zVar.f1674e == null) {
                    ? obj = new Object();
                    obj.f1668a = new SparseArray();
                    obj.f1669b = 0;
                    zVar.f1674e = obj;
                }
                y yVar = zVar.f1674e;
                if (yVar.f1669b == 0) {
                    SparseArray sparseArray = yVar.f1668a;
                    if (sparseArray.size() > 0) {
                        ((x) sparseArray.valueAt(0)).getClass();
                        throw null;
                    }
                }
                this.c0.f1554b = true;
                this.f2587A = this.f2587A;
                this.f2637z = true;
                int L3 = this.f2619i.L();
                for (int i3 = 0; i3 < L3; i3++) {
                    j(this.f2619i.K(i3));
                }
                m();
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    if (arrayList2.get(i4) == null) {
                        i4++;
                    } else {
                        throw new ClassCastException();
                    }
                }
                int size4 = arrayList2.size() - 1;
                if (size4 < 0) {
                    arrayList2.clear();
                    C0087h hVar3 = recyclerView.f2610b0;
                    hVar3.getClass();
                    hVar3.f1634c = 0;
                    requestLayout();
                    return;
                }
                h.j(arrayList2.get(size4));
                throw null;
            }
            h.j(arrayList2.get(size2));
            throw null;
        }
        h.j(arrayList.get(size));
        throw null;
    }

    public void setChildDrawingOrderCallback(q qVar) {
        if (qVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z3) {
        if (z3 != this.f2622k) {
            this.f2594H = null;
            this.f2592F = null;
            this.f2593G = null;
            this.f2591E = null;
        }
        this.f2622k = z3;
        super.setClipToPadding(z3);
        if (this.f2632t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(r rVar) {
        rVar.getClass();
        this.f2590D = rVar;
        this.f2594H = null;
        this.f2592F = null;
        this.f2593G = null;
        this.f2591E = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f2631s = z3;
    }

    public void setItemAnimator(s sVar) {
        s sVar2 = this.f2595I;
        if (sVar2 != null) {
            sVar2.a();
            this.f2595I.f1655a = null;
        }
        this.f2595I = sVar;
        if (sVar != null) {
            sVar.f1655a = this.f2612e0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        z zVar = this.f2613f;
        zVar.f1672c = i3;
        zVar.b();
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.v) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.v = true;
            this.f2634w = true;
            setScrollState(0);
            E e2 = this.f2608W;
            e2.f1564l.removeCallbacks(e2);
            e2.f1560h.abortAnimation();
        }
    }

    public void setLayoutManager(t tVar) {
        m mVar;
        if (tVar != this.f2626n) {
            setScrollState(0);
            E e2 = this.f2608W;
            e2.f1564l.removeCallbacks(e2);
            e2.f1560h.abortAnimation();
            t tVar2 = this.f2626n;
            z zVar = this.f2613f;
            if (tVar2 != null) {
                s sVar = this.f2595I;
                if (sVar != null) {
                    sVar.a();
                }
                this.f2626n.E();
                this.f2626n.F(zVar);
                zVar.f1670a.clear();
                ArrayList arrayList = zVar.f1671b;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                    C0087h hVar = zVar.f1675f.f2610b0;
                    hVar.getClass();
                    hVar.f1634c = 0;
                    if (this.f2630r) {
                        t tVar3 = this.f2626n;
                        tVar3.f1663e = false;
                        tVar3.z(this);
                    }
                    this.f2626n.I((RecyclerView) null);
                    this.f2626n = null;
                } else {
                    h.j(arrayList.get(size));
                    throw null;
                }
            } else {
                zVar.f1670a.clear();
                ArrayList arrayList2 = zVar.f1671b;
                int size2 = arrayList2.size() - 1;
                if (size2 < 0) {
                    arrayList2.clear();
                    C0087h hVar2 = zVar.f1675f.f2610b0;
                    hVar2.getClass();
                    hVar2.f1634c = 0;
                } else {
                    h.j(arrayList2.get(size2));
                    throw null;
                }
            }
            C0.f fVar = this.f2619i;
            ((C0081b) fVar.f127g).c();
            ArrayList arrayList3 = (ArrayList) fVar.f129i;
            int size3 = arrayList3.size() - 1;
            while (true) {
                mVar = (m) fVar.f128h;
                if (size3 < 0) {
                    break;
                }
                j((View) arrayList3.get(size3));
                arrayList3.remove(size3);
                size3--;
            }
            RecyclerView recyclerView = (RecyclerView) mVar.f100g;
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                j(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.f2626n = tVar;
            if (tVar != null) {
                if (tVar.f1660b == null) {
                    tVar.I(this);
                    if (this.f2630r) {
                        this.f2626n.f1663e = true;
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + tVar + " is already attached to a RecyclerView:" + tVar.f1660b.h());
                }
            }
            zVar.b();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z3) {
        C0008i scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f52d) {
            Field field = A.f0a;
            C0017s.z(scrollingChildHelper.f51c);
        }
        scrollingChildHelper.f52d = z3;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f2607V = z3;
    }

    public void setRecycledViewPool(y yVar) {
        z zVar = this.f2613f;
        y yVar2 = zVar.f1674e;
        if (yVar2 != null) {
            yVar2.f1669b--;
        }
        zVar.f1674e = yVar;
        if (yVar != null) {
            zVar.f1675f.getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 != this.J) {
            this.J = i3;
            if (i3 != 2) {
                E e2 = this.f2608W;
                e2.f1564l.removeCallbacks(e2);
                e2.f1560h.abortAnimation();
            }
            t tVar = this.f2626n;
            if (tVar != null) {
                tVar.D(i3);
            }
            ArrayList arrayList = this.f2611d0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((w) this.f2611d0.get(size)).getClass();
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
            } else {
                this.f2602Q = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2602Q = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d3) {
        this.f2613f.getClass();
    }

    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        t tVar = this.f2626n;
        if (tVar != null) {
            return tVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(v vVar) {
    }

    @Deprecated
    public void setOnScrollListener(w wVar) {
    }

    public void setRecyclerListener(T.A a2) {
    }
}
