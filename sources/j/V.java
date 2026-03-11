package j;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

public final class V implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3646a;

    public V(SearchView searchView) {
        this.f3646a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        this.f3646a.o();
        return true;
    }
}
