package n2;

import android.widget.Toast$Callback;
import c2.n;

/* renamed from: n2.b  reason: case insensitive filesystem */
public final class C0349b extends Toast$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f4115a;

    public C0349b(n nVar) {
        this.f4115a = nVar;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f4115a.f2790h = null;
    }
}
