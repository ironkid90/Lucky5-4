package C2;

import A2.i;
import java.util.Random;

public final class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public final b f185h = new ThreadLocal();

    public final Random a() {
        Object obj = this.f185h.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
