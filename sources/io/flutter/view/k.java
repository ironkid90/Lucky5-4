package io.flutter.view;

import android.util.Log;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Method f3554a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f3555b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f3556c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3557d;

    /* renamed from: e  reason: collision with root package name */
    public final Field f3558e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f3559f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k() {
        /*
            r8 = this;
            java.lang.String r0 = "getSourceNodeId"
            java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r1 = android.view.accessibility.AccessibilityNodeInfo.class
            java.lang.String r2 = "AccessibilityBridge"
            r8.<init>()
            r3 = 0
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x000f }
            goto L_0x0015
        L_0x000f:
            java.lang.String r4 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
            android.util.Log.w(r2, r4)
            r4 = r3
        L_0x0015:
            java.lang.Class<android.view.accessibility.AccessibilityRecord> r5 = android.view.accessibility.AccessibilityRecord.class
            java.lang.reflect.Method r0 = r5.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001c }
            goto L_0x0022
        L_0x001c:
            java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
            android.util.Log.w(r2, r0)
            r0 = r3
        L_0x0022:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 > r6) goto L_0x004d
            java.lang.String r5 = "getParentNodeId"
            java.lang.reflect.Method r5 = r1.getMethod(r5, r3)     // Catch:{ NoSuchMethodException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            java.lang.String r5 = "can't invoke getParentNodeId with reflection"
            android.util.Log.w(r2, r5)
            r5 = r3
        L_0x0035:
            java.lang.String r6 = "getChildId"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0045 }
            r2 = r3
        L_0x0042:
            r3 = r5
        L_0x0043:
            r5 = r2
            goto L_0x0075
        L_0x0045:
            java.lang.String r1 = "can't invoke getChildId with reflection"
            android.util.Log.w(r2, r1)
            r1 = r3
            r2 = r1
            goto L_0x0042
        L_0x004d:
            java.lang.String r5 = "mChildNodeIds"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            r5 = 1
            r1.setAccessible(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            java.lang.String r5 = "android.util.LongArray"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            java.lang.String r6 = "get"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            java.lang.reflect.Method r2 = r5.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x006d }
            r5 = r2
            r2 = r1
            r1 = r3
            goto L_0x0075
        L_0x006d:
            java.lang.String r1 = "can't access childNodeIdsField with reflection"
            android.util.Log.w(r2, r1)
            r1 = r3
            r2 = r1
            goto L_0x0043
        L_0x0075:
            r8.f3554a = r4
            r8.f3555b = r3
            r8.f3556c = r0
            r8.f3557d = r1
            r8.f3558e = r2
            r8.f3559f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.k.<init>():void");
    }

    public static Long a(k kVar, AccessibilityRecord accessibilityRecord) {
        Method method = kVar.f3556c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, (Object[]) null);
        } catch (IllegalAccessException e2) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e3);
            return null;
        }
    }

    public static boolean b(long j3, int i3) {
        return (j3 & (1 << i3)) != 0;
    }
}
