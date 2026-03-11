package h;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: h.b  reason: case insensitive filesystem */
public final class C0183b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f2997c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f2998a;

    /* renamed from: b  reason: collision with root package name */
    public Method f2999b;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f2999b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f2998a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
