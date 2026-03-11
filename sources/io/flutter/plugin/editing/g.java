package io.flutter.plugin.editing;

import S1.o;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import b2.m;
import java.util.ArrayList;
import java.util.Iterator;

public final class g extends SpannableStringBuilder {

    /* renamed from: f  reason: collision with root package name */
    public int f3332f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3333g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f3334h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f3335i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3336j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public String f3337k;

    /* renamed from: l  reason: collision with root package name */
    public String f3338l;

    /* renamed from: m  reason: collision with root package name */
    public int f3339m;

    /* renamed from: n  reason: collision with root package name */
    public int f3340n;

    /* renamed from: o  reason: collision with root package name */
    public int f3341o;

    /* renamed from: p  reason: collision with root package name */
    public int f3342p;

    /* renamed from: q  reason: collision with root package name */
    public final e f3343q;

    public g(m mVar, o oVar) {
        this.f3343q = new e(oVar, this);
        if (mVar != null) {
            f(mVar);
        }
    }

    public final void a(f fVar) {
        if (this.f3333g > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f3332f > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f3335i.add(fVar);
            return;
        }
        this.f3334h.add(fVar);
    }

    public final void b() {
        this.f3332f++;
        if (this.f3333g > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f3332f == 1 && !this.f3334h.isEmpty()) {
            this.f3338l = toString();
            this.f3339m = Selection.getSelectionStart(this);
            this.f3340n = Selection.getSelectionEnd(this);
            this.f3341o = BaseInputConnection.getComposingSpanStart(this);
            this.f3342p = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void c() {
        boolean z3;
        int i3 = this.f3332f;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f3334h;
        ArrayList arrayList2 = this.f3335i;
        if (i3 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f3333g++;
                ((f) it.next()).a(true);
                this.f3333g--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                boolean z4 = !toString().equals(this.f3338l);
                boolean z5 = false;
                if (this.f3339m == Selection.getSelectionStart(this) && this.f3340n == Selection.getSelectionEnd(this)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!(this.f3341o == BaseInputConnection.getComposingSpanStart(this) && this.f3342p == BaseInputConnection.getComposingSpanEnd(this))) {
                    z5 = true;
                }
                d(z4, z3, z5);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f3332f--;
    }

    public final void d(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f3334h.iterator();
            while (it.hasNext()) {
                this.f3333g++;
                ((f) it.next()).a(z3);
                this.f3333g--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f3333g > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f3334h.remove(fVar);
        if (this.f3332f > 0) {
            this.f3335i.remove(fVar);
        }
    }

    public final void f(m mVar) {
        int i3;
        b();
        replace(0, length(), mVar.f2765a);
        int i4 = mVar.f2766b;
        if (i4 >= 0) {
            Selection.setSelection(this, i4, mVar.f2767c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = mVar.f2768d;
        if (i5 < 0 || i5 >= (i3 = mVar.f2769e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f3343q.setComposingRegion(i5, i3);
        }
        this.f3336j.clear();
        c();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        ArrayList arrayList = this.f3336j;
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ? obj2 = new Object();
        obj2.f3352e = selectionStart;
        obj2.f3353f = selectionEnd;
        obj2.f3354g = composingSpanStart;
        obj2.f3355h = composingSpanEnd;
        obj2.f3348a = gVar;
        obj2.f3349b = "";
        obj2.f3350c = -1;
        obj2.f3351d = -1;
        arrayList.add(obj2);
    }

    public final String toString() {
        String str = this.f3337k;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f3337k = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        if (this.f3333g > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i9 = i8 - i7;
        boolean z3 = i9 != i6 - i5;
        for (int i10 = 0; i10 < i9 && !z3; i10++) {
            z3 |= charAt(i7 + i10) != charSequence.charAt(i5 + i10);
        }
        CharSequence charSequence2 = charSequence;
        if (z3) {
            this.f3337k = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        ArrayList arrayList = this.f3336j;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ? obj = new Object();
        obj.f3352e = selectionStart2;
        obj.f3353f = selectionEnd2;
        obj.f3354g = composingSpanStart2;
        obj.f3355h = composingSpanEnd2;
        String charSequence3 = charSequence.toString();
        obj.f3348a = gVar;
        obj.f3349b = charSequence3;
        obj.f3350c = i7;
        obj.f3351d = i8;
        arrayList.add(obj);
        if (this.f3332f > 0) {
            return replace;
        }
        d(z3, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
