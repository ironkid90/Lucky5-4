package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

public final class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f2286f;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2286f = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2286f;
        if (searchAutoComplete.f2205k) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2205k = false;
        }
    }
}
