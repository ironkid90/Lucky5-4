package j;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.ai9poker.app.R;

public final class U implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3645a;

    public U(SearchView searchView) {
        this.f3645a = searchView;
    }

    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        SearchView searchView = this.f3645a;
        View view2 = searchView.f2170C;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f2199w.getPaddingLeft();
            Rect rect = new Rect();
            boolean a2 = u0.a(searchView);
            if (searchView.f2184R) {
                i11 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i11 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2198u;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (a2) {
                i12 = -rect.left;
            } else {
                i12 = paddingLeft - (rect.left + i11);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i12);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i11) - paddingLeft);
        }
    }
}
