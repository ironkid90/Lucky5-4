package androidx.appcompat.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;

public final class b implements View.OnKeyListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchView f2285f;

    public b(SearchView searchView) {
        this.f2285f = searchView;
    }

    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        int i4;
        SearchView searchView = this.f2285f;
        if (searchView.f2195g0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2198u;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
            return true;
        } else if (searchView.f2195g0 == null || searchView.f2186T == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        } else {
            if (i3 == 66 || i3 == 84 || i3 == 61) {
                searchView.l(searchAutoComplete.getListSelection());
            } else if (i3 == 21 || i3 == 22) {
                if (i3 == 21) {
                    i4 = 0;
                } else {
                    i4 = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(i4);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                Method method = SearchView.f2167l0.f3650c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            } else if (i3 != 19) {
                return false;
            } else {
                searchAutoComplete.getListSelection();
                return false;
            }
            return true;
        }
    }
}
