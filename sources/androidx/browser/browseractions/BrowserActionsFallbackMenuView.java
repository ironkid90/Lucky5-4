package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ai9poker.app.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public final int f2287f = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: g  reason: collision with root package name */
    public final int f2288g = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i3, int i4) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2287f * 2), this.f2288g), 1073741824), i4);
    }
}
