package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

public final class a implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchView f2284f;

    public a(SearchView searchView) {
        this.f2284f = searchView;
    }

    public final void onClick(View view) {
        String str;
        SearchView searchView = this.f2284f;
        ImageView imageView = searchView.f2201y;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2198u;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2183Q;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f2168A) {
            searchView.k();
        } else if (view == searchView.f2202z) {
            searchView.o();
        } else if (view == searchView.f2169B) {
            SearchableInfo searchableInfo = searchView.f2195g0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f2179M);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            str = null;
                        } else {
                            str = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", str);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.i(searchView.f2180N, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.j();
        }
    }
}
