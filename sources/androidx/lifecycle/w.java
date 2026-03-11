package androidx.lifecycle;

import A2.i;
import B.m;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.a;

public final class w extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f2545g = 0;

    /* renamed from: f  reason: collision with root package name */
    public m f2546f;

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            i.d(activity, "activity");
            a.o(activity, dVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(d.ON_DESTROY);
        this.f2546f = null;
    }

    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        m mVar = this.f2546f;
        if (mVar != null) {
            ((t) mVar.f100g).c();
        }
        a(d.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        m mVar = this.f2546f;
        if (mVar != null) {
            t tVar = (t) mVar.f100g;
            int i3 = tVar.f2537f + 1;
            tVar.f2537f = i3;
            if (i3 == 1 && tVar.f2540i) {
                tVar.f2542k.d(d.ON_START);
                tVar.f2540i = false;
            }
        }
        a(d.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(d.ON_STOP);
    }
}
