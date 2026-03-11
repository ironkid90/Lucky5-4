package C0;

import A2.i;
import G0.z;
import I0.b;
import L.j;
import L1.k;
import L2.d;
import S1.w;
import T.L;
import T.M;
import U2.m;
import U2.p;
import W0.a;
import W0.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.y;
import c2.C0134b;
import c2.C0135c;
import c2.C0136d;
import c2.f;
import c2.g;
import c2.h;
import c2.l;
import c2.o;
import c2.q;
import c2.x;
import com.ai9poker.app.R;
import d0.C0140b;
import d0.C0146h;
import j1.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;
import s1.C0464y;

public final class r implements a, c, d, o, w, h, U2.h, C0135c, C0146h, C0136d {

    /* renamed from: i  reason: collision with root package name */
    public static r f158i;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f159f;

    /* renamed from: g  reason: collision with root package name */
    public Object f160g;

    /* renamed from: h  reason: collision with root package name */
    public Object f161h;

    public /* synthetic */ r(int i3, Object obj, Object obj2) {
        this.f159f = i3;
        this.f160g = obj;
        this.f161h = obj2;
    }

    public static k A(r rVar, JSONObject jSONObject) {
        Integer num;
        int i3;
        Boolean bool;
        Integer num2;
        int i4;
        Integer num3;
        rVar.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            i3 = A2.h.a(jSONObject.getString("statusBarIconBrightness"));
        } else {
            i3 = 0;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            i4 = A2.h.a(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            i4 = 0;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new k(num, i3, bool, num2, i4, num3, bool2);
    }

    public static HashMap C(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0088, code lost:
        if (r2 != true) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int x(C0.r r11, org.json.JSONArray r12) {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L_0x0007:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L_0x006b
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = L.j.c(r5)
            int r7 = r5.length
            r8 = r11
        L_0x001a:
            if (r8 >= r7) goto L_0x005f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L_0x0035
            r10 = 2
            if (r9 == r10) goto L_0x0032
            r10 = 3
            if (r9 == r10) goto L_0x002f
            r10 = 4
            if (r9 != r10) goto L_0x002d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L_0x0037
        L_0x002d:
            r11 = 0
            throw r11
        L_0x002f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L_0x0037
        L_0x0032:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L_0x0037
        L_0x0035:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L_0x0037:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x005c
            int r3 = L.j.b(r9)
            if (r3 == 0) goto L_0x0054
            if (r3 == r6) goto L_0x0051
            if (r3 == r4) goto L_0x004e
            r4 = 3
            if (r3 == r4) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            r1 = r1 | 8
            goto L_0x0056
        L_0x004e:
            r1 = r1 | 2
            goto L_0x0056
        L_0x0051:
            r1 = r1 | 4
            goto L_0x0056
        L_0x0054:
            r1 = r1 | 1
        L_0x0056:
            if (r2 != 0) goto L_0x0059
            r2 = r1
        L_0x0059:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x005c:
            int r8 = r8 + 1
            goto L_0x001a
        L_0x005f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = A2.h.g(r12, r3)
            r11.<init>(r12)
            throw r11
        L_0x006b:
            if (r1 == 0) goto L_0x008c
            r12 = 8
            r0 = 9
            switch(r1) {
                case 2: goto L_0x008d;
                case 3: goto L_0x0084;
                case 4: goto L_0x0082;
                case 5: goto L_0x007f;
                case 6: goto L_0x0084;
                case 7: goto L_0x0084;
                case 8: goto L_0x007d;
                case 9: goto L_0x0084;
                case 10: goto L_0x007a;
                case 11: goto L_0x0078;
                case 12: goto L_0x0084;
                case 13: goto L_0x0084;
                case 14: goto L_0x0084;
                case 15: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x008a
        L_0x0075:
            r11 = 13
            goto L_0x008d
        L_0x0078:
            r11 = r4
            goto L_0x008d
        L_0x007a:
            r11 = 11
            goto L_0x008d
        L_0x007d:
            r11 = r12
            goto L_0x008d
        L_0x007f:
            r11 = 12
            goto L_0x008d
        L_0x0082:
            r11 = r0
            goto L_0x008d
        L_0x0084:
            if (r2 == r4) goto L_0x008d
            if (r2 == r5) goto L_0x0082
            if (r2 == r12) goto L_0x007d
        L_0x008a:
            r11 = r6
            goto L_0x008d
        L_0x008c:
            r11 = -1
        L_0x008d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.r.x(C0.r, org.json.JSONArray):int");
    }

    public static ArrayList y(r rVar, JSONArray jSONArray) {
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            String string = jSONArray.getString(i3);
            b2.c[] values = b2.c.values();
            int length = values.length;
            int i4 = 0;
            while (i4 < length) {
                b2.c cVar = values[i4];
                if (cVar.f2712f.equals(string)) {
                    int ordinal = cVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(b2.c.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(b2.c.BOTTOM_OVERLAYS);
                    }
                    i3++;
                } else {
                    i4++;
                }
            }
            throw new NoSuchFieldException(A2.h.g("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int z(r rVar, String str) {
        String str2;
        rVar.getClass();
        for (int i3 : j.c(4)) {
            if (i3 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i3 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i3 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else if (i3 == 4) {
                str2 = "SystemUiMode.edgeToEdge";
            } else {
                throw null;
            }
            if (str2.equals(str)) {
                int b3 = j.b(i3);
                if (b3 == 0) {
                    return 1;
                }
                if (b3 == 1) {
                    return 2;
                }
                if (b3 != 2) {
                    return 4;
                }
                return 3;
            }
        }
        throw new NoSuchFieldException(A2.h.g("No such SystemUiMode: ", str));
    }

    public void B(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f160g).add(str + "=" + valueOf);
    }

    public void D(T2.a aVar) {
        AudioAttributes a2 = aVar.a();
        HashMap hashMap = (HashMap) this.f161h;
        if (!hashMap.containsKey(a2)) {
            SoundPool build = new SoundPool.Builder().setAudioAttributes(a2).setMaxStreams(32).build();
            ((T2.d) this.f160g).b("Create SoundPool with " + a2);
            i.b(build);
            m mVar = new m(build);
            build.setOnLoadCompleteListener(new U2.i(this, mVar));
            hashMap.put(a2, mVar);
        }
    }

    public void E() {
        g gVar = (g) this.f161h;
        if (gVar != null) {
            if (!gVar.f2779a.getAndSet(true)) {
                f fVar = gVar.f2780b;
                if (((AtomicReference) fVar.f127g).get() == gVar) {
                    f fVar2 = (f) fVar.f129i;
                    ((f) fVar2.f128h).b((String) fVar2.f127g, (ByteBuffer) null);
                }
            }
            this.f161h = null;
        }
        ((f) this.f160g).X((h) null);
    }

    public void F(String str, String str2, String str3) {
        g gVar = (g) this.f161h;
        if (gVar != null && !gVar.f2779a.get()) {
            f fVar = gVar.f2780b;
            if (((AtomicReference) fVar.f127g).get() == gVar) {
                f fVar2 = (f) fVar.f129i;
                ((f) fVar2.f128h).b((String) fVar2.f127g, ((x) fVar2.f129i).f(str, str2, str3));
            }
        }
    }

    public View G(int i3, int i4, int i5, int i6) {
        int i7;
        M m3 = (M) this.f160g;
        int i8 = m3.i();
        int f3 = m3.f();
        if (i4 > i3) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        View view = null;
        while (i3 != i4) {
            View c3 = m3.c(i3);
            int n3 = m3.n(c3);
            int k3 = m3.k(c3);
            L l3 = (L) this.f161h;
            l3.f1587b = i8;
            l3.f1588c = f3;
            l3.f1589d = n3;
            l3.f1590e = k3;
            if (i5 != 0) {
                l3.f1586a = i5;
                if (l3.a()) {
                    return c3;
                }
            }
            if (i6 != 0) {
                l3.f1586a = i6;
                if (l3.a()) {
                    view = c3;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public y H(Class cls, String str) {
        i.e(str, "key");
        throw null;
    }

    public String I(String str) {
        Resources resources = (Resources) this.f160g;
        int identifier = resources.getIdentifier(str, "string", (String) this.f161h);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void J(String str, Map map) {
        Map map2;
        i.e(map, "arguments");
        g gVar = (g) this.f161h;
        if (gVar != null) {
            if (map.isEmpty()) {
                map2 = Collections.singletonMap("event", str);
                i.d(map2, "singletonMap(...)");
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("event", str);
                map2 = linkedHashMap;
            }
            gVar.a(map2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(boolean r5, com.google.android.gms.common.api.Status r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f160g
            java.util.Map r0 = (java.util.Map) r0
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r4.f160g     // Catch:{ all -> 0x0084 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0084 }
            r1.<init>(r2)     // Catch:{ all -> 0x0084 }
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r4.f161h
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0081 }
            java.lang.Object r3 = r4.f161h     // Catch:{ all -> 0x0081 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0081 }
            r0.<init>(r3)     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 != 0) goto L_0x0042
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0042
            goto L_0x0027
        L_0x0042:
            java.lang.Object r5 = r2.getKey()
            r5.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L_0x004f:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r5 != 0) goto L_0x0071
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0057
        L_0x0071:
            java.lang.Object r1 = r1.getKey()
            W0.i r1 = (W0.i) r1
            H1.a r2 = new H1.a
            r2.<init>((com.google.android.gms.common.api.Status) r6)
            r1.c(r2)
            goto L_0x0057
        L_0x0080:
            return
        L_0x0081:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            throw r5
        L_0x0084:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.r.K(boolean, com.google.android.gms.common.api.Status):void");
    }

    public void a() {
        ((MediaPlayer) this.f161h).pause();
    }

    public void b() {
        l(((p) this.f160g).f1841i);
    }

    public void c(boolean z3) {
        ((MediaPlayer) this.f161h).setLooping(z3);
    }

    public void e() {
        ((MediaPlayer) this.f161h).stop();
    }

    public void f(KeyEvent keyEvent, z zVar) {
        String str;
        int action = keyEvent.getAction();
        boolean z3 = true;
        if (action == 0 || action == 1) {
            Character a2 = ((P2.i) this.f161h).a(keyEvent.getUnicodeChar());
            if (action == 0) {
                z3 = false;
            }
            S1.r rVar = new S1.r(0, zVar);
            F0.h hVar = (F0.h) this.f160g;
            HashMap hashMap = new HashMap();
            if (z3) {
                str = "keyup";
            } else {
                str = "keydown";
            }
            hashMap.put("type", str);
            hashMap.put("keymap", "android");
            hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
            hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
            hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
            hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
            hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
            hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
            hashMap.put("character", a2.toString());
            hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
            hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
            hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
            ((C0464y) hVar.f322g).k(hashMap, new S1.r(2, rVar));
            return;
        }
        zVar.a(false);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, A2.n] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(L2.e r7, r2.C0420d r8) {
        /*
            r6 = this;
            int r0 = r6.f159f
            switch(r0) {
                case 9: goto L_0x007b;
                case 10: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r8 instanceof L2.m
            if (r0 == 0) goto L_0x0018
            r0 = r8
            L2.m r0 = (L2.m) r0
            int r1 = r0.f1043j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f1043j = r1
            goto L_0x001d
        L_0x0018:
            L2.m r0 = new L2.m
            r0.<init>(r6, r8)
        L_0x001d:
            java.lang.Object r8 = r0.f1042i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1043j
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            k2.m r7 = r0.f1045l
            M0.a.V(r8)     // Catch:{ a -> 0x002e }
            goto L_0x0059
        L_0x002e:
            r8 = move-exception
            goto L_0x0055
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            M0.a.V(r8)
            java.lang.Object r8 = r6.f160g
            C0.r r8 = (C0.r) r8
            k2.m r2 = new k2.m
            java.lang.Object r4 = r6.f161h
            I.o r4 = (I.C0039o) r4
            r2.<init>(r4, r7)
            r0.f1045l = r2     // Catch:{ a -> 0x0053 }
            r0.f1043j = r3     // Catch:{ a -> 0x0053 }
            java.lang.Object r7 = r8.g(r2, r0)     // Catch:{ a -> 0x0053 }
            if (r7 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0053:
            r8 = move-exception
            r7 = r2
        L_0x0055:
            L2.e r0 = r8.f1098f
            if (r0 != r7) goto L_0x005c
        L_0x0059:
            p2.h r1 = p2.C0368h.f4194a
        L_0x005b:
            return r1
        L_0x005c:
            throw r8
        L_0x005d:
            A2.n r0 = new A2.n
            r0.<init>()
            L2.l r1 = new L2.l
            java.lang.Object r2 = r6.f161h
            I.p r2 = (I.C0040p) r2
            r1.<init>((A2.n) r0, (L2.e) r7, (I.C0040p) r2)
            java.lang.Object r7 = r6.f160g
            C0.r r7 = (C0.r) r7
            java.lang.Object r7 = r7.g(r1, r8)
            s2.a r8 = s2.C0466a.f4632f
            if (r7 != r8) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            p2.h r7 = p2.C0368h.f4194a
        L_0x007a:
            return r7
        L_0x007b:
            boolean r0 = r8 instanceof L2.j
            if (r0 == 0) goto L_0x008e
            r0 = r8
            L2.j r0 = (L2.j) r0
            int r1 = r0.f1028j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x008e
            int r1 = r1 - r2
            r0.f1028j = r1
            goto L_0x0093
        L_0x008e:
            L2.j r0 = new L2.j
            r0.<init>(r6, r8)
        L_0x0093:
            java.lang.Object r8 = r0.f1027i
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f1028j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00bb
            if (r2 == r4) goto L_0x00af
            if (r2 != r3) goto L_0x00a7
            M0.a.V(r8)
            p2.h r1 = p2.C0368h.f4194a
            goto L_0x00f1
        L_0x00a7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x00af:
            M2.n r7 = r0.f1032n
            L2.e r2 = r0.f1031m
            C0.r r4 = r0.f1030l
            M0.a.V(r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x00de
        L_0x00b9:
            r8 = move-exception
            goto L_0x00f6
        L_0x00bb:
            M0.a.V(r8)
            M2.n r8 = new M2.n
            r2.i r2 = r0.f4684g
            A2.i.b(r2)
            r8.<init>(r7, r2)
            java.lang.Object r2 = r6.f160g     // Catch:{ all -> 0x00f2 }
            I.n r2 = (I.C0038n) r2     // Catch:{ all -> 0x00f2 }
            r0.f1030l = r6     // Catch:{ all -> 0x00f2 }
            r0.f1031m = r7     // Catch:{ all -> 0x00f2 }
            r0.f1032n = r8     // Catch:{ all -> 0x00f2 }
            r0.f1028j = r4     // Catch:{ all -> 0x00f2 }
            java.lang.Object r2 = r2.i(r8, r0)     // Catch:{ all -> 0x00f2 }
            if (r2 != r1) goto L_0x00db
            goto L_0x00f1
        L_0x00db:
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x00de:
            r7.n()
            java.lang.Object r7 = r4.f161h
            L2.s r7 = (L2.s) r7
            r8 = 0
            r0.f1030l = r8
            r0.f1031m = r8
            r0.f1032n = r8
            r0.f1028j = r3
            r7.g(r2, r0)
        L_0x00f1:
            return r1
        L_0x00f2:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00f6:
            r7.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.r.g(L2.e, r2.d):java.lang.Object");
    }

    public void h(ByteBuffer byteBuffer, U1.g gVar) {
        C0464y yVar = (C0464y) this.f161h;
        try {
            ((C0134b) this.f160g).j(((l) yVar.f4624h).a(byteBuffer), new r(this, gVar, 28, false));
        } catch (RuntimeException e2) {
            Log.e("BasicMessageChannel#" + ((String) yVar.f4622f), "Failed to handle message", e2);
            gVar.a((ByteBuffer) null);
        }
    }

    public Integer i() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f161h).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    public boolean j() {
        Integer i3 = i();
        if (i3 == null || i3.intValue() == 0) {
            return true;
        }
        return false;
    }

    public void k(V2.c cVar) {
        i.e(cVar, "source");
        w();
        cVar.b((MediaPlayer) this.f161h);
    }

    public void l(float f3) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f161h;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f3));
    }

    public void m(g gVar) {
        this.f161h = gVar;
    }

    public void n(int i3) {
        ((MediaPlayer) this.f161h).seekTo(i3);
    }

    public Object o(W0.h hVar) {
        Bundle bundle;
        b bVar = (b) this.f160g;
        bVar.getClass();
        if (hVar.e() && (bundle = (Bundle) hVar.c()) != null && bundle.containsKey("google.messenger")) {
            return bVar.a((Bundle) this.f161h).j(j.f133h, d.f121i);
        }
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0119, code lost:
        if (r3.startsWith("generic") == false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d2 A[LOOP:1: B:52:0x01cc->B:54:0x01d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x023d A[SYNTHETIC, Splitter:B:57:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(c2.m r12, c2.p r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            int r2 = r11.f159f
            switch(r2) {
                case 12: goto L_0x005b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r11.f161h
            B.m r0 = (B.m) r0
            java.lang.Object r2 = r0.f100g
            C0.f r2 = (C0.f) r2
            if (r2 != 0) goto L_0x001b
            java.lang.Object r12 = r11.f160g
            java.util.Map r12 = (java.util.Map) r12
            b2.f r13 = (b2.f) r13
            r13.b(r12)
            goto L_0x005a
        L_0x001b:
            java.lang.String r12 = r12.f2785a
            r12.getClass()
            java.lang.String r2 = "getKeyboardState"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x002e
            b2.f r13 = (b2.f) r13
            r13.c()
            goto L_0x005a
        L_0x002e:
            java.lang.Object r12 = r0.f100g     // Catch:{ IllegalStateException -> 0x0043 }
            C0.f r12 = (C0.f) r12     // Catch:{ IllegalStateException -> 0x0043 }
            java.lang.Object r12 = r12.f128h     // Catch:{ IllegalStateException -> 0x0043 }
            S1.w[] r12 = (S1.w[]) r12     // Catch:{ IllegalStateException -> 0x0043 }
            r12 = r12[r1]     // Catch:{ IllegalStateException -> 0x0043 }
            S1.v r12 = (S1.v) r12     // Catch:{ IllegalStateException -> 0x0043 }
            java.util.HashMap r12 = r12.f1521g     // Catch:{ IllegalStateException -> 0x0043 }
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r12)     // Catch:{ IllegalStateException -> 0x0043 }
            r11.f160g = r12     // Catch:{ IllegalStateException -> 0x0043 }
            goto L_0x0051
        L_0x0043:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r0 = "error"
            r1 = r13
            b2.f r1 = (b2.f) r1
            r2 = 0
            r1.a(r0, r12, r2)
        L_0x0051:
            java.lang.Object r12 = r11.f160g
            java.util.Map r12 = (java.util.Map) r12
            b2.f r13 = (b2.f) r13
            r13.b(r12)
        L_0x005a:
            return
        L_0x005b:
            java.lang.String r2 = "call"
            A2.i.e(r12, r2)
            java.lang.String r12 = r12.f2785a
            java.lang.String r2 = "getDeviceInfo"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0250
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r2 = "board"
            java.lang.String r3 = android.os.Build.BOARD
            r12.put(r2, r3)
            java.lang.String r2 = "bootloader"
            java.lang.String r3 = android.os.Build.BOOTLOADER
            r12.put(r2, r3)
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "brand"
            r12.put(r3, r2)
            java.lang.String r3 = android.os.Build.DEVICE
            java.lang.String r4 = "device"
            r12.put(r4, r3)
            java.lang.String r4 = "display"
            java.lang.String r5 = android.os.Build.DISPLAY
            r12.put(r4, r5)
            java.lang.String r4 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "fingerprint"
            r12.put(r5, r4)
            java.lang.String r5 = android.os.Build.HARDWARE
            java.lang.String r6 = "hardware"
            r12.put(r6, r5)
            java.lang.String r6 = "host"
            java.lang.String r7 = android.os.Build.HOST
            r12.put(r6, r7)
            java.lang.String r6 = "id"
            java.lang.String r7 = android.os.Build.ID
            r12.put(r6, r7)
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r7 = "manufacturer"
            r12.put(r7, r6)
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r8 = "model"
            r12.put(r8, r7)
            java.lang.String r8 = android.os.Build.PRODUCT
            java.lang.String r9 = "product"
            r12.put(r9, r8)
            java.lang.String[] r9 = android.os.Build.SUPPORTED_32_BIT_ABIS
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.util.List r9 = q2.C0402e.b0(r9)
            java.lang.String r10 = "supported32BitAbis"
            r12.put(r10, r9)
            java.lang.String[] r9 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.util.List r9 = q2.C0402e.b0(r9)
            java.lang.String r10 = "supported64BitAbis"
            r12.put(r10, r9)
            java.lang.String[] r9 = android.os.Build.SUPPORTED_ABIS
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.util.List r9 = q2.C0402e.b0(r9)
            java.lang.String r10 = "supportedAbis"
            r12.put(r10, r9)
            java.lang.String r9 = "tags"
            java.lang.String r10 = android.os.Build.TAGS
            r12.put(r9, r10)
            java.lang.String r9 = "type"
            java.lang.String r10 = android.os.Build.TYPE
            r12.put(r9, r10)
            java.lang.String r9 = "BRAND"
            A2.i.d(r2, r9)
            java.lang.String r9 = "generic"
            boolean r2 = r2.startsWith(r9)
            java.lang.String r10 = "unknown"
            if (r2 == 0) goto L_0x011b
            java.lang.String r2 = "DEVICE"
            A2.i.d(r3, r2)
            boolean r2 = r3.startsWith(r9)
            if (r2 != 0) goto L_0x0193
        L_0x011b:
            java.lang.String r2 = "FINGERPRINT"
            A2.i.d(r4, r2)
            boolean r2 = r4.startsWith(r9)
            if (r2 != 0) goto L_0x0193
            boolean r2 = r4.startsWith(r10)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "HARDWARE"
            A2.i.d(r5, r2)
            java.lang.String r2 = "goldfish"
            boolean r2 = H2.l.b0(r5, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "ranchu"
            boolean r2 = H2.l.b0(r5, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "MODEL"
            A2.i.d(r7, r2)
            java.lang.String r2 = "google_sdk"
            boolean r2 = H2.l.b0(r7, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "Emulator"
            boolean r2 = H2.l.b0(r7, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "Android SDK built for x86"
            boolean r2 = H2.l.b0(r7, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "MANUFACTURER"
            A2.i.d(r6, r2)
            java.lang.String r2 = "Genymotion"
            boolean r2 = H2.l.b0(r6, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "PRODUCT"
            A2.i.d(r8, r2)
            java.lang.String r2 = "sdk"
            boolean r2 = H2.l.b0(r8, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "vbox86p"
            boolean r2 = H2.l.b0(r8, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "emulator"
            boolean r2 = H2.l.b0(r8, r2)
            if (r2 != 0) goto L_0x0193
            java.lang.String r2 = "simulator"
            boolean r2 = H2.l.b0(r8, r2)
            if (r2 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r2 = r1
            goto L_0x0194
        L_0x0193:
            r2 = r0
        L_0x0194:
            r2 = r2 ^ r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "isPhysicalDevice"
            r12.put(r3, r2)
            java.lang.Object r2 = r11.f160g
            android.content.pm.PackageManager r2 = (android.content.pm.PackageManager) r2
            android.content.pm.FeatureInfo[] r2 = r2.getSystemAvailableFeatures()
            java.lang.String r3 = "getSystemAvailableFeatures(...)"
            A2.i.d(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
        L_0x01b1:
            if (r1 >= r4) goto L_0x01bf
            r5 = r2[r1]
            java.lang.String r6 = r5.name
            if (r6 != 0) goto L_0x01ba
            goto L_0x01bd
        L_0x01ba:
            r3.add(r5)
        L_0x01bd:
            int r1 = r1 + r0
            goto L_0x01b1
        L_0x01bf:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = q2.C0403f.c0(r3)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x01cc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01de
            java.lang.Object r2 = r1.next()
            android.content.pm.FeatureInfo r2 = (android.content.pm.FeatureInfo) r2
            java.lang.String r2 = r2.name
            r0.add(r2)
            goto L_0x01cc
        L_0x01de:
            java.lang.String r1 = "systemFeatures"
            r12.put(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "baseOS"
            java.lang.String r3 = android.os.Build.VERSION.BASE_OS
            r0.put(r2, r3)
            int r2 = android.os.Build.VERSION.PREVIEW_SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "previewSdkInt"
            r0.put(r3, r2)
            java.lang.String r2 = "securityPatch"
            java.lang.String r3 = android.os.Build.VERSION.SECURITY_PATCH
            r0.put(r2, r3)
            java.lang.String r2 = "codename"
            java.lang.String r3 = android.os.Build.VERSION.CODENAME
            r0.put(r2, r3)
            java.lang.String r2 = "incremental"
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL
            r0.put(r2, r3)
            java.lang.String r2 = "release"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r0.put(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "sdkInt"
            r0.put(r3, r2)
            java.lang.String r2 = "version"
            r12.put(r2, r0)
            java.lang.Object r0 = r11.f161h
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            boolean r0 = r0.isLowRamDevice()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "isLowRamDevice"
            r12.put(r2, r0)
            r0 = 26
            java.lang.String r2 = "serialNumber"
            if (r1 < r0) goto L_0x0245
            java.lang.String r10 = android.os.Build.getSerial()     // Catch:{ SecurityException -> 0x0241 }
        L_0x0241:
            r12.put(r2, r10)
            goto L_0x024a
        L_0x0245:
            java.lang.String r0 = android.os.Build.SERIAL
            r12.put(r2, r0)
        L_0x024a:
            b2.f r13 = (b2.f) r13
            r13.b(r12)
            goto L_0x0255
        L_0x0250:
            b2.f r13 = (b2.f) r13
            r13.c()
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.r.onMethodCall(c2.m, c2.p):void");
    }

    public void p(W0.h hVar) {
        ((Map) ((r) this.f161h).f161h).remove((W0.i) this.f160g);
    }

    public void q(Object obj) {
        switch (this.f159f) {
            case 25:
                f fVar = (f) this.f161h;
                b2.i iVar = (b2.i) this.f160g;
                ((ConcurrentLinkedQueue) fVar.f128h).remove(iVar);
                if (!((ConcurrentLinkedQueue) fVar.f128h).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(iVar.f2745a));
                    return;
                }
                return;
            default:
                ((U1.g) this.f160g).a(((l) ((C0464y) ((r) this.f161h).f161h).f4624h).b(obj));
                return;
        }
    }

    public void r() {
        this.f161h = null;
    }

    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f161h;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    public void s() {
        ((MediaPlayer) this.f161h).prepareAsync();
    }

    public void t(T2.a aVar) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f161h;
        i.e(mediaPlayer, "player");
        mediaPlayer.setAudioAttributes(aVar.a());
        if (aVar.f1730b) {
            Context context = ((p) this.f160g).f1833a.f1739g;
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                mediaPlayer.setWakeMode(applicationContext, 1);
                return;
            }
            i.g("context");
            throw null;
        }
    }

    public String toString() {
        switch (this.f159f) {
            case L.k.STRING_SET_FIELD_NUMBER /*6*/:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f161h.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f160g;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(float f3, float f4) {
        ((MediaPlayer) this.f161h).setVolume(f3, f4);
    }

    public Integer v() {
        return Integer.valueOf(((MediaPlayer) this.f161h).getCurrentPosition());
    }

    public void w() {
        ((MediaPlayer) this.f161h).reset();
    }

    public /* synthetic */ r(Object obj, Object obj2, int i3, boolean z3) {
        this.f159f = i3;
        this.f161h = obj;
        this.f160g = obj2;
    }

    public r(int i3) {
        this.f159f = i3;
        switch (i3) {
            case L.k.BYTES_FIELD_NUMBER /*8*/:
                D0.d dVar = D0.d.f200c;
                this.f160g = new SparseIntArray();
                this.f161h = dVar;
                return;
            case 14:
                this.f160g = new LongSparseArray();
                this.f161h = new PriorityQueue();
                return;
            case 20:
                this.f160g = new ReentrantLock();
                this.f161h = new LinkedHashMap();
                return;
            default:
                this.f160g = Collections.synchronizedMap(new WeakHashMap());
                this.f161h = Collections.synchronizedMap(new WeakHashMap());
                return;
        }
    }

    public r(b bVar, e eVar) {
        this.f159f = 2;
        this.f161h = "ClientTelemetry.API";
        this.f160g = bVar;
    }

    public r(Context context) {
        this.f159f = 7;
        G0.o.e(context);
        Resources resources = context.getResources();
        this.f160g = resources;
        this.f161h = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public r(IBinder iBinder) {
        this.f159f = 0;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f160g = new Messenger(iBinder);
            this.f161h = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f161h = new i(iBinder);
            this.f160g = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ r(Object obj) {
        this.f159f = 6;
        this.f161h = obj;
        this.f160g = new ArrayList();
    }

    public r(p pVar) {
        this.f159f = 17;
        i.e(pVar, "wrappedPlayer");
        this.f160g = pVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new U2.c(pVar));
        mediaPlayer.setOnCompletionListener(new U2.d(pVar));
        mediaPlayer.setOnSeekCompleteListener(new U2.e(pVar));
        mediaPlayer.setOnErrorListener(new U2.f(pVar));
        mediaPlayer.setOnBufferingUpdateListener(new U2.g(pVar));
        mediaPlayer.setAudioAttributes(pVar.f1835c.a());
        this.f161h = mediaPlayer;
    }

    public r(F0.h hVar) {
        this.f159f = 13;
        this.f161h = new P2.i();
        this.f160g = hVar;
    }

    public r(B.m mVar) {
        this.f159f = 21;
        this.f161h = mVar;
        this.f160g = new HashMap();
    }

    public r(C0140b bVar) {
        this.f159f = 27;
        r rVar = new r(20);
        this.f160g = bVar;
        this.f161h = rVar;
    }

    public r(M0.a aVar, androidx.lifecycle.z zVar, O.b bVar) {
        this.f159f = 19;
        i.e(aVar, "store");
        i.e(bVar, "defaultCreationExtras");
        this.f160g = zVar;
        this.f161h = bVar;
    }

    public r(U1.b bVar, int i3) {
        this.f159f = i3;
        switch (i3) {
            case 23:
                F0.h hVar = new F0.h(21, (Object) this);
                q qVar = new q(bVar, "flutter/platform", c2.k.f2784a, (e) null);
                this.f160g = qVar;
                qVar.b(hVar);
                return;
            case 26:
                F0.h hVar2 = new F0.h(28, (Object) this);
                q qVar2 = new q(bVar, "flutter/textinput", c2.k.f2784a, (e) null);
                this.f160g = qVar2;
                qVar2.b(hVar2);
                return;
            default:
                F0.h hVar3 = new F0.h(19, (Object) this);
                q qVar3 = new q(bVar, "flutter/localization", c2.k.f2784a, (e) null);
                this.f160g = qVar3;
                qVar3.b(hVar3);
                return;
        }
    }

    public r(U1.b bVar, PackageManager packageManager) {
        this.f159f = 24;
        B.m mVar = new B.m(28, (Object) this);
        this.f160g = packageManager;
        new q(bVar, "flutter/processtext", x.f2798a, (e) null).b(mVar);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [T.L, java.lang.Object] */
    public r(M m3) {
        this.f159f = 15;
        this.f160g = m3;
        ? obj = new Object();
        obj.f1586a = 0;
        this.f161h = obj;
    }

    public r(T2.d dVar) {
        this.f159f = 18;
        i.e(dVar, "ref");
        this.f160g = dVar;
        this.f161h = new HashMap();
    }

    public r(f fVar) {
        this.f159f = 16;
        this.f160g = fVar;
        fVar.X(this);
    }
}
