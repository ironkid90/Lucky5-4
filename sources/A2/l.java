package A2;

import F2.a;
import F2.c;

public final class l extends m implements c, z2.l {
    public final a b() {
        r.f87a.getClass();
        return this;
    }

    public final void f() {
        if (!this.f82l) {
            a e2 = e();
            if (e2 != this) {
                ((l) ((c) e2)).f();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public final Object j(Object obj) {
        f();
        throw null;
    }
}
