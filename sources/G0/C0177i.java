package g0;

import A2.i;
import C0.f;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.C0148j;
import d2.C0152a;
import java.util.LinkedHashMap;
import q2.l;
import z.a;

/* renamed from: g0.i  reason: case insensitive filesystem */
public final class C0177i {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f2968a;

    /* renamed from: b  reason: collision with root package name */
    public final C0174f f2969b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2970c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2971d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public f f2972e;

    public C0177i(Context context) {
        i.e(context, "context");
        SidecarInterface b3 = C0175g.b(context);
        C0174f fVar = new C0174f();
        this.f2968a = b3;
        this.f2969b = fVar;
    }

    public final SidecarInterface d() {
        return this.f2968a;
    }

    public final C0148j e(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder a2 = C0175g.a(activity);
        if (a2 == null) {
            return new C0148j(l.f4396f);
        }
        SidecarInterface sidecarInterface = this.f2968a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a2);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        SidecarInterface sidecarInterface2 = this.f2968a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f2969b.e(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        boolean z3;
        SidecarInterface sidecarInterface;
        IBinder a2 = C0175g.a(activity);
        if (a2 != null) {
            SidecarInterface sidecarInterface2 = this.f2968a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
            }
            LinkedHashMap linkedHashMap = this.f2971d;
            if (((a) linkedHashMap.get(activity)) != null) {
                linkedHashMap.remove(activity);
            }
            f fVar = this.f2972e;
            if (fVar != null) {
                fVar.w(activity);
            }
            LinkedHashMap linkedHashMap2 = this.f2970c;
            if (linkedHashMap2.size() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            linkedHashMap2.remove(a2);
            if (z3 && (sidecarInterface = this.f2968a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f2970c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f2968a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f2968a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        f fVar = this.f2972e;
        if (fVar != null) {
            fVar.R(activity, e(activity));
        }
        this.f2971d.get(activity);
    }

    public final void h(C0152a aVar) {
        this.f2972e = new f(aVar);
        SidecarInterface sidecarInterface = this.f2968a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f2969b, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:54|55|56|57|63|64|65|66|67|(2:69|84)(2:70|71)) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x010b */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0141 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0176 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x019a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r10 = this;
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r1 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            androidx.window.sidecar.SidecarInterface r4 = r10.f2968a     // Catch:{ all -> 0x019a }
            r5 = 0
            if (r4 == 0) goto L_0x0020
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0020
            java.lang.String r6 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r7 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch:{ all -> 0x019a }
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            if (r4 == 0) goto L_0x0028
            java.lang.Class r4 = r4.getReturnType()     // Catch:{ all -> 0x019a }
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r7 = A2.i.a(r4, r6)     // Catch:{ all -> 0x019a }
            if (r7 == 0) goto L_0x0188
            androidx.window.sidecar.SidecarInterface r3 = r10.f2968a     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x0038
            r3.getDeviceState()     // Catch:{ all -> 0x019a }
        L_0x0038:
            androidx.window.sidecar.SidecarInterface r3 = r10.f2968a     // Catch:{ all -> 0x019a }
            r4 = 1
            if (r3 == 0) goto L_0x0040
            r3.onDeviceStateListenersChanged(r4)     // Catch:{ all -> 0x019a }
        L_0x0040:
            androidx.window.sidecar.SidecarInterface r3 = r10.f2968a     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r3 == 0) goto L_0x0057
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x0057
            java.lang.String r8 = "getWindowLayoutInfo"
            java.lang.Class[] r9 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r3 = r3.getMethod(r8, r9)     // Catch:{ all -> 0x019a }
            goto L_0x0058
        L_0x0057:
            r3 = r5
        L_0x0058:
            if (r3 == 0) goto L_0x005f
            java.lang.Class r3 = r3.getReturnType()     // Catch:{ all -> 0x019a }
            goto L_0x0060
        L_0x005f:
            r3 = r5
        L_0x0060:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r8 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r8 = A2.i.a(r3, r8)     // Catch:{ all -> 0x019a }
            if (r8 == 0) goto L_0x0176
            androidx.window.sidecar.SidecarInterface r2 = r10.f2968a     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x007d
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x007d
            java.lang.String r3 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r8 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r8)     // Catch:{ all -> 0x019a }
            goto L_0x007e
        L_0x007d:
            r2 = r5
        L_0x007e:
            if (r2 == 0) goto L_0x0085
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
            goto L_0x0086
        L_0x0085:
            r2 = r5
        L_0x0086:
            boolean r3 = A2.i.a(r2, r6)     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x0164
            androidx.window.sidecar.SidecarInterface r1 = r10.f2968a     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x00a1
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x019a }
            if (r1 == 0) goto L_0x00a1
            java.lang.String r2 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r3 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ all -> 0x019a }
            goto L_0x00a2
        L_0x00a1:
            r1 = r5
        L_0x00a2:
            if (r1 == 0) goto L_0x00a9
            java.lang.Class r1 = r1.getReturnType()     // Catch:{ all -> 0x019a }
            goto L_0x00aa
        L_0x00a9:
            r1 = r5
        L_0x00aa:
            boolean r2 = A2.i.a(r1, r6)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0152
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x019a }
            r0.<init>()     // Catch:{ all -> 0x019a }
            r1 = 3
            r0.posture = r1     // Catch:{ NoSuchFieldError -> 0x00b9 }
            goto L_0x00eb
        L_0x00b9:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r2 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r3 = "setPosture"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x019a }
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch:{ all -> 0x019a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x019a }
            r2.invoke(r0, r3)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r2 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r3 = "getPosture"
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ all -> 0x019a }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            A2.i.c(r0, r2)     // Catch:{ all -> 0x019a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x019a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x019a }
            if (r0 != r1) goto L_0x014a
        L_0x00eb:
            androidx.window.sidecar.SidecarDisplayFeature r0 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x019a }
            r0.<init>()     // Catch:{ all -> 0x019a }
            android.graphics.Rect r1 = r0.getRect()     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "displayFeature.rect"
            A2.i.d(r1, r2)     // Catch:{ all -> 0x019a }
            r0.setRect(r1)     // Catch:{ all -> 0x019a }
            r0.getType()     // Catch:{ all -> 0x019a }
            r0.setType(r4)     // Catch:{ all -> 0x019a }
            androidx.window.sidecar.SidecarWindowLayoutInfo r1 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x019a }
            r1.<init>()     // Catch:{ all -> 0x019a }
            java.util.List r0 = r1.displayFeatures     // Catch:{ NoSuchFieldError -> 0x010b }
            goto L_0x019b
        L_0x010b:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            r2.add(r0)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r3 = "setDisplayFeatures"
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x019a }
            r0.invoke(r1, r3)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r3 = "getDisplayFeatures"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch:{ all -> 0x019a }
            java.lang.Object r0 = r0.invoke(r1, r5)     // Catch:{ all -> 0x019a }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            A2.i.c(r0, r1)     // Catch:{ all -> 0x019a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x019a }
            boolean r0 = A2.i.a(r2, r0)     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0142
            goto L_0x019b
        L_0x0142:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r1 = "Invalid display feature getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x014a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r1 = "Invalid device posture getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0152:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r3.<init>(r0)     // Catch:{ all -> 0x019a }
            r3.append(r1)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x019a }
            r2.<init>(r0)     // Catch:{ all -> 0x019a }
            throw r2     // Catch:{ all -> 0x019a }
        L_0x0164:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r3.<init>(r1)     // Catch:{ all -> 0x019a }
            r3.append(r2)     // Catch:{ all -> 0x019a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x019a }
            r0.<init>(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0176:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r1.<init>(r2)     // Catch:{ all -> 0x019a }
            r1.append(r3)     // Catch:{ all -> 0x019a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x019a }
            r0.<init>(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0188:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r1.<init>(r3)     // Catch:{ all -> 0x019a }
            r1.append(r4)     // Catch:{ all -> 0x019a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x019a }
            r0.<init>(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r4 = 0
        L_0x019b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0177i.i():boolean");
    }
}
