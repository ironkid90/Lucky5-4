package C0;

import A.A;
import A2.h;
import B.m;
import F.a;
import F.f;
import F0.l;
import F0.y;
import L.k;
import T.C0082c;
import T.C0086g;
import T.s;
import W0.i;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j.C0244i;
import j.C0260z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f123f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f124g;

    public /* synthetic */ e(int i3, Object obj) {
        this.f123f = i3;
        this.f124g = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: i2.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[Catch:{ SecurityException -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9.f124g
            C0.f r0 = (C0.f) r0
            java.lang.Object r0 = r0.f129i
            io.flutter.plugins.firebase.messaging.a r0 = (io.flutter.plugins.firebase.messaging.a) r0
            i2.n r1 = r0.f3431f
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0044
            java.lang.Object r4 = r1.f3271b
            monitor-enter(r4)
            android.app.job.JobParameters r5 = r1.f3272c     // Catch:{ all -> 0x0018 }
            if (r5 != 0) goto L_0x001a
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
        L_0x0016:
            r4 = r3
            goto L_0x003e
        L_0x0018:
            r0 = move-exception
            goto L_0x0042
        L_0x001a:
            android.app.job.JobWorkItem r5 = r5.dequeueWork()     // Catch:{ SecurityException -> 0x0034 }
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            if (r5 == 0) goto L_0x0016
            android.content.Intent r4 = r5.getIntent()
            io.flutter.plugins.firebase.messaging.a r6 = r1.f3270a
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r4.setExtrasClassLoader(r6)
            i2.m r4 = new i2.m
            r4.<init>(r1, r5)
            goto L_0x003e
        L_0x0034:
            r1 = move-exception
            java.lang.String r5 = "JobServiceEngineImpl"
            java.lang.String r6 = "Failed to run mParams.dequeueWork()!"
            android.util.Log.e(r5, r6, r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            goto L_0x0016
        L_0x003e:
            if (r4 == 0) goto L_0x0044
            r3 = r4
            goto L_0x005e
        L_0x0042:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x0044:
            java.util.ArrayList r1 = r0.f3435j
            monitor-enter(r1)
            java.util.ArrayList r4 = r0.f3435j     // Catch:{ all -> 0x005a }
            int r4 = r4.size()     // Catch:{ all -> 0x005a }
            if (r4 <= 0) goto L_0x005d
            java.util.ArrayList r0 = r0.f3435j     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x005a }
            r3 = r0
            i2.k r3 = (i2.C0230k) r3     // Catch:{ all -> 0x005a }
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            goto L_0x00ef
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
        L_0x005e:
            if (r3 == 0) goto L_0x00dc
            java.lang.Object r0 = r9.f124g
            C0.f r0 = (C0.f) r0
            java.lang.Object r0 = r0.f129i
            io.flutter.plugins.firebase.messaging.a r0 = (io.flutter.plugins.firebase.messaging.a) r0
            android.content.Intent r1 = r3.getIntent()
            io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService r0 = (io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService) r0
            r0.getClass()
            C0.f r4 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService.f3427n
            r4.getClass()
            android.content.Context r4 = a.C0094a.f1971k
            java.lang.String r5 = "io.flutter.firebase.messaging.callback"
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r5, r2)
            java.lang.String r4 = "callback_handle"
            r5 = 0
            long r7 = r2.getLong(r4, r5)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x00d0
            java.util.List r2 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService.f3426m
            monitor-enter(r2)
            C0.f r4 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService.f3427n     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r4.f128h     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4     // Catch:{ all -> 0x00a5 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x00a5 }
            if (r4 != 0) goto L_0x00a7
            java.lang.String r0 = "FLTFireMsgService"
            java.lang.String r4 = "Service has not yet started, messages will be queued."
            android.util.Log.i(r0, r4)     // Catch:{ all -> 0x00a5 }
            r2.add(r1)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d7
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ce
        L_0x00a7:
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r4 = 1
            r2.<init>(r4)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = r0.getMainLooper()
            r4.<init>(r0)
            L1.h r0 = new L1.h
            r5 = 9
            r0.<init>(r5, r1, r2)
            r4.post(r0)
            r2.await()     // Catch:{ InterruptedException -> 0x00c5 }
            goto L_0x00d7
        L_0x00c5:
            r0 = move-exception
            java.lang.String r1 = "FLTFireMsgService"
            java.lang.String r2 = "Exception waiting to execute Dart callback"
            android.util.Log.i(r1, r2, r0)
            goto L_0x00d7
        L_0x00ce:
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            throw r0
        L_0x00d0:
            java.lang.String r0 = "FLTFireMsgService"
            java.lang.String r1 = "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered."
            android.util.Log.w(r0, r1)
        L_0x00d7:
            r3.a()
            goto L_0x0000
        L_0x00dc:
            java.lang.Object r0 = r9.f124g
            C0.f r0 = (C0.f) r0
            java.lang.Object r0 = r0.f127g
            android.os.Handler r0 = (android.os.Handler) r0
            C0.e r1 = new C0.e
            r2 = 11
            r1.<init>((int) r2, (java.lang.Object) r9)
            r0.post(r1)
            return
        L_0x00ef:
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.a():void");
    }

    public final void run() {
        long j3;
        Object obj;
        C0244i iVar;
        long j4 = 0;
        switch (this.f123f) {
            case 0:
                if (((i) this.f124g).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 1:
                f fVar = (f) this.f124g;
                if (fVar.f285o) {
                    boolean z3 = fVar.f283m;
                    a aVar = fVar.f271a;
                    if (z3) {
                        fVar.f283m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f264e = currentAnimationTimeMillis;
                        aVar.f266g = -1;
                        aVar.f265f = currentAnimationTimeMillis;
                        aVar.f267h = 0.5f;
                    }
                    if ((aVar.f266g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar.f266g + ((long) aVar.f268i)) && fVar.e()) {
                        boolean z4 = fVar.f284n;
                        ListView listView = fVar.f273c;
                        if (z4) {
                            fVar.f284n = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            listView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (aVar.f265f != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float a2 = aVar.a(currentAnimationTimeMillis2);
                            aVar.f265f = currentAnimationTimeMillis2;
                            float f3 = (float) (currentAnimationTimeMillis2 - aVar.f265f);
                            fVar.f287q.scrollListBy((int) (f3 * ((a2 * 4.0f) + (-4.0f * a2 * a2)) * aVar.f263d));
                            Field field = A.f0a;
                            listView.postOnAnimation(this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    fVar.f285o = false;
                    return;
                }
                return;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                ((l) this.f124g).h();
                return;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                E0.a aVar2 = ((l) ((m) this.f124g).f100g).f327d;
                aVar2.k(aVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case k.LONG_FIELD_NUMBER /*4*/:
                throw null;
            case k.STRING_FIELD_NUMBER /*5*/:
                ((f) this.f124g).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                C0086g gVar = (C0086g) this.f124g;
                int i3 = gVar.v;
                ValueAnimator valueAnimator = gVar.f1630u;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                gVar.v = 3;
                valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                s sVar = ((RecyclerView) this.f124g).f2595I;
                if (sVar != null) {
                    C0082c cVar = (C0082c) sVar;
                    ArrayList arrayList = cVar.f1594e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = cVar.f1596g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = cVar.f1597h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = cVar.f1595f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                            if (!isEmpty2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(arrayList2);
                                ArrayList arrayList6 = cVar.f1599j;
                                arrayList6.add(arrayList5);
                                arrayList2.clear();
                                if (isEmpty) {
                                    Iterator it2 = arrayList5.iterator();
                                    if (!it2.hasNext()) {
                                        arrayList5.clear();
                                        arrayList6.remove(arrayList5);
                                    } else {
                                        h.j(it2.next());
                                        throw null;
                                    }
                                } else {
                                    h.j(arrayList5.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty3) {
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.addAll(arrayList3);
                                ArrayList arrayList8 = cVar.f1600k;
                                arrayList8.add(arrayList7);
                                arrayList3.clear();
                                if (isEmpty) {
                                    Iterator it3 = arrayList7.iterator();
                                    if (!it3.hasNext()) {
                                        arrayList7.clear();
                                        arrayList8.remove(arrayList7);
                                    } else {
                                        h.j(it3.next());
                                        throw null;
                                    }
                                } else {
                                    h.j(arrayList7.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty4) {
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.addAll(arrayList4);
                                ArrayList arrayList10 = cVar.f1598i;
                                arrayList10.add(arrayList9);
                                arrayList4.clear();
                                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                    if (!isEmpty2) {
                                        j3 = cVar.f1657c;
                                    } else {
                                        j3 = 0;
                                    }
                                    if (!isEmpty3) {
                                        j4 = cVar.f1658d;
                                    }
                                    Math.max(j3, j4);
                                    arrayList9.get(0).getClass();
                                    throw new ClassCastException();
                                }
                                Iterator it4 = arrayList9.iterator();
                                if (!it4.hasNext()) {
                                    arrayList9.clear();
                                    arrayList10.remove(arrayList9);
                                    return;
                                }
                                it4.next().getClass();
                                throw new ClassCastException();
                            }
                            return;
                        }
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            case k.BYTES_FIELD_NUMBER /*8*/:
                ((StaggeredGridLayoutManager) this.f124g).J();
                return;
            case 9:
                V0.a aVar3 = (V0.a) this.f124g;
                synchronized (aVar3.f1857a) {
                    try {
                        if (aVar3.b()) {
                            Log.e("WakeLock", String.valueOf(aVar3.f1866j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar3.d();
                            if (aVar3.b()) {
                                aVar3.f1859c = 1;
                                aVar3.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 10:
                synchronized (((o) this.f124g).f2526a) {
                    obj = ((o) this.f124g).f2531f;
                    ((o) this.f124g).f2531f = o.f2523k;
                }
                o oVar = (o) this.f124g;
                oVar.getClass();
                o.a("setValue");
                oVar.f2532g++;
                oVar.f2530e = obj;
                oVar.b((n) null);
                return;
            case 11:
                ((io.flutter.plugins.firebase.messaging.a) ((f) ((e) this.f124g).f124g).f129i).c();
                return;
            case 12:
                a();
                return;
            case 13:
                C0260z zVar = (C0260z) this.f124g;
                zVar.f3827r = null;
                zVar.drawableStateChanged();
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.f124g).f2260f;
                if (actionMenuView != null && (iVar = actionMenuView.f2154x) != null) {
                    iVar.j();
                    return;
                }
                return;
            default:
                Object obj2 = ((b2.h) this.f124g).f2743g;
                return;
        }
    }

    public e(F0.i iVar, y yVar) {
        this.f123f = 4;
        this.f124g = yVar;
    }

    public e(b2.h hVar, int i3) {
        this.f123f = 15;
        this.f124g = hVar;
    }
}
