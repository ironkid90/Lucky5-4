package S1;

import A2.i;
import B.m;
import C0.f;
import C0.r;
import G.a;
import I2.C;
import I2.C0067s;
import I2.C0068t;
import I2.C0071w;
import I2.K;
import I2.Q;
import P2.d;
import T1.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import b0.C0125a;
import c2.n;
import c2.p;
import c2.q;
import d0.C0140b;
import d0.C0141c;
import d0.C0145g;
import d0.C0146h;
import d0.C0147i;
import d0.C0148j;
import d2.b;
import i2.C0231l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.h;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import io.flutter.view.g;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import r.C0412e;
import r2.C0420d;
import r2.C0426j;
import s1.C0464y;

public final class o extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    public final C0079e f1482A = new C0079e(1, this);

    /* renamed from: B  reason: collision with root package name */
    public m f1483B;

    /* renamed from: C  reason: collision with root package name */
    public q f1484C = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final j f1485f;

    /* renamed from: g  reason: collision with root package name */
    public final l f1486g;

    /* renamed from: h  reason: collision with root package name */
    public h f1487h;

    /* renamed from: i  reason: collision with root package name */
    public View f1488i;

    /* renamed from: j  reason: collision with root package name */
    public View f1489j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f1490k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public boolean f1491l;

    /* renamed from: m  reason: collision with root package name */
    public c f1492m;

    /* renamed from: n  reason: collision with root package name */
    public final HashSet f1493n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public n f1494o;

    /* renamed from: p  reason: collision with root package name */
    public j f1495p;

    /* renamed from: q  reason: collision with root package name */
    public h f1496q;

    /* renamed from: r  reason: collision with root package name */
    public b f1497r;

    /* renamed from: s  reason: collision with root package name */
    public f f1498s;

    /* renamed from: t  reason: collision with root package name */
    public C0075a f1499t;

    /* renamed from: u  reason: collision with root package name */
    public g f1500u;
    public TextServicesManager v;

    /* renamed from: w  reason: collision with root package name */
    public m f1501w;

    /* renamed from: x  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f1502x = new io.flutter.embedding.engine.renderer.g();

    /* renamed from: y  reason: collision with root package name */
    public final F0.h f1503y = new F0.h(10, (Object) this);

    /* renamed from: z  reason: collision with root package name */
    public final a f1504z = new a(this, new Handler(Looper.getMainLooper()), 1);

    /* JADX WARNING: type inference failed for: r3v7, types: [S1.q, java.lang.Object] */
    public o(C0078d dVar, j jVar) {
        super(dVar, (AttributeSet) null);
        this.f1485f = jVar;
        this.f1488i = jVar;
        b();
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f1492m);
        if (c()) {
            Iterator it = this.f1493n.iterator();
            if (!it.hasNext()) {
                getContext().getContentResolver().unregisterContentObserver(this.f1504z);
                l lVar = this.f1492m.f1698s;
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray2 = lVar.f3409s;
                    if (i3 >= sparseArray2.size()) {
                        break;
                    }
                    lVar.f3398h.removeView((io.flutter.plugin.platform.h) sparseArray2.valueAt(i3));
                    i3++;
                }
                int i4 = 0;
                while (true) {
                    SparseArray sparseArray3 = lVar.f3407q;
                    if (i4 >= sparseArray3.size()) {
                        lVar.f();
                        if (lVar.f3398h == null) {
                            Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                        } else {
                            int i5 = 0;
                            while (true) {
                                sparseArray = lVar.f3408r;
                                if (i5 >= sparseArray.size()) {
                                    break;
                                }
                                lVar.f3398h.removeView((View) sparseArray.valueAt(i5));
                                i5++;
                            }
                            sparseArray.clear();
                        }
                        lVar.f3398h = null;
                        lVar.f3411u = false;
                        SparseArray sparseArray4 = lVar.f3406p;
                        if (sparseArray4.size() <= 0) {
                            k kVar = this.f1492m.f1699t;
                            int i6 = 0;
                            while (true) {
                                SparseArray sparseArray5 = kVar.f3390m;
                                if (i6 >= sparseArray5.size()) {
                                    Surface surface = kVar.f3393p;
                                    if (surface != null) {
                                        surface.release();
                                        kVar.f3393p = null;
                                        kVar.f3394q = null;
                                    }
                                    kVar.f3385h = null;
                                    SparseArray sparseArray6 = kVar.f3389l;
                                    if (sparseArray6.size() <= 0) {
                                        this.f1492m.f1698s.a();
                                        this.f1492m.f1699t.a();
                                        g gVar = this.f1500u;
                                        gVar.f3546t = true;
                                        gVar.f3531e.a();
                                        gVar.f3544r = null;
                                        AccessibilityManager accessibilityManager = gVar.f3529c;
                                        accessibilityManager.removeAccessibilityStateChangeListener(gVar.v);
                                        accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f3548w);
                                        gVar.f3532f.unregisterContentObserver(gVar.f3549x);
                                        f fVar = gVar.f3528b;
                                        fVar.f129i = null;
                                        ((FlutterJNI) fVar.f127g).setAccessibilityDelegate((T1.k) null);
                                        this.f1500u = null;
                                        this.f1495p.f3357b.restartInput(this);
                                        this.f1495p.b();
                                        int size = ((HashSet) this.f1498s.f127g).size();
                                        if (size > 0) {
                                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                                        }
                                        h hVar = this.f1496q;
                                        if (hVar != null) {
                                            hVar.f3344a.f322g = null;
                                            SpellCheckerSession spellCheckerSession = hVar.f3346c;
                                            if (spellCheckerSession != null) {
                                                spellCheckerSession.close();
                                            }
                                        }
                                        n nVar = this.f1494o;
                                        if (nVar != null) {
                                            ((F0.h) nVar.f2790h).f322g = null;
                                        }
                                        io.flutter.embedding.engine.renderer.h hVar2 = this.f1492m.f1681b;
                                        this.f1491l = false;
                                        hVar2.c(this.f1482A);
                                        hVar2.e();
                                        hVar2.f3309a.setSemanticsEnabled(false);
                                        View view = this.f1489j;
                                        if (view != null && this.f1488i == this.f1487h) {
                                            this.f1488i = view;
                                        }
                                        this.f1488i.c();
                                        h hVar3 = this.f1487h;
                                        if (hVar3 != null) {
                                            hVar3.f1461f.close();
                                            removeView(this.f1487h);
                                            this.f1487h = null;
                                        }
                                        this.f1489j = null;
                                        this.f1492m = null;
                                        return;
                                    }
                                    sparseArray6.valueAt(0).getClass();
                                    throw new ClassCastException();
                                } else if (sparseArray5.valueAt(i6) == null) {
                                    kVar.f3385h.removeView((View) null);
                                    i6++;
                                } else {
                                    throw new ClassCastException();
                                }
                            }
                        } else {
                            sparseArray4.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                    } else if (sparseArray3.valueAt(i4) == null) {
                        lVar.f3398h.removeView((View) null);
                        i4++;
                    } else {
                        throw new ClassCastException();
                    }
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void autofill(SparseArray sparseArray) {
        C0464y yVar;
        C0464y yVar2;
        j jVar = this.f1495p;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
            return;
        }
        b2.k kVar = jVar.f3361f;
        if (kVar != null && jVar.f3362g != null && (yVar = kVar.f2758j) != null) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                b2.k kVar2 = (b2.k) jVar.f3362g.get(sparseArray.keyAt(i3));
                if (!(kVar2 == null || (yVar2 = kVar2.f2758j) == null)) {
                    String charSequence = C0231l.g(sparseArray.valueAt(i3)).getTextValue().toString();
                    b2.m mVar = new b2.m(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = (String) yVar2.f4622f;
                    if (str.equals((String) yVar.f4622f)) {
                        jVar.f3363h.f(mVar);
                    } else {
                        hashMap.put(str, mVar);
                    }
                }
            }
            int i4 = jVar.f3360e.f56c;
            r rVar = jVar.f3359d;
            rVar.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                b2.m mVar2 = (b2.m) entry.getValue();
                hashMap2.put((String) entry.getKey(), r.C(mVar2.f2765a, mVar2.f2766b, mVar2.f2767c, -1, -1));
            }
            ((q) rVar.f160g).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i4), hashMap2}), (p) null);
        }
    }

    public final void b() {
        j jVar = this.f1485f;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.f1486g;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f1487h);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final boolean c() {
        c cVar = this.f1492m;
        if (cVar == null || cVar.f1681b != this.f1488i.getAttachedRenderer()) {
            return false;
        }
        return true;
    }

    public final boolean checkInputConnectionProxy(View view) {
        c cVar = this.f1492m;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        l lVar = cVar.f1698s;
        if (view == null) {
            lVar.getClass();
            return false;
        }
        HashMap hashMap = lVar.f3405o;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r1 != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            r2 = 1
            if (r0 != r1) goto L_0x0013
            r0 = 2
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            android.view.textservice.TextServicesManager r1 = r9.v
            r3 = 0
            if (r1 == 0) goto L_0x004e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x004c
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0027
            r1 = r2
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            android.view.textservice.TextServicesManager r4 = r9.v
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
        L_0x004c:
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r1 = r3
        L_0x004f:
            T1.c r4 = r9.f1492m
            b2.j r4 = r4.f1694o
            s1.y r4 = r4.f2748a
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            android.content.res.Resources r6 = r9.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            float r6 = r6.fontScale
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.String r7 = "textScaleFactor"
            r5.put(r7, r6)
            android.content.res.Resources r6 = r9.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "nativeSpellCheckServiceDefined"
            r5.put(r8, r1)
            android.content.Context r1 = r9.getContext()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r8 = "show_password"
            int r1 = android.provider.Settings.System.getInt(r1, r8, r2)
            if (r1 != r2) goto L_0x0090
            r1 = r2
            goto L_0x0091
        L_0x0090:
            r1 = r3
        L_0x0091:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "brieflyShowPassword"
            r5.put(r8, r1)
            android.content.Context r1 = r9.getContext()
            boolean r1 = android.text.format.DateFormat.is24HourFormat(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "alwaysUse24HourFormat"
            r5.put(r8, r1)
            r1 = 1
            if (r0 == r1) goto L_0x00b6
            r1 = 2
            if (r0 != r1) goto L_0x00b4
            java.lang.String r0 = "dark"
            goto L_0x00b8
        L_0x00b4:
            r0 = 0
            throw r0
        L_0x00b6:
            java.lang.String r0 = "light"
        L_0x00b8:
            java.lang.String r1 = "platformBrightness"
            r5.put(r1, r0)
            java.lang.Object r0 = r5.get(r7)
            java.util.Objects.toString(r0)
            java.lang.Object r0 = r5.get(r8)
            java.util.Objects.toString(r0)
            java.lang.Object r0 = r5.get(r1)
            java.util.Objects.toString(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            r0 = 0
            if (r2 == 0) goto L_0x010e
            if (r6 != 0) goto L_0x00e0
            goto L_0x010e
        L_0x00e0:
            b2.i r1 = new b2.i
            r1.<init>(r6)
            C0.f r2 = b2.j.f2747b
            java.lang.Object r3 = r2.f128h
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            r3.add(r1)
            java.lang.Object r3 = r2.f129i
            b2.i r3 = (b2.i) r3
            r2.f129i = r1
            if (r3 != 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            C0.r r0 = new C0.r
            r6 = 25
            r7 = 0
            r0.<init>(r2, r3, r6, r7)
        L_0x00ff:
            int r1 = r1.f2745a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "configurationId"
            r5.put(r2, r1)
            r4.k(r5, r0)
            goto L_0x0111
        L_0x010e:
            r4.k(r5, r0)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.d():void");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!c() || !this.f1498s.M(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f3 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f1502x;
        gVar.f3291a = f3;
        gVar.f3306p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f1492m.f1681b;
        hVar.getClass();
        if (gVar.f3292b > 0 && gVar.f3293c > 0 && gVar.f3291a > 0.0f) {
            ArrayList arrayList = gVar.f3307q;
            arrayList.size();
            ArrayList arrayList2 = gVar.f3308r;
            arrayList2.size();
            int size = arrayList2.size() + arrayList.size();
            int[] iArr = new int[(size * 4)];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i3);
                int i4 = i3 * 4;
                Rect rect = aVar.f3278a;
                iArr[i4] = rect.left;
                iArr[i4 + 1] = rect.top;
                iArr[i4 + 2] = rect.right;
                iArr[i4 + 3] = rect.bottom;
                iArr2[i3] = L.j.b(aVar.f3279b);
                iArr3[i3] = L.j.b(aVar.f3280c);
            }
            int size2 = arrayList.size() * 4;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i5);
                int i6 = (i5 * 4) + size2;
                Rect rect2 = aVar2.f3278a;
                iArr[i6] = rect2.left;
                iArr[i6 + 1] = rect2.top;
                iArr[i6 + 2] = rect2.right;
                iArr[i6 + 3] = rect2.bottom;
                iArr2[arrayList.size() + i5] = L.j.b(aVar2.f3279b);
                iArr3[arrayList.size() + i5] = L.j.b(aVar2.f3280c);
            }
            hVar.f3309a.setViewportMetrics(gVar.f3291a, gVar.f3292b, gVar.f3293c, gVar.f3294d, gVar.f3295e, gVar.f3296f, gVar.f3297g, gVar.f3298h, gVar.f3299i, gVar.f3300j, gVar.f3301k, gVar.f3302l, gVar.f3303m, gVar.f3304n, gVar.f3305o, gVar.f3306p, iArr, iArr2, iArr3);
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        g gVar = this.f1500u;
        if (gVar == null || !gVar.f3529c.isEnabled()) {
            return null;
        }
        return this.f1500u;
    }

    public c getAttachedFlutterEngine() {
        return this.f1492m;
    }

    public c2.f getBinaryMessenger() {
        return this.f1492m.f1682c;
    }

    public h getCurrentImageSurface() {
        return this.f1487h;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f1502x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            android.view.WindowInsets r2 = super.onApplyWindowInsets(r16)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            io.flutter.embedding.engine.renderer.g r5 = r0.f1502x
            if (r3 != r4) goto L_0x002b
            android.graphics.Insets r4 = r16.getSystemGestureInsets()
            int r6 = r4.top
            r5.f3302l = r6
            int r6 = r4.right
            r5.f3303m = r6
            int r6 = r4.bottom
            r5.f3304n = r6
            int r4 = r4.left
            r5.f3305o = r4
        L_0x002b:
            int r4 = r15.getWindowSystemUiVisibility()
            r6 = 4
            r4 = r4 & r6
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0037
            r4 = r8
            goto L_0x0038
        L_0x0037:
            r4 = r7
        L_0x0038:
            int r9 = r15.getWindowSystemUiVisibility()
            r10 = 2
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0042
            r9 = r8
            goto L_0x0043
        L_0x0042:
            r9 = r7
        L_0x0043:
            r11 = 30
            if (r3 < r11) goto L_0x0103
            int r4 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f3294d = r7
            int r7 = r4.right
            r5.f3295e = r7
            int r7 = r4.bottom
            r5.f3296f = r7
            int r4 = r4.left
            r5.f3297g = r4
            int r4 = android.view.WindowInsets.Type.ime()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f3298h = r7
            int r7 = r4.right
            r5.f3299i = r7
            int r7 = r4.bottom
            r5.f3300j = r7
            int r4 = r4.left
            r5.f3301k = r4
            int r4 = android.view.WindowInsets.Type.systemGestures()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f3302l = r7
            int r7 = r4.right
            r5.f3303m = r7
            int r7 = r4.bottom
            r5.f3304n = r7
            int r4 = r4.left
            r5.f3305o = r4
            android.view.DisplayCutout r4 = r16.getDisplayCutout()
            if (r4 == 0) goto L_0x01a7
            android.graphics.Insets r7 = r4.getWaterfallInsets()
            int r9 = r5.f3294d
            int r10 = r7.top
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetTop()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f3294d = r9
            int r9 = r5.f3295e
            int r10 = r7.right
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetRight()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f3295e = r9
            int r9 = r5.f3296f
            int r10 = r7.bottom
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetBottom()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f3296f = r9
            int r9 = r5.f3297g
            int r7 = r7.left
            int r7 = java.lang.Math.max(r9, r7)
            int r4 = r4.getSafeInsetLeft()
            int r4 = java.lang.Math.max(r7, r4)
            r5.f3297g = r4
            goto L_0x01a7
        L_0x0103:
            r11 = 3
            if (r9 != 0) goto L_0x0134
            android.content.Context r12 = r15.getContext()
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            int r13 = r13.orientation
            if (r13 != r10) goto L_0x0134
            java.lang.String r13 = "display"
            java.lang.Object r12 = r12.getSystemService(r13)
            android.hardware.display.DisplayManager r12 = (android.hardware.display.DisplayManager) r12
            android.view.Display r12 = r12.getDisplay(r7)
            int r12 = r12.getRotation()
            if (r12 != r8) goto L_0x012a
            r12 = r11
            goto L_0x0135
        L_0x012a:
            if (r12 != r11) goto L_0x012e
            r12 = r10
            goto L_0x0135
        L_0x012e:
            if (r12 == 0) goto L_0x0132
            if (r12 != r10) goto L_0x0134
        L_0x0132:
            r12 = r6
            goto L_0x0135
        L_0x0134:
            r12 = r8
        L_0x0135:
            if (r4 == 0) goto L_0x013c
            int r4 = r16.getSystemWindowInsetTop()
            goto L_0x013d
        L_0x013c:
            r4 = r7
        L_0x013d:
            r5.f3294d = r4
            if (r12 == r11) goto L_0x0149
            if (r12 != r6) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            int r4 = r16.getSystemWindowInsetRight()
            goto L_0x014a
        L_0x0149:
            r4 = r7
        L_0x014a:
            r5.f3295e = r4
            r13 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
            if (r9 == 0) goto L_0x0173
            android.view.View r4 = r15.getRootView()
            int r4 = r4.getHeight()
            int r9 = r16.getSystemWindowInsetBottom()
            double r8 = (double) r9
            double r6 = (double) r4
            double r6 = r6 * r13
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0168
            r4 = 0
            goto L_0x016c
        L_0x0168:
            int r4 = r16.getSystemWindowInsetBottom()
        L_0x016c:
            if (r4 != 0) goto L_0x0173
            int r4 = r16.getSystemWindowInsetBottom()
            goto L_0x0174
        L_0x0173:
            r4 = 0
        L_0x0174:
            r5.f3296f = r4
            if (r12 == r10) goto L_0x0181
            r4 = 4
            if (r12 != r4) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            int r4 = r16.getSystemWindowInsetLeft()
            goto L_0x0182
        L_0x0181:
            r4 = 0
        L_0x0182:
            r5.f3297g = r4
            r4 = 0
            r5.f3298h = r4
            r5.f3299i = r4
            android.view.View r4 = r15.getRootView()
            int r4 = r4.getHeight()
            int r6 = r16.getSystemWindowInsetBottom()
            double r6 = (double) r6
            double r8 = (double) r4
            double r8 = r8 * r13
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x019e
            r4 = 0
            goto L_0x01a2
        L_0x019e:
            int r4 = r16.getSystemWindowInsetBottom()
        L_0x01a2:
            r5.f3300j = r4
            r4 = 0
            r5.f3301k = r4
        L_0x01a7:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 28
            if (r3 < r6) goto L_0x01d8
            android.view.DisplayCutout r1 = r16.getDisplayCutout()
            if (r1 == 0) goto L_0x01d8
            java.util.List r1 = r1.getBoundingRects()
            java.util.Iterator r1 = r1.iterator()
        L_0x01be:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r1.next()
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r3.toString()
            io.flutter.embedding.engine.renderer.a r6 = new io.flutter.embedding.engine.renderer.a
            r7 = 4
            r8 = 1
            r6.<init>(r3, r7, r8)
            r4.add(r6)
            goto L_0x01be
        L_0x01d8:
            java.util.ArrayList r1 = r5.f3308r
            r1.clear()
            r1.addAll(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r1 < r3) goto L_0x0230
            S1.q r1 = r0.f1484C
            android.content.Context r3 = r15.getContext()
            r1.getClass()
            android.app.Activity r1 = android.support.v4.media.session.a.t(r3)
            r3 = 0
            if (r1 != 0) goto L_0x01f7
            goto L_0x0206
        L_0x01f7:
            android.view.Window r1 = r1.getWindow()
            if (r1 != 0) goto L_0x01fe
            goto L_0x0206
        L_0x01fe:
            android.view.View r1 = r1.getDecorView()
            android.view.WindowInsets r3 = r1.getRootWindowInsets()
        L_0x0206:
            if (r3 != 0) goto L_0x020d
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0215
        L_0x020d:
            int r1 = android.view.WindowInsets.Type.captionBar()
            java.util.List r1 = r3.getBoundingRects(r1)
        L_0x0215:
            int r3 = r5.f3294d
            java.util.Iterator r1 = r1.iterator()
        L_0x021b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x022e
            java.lang.Object r4 = r1.next()
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r4 = r4.bottom
            int r3 = java.lang.Math.max(r3, r4)
            goto L_0x021b
        L_0x022e:
            r5.f3294d = r3
        L_0x0230:
            r15.e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public final void onAttachedToWindow() {
        m mVar;
        Executor executor;
        super.onAttachedToWindow();
        try {
            C0145g gVar = C0146h.f2901d;
            Context context = getContext();
            gVar.getClass();
            mVar = new m(14, (Object) new r(C0145g.a(context)));
        } catch (NoClassDefFoundError unused) {
            mVar = null;
        }
        this.f1501w = mVar;
        Activity t3 = android.support.v4.media.session.a.t(getContext());
        m mVar2 = this.f1501w;
        if (mVar2 != null && t3 != null) {
            this.f1483B = new m(0, this);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 28) {
                executor = C0412e.a(context2);
            } else {
                executor = new W0.o(2, new Handler(context2.getMainLooper()));
            }
            m mVar3 = this.f1483B;
            r rVar = (r) mVar2.f100g;
            i.e(executor, "executor");
            i.e(mVar3, "consumer");
            C0140b bVar = (C0140b) rVar.f160g;
            bVar.getClass();
            C0147i iVar = new C0147i(bVar, t3, (C0420d) null);
            C0426j jVar = C0426j.f4457f;
            L2.c cVar = new L2.c(iVar, jVar, -2, 1);
            d dVar = C.f715a;
            J2.c cVar2 = N2.o.f1214a;
            if (cVar2.n(C0068t.f786g) == null) {
                L2.d dVar2 = cVar;
                if (!cVar2.equals(jVar)) {
                    dVar2 = M2.l.a(cVar, cVar2, 0, 0, 6);
                }
                r rVar2 = (r) rVar.f161h;
                rVar2.getClass();
                i.e(dVar2, "flow");
                ReentrantLock reentrantLock = (ReentrantLock) rVar2.f160g;
                reentrantLock.lock();
                LinkedHashMap linkedHashMap = (LinkedHashMap) rVar2.f161h;
                try {
                    if (linkedHashMap.get(mVar3) == null) {
                        linkedHashMap.put(mVar3, C0071w.h(C0071w.a(new K(executor)), (C0067s) null, new C0125a(dVar2, mVar3, (C0420d) null), 3));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1492m != null) {
            this.f1497r.b(configuration);
            d();
            android.support.v4.media.session.a.f(getContext(), this.f1492m);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            r10 = this;
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x000b
            android.view.inputmethod.InputConnection r11 = super.onCreateInputConnection(r11)
            return r11
        L_0x000b:
            io.flutter.plugin.editing.j r0 = r10.f1495p
            C0.f r5 = r10.f1498s
            A.l r1 = r0.f3360e
            int r2 = r1.f55b
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x001b
            r0.f3365j = r4
            goto L_0x0159
        L_0x001b:
            r6 = 4
            if (r2 != r6) goto L_0x0020
            goto L_0x0159
        L_0x0020:
            r7 = 3
            if (r2 != r7) goto L_0x0033
            boolean r11 = r0.f3371p
            if (r11 == 0) goto L_0x002b
            io.flutter.plugin.editing.d r4 = r0.f3365j
            goto L_0x0159
        L_0x002b:
            io.flutter.plugin.platform.l r11 = r0.f3366k
            int r0 = r1.f56c
            r11.d(r0)
            throw r4
        L_0x0033:
            b2.k r1 = r0.f3361f
            b2.l r2 = r1.f2755g
            r4 = 2
            int r8 = r2.f2762a
            if (r8 != r4) goto L_0x003e
            goto L_0x00bb
        L_0x003e:
            r9 = 5
            if (r8 != r9) goto L_0x0053
            boolean r6 = r2.f2763b
            if (r6 == 0) goto L_0x0047
            r4 = 4098(0x1002, float:5.743E-42)
        L_0x0047:
            boolean r2 = r2.f2764c
            if (r2 == 0) goto L_0x0050
            r2 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x004d:
            r6 = r2
            goto L_0x00bb
        L_0x0050:
            r6 = r4
            goto L_0x00bb
        L_0x0053:
            r2 = 6
            if (r8 != r2) goto L_0x0059
            r6 = r7
            goto L_0x00bb
        L_0x0059:
            r2 = 11
            if (r8 != r2) goto L_0x0060
            r6 = 0
            goto L_0x00bb
        L_0x0060:
            r2 = 7
            if (r8 != r2) goto L_0x0067
            r2 = 131073(0x20001, float:1.83672E-40)
            goto L_0x0091
        L_0x0067:
            r2 = 8
            if (r8 == r2) goto L_0x008f
            r2 = 13
            if (r8 != r2) goto L_0x0070
            goto L_0x008f
        L_0x0070:
            r2 = 9
            if (r8 == r2) goto L_0x008c
            r2 = 12
            if (r8 != r2) goto L_0x0079
            goto L_0x008c
        L_0x0079:
            r2 = 10
            if (r8 != r2) goto L_0x0080
            r2 = 145(0x91, float:2.03E-43)
            goto L_0x0091
        L_0x0080:
            if (r8 != r7) goto L_0x0085
            r2 = 97
            goto L_0x0091
        L_0x0085:
            if (r8 != r6) goto L_0x008a
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0091
        L_0x008a:
            r2 = r3
            goto L_0x0091
        L_0x008c:
            r2 = 17
            goto L_0x0091
        L_0x008f:
            r2 = 33
        L_0x0091:
            boolean r6 = r1.f2749a
            if (r6 == 0) goto L_0x009a
            r6 = 524416(0x80080, float:7.34863E-40)
        L_0x0098:
            r2 = r2 | r6
            goto L_0x00aa
        L_0x009a:
            boolean r6 = r1.f2750b
            if (r6 == 0) goto L_0x00a2
            r6 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r6
        L_0x00a2:
            boolean r6 = r1.f2751c
            if (r6 != 0) goto L_0x00aa
            r6 = 524432(0x80090, float:7.34886E-40)
            goto L_0x0098
        L_0x00aa:
            int r6 = r1.f2754f
            if (r6 != r3) goto L_0x00b1
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            goto L_0x004d
        L_0x00b1:
            if (r6 != r4) goto L_0x00b6
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            goto L_0x004d
        L_0x00b6:
            if (r6 != r7) goto L_0x004d
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            goto L_0x004d
        L_0x00bb:
            r11.inputType = r6
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r11.imeOptions = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 < r4) goto L_0x00cf
            boolean r4 = r1.f2752d
            if (r4 != 0) goto L_0x00cf
            r4 = 50331648(0x3000000, float:3.761582E-37)
            r11.imeOptions = r4
        L_0x00cf:
            java.lang.Integer r1 = r1.f2756h
            int r1 = r1.intValue()
            b2.k r4 = r0.f3361f
            java.lang.String r6 = r4.f2757i
            if (r6 == 0) goto L_0x00df
            r11.actionLabel = r6
            r11.actionId = r1
        L_0x00df:
            int r6 = r11.imeOptions
            r1 = r1 | r6
            r11.imeOptions = r1
            java.util.Locale[] r1 = r4.f2761m
            if (r1 == 0) goto L_0x00f3
            android.os.LocaleList r1 = new android.os.LocaleList
            b2.k r4 = r0.f3361f
            java.util.Locale[] r4 = r4.f2761m
            r1.<init>(r4)
            r11.hintLocales = r1
        L_0x00f3:
            b2.k r1 = r0.f3361f
            java.lang.String[] r1 = r1.f2759k
            if (r1 == 0) goto L_0x011a
            r4 = 25
            if (r2 < r4) goto L_0x0101
            r11.contentMimeTypes = r1
            goto L_0x011a
        L_0x0101:
            android.os.Bundle r4 = r11.extras
            if (r4 != 0) goto L_0x010c
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r11.extras = r4
        L_0x010c:
            android.os.Bundle r4 = r11.extras
            java.lang.String r6 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r4.putStringArray(r6, r1)
            android.os.Bundle r4 = r11.extras
            java.lang.String r6 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r4.putStringArray(r6, r1)
        L_0x011a:
            r1 = 34
            if (r2 < r1) goto L_0x0130
            android.os.Bundle r1 = r11.extras
            if (r1 != 0) goto L_0x0129
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r11.extras = r1
        L_0x0129:
            android.os.Bundle r1 = r11.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r1.putBoolean(r2, r3)
        L_0x0130:
            io.flutter.plugin.editing.d r8 = new io.flutter.plugin.editing.d
            A.l r1 = r0.f3360e
            int r3 = r1.f56c
            io.flutter.plugin.editing.g r6 = r0.f3363h
            C0.r r4 = r0.f3359d
            r1 = r8
            r2 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.flutter.plugin.editing.g r1 = r0.f3363h
            r1.getClass()
            int r1 = android.text.Selection.getSelectionStart(r1)
            r11.initialSelStart = r1
            io.flutter.plugin.editing.g r1 = r0.f3363h
            r1.getClass()
            int r1 = android.text.Selection.getSelectionEnd(r1)
            r11.initialSelEnd = r1
            r0.f3365j = r8
            r4 = r8
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDetachedFromWindow() {
        m mVar;
        m mVar2 = this.f1501w;
        if (!(mVar2 == null || (mVar = this.f1483B) == null)) {
            r rVar = (r) ((r) mVar2.f100g).f161h;
            rVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) rVar.f160g;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) rVar.f161h;
            try {
                Q q3 = (Q) linkedHashMap.get(mVar);
                if (q3 != null) {
                    q3.a((CancellationException) null);
                }
                Q q4 = (Q) linkedHashMap.remove(mVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f1483B = null;
        this.f1501w = null;
        super.onDetachedFromWindow();
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z3;
        if (c()) {
            C0075a aVar = this.f1499t;
            Context context = getContext();
            aVar.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isFromSource && z3) {
                int b3 = C0075a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                aVar.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0075a.f1432f, allocateDirect, context);
                if (allocateDirect.position() % 288 == 0) {
                    aVar.f1433a.f3309a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f1500u.e(motionEvent, false);
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        j jVar = this.f1495p;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
        } else if (jVar.f3362g != null) {
            String str = (String) jVar.f3361f.f2758j.f4622f;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i4 = 0; i4 < jVar.f3362g.size(); i4++) {
                int keyAt = jVar.f3362g.keyAt(i4);
                C0464y yVar = ((b2.k) jVar.f3362g.valueAt(i4)).f2758j;
                if (yVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i4);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) yVar.f4623g;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) yVar.f4625i;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = jVar.f3368m) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(((b2.m) yVar.f4624h).f2765a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f3368m.height());
                        newChild.setAutofillValue(AutofillValue.forText(jVar.f3363h));
                    }
                }
            }
        }
    }

    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.g gVar = this.f1502x;
        gVar.f3292b = i3;
        gVar.f3293c = i4;
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4 != 4) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r8 = r20
            boolean r0 = r19.c()
            if (r0 != 0) goto L_0x000d
            boolean r0 = super.onTouchEvent(r20)
            return r0
        L_0x000d:
            r19.requestUnbufferedDispatch(r20)
            r9 = r19
            S1.a r10 = r9.f1499t
            android.graphics.Matrix r11 = S1.C0075a.f1432f
            r10.getClass()
            int r0 = r20.getActionMasked()
            int r1 = r20.getActionMasked()
            int r12 = S1.C0075a.b(r1)
            r1 = 5
            r2 = 0
            r13 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r2
            goto L_0x0030
        L_0x002f:
            r3 = r13
        L_0x0030:
            if (r3 != 0) goto L_0x0039
            if (r0 == r13) goto L_0x0037
            r4 = 6
            if (r0 != r4) goto L_0x0039
        L_0x0037:
            r0 = r13
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            int r4 = r20.getActionIndex()
            int r4 = r8.getToolType(r4)
            if (r4 == r13) goto L_0x0052
            r5 = 2
            if (r4 == r5) goto L_0x004e
            r5 = 3
            if (r4 == r5) goto L_0x0050
            r6 = 4
            if (r4 == r6) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r1 = r5
            goto L_0x0053
        L_0x0050:
            r1 = r13
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x0059
            if (r1 != 0) goto L_0x0059
            r14 = r13
            goto L_0x005a
        L_0x0059:
            r14 = r2
        L_0x005a:
            int r15 = r20.getPointerCount()
            int r1 = r15 + r14
            int r1 = r1 * 288
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r7.order(r1)
            if (r3 == 0) goto L_0x0082
            int r2 = r20.getActionIndex()
            r13 = 0
            r4 = 0
            r0 = r10
            r1 = r20
            r3 = r12
            r5 = r11
            r6 = r7
            r8 = r7
            r7 = r13
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            r18 = r8
            goto L_0x00ea
        L_0x0082:
            if (r0 == 0) goto L_0x00d5
            r6 = r2
        L_0x0085:
            if (r6 >= r15) goto L_0x00b0
            int r0 = r20.getActionIndex()
            if (r6 == r0) goto L_0x00a7
            int r0 = r8.getToolType(r6)
            if (r0 != r13) goto L_0x00a7
            r3 = 5
            r4 = 1
            r16 = 0
            r0 = r10
            r1 = r20
            r2 = r6
            r5 = r11
            r17 = r6
            r6 = r7
            r18 = r7
            r7 = r16
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00ab
        L_0x00a7:
            r17 = r6
            r18 = r7
        L_0x00ab:
            int r6 = r17 + 1
            r7 = r18
            goto L_0x0085
        L_0x00b0:
            r18 = r7
            int r2 = r20.getActionIndex()
            r7 = 0
            r4 = 0
            r0 = r10
            r1 = r20
            r3 = r12
            r5 = r11
            r6 = r18
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L_0x00ea
            int r2 = r20.getActionIndex()
            r3 = 2
            r4 = 0
            r7 = 0
            r0 = r10
            r1 = r20
            r5 = r11
            r6 = r18
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00ea
        L_0x00d5:
            r18 = r7
            r13 = r2
        L_0x00d8:
            if (r13 >= r15) goto L_0x00ea
            r7 = 0
            r4 = 0
            r0 = r10
            r1 = r20
            r2 = r13
            r3 = r12
            r5 = r11
            r6 = r18
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int r13 = r13 + 1
            goto L_0x00d8
        L_0x00ea:
            int r0 = r18.position()
            int r0 = r0 % 288
            if (r0 != 0) goto L_0x0101
            int r0 = r18.position()
            io.flutter.embedding.engine.renderer.h r1 = r10.f1433a
            io.flutter.embedding.engine.FlutterJNI r1 = r1.f3309a
            r2 = r18
            r1.dispatchPointerDataPacket(r2, r0)
            r0 = 1
            return r0
        L_0x0101:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Packet position is not on field boundary"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(q qVar) {
        this.f1484C = qVar;
    }

    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f1488i;
        if (view instanceof j) {
            ((j) view).setVisibility(i3);
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public void setWindowInfoListenerDisplayFeatures(C0148j jVar) {
        C0140b bVar;
        int i3;
        ? r8 = jVar.f2906a;
        ArrayList arrayList = new ArrayList();
        for (C0141c cVar : r8) {
            cVar.f2889a.c().toString();
            a0.b bVar2 = cVar.f2889a;
            int b3 = bVar2.b();
            C0140b bVar3 = C0140b.f2882i;
            if (b3 == 0 || bVar2.a() == 0) {
                bVar = C0140b.f2881h;
            } else {
                bVar = bVar3;
            }
            int i4 = 2;
            if (bVar == bVar3) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            C0140b bVar4 = C0140b.f2883j;
            C0140b bVar5 = cVar.f2891c;
            if (bVar5 != bVar4) {
                if (bVar5 == C0140b.f2884k) {
                    i4 = 3;
                } else {
                    i4 = 1;
                }
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar2.c(), i3, i4));
        }
        ArrayList arrayList2 = this.f1502x.f3307q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [S1.q, java.lang.Object] */
    public o(C0078d dVar, l lVar) {
        super(dVar, (AttributeSet) null);
        this.f1486g = lVar;
        this.f1488i = lVar;
        b();
    }
}
