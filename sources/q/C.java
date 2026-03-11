package q;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.flutter.plugin.platform.f;
import java.util.ArrayList;
import java.util.Iterator;

public final class C extends D {

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f4201e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4202f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public V f4203g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4204h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f4205i;

    public C() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0159 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q.C e(android.app.Notification r6) {
        /*
            r0 = 0
            r1 = 1
            android.os.Bundle r6 = r6.extras
            r2 = 0
            if (r6 != 0) goto L_0x000a
        L_0x0007:
            r3 = r2
            goto L_0x0152
        L_0x000a:
            java.lang.String r3 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            java.lang.String r3 = r6.getString(r3)
            if (r3 == 0) goto L_0x0084
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -716705180: goto L_0x0052;
                case -171946061: goto L_0x0047;
                case 714386739: goto L_0x003c;
                case 912942987: goto L_0x0031;
                case 919595044: goto L_0x0026;
                case 2090799565: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x005c
        L_0x001b:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$MessagingStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0024
            goto L_0x005c
        L_0x0024:
            r4 = 5
            goto L_0x005c
        L_0x0026:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$BigTextStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x002f
            goto L_0x005c
        L_0x002f:
            r4 = 4
            goto L_0x005c
        L_0x0031:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$InboxStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x003a
            goto L_0x005c
        L_0x003a:
            r4 = 3
            goto L_0x005c
        L_0x003c:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$CallStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            r4 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$BigPictureStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r4 = r1
            goto L_0x005c
        L_0x0052:
            java.lang.String r5 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            switch(r4) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0078;
                case 2: goto L_0x0072;
                case 3: goto L_0x006c;
                case 4: goto L_0x0066;
                case 5: goto L_0x0060;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0084
        L_0x0060:
            q.C r3 = new q.C
            r3.<init>()
            goto L_0x0085
        L_0x0066:
            q.n r3 = new q.n
            r3.<init>(r0)
            goto L_0x0085
        L_0x006c:
            q.n r3 = new q.n
            r3.<init>(r1)
            goto L_0x0085
        L_0x0072:
            q.u r3 = new q.u
            r3.<init>()
            goto L_0x0085
        L_0x0078:
            q.m r3 = new q.m
            r3.<init>()
            goto L_0x0085
        L_0x007e:
            P.a r3 = new P.a
            r3.<init>(r1)
            goto L_0x0085
        L_0x0084:
            r3 = r2
        L_0x0085:
            if (r3 == 0) goto L_0x0089
            goto L_0x014b
        L_0x0089:
            java.lang.String r3 = "android.selfDisplayName"
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L_0x0146
            java.lang.String r3 = "android.messagingStyleUser"
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x009b
            goto L_0x0146
        L_0x009b:
            java.lang.String r3 = "android.picture"
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L_0x0140
            java.lang.String r3 = "android.pictureIcon"
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x00ad
            goto L_0x0140
        L_0x00ad:
            java.lang.String r3 = "android.bigText"
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x00bc
            q.n r3 = new q.n
            r3.<init>(r0)
            goto L_0x014b
        L_0x00bc:
            java.lang.String r3 = "android.textLines"
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x00cb
            q.n r3 = new q.n
            r3.<init>(r1)
            goto L_0x014b
        L_0x00cb:
            java.lang.String r3 = "android.callType"
            boolean r3 = r6.containsKey(r3)
            if (r3 == 0) goto L_0x00da
            q.u r3 = new q.u
            r3.<init>()
            goto L_0x014b
        L_0x00da:
            java.lang.String r3 = "android.template"
            java.lang.String r3 = r6.getString(r3)
            if (r3 != 0) goto L_0x00e4
        L_0x00e2:
            r3 = r2
            goto L_0x014b
        L_0x00e4:
            java.lang.Class<android.app.Notification$BigPictureStyle> r4 = android.app.Notification.BigPictureStyle.class
            java.lang.String r4 = r4.getName()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f7
            q.m r0 = new q.m
            r0.<init>()
        L_0x00f5:
            r3 = r0
            goto L_0x014b
        L_0x00f7:
            java.lang.Class<android.app.Notification$BigTextStyle> r4 = android.app.Notification.BigTextStyle.class
            java.lang.String r4 = r4.getName()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x010a
            q.n r1 = new q.n
            r1.<init>(r0)
            r3 = r1
            goto L_0x014b
        L_0x010a:
            java.lang.Class<android.app.Notification$InboxStyle> r0 = android.app.Notification.InboxStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x011c
            q.n r0 = new q.n
            r0.<init>(r1)
            goto L_0x00f5
        L_0x011c:
            java.lang.Class<android.app.Notification$MessagingStyle> r0 = android.app.Notification.MessagingStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x012e
            q.C r0 = new q.C
            r0.<init>()
            goto L_0x00f5
        L_0x012e:
            java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r0 = android.app.Notification.DecoratedCustomViewStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00e2
            P.a r0 = new P.a
            r0.<init>(r1)
            goto L_0x00f5
        L_0x0140:
            q.m r3 = new q.m
            r3.<init>()
            goto L_0x014b
        L_0x0146:
            q.C r3 = new q.C
            r3.<init>()
        L_0x014b:
            if (r3 != 0) goto L_0x014f
            goto L_0x0007
        L_0x014f:
            r3.d(r6)     // Catch:{ ClassCastException -> 0x0007 }
        L_0x0152:
            boolean r6 = r3 instanceof q.C
            if (r6 == 0) goto L_0x0159
            q.C r3 = (q.C) r3
            return r3
        L_0x0159:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C.e(android.app.Notification):q.C");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f4203g.f4232a);
        bundle.putBundle("android.messagingStyleUser", this.f4203g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f4204h);
        if (this.f4204h != null && this.f4205i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f4204h);
        }
        ArrayList arrayList = this.f4201e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", C0370B.a(arrayList));
        }
        ArrayList arrayList2 = this.f4202f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C0370B.a(arrayList2));
        }
        Boolean bool = this.f4205i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public final void b(f fVar) {
        Notification.MessagingStyle messagingStyle;
        this.f4205i = Boolean.valueOf(f());
        if (Build.VERSION.SDK_INT >= 28) {
            V v = this.f4203g;
            v.getClass();
            messagingStyle = C0394y.a(U.b(v));
        } else {
            messagingStyle = C0392w.b(this.f4203g.f4232a);
        }
        Iterator it = this.f4201e.iterator();
        while (it.hasNext()) {
            C0392w.a(messagingStyle, ((C0370B) it.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f4202f.iterator();
            while (it2.hasNext()) {
                C0393x.a(messagingStyle, ((C0370B) it2.next()).c());
            }
        }
        if (this.f4205i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            C0392w.c(messagingStyle, this.f4204h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C0394y.b(messagingStyle, this.f4205i.booleanValue());
        }
        messagingStyle.setBuilder((Notification.Builder) fVar.f3380c);
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [q.V, java.lang.Object] */
    public final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayList = this.f4201e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f4203g = V.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            ? obj = new Object();
            obj.f4232a = string;
            obj.f4233b = null;
            obj.f4234c = null;
            obj.f4235d = null;
            obj.f4236e = false;
            obj.f4237f = false;
            this.f4203g = obj;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f4204h = charSequence;
        if (charSequence == null) {
            this.f4204h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(C0370B.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f4202f.addAll(C0370B.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f4205i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final boolean f() {
        C0386p pVar = this.f4206a;
        if (pVar == null || pVar.f4275a.getApplicationInfo().targetSdkVersion >= 28 || this.f4205i != null) {
            Boolean bool = this.f4205i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } else if (this.f4204h != null) {
            return true;
        } else {
            return false;
        }
    }

    public C(V v) {
        if (!TextUtils.isEmpty(v.f4232a)) {
            this.f4203g = v;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
