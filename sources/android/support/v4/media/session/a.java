package android.support.v4.media.session;

import A.H;
import A.J;
import A.K;
import A.L;
import A.V;
import A2.i;
import C0.b;
import C0.s;
import C0.t;
import F0.v;
import G0.o;
import I2.C0050a;
import T1.c;
import T1.d;
import W0.h;
import W0.j;
import W0.n;
import W0.p;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.datastore.preferences.protobuf.C0103g;
import c2.m;
import d0.C0150l;
import d0.C0151m;
import h0.C0185a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import m2.C0333b;
import n.C0335b;
import n.C0341h;
import n.k;
import p2.C0368h;
import q2.C0402e;
import r2.C0423g;
import r2.C0424h;
import r2.C0425i;
import r2.C0426j;
import s1.C0443d;
import s1.C0461v;
import s1.C0462w;
import s1.C0463x;
import t2.C0484b;
import u2.C0497a;
import v2.C0498a;
import z2.l;

public abstract class a {
    public static HashMap A(C0463x xVar) {
        int i3;
        long j3;
        Uri uri;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (xVar.f4618a.getString("collapse_key") != null) {
            hashMap.put("collapseKey", xVar.f4618a.getString("collapse_key"));
        }
        if (xVar.f4618a.getString("from") != null) {
            hashMap.put("from", xVar.f4618a.getString("from"));
        }
        if (xVar.f4618a.getString("google.to") != null) {
            hashMap.put("to", xVar.f4618a.getString("google.to"));
        }
        if (xVar.b() != null) {
            hashMap.put("messageId", xVar.b());
        }
        if (xVar.f4618a.getString("message_type") != null) {
            hashMap.put("messageType", xVar.f4618a.getString("message_type"));
        }
        if (!((k) xVar.a()).isEmpty()) {
            for (Map.Entry entry : ((C0335b) xVar.a()).entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("data", hashMap2);
        Bundle bundle = xVar.f4618a;
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    i3 = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                }
            }
            i3 = 0;
        }
        hashMap.put("ttl", Integer.valueOf(i3));
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            j3 = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    j3 = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused2) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                }
            }
            j3 = 0;
        }
        hashMap.put("sentTime", Long.valueOf(j3));
        if (xVar.c() != null) {
            C0462w c3 = xVar.c();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            String str = c3.f4600a;
            if (str != null) {
                hashMap3.put("title", str);
            }
            String str2 = c3.f4601b;
            if (str2 != null) {
                hashMap3.put("titleLocKey", str2);
            }
            String[] strArr = c3.f4602c;
            if (strArr != null) {
                hashMap3.put("titleLocArgs", Arrays.asList(strArr));
            }
            String str3 = c3.f4603d;
            if (str3 != null) {
                hashMap3.put("body", str3);
            }
            String str4 = c3.f4604e;
            if (str4 != null) {
                hashMap3.put("bodyLocKey", str4);
            }
            String[] strArr2 = c3.f4605f;
            if (strArr2 != null) {
                hashMap3.put("bodyLocArgs", Arrays.asList(strArr2));
            }
            String str5 = c3.f4612m;
            if (str5 != null) {
                hashMap4.put("channelId", str5);
            }
            String str6 = c3.f4611l;
            if (str6 != null) {
                hashMap4.put("clickAction", str6);
            }
            String str7 = c3.f4610k;
            if (str7 != null) {
                hashMap4.put("color", str7);
            }
            String str8 = c3.f4606g;
            if (str8 != null) {
                hashMap4.put("smallIcon", str8);
            }
            Uri uri2 = null;
            String str9 = c3.f4607h;
            if (str9 != null) {
                uri = Uri.parse(str9);
            } else {
                uri = null;
            }
            if (uri != null) {
                if (str9 != null) {
                    uri2 = Uri.parse(str9);
                }
                hashMap4.put("imageUrl", uri2.toString());
            }
            Uri uri3 = c3.f4613n;
            if (uri3 != null) {
                hashMap4.put("link", uri3.toString());
            }
            Integer num = c3.f4617r;
            if (num != null) {
                hashMap4.put("count", num);
            }
            Integer num2 = c3.f4615p;
            if (num2 != null) {
                hashMap4.put("priority", num2);
            }
            String str10 = c3.f4608i;
            if (str10 != null) {
                hashMap4.put("sound", str10);
            }
            String str11 = c3.f4614o;
            if (str11 != null) {
                hashMap4.put("ticker", str11);
            }
            Integer num3 = c3.f4616q;
            if (num3 != null) {
                hashMap4.put("visibility", num3);
            }
            String str12 = c3.f4609j;
            if (str12 != null) {
                hashMap4.put("tag", str12);
            }
            hashMap3.put("android", hashMap4);
            hashMap.put("notification", hashMap3);
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static void B(Context context, d dVar, boolean z3) {
        p pVar;
        int i3;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences u3 = u(context);
            if (!u3.contains("proxy_retention") || u3.getBoolean("proxy_retention", false) != z3) {
                b bVar = (b) dVar.f1705c;
                if (bVar.f113c.c() >= 241100000) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("proxy_retention", z3);
                    t a2 = t.a(bVar.f112b);
                    synchronized (a2) {
                        i3 = a2.f171d;
                        a2.f171d = i3 + 1;
                    }
                    pVar = a2.b(new s(i3, 4, bundle, 0));
                } else {
                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                    p pVar2 = new p();
                    pVar2.k(iOException);
                    pVar = pVar2;
                }
                pVar.a(new Object(), new C0461v(context, z3));
            }
        }
    }

    public static void C(z2.p pVar, C0050a aVar, C0050a aVar2) {
        try {
            N2.a.i(M0.a.y(((C0484b) pVar).c(aVar, aVar2)), C0368h.f4194a, (l) null);
        } catch (Throwable th) {
            aVar2.m(M0.a.h(th));
            throw th;
        }
    }

    public static byte[] D(C0443d dVar) {
        int i3;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i4 = 0;
        while (i4 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i4);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < min2) {
                int read = dVar.read(bArr, i5, min2 - i5);
                if (read == -1) {
                    return k(arrayDeque, i4);
                }
                i5 += read;
                i4 += read;
            }
            long j3 = (long) min;
            if (min < 4096) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            long j4 = j3 * ((long) i3);
            if (j4 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j4 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j4;
            }
        }
        if (dVar.read() == -1) {
            return k(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final String E(String str) {
        i.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        i.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        i.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        i.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static ArrayList F(Exception exc) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(exc.toString());
        arrayList.add(exc.getClass().getSimpleName());
        arrayList.add("Cause: " + exc.getCause() + ", Stacktrace: " + Log.getStackTraceString(exc));
        return arrayList;
    }

    public static ArrayList G(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Object H(h hVar) {
        if (hVar.e()) {
            return hVar.c();
        }
        if (((p) hVar).f1891d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.b());
    }

    public static final T2.a a(m mVar) {
        Boolean bool = (Boolean) mVar.a("isSpeakerphoneOn");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) mVar.a("stayAwake");
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Integer num = (Integer) mVar.a("contentType");
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = (Integer) mVar.a("usageType");
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        Integer num3 = (Integer) mVar.a("audioFocus");
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            Integer num4 = (Integer) mVar.a("audioMode");
                            if (num4 != null) {
                                return new T2.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
                            }
                            throw new IllegalStateException("audioMode is required");
                        }
                        throw new IllegalStateException("audioFocus is required");
                    }
                    throw new IllegalStateException("usageType is required");
                }
                throw new IllegalStateException("contentType is required");
            }
            throw new IllegalStateException("stayAwake is required");
        }
        throw new IllegalStateException("isSpeakerphoneOn is required");
    }

    public static final List b(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return C0402e.b0(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    public static void c(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = C0498a.f4720a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = C0497a.f4719a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static Object d(h hVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            o.d();
            o.f(hVar, "Task must not be null");
            if (hVar.d()) {
                return H(hVar);
            }
            C0.k kVar = new C0.k();
            n nVar = j.f1877b;
            hVar.a(nVar, kVar);
            p pVar = (p) hVar;
            W0.l lVar = new W0.l(nVar, (W0.d) kVar);
            v vVar = pVar.f1889b;
            vVar.d(lVar);
            pVar.o();
            vVar.d(new W0.l(nVar, (W0.b) kVar));
            pVar.o();
            kVar.f135f.await();
            return H(hVar);
        }
        throw new IllegalStateException("Must not be called on the main application thread");
    }

    public static Object e(p pVar, long j3, TimeUnit timeUnit) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            o.d();
            o.f(pVar, "Task must not be null");
            o.f(timeUnit, "TimeUnit must not be null");
            if (pVar.d()) {
                return H(pVar);
            }
            C0.k kVar = new C0.k();
            n nVar = j.f1877b;
            pVar.a(nVar, kVar);
            W0.l lVar = new W0.l(nVar, (W0.d) kVar);
            v vVar = pVar.f1889b;
            vVar.d(lVar);
            pVar.o();
            vVar.d(new W0.l(nVar, (W0.b) kVar));
            pVar.o();
            if (kVar.f135f.await(j3, timeUnit)) {
                return H(pVar);
            }
            throw new TimeoutException("Timed out waiting for Task");
        }
        throw new IllegalStateException("Must not be called on the main application thread");
    }

    public static void f(Context context, C0333b bVar) {
        Rect rect;
        V v;
        L l3;
        Activity t3 = t(context);
        if (t3 != null) {
            C0150l.f2909a.getClass();
            int i3 = C0151m.f2910b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                rect = ((WindowManager) t3.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = t3.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                i.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                if (i4 >= 30) {
                    l3 = new K();
                } else if (i4 >= 29) {
                    l3 = new J();
                } else {
                    l3 = new H();
                }
                v = l3.b();
                i.d(v, "{\n            WindowInse…ilder().build()\n        }");
            } else if (i4 >= 30) {
                v = C0185a.f3035a.a(t3);
            } else {
                throw new Exception("Incompatible SDK version");
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(A2.h.f("Left must be less than or equal to right, left: ", i5, ", right: ", i7).toString());
            } else if (i6 <= i8) {
                i.e(v, "_windowInsetsCompat");
                float f3 = context.getResources().getDisplayMetrics().density;
                ((c) bVar).f1680a.updateDisplayMetrics(0, (float) new Rect(i5, i6, i7, i8).width(), (float) new Rect(i5, i6, i7, i8).height(), f3);
            } else {
                throw new IllegalArgumentException(A2.h.f("top must be less than or equal to bottom, top: ", i6, ", bottom: ", i8).toString());
            }
        }
    }

    public static p g(Executor executor, Callable callable) {
        o.f(executor, "Executor must not be null");
        p pVar = new p();
        executor.execute(new C0.n(9, pVar, callable));
        return pVar;
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(int i3) {
        if (2 > i3 || i3 >= 37) {
            throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new E2.a(2, 36, 1));
        }
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] k(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final void l(int i3, int i4) {
        if (i3 > i4) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
        }
    }

    public static boolean m(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean n3 = n(file, inputStream);
                j(inputStream);
                return n3;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            j(inputStream);
            throw th;
        }
    }

    public static boolean n(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        j(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                j(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static void o(Activity activity, androidx.lifecycle.d dVar) {
        androidx.lifecycle.l b3;
        i.e(activity, "activity");
        i.e(dVar, "event");
        if ((activity instanceof androidx.lifecycle.j) && (b3 = ((androidx.lifecycle.j) activity).b()) != null) {
            b3.d(dVar);
        }
    }

    public static R2.b p(String str) {
        byte[] bytes = str.getBytes(H2.a.f485a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        R2.b bVar = new R2.b(bytes);
        bVar.f1371h = str;
        return bVar;
    }

    public static String q(C0103g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i3 = 0; i3 < gVar.size(); i3++) {
            byte a2 = gVar.a(i3);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case L.k.DOUBLE_FIELD_NUMBER:
                        sb.append("\\a");
                        break;
                    case L.k.BYTES_FIELD_NUMBER:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static p r(Object obj) {
        p pVar = new p();
        pVar.l(obj);
        return pVar;
    }

    public static C0423g s(C0423g gVar, C0424h hVar) {
        i.e(hVar, "key");
        if (i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity t(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return t(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static SharedPreferences u(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [n.b, n.k] */
    public static C0463x v(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        ? kVar = new k();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("google.to", str);
            String str2 = (String) map2.get("collapseKey");
            String str3 = (String) map2.get("messageId");
            String str4 = (String) map2.get("messageType");
            Integer num = (Integer) map2.get("ttl");
            Map map3 = (Map) map2.get("data");
            if (str2 != null) {
                bundle.putString("collapse_key", str2);
            }
            if (str4 != null) {
                bundle.putString("message_type", str4);
            }
            if (str3 != null) {
                bundle.putString("google.message_id", str3);
            }
            if (num != null) {
                bundle.putString("google.ttl", String.valueOf(num.intValue()));
            }
            if (map3 != null) {
                kVar.clear();
                kVar.putAll(map3);
            }
            Bundle bundle2 = new Bundle();
            Iterator it = ((C0341h) kVar.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle2.putAll(bundle);
            bundle.remove("from");
            return new C0463x(bundle2);
        }
        throw new IllegalArgumentException(A2.h.g("Invalid to: ", str));
    }

    public static File w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i3 = 0;
        while (i3 < 100) {
            File file = new File(cacheDir, str + i3);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i3++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static void x(Intent intent) {
        if (intent != null) {
            try {
                if (i.a(intent.getAction(), "android.intent.action.MAIN") && intent.getCategories().contains("android.intent.category.LAUNCHER") && i.a(intent.getStringExtra("intentData"), "onNotificationPressed")) {
                    L2.p pVar = J1.a.f802f;
                }
            } catch (Exception e2) {
                L2.p pVar2 = J1.a.f802f;
                Log.e("a", e2.getMessage(), e2);
            }
        }
    }

    public static C0425i y(C0423g gVar, C0424h hVar) {
        i.e(hVar, "key");
        if (i.a(gVar.getKey(), hVar)) {
            return C0426j.f4457f;
        }
        return gVar;
    }

    public static MappedByteBuffer z(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }
}
