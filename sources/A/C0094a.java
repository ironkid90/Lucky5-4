package a;

import A2.i;
import F.l;
import F.m;
import F.n;
import F.o;
import G0.f;
import L.k;
import M1.d;
import O.b;
import S1.C0078d;
import T.C;
import T.t;
import T.u;
import a1.C0096a;
import a1.g;
import a1.h;
import a1.q;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import j.C0254t;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import q.C0374d;
import s.c;
import y.C0517a;

/* renamed from: a.a  reason: case insensitive filesystem */
public abstract class C0094a implements d {

    /* renamed from: g  reason: collision with root package name */
    public static long f1967g;

    /* renamed from: h  reason: collision with root package name */
    public static Method f1968h;

    /* renamed from: i  reason: collision with root package name */
    public static Method f1969i;

    /* renamed from: j  reason: collision with root package name */
    public static Method f1970j;

    /* renamed from: k  reason: collision with root package name */
    public static Context f1971k;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1972f;

    public /* synthetic */ C0094a(int i3) {
        this.f1972f = i3;
    }

    public static String A(TypedArray typedArray, int i3, int i4) {
        String string = typedArray.getString(i3);
        if (string == null) {
            return typedArray.getString(i4);
        }
        return string;
    }

    public static String B(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        if (concat.length() > 23) {
            return concat.substring(0, 23);
        }
        return concat;
    }

    public static C0517a C(C0254t tVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C0517a(n.c(tVar));
        }
        TextPaint textPaint = new TextPaint(tVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = l.a(tVar);
        int d3 = l.d(tVar);
        if (tVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z3 = true;
            if (i3 < 28 || (tVar.getInputType() & 15) != 3) {
                if (tVar.getLayoutDirection() != 1) {
                    z3 = false;
                }
                switch (tVar.getTextDirection()) {
                    case k.FLOAT_FIELD_NUMBER:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case k.INTEGER_FIELD_NUMBER:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case k.LONG_FIELD_NUMBER:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case k.STRING_FIELD_NUMBER:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case k.STRING_SET_FIELD_NUMBER:
                        break;
                    case k.DOUBLE_FIELD_NUMBER:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(n.b(m.a(tVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0517a(textPaint, textDirectionHeuristic, a2, d3);
    }

    public static void D(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean F(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e2);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096));
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void G(android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = android.support.v4.media.session.a.u(r4)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0037 }
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0037 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r1 == 0) goto L_0x0037
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r2 == 0) goto L_0x0037
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0037 }
            boolean r0 = r1.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x004c
            W0.i r1 = new W0.i
            r1.<init>()
            s1.u r2 = new s1.u
            r2.<init>(r4, r0, r1)
            r2.run()
            goto L_0x0050
        L_0x004c:
            r4 = 0
            android.support.v4.media.session.a.r(r4)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0094a.G(android.content.Context):void");
    }

    public static String H(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb.append(str2.charAt(i3));
            }
        }
        return sb.toString();
    }

    public static Long I(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static void J(TextView textView, int i3) {
        int i4;
        if (i3 < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            n.d(textView, i3);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.top;
            } else {
                i4 = fontMetricsInt.ascent;
            }
            if (i3 > Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    public static void K(TextView textView, int i3) {
        int i4;
        if (i3 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.bottom;
            } else {
                i4 = fontMetricsInt.descent;
            }
            if (i3 > Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Integer L(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        if (hashSet.contains(3)) {
            return 3;
        }
        return 1;
    }

    public static int M(C0078d dVar, String str, int i3) {
        if (i3 == -1) {
            return p(dVar, str);
        }
        return 1;
    }

    public static String N(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static Object O(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object O2 : (Collection) obj) {
                    jSONArray.put(O(O2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    jSONArray2.put(O(Array.get(obj, i3)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), O(entry.getValue()));
                }
                return jSONObject;
            } else if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
                return obj;
            } else {
                if (obj instanceof String) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    public static ActionMode.Callback P(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || i3 > 27 || (callback instanceof o) || callback == null) {
            return callback;
        }
        return new o(callback, textView);
    }

    public static ArrayList Q(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void R(Parcel parcel, int i3, Bundle bundle) {
        if (bundle != null) {
            int W2 = W(parcel, i3);
            parcel.writeBundle(bundle);
            X(parcel, W2);
        }
    }

    public static void T(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable != null) {
            int W2 = W(parcel, i3);
            parcelable.writeToParcel(parcel, i4);
            X(parcel, W2);
        }
    }

    public static void U(Parcel parcel, int i3, String str) {
        if (str != null) {
            int W2 = W(parcel, i3);
            parcel.writeString(str);
            X(parcel, W2);
        }
    }

    public static void V(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr != null) {
            int W2 = W(parcel, i3);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i4);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            X(parcel, W2);
        }
    }

    public static int W(Parcel parcel, int i3) {
        parcel.writeInt(i3 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void X(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    public static void Y(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: A2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: A2.q} */
    /* JADX WARNING: type inference failed for: r0v2, types: [t2.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(java.util.List r6, I.C0035k r7, t2.C0484b r8) {
        /*
            boolean r0 = r8 instanceof I.C0029e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            I.e r0 = (I.C0029e) r0
            int r1 = r0.f620l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f620l = r1
            goto L_0x0018
        L_0x0013:
            I.e r0 = new I.e
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f619k
            s2.a r1 = s2.C0466a.f4632f
            int r2 = r0.f620l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.util.Iterator r6 = r0.f618j
            java.io.Serializable r7 = r0.f617i
            A2.q r7 = (A2.q) r7
            M0.a.V(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0065
        L_0x0030:
            r8 = move-exception
            goto L_0x007e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.io.Serializable r6 = r0.f617i
            java.util.List r6 = (java.util.List) r6
            M0.a.V(r8)
            goto L_0x005c
        L_0x0042:
            M0.a.V(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            I.g r2 = new I.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f617i = r8
            r0.f620l = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L_0x005b
            goto L_0x0093
        L_0x005b:
            r6 = r8
        L_0x005c:
            A2.q r7 = new A2.q
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0065:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r6.next()
            z2.l r8 = (z2.l) r8
            r0.f617i = r7     // Catch:{ all -> 0x0030 }
            r0.f618j = r6     // Catch:{ all -> 0x0030 }
            r0.f620l = r3     // Catch:{ all -> 0x0030 }
            java.lang.Object r8 = r8.j(r0)     // Catch:{ all -> 0x0030 }
            if (r8 != r1) goto L_0x0065
            goto L_0x0093
        L_0x007e:
            java.lang.Object r2 = r7.f86f
            if (r2 != 0) goto L_0x0085
            r7.f86f = r8
            goto L_0x0065
        L_0x0085:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            android.support.v4.media.session.a.c(r2, r8)
            goto L_0x0065
        L_0x008b:
            java.lang.Object r6 = r7.f86f
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L_0x0094
            p2.h r1 = p2.C0368h.f4194a
        L_0x0093:
            return r1
        L_0x0094:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0094a.c(java.util.List, I.k, t2.b):java.lang.Object");
    }

    public static final boolean d(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        i.e(bArr, "a");
        i.e(bArr2, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i6 + i3] != bArr2[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static int f(C c3, b bVar, View view, View view2, t tVar, boolean z3) {
        if (tVar.p() == 0 || c3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z3) {
            return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int g(C c3, b bVar, View view, View view2, t tVar, boolean z3) {
        if (tVar.p() == 0 || c3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return c3.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static void l(String str, String str2, Object obj) {
        String B3 = B(str);
        if (Log.isLoggable(B3, 3)) {
            Log.d(B3, String.format(str2, new Object[]{obj}));
        }
    }

    public static void n(ArrayList arrayList) {
        boolean z3;
        boolean z4;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i3 = 0;
            if (it.hasNext()) {
                C0096a aVar = (C0096a) it.next();
                g gVar = new g(aVar);
                Iterator it2 = aVar.f1997b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        q qVar = (q) it2.next();
                        if (aVar.f2000e == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        h hVar = new h(qVar, !z4);
                        if (!hashMap.containsKey(hVar)) {
                            hashMap.put(hVar, new HashSet());
                        }
                        Set set = (Set) hashMap.get(hVar);
                        if (set.isEmpty() || !z4) {
                            set.add(gVar);
                        } else {
                            throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                        }
                    }
                }
            } else {
                for (Set<g> it3 : hashMap.values()) {
                    for (g gVar2 : it3) {
                        for (a1.i iVar : gVar2.f2014a.f1998c) {
                            if (iVar.f2021c == 0) {
                                if (iVar.f2020b == 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Set<g> set2 = (Set) hashMap.get(new h(iVar.f2019a, z3));
                                if (set2 != null) {
                                    for (g gVar3 : set2) {
                                        gVar2.f2015b.add(gVar3);
                                        gVar3.f2016c.add(gVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    g gVar4 = (g) it4.next();
                    if (gVar4.f2016c.isEmpty()) {
                        hashSet2.add(gVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    g gVar5 = (g) hashSet2.iterator().next();
                    hashSet2.remove(gVar5);
                    i3++;
                    Iterator it5 = gVar5.f2015b.iterator();
                    while (it5.hasNext()) {
                        g gVar6 = (g) it5.next();
                        gVar6.f2016c.remove(gVar5);
                        if (gVar6.f2016c.isEmpty()) {
                            hashSet2.add(gVar6);
                        }
                    }
                }
                if (i3 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        g gVar7 = (g) it6.next();
                        if (!gVar7.f2016c.isEmpty() && !gVar7.f2015b.isEmpty()) {
                            arrayList2.add(gVar7.f2014a);
                        }
                    }
                    throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                return;
            }
        }
    }

    public static String o(Context context, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && F(context, (ArrayList) null, str)) {
            return str;
        }
        if (i3 < 29) {
            if (F(context, (ArrayList) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (F(context, (ArrayList) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (F(context, (ArrayList) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        } else {
            return null;
        }
    }

    public static int p(C0078d dVar, String str) {
        if (dVar == null) {
            return 0;
        }
        boolean z3 = dVar.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean d3 = C0374d.d(dVar, str);
        if (z3) {
            if (!d3) {
                d3 = true;
            } else {
                d3 = false;
            }
        }
        if (!z3 && d3) {
            dVar.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        if (!z3 || !d3) {
            return 0;
        }
        return 4;
    }

    public static void q(String str, String str2, Exception exc) {
        String B3 = B(str);
        if (Log.isLoggable(B3, 6)) {
            Log.e(B3, str2, exc);
        }
    }

    public static int u(Context context, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i3;
        }
        return i4;
    }

    public static final Class v(F2.b bVar) {
        i.e(bVar, "<this>");
        Class a2 = ((A2.d) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return a2;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return a2;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return a2;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return a2;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return a2;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return a2;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return a2;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return a2;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return a2;
                }
                return Short.class;
            default:
                return a2;
        }
    }

    public static ArrayList w(Context context, int i3) {
        String o3;
        String o4;
        String o5;
        ArrayList arrayList = new ArrayList();
        switch (i3) {
            case 0:
            case 37:
                if (F(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (F(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                    break;
                }
                break;
            case 1:
                if (F(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    break;
                }
                break;
            case k.FLOAT_FIELD_NUMBER:
                if (F(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (F(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (F(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    break;
                }
                break;
            case k.INTEGER_FIELD_NUMBER:
            case k.LONG_FIELD_NUMBER:
            case k.STRING_FIELD_NUMBER:
                if (i3 == 4 && Build.VERSION.SDK_INT >= 29) {
                    if (F(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        break;
                    }
                } else {
                    if (F(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (F(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        break;
                    }
                }
                break;
            case k.STRING_SET_FIELD_NUMBER:
            case 11:
            case 20:
                return null;
            case k.DOUBLE_FIELD_NUMBER:
            case 14:
                if (F(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    break;
                }
                break;
            case k.BYTES_FIELD_NUMBER:
                if (F(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 > 29 && F(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (F(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (F(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (F(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (F(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (F(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i4 >= 26 && F(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    break;
                }
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    break;
                }
            case 12:
                if (F(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    break;
                }
                break;
            case 13:
                if (F(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (F(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (F(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (F(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (F(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    break;
                }
                break;
            case 15:
                if (F(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i5 = Build.VERSION.SDK_INT;
                if ((i5 < 29 || (i5 == 29 && Environment.isExternalStorageLegacy())) && F(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                }
            case 16:
                if (F(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    break;
                }
                break;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    break;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (F(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (F(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 21:
                if (F(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && F(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    break;
                }
            case 23:
                if (F(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    break;
                }
                break;
            case 24:
                if (F(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    break;
                }
                break;
            case 27:
                if (F(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    break;
                }
                break;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (o3 = o(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(o3);
                    break;
                }
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (o4 = o(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(o4);
                    break;
                }
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (o5 = o(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(o5);
                    break;
                }
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    break;
                }
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    break;
                }
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    break;
                }
            case 34:
                if (F(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    break;
                }
                break;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && F(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    break;
                }
            case 36:
                if (F(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    break;
                }
                break;
        }
        return arrayList;
    }

    public abstract boolean E();

    public abstract void S(byte[] bArr, int i3, int i4);

    public void a(String str, HashMap hashMap) {
        z().a(str, hashMap);
    }

    public void b(Serializable serializable) {
        z().b(serializable);
    }

    public abstract Typeface h(Context context, c cVar, Resources resources, int i3);

    public abstract Typeface i(Context context, x.g[] gVarArr, int i3);

    public Typeface j(Context context, InputStream inputStream) {
        File w3 = a.w(context);
        if (w3 == null) {
            return null;
        }
        try {
            if (!a.n(w3, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(w3.getPath());
            w3.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            w3.delete();
        }
    }

    public Typeface k(Context context, Resources resources, int i3, String str, int i4) {
        File w3 = a.w(context);
        if (w3 == null) {
            return null;
        }
        try {
            if (!a.m(w3, resources, i3)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(w3.getPath());
            w3.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            w3.delete();
        }
    }

    public abstract String m(byte[] bArr, int i3, int i4);

    public abstract int r(String str, byte[] bArr, int i3, int i4);

    public x.g s(x.g[] gVarArr, int i3) {
        int i4;
        boolean z3;
        int i5;
        new f(15);
        if ((i3 & 1) == 0) {
            i4 = 400;
        } else {
            i4 = 700;
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        x.g gVar = null;
        int i6 = Integer.MAX_VALUE;
        for (x.g gVar2 : gVarArr) {
            int abs = Math.abs(gVar2.f4761c - i4) * 2;
            if (gVar2.f4762d == z3) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            int i7 = abs + i5;
            if (gVar == null || i6 > i7) {
                gVar = gVar2;
                i6 = i7;
            }
        }
        return gVar;
    }

    public abstract Object t(String str);

    public String toString() {
        switch (this.f1972f) {
            case k.STRING_FIELD_NUMBER:
                return x() + " " + ((String) t("sql")) + " " + ((List) t("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract String x();

    public boolean y() {
        return Boolean.TRUE.equals(t("noResult"));
    }

    public abstract d z();

    public C0094a() {
        this.f1972f = 22;
        new ConcurrentHashMap();
    }
}
