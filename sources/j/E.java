package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class E implements AdapterView.OnItemSelectedListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3591f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3592g;

    public /* synthetic */ E(int i3, Object obj) {
        this.f3591f = i3;
        this.f3592g = obj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        K k3;
        switch (this.f3591f) {
            case 0:
                if (i3 != -1 && (k3 = ((I) this.f3592g).f3602h) != null) {
                    k3.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f3592g).m(i3);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f3591f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
