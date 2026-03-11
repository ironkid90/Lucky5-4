package V;

import a.C0094a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.ai9poker.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f1849d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f1850e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1851a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f1852b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1853c;

    public a(Context context) {
        this.f1853c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1849d == null) {
            synchronized (f1850e) {
                try {
                    if (f1849d == null) {
                        f1849d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1849d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1853c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1852b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = W.a.c();
        } else {
            Class<Trace> cls2 = Trace.class;
            try {
                if (C0094a.f1968h == null) {
                    C0094a.f1967g = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                    C0094a.f1968h = cls2.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                z3 = ((Boolean) C0094a.f1968h.invoke((Object) null, new Object[]{Long.valueOf(C0094a.f1967g)})).booleanValue();
            } catch (Exception e2) {
                C0094a.D("isTagEnabled", e2);
                z3 = false;
            }
        }
        if (z3) {
            try {
                Trace.beginSection(C0094a.N(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f1851a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls3 : a2) {
                        if (!hashMap.containsKey(cls3)) {
                            b(cls3, hashSet);
                        }
                    }
                }
                Object b3 = bVar.b(this.f1853c);
                hashSet.remove(cls);
                hashMap.put(cls, b3);
            } else {
                hashMap.get(cls);
            }
            Trace.endSection();
            return;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
