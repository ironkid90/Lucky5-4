package z1;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

public final class t implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Field f4939a;

    public t(Field field) {
        this.f4939a = field;
    }

    public final Object run() {
        this.f4939a.setAccessible(true);
        return null;
    }
}
