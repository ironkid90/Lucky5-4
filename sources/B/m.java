package B;

import C0.f;
import C0.r;
import I.C0032h;
import I.a0;
import I.b0;
import L.k;
import L2.d;
import L2.s;
import M.c;
import R.e;
import S1.D;
import S1.E;
import T.M;
import T.t;
import T.u;
import U1.b;
import U1.g;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import c2.C0134b;
import c2.C0136d;
import c2.o;
import c2.q;
import c2.x;
import c2.y;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.view.a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class m implements d, C0032h, e, D, M, C0136d, C0134b, o {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f99f;

    /* renamed from: g  reason: collision with root package name */
    public Object f100g;

    public /* synthetic */ m(int i3, Object obj) {
        this.f99f = i3;
        this.f100g = obj;
    }

    public static ArrayList q(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public void b(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case k.LONG_FIELD_NUMBER /*4*/:
                str = "RESULT_NOT_WRITABLE";
                break;
            case k.STRING_FIELD_NUMBER /*5*/:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                str = "RESULT_IO_EXCEPTION";
                break;
            case k.BYTES_FIELD_NUMBER /*8*/:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f100g).setResultCode(i3);
    }

    public View c(int i3) {
        return ((t) this.f100g).o(i3);
    }

    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public int f() {
        t tVar = (t) this.f100g;
        return tVar.f1665g - tVar.r();
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [z2.p, t2.f] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(L2.e r7, r2.C0420d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof L2.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            L2.a r0 = (L2.a) r0
            int r1 = r0.f1004l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1004l = r1
            goto L_0x0018
        L_0x0013:
            L2.a r0 = new L2.a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f1002j
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1004l
            p2.h r3 = p2.C0368h.f4194a
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            M2.n r7 = r0.f1001i
            M0.a.V(r8)     // Catch:{ all -> 0x002b }
            goto L_0x0056
        L_0x002b:
            r8 = move-exception
            goto L_0x0060
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            M0.a.V(r8)
            M2.n r8 = new M2.n
            r2.i r2 = r0.f4684g
            A2.i.b(r2)
            r8.<init>(r7, r2)
            r0.f1001i = r8     // Catch:{ all -> 0x005e }
            r0.f1004l = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r7 = r6.f100g     // Catch:{ all -> 0x005e }
            t2.f r7 = (t2.C0488f) r7     // Catch:{ all -> 0x005e }
            java.lang.Object r7 = r7.i(r8, r0)     // Catch:{ all -> 0x005e }
            if (r7 != r1) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r7 = r3
        L_0x0052:
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r7 = r8
        L_0x0056:
            r7.n()
            return r3
        L_0x005a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0060
        L_0x005e:
            r7 = move-exception
            goto L_0x005a
        L_0x0060:
            r7.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.m.g(L2.e, r2.d):java.lang.Object");
    }

    public void h(ByteBuffer byteBuffer, g gVar) {
        y.f2800b.getClass();
        y.c(byteBuffer);
        ((b) this.f100g).getClass();
    }

    public int i() {
        return ((t) this.f100g).u();
    }

    public void j(Object obj, r rVar) {
        f fVar = (f) this.f100g;
        if (((a) fVar.f129i) == null) {
            rVar.q((Object) null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c3 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c3 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c3 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c3 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    a aVar = (a) fVar.f129i;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.g gVar = (io.flutter.view.g) aVar.f3441a;
                        AccessibilityEvent d3 = gVar.d(0, 32);
                        d3.getText().add(str2);
                        gVar.h(d3);
                        break;
                    } else {
                        aVar.getClass();
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    a aVar2 = (a) fVar.f129i;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.g) aVar2.f3441a).f3527a.announceForAccessibility(str3);
                    break;
                }
                break;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.g) ((a) fVar.f129i).f3441a).g(num.intValue(), 1);
                    break;
                }
                break;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.g) ((a) fVar.f129i).f3441a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /*4*/:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.g) ((a) fVar.f129i).f3441a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        rVar.q((Object) null);
    }

    public int k(View view) {
        ((t) this.f100g).getClass();
        return view.getBottom() + ((u) view.getLayoutParams()).f1666a.bottom + ((u) view.getLayoutParams()).bottomMargin;
    }

    public Object l(p pVar, C0488f fVar) {
        return ((C0032h) this.f100g).l(new c(pVar, (C0420d) null), fVar);
    }

    public void m() {
        ((E) this.f100g).f1428b = null;
    }

    public int n(View view) {
        ((t) this.f100g).getClass();
        return (view.getTop() - ((u) view.getLayoutParams()).f1666a.top) - ((u) view.getLayoutParams()).topMargin;
    }

    public d o() {
        return ((C0032h) this.f100g).o();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(c2.m r41, c2.p r42) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            r8 = 2
            r9 = 0
            java.lang.String r10 = "error"
            r11 = 1
            r12 = 0
            int r13 = r1.f99f
            switch(r13) {
                case 22: goto L_0x05dc;
                case 23: goto L_0x000f;
                case 24: goto L_0x0569;
                case 25: goto L_0x000f;
                case 26: goto L_0x0168;
                case 27: goto L_0x000f;
                case 28: goto L_0x00f0;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r2 = r1.f100g
            F0.h r2 = (F0.h) r2
            java.lang.Object r3 = r2.f322g
            c2.n r3 = (c2.n) r3
            if (r3 != 0) goto L_0x001b
            goto L_0x00ef
        L_0x001b:
            java.lang.String r0 = r0.f2785a
            r0.getClass()
            r3 = 34
            int r4 = r0.hashCode()
            switch(r4) {
                case -705821951: goto L_0x0041;
                case 1759284829: goto L_0x0036;
                case 2119738044: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r7 = -1
            goto L_0x004b
        L_0x002b:
            java.lang.String r4 = "Scribe.isStylusHandwritingAvailable"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r7 = r8
            goto L_0x004b
        L_0x0036:
            java.lang.String r4 = "Scribe.startStylusHandwriting"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r7 = r11
            goto L_0x004b
        L_0x0041:
            java.lang.String r4 = "Scribe.isFeatureAvailable"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r7 = r12
        L_0x004b:
            switch(r7) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x008c;
                case 2: goto L_0x0057;
                default: goto L_0x004e;
            }
        L_0x004e:
            r0 = r42
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x00ef
        L_0x0057:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x0066
            java.lang.String r0 = "Requires API level 34 or higher."
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x00ef
        L_0x0066:
            java.lang.Object r0 = r2.f322g     // Catch:{ IllegalStateException -> 0x007f }
            c2.n r0 = (c2.n) r0     // Catch:{ IllegalStateException -> 0x007f }
            java.lang.Object r0 = r0.f2789g     // Catch:{ IllegalStateException -> 0x007f }
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ IllegalStateException -> 0x007f }
            boolean r0 = r0.isStylusHandwritingAvailable()     // Catch:{ IllegalStateException -> 0x007f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x007f }
            r2 = r42
            b2.f r2 = (b2.f) r2     // Catch:{ IllegalStateException -> 0x007f }
            r2.b(r0)     // Catch:{ IllegalStateException -> 0x007f }
            goto L_0x00ef
        L_0x007f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x00ef
        L_0x008c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r0 >= r3) goto L_0x009c
            java.lang.String r0 = "Requires API level 33 or higher."
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x00ef
        L_0x009c:
            java.lang.Object r0 = r2.f322g     // Catch:{ IllegalStateException -> 0x00b3 }
            c2.n r0 = (c2.n) r0     // Catch:{ IllegalStateException -> 0x00b3 }
            java.lang.Object r2 = r0.f2789g     // Catch:{ IllegalStateException -> 0x00b3 }
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2     // Catch:{ IllegalStateException -> 0x00b3 }
            java.lang.Object r0 = r0.f2790h     // Catch:{ IllegalStateException -> 0x00b3 }
            S1.o r0 = (S1.o) r0     // Catch:{ IllegalStateException -> 0x00b3 }
            r2.startStylusHandwriting(r0)     // Catch:{ IllegalStateException -> 0x00b3 }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x00b3 }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x00b3 }
            goto L_0x00ef
        L_0x00b3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x00ef
        L_0x00c0:
            java.lang.Object r0 = r2.f322g     // Catch:{ IllegalStateException -> 0x00e3 }
            c2.n r0 = (c2.n) r0     // Catch:{ IllegalStateException -> 0x00e3 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r2 < r3) goto L_0x00d3
            java.lang.Object r0 = r0.f2789g     // Catch:{ IllegalStateException -> 0x00e3 }
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ IllegalStateException -> 0x00e3 }
            boolean r0 = r0.isStylusHandwritingAvailable()     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r0 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d3:
            r0.getClass()     // Catch:{ IllegalStateException -> 0x00e3 }
        L_0x00d6:
            r11 = r12
        L_0x00d7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ IllegalStateException -> 0x00e3 }
            r2 = r42
            b2.f r2 = (b2.f) r2     // Catch:{ IllegalStateException -> 0x00e3 }
            r2.b(r0)     // Catch:{ IllegalStateException -> 0x00e3 }
            goto L_0x00ef
        L_0x00e3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
        L_0x00ef:
            return
        L_0x00f0:
            java.lang.Object r2 = r1.f100g
            C0.r r2 = (C0.r) r2
            java.lang.Object r3 = r2.f161h
            f2.a r3 = (f2.C0167a) r3
            if (r3 != 0) goto L_0x00fb
            goto L_0x0167
        L_0x00fb:
            java.lang.String r3 = r0.f2785a
            java.lang.Object r0 = r0.f2786b
            r3.getClass()
            java.lang.String r4 = "ProcessText.processTextAction"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0137
            java.lang.String r0 = "ProcessText.queryTextActions"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x011a
            r0 = r42
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x0167
        L_0x011a:
            java.lang.Object r0 = r2.f161h     // Catch:{ IllegalStateException -> 0x012a }
            f2.a r0 = (f2.C0167a) r0     // Catch:{ IllegalStateException -> 0x012a }
            java.util.HashMap r0 = r0.b()     // Catch:{ IllegalStateException -> 0x012a }
            r2 = r42
            b2.f r2 = (b2.f) r2     // Catch:{ IllegalStateException -> 0x012a }
            r2.b(r0)     // Catch:{ IllegalStateException -> 0x012a }
            goto L_0x0167
        L_0x012a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0167
        L_0x0137:
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Object r3 = r0.get(r12)     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Object r4 = r0.get(r11)     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalStateException -> 0x015b }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Object r2 = r2.f161h     // Catch:{ IllegalStateException -> 0x015b }
            f2.a r2 = (f2.C0167a) r2     // Catch:{ IllegalStateException -> 0x015b }
            r5 = r42
            b2.f r5 = (b2.f) r5     // Catch:{ IllegalStateException -> 0x015b }
            r2.a(r3, r4, r0, r5)     // Catch:{ IllegalStateException -> 0x015b }
            goto L_0x0167
        L_0x015b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
        L_0x0167:
            return
        L_0x0168:
            java.lang.Object r13 = r1.f100g
            F0.h r13 = (F0.h) r13
            java.lang.Object r14 = r13.f322g
            c2.n r14 = (c2.n) r14
            if (r14 != 0) goto L_0x0174
            goto L_0x0568
        L_0x0174:
            java.lang.String r14 = r0.f2785a
            r14.getClass()
            java.lang.String r15 = "left"
            java.lang.String r7 = "top"
            java.lang.String r2 = "height"
            java.lang.String r3 = "width"
            java.lang.String r4 = "direction"
            java.lang.String r5 = "id"
            java.lang.Object r0 = r0.f2786b
            int r21 = r14.hashCode()
            switch(r21) {
                case -1352294148: goto L_0x01e6;
                case -1019779949: goto L_0x01da;
                case -934437708: goto L_0x01ce;
                case -756050293: goto L_0x01c2;
                case -308988850: goto L_0x01b6;
                case 110550847: goto L_0x01aa;
                case 576796989: goto L_0x019e;
                case 1671767583: goto L_0x0192;
                default: goto L_0x018e;
            }
        L_0x018e:
            r16 = -1
            goto L_0x01f1
        L_0x0192:
            java.lang.String r6 = "dispose"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x019b
            goto L_0x018e
        L_0x019b:
            r16 = 7
            goto L_0x01f1
        L_0x019e:
            java.lang.String r6 = "setDirection"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01a7
            goto L_0x018e
        L_0x01a7:
            r16 = 6
            goto L_0x01f1
        L_0x01aa:
            java.lang.String r6 = "touch"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01b3
            goto L_0x018e
        L_0x01b3:
            r16 = 5
            goto L_0x01f1
        L_0x01b6:
            java.lang.String r6 = "synchronizeToNativeViewHierarchy"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01bf
            goto L_0x018e
        L_0x01bf:
            r16 = 4
            goto L_0x01f1
        L_0x01c2:
            java.lang.String r6 = "clearFocus"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01cb
            goto L_0x018e
        L_0x01cb:
            r16 = 3
            goto L_0x01f1
        L_0x01ce:
            java.lang.String r6 = "resize"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01d7
            goto L_0x018e
        L_0x01d7:
            r16 = r8
            goto L_0x01f1
        L_0x01da:
            java.lang.String r6 = "offset"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01e3
            goto L_0x018e
        L_0x01e3:
            r16 = r11
            goto L_0x01f1
        L_0x01e6:
            java.lang.String r6 = "create"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x01ef
            goto L_0x018e
        L_0x01ef:
            r16 = r12
        L_0x01f1:
            switch(r16) {
                case 0: goto L_0x045d;
                case 1: goto L_0x040e;
                case 2: goto L_0x03b7;
                case 3: goto L_0x0386;
                case 4: goto L_0x0359;
                case 5: goto L_0x0275;
                case 6: goto L_0x0234;
                case 7: goto L_0x01fd;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            r0 = r42
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x0568
        L_0x01fd:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x0226 }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x0226 }
            java.lang.Object r3 = r2.f2790h     // Catch:{ IllegalStateException -> 0x0226 }
            io.flutter.plugin.platform.k r3 = (io.flutter.plugin.platform.k) r3     // Catch:{ IllegalStateException -> 0x0226 }
            r3.d(r0)     // Catch:{ IllegalStateException -> 0x0226 }
            java.lang.Object r2 = r2.f2789g     // Catch:{ IllegalStateException -> 0x0226 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x0226 }
            b2.h r2 = r2.f3415z     // Catch:{ IllegalStateException -> 0x0226 }
            r2.i(r0)     // Catch:{ IllegalStateException -> 0x0226 }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0226 }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x0226 }
            goto L_0x0568
        L_0x0226:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x0234:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r0.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r3 = r13.f322g     // Catch:{ IllegalStateException -> 0x0267 }
            c2.n r3 = (c2.n) r3     // Catch:{ IllegalStateException -> 0x0267 }
            java.lang.Object r4 = r3.f2790h     // Catch:{ IllegalStateException -> 0x0267 }
            io.flutter.plugin.platform.k r4 = (io.flutter.plugin.platform.k) r4     // Catch:{ IllegalStateException -> 0x0267 }
            r4.d(r2)     // Catch:{ IllegalStateException -> 0x0267 }
            java.lang.Object r3 = r3.f2789g     // Catch:{ IllegalStateException -> 0x0267 }
            io.flutter.plugin.platform.l r3 = (io.flutter.plugin.platform.l) r3     // Catch:{ IllegalStateException -> 0x0267 }
            b2.h r3 = r3.f3415z     // Catch:{ IllegalStateException -> 0x0267 }
            r3.G(r2, r0)     // Catch:{ IllegalStateException -> 0x0267 }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0267 }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x0267 }
            goto L_0x0568
        L_0x0267:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x0275:
            java.util.List r0 = (java.util.List) r0
            b2.d r2 = new b2.d
            r22 = r2
            java.lang.Object r3 = r0.get(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r23 = r3
            java.lang.Object r4 = r0.get(r11)
            r24 = r4
            java.lang.Number r24 = (java.lang.Number) r24
            java.lang.Object r4 = r0.get(r8)
            r25 = r4
            java.lang.Number r25 = (java.lang.Number) r25
            r4 = 3
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r26 = r4.intValue()
            r4 = 4
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r27 = r4.intValue()
            r4 = 5
            java.lang.Object r28 = r0.get(r4)
            r4 = 6
            java.lang.Object r29 = r0.get(r4)
            r4 = 7
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r30 = r4.intValue()
            r4 = 8
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r31 = r4.intValue()
            r4 = 9
            java.lang.Object r4 = r0.get(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            float r4 = (float) r4
            r32 = r4
            r4 = 10
            java.lang.Object r4 = r0.get(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            float r4 = (float) r4
            r33 = r4
            r4 = 11
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r34 = r4.intValue()
            r4 = 12
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r35 = r4.intValue()
            r4 = 13
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r36 = r4.intValue()
            r4 = 14
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r37 = r4.intValue()
            r4 = 15
            java.lang.Object r0 = r0.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r38 = r0.longValue()
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r0 = r13.f322g     // Catch:{ IllegalStateException -> 0x034b }
            c2.n r0 = (c2.n) r0     // Catch:{ IllegalStateException -> 0x034b }
            r0.getClass()     // Catch:{ IllegalStateException -> 0x034b }
            java.lang.Object r4 = r0.f2790h     // Catch:{ IllegalStateException -> 0x034b }
            io.flutter.plugin.platform.k r4 = (io.flutter.plugin.platform.k) r4     // Catch:{ IllegalStateException -> 0x034b }
            r4.d(r3)     // Catch:{ IllegalStateException -> 0x034b }
            java.lang.Object r0 = r0.f2789g     // Catch:{ IllegalStateException -> 0x034b }
            io.flutter.plugin.platform.l r0 = (io.flutter.plugin.platform.l) r0     // Catch:{ IllegalStateException -> 0x034b }
            b2.h r0 = r0.f3415z     // Catch:{ IllegalStateException -> 0x034b }
            r0.C(r2)     // Catch:{ IllegalStateException -> 0x034b }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x034b }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x034b }
            goto L_0x0568
        L_0x034b:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x0359:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x0378 }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x0378 }
            java.lang.Object r2 = r2.f2789g     // Catch:{ IllegalStateException -> 0x0378 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x0378 }
            b2.h r2 = r2.f3415z     // Catch:{ IllegalStateException -> 0x0378 }
            java.lang.Object r2 = r2.f2743g     // Catch:{ IllegalStateException -> 0x0378 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x0378 }
            r2.v = r0     // Catch:{ IllegalStateException -> 0x0378 }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0378 }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x0378 }
            goto L_0x0568
        L_0x0378:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x0386:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x03a9 }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x03a9 }
            java.lang.Object r3 = r2.f2790h     // Catch:{ IllegalStateException -> 0x03a9 }
            io.flutter.plugin.platform.k r3 = (io.flutter.plugin.platform.k) r3     // Catch:{ IllegalStateException -> 0x03a9 }
            r3.d(r0)     // Catch:{ IllegalStateException -> 0x03a9 }
            java.lang.Object r2 = r2.f2789g     // Catch:{ IllegalStateException -> 0x03a9 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x03a9 }
            b2.h r2 = r2.f3415z     // Catch:{ IllegalStateException -> 0x03a9 }
            r2.e(r0)     // Catch:{ IllegalStateException -> 0x03a9 }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x03a9 }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x03a9 }
            goto L_0x0568
        L_0x03a9:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x03b7:
            java.util.Map r0 = (java.util.Map) r0
            b2.e r4 = new b2.e
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Double r3 = (java.lang.Double) r3
            double r16 = r3.doubleValue()
            java.lang.Object r0 = r0.get(r2)
            java.lang.Double r0 = (java.lang.Double) r0
            double r18 = r0.doubleValue()
            r14 = r4
            r15 = r5
            r14.<init>(r15, r16, r18)
            java.lang.Object r0 = r13.f322g     // Catch:{ IllegalStateException -> 0x0400 }
            c2.n r0 = (c2.n) r0     // Catch:{ IllegalStateException -> 0x0400 }
            A.c r2 = new A.c     // Catch:{ IllegalStateException -> 0x0400 }
            r3 = r42
            b2.f r3 = (b2.f) r3     // Catch:{ IllegalStateException -> 0x0400 }
            r2.<init>((b2.f) r3)     // Catch:{ IllegalStateException -> 0x0400 }
            r0.getClass()     // Catch:{ IllegalStateException -> 0x0400 }
            java.lang.Object r3 = r0.f2790h     // Catch:{ IllegalStateException -> 0x0400 }
            io.flutter.plugin.platform.k r3 = (io.flutter.plugin.platform.k) r3     // Catch:{ IllegalStateException -> 0x0400 }
            r3.d(r5)     // Catch:{ IllegalStateException -> 0x0400 }
            java.lang.Object r0 = r0.f2789g     // Catch:{ IllegalStateException -> 0x0400 }
            io.flutter.plugin.platform.l r0 = (io.flutter.plugin.platform.l) r0     // Catch:{ IllegalStateException -> 0x0400 }
            b2.h r0 = r0.f3415z     // Catch:{ IllegalStateException -> 0x0400 }
            r0.F(r4, r2)     // Catch:{ IllegalStateException -> 0x0400 }
            goto L_0x0568
        L_0x0400:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x040e:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x044f }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalStateException -> 0x044f }
            int r3 = r3.intValue()     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Object r4 = r0.get(r7)     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ IllegalStateException -> 0x044f }
            double r18 = r4.doubleValue()     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ IllegalStateException -> 0x044f }
            double r20 = r0.doubleValue()     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Object r0 = r2.f2790h     // Catch:{ IllegalStateException -> 0x044f }
            io.flutter.plugin.platform.k r0 = (io.flutter.plugin.platform.k) r0     // Catch:{ IllegalStateException -> 0x044f }
            r0.d(r3)     // Catch:{ IllegalStateException -> 0x044f }
            java.lang.Object r0 = r2.f2789g     // Catch:{ IllegalStateException -> 0x044f }
            io.flutter.plugin.platform.l r0 = (io.flutter.plugin.platform.l) r0     // Catch:{ IllegalStateException -> 0x044f }
            b2.h r0 = r0.f3415z     // Catch:{ IllegalStateException -> 0x044f }
            r16 = r0
            r17 = r3
            r16.B(r17, r18, r20)     // Catch:{ IllegalStateException -> 0x044f }
            r0 = r42
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x044f }
            r0.b(r9)     // Catch:{ IllegalStateException -> 0x044f }
            goto L_0x0568
        L_0x044f:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
            goto L_0x0568
        L_0x045d:
            java.lang.String r6 = "hybridFallback"
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r14 = "hybrid"
            boolean r16 = r0.containsKey(r14)
            if (r16 == 0) goto L_0x0477
            java.lang.Object r14 = r0.get(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0477
            r14 = r11
            goto L_0x0478
        L_0x0477:
            r14 = r12
        L_0x0478:
            java.lang.String r8 = "params"
            boolean r17 = r0.containsKey(r8)
            if (r17 == 0) goto L_0x048d
            java.lang.Object r8 = r0.get(r8)
            byte[] r8 = (byte[]) r8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            r30 = r8
            goto L_0x048f
        L_0x048d:
            r30 = r9
        L_0x048f:
            java.lang.String r8 = "viewType"
            if (r14 != 0) goto L_0x0522
            boolean r14 = r0.containsKey(r6)     // Catch:{ IllegalStateException -> 0x04a7 }
            if (r14 == 0) goto L_0x04aa
            java.lang.Object r6 = r0.get(r6)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ IllegalStateException -> 0x04a7 }
            boolean r6 = r6.booleanValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            if (r6 == 0) goto L_0x04aa
            r12 = r11
            goto L_0x04aa
        L_0x04a7:
            r0 = move-exception
            goto L_0x055d
        L_0x04aa:
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalStateException -> 0x04a7 }
            int r18 = r5.intValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r5 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x04a7 }
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ IllegalStateException -> 0x04a7 }
            boolean r5 = r0.containsKey(r7)     // Catch:{ IllegalStateException -> 0x04a7 }
            r20 = 0
            if (r5 == 0) goto L_0x04cf
            java.lang.Object r5 = r0.get(r7)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Double r5 = (java.lang.Double) r5     // Catch:{ IllegalStateException -> 0x04a7 }
            double r5 = r5.doubleValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            goto L_0x04d1
        L_0x04cf:
            r5 = r20
        L_0x04d1:
            boolean r7 = r0.containsKey(r15)     // Catch:{ IllegalStateException -> 0x04a7 }
            if (r7 == 0) goto L_0x04e4
            java.lang.Object r7 = r0.get(r15)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Double r7 = (java.lang.Double) r7     // Catch:{ IllegalStateException -> 0x04a7 }
            double r7 = r7.doubleValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            r22 = r7
            goto L_0x04e6
        L_0x04e4:
            r22 = r20
        L_0x04e6:
            java.lang.Object r3 = r0.get(r3)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Double r3 = (java.lang.Double) r3     // Catch:{ IllegalStateException -> 0x04a7 }
            double r24 = r3.doubleValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            double r26 = r2.doubleValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x04a7 }
            int r28 = r0.intValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            C0.u r0 = new C0.u     // Catch:{ IllegalStateException -> 0x04a7 }
            if (r12 == 0) goto L_0x050b
            r29 = 2
            goto L_0x050d
        L_0x050b:
            r29 = r11
        L_0x050d:
            r17 = r0
            r20 = r5
            r17.<init>(r18, r19, r20, r22, r24, r26, r28, r29, r30)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x04a7 }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r2.f2789g     // Catch:{ IllegalStateException -> 0x04a7 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            b2.h r2 = r2.f3415z     // Catch:{ IllegalStateException -> 0x04a7 }
            r2.h(r0)     // Catch:{ IllegalStateException -> 0x04a7 }
            throw r9     // Catch:{ IllegalStateException -> 0x04a7 }
        L_0x0522:
            java.lang.Object r2 = r0.get(r5)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            int r18 = r2.intValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x04a7 }
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x04a7 }
            int r28 = r0.intValue()     // Catch:{ IllegalStateException -> 0x04a7 }
            C0.u r0 = new C0.u     // Catch:{ IllegalStateException -> 0x04a7 }
            r24 = 0
            r26 = 0
            r29 = 3
            r20 = 0
            r22 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r22, r24, r26, r28, r29, r30)     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r13.f322g     // Catch:{ IllegalStateException -> 0x04a7 }
            c2.n r2 = (c2.n) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            java.lang.Object r2 = r2.f2789g     // Catch:{ IllegalStateException -> 0x04a7 }
            io.flutter.plugin.platform.l r2 = (io.flutter.plugin.platform.l) r2     // Catch:{ IllegalStateException -> 0x04a7 }
            b2.h r2 = r2.f3415z     // Catch:{ IllegalStateException -> 0x04a7 }
            r2.f(r0)     // Catch:{ IllegalStateException -> 0x04a7 }
            throw r9     // Catch:{ IllegalStateException -> 0x04a7 }
        L_0x055d:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
        L_0x0568:
            return
        L_0x0569:
            java.lang.String r2 = "Error when setting cursors: "
            java.lang.Object r3 = r1.f100g
            F0.h r3 = (F0.h) r3
            java.lang.Object r4 = r3.f322g
            b2.h r4 = (b2.h) r4
            if (r4 != 0) goto L_0x0576
            goto L_0x05db
        L_0x0576:
            java.lang.String r4 = r0.f2785a
            int r5 = r4.hashCode()     // Catch:{ Exception -> 0x05a7 }
            r6 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
            if (r5 == r6) goto L_0x0582
            goto L_0x05db
        L_0x0582:
            java.lang.String r5 = "activateSystemCursor"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x05a7 }
            if (r4 == 0) goto L_0x05db
            java.lang.Object r0 = r0.f2786b     // Catch:{ Exception -> 0x05a7 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x05a7 }
            java.lang.String r4 = "kind"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x05a7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x05a7 }
            java.lang.Object r3 = r3.f322g     // Catch:{ Exception -> 0x05a9 }
            b2.h r3 = (b2.h) r3     // Catch:{ Exception -> 0x05a9 }
            r3.c(r0)     // Catch:{ Exception -> 0x05a9 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x05a7 }
            r2 = r42
            b2.f r2 = (b2.f) r2     // Catch:{ Exception -> 0x05a7 }
            r2.b(r0)     // Catch:{ Exception -> 0x05a7 }
            goto L_0x05db
        L_0x05a7:
            r0 = move-exception
            goto L_0x05c2
        L_0x05a9:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05a7 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x05a7 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x05a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x05a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x05a7 }
            r2 = r42
            b2.f r2 = (b2.f) r2     // Catch:{ Exception -> 0x05a7 }
            r2.a(r10, r0, r9)     // Catch:{ Exception -> 0x05a7 }
            goto L_0x05db
        L_0x05c2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled error: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = r42
            b2.f r2 = (b2.f) r2
            r2.a(r10, r0, r9)
        L_0x05db:
            return
        L_0x05dc:
            java.lang.Object r0 = r1.f100g
            D0.g r0 = (D0.g) r0
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.m.onMethodCall(c2.m, c2.p):void");
    }

    public void p(h hVar) {
        ((E) this.f100g).f1428b = hVar;
    }

    public a0 r() {
        return (a0) ((s) this.f100g).a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: I.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: I.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: I.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: I.a0} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r6.f607a > r2.f607a) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(I.a0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            A2.i.e(r6, r0)
        L_0x0005:
            java.lang.Object r0 = r5.f100g
            L2.s r0 = (L2.s) r0
            java.lang.Object r1 = r0.a()
            r2 = r1
            I.a0 r2 = (I.a0) r2
            boolean r3 = r2 instanceof I.T
            if (r3 == 0) goto L_0x0016
            r3 = 1
            goto L_0x001c
        L_0x0016:
            I.b0 r3 = I.b0.f608b
            boolean r3 = A2.i.a(r2, r3)
        L_0x001c:
            if (r3 == 0) goto L_0x001f
            goto L_0x0029
        L_0x001f:
            boolean r3 = r2 instanceof I.C0027c
            if (r3 == 0) goto L_0x002b
            int r3 = r2.f607a
            int r4 = r6.f607a
            if (r4 <= r3) goto L_0x002f
        L_0x0029:
            r2 = r6
            goto L_0x002f
        L_0x002b:
            boolean r3 = r2 instanceof I.Q
            if (r3 == 0) goto L_0x003e
        L_0x002f:
            B.m r3 = M2.l.f1119a
            if (r1 != 0) goto L_0x0034
            r1 = r3
        L_0x0034:
            if (r2 != 0) goto L_0x0037
            r2 = r3
        L_0x0037:
            boolean r0 = r0.c(r1, r2)
            if (r0 == 0) goto L_0x0005
            return
        L_0x003e:
            H0.b r6 = new H0.b
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B.m.s(I.a0):void");
    }

    public String toString() {
        switch (this.f99f) {
            case 11:
                return "<" + ((String) this.f100g) + '>';
            default:
                return super.toString();
        }
    }

    public m(b bVar, int i3) {
        this.f99f = i3;
        switch (i3) {
            case 27:
                new q(bVar, "flutter/platform_views_2", x.f2798a, (j1.e) null).b(new F0.h(22, (Object) this));
                return;
            default:
                G0.f fVar = new G0.f(11);
                q qVar = new q(bVar, "flutter/navigation", c2.k.f2784a, (j1.e) null);
                this.f100g = qVar;
                qVar.b(fVar);
                return;
        }
    }

    public m(int i3) {
        this.f99f = i3;
        switch (i3) {
            case k.STRING_FIELD_NUMBER /*5*/:
                this.f100g = new s(b0.f608b);
                return;
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                this.f100g = new AtomicBoolean(false);
                return;
            case 18:
                return;
            default:
                this.f100g = new AtomicInteger(0);
                return;
        }
    }

    public m(c2.f fVar) {
        this.f99f = 23;
        new q(fVar, "flutter/keyboard", x.f2798a, (j1.e) null).b(new r(this));
    }

    public m(p pVar) {
        this.f99f = 7;
        this.f100g = (C0488f) pVar;
    }

    public void a() {
    }
}
