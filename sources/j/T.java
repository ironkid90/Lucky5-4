package j;

import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class T implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3644a;

    public T(SearchView searchView) {
        this.f3644a = searchView;
    }

    public final void onFocusChange(View view, boolean z3) {
        SearchView searchView = this.f3644a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f2182P;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z3);
        }
    }
}
