package j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

public final class Q implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchView f3641f;

    public Q(SearchView searchView) {
        this.f3641f = searchView;
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f3641f;
        Editable text = searchView.f2198u.getText();
        searchView.f2192d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i6 = 8;
        if (searchView.c0 && !searchView.f2185S && isEmpty) {
            searchView.f2202z.setVisibility(8);
            i6 = 0;
        }
        searchView.f2169B.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
