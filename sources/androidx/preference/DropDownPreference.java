package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.ai9poker.app.R;

public class DropDownPreference extends ListPreference {

    /* renamed from: o  reason: collision with root package name */
    public final ArrayAdapter f2560o;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f2560o = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f2561m;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void b() {
        ArrayAdapter arrayAdapter = this.f2560o;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
