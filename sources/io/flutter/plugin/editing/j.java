package io.flutter.plugin.editing;

import A.C0011l;
import C0.r;
import F0.h;
import S1.o;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputMethodManager;
import b2.k;
import b2.m;
import c2.p;
import c2.q;
import d2.C0152a;
import i2.C0231l;
import io.flutter.plugin.platform.l;
import s1.C0464y;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public final o f3356a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f3357b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f3358c;

    /* renamed from: d  reason: collision with root package name */
    public final r f3359d;

    /* renamed from: e  reason: collision with root package name */
    public C0011l f3360e = new C0011l(1, 0);

    /* renamed from: f  reason: collision with root package name */
    public k f3361f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray f3362g;

    /* renamed from: h  reason: collision with root package name */
    public g f3363h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3364i;

    /* renamed from: j  reason: collision with root package name */
    public d f3365j;

    /* renamed from: k  reason: collision with root package name */
    public final l f3366k;

    /* renamed from: l  reason: collision with root package name */
    public final io.flutter.plugin.platform.k f3367l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f3368m;

    /* renamed from: n  reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f3369n;

    /* renamed from: o  reason: collision with root package name */
    public m f3370o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3371p;

    public j(o oVar, r rVar, h hVar, l lVar, io.flutter.plugin.platform.k kVar) {
        this.f3356a = oVar;
        this.f3363h = new g((m) null, oVar);
        this.f3357b = (InputMethodManager) oVar.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f3358c = C0231l.f(oVar.getContext().getSystemService(C0231l.k()));
        } else {
            this.f3358c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(oVar);
            this.f3369n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new b2.h(6, this));
        }
        this.f3359d = rVar;
        rVar.f161h = new C0152a(4, this);
        ((q) rVar.f160g).a("TextInputClient.requestExistingInputState", (Object) null, (p) null);
        this.f3366k = lVar;
        lVar.f3401k = this;
        this.f3367l = kVar;
        kVar.getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (r10 == r0.f2769e) goto L_0x017b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r17) {
        /*
            r16 = this;
            r1 = r16
            r3 = 0
            r4 = 2
            if (r17 == 0) goto L_0x002f
            io.flutter.plugin.editing.g r0 = r1.f3363h
            java.lang.String r0 = r0.toString()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x002f
            android.view.autofill.AutofillManager r5 = r1.f3358c
            if (r5 == 0) goto L_0x002f
            android.util.SparseArray r6 = r1.f3362g
            if (r6 == 0) goto L_0x002f
            b2.k r6 = r1.f3361f
            s1.y r6 = r6.f2758j
            java.lang.Object r6 = r6.f4622f
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.hashCode()
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r0)
            S1.o r7 = r1.f3356a
            r5.notifyValueChanged(r7, r6, r0)
        L_0x002f:
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.getClass()
            int r7 = android.text.Selection.getSelectionStart(r0)
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.getClass()
            int r8 = android.text.Selection.getSelectionEnd(r0)
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.getClass()
            int r9 = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(r0)
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.getClass()
            int r10 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(r0)
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r0 = r0.f3336j
            r5.<init>(r0)
            r0.clear()
            b2.m r0 = r1.f3370o
            if (r0 == 0) goto L_0x017b
            io.flutter.plugin.editing.g r0 = r1.f3363h
            java.lang.String r0 = r0.toString()
            b2.m r6 = r1.f3370o
            java.lang.String r6 = r6.f2765a
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x008a
            b2.m r0 = r1.f3370o
            int r6 = r0.f2766b
            if (r7 != r6) goto L_0x008a
            int r6 = r0.f2767c
            if (r8 != r6) goto L_0x008a
            int r6 = r0.f2768d
            if (r9 != r6) goto L_0x008a
            int r0 = r0.f2769e
            if (r10 != r0) goto L_0x008a
            goto L_0x017b
        L_0x008a:
            io.flutter.plugin.editing.g r0 = r1.f3363h
            r0.toString()
            b2.k r0 = r1.f3361f
            boolean r0 = r0.f2753e
            C0.r r11 = r1.f3359d
            if (r0 == 0) goto L_0x0142
            A.l r0 = r1.f3360e
            int r12 = r0.f56c
            r11.getClass()
            r5.size()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            org.json.JSONArray r14 = new org.json.JSONArray
            r14.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00af:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r5.next()
            io.flutter.plugin.editing.i r0 = (io.flutter.plugin.editing.i) r0
            r0.getClass()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r6 = "oldText"
            java.lang.String r2 = r0.f3348a     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x0104 }
            r15.put(r6, r2)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "deltaText"
            java.lang.String r6 = r0.f3349b     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "deltaStart"
            int r6 = r0.f3350c     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "deltaEnd"
            int r6 = r0.f3351d     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "selectionBase"
            int r6 = r0.f3352e     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "selectionExtent"
            int r6 = r0.f3353f     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "composingBase"
            int r6 = r0.f3354g     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r6)     // Catch:{ JSONException -> 0x0104 }
            java.lang.String r2 = "composingExtent"
            int r0 = r0.f3355h     // Catch:{ JSONException -> 0x0104 }
            r15.put(r2, r0)     // Catch:{ JSONException -> 0x0104 }
            goto L_0x0118
        L_0x0104:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "unable to create JSONObject: "
            r2.<init>(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "TextEditingDelta"
            android.util.Log.e(r2, r0)
        L_0x0118:
            r14.put(r15)
            goto L_0x00af
        L_0x011c:
            java.lang.String r0 = "deltas"
            r13.put(r0, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.io.Serializable[] r2 = new java.io.Serializable[r4]
            r2[r3] = r0
            r3 = 1
            r2[r3] = r13
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.lang.Object r2 = r11.f160g
            c2.q r2 = (c2.q) r2
            java.lang.String r3 = "TextInputClient.updateEditingStateWithDeltas"
            r4 = 0
            r2.a(r3, r0, r4)
            io.flutter.plugin.editing.g r0 = r1.f3363h
            java.util.ArrayList r0 = r0.f3336j
            r0.clear()
            goto L_0x016c
        L_0x0142:
            A.l r0 = r1.f3360e
            int r0 = r0.f56c
            io.flutter.plugin.editing.g r2 = r1.f3363h
            java.lang.String r2 = r2.toString()
            r11.getClass()
            java.util.HashMap r2 = C0.r.C(r2, r7, r8, r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.Serializable[] r4 = new java.io.Serializable[r4]
            r4[r3] = r0
            r3 = 1
            r4[r3] = r2
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.lang.Object r2 = r11.f160g
            c2.q r2 = (c2.q) r2
            java.lang.String r3 = "TextInputClient.updateEditingState"
            r4 = 0
            r2.a(r3, r0, r4)
        L_0x016c:
            b2.m r0 = new b2.m
            io.flutter.plugin.editing.g r2 = r1.f3363h
            java.lang.String r6 = r2.toString()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f3370o = r0
            goto L_0x0182
        L_0x017b:
            io.flutter.plugin.editing.g r0 = r1.f3363h
            java.util.ArrayList r0 = r0.f3336j
            r0.clear()
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.j.a(boolean):void");
    }

    public final void b() {
        this.f3366k.f3401k = null;
        this.f3367l.getClass();
        this.f3359d.f161h = null;
        c();
        this.f3363h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f3369n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        k kVar;
        C0464y yVar;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f3358c) != null && (kVar = this.f3361f) != null && (yVar = kVar.f2758j) != null && this.f3362g != null) {
            autofillManager.notifyViewExited(this.f3356a, ((String) yVar.f4622f).hashCode());
        }
    }

    public final void d(k kVar) {
        C0464y yVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (kVar == null || (yVar = kVar.f2758j) == null) {
                this.f3362g = null;
                return;
            }
            SparseArray sparseArray = new SparseArray();
            this.f3362g = sparseArray;
            k[] kVarArr = kVar.f2760l;
            if (kVarArr == null) {
                sparseArray.put(((String) yVar.f4622f).hashCode(), kVar);
                return;
            }
            for (k kVar2 : kVarArr) {
                C0464y yVar2 = kVar2.f2758j;
                if (yVar2 != null) {
                    SparseArray sparseArray2 = this.f3362g;
                    String str = (String) yVar2.f4622f;
                    sparseArray2.put(str.hashCode(), kVar2);
                    this.f3358c.notifyValueChanged(this.f3356a, str.hashCode(), AutofillValue.forText(((m) yVar2.f4624h).f2765a));
                }
            }
        }
    }
}
