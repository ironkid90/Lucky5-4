package U1;

import B.m;
import W.a;
import a.C0094a;
import android.os.Build;
import android.os.Trace;
import c2.C0136d;
import c2.C0137e;
import c2.f;
import c2.k;
import io.flutter.embedding.engine.FlutterJNI;
import j1.e;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.C0332a;

public final class j implements f, k {

    /* renamed from: f  reason: collision with root package name */
    public final FlutterJNI f1784f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f1785g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f1786h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final Object f1787i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f1788j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f1789k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public int f1790l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final l f1791m = new l();

    /* renamed from: n  reason: collision with root package name */
    public final WeakHashMap f1792n = new WeakHashMap();

    /* renamed from: o  reason: collision with root package name */
    public final m f1793o;

    public j(FlutterJNI flutterJNI) {
        m mVar = new m(18);
        mVar.f100g = (ExecutorService) C0.f.O().f129i;
        this.f1784f = flutterJNI;
        this.f1793o = mVar;
    }

    public final void a(String str, f fVar, ByteBuffer byteBuffer, int i3, long j3) {
        e eVar;
        f fVar2 = fVar;
        if (fVar2 != null) {
            eVar = fVar2.f1775b;
        } else {
            eVar = null;
        }
        StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
        String str2 = str;
        sb.append(str);
        String a2 = C0332a.a(sb.toString());
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = i3;
            a.a(C0094a.N(a2), i3);
        } else {
            int i5 = i3;
            String N3 = C0094a.N(a2);
            try {
                if (C0094a.f1969i == null) {
                    C0094a.f1969i = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                C0094a.f1969i.invoke((Object) null, new Object[]{Long.valueOf(C0094a.f1967g), N3, Integer.valueOf(i3)});
            } catch (Exception e2) {
                C0094a.D("asyncTraceBegin", e2);
            }
        }
        c cVar = new c(this, str, i3, fVar, byteBuffer, j3);
        if (eVar == null) {
            eVar = this.f1791m;
        }
        eVar.a(cVar);
    }

    public final void b(String str, ByteBuffer byteBuffer) {
        r(str, byteBuffer, (C0137e) null);
    }

    public final e j(k kVar) {
        m mVar = this.f1793o;
        mVar.getClass();
        i iVar = new i((ExecutorService) mVar.f100g);
        e eVar = new e(9);
        this.f1792n.put(eVar, iVar);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r10.hasNext() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r11 = (U1.d) r10.next();
        a(r9, (U1.f) r8.f1785g.get(r9), r11.f1771a, r11.f1772b, r11.f1773c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.String r9, c2.C0136d r10, j1.e r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x000f
            java.lang.Object r0 = r8.f1787i
            monitor-enter(r0)
            java.util.HashMap r10 = r8.f1785g     // Catch:{ all -> 0x000c }
            r10.remove(r9)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r9
        L_0x000f:
            if (r11 == 0) goto L_0x0024
            java.util.WeakHashMap r0 = r8.f1792n
            java.lang.Object r11 = r0.get(r11)
            U1.e r11 = (U1.e) r11
            if (r11 == 0) goto L_0x001c
            goto L_0x0025
        L_0x001c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0024:
            r11 = 0
        L_0x0025:
            java.lang.Object r0 = r8.f1787i
            monitor-enter(r0)
            java.util.HashMap r1 = r8.f1785g     // Catch:{ all -> 0x003e }
            U1.f r2 = new U1.f     // Catch:{ all -> 0x003e }
            r2.<init>(r10, r11)     // Catch:{ all -> 0x003e }
            r1.put(r9, r2)     // Catch:{ all -> 0x003e }
            java.util.HashMap r10 = r8.f1786h     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x003e }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x003e }
            if (r10 != 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x003e:
            r9 = move-exception
            goto L_0x0067
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            java.util.Iterator r10 = r10.iterator()
        L_0x0045:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0066
            java.lang.Object r11 = r10.next()
            U1.d r11 = (U1.d) r11
            java.util.HashMap r0 = r8.f1785g
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            U1.f r3 = (U1.f) r3
            java.nio.ByteBuffer r4 = r11.f1771a
            int r5 = r11.f1772b
            long r6 = r11.f1773c
            r1 = r8
            r2 = r9
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x0045
        L_0x0066:
            return
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.j.l(java.lang.String, c2.d, j1.e):void");
    }

    public final void q(String str, C0136d dVar) {
        l(str, dVar, (e) null);
    }

    public final void r(String str, ByteBuffer byteBuffer, C0137e eVar) {
        C0332a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f1790l;
            this.f1790l = i3 + 1;
            if (eVar != null) {
                this.f1789k.put(Integer.valueOf(i3), eVar);
            }
            FlutterJNI flutterJNI = this.f1784f;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
