package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class W implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchView f3647f;

    public W(SearchView searchView) {
        this.f3647f = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f3647f.l(i3);
    }
}
