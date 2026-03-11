package j;

import G.c;
import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

public final class S implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3642f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SearchView f3643g;

    public /* synthetic */ S(SearchView searchView, int i3) {
        this.f3642f = i3;
        this.f3643g = searchView;
    }

    public final void run() {
        switch (this.f3642f) {
            case 0:
                this.f3643g.q();
                return;
            default:
                c cVar = this.f3643g.f2186T;
                if (cVar instanceof e0) {
                    cVar.b((Cursor) null);
                    return;
                }
                return;
        }
    }
}
