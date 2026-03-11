package b2;

import A.C0002c;
import C0.u;
import I.C0042s;
import L.k;
import L2.d;
import L2.e;
import S1.B;
import S1.C0078d;
import a.C0094a;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import c2.n;
import c2.o;
import c2.p;
import i.C0207i;
import i.C0212n;
import i.C0217s;
import io.flutter.plugin.editing.b;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.l;
import io.flutter.plugin.platform.r;
import j.C0244i;
import j.C0247l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C0368h;
import r2.C0420d;
import s1.C0464y;
import s2.C0466a;
import y1.m;

public final class h implements o, b, C0212n, C0247l, d, m {

    /* renamed from: h  reason: collision with root package name */
    public static h f2741h;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2742f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2743g;

    public /* synthetic */ h(int i3) {
        this.f2742f = i3;
    }

    public static HashMap A(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = z((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static String I(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static h m() {
        if (f2741h == null) {
            f2741h = new h(5);
        }
        return f2741h;
    }

    public static boolean y(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static ArrayList z(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object obj = jSONArray.get(i3);
            if (obj instanceof JSONArray) {
                obj = z((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public void B(int i3, double d3, double d4) {
        l lVar = (l) this.f2743g;
        if (!lVar.c(i3)) {
            io.flutter.plugin.platform.h hVar = (io.flutter.plugin.platform.h) lVar.f3409s.get(i3);
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
        }
    }

    public void C(d dVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        d dVar2 = dVar;
        l lVar = (l) this.f2743g;
        float f3 = lVar.f3397g.getResources().getDisplayMetrics().density;
        int i3 = dVar2.f2713a;
        if (lVar.c(i3)) {
            r rVar = (r) lVar.f3404n.get(Integer.valueOf(i3));
            B b3 = new B(dVar2.f2728p);
            while (true) {
                C0.r rVar2 = lVar.f3414y;
                priorityQueue = (PriorityQueue) rVar2.f161h;
                boolean isEmpty = priorityQueue.isEmpty();
                longSparseArray = (LongSparseArray) rVar2.f160g;
                j3 = b3.f1424a;
                if (!isEmpty && ((Long) priorityQueue.peek()).longValue() < j3) {
                    longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
                }
            }
            if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
                priorityQueue.poll();
            }
            MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
            longSparseArray.remove(j3);
            ArrayList arrayList = new ArrayList();
            for (List list : (List) dVar2.f2719g) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
                pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
                pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
                double d3 = (double) f3;
                pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d3);
                pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d3);
                pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d3);
                pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d3);
                pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d3);
                pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d3);
                arrayList.add(pointerCoords);
            }
            int i4 = dVar2.f2717e;
            MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i4]);
            ArrayList arrayList2 = new ArrayList();
            for (List list2 : (List) dVar2.f2718f) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list2.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            long longValue = dVar2.f2714b.longValue();
            long longValue2 = dVar2.f2715c.longValue();
            int i5 = dVar2.f2726n;
            int i6 = dVar2.f2727o;
            MotionEvent.obtain(longValue, longValue2, dVar2.f2716d, dVar2.f2717e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i4]), pointerCoordsArr, dVar2.f2720h, dVar2.f2721i, dVar2.f2722j, dVar2.f2723k, dVar2.f2724l, dVar2.f2725m, i5, i6);
            rVar.getClass();
        } else if (lVar.f3406p.get(i3) == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
        } else {
            throw new ClassCastException();
        }
    }

    public Bundle D() {
        Bundle bundle = (Bundle) this.f2743g;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public void E(String str) {
        v().edit().remove(str).apply();
        String string = v().getString("notification_ids", "");
        if (!string.isEmpty()) {
            v().edit().putString("notification_ids", string.replace(str.concat(","), "")).apply();
        }
    }

    public void F(e eVar, C0002c cVar) {
        l lVar = (l) this.f2743g;
        int i3 = lVar.i(eVar.f2730b);
        int i4 = lVar.i(eVar.f2731c);
        int i5 = eVar.f2729a;
        if (lVar.c(i5)) {
            float f3 = lVar.f3397g.getResources().getDisplayMetrics().density;
            r rVar = (r) lVar.f3404n.get(Integer.valueOf(i5));
            j jVar = lVar.f3401k;
            if (jVar != null) {
                if (jVar.f3360e.f55b == 3) {
                    jVar.f3371p = true;
                }
                rVar.getClass();
            }
            rVar.getClass();
            if (i3 == 0 && i4 == 0) {
                throw null;
            } else if (Build.VERSION.SDK_INT >= 31) {
                throw null;
            } else {
                throw null;
            }
        } else if (lVar.f3406p.get(i5) == null) {
            io.flutter.plugin.platform.h hVar = (io.flutter.plugin.platform.h) lVar.f3409s.get(i5);
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i5);
        } else {
            throw new ClassCastException();
        }
    }

    public void G(int i3, int i4) {
        if (i4 == 0 || i4 == 1) {
            l lVar = (l) this.f2743g;
            if (lVar.c(i3)) {
                ((r) lVar.f3404n.get(Integer.valueOf(i3))).getClass();
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i3);
            } else if (lVar.f3406p.get(i3) == null) {
                Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
            } else {
                throw new ClassCastException();
            }
        } else {
            throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
        }
    }

    public void H(ArrayList arrayList) {
        int i3;
        f fVar = (f) this.f2743g;
        fVar.getClass();
        if (arrayList.isEmpty()) {
            i3 = 5894;
        } else {
            i3 = 1798;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int ordinal = ((c) arrayList.get(i4)).ordinal();
            if (ordinal == 0) {
                i3 &= -5;
            } else if (ordinal == 1) {
                i3 &= -515;
            }
        }
        fVar.f3378a = i3;
        fVar.c();
    }

    public void J(int i3) {
        View decorView = ((C0078d) ((f) this.f2743g).f3379b).getWindow().getDecorView();
        int b3 = L.j.b(i3);
        if (b3 == 0) {
            decorView.performHapticFeedback(0);
        } else if (b3 == 1) {
            decorView.performHapticFeedback(1);
        } else if (b3 == 2) {
            decorView.performHapticFeedback(3);
        } else if (b3 == 3) {
            decorView.performHapticFeedback(6);
        } else if (b3 == 4) {
            decorView.performHapticFeedback(4);
        }
    }

    public void a(C0207i iVar, boolean z3) {
        if (iVar instanceof C0217s) {
            ((C0217s) iVar).v.j().c(false);
        }
        C0212n nVar = ((C0244i) this.f2743g).f3700j;
        if (nVar != null) {
            nVar.a(iVar, z3);
        }
    }

    public boolean b(C0217s sVar) {
        if (sVar == null) {
            return false;
        }
        sVar.f3229w.getClass();
        C0244i iVar = (C0244i) this.f2743g;
        iVar.getClass();
        C0212n nVar = iVar.f3700j;
        if (nVar != null) {
            return nVar.b(sVar);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.AbstractMap, java.util.HashMap, S1.x] */
    public void c(String str) {
        n nVar = (n) this.f2743g;
        S1.o oVar = (S1.o) nVar.f2789g;
        if (n.f2787i == null) {
            ? hashMap = new HashMap();
            hashMap.put("alias", 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", 1000);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            n.f2787i = hashMap;
        }
        oVar.setPointerIcon(PointerIcon.getSystemIcon(((S1.o) nVar.f2789g).getContext(), ((Integer) n.f2787i.getOrDefault(str, 1000)).intValue()));
    }

    public void e(int i3) {
        l lVar = (l) this.f2743g;
        if (lVar.c(i3)) {
            ((r) lVar.f3404n.get(Integer.valueOf(i3))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
        } else if (lVar.f3406p.get(i3) == null) {
            Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
        } else {
            throw new ClassCastException();
        }
    }

    public void f(u uVar) {
        l lVar = (l) this.f2743g;
        lVar.getClass();
        l.e(lVar, uVar);
        if (!lVar.f3399i.IsSurfaceControlEnabled()) {
            String str = (String) uVar.f174c;
            if (((HashMap) lVar.f3396f.f2912g).get(str) == null) {
                throw new IllegalStateException(A2.h.g("Trying to create a platform view of unregistered type: ", str));
            }
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
    }

    public Object g(e eVar, C0420d dVar) {
        Object g2 = ((d) this.f2743g).g(new C0042s(eVar, 1), dVar);
        if (g2 == C0466a.f4632f) {
            return g2;
        }
        return C0368h.f4194a;
    }

    public long h(u uVar) {
        l lVar = (l) this.f2743g;
        l.e(lVar, uVar);
        SparseArray sparseArray = lVar.f3409s;
        int i3 = uVar.f172a;
        if (sparseArray.get(i3) != null) {
            throw new IllegalStateException(A2.h.e("Trying to create an already created platform view, view id: ", i3));
        } else if (lVar.f3400j == null) {
            throw new IllegalStateException(A2.h.e("Texture registry is null. This means that platform views controller was detached, view id: ", i3));
        } else if (lVar.f3398h != null) {
            String str = (String) uVar.f174c;
            if (((HashMap) lVar.f3396f.f2912g).get(str) == null) {
                throw new IllegalStateException(A2.h.g("Trying to create a platform view of unregistered type: ", str));
            }
            throw new ClassCastException();
        } else {
            throw new IllegalStateException(A2.h.e("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i3));
        }
    }

    public void i(int i3) {
        A2.h.j(((l) this.f2743g).f3406p.get(i3));
        Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
    }

    public boolean j(String str) {
        String w3 = w(str);
        if ("1".equals(w3) || Boolean.parseBoolean(w3)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        android.util.Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        android.util.Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e A[Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }, ExcHandler: SecurityException (r9v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE, Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }]), Splitter:B:2:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:2:0x001d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence k(b2.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = "PlatformPlugin"
            java.lang.String r1 = "Clipboard item contains a Uri with scheme '"
            java.lang.Object r2 = r8.f2743g
            io.flutter.plugin.platform.f r2 = (io.flutter.plugin.platform.f) r2
            android.content.Context r2 = r2.f3379b
            S1.d r2 = (S1.C0078d) r2
            java.lang.String r3 = "clipboard"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            boolean r4 = r3.hasPrimaryClip()
            r5 = 0
            if (r4 != 0) goto L_0x001d
            goto L_0x009a
        L_0x001d:
            android.content.ClipData r3 = r3.getPrimaryClip()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }
            if (r3 != 0) goto L_0x0025
            goto L_0x009a
        L_0x0025:
            if (r9 == 0) goto L_0x0031
            b2.b r4 = b2.b.f2706g     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }
            if (r9 != r4) goto L_0x009a
            goto L_0x0031
        L_0x002c:
            r9 = move-exception
            goto L_0x0089
        L_0x002e:
            r9 = move-exception
            goto L_0x0095
        L_0x0031:
            r9 = 0
            android.content.ClipData$Item r9 = r3.getItemAt(r9)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }
            java.lang.CharSequence r3 = r9.getText()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x002c }
            if (r3 != 0) goto L_0x0087
            android.net.Uri r4 = r9.getUri()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            if (r4 != 0) goto L_0x004c
            java.lang.String r9 = "Clipboard item contained no textual content nor a URI to retrieve it from."
            android.util.Log.w(r0, r9)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            goto L_0x009a
        L_0x0048:
            r5 = r3
            goto L_0x0089
        L_0x004a:
            r9 = move-exception
            goto L_0x0048
        L_0x004c:
            java.lang.String r6 = r4.getScheme()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            java.lang.String r7 = "content"
            boolean r7 = r6.equals(r7)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            if (r7 != 0) goto L_0x006d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            r9.<init>(r1)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            r9.append(r6)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            java.lang.String r1 = "'that is unhandled."
            r9.append(r1)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            java.lang.String r9 = r9.toString()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            android.util.Log.w(r0, r9)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            goto L_0x009a
        L_0x006d:
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            java.lang.String r6 = "text/*"
            android.content.res.AssetFileDescriptor r1 = r1.openTypedAssetFileDescriptor(r4, r6, r5)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            java.lang.CharSequence r9 = r9.coerceToText(r2)     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x004a }
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ SecurityException -> 0x002e, FileNotFoundException -> 0x008f, IOException -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r1 = move-exception
            r5 = r9
            r9 = r1
            goto L_0x0089
        L_0x0085:
            r5 = r9
            goto L_0x009a
        L_0x0087:
            r5 = r3
            goto L_0x009a
        L_0x0089:
            java.lang.String r1 = "Failed to close AssetFileDescriptor while trying to read text from URI."
            android.util.Log.w(r0, r1, r9)
            goto L_0x009a
        L_0x008f:
            java.lang.String r9 = "Clipboard text was unable to be received from content URI."
            android.util.Log.w(r0, r9)
            goto L_0x009a
        L_0x0095:
            java.lang.String r1 = "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
            android.util.Log.w(r0, r1, r9)
        L_0x009a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.h.k(b2.b):java.lang.CharSequence");
    }

    public HashMap l(String str) {
        String string = v().getString(str, (String) null);
        if (string != null) {
            try {
                HashMap hashMap = new HashMap(1);
                HashMap A3 = A(new JSONObject(string));
                A3.put("to", str);
                hashMap.put("message", A3);
                return hashMap;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public Integer n(String str) {
        String w3 = w(str);
        if (TextUtils.isEmpty(w3)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(w3));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + I(str) + "(" + w3 + ") into an int");
            return null;
        }
    }

    public JSONArray o(String str) {
        String w3 = w(str);
        if (TextUtils.isEmpty(w3)) {
            return null;
        }
        try {
            return new JSONArray(w3);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + I(str) + ": " + w3 + ", falling back to default");
            return null;
        }
    }

    public void onMethodCall(c2.m mVar, p pVar) {
        int i3 = 2;
        boolean z3 = true;
        switch (this.f2742f) {
            case 0:
                F0.h hVar = (F0.h) this.f2743g;
                if (((L1.l) hVar.f322g) != null) {
                    String str = mVar.f2785a;
                    str.getClass();
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -1937987631:
                            if (str.equals("SensitiveContent.getContentSensitivity")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 598223325:
                            if (str.equals("SensitiveContent.setContentSensitivity")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1615625817:
                            if (str.equals("SensitiveContent.isSupported")) {
                                c3 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            try {
                                int f3 = ((L1.l) hVar.f322g).f();
                                if (f3 == 0) {
                                    i3 = 0;
                                } else if (f3 == 1) {
                                    i3 = 1;
                                } else if (f3 != 2) {
                                    i3 = 3;
                                }
                                ((f) pVar).b(Integer.valueOf(i3));
                                return;
                            } catch (IllegalArgumentException | IllegalStateException e2) {
                                ((f) pVar).a("error", e2.getMessage(), (Object) null);
                                return;
                            }
                        case 1:
                            try {
                                ((L1.l) hVar.f322g).g(F0.h.t(hVar, ((Integer) mVar.f2786b).intValue()));
                                return;
                            } catch (IllegalArgumentException | IllegalStateException e3) {
                                ((f) pVar).a("error", e3.getMessage(), (Object) null);
                                return;
                            }
                        case k.FLOAT_FIELD_NUMBER:
                            ((L1.l) hVar.f322g).getClass();
                            if (Build.VERSION.SDK_INT < 35) {
                                z3 = false;
                            }
                            ((f) pVar).b(Boolean.valueOf(z3));
                            return;
                        default:
                            ((f) pVar).c();
                            return;
                    }
                } else {
                    return;
                }
            default:
                F0.h hVar2 = (F0.h) this.f2743g;
                if (((io.flutter.plugin.editing.h) hVar2.f322g) != null) {
                    String str2 = mVar.f2785a;
                    Object obj = mVar.f2786b;
                    str2.getClass();
                    if (!str2.equals("SpellCheck.initiateSpellCheck")) {
                        ((f) pVar).c();
                        return;
                    }
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        ((io.flutter.plugin.editing.h) hVar2.f322g).a((String) arrayList.get(0), (String) arrayList.get(1), (f) pVar);
                        return;
                    } catch (IllegalStateException e4) {
                        ((f) pVar).a("error", e4.getMessage(), (Object) null);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public int[] p() {
        JSONArray o3 = o("gcm.n.light_settings");
        if (o3 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (o3.length() == 3) {
                int parseColor = Color.parseColor(o3.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = o3.optInt(1);
                    iArr[2] = o3.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + o3 + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e2) {
            Log.w("NotificationParams", "LightSettings is invalid: " + o3 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] q(String str) {
        JSONArray o3 = o(str.concat("_loc_args"));
        if (o3 == null) {
            return null;
        }
        int length = o3.length();
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = o3.optString(i3);
        }
        return strArr;
    }

    public Object r() {
        Constructor constructor = (Constructor) this.f2743g;
        try {
            return constructor.newInstance((Object[]) null);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3.getTargetException());
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }

    public String s(String str) {
        return w(str.concat("_loc_key"));
    }

    public Long t() {
        String w3 = w("gcm.n.event_time");
        if (TextUtils.isEmpty(w3)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(w3));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + I("gcm.n.event_time") + "(" + w3 + ") into a long");
            return null;
        }
    }

    public String u(Resources resources, String str, String str2) {
        String w3 = w(str2);
        if (!TextUtils.isEmpty(w3)) {
            return w3;
        }
        String s3 = s(str2);
        if (TextUtils.isEmpty(s3)) {
            return null;
        }
        int identifier = resources.getIdentifier(s3, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", I(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] q3 = q(str2);
        if (q3 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, q3);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + I(str2) + ": " + Arrays.toString(q3) + " Default value will be used.", e2);
            return null;
        }
    }

    public SharedPreferences v() {
        if (((SharedPreferences) this.f2743g) == null) {
            this.f2743g = C0094a.f1971k.getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return (SharedPreferences) this.f2743g;
    }

    public String w(String str) {
        String str2;
        Bundle bundle = (Bundle) this.f2743g;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public long[] x() {
        JSONArray o3 = o("gcm.n.vibrate_timings");
        if (o3 == null) {
            return null;
        }
        try {
            if (o3.length() > 1) {
                int length = o3.length();
                long[] jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = o3.optLong(i3);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + o3 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public /* synthetic */ h(int i3, Object obj) {
        this.f2742f = i3;
        this.f2743g = obj;
    }

    public h(U1.b bVar) {
        this.f2742f = 2;
        this.f2743g = new C0464y(bVar, "flutter/system", c2.j.f2783a, (j1.e) null);
    }

    public h(Bundle bundle) {
        this.f2742f = 12;
        if (bundle != null) {
            this.f2743g = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
}
