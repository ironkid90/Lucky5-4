package c2;

import B1.b;
import L.j;
import S1.C0078d;
import S1.o;
import S1.r;
import S1.x;
import U.d;
import a.C0094a;
import android.app.Activity;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import b2.h;
import com.ai9poker.app.R;
import d2.C0152a;
import e.C0153a;
import f.C0159a;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import io.flutter.view.g;
import j.C0250o;
import j.C0258x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import n1.C0346b;
import n2.C0349b;
import o2.a;
import org.json.JSONException;
import org.json.JSONObject;
import q.C0374d;
import s0.e;
import s0.f;
import t0.C0477b;
import y0.C0519a;
import y1.m;

public final class n implements C0136d, h, i, o, C0477b {

    /* renamed from: i  reason: collision with root package name */
    public static x f2787i;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2788f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2789g;

    /* renamed from: h  reason: collision with root package name */
    public Object f2790h;

    public /* synthetic */ n(int i3) {
        this.f2788f = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[SYNTHETIC, Splitter:B:15:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC, Splitter:B:19:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c2.n e(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0036, Error -> 0x0034, OverlappingFileLockException -> 0x0030 }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002e, Error -> 0x002c, OverlappingFileLockException -> 0x0029 }
            c2.n r2 = new c2.n     // Catch:{ IOException -> 0x0027, Error -> 0x0025, OverlappingFileLockException -> 0x0023 }
            r3 = 8
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ IOException -> 0x0027, Error -> 0x0025, OverlappingFileLockException -> 0x0023 }
            return r2
        L_0x0023:
            r2 = move-exception
            goto L_0x0038
        L_0x0025:
            r2 = move-exception
            goto L_0x0038
        L_0x0027:
            r2 = move-exception
            goto L_0x0038
        L_0x0029:
            r2 = move-exception
        L_0x002a:
            r0 = r1
            goto L_0x0038
        L_0x002c:
            r2 = move-exception
            goto L_0x002a
        L_0x002e:
            r2 = move-exception
            goto L_0x002a
        L_0x0030:
            r2 = move-exception
        L_0x0031:
            r5 = r1
            r0 = r5
            goto L_0x0038
        L_0x0034:
            r2 = move-exception
            goto L_0x0031
        L_0x0036:
            r2 = move-exception
            goto L_0x0031
        L_0x0038:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0044
            r0.release()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            r5.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.n.e(android.content.Context):c2.n");
    }

    public void a() {
        ((l) this.f2789g).a();
        ((k) this.f2790h).a();
    }

    public void b(g gVar) {
        ((l) this.f2789g).f3403m.f3372a = gVar;
        ((k) this.f2790h).f3388k.f3372a = gVar;
    }

    public boolean c(int i3) {
        ((k) this.f2790h).d(i3);
        return ((l) this.f2789g).c(i3);
    }

    public void d(int i3) {
        ((k) this.f2790h).d(i3);
        ((l) this.f2789g).d(i3);
    }

    public void f() {
        d dVar;
        ImageView imageView = (ImageView) this.f2789g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = C0258x.f3811a;
        }
        if (drawable != null && (dVar = (d) this.f2790h) != null) {
            C0250o.c(drawable, dVar, imageView.getDrawableState());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.CctBackendFactory g(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r13.f2790h
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            java.lang.String r4 = "BackendRegistry"
            if (r2 != 0) goto L_0x009a
            java.lang.Object r2 = r13.f2789g
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0036 }
            if (r5 != 0) goto L_0x001e
            java.lang.String r2 = "Context has no PackageManager."
            android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
        L_0x001c:
            r2 = r3
            goto L_0x003c
        L_0x001e:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0036 }
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r6.<init>(r2, r7)     // Catch:{ NameNotFoundException -> 0x0036 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = "TransportBackendDiscovery has no service info."
            android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x001c
        L_0x0033:
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            java.lang.String r2 = "Application info not found."
            android.util.Log.w(r4, r2)
            goto L_0x001c
        L_0x003c:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "Could not retrieve metadata, returning empty list of transport backends."
            android.util.Log.w(r4, r2)
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0098
        L_0x0048:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0055:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.get(r7)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L_0x0055
            java.lang.String r9 = "backend:"
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x0055
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r8 = r8.split(r9, r10)
            int r9 = r8.length
            r10 = 0
        L_0x007c:
            if (r10 >= r9) goto L_0x0055
            r11 = r8[r10]
            java.lang.String r11 = r11.trim()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            r12 = 8
            java.lang.String r12 = r7.substring(r12)
            r5.put(r11, r12)
        L_0x0094:
            int r10 = r10 + 1
            goto L_0x007c
        L_0x0097:
            r2 = r5
        L_0x0098:
            r13.f2790h = r2
        L_0x009a:
            java.lang.Object r2 = r13.f2790h
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x00a7
            return r3
        L_0x00a7:
            java.lang.Class r2 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r5 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r2 = r2.asSubclass(r5)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            com.google.android.datatransport.cct.CctBackendFactory r2 = (com.google.android.datatransport.cct.CctBackendFactory) r2     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            return r2
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c6
        L_0x00be:
            r0 = move-exception
            goto L_0x00ce
        L_0x00c0:
            r2 = move-exception
            goto L_0x00d6
        L_0x00c2:
            r2 = move-exception
            goto L_0x00e9
        L_0x00c4:
            r0 = move-exception
            goto L_0x00fc
        L_0x00c6:
            java.lang.String r14 = r1.concat(r14)
            android.util.Log.w(r4, r14, r0)
            goto L_0x0112
        L_0x00ce:
            java.lang.String r14 = r1.concat(r14)
            android.util.Log.w(r4, r14, r0)
            goto L_0x0112
        L_0x00d6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r14)
            r5.append(r0)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r4, r14, r2)
            goto L_0x0112
        L_0x00e9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r14)
            r5.append(r0)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r4, r14, r2)
            goto L_0x0112
        L_0x00fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = " is not found."
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.w(r4, r14, r0)
        L_0x0112:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.n.g(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public Object get() {
        switch (this.f2788f) {
            case 13:
                return new f((Context) ((C0152a) this.f2789g).f2912g, (s0.d) ((e) this.f2790h).get());
            default:
                return new y0.i(new G0.f(1), new D0.g(1, false), C0519a.f4809f, (y0.k) ((C0152a) this.f2789g).get(), (a) this.f2790h);
        }
    }

    public void h(ByteBuffer byteBuffer, U1.g gVar) {
        q qVar = (q) this.f2790h;
        try {
            ((o) this.f2789g).onMethodCall(qVar.f2793c.c(byteBuffer), new b2.f(1, this, gVar));
        } catch (RuntimeException e2) {
            Log.e("MethodChannel#" + qVar.f2792b, "Failed to handle method call", e2);
            gVar.a(qVar.f2793c.e(e2.getMessage(), Log.getStackTraceString(e2)));
        }
    }

    public m i(D1.a aVar) {
        h hVar;
        HashMap hashMap = (HashMap) this.f2789g;
        Type type = aVar.f221b;
        if (hashMap.get(type) == null) {
            Class cls = aVar.f220a;
            if (hashMap.get(cls) == null) {
                m mVar = null;
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
                    if (!declaredConstructor.isAccessible()) {
                        ((b) this.f2790h).a(declaredConstructor);
                    }
                    hVar = new h(14, declaredConstructor);
                } catch (NoSuchMethodException unused) {
                    hVar = null;
                }
                if (hVar != null) {
                    return hVar;
                }
                if (Collection.class.isAssignableFrom(cls)) {
                    if (SortedSet.class.isAssignableFrom(cls)) {
                        mVar = new j1.e(17);
                    } else if (EnumSet.class.isAssignableFrom(cls)) {
                        mVar = new C0152a(12, type);
                    } else if (Set.class.isAssignableFrom(cls)) {
                        mVar = new D0.g(18, false);
                    } else if (Queue.class.isAssignableFrom(cls)) {
                        mVar = new G0.f(18);
                    } else {
                        mVar = new j1.e(18);
                    }
                } else if (Map.class.isAssignableFrom(cls)) {
                    if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                        mVar = new D0.g(19, false);
                    } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                        mVar = new G0.f(16);
                    } else if (SortedMap.class.isAssignableFrom(cls)) {
                        mVar = new j1.e(16);
                    } else {
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            type2.getClass();
                            Type b3 = y1.d.b(type2);
                            Class h3 = y1.d.h(b3);
                            b3.hashCode();
                            if (!String.class.isAssignableFrom(h3)) {
                                mVar = new D0.g(17, false);
                            }
                        }
                        mVar = new G0.f(17);
                    }
                }
                if (mVar != null) {
                    return mVar;
                }
                return new C0.f(cls, type);
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public File j() {
        if (((File) this.f2789g) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2789g) == null) {
                        X0.g gVar = (X0.g) this.f2790h;
                        gVar.a();
                        File filesDir = gVar.f1936a.getFilesDir();
                        this.f2789g = new File(filesDir, "PersistedInstallation." + ((X0.g) this.f2790h).f() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f2789g;
    }

    public void k(C0346b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f4104a);
            jSONObject.put("Status", j.b(bVar.f4105b));
            jSONObject.put("AuthToken", bVar.f4106c);
            jSONObject.put("RefreshToken", bVar.f4107d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f4109f);
            jSONObject.put("ExpiresInSecs", bVar.f4108e);
            jSONObject.put("FisError", bVar.f4110g);
            X0.g gVar = (X0.g) this.f2790h;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f1936a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(j())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void l(int i3) {
        ImageView imageView = (ImageView) this.f2789g;
        C0.f P3 = C0.f.P(imageView.getContext(), (AttributeSet) null, C0153a.f2921e, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) P3.f127g;
            if (drawable == null) {
                int resourceId = typedArray.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable = C0159a.a(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                Rect rect = C0258x.f3811a;
            }
            if (typedArray.hasValue(2)) {
                F.e.c(imageView, P3.H(2));
            }
            if (typedArray.hasValue(3)) {
                F.e.d(imageView, C0258x.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            P3.T();
        } catch (Throwable th) {
            P3.T();
            throw th;
        }
    }

    public void m(g gVar) {
        ArrayList arrayList = (ArrayList) this.f2789g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.a((Map) it.next());
        }
        arrayList.clear();
        this.f2790h = gVar;
    }

    public void n(x.e eVar) {
        int i3 = eVar.f4754b;
        Handler handler = (Handler) this.f2790h;
        h hVar = (h) this.f2789g;
        if (i3 == 0) {
            handler.post(new C0.n(13, hVar, eVar.f4753a));
        } else {
            handler.post(new C0.e(hVar, i3));
        }
    }

    public C0346b o() {
        JSONObject jSONObject;
        String str;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(j());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i3 = j.c(5)[optInt];
        if (i3 != 0) {
            if (i3 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new C0346b(optString, i3, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void onMethodCall(m mVar, p pVar) {
        boolean z3;
        List<ResolveInfo> list;
        int i3;
        Toast toast;
        m mVar2 = mVar;
        View view = null;
        switch (this.f2788f) {
            case L.k.DOUBLE_FIELD_NUMBER:
                String str = mVar2.f2785a;
                str.getClass();
                Context context = (Context) this.f2789g;
                j0.b bVar = (j0.b) this.f2790h;
                Object obj = mVar2.f2786b;
                char c3 = 65535;
                switch (str.hashCode()) {
                    case -1544053025:
                        if (str.equals("checkServiceStatus")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -1017315255:
                        if (str.equals("shouldShowRequestPermissionRationale")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case -576207927:
                        if (str.equals("checkPermissionStatus")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 347240634:
                        if (str.equals("openAppSettings")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 1669188213:
                        if (str.equals("requestPermissions")) {
                            c3 = 4;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        int parseInt = Integer.parseInt(obj.toString());
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((b2.f) pVar).a("PermissionHandler.ServiceManager", "Android context cannot be null.", (Object) null);
                            return;
                        } else if (parseInt == 3 || parseInt == 4 || parseInt == 5) {
                            boolean z4 = false;
                            if (Build.VERSION.SDK_INT >= 28) {
                                LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                                if (locationManager != null) {
                                    z3 = locationManager.isLocationEnabled();
                                    ((b2.f) pVar).b(Integer.valueOf(z3 ? 1 : 0));
                                    return;
                                }
                            } else {
                                try {
                                    if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                                        z4 = true;
                                    }
                                } catch (Settings.SettingNotFoundException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            z3 = z4;
                            ((b2.f) pVar).b(Integer.valueOf(z3 ? 1 : 0));
                            return;
                        } else if (parseInt == 21) {
                            ((b2.f) pVar).b(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                            return;
                        } else if (parseInt == 8) {
                            PackageManager packageManager = context.getPackageManager();
                            if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                                ((b2.f) pVar).b(2);
                                return;
                            }
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                                ((b2.f) pVar).b(2);
                                return;
                            }
                            Intent intent = new Intent("android.intent.action.CALL");
                            intent.setData(Uri.parse("tel:123123"));
                            if (Build.VERSION.SDK_INT >= 33) {
                                list = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0));
                            } else {
                                list = packageManager.queryIntentActivities(intent, 0);
                            }
                            if (list.isEmpty()) {
                                ((b2.f) pVar).b(2);
                                return;
                            } else if (telephonyManager.getSimState() != 5) {
                                ((b2.f) pVar).b(0);
                                return;
                            } else {
                                ((b2.f) pVar).b(1);
                                return;
                            }
                        } else if (parseInt == 16) {
                            ((b2.f) pVar).b(1);
                            return;
                        } else {
                            ((b2.f) pVar).b(2);
                            return;
                        }
                    case 1:
                        int parseInt2 = Integer.parseInt(obj.toString());
                        C0078d dVar = bVar.f3833h;
                        if (dVar == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            ((b2.f) pVar).a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", (Object) null);
                            return;
                        }
                        ArrayList w3 = C0094a.w(dVar, parseInt2);
                        if (w3 == null) {
                            Log.d("permissions_handler", "No android specific permissions needed for: " + parseInt2);
                            ((b2.f) pVar).b(Boolean.FALSE);
                            return;
                        } else if (w3.isEmpty()) {
                            Log.d("permissions_handler", "No permissions found in manifest for: " + parseInt2 + " no need to show request rationale");
                            ((b2.f) pVar).b(Boolean.FALSE);
                            return;
                        } else {
                            ((b2.f) pVar).b(Boolean.valueOf(C0374d.d(bVar.f3833h, (String) w3.get(0))));
                            return;
                        }
                    case L.k.FLOAT_FIELD_NUMBER:
                        ((b2.f) pVar).b(Integer.valueOf(bVar.a(Integer.parseInt(obj.toString()))));
                        return;
                    case L.k.INTEGER_FIELD_NUMBER:
                        if (context == null) {
                            Log.d("permissions_handler", "Context cannot be null.");
                            ((b2.f) pVar).a("PermissionHandler.AppSettingsManager", "Android context cannot be null.", (Object) null);
                            return;
                        }
                        try {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.addCategory("android.intent.category.DEFAULT");
                            intent2.setData(Uri.parse("package:" + context.getPackageName()));
                            intent2.addFlags(268435456);
                            intent2.addFlags(1073741824);
                            intent2.addFlags(8388608);
                            context.startActivity(intent2);
                            ((b2.f) pVar).b(Boolean.TRUE);
                            return;
                        } catch (Exception unused) {
                            ((b2.f) pVar).b(Boolean.FALSE);
                            return;
                        }
                    case L.k.LONG_FIELD_NUMBER:
                        List<Integer> list2 = (List) obj;
                        b2.f fVar = (b2.f) pVar;
                        r rVar = new r(5, fVar);
                        if (bVar.f3834i > 0) {
                            fVar.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", (Object) null);
                            return;
                        } else if (bVar.f3833h == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity.");
                            fVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", (Object) null);
                            return;
                        } else {
                            bVar.f3832g = rVar;
                            bVar.f3835j = new HashMap();
                            bVar.f3834i = 0;
                            ArrayList arrayList = new ArrayList();
                            for (Integer num : list2) {
                                if (bVar.a(num.intValue()) != 1) {
                                    ArrayList w4 = C0094a.w(bVar.f3833h, num.intValue());
                                    if (w4 != null && !w4.isEmpty()) {
                                        int i4 = Build.VERSION.SDK_INT;
                                        if (num.intValue() == 16) {
                                            bVar.c("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                                        } else if (i4 >= 30 && num.intValue() == 22) {
                                            bVar.c("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                                        } else if (num.intValue() == 23) {
                                            bVar.c("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                                        } else if (i4 >= 26 && num.intValue() == 24) {
                                            bVar.c("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                                        } else if (num.intValue() == 27) {
                                            bVar.c("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                                        } else if (i4 >= 31 && num.intValue() == 34) {
                                            bVar.c("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                                        } else if (num.intValue() != 37 && num.intValue() != 0) {
                                            arrayList.addAll(w4);
                                            bVar.f3834i = w4.size() + bVar.f3834i;
                                        } else if (bVar.b()) {
                                            arrayList.add("android.permission.WRITE_CALENDAR");
                                            arrayList.add("android.permission.READ_CALENDAR");
                                            bVar.f3834i += 2;
                                        } else {
                                            bVar.f3835j.put(num, 0);
                                        }
                                    } else if (!bVar.f3835j.containsKey(num)) {
                                        bVar.f3835j.put(num, 0);
                                        if (num.intValue() == 22) {
                                            if (Build.VERSION.SDK_INT < 30) {
                                                bVar.f3835j.put(num, 2);
                                            }
                                        }
                                        bVar.f3835j.put(num, 0);
                                    }
                                } else if (!bVar.f3835j.containsKey(num)) {
                                    bVar.f3835j.put(num, 1);
                                }
                            }
                            if (arrayList.size() > 0) {
                                C0374d.c(bVar.f3833h, (String[]) arrayList.toArray(new String[0]), 24);
                            }
                            r rVar2 = bVar.f3832g;
                            if (rVar2 != null && bVar.f3834i == 0) {
                                ((b2.f) rVar2.f1506g).b(bVar.f3835j);
                                return;
                            }
                            return;
                        }
                    default:
                        ((b2.f) pVar).c();
                        return;
                }
            default:
                A2.i.e(mVar2, "call");
                String str2 = mVar2.f2785a;
                if (A2.i.a(str2, "showToast")) {
                    String valueOf = String.valueOf(mVar2.a("msg"));
                    String valueOf2 = String.valueOf(mVar2.a("length"));
                    String valueOf3 = String.valueOf(mVar2.a("gravity"));
                    Number number = (Number) mVar2.a("bgcolor");
                    Number number2 = (Number) mVar2.a("textcolor");
                    Number number3 = (Number) mVar2.a("fontSize");
                    String str3 = (String) mVar2.a("fontAsset");
                    if (valueOf3.equals("top")) {
                        i3 = 48;
                    } else if (valueOf3.equals("center")) {
                        i3 = 17;
                    } else {
                        i3 = 80;
                    }
                    boolean equals = valueOf2.equals("long");
                    Context context2 = (Context) this.f2789g;
                    if (number != null) {
                        Object systemService = context2.getSystemService("layout_inflater");
                        A2.i.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.text);
                        textView.setText(valueOf);
                        Drawable drawable = context2.getDrawable(R.drawable.corner);
                        A2.i.b(drawable);
                        drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                        textView.setBackground(drawable);
                        if (number3 != null) {
                            textView.setTextSize(number3.floatValue());
                        }
                        if (number2 != null) {
                            textView.setTextColor(number2.intValue());
                        }
                        Toast toast2 = new Toast(context2);
                        this.f2790h = toast2;
                        toast2.setDuration(equals);
                        if (str3 != null) {
                            AssetManager assets = context2.getAssets();
                            A2.i.d(assets, "getAssets(...)");
                            String b3 = ((W1.f) C0.f.O().f128h).b(str3);
                            A2.i.d(b3, "getLookupKeyForAsset(...)");
                            textView.setTypeface(Typeface.createFromAsset(assets, b3));
                        }
                        Toast toast3 = (Toast) this.f2790h;
                        if (toast3 != null) {
                            toast3.setView(inflate);
                        }
                    } else {
                        Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str3);
                        Toast makeText = Toast.makeText(context2, valueOf, equals ? 1 : 0);
                        this.f2790h = makeText;
                        if (Build.VERSION.SDK_INT < 30) {
                            if (makeText != null) {
                                view = makeText.getView();
                            }
                            A2.i.b(view);
                            View findViewById = view.findViewById(16908299);
                            A2.i.d(findViewById, "findViewById(...)");
                            TextView textView2 = (TextView) findViewById;
                            if (number3 != null) {
                                textView2.setTextSize(number3.floatValue());
                            }
                            if (number2 != null) {
                                textView2.setTextColor(number2.intValue());
                            }
                            if (str3 != null) {
                                AssetManager assets2 = context2.getAssets();
                                A2.i.d(assets2, "getAssets(...)");
                                String b4 = ((W1.f) C0.f.O().f128h).b(str3);
                                A2.i.d(b4, "getLookupKeyForAsset(...)");
                                textView2.setTypeface(Typeface.createFromAsset(assets2, b4));
                            }
                        }
                    }
                    if (i3 == 17) {
                        Toast toast4 = (Toast) this.f2790h;
                        if (toast4 != null) {
                            toast4.setGravity(i3, 0, 0);
                        }
                    } else if (i3 != 48) {
                        try {
                            Toast toast5 = (Toast) this.f2790h;
                            if (toast5 != null) {
                                toast5.setGravity(i3, 0, 100);
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        Toast toast6 = (Toast) this.f2790h;
                        if (toast6 != null) {
                            toast6.setGravity(i3, 0, 100);
                        }
                    }
                    if (context2 instanceof Activity) {
                        A2.i.c(context2, "null cannot be cast to non-null type android.app.Activity");
                        ((Activity) context2).runOnUiThread(new L1.d(6, (Object) this));
                    } else {
                        Toast toast7 = (Toast) this.f2790h;
                        if (toast7 != null) {
                            toast7.show();
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f2790h) != null) {
                        toast.addCallback(new C0349b(this));
                    }
                    ((b2.f) pVar).b(Boolean.TRUE);
                    return;
                } else if (A2.i.a(str2, "cancel")) {
                    Toast toast8 = (Toast) this.f2790h;
                    if (toast8 != null) {
                        toast8.cancel();
                        this.f2790h = null;
                    }
                    ((b2.f) pVar).b(Boolean.TRUE);
                    return;
                } else {
                    ((b2.f) pVar).c();
                    return;
                }
        }
    }

    public void p() {
        try {
            ((FileLock) this.f2790h).release();
            ((FileChannel) this.f2789g).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public void r() {
        this.f2790h = null;
    }

    public String toString() {
        switch (this.f2788f) {
            case 16:
                return ((HashMap) this.f2789g).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(int i3, Object obj, Object obj2) {
        this.f2788f = i3;
        this.f2789g = obj;
        this.f2790h = obj2;
    }

    public n(o oVar, F0.h hVar) {
        this.f2788f = 2;
        this.f2789g = oVar;
        this.f2790h = hVar;
        hVar.f322g = new h(3, this);
    }

    public n(Context context, G0.f fVar, j0.b bVar, j1.e eVar) {
        this.f2788f = 7;
        this.f2789g = context;
        this.f2790h = bVar;
    }

    public n(o oVar, InputMethodManager inputMethodManager, F0.h hVar) {
        this.f2788f = 3;
        if (Build.VERSION.SDK_INT >= 33) {
            oVar.setAutoHandwritingEnabled(false);
        }
        this.f2790h = oVar;
        this.f2789g = inputMethodManager;
        hVar.f322g = this;
    }

    public n(ImageView imageView) {
        this.f2788f = 5;
        this.f2789g = imageView;
    }

    public n(HashMap hashMap) {
        this.f2788f = 16;
        this.f2790h = b.f103a;
        this.f2789g = hashMap;
    }

    public n(X0.g gVar) {
        this.f2788f = 10;
        this.f2790h = gVar;
    }

    public n(Context context) {
        this.f2788f = 12;
        this.f2790h = null;
        this.f2789g = context;
    }

    public n() {
        this.f2788f = 1;
        this.f2789g = new ArrayList();
    }

    public n(q qVar, o oVar) {
        this.f2788f = 0;
        this.f2790h = qVar;
        this.f2789g = oVar;
    }
}
