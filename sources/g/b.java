package G;

import android.database.DataSetObserver;
import j.I;
import j.e0;

public final class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f368b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f367a = i3;
        this.f368b = obj;
    }

    public final void onChanged() {
        switch (this.f367a) {
            case 0:
                e0 e0Var = (e0) this.f368b;
                e0Var.f369f = true;
                e0Var.notifyDataSetChanged();
                return;
            default:
                I i3 = (I) this.f368b;
                if (i3.f3599A.isShowing()) {
                    i3.c();
                    return;
                }
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.f367a) {
            case 0:
                e0 e0Var = (e0) this.f368b;
                e0Var.f369f = false;
                e0Var.notifyDataSetInvalidated();
                return;
            default:
                ((I) this.f368b).dismiss();
                return;
        }
    }
}
