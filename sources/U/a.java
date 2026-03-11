package U;

import A2.h;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1749a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1750b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1749a = i3;
        this.f1750b = obj;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, U.e] */
    public final void a(j jVar, d dVar) {
        switch (this.f1749a) {
            case 0:
                if (dVar == d.ON_CREATE) {
                    l b3 = jVar.b();
                    b3.c("removeObserver");
                    b3.f2510b.b(this);
                    Bundle a2 = this.f1750b.a().a("androidx.savedstate.Restarter");
                    if (a2 != null) {
                        ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            if (it.hasNext()) {
                                String next = it.next();
                                try {
                                    Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                                    A2.i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                                    try {
                                        Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            A2.i.d(declaredConstructor.newInstance((Object[]) null), "{\n                constr…wInstance()\n            }");
                                            throw new ClassCastException();
                                        } catch (Exception e2) {
                                            throw new RuntimeException(h.g("Failed to instantiate ", next), e2);
                                        }
                                    } catch (NoSuchMethodException e3) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                                    }
                                } catch (ClassNotFoundException e4) {
                                    throw new RuntimeException("Class " + next + " wasn't found", e4);
                                }
                            } else {
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
            default:
                if (dVar == d.ON_CREATE) {
                    l b4 = jVar.b();
                    b4.c("removeObserver");
                    b4.f2510b.b(this);
                    x xVar = (x) this.f1750b;
                    if (!xVar.f2548b) {
                        Bundle a3 = xVar.f2547a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = xVar.f2549c;
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        if (a3 != null) {
                            bundle.putAll(a3);
                        }
                        xVar.f2549c = bundle;
                        xVar.f2548b = true;
                        y yVar = (y) xVar.f2550d.a();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + dVar).toString());
        }
    }
}
