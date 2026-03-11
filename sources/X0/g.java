package X0;

import C0.r;
import G0.o;
import K0.b;
import a1.C0096a;
import a1.c;
import a1.f;
import a1.m;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import j1.d;
import j1.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l1.C0313a;
import n.C0335b;
import n.C0343j;
import n.k;
import q1.C0397a;

public final class g {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1934k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final C0335b f1935l = new k();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1936a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1937b;

    /* renamed from: c  reason: collision with root package name */
    public final h f1938c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1939d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f1940e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f1941f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final m f1942g;

    /* renamed from: h  reason: collision with root package name */
    public final C0313a f1943h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f1944i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f1945j = new CopyOnWriteArrayList();

    public g(h hVar, Context context, String str) {
        List<String> list;
        this.f1936a = context;
        o.b(str);
        this.f1937b = str;
        this.f1938c = hVar;
        a aVar = FirebaseInitProvider.f2875f;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        Class<ComponentDiscoveryService> cls = ComponentDiscoveryService.class;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String next : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList2.add(next.substring(31));
                }
            }
            list = arrayList2;
        }
        for (String cVar : list) {
            arrayList.add(new c(0, cVar));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        b1.k kVar = b1.k.f2699f;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.add(new c(1, new FirebaseCommonRegistrar()));
        arrayList3.add(new c(1, new ExecutorsRegistrar()));
        arrayList4.add(C0096a.b(context, Context.class, new Class[0]));
        arrayList4.add(C0096a.b(this, g.class, new Class[0]));
        arrayList4.add(C0096a.b(hVar, h.class, new Class[0]));
        e eVar = new e(15);
        if (w.e.a(context) && FirebaseInitProvider.f2876g.get()) {
            arrayList4.add(C0096a.b(aVar, a.class, new Class[0]));
        }
        f fVar = new f(arrayList3, arrayList4, eVar);
        this.f1939d = fVar;
        Trace.endSection();
        this.f1942g = new m(new c(0, this, context));
        this.f1943h = fVar.b(d.class);
        d dVar = new d(this);
        a();
        if (this.f1940e.get()) {
            F0.c.f298j.f299f.get();
        }
        this.f1944i.add(dVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f1934k) {
            try {
                Iterator it = ((C0343j) f1935l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.a();
                    arrayList.add(gVar.f1937b);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g d() {
        g gVar;
        synchronized (f1934k) {
            try {
                gVar = (g) f1935l.getOrDefault("[DEFAULT]", (Object) null);
                if (gVar != null) {
                    ((d) gVar.f1943h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g e(String str) {
        g gVar;
        String str2;
        synchronized (f1934k) {
            try {
                gVar = (g) f1935l.getOrDefault(str.trim(), (Object) null);
                if (gVar != null) {
                    ((d) gVar.f1943h.get()).b();
                } else {
                    ArrayList c3 = c();
                    if (c3.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c3);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g h(h hVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f1931a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f1931a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        F0.c.a(application);
                        F0.c cVar = F0.c.f298j;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f301h.add(obj);
                        }
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1934k) {
            C0335b bVar = f1935l;
            String str2 = "FirebaseApp name " + trim + " already exists!";
            if (!bVar.containsKey(trim)) {
                o.f(context, "Application context cannot be null.");
                gVar = new g(hVar, context, trim);
                bVar.put(trim, gVar);
            } else {
                throw new IllegalStateException(String.valueOf(str2));
            }
        }
        gVar.g();
        return gVar;
    }

    public static g i(Context context) {
        synchronized (f1934k) {
            try {
                if (f1935l.containsKey("[DEFAULT]")) {
                    g d3 = d();
                    return d3;
                }
                h a2 = h.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                g h3 = h(a2, context, "[DEFAULT]");
                return h3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f1941f.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final void b() {
        if (this.f1941f.compareAndSet(false, true)) {
            synchronized (f1934k) {
                f1935l.remove(this.f1937b);
            }
            Iterator it = this.f1945j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f1937b.equals(gVar.f1937b);
    }

    public final String f() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f1937b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        a();
        byte[] bytes2 = this.f1938c.f1947b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void g() {
        HashMap hashMap;
        if (!w.e.a(this.f1936a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f1937b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f1936a;
            AtomicReference atomicReference = f.f1932b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet((Object) null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f1937b);
        Log.i("FirebaseApp", sb2.toString());
        f fVar2 = this.f1939d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f1937b);
        AtomicReference atomicReference2 = fVar2.f2012f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (fVar2) {
                    hashMap = new HashMap(fVar2.f2007a);
                }
                fVar2.g(hashMap, equals);
                break;
            }
        }
        ((d) this.f1943h.get()).b();
    }

    public final int hashCode() {
        return this.f1937b.hashCode();
    }

    public final void j(boolean z3) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f1944i.iterator();
        while (it.hasNext()) {
            g gVar = ((d) it.next()).f1930a;
            if (!z3) {
                ((d) gVar.f1943h.get()).b();
            } else {
                gVar.getClass();
            }
        }
    }

    public final void k(Boolean bool) {
        a();
        C0397a aVar = (C0397a) this.f1942g.get();
        synchronized (aVar) {
            if (bool == null) {
                try {
                    aVar.f4386b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                aVar.f4386b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                aVar.b(equals);
            }
        }
    }

    public final String toString() {
        r rVar = new r((Object) this);
        rVar.B(this.f1937b, "name");
        rVar.B(this.f1938c, "options");
        return rVar.toString();
    }
}
