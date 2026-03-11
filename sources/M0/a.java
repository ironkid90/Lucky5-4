package M0;

import A.C0002c;
import A2.i;
import F.c;
import F.d;
import I2.C0063n;
import I2.C0067s;
import I2.C0071w;
import N2.t;
import S1.r;
import X0.g;
import a1.C0096a;
import a1.q;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.EdgeEffect;
import b2.h;
import i2.C0224e;
import io.flutter.plugins.GeneratedPluginRegistrant;
import j.q0;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l2.C0315b;
import org.xmlpull.v1.XmlPullParserException;
import p.C0359a;
import p2.C0364d;
import r2.C0420d;
import r2.C0421e;
import r2.C0422f;
import s.C0427a;
import s.b;
import s.e;
import s1.C0465z;
import s2.C0466a;
import t2.C0484b;
import u1.C0494a;
import z2.l;
import z2.p;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f1084a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f1085b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1086c = 0;

    public static List A(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: t1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: t1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: t1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: t1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: t1.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015d A[SYNTHETIC, Splitter:B:86:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0179 A[SYNTHETIC, Splitter:B:92:0x0179] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0194 A[SYNTHETIC, Splitter:B:98:0x0194] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void B(android.content.Intent r22) {
        /*
            r1 = r22
            r2 = 0
            boolean r0 = R(r22)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "_nr"
            android.os.Bundle r3 = r22.getExtras()
            C(r0, r3)
        L_0x0012:
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = r22.getAction()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            boolean r0 = m()
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x0230
            l1.a r0 = com.google.firebase.messaging.FirebaseMessaging.f2861m
            java.lang.Object r0 = r0.get()
            r3 = r0
            o0.e r3 = (o0.C0357e) r3
            java.lang.String r4 = "FirebaseMessaging"
            if (r3 != 0) goto L_0x003d
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r4, r0)
            goto L_0x0230
        L_0x003d:
            r0 = 0
            if (r1 != 0) goto L_0x0042
            goto L_0x01cd
        L_0x0042:
            android.os.Bundle r5 = r22.getExtras()
            if (r5 != 0) goto L_0x004a
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x004a:
            java.lang.String r6 = "google.ttl"
            java.lang.Object r6 = r5.get(r6)
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x005d
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x005a:
            r16 = r6
            goto L_0x007c
        L_0x005d:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x007a
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0069 }
            int r6 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0069 }
            goto L_0x005a
        L_0x0069:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid TTL: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r4, r6)
        L_0x007a:
            r16 = r2
        L_0x007c:
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r5.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x008a
        L_0x0088:
            r11 = r6
            goto L_0x00a8
        L_0x008a:
            X0.g r6 = X0.g.d()     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            java.lang.Object r7 = m1.C0329c.f4023m     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            java.lang.Class<m1.d> r7 = m1.C0330d.class
            r6.a()     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            a1.f r6 = r6.f1939d     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            java.lang.Object r6 = r6.a(r7)     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            m1.c r6 = (m1.C0329c) r6     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            W0.p r6 = r6.c()     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            java.lang.Object r6 = android.support.v4.media.session.a.d(r6)     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x0229, InterruptedException -> 0x0227 }
            goto L_0x0088
        L_0x00a8:
            X0.g r6 = X0.g.d()
            r6.a()
            android.content.Context r6 = r6.f1936a
            java.lang.String r13 = r6.getPackageName()
            boolean r6 = b2.h.y(r5)
            if (r6 == 0) goto L_0x00bf
            t1.b r6 = t1.C0479b.DISPLAY_NOTIFICATION
        L_0x00bd:
            r12 = r6
            goto L_0x00c2
        L_0x00bf:
            t1.b r6 = t1.C0479b.DATA_MESSAGE
            goto L_0x00bd
        L_0x00c2:
            java.lang.String r6 = "google.delivered_priority"
            java.lang.String r6 = r5.getString(r6)
            r7 = 2
            r8 = 1
            if (r6 != 0) goto L_0x00e2
            java.lang.String r6 = "google.priority_reduced"
            java.lang.String r6 = r5.getString(r6)
            java.lang.String r9 = "1"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00dc
        L_0x00da:
            r6 = r7
            goto L_0x00f6
        L_0x00dc:
            java.lang.String r6 = "google.priority"
            java.lang.String r6 = r5.getString(r6)
        L_0x00e2:
            java.lang.String r9 = "high"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x00ec
            r6 = r8
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r9 = "normal"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00f5
            goto L_0x00da
        L_0x00f5:
            r6 = r2
        L_0x00f6:
            if (r6 != r7) goto L_0x00fb
            r6 = 5
        L_0x00f9:
            r15 = r6
            goto L_0x0101
        L_0x00fb:
            if (r6 != r8) goto L_0x0100
            r6 = 10
            goto L_0x00f9
        L_0x0100:
            r15 = r2
        L_0x0101:
            java.lang.String r6 = "google.message_id"
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x010f
            java.lang.String r6 = "message_id"
            java.lang.String r6 = r5.getString(r6)
        L_0x010f:
            java.lang.String r9 = ""
            if (r6 == 0) goto L_0x0115
            r10 = r6
            goto L_0x0116
        L_0x0115:
            r10 = r9
        L_0x0116:
            java.lang.String r6 = "from"
            java.lang.String r6 = r5.getString(r6)
            if (r6 == 0) goto L_0x0127
            java.lang.String r14 = "/topics/"
            boolean r14 = r6.startsWith(r14)
            if (r14 == 0) goto L_0x0127
            r0 = r6
        L_0x0127:
            if (r0 == 0) goto L_0x012c
            r17 = r0
            goto L_0x012e
        L_0x012c:
            r17 = r9
        L_0x012e:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0138
            r14 = r0
            goto L_0x0139
        L_0x0138:
            r14 = r9
        L_0x0139:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0144
            r18 = r0
            goto L_0x0146
        L_0x0144:
            r18 = r9
        L_0x0146:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0151
            r19 = r0
            goto L_0x0153
        L_0x0151:
            r19 = r9
        L_0x0153:
            java.lang.String r0 = "google.c.sender.id"
            boolean r6 = r5.containsKey(r0)
            r20 = 0
            if (r6 == 0) goto L_0x016c
            java.lang.String r0 = r5.getString(r0)     // Catch:{ NumberFormatException -> 0x0166 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0166 }
            goto L_0x01bf
        L_0x0166:
            r0 = move-exception
            java.lang.String r5 = "error parsing project number"
            android.util.Log.w(r4, r5, r0)
        L_0x016c:
            X0.g r5 = X0.g.d()
            r5.a()
            X0.h r6 = r5.f1938c
            java.lang.String r0 = r6.f1950e
            if (r0 == 0) goto L_0x0185
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x01bf
        L_0x017e:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r4, r0, r9)
        L_0x0185:
            r5.a()
            java.lang.String r0 = r6.f1947b
            java.lang.String r5 = "1:"
            boolean r5 = r0.startsWith(r5)
            java.lang.String r6 = "error parsing app ID"
            if (r5 != 0) goto L_0x019f
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0199 }
            goto L_0x01bf
        L_0x0199:
            r0 = move-exception
            r5 = r0
            android.util.Log.w(r4, r6, r5)
            goto L_0x01a8
        L_0x019f:
            java.lang.String r5 = ":"
            java.lang.String[] r0 = r0.split(r5)
            int r5 = r0.length
            if (r5 >= r7) goto L_0x01ab
        L_0x01a8:
            r5 = r20
            goto L_0x01bf
        L_0x01ab:
            r0 = r0[r8]
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x01b4
            goto L_0x01a8
        L_0x01b4:
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01b9 }
            goto L_0x01bf
        L_0x01b9:
            r0 = move-exception
            r5 = r0
            android.util.Log.w(r4, r6, r5)
            goto L_0x01a8
        L_0x01bf:
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c5
            r8 = r5
            goto L_0x01c7
        L_0x01c5:
            r8 = r20
        L_0x01c7:
            t1.d r0 = new t1.d
            r7 = r0
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01cd:
            if (r0 != 0) goto L_0x01d0
            goto L_0x0230
        L_0x01d0:
            java.lang.String r5 = "google.product_id"
            r6 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r1 = r1.getIntExtra(r5, r6)     // Catch:{ RuntimeException -> 0x020f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException -> 0x020f }
            o0.b r5 = new o0.b     // Catch:{ RuntimeException -> 0x020f }
            r5.<init>(r1)     // Catch:{ RuntimeException -> 0x020f }
            java.lang.String r1 = "proto"
            o0.c r6 = new o0.c     // Catch:{ RuntimeException -> 0x020f }
            r6.<init>(r1)     // Catch:{ RuntimeException -> 0x020f }
            A.c r1 = new A.c     // Catch:{ RuntimeException -> 0x020f }
            r1.<init>((int) r2)     // Catch:{ RuntimeException -> 0x020f }
            r0.n r3 = (r0.n) r3     // Catch:{ RuntimeException -> 0x020f }
            java.util.Set r2 = r3.f4439a     // Catch:{ RuntimeException -> 0x020f }
            boolean r7 = r2.contains(r6)     // Catch:{ RuntimeException -> 0x020f }
            if (r7 == 0) goto L_0x0211
            C0.f r2 = new C0.f     // Catch:{ RuntimeException -> 0x020f }
            r0.i r7 = r3.f4440b     // Catch:{ RuntimeException -> 0x020f }
            r0.o r3 = r3.f4441c     // Catch:{ RuntimeException -> 0x020f }
            r2.<init>((r0.i) r7, (o0.C0355c) r6, (A.C0002c) r1, (r0.o) r3)     // Catch:{ RuntimeException -> 0x020f }
            t1.e r1 = new t1.e     // Catch:{ RuntimeException -> 0x020f }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x020f }
            o0.a r0 = new o0.a     // Catch:{ RuntimeException -> 0x020f }
            r0.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x020f }
            r2.V(r0)     // Catch:{ RuntimeException -> 0x020f }
            goto L_0x0230
        L_0x020f:
            r0 = move-exception
            goto L_0x0221
        L_0x0211:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x020f }
            java.lang.String r1 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2}     // Catch:{ RuntimeException -> 0x020f }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ RuntimeException -> 0x020f }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x020f }
            throw r0     // Catch:{ RuntimeException -> 0x020f }
        L_0x0221:
            java.lang.String r1 = "Failed to send big query analytics payload."
            android.util.Log.w(r4, r1, r0)
            goto L_0x0230
        L_0x0227:
            r0 = move-exception
            goto L_0x022a
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.a.B(android.content.Intent):void");
    }

    public static void C(String str, Bundle bundle) {
        String str2;
        try {
            g.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            if (h.y(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            g d3 = g.d();
            d3.a();
            if (d3.f1939d.a(Y0.a.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
                return;
            }
            throw new ClassCastException();
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static float D(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.c(edgeEffect, f3, f4);
        }
        c.a(edgeEffect, f3, f4);
        return f3;
    }

    public static b E(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i3;
        boolean z3;
        int i4;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0359a.f4164a);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0359a.f4165b);
                                int i5 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i5 = 1;
                                }
                                int i6 = obtainAttributes2.getInt(i5, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i3 = 6;
                                } else {
                                    i3 = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i3, 0)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int i7 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i7 = 3;
                                }
                                int i8 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i8 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i8);
                                int i9 = obtainAttributes2.getInt(i7, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i4 = 5;
                                } else {
                                    i4 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i4, 0);
                                String string6 = obtainAttributes2.getString(i4);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    S(xmlResourceParser);
                                }
                                arrayList.add(new s.d(i6, i9, resourceId2, string6, string5, z3));
                            } else {
                                S(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new s.c((s.d[]) arrayList.toArray(new s.d[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        S(xmlResourceParser);
                    }
                    return new e(new C0465z(string, string2, string3, I(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                S(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static boolean H(Parcel parcel, int i3) {
        a0(parcel, i3, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static List I(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (C0427a.a(obtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int J(Parcel parcel, int i3) {
        a0(parcel, i3, 4);
        return parcel.readInt();
    }

    public static int K(Parcel parcel, int i3) {
        if ((i3 & -65536) != -65536) {
            return (char) (i3 >> 16);
        }
        return parcel.readInt();
    }

    public static void L(T1.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{T1.c.class}).invoke((Object) null, new Object[]{cVar});
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static void Q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        q0 q0Var = q0.f3762j;
        if (q0Var != null && q0Var.f3764a == view) {
            q0.b((q0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            q0 q0Var2 = q0.f3763k;
            if (q0Var2 != null && q0Var2.f3764a == view) {
                q0Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new q0(view, charSequence);
    }

    public static boolean R(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void S(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static void T(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + K(parcel, i3));
    }

    public static final Object U(t tVar, t tVar2, p pVar) {
        Object obj;
        Object L3;
        try {
            A2.t.a(2, pVar);
            obj = pVar.i(tVar2, tVar);
        } catch (Throwable th) {
            obj = new C0063n(th, false);
        }
        C0466a aVar = C0466a.f4632f;
        if (obj == aVar || (L3 = tVar.L(obj)) == C0071w.f790d) {
            return aVar;
        }
        if (!(L3 instanceof C0063n)) {
            return C0071w.m(L3);
        }
        throw ((C0063n) L3).f775a;
    }

    public static final void V(Object obj) {
        if (obj instanceof C0364d) {
            throw ((C0364d) obj).f4189f;
        }
    }

    public static int X(Parcel parcel) {
        int readInt = parcel.readInt();
        int K3 = K(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i3 = K3 + dataPosition;
            if (i3 >= dataPosition && i3 <= parcel.dataSize()) {
                return i3;
            }
            throw new H0.b(A2.h.f("Size read is invalid start=", dataPosition, " end=", i3), parcel);
        }
        throw new H0.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static final boolean Y(String str, z2.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList Z(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0315b) {
            C0315b bVar = (C0315b) th;
            arrayList.add(bVar.f4007f);
            arrayList.add(bVar.getMessage());
            arrayList.add((Object) null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static final R2.p a(R2.t tVar) {
        i.e(tVar, "<this>");
        return new R2.p(tVar);
    }

    public static void a0(Parcel parcel, int i3, int i4) {
        int K3 = K(parcel, i3);
        if (K3 != i4) {
            String hexString = Integer.toHexString(K3);
            throw new H0.b("Expected size " + i4 + " got " + K3 + " (0x" + hexString + ")", parcel);
        }
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            android.support.v4.media.session.a.c(th, th2);
        }
    }

    public static C0096a f(String str, String str2) {
        C0494a aVar = new C0494a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C0494a.class));
        return new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new r(1, aVar), hashSet3);
    }

    public static Bundle g(Parcel parcel, int i3) {
        int K3 = K(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (K3 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + K3);
        return readBundle;
    }

    public static final C0364d h(Throwable th) {
        i.e(th, "exception");
        return new C0364d(th);
    }

    public static Parcelable i(Parcel parcel, int i3, Parcelable.Creator creator) {
        int K3 = K(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (K3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + K3);
        return parcelable;
    }

    public static String j(Parcel parcel, int i3) {
        int K3 = K(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (K3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + K3);
        return readString;
    }

    public static Object[] k(Parcel parcel, int i3, Parcelable.Creator creator) {
        int K3 = K(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (K3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + K3);
        return createTypedArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(java.lang.Object r5, java.lang.Object r6) {
        /*
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L_0x0011
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0011
            byte[] r5 = (byte[]) r5
            byte[] r6 = (byte[]) r6
            boolean r5 = java.util.Arrays.equals(r5, r6)
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof int[]
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6 instanceof int[]
            if (r0 == 0) goto L_0x0022
            int[] r5 = (int[]) r5
            int[] r6 = (int[]) r6
            boolean r5 = java.util.Arrays.equals(r5, r6)
            return r5
        L_0x0022:
            boolean r0 = r5 instanceof long[]
            if (r0 == 0) goto L_0x0033
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto L_0x0033
            long[] r5 = (long[]) r5
            long[] r6 = (long[]) r6
            boolean r5 = java.util.Arrays.equals(r5, r6)
            return r5
        L_0x0033:
            boolean r0 = r5 instanceof double[]
            if (r0 == 0) goto L_0x0044
            boolean r0 = r6 instanceof double[]
            if (r0 == 0) goto L_0x0044
            double[] r5 = (double[]) r5
            double[] r6 = (double[]) r6
            boolean r5 = java.util.Arrays.equals(r5, r6)
            return r5
        L_0x0044:
            boolean r0 = r5 instanceof java.lang.Object[]
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x008a
            boolean r0 = r6 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x008a
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r0 = r5.length
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r3 = r6.length
            if (r0 != r3) goto L_0x0089
            E2.c r0 = new E2.c
            int r3 = r5.length
            int r3 = r3 - r2
            r0.<init>(r1, r3, r2)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x006b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            goto L_0x0088
        L_0x006b:
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            r3 = r0
            E2.b r3 = (E2.b) r3
            boolean r3 = r3.f257h
            if (r3 == 0) goto L_0x0088
            r3 = r0
            E2.b r3 = (E2.b) r3
            int r3 = r3.a()
            r4 = r5[r3]
            r3 = r6[r3]
            boolean r3 = l(r4, r3)
            if (r3 != 0) goto L_0x006f
            goto L_0x0089
        L_0x0088:
            r1 = r2
        L_0x0089:
            return r1
        L_0x008a:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L_0x00e3
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            if (r3 != r4) goto L_0x00e2
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String r3 = "<this>"
            A2.i.e(r5, r3)
            E2.c r3 = new E2.c
            int r5 = r5.size()
            int r5 = r5 - r2
            r3.<init>(r1, r5, r2)
            boolean r5 = r3 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00c0
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00c0
            goto L_0x00e1
        L_0x00c0:
            java.util.Iterator r5 = r3.iterator()
        L_0x00c4:
            r3 = r5
            E2.b r3 = (E2.b) r3
            boolean r3 = r3.f257h
            if (r3 == 0) goto L_0x00e1
            r3 = r5
            E2.b r3 = (E2.b) r3
            int r3 = r3.a()
            java.lang.Object r4 = r0.get(r3)
            java.lang.Object r3 = r6.get(r3)
            boolean r3 = l(r4, r3)
            if (r3 != 0) goto L_0x00c4
            goto L_0x00e2
        L_0x00e1:
            r1 = r2
        L_0x00e2:
            return r1
        L_0x00e3:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L_0x0133
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L_0x0133
            java.util.Map r5 = (java.util.Map) r5
            int r0 = r5.size()
            java.util.Map r6 = (java.util.Map) r6
            int r3 = r6.size()
            if (r0 != r3) goto L_0x0132
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0100
            goto L_0x0131
        L_0x0100:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0108:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r6.get(r0)
            boolean r0 = l(r3, r0)
            if (r0 == 0) goto L_0x0132
            goto L_0x0108
        L_0x0131:
            r1 = r2
        L_0x0132:
            return r1
        L_0x0133:
            boolean r5 = A2.i.a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.a.l(java.lang.Object, java.lang.Object):boolean");
    }

    public static boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.d();
            g d3 = g.d();
            d3.a();
            Context context = d3.f1936a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean n(Method method, A2.e eVar) {
        Class a2 = eVar.a();
        i.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static void o(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new H0.b(A2.h.e("Overread allowed size end=", i3), parcel);
        }
    }

    public static C0096a p(String str, C0002c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C0494a.class));
        for (Class cls : new Class[0]) {
            android.support.v4.media.session.a.h(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        a1.i a2 = a1.i.a(Context.class);
        if (!hashSet.contains(a2.f2019a)) {
            hashSet2.add(a2);
            return new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0224e(4, str, cVar), hashSet3);
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static C0420d y(C0420d dVar) {
        C0484b bVar;
        C0420d dVar2;
        i.e(dVar, "<this>");
        if (dVar instanceof C0484b) {
            bVar = (C0484b) dVar;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return dVar;
        }
        C0420d dVar3 = bVar.f4685h;
        if (dVar3 != null) {
            return dVar3;
        }
        C0422f fVar = (C0422f) bVar.h().n(C0421e.f4456f);
        if (fVar != null) {
            dVar2 = new N2.h((C0067s) fVar, bVar);
        } else {
            dVar2 = bVar;
        }
        bVar.f4685h = dVar2;
        return dVar2;
    }

    public static boolean z(byte b3) {
        if (b3 > -65) {
            return true;
        }
        return false;
    }

    public abstract void F(o.g gVar, o.g gVar2);

    public abstract void G(o.g gVar, Thread thread);

    public abstract void M();

    public abstract void O(boolean z3);

    public abstract void P(T2.a aVar);

    public abstract void W();

    public abstract boolean b(o.h hVar, o.d dVar);

    public abstract boolean c(o.h hVar, Object obj, Object obj2);

    public abstract boolean d(o.h hVar, o.g gVar, o.g gVar2);

    public abstract T2.a q();

    public abstract z2.a s();

    public abstract l t();

    public abstract U2.p u();

    public void v(int i3) {
        if (i3 == -2) {
            t().j(Boolean.TRUE);
        } else if (i3 == -1) {
            t().j(Boolean.FALSE);
        } else if (i3 == 1) {
            s().a();
        }
    }

    public abstract void w();

    public abstract boolean x();

    public void N(boolean z3) {
    }
}
