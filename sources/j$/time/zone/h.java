package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

final class h implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f5232a;

    h(ArrayList arrayList) {
        this.f5232a = arrayList;
    }

    public final Object run() {
        Class<j> cls = j.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                j.e(cast);
                this.f5232a.add(cast);
                return null;
            } catch (Exception e2) {
                throw new Error(e2);
            }
        } else {
            j.e(new i());
            return null;
        }
    }
}
