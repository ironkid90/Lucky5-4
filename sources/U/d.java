package U;

import android.os.Bundle;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1752a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1753b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1754c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1755d;

    public Bundle a(String str) {
        if (this.f1753b) {
            Bundle bundle = (Bundle) this.f1755d;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f1755d;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f1755d;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f1755d = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }
}
