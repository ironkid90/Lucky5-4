package i;

import A.A;
import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: i.m  reason: case insensitive filesystem */
public class C0211m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3200a;

    /* renamed from: b  reason: collision with root package name */
    public final C0207i f3201b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3202c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3203d;

    /* renamed from: e  reason: collision with root package name */
    public View f3204e;

    /* renamed from: f  reason: collision with root package name */
    public int f3205f = 8388611;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3206g;

    /* renamed from: h  reason: collision with root package name */
    public C0212n f3207h;

    /* renamed from: i  reason: collision with root package name */
    public C0209k f3208i;

    /* renamed from: j  reason: collision with root package name */
    public C0210l f3209j;

    /* renamed from: k  reason: collision with root package name */
    public final C0210l f3210k = new C0210l(this);

    public C0211m(int i3, Context context, View view, C0207i iVar, boolean z3) {
        this.f3200a = context;
        this.f3201b = iVar;
        this.f3204e = view;
        this.f3202c = z3;
        this.f3203d = i3;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [i.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.C0209k a() {
        /*
            r11 = this;
            i.k r0 = r11.f3208i
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.f3200a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131099670(0x7f060016, float:1.78117E38)
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L_0x003b
            i.f r0 = new i.f
            android.view.View r2 = r11.f3204e
            int r3 = r11.f3203d
            boolean r4 = r11.f3202c
            r0.<init>(r1, r2, r3, r4)
            goto L_0x004b
        L_0x003b:
            i.r r0 = new i.r
            android.view.View r8 = r11.f3204e
            android.content.Context r7 = r11.f3200a
            boolean r10 = r11.f3202c
            i.i r9 = r11.f3201b
            int r6 = r11.f3203d
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x004b:
            i.i r1 = r11.f3201b
            r0.l(r1)
            i.l r1 = r11.f3210k
            r0.r(r1)
            android.view.View r1 = r11.f3204e
            r0.n(r1)
            i.n r1 = r11.f3207h
            r0.f(r1)
            boolean r1 = r11.f3206g
            r0.o(r1)
            int r1 = r11.f3205f
            r0.p(r1)
            r11.f3208i = r0
        L_0x006b:
            i.k r0 = r11.f3208i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0211m.a():i.k");
    }

    public final boolean b() {
        C0209k kVar = this.f3208i;
        if (kVar == null || !kVar.i()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.f3208i = null;
        C0210l lVar = this.f3209j;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        C0209k a2 = a();
        a2.s(z4);
        if (z3) {
            int i5 = this.f3205f;
            View view = this.f3204e;
            Field field = A.f0a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f3204e.getWidth();
            }
            a2.q(i3);
            a2.t(i4);
            int i6 = (int) ((this.f3200a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3198f = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a2.c();
    }
}
