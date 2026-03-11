package F0;

import A2.i;
import B.m;
import C0.r;
import I.C0042s;
import L2.d;
import L2.e;
import S1.D;
import S1.E;
import T.M;
import T.t;
import T.u;
import U1.b;
import U1.j;
import a0.c;
import android.app.Activity;
import android.util.SparseIntArray;
import android.view.View;
import android.window.BackEvent;
import androidx.lifecycle.p;
import c2.C0136d;
import c2.C0137e;
import c2.f;
import c2.k;
import c2.o;
import c2.q;
import c2.x;
import f0.C0161b;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C0352c;
import p2.C0368h;
import r2.C0420d;
import s1.C0464y;
import s2.C0466a;

public final class h implements d, p, o, D, M, f, com.dexterous.flutterlocalnotifications.h {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f321f;

    /* renamed from: g  reason: collision with root package name */
    public Object f322g;

    public /* synthetic */ h(int i3) {
        this.f321f = i3;
    }

    public static int t(h hVar, int i3) {
        hVar.getClass();
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i3 + " not known to the SensitiveContentChannel.");
    }

    public static HashMap u(BackEvent backEvent) {
        List list;
        HashMap hashMap = new HashMap(3);
        float a2 = backEvent.getTouchX();
        float f3 = backEvent.getTouchY();
        if (Float.isNaN(a2) || Float.isNaN(f3)) {
            list = null;
        } else {
            list = Arrays.asList(new Float[]{Float.valueOf(a2), Float.valueOf(f3)});
        }
        hashMap.put("touchOffset", list);
        hashMap.put("progress", Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return hashMap;
    }

    public static int w(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        if (i5 + 1 > i4) {
            return i6 + 1;
        }
        return i6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:75|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        ((b2.f) r14).a("error", "No such clipboard content format: ".concat(r13), (java.lang.Object) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0176 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018b A[Catch:{ JSONException -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019b A[Catch:{ JSONException -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x(c2.m r13, c2.p r14) {
        /*
            r12 = this;
            java.lang.String r0 = "error"
            java.lang.String r1 = "No such clipboard content format: "
            java.lang.Object r2 = r12.f322g
            C0.r r2 = (C0.r) r2
            java.lang.Object r3 = r2.f161h
            b2.h r3 = (b2.h) r3
            if (r3 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r3 = r13.f2785a
            r4 = 0
            int r5 = r3.hashCode()     // Catch:{ JSONException -> 0x002b }
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            switch(r5) {
                case -1501580720: goto L_0x00bb;
                case -931781241: goto L_0x00b0;
                case -766342101: goto L_0x00a5;
                case -720677196: goto L_0x009a;
                case -577225884: goto L_0x0090;
                case -548468504: goto L_0x0086;
                case -247230243: goto L_0x007c;
                case -215273374: goto L_0x0072;
                case 241845679: goto L_0x0068;
                case 875995648: goto L_0x005c;
                case 1128339786: goto L_0x0051;
                case 1390477857: goto L_0x0045;
                case 1514180520: goto L_0x0039;
                case 1674312266: goto L_0x002e;
                case 2119655719: goto L_0x0020;
                default: goto L_0x001e;
            }     // Catch:{ JSONException -> 0x002b }
        L_0x001e:
            goto L_0x00c6
        L_0x0020:
            java.lang.String r5 = "SystemChrome.setPreferredOrientations"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = r8
            goto L_0x00c7
        L_0x002b:
            r13 = move-exception
            goto L_0x037d
        L_0x002e:
            java.lang.String r5 = "SystemChrome.setEnabledSystemUIOverlays"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = r7
            goto L_0x00c7
        L_0x0039:
            java.lang.String r5 = "Clipboard.getData"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 11
            goto L_0x00c7
        L_0x0045:
            java.lang.String r5 = "SystemChrome.setSystemUIOverlayStyle"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 8
            goto L_0x00c7
        L_0x0051:
            java.lang.String r5 = "SystemChrome.setEnabledSystemUIMode"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 5
            goto L_0x00c7
        L_0x005c:
            java.lang.String r5 = "Clipboard.hasStrings"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 13
            goto L_0x00c7
        L_0x0068:
            java.lang.String r5 = "SystemChrome.restoreSystemUIOverlays"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 7
            goto L_0x00c7
        L_0x0072:
            java.lang.String r5 = "SystemSound.play"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = r10
            goto L_0x00c7
        L_0x007c:
            java.lang.String r5 = "HapticFeedback.vibrate"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = r9
            goto L_0x00c7
        L_0x0086:
            java.lang.String r5 = "SystemChrome.setApplicationSwitcherDescription"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = r6
            goto L_0x00c7
        L_0x0090:
            java.lang.String r5 = "SystemChrome.setSystemUIChangeListener"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 6
            goto L_0x00c7
        L_0x009a:
            java.lang.String r5 = "Clipboard.setData"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 12
            goto L_0x00c7
        L_0x00a5:
            java.lang.String r5 = "SystemNavigator.pop"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 10
            goto L_0x00c7
        L_0x00b0:
            java.lang.String r5 = "Share.invoke"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 14
            goto L_0x00c7
        L_0x00bb:
            java.lang.String r5 = "SystemNavigator.setFrameworkHandlesBack"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002b }
            if (r3 == 0) goto L_0x00c6
            r3 = 9
            goto L_0x00c7
        L_0x00c6:
            r3 = -1
        L_0x00c7:
            java.lang.String r5 = "text"
            java.lang.String r11 = "clipboard"
            java.lang.Object r13 = r13.f2786b
            switch(r3) {
                case 0: goto L_0x0347;
                case 1: goto L_0x0327;
                case 2: goto L_0x02fc;
                case 3: goto L_0x02b0;
                case 4: goto L_0x028c;
                case 5: goto L_0x0246;
                case 6: goto L_0x0222;
                case 7: goto L_0x020f;
                case 8: goto L_0x01e7;
                case 9: goto L_0x01c8;
                case 10: goto L_0x01a3;
                case 11: goto L_0x016d;
                case 12: goto L_0x0144;
                case 13: goto L_0x010c;
                case 14: goto L_0x00d8;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.c()     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x00d8:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.getClass()     // Catch:{ JSONException -> 0x002b }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ JSONException -> 0x002b }
            r2.<init>()     // Catch:{ JSONException -> 0x002b }
            java.lang.String r3 = "android.intent.action.SEND"
            r2.setAction(r3)     // Catch:{ JSONException -> 0x002b }
            java.lang.String r3 = "text/plain"
            r2.setType(r3)     // Catch:{ JSONException -> 0x002b }
            java.lang.String r3 = "android.intent.extra.TEXT"
            r2.putExtra(r3, r13)     // Catch:{ JSONException -> 0x002b }
            android.content.Intent r13 = android.content.Intent.createChooser(r2, r4)     // Catch:{ JSONException -> 0x002b }
            android.content.Context r1 = r1.f3379b     // Catch:{ JSONException -> 0x002b }
            S1.d r1 = (S1.C0078d) r1     // Catch:{ JSONException -> 0x002b }
            r1.startActivity(r13)     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x010c:
            java.lang.Object r13 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r13 = (b2.h) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r13 = r13.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002b }
            android.content.Context r13 = r13.f3379b     // Catch:{ JSONException -> 0x002b }
            S1.d r13 = (S1.C0078d) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r13 = r13.getSystemService(r11)     // Catch:{ JSONException -> 0x002b }
            android.content.ClipboardManager r13 = (android.content.ClipboardManager) r13     // Catch:{ JSONException -> 0x002b }
            boolean r1 = r13.hasPrimaryClip()     // Catch:{ JSONException -> 0x002b }
            if (r1 != 0) goto L_0x0125
            goto L_0x0132
        L_0x0125:
            android.content.ClipDescription r13 = r13.getPrimaryClipDescription()     // Catch:{ JSONException -> 0x002b }
            if (r13 != 0) goto L_0x012c
            goto L_0x0132
        L_0x012c:
            java.lang.String r1 = "text/*"
            boolean r10 = r13.hasMimeType(r1)     // Catch:{ JSONException -> 0x002b }
        L_0x0132:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002b }
            r13.<init>()     // Catch:{ JSONException -> 0x002b }
            java.lang.String r1 = "value"
            r13.put(r1, r10)     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.b(r13)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x0144:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.String r13 = r13.getString(r5)     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002b }
            android.content.Context r1 = r1.f3379b     // Catch:{ JSONException -> 0x002b }
            S1.d r1 = (S1.C0078d) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r1.getSystemService(r11)     // Catch:{ JSONException -> 0x002b }
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.String r2 = "text label?"
            android.content.ClipData r13 = android.content.ClipData.newPlainText(r2, r13)     // Catch:{ JSONException -> 0x002b }
            r1.setPrimaryClip(r13)     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x016d:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x002b }
            if (r13 == 0) goto L_0x0180
            b2.b r13 = b2.b.a(r13)     // Catch:{ NoSuchFieldException -> 0x0176 }
            goto L_0x0181
        L_0x0176:
            java.lang.String r13 = r1.concat(r13)     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
        L_0x0180:
            r13 = r4
        L_0x0181:
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.CharSequence r13 = r1.k(r13)     // Catch:{ JSONException -> 0x002b }
            if (r13 == 0) goto L_0x019b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002b }
            r1.<init>()     // Catch:{ JSONException -> 0x002b }
            r1.put(r5, r13)     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r1)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x019b:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x01a3:
            java.lang.Object r13 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r13 = (b2.h) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r13 = r13.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r13.f3380c     // Catch:{ JSONException -> 0x002b }
            android.content.Context r13 = r13.f3379b     // Catch:{ JSONException -> 0x002b }
            S1.d r13 = (S1.C0078d) r13     // Catch:{ JSONException -> 0x002b }
            boolean r1 = r13 instanceof d.b     // Catch:{ JSONException -> 0x002b }
            if (r1 != 0) goto L_0x01c0
            r13.finish()     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x01c0:
            d.b r13 = (d.b) r13     // Catch:{ JSONException -> 0x002b }
            d.a r13 = (d.C0138a) r13     // Catch:{ JSONException -> 0x002b }
            r13.getClass()     // Catch:{ JSONException -> 0x002b }
            throw r4
        L_0x01c8:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ JSONException -> 0x002b }
            boolean r13 = r13.booleanValue()     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r1 = r1.f3380c     // Catch:{ JSONException -> 0x002b }
            S1.d r1 = (S1.C0078d) r1     // Catch:{ JSONException -> 0x002b }
            if (r1 == 0) goto L_0x01df
            r1.i(r13)     // Catch:{ JSONException -> 0x002b }
        L_0x01df:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x01e7:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            L1.k r13 = C0.r.A(r2, r13)     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            r1.b(r13)     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            r13.b(r4)     // Catch:{ JSONException -> 0x0202, NoSuchFieldException -> 0x0200 }
            goto L_0x0394
        L_0x0200:
            r13 = move-exception
            goto L_0x0203
        L_0x0202:
            r13 = move-exception
        L_0x0203:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x020f:
            java.lang.Object r13 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r13 = (b2.h) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r13 = r13.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.c()     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x0222:
            java.lang.Object r13 = r2.f161h     // Catch:{ JSONException -> 0x002b }
            b2.h r13 = (b2.h) r13     // Catch:{ JSONException -> 0x002b }
            java.lang.Object r13 = r13.f2743g     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002b }
            android.content.Context r1 = r13.f3379b     // Catch:{ JSONException -> 0x002b }
            S1.d r1 = (S1.C0078d) r1     // Catch:{ JSONException -> 0x002b }
            android.view.Window r1 = r1.getWindow()     // Catch:{ JSONException -> 0x002b }
            android.view.View r1 = r1.getDecorView()     // Catch:{ JSONException -> 0x002b }
            io.flutter.plugin.platform.e r2 = new io.flutter.plugin.platform.e     // Catch:{ JSONException -> 0x002b }
            r2.<init>(r13, r1)     // Catch:{ JSONException -> 0x002b }
            r1.setOnSystemUiVisibilityChangeListener(r2)     // Catch:{ JSONException -> 0x002b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x002b }
            r13.b(r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x0246:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            int r13 = C0.r.z(r2, r13)     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            r1.getClass()     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            if (r13 != r9) goto L_0x025c
            r13 = 1798(0x706, float:2.52E-42)
            goto L_0x0270
        L_0x025c:
            if (r13 != r8) goto L_0x0261
            r13 = 3846(0xf06, float:5.39E-42)
            goto L_0x0270
        L_0x0261:
            if (r13 != r6) goto L_0x0266
            r13 = 5894(0x1706, float:8.259E-42)
            goto L_0x0270
        L_0x0266:
            if (r13 != r7) goto L_0x0275
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            r2 = 29
            if (r13 < r2) goto L_0x0275
            r13 = 1792(0x700, float:2.511E-42)
        L_0x0270:
            r1.f3378a = r13     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            r1.c()     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
        L_0x0275:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            r13.b(r4)     // Catch:{ JSONException -> 0x027f, NoSuchFieldException -> 0x027d }
            goto L_0x0394
        L_0x027d:
            r13 = move-exception
            goto L_0x0280
        L_0x027f:
            r13 = move-exception
        L_0x0280:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x028c:
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            java.util.ArrayList r13 = C0.r.y(r2, r13)     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            r1.H(r13)     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            r13.b(r4)     // Catch:{ JSONException -> 0x02a3, NoSuchFieldException -> 0x02a1 }
            goto L_0x0394
        L_0x02a1:
            r13 = move-exception
            goto L_0x02a4
        L_0x02a3:
            r13 = move-exception
        L_0x02a4:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x02b0:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x02ef }
            java.lang.String r1 = "primaryColor"
            int r1 = r13.getInt(r1)     // Catch:{ JSONException -> 0x02ef }
            if (r1 == 0) goto L_0x02bd
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r3
        L_0x02bd:
            java.lang.String r3 = "label"
            java.lang.String r13 = r13.getString(r3)     // Catch:{ JSONException -> 0x02ef }
            java.lang.Object r2 = r2.f161h     // Catch:{ JSONException -> 0x02ef }
            b2.h r2 = (b2.h) r2     // Catch:{ JSONException -> 0x02ef }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x02ef }
            java.lang.Object r2 = r2.f2743g     // Catch:{ JSONException -> 0x02ef }
            io.flutter.plugin.platform.f r2 = (io.flutter.plugin.platform.f) r2     // Catch:{ JSONException -> 0x02ef }
            android.content.Context r2 = r2.f3379b     // Catch:{ JSONException -> 0x02ef }
            S1.d r2 = (S1.C0078d) r2     // Catch:{ JSONException -> 0x02ef }
            r5 = 28
            if (r3 >= r5) goto L_0x02de
            android.app.ActivityManager$TaskDescription r3 = new android.app.ActivityManager$TaskDescription     // Catch:{ JSONException -> 0x02ef }
            r3.<init>(r13, r4, r1)     // Catch:{ JSONException -> 0x02ef }
            r2.setTaskDescription(r3)     // Catch:{ JSONException -> 0x02ef }
            goto L_0x02e7
        L_0x02de:
            android.app.ActivityManager$TaskDescription r3 = new android.app.ActivityManager$TaskDescription     // Catch:{ JSONException -> 0x02ef }
            android.app.ActivityManager$TaskDescription r13 = io.flutter.plugin.platform.c.b(r13, r1)     // Catch:{ JSONException -> 0x02ef }
            r2.setTaskDescription(r13)     // Catch:{ JSONException -> 0x02ef }
        L_0x02e7:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x02ef }
            r13.b(r4)     // Catch:{ JSONException -> 0x02ef }
            goto L_0x0394
        L_0x02ef:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x02fc:
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            int r13 = C0.r.x(r2, r13)     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            java.lang.Object r1 = r2.f161h     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            b2.h r1 = (b2.h) r1     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            java.lang.Object r1 = r1.f2743g     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            android.content.Context r1 = r1.f3379b     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            S1.d r1 = (S1.C0078d) r1     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            r1.setRequestedOrientation(r13)     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            r13.b(r4)     // Catch:{ JSONException -> 0x031b, NoSuchFieldException -> 0x0319 }
            goto L_0x0394
        L_0x0319:
            r13 = move-exception
            goto L_0x031c
        L_0x031b:
            r13 = move-exception
        L_0x031c:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x0327:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NoSuchFieldException -> 0x033b }
            int r13 = A2.h.b(r13)     // Catch:{ NoSuchFieldException -> 0x033b }
            java.lang.Object r1 = r2.f161h     // Catch:{ NoSuchFieldException -> 0x033b }
            b2.h r1 = (b2.h) r1     // Catch:{ NoSuchFieldException -> 0x033b }
            r1.J(r13)     // Catch:{ NoSuchFieldException -> 0x033b }
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ NoSuchFieldException -> 0x033b }
            r13.b(r4)     // Catch:{ NoSuchFieldException -> 0x033b }
            goto L_0x0394
        L_0x033b:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x0347:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NoSuchFieldException -> 0x0371 }
            int r13 = A2.h.c(r13)     // Catch:{ NoSuchFieldException -> 0x0371 }
            java.lang.Object r1 = r2.f161h     // Catch:{ NoSuchFieldException -> 0x0371 }
            b2.h r1 = (b2.h) r1     // Catch:{ NoSuchFieldException -> 0x0371 }
            java.lang.Object r1 = r1.f2743g     // Catch:{ NoSuchFieldException -> 0x0371 }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ NoSuchFieldException -> 0x0371 }
            if (r13 != r9) goto L_0x0367
            android.content.Context r13 = r1.f3379b     // Catch:{ NoSuchFieldException -> 0x0371 }
            S1.d r13 = (S1.C0078d) r13     // Catch:{ NoSuchFieldException -> 0x0371 }
            android.view.Window r13 = r13.getWindow()     // Catch:{ NoSuchFieldException -> 0x0371 }
            android.view.View r13 = r13.getDecorView()     // Catch:{ NoSuchFieldException -> 0x0371 }
            r13.playSoundEffect(r10)     // Catch:{ NoSuchFieldException -> 0x0371 }
            goto L_0x036a
        L_0x0367:
            r1.getClass()     // Catch:{ NoSuchFieldException -> 0x0371 }
        L_0x036a:
            r13 = r14
            b2.f r13 = (b2.f) r13     // Catch:{ NoSuchFieldException -> 0x0371 }
            r13.b(r4)     // Catch:{ NoSuchFieldException -> 0x0371 }
            goto L_0x0394
        L_0x0371:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002b }
            r1 = r14
            b2.f r1 = (b2.f) r1     // Catch:{ JSONException -> 0x002b }
            r1.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002b }
            goto L_0x0394
        L_0x037d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON error: "
            r1.<init>(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            b2.f r14 = (b2.f) r14
            r14.a(r0, r13, r4)
        L_0x0394:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.h.x(c2.m, c2.p):void");
    }

    public void a() {
        E e2 = (E) this.f322g;
        io.flutter.embedding.engine.renderer.h hVar = e2.f1428b;
        if (hVar != null) {
            hVar.a(e2.f1430d);
        }
    }

    public void b(String str, ByteBuffer byteBuffer) {
        ((j) this.f322g).r(str, byteBuffer, (C0137e) null);
    }

    public View c(int i3) {
        return ((t) this.f322g).o(i3);
    }

    public void e(boolean z3) {
        ((c2.p) this.f322g).b(Boolean.valueOf(z3));
    }

    public int f() {
        t tVar = (t) this.f322g;
        return tVar.f1664f - tVar.t();
    }

    public Object g(e eVar, C0420d dVar) {
        Object g2 = ((r) this.f322g).g(new C0042s(eVar, 0), dVar);
        if (g2 == C0466a.f4632f) {
            return g2;
        }
        return C0368h.f4194a;
    }

    public int i() {
        return ((t) this.f322g).s();
    }

    public j1.e j(k kVar) {
        return ((j) this.f322g).j(kVar);
    }

    public int k(View view) {
        ((t) this.f322g).getClass();
        return view.getRight() + ((u) view.getLayoutParams()).f1666a.right + ((u) view.getLayoutParams()).rightMargin;
    }

    public void l(String str, C0136d dVar, j1.e eVar) {
        ((j) this.f322g).l(str, dVar, eVar);
    }

    public void m() {
        E e2 = (E) this.f322g;
        e2.f1427a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.h hVar = e2.f1428b;
        if (hVar != null) {
            hVar.c(e2.f1430d);
        }
        e2.f1428b = null;
    }

    public int n(View view) {
        ((t) this.f322g).getClass();
        return (view.getLeft() - ((u) view.getLayoutParams()).f1666a.left) - ((u) view.getLayoutParams()).leftMargin;
    }

    public void o() {
        ((c2.p) this.f322g).a("permissionRequestInProgress", "Another permission request is already in progress", (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v3, types: [int] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(c2.m r23, c2.p r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = 11
            r7 = 8
            java.lang.String r9 = "error"
            r10 = 2
            r11 = 0
            r12 = 0
            r13 = 3
            r14 = 4
            r15 = 1
            int r6 = r1.f321f
            switch(r6) {
                case 8: goto L_0x0635;
                case 19: goto L_0x05df;
                case 21: goto L_0x05db;
                case 22: goto L_0x0344;
                case 24: goto L_0x02f5;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r6 = "data"
            java.lang.Object r3 = r1.f322g
            C0.r r3 = (C0.r) r3
            java.lang.Object r4 = r3.f161h
            d2.a r4 = (d2.C0152a) r4
            if (r4 != 0) goto L_0x0023
            goto L_0x02f4
        L_0x0023:
            java.lang.String r4 = r0.f2785a
            r4.getClass()
            r5 = 26
            java.lang.Object r0 = r0.f2786b
            int r20 = r4.hashCode()
            switch(r20) {
                case -1779068172: goto L_0x00a5;
                case -1015421462: goto L_0x0099;
                case -37561188: goto L_0x008d;
                case 270476819: goto L_0x0081;
                case 270803918: goto L_0x0075;
                case 649192816: goto L_0x0069;
                case 1204752139: goto L_0x005d;
                case 1727570905: goto L_0x0051;
                case 1904427655: goto L_0x0044;
                case 2113369584: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            r16 = -1
            goto L_0x00b0
        L_0x0037:
            java.lang.String r8 = "TextInput.requestAutofill"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0040
            goto L_0x0033
        L_0x0040:
            r16 = 9
            goto L_0x00b0
        L_0x0044:
            java.lang.String r8 = "TextInput.clearClient"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x004d
            goto L_0x0033
        L_0x004d:
            r16 = r7
            goto L_0x00b0
        L_0x0051:
            java.lang.String r8 = "TextInput.finishAutofillContext"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x005a
            goto L_0x0033
        L_0x005a:
            r16 = 7
            goto L_0x00b0
        L_0x005d:
            java.lang.String r8 = "TextInput.setEditableSizeAndTransform"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0066
            goto L_0x0033
        L_0x0066:
            r16 = 6
            goto L_0x00b0
        L_0x0069:
            java.lang.String r8 = "TextInput.sendAppPrivateCommand"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0072
            goto L_0x0033
        L_0x0072:
            r16 = 5
            goto L_0x00b0
        L_0x0075:
            java.lang.String r8 = "TextInput.show"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x007e
            goto L_0x0033
        L_0x007e:
            r16 = r14
            goto L_0x00b0
        L_0x0081:
            java.lang.String r8 = "TextInput.hide"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x008a
            goto L_0x0033
        L_0x008a:
            r16 = r13
            goto L_0x00b0
        L_0x008d:
            java.lang.String r8 = "TextInput.setClient"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0096
            goto L_0x0033
        L_0x0096:
            r16 = r10
            goto L_0x00b0
        L_0x0099:
            java.lang.String r8 = "TextInput.setEditingState"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00a2
            goto L_0x0033
        L_0x00a2:
            r16 = r15
            goto L_0x00b0
        L_0x00a5:
            java.lang.String r8 = "TextInput.setPlatformViewClient"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00ae
            goto L_0x0033
        L_0x00ae:
            r16 = r11
        L_0x00b0:
            switch(r16) {
                case 0: goto L_0x02a8;
                case 1: goto L_0x0286;
                case 2: goto L_0x0259;
                case 3: goto L_0x0230;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01ba;
                case 6: goto L_0x0175;
                case 7: goto L_0x0148;
                case 8: goto L_0x0103;
                case 9: goto L_0x00bc;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x02f4
        L_0x00bc:
            java.lang.Object r0 = r3.f161h
            d2.a r0 = (d2.C0152a) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r0.f2912g
            io.flutter.plugin.editing.j r0 = (io.flutter.plugin.editing.j) r0
            if (r2 < r5) goto L_0x00f7
            android.view.autofill.AutofillManager r2 = r0.f3358c
            if (r2 == 0) goto L_0x00fa
            android.util.SparseArray r2 = r0.f3362g
            if (r2 == 0) goto L_0x00fa
            b2.k r2 = r0.f3361f
            s1.y r2 = r2.f2758j
            java.lang.Object r2 = r2.f4622f
            java.lang.String r2 = (java.lang.String) r2
            int[] r3 = new int[r10]
            S1.o r4 = r0.f3356a
            r4.getLocationOnScreen(r3)
            android.graphics.Rect r5 = new android.graphics.Rect
            android.graphics.Rect r6 = r0.f3368m
            r5.<init>(r6)
            r6 = r3[r11]
            r3 = r3[r15]
            r5.offset(r6, r3)
            android.view.autofill.AutofillManager r0 = r0.f3358c
            int r2 = r2.hashCode()
            r0.notifyViewEntered(r4, r2, r5)
            goto L_0x00fa
        L_0x00f7:
            r0.getClass()
        L_0x00fa:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x02f4
        L_0x0103:
            java.lang.Object r0 = r3.f161h
            d2.a r0 = (d2.C0152a) r0
            java.lang.Object r0 = r0.f2912g
            io.flutter.plugin.editing.j r0 = (io.flutter.plugin.editing.j) r0
            A.l r2 = r0.f3360e
            int r2 = r2.f55b
            if (r2 != r13) goto L_0x0112
            goto L_0x013f
        L_0x0112:
            io.flutter.plugin.editing.g r2 = r0.f3363h
            r2.e(r0)
            r0.c()
            r0.f3361f = r12
            r0.d(r12)
            A.l r2 = new A.l
            r2.<init>(r15, r11)
            r0.f3360e = r2
            r0.f3368m = r12
            java.lang.reflect.Field r2 = A.A.f0a
            S1.o r2 = r0.f3356a
            A.V r3 = A.C0018t.a(r2)
            if (r3 == 0) goto L_0x013f
            A.T r3 = r3.f31a
            boolean r3 = r3.m(r7)
            if (r3 != 0) goto L_0x013f
            android.view.inputmethod.InputMethodManager r0 = r0.f3357b
            r0.restartInput(r2)
        L_0x013f:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x02f4
        L_0x0148:
            java.lang.Object r2 = r3.f161h
            d2.a r2 = (d2.C0152a) r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r5) goto L_0x0169
            java.lang.Object r2 = r2.f2912g
            io.flutter.plugin.editing.j r2 = (io.flutter.plugin.editing.j) r2
            android.view.autofill.AutofillManager r2 = r2.f3358c
            if (r2 != 0) goto L_0x015f
            goto L_0x016c
        L_0x015f:
            if (r0 == 0) goto L_0x0165
            r2.commit()
            goto L_0x016c
        L_0x0165:
            r2.cancel()
            goto L_0x016c
        L_0x0169:
            r2.getClass()
        L_0x016c:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x02f4
        L_0x0175:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0197 }
            java.lang.String r2 = "width"
            double r17 = r0.getDouble(r2)     // Catch:{ JSONException -> 0x0197 }
            java.lang.String r2 = "height"
            double r19 = r0.getDouble(r2)     // Catch:{ JSONException -> 0x0197 }
            java.lang.String r2 = "transform"
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0197 }
            r2 = 16
            double[] r4 = new double[r2]     // Catch:{ JSONException -> 0x0197 }
        L_0x018d:
            if (r11 >= r2) goto L_0x0199
            double r5 = r0.getDouble(r11)     // Catch:{ JSONException -> 0x0197 }
            r4[r11] = r5     // Catch:{ JSONException -> 0x0197 }
            int r11 = r11 + r15
            goto L_0x018d
        L_0x0197:
            r0 = move-exception
            goto L_0x01ad
        L_0x0199:
            java.lang.Object r0 = r3.f161h     // Catch:{ JSONException -> 0x0197 }
            r16 = r0
            d2.a r16 = (d2.C0152a) r16     // Catch:{ JSONException -> 0x0197 }
            r21 = r4
            r16.h(r17, r19, r21)     // Catch:{ JSONException -> 0x0197 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ JSONException -> 0x0197 }
            r0.b(r12)     // Catch:{ JSONException -> 0x0197 }
            goto L_0x02f4
        L_0x01ad:
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x02f4
        L_0x01ba:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01d7 }
            java.lang.String r2 = "action"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ JSONException -> 0x01d7 }
            java.lang.String r0 = r0.getString(r6)     // Catch:{ JSONException -> 0x01d7 }
            if (r0 == 0) goto L_0x01d9
            boolean r4 = r0.isEmpty()     // Catch:{ JSONException -> 0x01d7 }
            if (r4 != 0) goto L_0x01d9
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ JSONException -> 0x01d7 }
            r4.<init>()     // Catch:{ JSONException -> 0x01d7 }
            r4.putString(r6, r0)     // Catch:{ JSONException -> 0x01d7 }
            goto L_0x01da
        L_0x01d7:
            r0 = move-exception
            goto L_0x01f2
        L_0x01d9:
            r4 = r12
        L_0x01da:
            java.lang.Object r0 = r3.f161h     // Catch:{ JSONException -> 0x01d7 }
            d2.a r0 = (d2.C0152a) r0     // Catch:{ JSONException -> 0x01d7 }
            java.lang.Object r0 = r0.f2912g     // Catch:{ JSONException -> 0x01d7 }
            io.flutter.plugin.editing.j r0 = (io.flutter.plugin.editing.j) r0     // Catch:{ JSONException -> 0x01d7 }
            android.view.inputmethod.InputMethodManager r3 = r0.f3357b     // Catch:{ JSONException -> 0x01d7 }
            S1.o r0 = r0.f3356a     // Catch:{ JSONException -> 0x01d7 }
            r3.sendAppPrivateCommand(r0, r2, r4)     // Catch:{ JSONException -> 0x01d7 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ JSONException -> 0x01d7 }
            r0.b(r12)     // Catch:{ JSONException -> 0x01d7 }
            goto L_0x02f4
        L_0x01f2:
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x02f4
        L_0x01ff:
            java.lang.Object r0 = r3.f161h
            d2.a r0 = (d2.C0152a) r0
            java.lang.Object r0 = r0.f2912g
            io.flutter.plugin.editing.j r0 = (io.flutter.plugin.editing.j) r0
            S1.o r3 = r0.f3356a
            b2.k r4 = r0.f3361f
            android.view.inputmethod.InputMethodManager r5 = r0.f3357b
            if (r4 == 0) goto L_0x0221
            b2.l r4 = r4.f2755g
            int r4 = r4.f2762a
            if (r4 == r2) goto L_0x0216
            goto L_0x0221
        L_0x0216:
            r0.c()
            android.os.IBinder r0 = r3.getApplicationWindowToken()
            r5.hideSoftInputFromWindow(r0, r11)
            goto L_0x0227
        L_0x0221:
            r3.requestFocus()
            r5.showSoftInput(r3, r11)
        L_0x0227:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x02f4
        L_0x0230:
            java.lang.Object r0 = r3.f161h
            d2.a r0 = (d2.C0152a) r0
            java.lang.Object r0 = r0.f2912g
            io.flutter.plugin.editing.j r0 = (io.flutter.plugin.editing.j) r0
            A.l r2 = r0.f3360e
            int r2 = r2.f55b
            if (r2 != r14) goto L_0x0242
            r0.c()
            goto L_0x0250
        L_0x0242:
            r0.c()
            S1.o r2 = r0.f3356a
            android.os.IBinder r2 = r2.getApplicationWindowToken()
            android.view.inputmethod.InputMethodManager r0 = r0.f3357b
            r0.hideSoftInputFromWindow(r2, r11)
        L_0x0250:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x02f4
        L_0x0259:
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            int r2 = r0.getInt(r11)     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            org.json.JSONObject r0 = r0.getJSONObject(r15)     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            java.lang.Object r3 = r3.f161h     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            d2.a r3 = (d2.C0152a) r3     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            b2.k r0 = b2.k.a(r0)     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            r3.g(r2, r0)     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            r0.b(r12)     // Catch:{ JSONException -> 0x0279, NoSuchFieldException -> 0x0277 }
            goto L_0x02f4
        L_0x0277:
            r0 = move-exception
            goto L_0x027a
        L_0x0279:
            r0 = move-exception
        L_0x027a:
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x02f4
        L_0x0286:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x029b }
            java.lang.Object r2 = r3.f161h     // Catch:{ JSONException -> 0x029b }
            d2.a r2 = (d2.C0152a) r2     // Catch:{ JSONException -> 0x029b }
            b2.m r0 = b2.m.a(r0)     // Catch:{ JSONException -> 0x029b }
            r2.i(r0)     // Catch:{ JSONException -> 0x029b }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ JSONException -> 0x029b }
            r0.b(r12)     // Catch:{ JSONException -> 0x029b }
            goto L_0x02f4
        L_0x029b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x02f4
        L_0x02a8:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "platformViewId"
            int r2 = r0.getInt(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r4 = "usesVirtualDisplay"
            boolean r0 = r0.optBoolean(r4, r11)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.f161h     // Catch:{ JSONException -> 0x02e8 }
            d2.a r3 = (d2.C0152a) r3     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.f2912g     // Catch:{ JSONException -> 0x02e8 }
            io.flutter.plugin.editing.j r3 = (io.flutter.plugin.editing.j) r3     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02d4
            S1.o r0 = r3.f3356a     // Catch:{ JSONException -> 0x02e8 }
            r0.requestFocus()     // Catch:{ JSONException -> 0x02e8 }
            A.l r4 = new A.l     // Catch:{ JSONException -> 0x02e8 }
            r4.<init>(r13, r2)     // Catch:{ JSONException -> 0x02e8 }
            r3.f3360e = r4     // Catch:{ JSONException -> 0x02e8 }
            android.view.inputmethod.InputMethodManager r2 = r3.f3357b     // Catch:{ JSONException -> 0x02e8 }
            r2.restartInput(r0)     // Catch:{ JSONException -> 0x02e8 }
            r3.f3364i = r11     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02e0
        L_0x02d4:
            r3.getClass()     // Catch:{ JSONException -> 0x02e8 }
            A.l r0 = new A.l     // Catch:{ JSONException -> 0x02e8 }
            r0.<init>(r14, r2)     // Catch:{ JSONException -> 0x02e8 }
            r3.f3360e = r0     // Catch:{ JSONException -> 0x02e8 }
            r3.f3365j = r12     // Catch:{ JSONException -> 0x02e8 }
        L_0x02e0:
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ JSONException -> 0x02e8 }
            r0.b(r12)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02f4
        L_0x02e8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
        L_0x02f4:
            return
        L_0x02f5:
            java.lang.String r2 = r0.f2785a
            r2.getClass()
            java.lang.Object r3 = r1.f322g
            b2.g r3 = (b2.g) r3
            java.lang.String r4 = "get"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0324
            java.lang.String r4 = "put"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0316
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x0343
        L_0x0316:
            java.lang.Object r0 = r0.f2786b
            byte[] r0 = (byte[]) r0
            r3.f2736b = r0
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.b(r12)
            goto L_0x0343
        L_0x0324:
            r3.f2740f = r15
            boolean r0 = r3.f2739e
            if (r0 != 0) goto L_0x0336
            boolean r0 = r3.f2735a
            if (r0 != 0) goto L_0x032f
            goto L_0x0336
        L_0x032f:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r3.f2738d = r0
            goto L_0x0343
        L_0x0336:
            byte[] r0 = r3.f2736b
            java.util.HashMap r0 = b2.g.a(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.b(r0)
        L_0x0343:
            return
        L_0x0344:
            java.lang.Object r3 = r1.f322g
            B.m r3 = (B.m) r3
            java.lang.Object r4 = r3.f100g
            d2.a r4 = (d2.C0152a) r4
            if (r4 != 0) goto L_0x0350
            goto L_0x05da
        L_0x0350:
            java.lang.String r4 = r0.f2785a
            r4.getClass()
            java.lang.String r5 = "PlatformViewsController2"
            java.lang.String r6 = "direction"
            java.lang.String r8 = "id"
            java.lang.Object r0 = r0.f2786b
            int r21 = r4.hashCode()
            switch(r21) {
                case -1352294148: goto L_0x03a3;
                case -756050293: goto L_0x0397;
                case 110550847: goto L_0x038b;
                case 576796989: goto L_0x037f;
                case 751366695: goto L_0x0373;
                case 1671767583: goto L_0x0367;
                default: goto L_0x0364;
            }
        L_0x0364:
            r16 = -1
            goto L_0x03ae
        L_0x0367:
            java.lang.String r2 = "dispose"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0370
            goto L_0x0364
        L_0x0370:
            r16 = 5
            goto L_0x03ae
        L_0x0373:
            java.lang.String r2 = "isSurfaceControlEnabled"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x037c
            goto L_0x0364
        L_0x037c:
            r16 = r14
            goto L_0x03ae
        L_0x037f:
            java.lang.String r2 = "setDirection"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0388
            goto L_0x0364
        L_0x0388:
            r16 = r13
            goto L_0x03ae
        L_0x038b:
            java.lang.String r2 = "touch"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0394
            goto L_0x0364
        L_0x0394:
            r16 = r10
            goto L_0x03ae
        L_0x0397:
            java.lang.String r2 = "clearFocus"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03a0
            goto L_0x0364
        L_0x03a0:
            r16 = r15
            goto L_0x03ae
        L_0x03a3:
            java.lang.String r2 = "create"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ac
            goto L_0x0364
        L_0x03ac:
            r16 = r11
        L_0x03ae:
            switch(r16) {
                case 0: goto L_0x0573;
                case 1: goto L_0x0536;
                case 2: goto L_0x0456;
                case 3: goto L_0x0402;
                case 4: goto L_0x03e4;
                case 5: goto L_0x03ba;
                default: goto L_0x03b1;
            }
        L_0x03b1:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x05da
        L_0x03ba:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r3.f100g     // Catch:{ IllegalStateException -> 0x03d6 }
            d2.a r2 = (d2.C0152a) r2     // Catch:{ IllegalStateException -> 0x03d6 }
            r2.d(r0)     // Catch:{ IllegalStateException -> 0x03d6 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x03d6 }
            r0.b(r12)     // Catch:{ IllegalStateException -> 0x03d6 }
            goto L_0x05da
        L_0x03d6:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x05da
        L_0x03e4:
            java.lang.Object r0 = r3.f100g
            d2.a r0 = (d2.C0152a) r0
            java.lang.Object r0 = r0.f2912g
            io.flutter.plugin.platform.k r0 = (io.flutter.plugin.platform.k) r0
            io.flutter.embedding.engine.FlutterJNI r0 = r0.f3386i
            if (r0 != 0) goto L_0x03f1
            goto L_0x03f5
        L_0x03f1:
            boolean r11 = r0.IsSurfaceControlEnabled()
        L_0x03f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.b(r0)
            goto L_0x05da
        L_0x0402:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r0.get(r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            java.lang.Object r0 = r3.f100g     // Catch:{ IllegalStateException -> 0x0441 }
            d2.a r0 = (d2.C0152a) r0     // Catch:{ IllegalStateException -> 0x0441 }
            java.lang.Object r0 = r0.f2912g     // Catch:{ IllegalStateException -> 0x0441 }
            io.flutter.plugin.platform.k r0 = (io.flutter.plugin.platform.k) r0     // Catch:{ IllegalStateException -> 0x0441 }
            android.util.SparseArray r0 = r0.f3389l     // Catch:{ IllegalStateException -> 0x0441 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x0441 }
            if (r0 != 0) goto L_0x0443
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0441 }
            java.lang.String r3 = "Setting direction to an unknown view with id: "
            r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x0441 }
            r0.append(r2)     // Catch:{ IllegalStateException -> 0x0441 }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x0441 }
            android.util.Log.e(r5, r0)     // Catch:{ IllegalStateException -> 0x0441 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0441 }
            r0.b(r12)     // Catch:{ IllegalStateException -> 0x0441 }
            goto L_0x05da
        L_0x0441:
            r0 = move-exception
            goto L_0x0449
        L_0x0443:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ IllegalStateException -> 0x0441 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0441 }
            throw r0     // Catch:{ IllegalStateException -> 0x0441 }
        L_0x0449:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x05da
        L_0x0456:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r0.get(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r4 = r0.get(r15)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r4 = r0.get(r10)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r4 = r0.get(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            java.lang.Object r4 = r0.get(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 5
            r0.get(r4)
            r4 = 6
            r0.get(r4)
            r4 = 7
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            java.lang.Object r4 = r0.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 9
            java.lang.Object r4 = r0.get(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            r4.getClass()
            r4 = 10
            java.lang.Object r4 = r0.get(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            r4.getClass()
            r4 = 11
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 12
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 13
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 14
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 15
            java.lang.Object r0 = r0.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            java.lang.Object r0 = r3.f100g     // Catch:{ IllegalStateException -> 0x0521 }
            d2.a r0 = (d2.C0152a) r0     // Catch:{ IllegalStateException -> 0x0521 }
            r0.getClass()     // Catch:{ IllegalStateException -> 0x0521 }
            java.lang.Object r0 = r0.f2912g     // Catch:{ IllegalStateException -> 0x0521 }
            io.flutter.plugin.platform.k r0 = (io.flutter.plugin.platform.k) r0     // Catch:{ IllegalStateException -> 0x0521 }
            android.app.Activity r3 = r0.f3384g     // Catch:{ IllegalStateException -> 0x0521 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IllegalStateException -> 0x0521 }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ IllegalStateException -> 0x0521 }
            float r3 = r3.density     // Catch:{ IllegalStateException -> 0x0521 }
            android.util.SparseArray r0 = r0.f3389l     // Catch:{ IllegalStateException -> 0x0521 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x0521 }
            if (r0 != 0) goto L_0x0523
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0521 }
            java.lang.String r3 = "Sending touch to an unknown view with id: "
            r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x0521 }
            r0.append(r2)     // Catch:{ IllegalStateException -> 0x0521 }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x0521 }
            android.util.Log.e(r5, r0)     // Catch:{ IllegalStateException -> 0x0521 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0521 }
            r0.b(r12)     // Catch:{ IllegalStateException -> 0x0521 }
            goto L_0x05da
        L_0x0521:
            r0 = move-exception
            goto L_0x0529
        L_0x0523:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ IllegalStateException -> 0x0521 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0521 }
            throw r0     // Catch:{ IllegalStateException -> 0x0521 }
        L_0x0529:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x05da
        L_0x0536:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r3.f100g     // Catch:{ IllegalStateException -> 0x0566 }
            d2.a r2 = (d2.C0152a) r2     // Catch:{ IllegalStateException -> 0x0566 }
            java.lang.Object r2 = r2.f2912g     // Catch:{ IllegalStateException -> 0x0566 }
            io.flutter.plugin.platform.k r2 = (io.flutter.plugin.platform.k) r2     // Catch:{ IllegalStateException -> 0x0566 }
            android.util.SparseArray r2 = r2.f3389l     // Catch:{ IllegalStateException -> 0x0566 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ IllegalStateException -> 0x0566 }
            A2.h.j(r2)     // Catch:{ IllegalStateException -> 0x0566 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0566 }
            java.lang.String r3 = "Clearing focus on an unknown view with id: "
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x0566 }
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0566 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalStateException -> 0x0566 }
            android.util.Log.e(r5, r0)     // Catch:{ IllegalStateException -> 0x0566 }
            r0 = r24
            b2.f r0 = (b2.f) r0     // Catch:{ IllegalStateException -> 0x0566 }
            r0.b(r12)     // Catch:{ IllegalStateException -> 0x0566 }
            goto L_0x05da
        L_0x0566:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
            goto L_0x05da
        L_0x0573:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r2 = "params"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L_0x0586
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            java.nio.ByteBuffer.wrap(r2)
        L_0x0586:
            java.lang.Object r2 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalStateException -> 0x05ce }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.String r2 = "viewType"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x05ce }
            r0.getClass()     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Object r0 = r3.f100g     // Catch:{ IllegalStateException -> 0x05ce }
            d2.a r0 = (d2.C0152a) r0     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Object r0 = r0.f2912g     // Catch:{ IllegalStateException -> 0x05ce }
            io.flutter.plugin.platform.k r0 = (io.flutter.plugin.platform.k) r0     // Catch:{ IllegalStateException -> 0x05ce }
            d2.a r0 = r0.f3383f     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Object r0 = r0.f2912g     // Catch:{ IllegalStateException -> 0x05ce }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x05ce }
            if (r0 != 0) goto L_0x05c8
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.String r4 = "Trying to create a platform view of unregistered type: "
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x05ce }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x05ce }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x05ce }
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x05ce }
            throw r0     // Catch:{ IllegalStateException -> 0x05ce }
        L_0x05c8:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ IllegalStateException -> 0x05ce }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x05ce }
            throw r0     // Catch:{ IllegalStateException -> 0x05ce }
        L_0x05ce:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
        L_0x05da:
            return
        L_0x05db:
            r22.x(r23, r24)
            return
        L_0x05df:
            java.lang.String r2 = "locale"
            java.lang.Object r3 = r1.f322g
            C0.r r3 = (C0.r) r3
            java.lang.Object r4 = r3.f161h
            d2.a r4 = (d2.C0152a) r4
            if (r4 != 0) goto L_0x05ec
            goto L_0x0634
        L_0x05ec:
            java.lang.String r4 = r0.f2785a
            r4.getClass()
            java.lang.String r5 = "Localization.getStringResource"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0601
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.c()
            goto L_0x0634
        L_0x0601:
            java.lang.Object r0 = r0.f2786b
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r4 = "key"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0616 }
            boolean r5 = r0.has(r2)     // Catch:{ JSONException -> 0x0616 }
            if (r5 == 0) goto L_0x0618
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0616 }
            goto L_0x0619
        L_0x0616:
            r0 = move-exception
            goto L_0x0629
        L_0x0618:
            r0 = r12
        L_0x0619:
            java.lang.Object r2 = r3.f161h     // Catch:{ JSONException -> 0x0616 }
            d2.a r2 = (d2.C0152a) r2     // Catch:{ JSONException -> 0x0616 }
            java.lang.String r0 = r2.e(r4, r0)     // Catch:{ JSONException -> 0x0616 }
            r2 = r24
            b2.f r2 = (b2.f) r2     // Catch:{ JSONException -> 0x0616 }
            r2.b(r0)     // Catch:{ JSONException -> 0x0616 }
            goto L_0x0634
        L_0x0629:
            java.lang.String r0 = r0.getMessage()
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.a(r9, r0, r12)
        L_0x0634:
            return
        L_0x0635:
            java.lang.String r2 = "check"
            java.lang.String r0 = r0.f2785a
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x065b
            java.lang.Object r0 = r1.f322g
            B.m r0 = (B.m) r0
            java.lang.Object r0 = r0.f100g
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network r2 = r0.getActiveNetwork()
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            java.util.ArrayList r0 = B.m.q(r0)
            r2 = r24
            b2.f r2 = (b2.f) r2
            r2.b(r0)
            goto L_0x0662
        L_0x065b:
            r0 = r24
            b2.f r0 = (b2.f) r0
            r0.c()
        L_0x0662:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.h.onMethodCall(c2.m, c2.p):void");
    }

    public void p(io.flutter.embedding.engine.renderer.h hVar) {
        E e2 = (E) this.f322g;
        io.flutter.embedding.engine.renderer.h hVar2 = e2.f1428b;
        if (hVar2 != null) {
            hVar2.c(e2.f1430d);
        }
        e2.f1428b = hVar;
    }

    public void q(String str, C0136d dVar) {
        ((j) this.f322g).l(str, dVar, (j1.e) null);
    }

    public void r(String str, ByteBuffer byteBuffer, C0137e eVar) {
        ((j) this.f322g).r(str, byteBuffer, eVar);
    }

    public void s(Object obj) {
        if (((androidx.lifecycle.j) obj) != null) {
            N.e eVar = (N.e) this.f322g;
            if (eVar.f1155p) {
                eVar.getClass();
                throw new IllegalStateException("Fragment " + eVar + " did not return a View from onCreateView() or this was called before onCreateView().");
            }
        }
    }

    public a0.d v(Object obj, A2.e eVar, Activity activity, C0161b bVar) {
        c cVar = new c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f322g, new Class[]{z()}, cVar);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, z()}).invoke(obj, new Object[]{activity, newProxyInstance});
        return new a0.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", new Class[]{z()}), obj, newProxyInstance);
    }

    public void y(Exception exc) {
        b1.i iVar = (b1.i) this.f322g;
        iVar.getClass();
        if (o.h.f4133k.c(iVar, (Object) null, new C0352c(exc))) {
            o.h.c(iVar);
        }
    }

    public Class z() {
        Class<?> loadClass = ((ClassLoader) this.f322g).loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public /* synthetic */ h(int i3, Object obj) {
        this.f321f = i3;
        this.f322g = obj;
    }

    public h(boolean z3) {
        this.f321f = 6;
        this.f322g = new AtomicBoolean(z3);
    }

    public h(b bVar, int i3) {
        this.f321f = i3;
        switch (i3) {
            case 20:
                new q(bVar, "flutter/mousecursor", x.f2798a, (j1.e) null).b(new m(24, (Object) this));
                return;
            case 23:
                new q(bVar, "flutter/platform_views", x.f2798a, (j1.e) null).b(new m(26, (Object) this));
                return;
            case 25:
                new q(bVar, "flutter/scribe", k.f2784a, (j1.e) null).b(new m(29, (Object) this));
                return;
            case 26:
                new q(bVar, "flutter/sensitivecontent", x.f2798a, (j1.e) null).b(new b2.h(0, this));
                return;
            case 27:
                new q(bVar, "flutter/spellcheck", x.f2798a, (j1.e) null).b(new b2.h(1, this));
                return;
            default:
                j1.e eVar = new j1.e(10);
                q qVar = new q(bVar, "flutter/backgesture", x.f2798a, (j1.e) null);
                this.f322g = qVar;
                qVar.b(eVar);
                return;
        }
    }

    public h(f fVar) {
        this.f321f = 18;
        this.f322g = new C0464y(fVar, "flutter/keyevent", c2.j.f2783a, (j1.e) null);
    }

    public h() {
        this.f321f = 12;
        this.f322g = new SparseIntArray();
    }
}
