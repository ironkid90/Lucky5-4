package a1;

import A.C0002c;
import L1.h;
import a.C0094a;
import android.support.v4.media.session.a;
import android.util.Log;
import b1.k;
import com.google.firebase.components.ComponentRegistrar;
import i1.C0218a;
import i1.C0219b;
import i1.c;
import j1.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l1.C0313a;

public final class f implements b {

    /* renamed from: h  reason: collision with root package name */
    public static final e f2006h = new e(0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2007a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2008b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2009c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f2010d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final k f2011e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference f2012f = new AtomicReference();

    /* renamed from: g  reason: collision with root package name */
    public final e f2013g;

    public f(ArrayList arrayList, ArrayList arrayList2, e eVar) {
        k kVar = k.f2699f;
        k kVar2 = new k();
        this.f2011e = kVar2;
        this.f2013g = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0096a.b(kVar2, k.class, c.class, C0219b.class));
        arrayList3.add(C0096a.b(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0096a aVar = (C0096a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C0313a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2013g.f(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0096a) it4.next()).f1997b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    Object obj = array[i3];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f2010d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f2010d.add(obj.toString());
                    }
                    i3++;
                }
            }
            if (this.f2007a.isEmpty()) {
                C0094a.n(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2007a.keySet());
                arrayList6.addAll(arrayList3);
                C0094a.n(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C0096a aVar2 = (C0096a) it5.next();
                this.f2007a.put(aVar2, new m(new X0.c(1, this, aVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f2012f.get();
        if (bool != null) {
            g(this.f2007a, bool.booleanValue());
        }
    }

    public final synchronized C0313a c(q qVar) {
        a.h(qVar, "Null interface requested.");
        return (C0313a) this.f2008b.get(qVar);
    }

    public final synchronized C0313a f(q qVar) {
        n nVar = (n) this.f2009c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f2006h;
    }

    public final void g(HashMap hashMap, boolean z3) {
        ArrayDeque<C0218a> arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0313a aVar = (C0313a) entry.getValue();
            int i3 = ((C0096a) entry.getKey()).f1999d;
            if (i3 == 1 || (i3 == 2 && z3)) {
                aVar.get();
            }
        }
        k kVar = this.f2011e;
        synchronized (kVar) {
            arrayDeque = kVar.f2023b;
            if (arrayDeque != null) {
                kVar.f2023b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (C0218a a2 : arrayDeque) {
                kVar.a(a2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, a1.o] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, a1.n] */
    public final void h() {
        for (C0096a aVar : this.f2007a.keySet()) {
            Iterator it = aVar.f1998c.iterator();
            while (true) {
                if (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f2020b == 2 && !this.f2009c.containsKey(iVar.f2019a)) {
                        HashMap hashMap = this.f2009c;
                        q qVar = iVar.f2019a;
                        Set emptySet = Collections.emptySet();
                        ? obj = new Object();
                        obj.f2029b = null;
                        obj.f2028a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f2028a.addAll(emptySet);
                        hashMap.put(qVar, obj);
                    } else if (this.f2008b.containsKey(iVar.f2019a)) {
                        continue;
                    } else {
                        int i3 = iVar.f2020b;
                        if (i3 == 1) {
                            q qVar2 = iVar.f2019a;
                            throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + qVar2);
                        } else if (i3 != 2) {
                            HashMap hashMap2 = this.f2008b;
                            q qVar3 = iVar.f2019a;
                            C0002c cVar = o.f2030c;
                            e eVar = o.f2031d;
                            ? obj2 = new Object();
                            obj2.f2032a = cVar;
                            obj2.f2033b = eVar;
                            hashMap2.put(qVar3, obj2);
                        }
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0096a aVar = (C0096a) it.next();
            if (aVar.f2000e == 0) {
                C0313a aVar2 = (C0313a) this.f2007a.get(aVar);
                for (q qVar : aVar.f1997b) {
                    HashMap hashMap = this.f2008b;
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, aVar2);
                    } else {
                        arrayList2.add(new h(4, (o) ((C0313a) hashMap.get(qVar)), aVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, a1.n] */
    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f2007a.entrySet()) {
            C0096a aVar = (C0096a) entry.getKey();
            if (aVar.f2000e != 0) {
                C0313a aVar2 = (C0313a) entry.getValue();
                for (q qVar : aVar.f1997b) {
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(aVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f2009c;
            if (!hashMap2.containsKey(key)) {
                ? obj = new Object();
                obj.f2029b = null;
                obj.f2028a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f2028a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((q) entry2.getKey(), obj);
            } else {
                n nVar = (n) hashMap2.get(entry2.getKey());
                for (C0313a hVar : (Set) entry2.getValue()) {
                    arrayList.add(new h(5, nVar, hVar));
                }
            }
        }
        return arrayList;
    }
}
