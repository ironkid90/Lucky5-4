package j;

import T1.d;
import X.a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ai9poker.app.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.C0337d;
import n.C0338e;
import n.C0339f;
import r.C0408a;

public final class N {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f3625f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static N f3626g;

    /* renamed from: h  reason: collision with root package name */
    public static final M f3627h = new C0339f(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f3628a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f3629b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f3630c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3631d;

    /* renamed from: e  reason: collision with root package name */
    public d f3632e;

    public static synchronized N b() {
        N n3;
        synchronized (N.class) {
            try {
                if (f3626g == null) {
                    f3626g = new N();
                }
                n3 = f3626g;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return n3;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (N.class) {
            M m3 = f3627h;
            m3.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m3.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) m3.b(Integer.valueOf(mode.hashCode() + i4), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        Object obj;
        Object[] objArr;
        Object obj2;
        if (this.f3630c == null) {
            this.f3630c = new TypedValue();
        }
        TypedValue typedValue = this.f3630c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0338e eVar = (C0338e) this.f3629b.get(context);
            drawable = null;
            if (eVar != null) {
                int b3 = C0337d.b(eVar.f4065g, eVar.f4067i, j3);
                if (b3 < 0 || (obj = eVar.f4066h[b3]) == C0338e.f4063j) {
                    obj = null;
                }
                WeakReference weakReference = obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = C0337d.b(eVar.f4065g, eVar.f4067i, j3);
                        if (b4 >= 0 && (objArr = eVar.f4066h)[b4] != (obj2 = C0338e.f4063j)) {
                            objArr[b4] = obj2;
                            eVar.f4064f = true;
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3632e != null && i3 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C0338e eVar2 = (C0338e) this.f3629b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new C0338e();
                            this.f3629b.put(context, eVar2);
                        }
                        eVar2.b(j3, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3);
    }

    public final synchronized Drawable d(Context context, int i3) {
        Drawable a2;
        try {
            if (!this.f3631d) {
                this.f3631d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f3631d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i3);
            if (a2 == null) {
                a2 = C0408a.b(context, i3);
            }
            if (a2 != null) {
                a2 = g(context, i3, a2);
            }
            if (a2 != null) {
                Rect rect = C0258x.f3811a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.content.res.ColorStateList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: android.content.res.ColorStateList} */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, n.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList f(android.content.Context r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.WeakHashMap r0 = r6.f3628a     // Catch:{ all -> 0x0072 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0072 }
            n.l r0 = (n.l) r0     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0024
            int[] r2 = r0.f4093f     // Catch:{ all -> 0x0072 }
            int r3 = r0.f4095h     // Catch:{ all -> 0x0072 }
            int r2 = n.C0337d.a(r3, r8, r2)     // Catch:{ all -> 0x0072 }
            if (r2 < 0) goto L_0x0020
            java.lang.Object[] r0 = r0.f4094g     // Catch:{ all -> 0x0072 }
            r0 = r0[r2]     // Catch:{ all -> 0x0072 }
            java.lang.Object r2 = n.l.f4092i     // Catch:{ all -> 0x0072 }
            if (r0 != r2) goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0072 }
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 != 0) goto L_0x0074
            T1.d r0 = r6.f3632e     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            android.content.res.ColorStateList r1 = r0.m(r7, r8)     // Catch:{ all -> 0x0072 }
        L_0x0030:
            if (r1 == 0) goto L_0x0070
            java.util.WeakHashMap r0 = r6.f3628a     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x003d
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            r6.f3628a = r0     // Catch:{ all -> 0x0072 }
        L_0x003d:
            java.util.WeakHashMap r0 = r6.f3628a     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0072 }
            n.l r0 = (n.l) r0     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006d
            n.l r0 = new n.l     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            r2 = 4
            r3 = r2
        L_0x004e:
            r4 = 32
            r5 = 40
            if (r3 >= r4) goto L_0x005f
            r4 = 1
            int r4 = r4 << r3
            int r4 = r4 + -12
            if (r5 > r4) goto L_0x005c
            r5 = r4
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x005f:
            int r5 = r5 / r2
            int[] r2 = new int[r5]     // Catch:{ all -> 0x0072 }
            r0.f4093f = r2     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0072 }
            r0.f4094g = r2     // Catch:{ all -> 0x0072 }
            java.util.WeakHashMap r2 = r6.f3628a     // Catch:{ all -> 0x0072 }
            r2.put(r7, r0)     // Catch:{ all -> 0x0072 }
        L_0x006d:
            r0.a(r8, r1)     // Catch:{ all -> 0x0072 }
        L_0x0070:
            r0 = r1
            goto L_0x0074
        L_0x0072:
            r7 = move-exception
            goto L_0x0076
        L_0x0074:
            monitor-exit(r6)
            return r0
        L_0x0076:
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j.N.f(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            r8 = this;
            r0 = 2130903133(0x7f03005d, float:1.7413075E38)
            r1 = 2130903131(0x7f03005b, float:1.7413071E38)
            android.content.res.ColorStateList r2 = r8.f(r9, r10)
            if (r2 == 0) goto L_0x002d
            boolean r9 = j.C0258x.a(r11)
            if (r9 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r11 = r11.mutate()
        L_0x0016:
            u.C0489a.h(r11, r2)
            T1.d r9 = r8.f3632e
            r0 = 0
            if (r9 != 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            r9 = 2131165253(0x7f070045, float:1.7944718E38)
            if (r10 != r9) goto L_0x0026
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0026:
            if (r0 == 0) goto L_0x010e
            u.C0489a.i(r11, r0)
            goto L_0x010e
        L_0x002d:
            T1.d r2 = r8.f3632e
            if (r2 == 0) goto L_0x009d
            r2 = 2131165250(0x7f070042, float:1.7944712E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r2) goto L_0x0066
            r10 = r11
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r5)
            int r5 = j.g0.b(r9, r0)
            android.graphics.PorterDuff$Mode r6 = j.C0250o.f3740b
            T1.d.o(r2, r5)
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r4)
            int r0 = j.g0.b(r9, r0)
            T1.d.o(r2, r0)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)
            int r9 = j.g0.b(r9, r1)
            T1.d.o(r10, r9)
            goto L_0x010e
        L_0x0066:
            r2 = 2131165241(0x7f070039, float:1.7944694E38)
            if (r10 == r2) goto L_0x0075
            r2 = 2131165240(0x7f070038, float:1.7944692E38)
            if (r10 == r2) goto L_0x0075
            r2 = 2131165242(0x7f07003a, float:1.7944696E38)
            if (r10 != r2) goto L_0x009d
        L_0x0075:
            r10 = r11
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r5)
            int r0 = j.g0.a(r9, r0)
            android.graphics.PorterDuff$Mode r5 = j.C0250o.f3740b
            T1.d.o(r2, r0)
            android.graphics.drawable.Drawable r0 = r10.findDrawableByLayerId(r4)
            int r2 = j.g0.b(r9, r1)
            T1.d.o(r0, r2)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)
            int r9 = j.g0.b(r9, r1)
            T1.d.o(r10, r9)
            goto L_0x010e
        L_0x009d:
            T1.d r2 = r8.f3632e
            r3 = 0
            if (r2 == 0) goto L_0x010e
            android.graphics.PorterDuff$Mode r4 = j.C0250o.f3740b
            java.lang.Object r5 = r2.f1703a
            int[] r5 = (int[]) r5
            boolean r5 = T1.d.i(r5, r10)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto L_0x00b3
        L_0x00b0:
            r3 = r6
        L_0x00b1:
            r10 = r7
            goto L_0x00e8
        L_0x00b3:
            java.lang.Object r0 = r2.f1705c
            int[] r0 = (int[]) r0
            boolean r0 = T1.d.i(r0, r10)
            if (r0 == 0) goto L_0x00bf
        L_0x00bd:
            r0 = r1
            goto L_0x00b0
        L_0x00bf:
            java.lang.Object r0 = r2.f1706d
            int[] r0 = (int[]) r0
            boolean r0 = T1.d.i(r0, r10)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L_0x00cf
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x00bd
        L_0x00cf:
            r0 = 2131165227(0x7f07002b, float:1.7944665E38)
            if (r10 != r0) goto L_0x00e0
            r10 = 1109603123(0x42233333, float:40.8)
            int r10 = java.lang.Math.round(r10)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r6
            goto L_0x00e8
        L_0x00e0:
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            if (r10 != r0) goto L_0x00e6
            goto L_0x00bd
        L_0x00e6:
            r0 = r3
            goto L_0x00b1
        L_0x00e8:
            if (r3 == 0) goto L_0x010e
            boolean r1 = j.C0258x.a(r11)
            if (r1 == 0) goto L_0x00f5
            android.graphics.drawable.Drawable r1 = r11.mutate()
            goto L_0x00f6
        L_0x00f5:
            r1 = r11
        L_0x00f6:
            int r9 = j.g0.b(r9, r0)
            java.lang.Class<j.o> r0 = j.C0250o.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r9 = e(r9, r4)     // Catch:{ all -> 0x010b }
            monitor-exit(r0)
            r1.setColorFilter(r9)
            if (r10 == r7) goto L_0x010e
            r1.setAlpha(r10)
            goto L_0x010e
        L_0x010b:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010b }
            throw r9
        L_0x010e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j.N.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
