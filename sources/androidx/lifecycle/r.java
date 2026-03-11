package androidx.lifecycle;

import A2.i;
import android.app.Activity;

public final class r extends a {
    final /* synthetic */ t this$0;

    public r(t tVar) {
        this.this$0 = tVar;
    }

    public void onActivityPostResumed(Activity activity) {
        i.e(activity, "activity");
        this.this$0.c();
    }

    public void onActivityPostStarted(Activity activity) {
        i.e(activity, "activity");
        t tVar = this.this$0;
        int i3 = tVar.f2537f + 1;
        tVar.f2537f = i3;
        if (i3 == 1 && tVar.f2540i) {
            tVar.f2542k.d(d.ON_START);
            tVar.f2540i = false;
        }
    }
}
