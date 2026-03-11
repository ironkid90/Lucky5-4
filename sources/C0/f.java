package C0;

import A.C0002c;
import A2.i;
import F0.y;
import G0.z;
import L1.h;
import L2.d;
import L2.l;
import S1.r;
import S1.v;
import S1.w;
import T.C0080a;
import T.C0081b;
import W0.c;
import a.C0094a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.session.a;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import c2.C0134b;
import c2.C0136d;
import c2.o;
import c2.p;
import c2.q;
import c2.x;
import com.google.firebase.messaging.FirebaseMessagingService;
import d0.C0148j;
import d2.C0152a;
import e1.C0158d;
import f.C0159a;
import g0.C0178j;
import g0.C0179k;
import g1.C0180a;
import h2.C0187a;
import i2.C0220a;
import i2.C0221b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.j;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import j.r0;
import j1.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k2.C0281I;
import k2.C0282J;
import k2.C0283K;
import k2.C0285M;
import k2.C0290e;
import k2.C0291f;
import k2.C0292g;
import l2.C0316c;
import l2.C0317d;
import n.C0339f;
import o0.C0353a;
import o0.C0355c;
import o0.C0356d;
import org.xmlpull.v1.XmlPullParserException;
import p2.C0368h;
import q2.C0401d;
import r0.k;
import r2.C0420d;
import s.b;
import s.g;
import s1.C0459t;
import s1.C0463x;
import s1.C0464y;
import s1.C0465z;
import s2.C0466a;
import t.C0470d;
import t0.C0477b;
import t1.C0482e;
import u1.C0496c;
import w0.C0500a;
import w0.C0501b;
import x0.C0510b;
import x0.C0512d;
import y1.m;
import y1.n;

public final /* synthetic */ class f implements c, C0136d, o, C0291f, d, C0477b, m {

    /* renamed from: j  reason: collision with root package name */
    public static f f125j;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f126f;

    /* renamed from: g  reason: collision with root package name */
    public Object f127g;

    /* renamed from: h  reason: collision with root package name */
    public Object f128h;

    /* renamed from: i  reason: collision with root package name */
    public Object f129i;

    public /* synthetic */ f(int i3, boolean z3) {
        this.f126f = i3;
    }

    public static Bundle F(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [R1.a, java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, W1.f] */
    public static f O() {
        if (f125j == null) {
            G0.f fVar = new G0.f(9);
            ? obj = new Object();
            obj.f1365a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj);
            FlutterJNI flutterJNI = new FlutterJNI();
            ? obj2 = new Object();
            obj2.f1912a = false;
            obj2.f1916e = flutterJNI;
            obj2.f1917f = newCachedThreadPool;
            f fVar2 = new f(5, false);
            fVar2.f128h = obj2;
            fVar2.f127g = fVar;
            fVar2.f129i = newCachedThreadPool;
            f125j = fVar2;
        }
        return f125j;
    }

    public static f P(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new f(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static void Y(c2.f fVar, f fVar2) {
        C0316c cVar = C0316c.f4008d;
        C0464y yVar = new C0464y(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, (e) null);
        if (fVar2 != null) {
            yVar.l(new C0317d(fVar2, 0));
        } else {
            yVar.l((C0134b) null);
        }
        C0464y yVar2 = new C0464y(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, (e) null);
        if (fVar2 != null) {
            yVar2.l(new C0317d(fVar2, 1));
        } else {
            yVar2.l((C0134b) null);
        }
        C0464y yVar3 = new C0464y(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, (e) null);
        if (fVar2 != null) {
            yVar3.l(new C0317d(fVar2, 2));
        } else {
            yVar3.l((C0134b) null);
        }
        C0464y yVar4 = new C0464y(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, (e) null);
        if (fVar2 != null) {
            yVar4.l(new C0317d(fVar2, 3));
        } else {
            yVar4.l((C0134b) null);
        }
        C0464y yVar5 = new C0464y(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, (e) null);
        if (fVar2 != null) {
            yVar5.l(new C0317d(fVar2, 4));
        } else {
            yVar5.l((C0134b) null);
        }
    }

    public void A(int i3, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f127g).dispatchSemanticsAction(i3, dVar);
    }

    public void B(int i3, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f127g).dispatchSemanticsAction(i3, dVar, serializable);
    }

    public void C(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f128h;
        h1.f fVar = new h1.f(byteArrayOutputStream, hashMap, (HashMap) this.f127g, (C0180a) this.f129i);
        C0158d dVar = (C0158d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public void D(boolean z3) {
        if (z3) {
            synchronized (((ArrayList) this.f128h)) {
                if (z3) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            }
            return;
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public void E(Intent intent, CountDownLatch countDownLatch) {
        C0221b bVar;
        if (((T1.c) this.f129i) == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        if (countDownLatch != null) {
            bVar = new C0221b(countDownLatch);
        } else {
            bVar = null;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                HashMap A3 = a.A(C0463x.CREATOR.createFromParcel(obtain));
                HashMap hashMap = new HashMap();
                hashMap.put("userCallbackHandle", Long.valueOf(C0094a.f1971k.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0)));
                hashMap.put("message", A3);
                ((q) this.f127g).a("MessagingBackground#onMessage", hashMap, bVar);
            } finally {
                obtain.recycle();
            }
        } else {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
        }
    }

    public int G(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f129i;
        int size = arrayList.size();
        while (i4 < size) {
            ((C0080a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList H(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f127g;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            Object obj = C0159a.f2941a;
            ColorStateList colorStateList = ((Context) this.f128h).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i3);
    }

    public Drawable I(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f127g;
        if (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) {
            return typedArray.getDrawable(i3);
        }
        return C0159a.a((Context) this.f128h, resourceId);
    }

    public Typeface J(int i3, int i4, u uVar) {
        int i5 = i4;
        u uVar2 = uVar;
        int resourceId = ((TypedArray) this.f127g).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f129i) == null) {
            this.f129i = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f129i;
        Object obj = g.f4469a;
        Context context = (Context) this.f128h;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                uVar.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            C0339f fVar = C0470d.f4641b;
            Typeface typeface = (Typeface) fVar.a(C0470d.b(resources, resourceId, charSequence2, i6, i5));
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new h(10, uVar2, typeface));
                return typeface;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    b E3 = M0.a.E(resources.getXml(resourceId), resources);
                    if (E3 == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        uVar.a();
                        return null;
                    }
                    return C0470d.a(context, E3, resources, resourceId, charSequence2, typedValue.assetCookie, i4, uVar);
                }
                int i7 = typedValue.assetCookie;
                Typeface k3 = C0470d.f4640a.k(context, resources, resourceId, charSequence2, i4);
                if (k3 != null) {
                    fVar.b(C0470d.b(resources, resourceId, charSequence2, i7, i5), k3);
                }
                if (k3 != null) {
                    new Handler(Looper.getMainLooper()).post(new h(10, uVar2, k3));
                } else {
                    uVar.a();
                }
                return k3;
            } catch (XmlPullParserException e2) {
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                uVar.a();
                return null;
            } catch (IOException e3) {
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e3);
                uVar.a();
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
    }

    public View K(int i3) {
        return ((RecyclerView) ((B.m) this.f128h).f100g).getChildAt(i3);
    }

    public int L() {
        return ((RecyclerView) ((B.m) this.f128h).f100g).getChildCount();
    }

    public boolean M(KeyEvent keyEvent) {
        if (((HashSet) this.f127g).remove(keyEvent)) {
            return false;
        }
        w[] wVarArr = (w[]) this.f128h;
        if (wVarArr.length > 0) {
            N.a aVar = new N.a(this, keyEvent);
            for (w f3 : wVarArr) {
                f3.f(keyEvent, new z(aVar));
            }
            return true;
        }
        Q(keyEvent);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [q.m, q.D] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (r0 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0373 A[SYNTHETIC, Splitter:B:145:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x039a A[SYNTHETIC, Splitter:B:151:0x039a] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04ff A[SYNTHETIC, Splitter:B:217:0x04ff] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd A[Catch:{ NameNotFoundException -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[SYNTHETIC, Splitter:B:38:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean N() {
        /*
            r18 = this;
            r1 = r18
            r2 = 2
            r3 = 0
            java.lang.Object r0 = r1.f129i
            b2.h r0 = (b2.h) r0
            java.lang.String r4 = "gcm.n.noui"
            boolean r0 = r0.j(r4)
            r4 = 1
            if (r0 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.Object r0 = r1.f127g
            com.google.firebase.messaging.FirebaseMessagingService r0 = (com.google.firebase.messaging.FirebaseMessagingService) r0
            java.lang.String r5 = "keyguard"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x0025
            goto L_0x0052
        L_0x0025:
            int r5 = android.os.Process.myPid()
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0052
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            int r7 = r6.pid
            if (r7 != r5) goto L_0x003b
            int r0 = r6.importance
            r5 = 100
            if (r0 != r5) goto L_0x0052
            return r3
        L_0x0052:
            java.lang.Object r0 = r1.f129i
            b2.h r0 = (b2.h) r0
            java.lang.String r5 = "gcm.n.image"
            java.lang.String r0 = r0.w(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = "FirebaseMessaging"
            if (r5 == 0) goto L_0x0066
        L_0x0064:
            r5 = 0
            goto L_0x0083
        L_0x0066:
            s1.r r5 = new s1.r     // Catch:{ MalformedURLException -> 0x0071 }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0071 }
            r8.<init>(r0)     // Catch:{ MalformedURLException -> 0x0071 }
            r5.<init>(r8)     // Catch:{ MalformedURLException -> 0x0071 }
            goto L_0x0083
        L_0x0071:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Not downloading image, bad URL: "
            r5.<init>(r8)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r7, r0)
            goto L_0x0064
        L_0x0083:
            if (r5 == 0) goto L_0x009f
            java.lang.Object r0 = r1.f128h
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            W0.i r8 = new W0.i
            r8.<init>()
            L1.h r9 = new L1.h
            r10 = 12
            r9.<init>(r10, r5, r8)
            java.util.concurrent.Future r0 = r0.submit(r9)
            r5.f4587g = r0
            W0.p r0 = r8.f1875a
            r5.f4588h = r0
        L_0x009f:
            java.lang.Object r0 = r1.f127g
            r8 = r0
            com.google.firebase.messaging.FirebaseMessagingService r8 = (com.google.firebase.messaging.FirebaseMessagingService) r8
            java.lang.Object r0 = r1.f129i
            r9 = r0
            b2.h r9 = (b2.h) r9
            java.util.concurrent.atomic.AtomicInteger r0 = s1.C0444e.f4555a
            java.lang.String r10 = "Couldn't get own application info: "
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r11 = r8.getPackageName()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r11, r12)     // Catch:{ NameNotFoundException -> 0x00c3 }
            if (r0 == 0) goto L_0x00d3
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00c3 }
            if (r0 == 0) goto L_0x00d3
        L_0x00c1:
            r11 = r0
            goto L_0x00d6
        L_0x00c3:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r7, r0)
        L_0x00d3:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            goto L_0x00c1
        L_0x00d6:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r9.w(r0)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r12 >= r13) goto L_0x00e5
        L_0x00e2:
            r0 = 0
            goto L_0x016c
        L_0x00e5:
            android.content.pm.PackageManager r12 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00e2 }
            java.lang.String r14 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x00e2 }
            android.content.pm.ApplicationInfo r12 = r12.getApplicationInfo(r14, r3)     // Catch:{ NameNotFoundException -> 0x00e2 }
            int r12 = r12.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00e2 }
            if (r12 >= r13) goto L_0x00f6
            goto L_0x00e2
        L_0x00f6:
            java.lang.Class<android.app.NotificationManager> r12 = android.app.NotificationManager.class
            java.lang.Object r12 = r8.getSystemService(r12)
            android.app.NotificationManager r12 = (android.app.NotificationManager) r12
            boolean r13 = android.text.TextUtils.isEmpty(r0)
            if (r13 != 0) goto L_0x0121
            android.app.NotificationChannel r13 = r12.getNotificationChannel(r0)
            if (r13 == 0) goto L_0x010b
            goto L_0x016c
        L_0x010b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Notification Channel requested ("
            r13.<init>(r14)
            r13.append(r0)
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r7, r0)
        L_0x0121:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r11.getString(r0)
            boolean r13 = android.text.TextUtils.isEmpty(r0)
            if (r13 != 0) goto L_0x013a
            android.app.NotificationChannel r13 = r12.getNotificationChannel(r0)
            if (r13 == 0) goto L_0x0134
            goto L_0x016c
        L_0x0134:
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r7, r0)
            goto L_0x013f
        L_0x013a:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r7, r0)
        L_0x013f:
            android.app.NotificationChannel r0 = r12.getNotificationChannel("fcm_fallback_notification_channel")
            if (r0 != 0) goto L_0x016a
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r13 = r8.getPackageName()
            java.lang.String r14 = "fcm_fallback_notification_channel_label"
            java.lang.String r15 = "string"
            int r0 = r0.getIdentifier(r14, r15, r13)
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r7, r0)
            java.lang.String r0 = "Misc"
            goto L_0x0163
        L_0x015f:
            java.lang.String r0 = r8.getString(r0)
        L_0x0163:
            android.app.NotificationChannel r0 = i2.C0231l.c(r0)
            r12.createNotificationChannel(r0)
        L_0x016a:
            java.lang.String r0 = "fcm_fallback_notification_channel"
        L_0x016c:
            java.lang.String r12 = r8.getPackageName()
            android.content.res.Resources r13 = r8.getResources()
            android.content.pm.PackageManager r14 = r8.getPackageManager()
            q.p r15 = new q.p
            r15.<init>(r8, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r9.u(r13, r12, r0)
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x018f
            java.lang.CharSequence r0 = q.C0386p.b(r0)
            r15.f4279e = r0
        L_0x018f:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r9.u(r13, r12, r0)
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x01af
            java.lang.CharSequence r6 = q.C0386p.b(r0)
            r15.f4280f = r6
            q.n r6 = new q.n
            r6.<init>(r3)
            java.lang.CharSequence r0 = q.C0386p.b(r0)
            r6.f4265f = r0
            r15.f(r6)
        L_0x01af:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r9.w(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x01ef
            java.lang.String r6 = "drawable"
            int r6 = r13.getIdentifier(r0, r6, r12)
            if (r6 == 0) goto L_0x01ca
            boolean r17 = s1.C0444e.a(r13, r6)
            if (r17 == 0) goto L_0x01ca
            goto L_0x0223
        L_0x01ca:
            java.lang.String r6 = "mipmap"
            int r6 = r13.getIdentifier(r0, r6, r12)
            if (r6 == 0) goto L_0x01d9
            boolean r17 = s1.C0444e.a(r13, r6)
            if (r17 == 0) goto L_0x01d9
            goto L_0x0223
        L_0x01d9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r4 = "Icon resource "
            r6.<init>(r4)
            r6.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r7, r0)
        L_0x01ef:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r4 = r11.getInt(r0, r3)
            if (r4 == 0) goto L_0x01fd
            boolean r0 = s1.C0444e.a(r13, r4)
            if (r0 != 0) goto L_0x0214
        L_0x01fd:
            android.content.pm.ApplicationInfo r0 = r14.getApplicationInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x0204 }
            int r4 = r0.icon     // Catch:{ NameNotFoundException -> 0x0204 }
            goto L_0x0214
        L_0x0204:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r10)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r7, r0)
        L_0x0214:
            if (r4 == 0) goto L_0x021f
            boolean r0 = s1.C0444e.a(r13, r4)
            if (r0 != 0) goto L_0x021d
            goto L_0x021f
        L_0x021d:
            r6 = r4
            goto L_0x0223
        L_0x021f:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r6 = r0
        L_0x0223:
            android.app.Notification r0 = r15.f4272G
            r0.icon = r6
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r9.w(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0239
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r9.w(r0)
        L_0x0239:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0241
            r0 = 0
            goto L_0x0270
        L_0x0241:
            java.lang.String r4 = "default"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x026c
            java.lang.String r4 = "raw"
            int r4 = r13.getIdentifier(r0, r4, r12)
            if (r4 == 0) goto L_0x026c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "android.resource://"
            r4.<init>(r6)
            r4.append(r12)
            java.lang.String r6 = "/raw/"
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0270
        L_0x026c:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r2)
        L_0x0270:
            if (r0 == 0) goto L_0x0275
            r15.e(r0)
        L_0x0275:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r9.w(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x028f
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r12)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r0)
            goto L_0x02c8
        L_0x028f:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r9.w(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x02a1
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r9.w(r0)
        L_0x02a1:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x02ac
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x02ad
        L_0x02ac:
            r0 = 0
        L_0x02ad:
            if (r0 == 0) goto L_0x02bd
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r4.<init>(r6)
            r4.setPackage(r12)
            r4.setData(r0)
            goto L_0x02c8
        L_0x02bd:
            android.content.Intent r4 = r14.getLaunchIntentForPackage(r12)
            if (r4 != 0) goto L_0x02c8
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r7, r0)
        L_0x02c8:
            java.util.concurrent.atomic.AtomicInteger r0 = s1.C0444e.f4555a
            r6 = 1140850688(0x44000000, float:512.0)
            java.lang.String r10 = "google.c.a.e"
            if (r4 != 0) goto L_0x02d2
            r2 = 0
            goto L_0x032b
        L_0x02d2:
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r12)
            android.os.Bundle r12 = new android.os.Bundle
            java.lang.Object r13 = r9.f2743g
            android.os.Bundle r13 = (android.os.Bundle) r13
            r12.<init>(r13)
            java.util.Set r13 = r13.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x02e8:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0311
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r2 = "google.c."
            boolean r2 = r14.startsWith(r2)
            if (r2 != 0) goto L_0x030c
            java.lang.String r2 = "gcm.n."
            boolean r2 = r14.startsWith(r2)
            if (r2 != 0) goto L_0x030c
            java.lang.String r2 = "gcm.notification."
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x030f
        L_0x030c:
            r12.remove(r14)
        L_0x030f:
            r2 = 2
            goto L_0x02e8
        L_0x0311:
            r4.putExtras(r12)
            boolean r2 = r9.j(r10)
            if (r2 == 0) goto L_0x0323
            android.os.Bundle r2 = r9.D()
            java.lang.String r12 = "gcm.n.analytics_data"
            r4.putExtra(r12, r2)
        L_0x0323:
            int r2 = r0.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r8, r2, r4, r6)
        L_0x032b:
            r15.f4281g = r2
            boolean r2 = r9.j(r10)
            if (r2 != 0) goto L_0x0335
            r0 = 0
            goto L_0x0361
        L_0x0335:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r4)
            android.os.Bundle r4 = r9.D()
            android.content.Intent r2 = r2.putExtras(r4)
            int r0 = r0.incrementAndGet()
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r10 = "com.google.android.c2dm.intent.RECEIVE"
            r4.<init>(r10)
            java.lang.String r10 = r8.getPackageName()
            android.content.Intent r4 = r4.setPackage(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r2 = r4.putExtra(r10, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r8, r0, r2, r6)
        L_0x0361:
            if (r0 == 0) goto L_0x0367
            android.app.Notification r2 = r15.f4272G
            r2.deleteIntent = r0
        L_0x0367:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r9.w(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0392
            int r2 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x037c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x037c }
            goto L_0x03a9
        L_0x037c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Color is invalid: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r7, r0)
        L_0x0392:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r11.getInt(r0, r3)
            if (r0 == 0) goto L_0x03a8
            int r0 = r.C0409b.a(r8, r0)     // Catch:{ NotFoundException -> 0x03a3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x03a3 }
            goto L_0x03a9
        L_0x03a3:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r7, r0)
        L_0x03a8:
            r0 = 0
        L_0x03a9:
            if (r0 == 0) goto L_0x03b1
            int r0 = r0.intValue()
            r15.f4299z = r0
        L_0x03b1:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r9.j(r0)
            r2 = 1
            r0 = r0 ^ r2
            r2 = 16
            r15.c(r2, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r9.j(r0)
            r15.f4295u = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r9.w(r0)
            if (r0 == 0) goto L_0x03d6
            android.app.Notification r2 = r15.f4272G
            java.lang.CharSequence r0 = q.C0386p.b(r0)
            r2.tickerText = r0
        L_0x03d6:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r9.n(r0)
            r2 = -2
            if (r0 != 0) goto L_0x03e1
        L_0x03df:
            r0 = 0
            goto L_0x0405
        L_0x03e1:
            int r4 = r0.intValue()
            if (r4 < r2) goto L_0x03ee
            int r4 = r0.intValue()
            r6 = 2
            if (r4 <= r6) goto L_0x0405
        L_0x03ee:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "notificationPriority is invalid "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r7, r0)
            goto L_0x03df
        L_0x0405:
            if (r0 == 0) goto L_0x040d
            int r0 = r0.intValue()
            r15.f4285k = r0
        L_0x040d:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r9.n(r0)
            if (r0 != 0) goto L_0x0417
        L_0x0415:
            r0 = 0
            goto L_0x043e
        L_0x0417:
            int r4 = r0.intValue()
            r6 = -1
            if (r4 < r6) goto L_0x0425
            int r4 = r0.intValue()
            r6 = 1
            if (r4 <= r6) goto L_0x043e
        L_0x0425:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "visibility is invalid: "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting visibility."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "NotificationParams"
            android.util.Log.w(r4, r0)
            goto L_0x0415
        L_0x043e:
            if (r0 == 0) goto L_0x0446
            int r0 = r0.intValue()
            r15.f4266A = r0
        L_0x0446:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r9.n(r0)
            if (r0 != 0) goto L_0x0450
        L_0x044e:
            r0 = 0
            goto L_0x046d
        L_0x0450:
            int r4 = r0.intValue()
            if (r4 >= 0) goto L_0x046d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "notificationCount is invalid: "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting notificationCount."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r7, r0)
            goto L_0x044e
        L_0x046d:
            if (r0 == 0) goto L_0x0475
            int r0 = r0.intValue()
            r15.f4284j = r0
        L_0x0475:
            java.lang.Long r0 = r9.t()
            if (r0 == 0) goto L_0x0486
            r4 = 1
            r15.f4286l = r4
            long r10 = r0.longValue()
            android.app.Notification r0 = r15.f4272G
            r0.when = r10
        L_0x0486:
            long[] r0 = r9.x()
            if (r0 == 0) goto L_0x0490
            android.app.Notification r4 = r15.f4272G
            r4.vibrate = r0
        L_0x0490:
            int[] r0 = r9.p()
            if (r0 == 0) goto L_0x04b3
            r4 = r0[r3]
            r6 = 1
            r8 = r0[r6]
            r6 = 2
            r0 = r0[r6]
            android.app.Notification r6 = r15.f4272G
            r6.ledARGB = r4
            r6.ledOnMS = r8
            r6.ledOffMS = r0
            if (r8 == 0) goto L_0x04ac
            if (r0 == 0) goto L_0x04ac
            r0 = 1
            goto L_0x04ad
        L_0x04ac:
            r0 = r3
        L_0x04ad:
            int r4 = r6.flags
            r2 = r2 & r4
            r0 = r0 | r2
            r6.flags = r0
        L_0x04b3:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r9.j(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r9.j(r2)
            if (r2 == 0) goto L_0x04c3
            r2 = 2
            r0 = r0 | r2
        L_0x04c3:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r9.j(r2)
            if (r2 == 0) goto L_0x04cd
            r0 = r0 | 4
        L_0x04cd:
            android.app.Notification r2 = r15.f4272G
            r2.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L_0x04db
            int r0 = r2.flags
            r4 = 1
            r0 = r0 | r4
            r2.flags = r0
        L_0x04db:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r9.w(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x04e9
        L_0x04e7:
            r2 = r0
            goto L_0x04fc
        L_0x04e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r8 = android.os.SystemClock.uptimeMillis()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            goto L_0x04e7
        L_0x04fc:
            if (r5 != 0) goto L_0x04ff
            goto L_0x055a
        L_0x04ff:
            W0.p r0 = r5.f4588h     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            G0.o.e(r0)     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r8 = 5
            java.lang.Object r0 = android.support.v4.media.session.a.e(r0, r8, r4)     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r15.d(r0)     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            q.m r4 = new q.m     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r4.<init>()     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            if (r0 != 0) goto L_0x051a
            r0 = 0
            goto L_0x051e
        L_0x051a:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.d(r0)     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
        L_0x051e:
            r4.f4260e = r0     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r6 = 0
            r4.f4261f = r6     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r6 = 1
            r4.f4262g = r6     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            r15.f(r4)     // Catch:{ ExecutionException -> 0x052a, InterruptedException -> 0x0535, TimeoutException -> 0x052c }
            goto L_0x055a
        L_0x052a:
            r0 = move-exception
            goto L_0x0545
        L_0x052c:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r7, r0)
            r5.close()
            goto L_0x055a
        L_0x0535:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r7, r0)
            r5.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x055a
        L_0x0545:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to download image: "
            r4.<init>(r5)
            java.lang.Throwable r0 = r0.getCause()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r7, r0)
        L_0x055a:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L_0x0566
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r7, r0)
        L_0x0566:
            java.lang.Object r0 = r1.f127g
            com.google.firebase.messaging.FirebaseMessagingService r0 = (com.google.firebase.messaging.FirebaseMessagingService) r0
            java.lang.String r4 = "notification"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r4 = r15.a()
            r0.notify(r2, r3, r4)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.N():boolean");
    }

    public void Q(KeyEvent keyEvent) {
        io.flutter.plugin.editing.d dVar;
        S1.o oVar = (S1.o) this.f129i;
        if (oVar != null) {
            j jVar = oVar.f1495p;
            boolean z3 = false;
            if (jVar.f3357b.isAcceptingText() && (dVar = jVar.f3365j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z3 = dVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z3 = dVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z3 = dVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z3 = dVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = dVar.f3321e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            dVar.performEditorAction(editorInfo.imeOptions & 255);
                            z3 = true;
                        }
                    }
                    io.flutter.plugin.editing.g gVar = dVar.f3320d;
                    int selectionStart = Selection.getSelectionStart(gVar);
                    int selectionEnd = Selection.getSelectionEnd(gVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        dVar.beginBatchEdit();
                        if (min != max) {
                            gVar.delete(min, max);
                        }
                        gVar.insert(min, String.valueOf((char) unicodeChar));
                        int i3 = min + 1;
                        dVar.setSelection(i3, i3);
                        dVar.endBatchEdit();
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                HashSet hashSet = (HashSet) this.f127g;
                hashSet.add(keyEvent);
                oVar.getRootView().dispatchKeyEvent(keyEvent);
                if (hashSet.remove(keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }

    public void R(Activity activity, C0148j jVar) {
        i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f127g;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f129i;
        try {
            if (!jVar.equals((C0148j) weakHashMap.get(activity))) {
                C0148j jVar2 = (C0148j) weakHashMap.put(activity, jVar);
                reentrantLock.unlock();
                Iterator it = ((C0179k) ((C0152a) this.f128h).f2912g).f2979b.iterator();
                while (it.hasNext()) {
                    C0178j jVar3 = (C0178j) it.next();
                    if (jVar3.f2973a.equals(activity)) {
                        jVar3.f2975c = jVar;
                        jVar3.f2974b.accept(jVar);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean S(java.lang.String r11, java.lang.Boolean r12, l2.C0318e r13, l2.C0314a r14) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r10.f129i
            S1.d r2 = (S1.C0078d) r2
            if (r2 == 0) goto L_0x0133
            java.util.Map r2 = r13.f4013c
            android.os.Bundle r2 = F(r2)
            boolean r12 = r12.booleanValue()
            java.lang.String r3 = "com.android.browser.headers"
            if (r12 == 0) goto L_0x00f7
            java.util.Map r12 = r13.f4013c
            java.util.Set r12 = r12.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0020:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r12.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1423461112: goto L_0x005f;
                case -1229727188: goto L_0x0054;
                case 785670158: goto L_0x0049;
                case 802785917: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0069
        L_0x003e:
            java.lang.String r6 = "accept-language"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0047
            goto L_0x0069
        L_0x0047:
            r5 = 3
            goto L_0x0069
        L_0x0049:
            java.lang.String r6 = "content-type"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0052
            goto L_0x0069
        L_0x0052:
            r5 = 2
            goto L_0x0069
        L_0x0054:
            java.lang.String r6 = "content-language"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x005d
            goto L_0x0069
        L_0x005d:
            r5 = r0
            goto L_0x0069
        L_0x005f:
            java.lang.String r6 = "accept"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r5 = r1
        L_0x0069:
            switch(r5) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0020;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x00f7
        L_0x006e:
            android.net.Uri r12 = android.net.Uri.parse(r11)
            java.lang.Object r4 = r10.f129i
            S1.d r4 = (S1.C0078d) r4
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            java.lang.Boolean r14 = r14.f4006a
            boolean r14 = r14.booleanValue()
            java.lang.String r6 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r5.putExtra(r6, r14)
            java.lang.String r14 = "android.support.customtabs.extra.SESSION"
            boolean r6 = r5.hasExtra(r14)
            r7 = 0
            if (r6 != 0) goto L_0x009c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putBinder(r14, r7)
            r5.putExtras(r6)
        L_0x009c:
            java.lang.String r14 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r5.putExtra(r14, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            r5.putExtras(r14)
            java.lang.String r14 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r5.putExtra(r14, r1)
            int r14 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = m.C0325b.a()
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x00d8
            boolean r6 = r5.hasExtra(r3)
            if (r6 == 0) goto L_0x00c5
            android.os.Bundle r6 = r5.getBundleExtra(r3)
            goto L_0x00ca
        L_0x00c5:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L_0x00ca:
            java.lang.String r8 = "Accept-Language"
            boolean r9 = r6.containsKey(r8)
            if (r9 != 0) goto L_0x00d8
            r6.putString(r8, r0)
            r5.putExtra(r3, r6)
        L_0x00d8:
            r0 = 34
            if (r14 < r0) goto L_0x00e4
            android.app.ActivityOptions r14 = m.C0324a.a()
            m.C0326c.a(r14, r1)
            goto L_0x00e5
        L_0x00e4:
            r14 = r7
        L_0x00e5:
            if (r14 == 0) goto L_0x00eb
            android.os.Bundle r7 = r14.toBundle()
        L_0x00eb:
            r5.putExtra(r3, r2)
            r5.setData(r12)     // Catch:{ ActivityNotFoundException -> 0x00f7 }
            r4.startActivity(r5, r7)     // Catch:{ ActivityNotFoundException -> 0x00f7 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        L_0x00f7:
            java.lang.Object r12 = r10.f129i
            S1.d r12 = (S1.C0078d) r12
            java.lang.Boolean r14 = r13.f4011a
            boolean r14 = r14.booleanValue()
            java.lang.Boolean r13 = r13.f4012b
            boolean r13 = r13.booleanValue()
            int r0 = io.flutter.plugins.urllauncher.WebViewActivity.f3436j
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<io.flutter.plugins.urllauncher.WebViewActivity> r1 = io.flutter.plugins.urllauncher.WebViewActivity.class
            r0.<init>(r12, r1)
            java.lang.String r12 = "url"
            android.content.Intent r11 = r0.putExtra(r12, r11)
            java.lang.String r12 = "enableJavaScript"
            android.content.Intent r11 = r11.putExtra(r12, r14)
            java.lang.String r12 = "enableDomStorage"
            android.content.Intent r11 = r11.putExtra(r12, r13)
            android.content.Intent r11 = r11.putExtra(r3, r2)
            java.lang.Object r12 = r10.f129i     // Catch:{ ActivityNotFoundException -> 0x0130 }
            S1.d r12 = (S1.C0078d) r12     // Catch:{ ActivityNotFoundException -> 0x0130 }
            r12.startActivity(r11)     // Catch:{ ActivityNotFoundException -> 0x0130 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        L_0x0130:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x0133:
            l2.b r11 = new l2.b
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.S(java.lang.String, java.lang.Boolean, l2.e, l2.a):java.lang.Boolean");
    }

    public void T() {
        ((TypedArray) this.f127g).recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r4 = r3.f360a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r4 >= r6.length) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r6[r4] = r2;
        r3.f360a = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r2 = r8.get(r1)
            T.a r2 = (T.C0080a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f128h
            F0.y r3 = (F0.y) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            A2.i.e(r2, r4)
            int r4 = r3.f360a
            r5 = 0
        L_0x001f:
            java.lang.Object r6 = r3.f361b
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L_0x0034
            r6 = r6[r5]
            if (r6 == r2) goto L_0x002c
            int r5 = r5 + 1
            goto L_0x001f
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            int r4 = r3.f360a
            int r5 = r6.length
            if (r4 >= r5) goto L_0x003f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f360a = r4
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0042:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.U(java.util.ArrayList):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [T1.d, java.lang.Object] */
    public void V(C0353a aVar) {
        C0002c cVar = new C0002c(0);
        r0.i iVar = (r0.i) this.f128h;
        C0355c cVar2 = (C0355c) this.f127g;
        r0.o oVar = (r0.o) this.f129i;
        C0356d dVar = C0356d.f4142f;
        f a2 = r0.i.a();
        a2.W(iVar.f4426a);
        a2.f129i = dVar;
        a2.f128h = iVar.f4427b;
        r0.i u3 = a2.u();
        ? obj = new Object();
        obj.f1708f = new HashMap();
        obj.f1706d = Long.valueOf(oVar.f4443a.c());
        obj.f1707e = Long.valueOf(oVar.f4444b.c());
        obj.f1703a = "FCM_CLIENT_EVENT_LOGGING";
        C0482e eVar = aVar.f4138a;
        f fVar = C0459t.f4594a;
        fVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fVar.C(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        obj.f1705c = new k(cVar2, byteArrayOutputStream.toByteArray());
        obj.f1704b = null;
        r0.h j3 = obj.j();
        C0500a aVar2 = (C0500a) oVar.f4445c;
        aVar2.getClass();
        aVar2.f4724b.execute(new C0187a(aVar2, u3, cVar, j3, 1));
    }

    public void W(String str) {
        if (str != null) {
            this.f127g = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void X(c2.h hVar) {
        f fVar;
        if (hVar == null) {
            fVar = null;
        } else {
            fVar = new f(this, hVar);
        }
        ((c2.f) this.f128h).q((String) this.f127g, fVar);
    }

    public void Z(long j3, C0496c cVar) {
        if (((T1.c) this.f129i) != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new C0220a(this, (W1.f) O().f128h, handler, cVar, j3));
    }

    public void a(String str, String str2, C0292g gVar) {
        x(gVar).edit().putString(str, str2).apply();
    }

    public Boolean a0() {
        ArrayList arrayList;
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f128h).getPackageManager();
        if (emptyList == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = emptyList;
        }
        boolean z3 = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        if (str != null) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    public C0285M b(String str, C0292g gVar) {
        SharedPreferences x2 = x(gVar);
        if (!x2.contains(str)) {
            return null;
        }
        String string = x2.getString(str, "");
        i.b(string);
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new C0285M(string, C0283K.JSON_ENCODED);
        }
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            return new C0285M((String) null, C0283K.PLATFORM_ENCODED);
        }
        return new C0285M((String) null, C0283K.UNEXPECTED_STRING);
    }

    public void c(String str, long j3, C0292g gVar) {
        x(gVar).edit().putLong(str, j3).apply();
    }

    public void e(String str, List list, C0292g gVar) {
        x(gVar).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((G0.f) this.f129i).a(list))).apply();
    }

    public List f(List list, C0292g gVar) {
        Set set;
        Map<String, ?> all = x(gVar).getAll();
        i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            Object key = next.getKey();
            i.d(key, "<get-key>(...)");
            String str = (String) key;
            Object value = next.getValue();
            if (list != null) {
                set = C0401d.j0(list);
            } else {
                set = null;
            }
            if (C0282J.b(str, value, set)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return C0401d.h0(linkedHashMap.keySet());
    }

    public Object g(L2.e eVar, C0420d dVar) {
        Object g2 = ((d) this.f128h).g(new l(eVar, (M.e) this.f127g, (C0281I) this.f129i), dVar);
        if (g2 == C0466a.f4632f) {
            return g2;
        }
        return C0368h.f4194a;
    }

    public Object get() {
        switch (this.f126f) {
            case 24:
                return new r0.o(new G0.f(1), new D0.g(1, false), (C0501b) ((C0465z) this.f128h).get(), (x0.j) ((r0) this.f127g).get(), (x0.k) ((C0464y) this.f129i).get());
            default:
                return new C0512d((Context) ((C0152a) this.f128h).f2912g, (y0.d) ((o2.a) this.f127g).get(), (C0510b) ((D0.g) this.f129i).get());
        }
    }

    public void h(ByteBuffer byteBuffer, U1.g gVar) {
        f fVar = (f) this.f129i;
        String str = ((x) fVar.f129i).c(byteBuffer).f2785a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f127g;
        String str2 = (String) fVar.f127g;
        x xVar = (x) fVar.f129i;
        c2.h hVar = (c2.h) this.f128h;
        if (equals) {
            c2.g gVar2 = new c2.g(this);
            if (((c2.g) atomicReference.getAndSet(gVar2)) != null) {
                try {
                    hVar.r();
                } catch (RuntimeException e2) {
                    Log.e("EventChannel#" + str2, "Failed to close existing event stream", e2);
                }
            }
            try {
                hVar.m(gVar2);
                gVar.a(xVar.b((Object) null));
            } catch (RuntimeException e3) {
                atomicReference.set((Object) null);
                Log.e("EventChannel#" + str2, "Failed to open event stream", e3);
                gVar.a(xVar.f("error", e3.getMessage(), (Object) null));
            }
        } else if (!str.equals("cancel")) {
            gVar.a((ByteBuffer) null);
        } else if (((c2.g) atomicReference.getAndSet((Object) null)) != null) {
            try {
                hVar.r();
                gVar.a(xVar.b((Object) null));
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e4);
                gVar.a(xVar.f("error", e4.getMessage(), (Object) null));
            }
        } else {
            gVar.a(xVar.f("error", "No active stream to cancel", (Object) null));
        }
    }

    public String i(String str, C0292g gVar) {
        SharedPreferences x2 = x(gVar);
        if (x2.contains(str)) {
            return x2.getString(str, "");
        }
        return null;
    }

    public Boolean j(String str, C0292g gVar) {
        SharedPreferences x2 = x(gVar);
        if (x2.contains(str)) {
            return Boolean.valueOf(x2.getBoolean(str, true));
        }
        return null;
    }

    public Map k(List list, C0292g gVar) {
        Set set;
        Object value;
        Map<String, ?> all = x(gVar).getAll();
        i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value2 = next.getValue();
            if (list != null) {
                set = C0401d.j0(list);
            } else {
                set = null;
            }
            if (C0282J.b(str, value2, set) && (value = next.getValue()) != null) {
                Object key = next.getKey();
                Object c3 = C0282J.c(value, (G0.f) this.f129i);
                i.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c3);
            }
        }
        return hashMap;
    }

    public Double l(String str, C0292g gVar) {
        SharedPreferences x2 = x(gVar);
        if (!x2.contains(str)) {
            return null;
        }
        Object c3 = C0282J.c(x2.getString(str, ""), (G0.f) this.f129i);
        i.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    public Long m(String str, C0292g gVar) {
        long j3;
        SharedPreferences x2 = x(gVar);
        if (!x2.contains(str)) {
            return null;
        }
        try {
            j3 = x2.getLong(str, 0);
        } catch (ClassCastException unused) {
            j3 = (long) x2.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    public ArrayList n(String str, C0292g gVar) {
        List list;
        SharedPreferences x2 = x(gVar);
        ArrayList arrayList = null;
        if (x2.contains(str)) {
            String string = x2.getString(str, "");
            i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) C0282J.c(x2.getString(str, ""), (G0.f) this.f129i)) != null) {
                arrayList = new ArrayList();
                for (Object next : list) {
                    if (next instanceof String) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public void o(String str, boolean z3, C0292g gVar) {
        x(gVar).edit().putBoolean(str, z3).apply();
    }

    public void onMethodCall(c2.m mVar, p pVar) {
        if (mVar.f2785a.equals("MessagingBackground#initialized")) {
            ((AtomicBoolean) this.f128h).set(true);
            List list = FlutterFirebaseMessagingBackgroundService.f3426m;
            Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
            List<Intent> list2 = FlutterFirebaseMessagingBackgroundService.f3426m;
            synchronized (list2) {
                try {
                    for (Intent E3 : list2) {
                        FlutterFirebaseMessagingBackgroundService.f3427n.E(E3, (CountDownLatch) null);
                    }
                    FlutterFirebaseMessagingBackgroundService.f3426m.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            ((b2.f) pVar).b(Boolean.TRUE);
            return;
        }
        ((b2.f) pVar).c();
    }

    public void p(W0.h hVar) {
        b bVar = (b) this.f128h;
        String str = (String) this.f127g;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f129i;
        synchronized (bVar.f111a) {
            bVar.f111a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void q(String str, double d3, C0292g gVar) {
        SharedPreferences.Editor edit = x(gVar).edit();
        edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    public Object r() {
        try {
            return ((y1.d) this.f128h).i((Class) this.f127g);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.f129i) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
        }
    }

    public void s(String str, String str2, C0292g gVar) {
        x(gVar).edit().putString(str, str2).apply();
    }

    public void t(List list, C0292g gVar) {
        Set set;
        SharedPreferences x2 = x(gVar);
        SharedPreferences.Editor edit = x2.edit();
        i.d(edit, "edit(...)");
        Map<String, ?> all = x2.getAll();
        i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            Object obj = all.get(next);
            if (list != null) {
                set = C0401d.j0(list);
            } else {
                set = null;
            }
            if (C0282J.b(next, obj, set)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next2 = it.next();
            i.d(next2, "next(...)");
            edit.remove((String) next2);
        }
        edit.apply();
    }

    public String toString() {
        switch (this.f126f) {
            case L.k.LONG_FIELD_NUMBER /*4*/:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case L.k.BYTES_FIELD_NUMBER /*8*/:
                return ((C0081b) this.f127g).toString() + ", hidden list:" + ((ArrayList) this.f129i).size();
            case 9:
                StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
                sb2.append((String) this.f127g);
                sb2.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f129i;
                sb2.append(flutterCallbackInformation.callbackLibraryPath);
                sb2.append(", function: ");
                sb2.append(flutterCallbackInformation.callbackName);
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public r0.i u() {
        String str;
        if (((String) this.f127g) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((C0356d) this.f129i) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new r0.i((String) this.f127g, (byte[]) this.f128h, (C0356d) this.f129i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public Boolean v(String str) {
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((r) this.f127g).f1506g).getPackageManager());
        if (resolveActivity == null) {
            str2 = null;
        } else {
            str2 = resolveActivity.toShortString();
        }
        if (str2 == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(str2));
    }

    public void w(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f127g;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f129i).put(activity, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences x(C0292g gVar) {
        String str = gVar.f3916a;
        Context context = (Context) this.f127g;
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
            i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void y(boolean z3) {
        for (N.e eVar : ((N.h) this.f127g).a()) {
            if (eVar != null && z3) {
                eVar.f1147h.y(true);
            }
        }
    }

    public void z(boolean z3) {
        for (N.e eVar : ((N.h) this.f127g).a()) {
            if (eVar != null && z3) {
                eVar.f1147h.z(true);
            }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i3) {
        this.f126f = i3;
        this.f128h = obj;
        this.f127g = obj2;
        this.f129i = obj3;
    }

    public f(Set set, String str, String str2) {
        this.f126f = 2;
        T0.a aVar = T0.a.f1676a;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        Map emptyMap = Collections.emptyMap();
        this.f127g = str2;
        this.f129i = aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f128h = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public f(r0.i iVar, C0355c cVar, C0002c cVar2, r0.o oVar) {
        this.f126f = 23;
        this.f128h = iVar;
        this.f127g = cVar;
        this.f129i = oVar;
    }

    public f(B.m mVar) {
        this.f126f = 8;
        this.f128h = mVar;
        this.f127g = new C0081b();
        this.f129i = new ArrayList();
    }

    public f(c2.f fVar, String str) {
        this.f126f = 13;
        x xVar = x.f2798a;
        this.f128h = fVar;
        this.f127g = str;
        this.f129i = xVar;
    }

    public f(Context context) {
        this.f126f = 21;
        r rVar = new r(6, context);
        this.f128h = context;
        this.f127g = rVar;
    }

    public f(FirebaseMessagingService firebaseMessagingService, b2.h hVar, ExecutorService executorService) {
        this.f126f = 25;
        this.f128h = executorService;
        this.f127g = firebaseMessagingService;
        this.f129i = hVar;
    }

    public f(Context context, TypedArray typedArray) {
        this.f126f = 18;
        this.f128h = context;
        this.f127g = typedArray;
    }

    public f(D0.g gVar) {
        this.f126f = 7;
        this.f128h = new y(30);
        this.f127g = new ArrayList();
        this.f129i = new ArrayList();
        new e(7, this);
    }

    public f(U1.b bVar, FlutterJNI flutterJNI) {
        this.f126f = 10;
        B.m mVar = new B.m(21, (Object) this);
        C0464y yVar = new C0464y(bVar, "flutter/accessibility", c2.w.f2795a, (e) null);
        this.f128h = yVar;
        yVar.l(mVar);
        this.f127g = flutterJNI;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [N.h, java.lang.Object] */
    public f(int i3) {
        this.f126f = i3;
        switch (i3) {
            case 11:
                this.f128h = new ConcurrentLinkedQueue();
                return;
            case 16:
                this.f128h = new AtomicBoolean(false);
                return;
            default:
                this.f128h = new ArrayList();
                ? obj = new Object();
                obj.f1161a = new ArrayList();
                new HashMap();
                new HashMap();
                this.f127g = obj;
                new ArrayList();
                new D0.g(this);
                this.f129i = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new ArrayList();
                new e(this);
                new CopyOnWriteArrayList();
                new N.f(this, 0);
                new N.f(this, 1);
                new N.f(this, 2);
                new N.f(this, 3);
                new ArrayDeque();
                new e(5, (Object) this);
                return;
        }
    }

    public f(S1.o oVar) {
        this.f126f = 6;
        this.f127g = new HashSet();
        this.f129i = oVar;
        this.f128h = new w[]{new v(oVar.getBinaryMessenger()), new r(new F0.h(oVar.getBinaryMessenger()))};
        new B.m(oVar.getBinaryMessenger()).f100g = this;
    }

    public f(f fVar, c2.h hVar) {
        this.f126f = 12;
        this.f129i = fVar;
        this.f127g = new AtomicReference((Object) null);
        this.f128h = hVar;
    }

    public f(Class cls, Type type) {
        Object obj;
        this.f126f = 27;
        this.f127g = cls;
        this.f129i = type;
        Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
        Class<Class> cls3 = Class.class;
        try {
            Class<?> cls4 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls4.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = new n(cls4.getMethod("allocateInstance", new Class[]{cls3}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                obj = new y1.o(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls3, cls3});
                    declaredMethod3.setAccessible(true);
                    obj = new y1.p(declaredMethod3);
                } catch (Exception unused3) {
                    obj = new Object();
                }
            }
        }
        this.f128h = obj;
    }

    public f(c2.f fVar, Context context, G0.f fVar2) {
        this.f126f = 19;
        i.e(fVar, "messenger");
        i.e(context, "context");
        this.f128h = fVar;
        this.f127g = context;
        this.f129i = fVar2;
        try {
            C0291f.f3915e.getClass();
            C0290e.b(fVar, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public f(io.flutter.plugins.firebase.messaging.a aVar) {
        this.f126f = 17;
        this.f129i = aVar;
        this.f128h = Executors.newSingleThreadExecutor();
        this.f127g = new Handler(Looper.getMainLooper());
    }

    public f(C0152a aVar) {
        this.f126f = 14;
        this.f128h = aVar;
        this.f127g = new ReentrantLock();
        this.f129i = new WeakHashMap();
    }
}
