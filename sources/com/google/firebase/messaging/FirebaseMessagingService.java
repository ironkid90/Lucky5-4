package com.google.firebase.messaging;

import C0.b;
import java.util.ArrayDeque;
import s1.C0446g;

public class FirebaseMessagingService extends C0446g {

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f2873l = new ArrayDeque(10);

    /* renamed from: k  reason: collision with root package name */
    public b f2874k;

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 3
            r2 = 0
            java.lang.String r3 = r11.getAction()
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "FirebaseMessaging"
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x001a
            goto L_0x0044
        L_0x001a:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "token"
            java.lang.String r11 = r11.getStringExtra(r0)
            r10.c(r11)
            goto L_0x01b5
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown intent action: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getAction()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.d(r5, r11)
            goto L_0x01b5
        L_0x0044:
            java.lang.String r3 = "google.message_id"
            java.lang.String r4 = r11.getStringExtra(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "message_id"
            if (r6 == 0) goto L_0x0053
            goto L_0x0082
        L_0x0053:
            java.util.ArrayDeque r6 = f2873l
            boolean r8 = r6.contains(r4)
            if (r8 == 0) goto L_0x0074
            boolean r6 = android.util.Log.isLoggable(r5, r1)
            if (r6 == 0) goto L_0x0144
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Received duplicate message: "
            r6.<init>(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r5, r4)
            goto L_0x0144
        L_0x0074:
            int r8 = r6.size()
            r9 = 10
            if (r8 < r9) goto L_0x007f
            r6.remove()
        L_0x007f:
            r6.add(r4)
        L_0x0082:
            java.lang.String r4 = "message_type"
            java.lang.String r4 = r11.getStringExtra(r4)
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = "gcm"
        L_0x008c:
            r6 = -1
            int r8 = r4.hashCode()
            switch(r8) {
                case -2062414158: goto L_0x00b6;
                case 102161: goto L_0x00ab;
                case 814694033: goto L_0x00a0;
                case 814800675: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x00c0
        L_0x0095:
            java.lang.String r8 = "send_event"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            r6 = r1
            goto L_0x00c0
        L_0x00a0:
            java.lang.String r8 = "send_error"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00a9
            goto L_0x00c0
        L_0x00a9:
            r6 = 2
            goto L_0x00c0
        L_0x00ab:
            java.lang.String r8 = "gcm"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00b4
            goto L_0x00c0
        L_0x00b4:
            r6 = r0
            goto L_0x00c0
        L_0x00b6:
            java.lang.String r8 = "deleted_messages"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r6 = r2
        L_0x00c0:
            switch(r6) {
                case 0: goto L_0x0144;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00ce;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            java.lang.String r6 = "Received message with unknown type: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r5, r4)
            goto L_0x0144
        L_0x00ce:
            r11.getStringExtra(r3)
            goto L_0x0144
        L_0x00d3:
            java.lang.String r4 = r11.getStringExtra(r3)
            if (r4 != 0) goto L_0x00dc
            r11.getStringExtra(r7)
        L_0x00dc:
            H1.a r4 = new H1.a
            java.lang.String r5 = "error"
            java.lang.String r5 = r11.getStringExtra(r5)
            r4.<init>(r5)
            if (r5 != 0) goto L_0x00ea
            goto L_0x0144
        L_0x00ea:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r5.toLowerCase(r4)
            r4.getClass()
            goto L_0x0144
        L_0x00f4:
            M0.a.B(r11)
            android.os.Bundle r4 = r11.getExtras()
            if (r4 != 0) goto L_0x0102
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x0102:
            java.lang.String r5 = "androidx.content.wakelockid"
            r4.remove(r5)
            boolean r5 = b2.h.y(r4)
            if (r5 == 0) goto L_0x0144
            b2.h r5 = new b2.h
            r5.<init>((android.os.Bundle) r4)
            L0.a r4 = new L0.a
            java.lang.String r6 = "Firebase-Messaging-Network-Io"
            r4.<init>(r6)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            C0.f r6 = new C0.f
            r6.<init>((com.google.firebase.messaging.FirebaseMessagingService) r10, (b2.h) r5, (java.util.concurrent.ExecutorService) r4)
            boolean r5 = r6.N()     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x012c
            r4.shutdown()
            goto L_0x0144
        L_0x012c:
            r4.shutdown()
            boolean r4 = M0.a.R(r11)
            if (r4 == 0) goto L_0x0144
            java.lang.String r4 = "_nf"
            android.os.Bundle r5 = r11.getExtras()
            M0.a.C(r4, r5)
            goto L_0x0144
        L_0x013f:
            r11 = move-exception
            r4.shutdown()
            throw r11
        L_0x0144:
            C0.b r4 = r10.f2874k
            if (r4 != 0) goto L_0x0153
            C0.b r4 = new C0.b
            android.content.Context r5 = r10.getApplicationContext()
            r4.<init>(r5)
            r10.f2874k = r4
        L_0x0153:
            C0.b r4 = r10.f2874k
            C0.u r5 = r4.f113c
            int r5 = r5.c()
            r6 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r5 < r6) goto L_0x01a6
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r11.getStringExtra(r3)
            if (r6 != 0) goto L_0x016f
            java.lang.String r6 = r11.getStringExtra(r7)
        L_0x016f:
            r5.putString(r3, r6)
            java.lang.String r3 = "google.product_id"
            boolean r6 = r11.hasExtra(r3)
            if (r6 == 0) goto L_0x0183
            int r11 = r11.getIntExtra(r3, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0184
        L_0x0183:
            r11 = 0
        L_0x0184:
            if (r11 == 0) goto L_0x018d
            int r11 = r11.intValue()
            r5.putInt(r3, r11)
        L_0x018d:
            android.content.Context r11 = r4.f112b
            C0.t r11 = C0.t.a(r11)
            C0.s r3 = new C0.s
            monitor-enter(r11)
            int r4 = r11.f171d     // Catch:{ all -> 0x01a3 }
            int r0 = r0 + r4
            r11.f171d = r0     // Catch:{ all -> 0x01a3 }
            monitor-exit(r11)
            r3.<init>(r4, r1, r5, r2)
            r11.b(r3)
            goto L_0x01b5
        L_0x01a3:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01a3 }
            throw r0
        L_0x01a6:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r11.<init>(r0)
            W0.p r0 = new W0.p
            r0.<init>()
            r0.k(r11)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c(String str) {
    }
}
