package a1;

import A2.h;
import X0.g;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import l1.C0313a;
import n1.C0347c;

public final /* synthetic */ class c implements C0313a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2004b;

    public /* synthetic */ c(int i3, Object obj) {
        this.f2003a = i3;
        this.f2004b = obj;
    }

    public final Object get() {
        switch (this.f2003a) {
            case 0:
                String str = (String) this.f2004b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Could not instantiate " + str + ".", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Could not instantiate " + str + ".", e3);
                } catch (NoSuchMethodException e4) {
                    throw new RuntimeException(h.g("Could not instantiate ", str), e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException(h.g("Could not instantiate ", str), e5);
                }
            case 1:
                return (ComponentRegistrar) this.f2004b;
            default:
                return new C0347c((g) this.f2004b);
        }
    }
}
