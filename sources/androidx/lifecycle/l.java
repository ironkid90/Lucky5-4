package androidx.lifecycle;

import A2.i;
import L2.s;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k.C0268a;
import l.C0305a;
import l.C0306b;
import l.C0307c;
import l.C0308d;

public final class l extends f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2509a = true;

    /* renamed from: b  reason: collision with root package name */
    public C0305a f2510b = new C0305a();

    /* renamed from: c  reason: collision with root package name */
    public e f2511c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f2512d;

    /* renamed from: e  reason: collision with root package name */
    public int f2513e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2514f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2515g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2516h;

    /* renamed from: i  reason: collision with root package name */
    public final s f2517i;

    public l(j jVar) {
        new AtomicReference();
        e eVar = e.f2501g;
        this.f2511c = eVar;
        this.f2516h = new ArrayList();
        this.f2512d = new WeakReference(jVar);
        this.f2517i = new s(eVar);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, androidx.lifecycle.k] */
    public final void a(i iVar) {
        Object obj;
        j jVar;
        boolean z3;
        ArrayList arrayList = this.f2516h;
        c("addObserver");
        e eVar = this.f2511c;
        e eVar2 = e.f2500f;
        if (eVar != eVar2) {
            eVar2 = e.f2501g;
        }
        ? obj2 = new Object();
        int i3 = m.f2518a;
        obj2.f2508b = iVar;
        obj2.f2507a = eVar2;
        C0305a aVar = this.f2510b;
        C0307c a2 = aVar.a(iVar);
        if (a2 != null) {
            obj = a2.f3992g;
        } else {
            HashMap hashMap = aVar.f3987j;
            C0307c cVar = new C0307c(iVar, obj2);
            aVar.f4001i++;
            C0307c cVar2 = aVar.f3999g;
            if (cVar2 == null) {
                aVar.f3998f = cVar;
                aVar.f3999g = cVar;
            } else {
                cVar2.f3993h = cVar;
                cVar.f3994i = cVar2;
                aVar.f3999g = cVar;
            }
            hashMap.put(iVar, cVar);
            obj = null;
        }
        if (((k) obj) == null && (jVar = (j) this.f2512d.get()) != null) {
            if (this.f2513e != 0 || this.f2514f) {
                z3 = true;
            } else {
                z3 = false;
            }
            e b3 = b(iVar);
            this.f2513e++;
            while (obj2.f2507a.compareTo(b3) < 0 && this.f2510b.f3987j.containsKey(iVar)) {
                arrayList.add(obj2.f2507a);
                b bVar = d.Companion;
                e eVar3 = obj2.f2507a;
                bVar.getClass();
                d a3 = b.a(eVar3);
                if (a3 != null) {
                    obj2.a(jVar, a3);
                    arrayList.remove(arrayList.size() - 1);
                    b3 = b(iVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj2.f2507a);
                }
            }
            if (!z3) {
                e();
            }
            this.f2513e--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.e b(androidx.lifecycle.i r4) {
        /*
            r3 = this;
            l.a r0 = r3.f2510b
            java.util.HashMap r0 = r0.f3987j
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            l.c r4 = (l.C0307c) r4
            l.c r4 = r4.f3994i
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.f3992g
            androidx.lifecycle.k r4 = (androidx.lifecycle.k) r4
            androidx.lifecycle.e r4 = r4.f2507a
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            java.util.ArrayList r0 = r3.f2516h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0034
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.e r2 = (androidx.lifecycle.e) r2
        L_0x0034:
            androidx.lifecycle.e r0 = r3.f2511c
            java.lang.String r1 = "state1"
            A2.i.e(r0, r1)
            if (r4 == 0) goto L_0x0044
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x004e
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.b(androidx.lifecycle.i):androidx.lifecycle.e");
    }

    public final void c(String str) {
        if (this.f2509a) {
            C0268a.b0().f3858d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
            }
        }
    }

    public final void d(d dVar) {
        i.e(dVar, "event");
        c("handleLifecycleEvent");
        e a2 = dVar.a();
        e eVar = this.f2511c;
        if (eVar != a2) {
            e eVar2 = e.f2501g;
            e eVar3 = e.f2500f;
            if (eVar == eVar2 && a2 == eVar3) {
                throw new IllegalStateException(("no event down from " + this.f2511c + " in component " + this.f2512d.get()).toString());
            }
            this.f2511c = a2;
            if (this.f2514f || this.f2513e != 0) {
                this.f2515g = true;
                return;
            }
            this.f2514f = true;
            e();
            this.f2514f = false;
            if (this.f2511c == eVar3) {
                this.f2510b = new C0305a();
            }
        }
    }

    public final void e() {
        d dVar;
        j jVar = (j) this.f2512d.get();
        if (jVar != null) {
            while (true) {
                C0305a aVar = this.f2510b;
                if (aVar.f4001i != 0) {
                    C0307c cVar = aVar.f3998f;
                    i.b(cVar);
                    e eVar = ((k) cVar.f3992g).f2507a;
                    C0307c cVar2 = this.f2510b.f3999g;
                    i.b(cVar2);
                    e eVar2 = ((k) cVar2.f3992g).f2507a;
                    if (eVar == eVar2 && this.f2511c == eVar2) {
                        break;
                    }
                    this.f2515g = false;
                    e eVar3 = this.f2511c;
                    C0307c cVar3 = this.f2510b.f3998f;
                    i.b(cVar3);
                    if (eVar3.compareTo(((k) cVar3.f3992g).f2507a) < 0) {
                        C0305a aVar2 = this.f2510b;
                        C0306b bVar = new C0306b(aVar2.f3999g, aVar2.f3998f, 1);
                        aVar2.f4000h.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f2515g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            i.d(entry, "next()");
                            i iVar = (i) entry.getKey();
                            k kVar = (k) entry.getValue();
                            while (kVar.f2507a.compareTo(this.f2511c) > 0 && !this.f2515g && this.f2510b.f3987j.containsKey(iVar)) {
                                b bVar2 = d.Companion;
                                e eVar4 = kVar.f2507a;
                                bVar2.getClass();
                                i.e(eVar4, "state");
                                int ordinal = eVar4.ordinal();
                                if (ordinal == 2) {
                                    dVar = d.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    dVar = d.ON_STOP;
                                } else if (ordinal != 4) {
                                    dVar = null;
                                } else {
                                    dVar = d.ON_PAUSE;
                                }
                                if (dVar != null) {
                                    this.f2516h.add(dVar.a());
                                    kVar.a(jVar, dVar);
                                    ArrayList arrayList = this.f2516h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + kVar.f2507a);
                                }
                            }
                        }
                    }
                    C0307c cVar4 = this.f2510b.f3999g;
                    if (!this.f2515g && cVar4 != null && this.f2511c.compareTo(((k) cVar4.f3992g).f2507a) > 0) {
                        C0305a aVar3 = this.f2510b;
                        aVar3.getClass();
                        C0308d dVar2 = new C0308d(aVar3);
                        aVar3.f4000h.put(dVar2, Boolean.FALSE);
                        while (dVar2.hasNext() && !this.f2515g) {
                            Map.Entry entry2 = (Map.Entry) dVar2.next();
                            i iVar2 = (i) entry2.getKey();
                            k kVar2 = (k) entry2.getValue();
                            while (kVar2.f2507a.compareTo(this.f2511c) < 0 && !this.f2515g && this.f2510b.f3987j.containsKey(iVar2)) {
                                this.f2516h.add(kVar2.f2507a);
                                b bVar3 = d.Companion;
                                e eVar5 = kVar2.f2507a;
                                bVar3.getClass();
                                d a2 = b.a(eVar5);
                                if (a2 != null) {
                                    kVar2.a(jVar, a2);
                                    ArrayList arrayList2 = this.f2516h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + kVar2.f2507a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.f2515g = false;
            Object obj = this.f2511c;
            s sVar = this.f2517i;
            sVar.getClass();
            if (obj == null) {
                obj = M2.l.f1119a;
            }
            sVar.c((Object) null, obj);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
