package androidx.appcompat.widget;

import A.A;
import C0.f;
import G.c;
import M0.a;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.ai9poker.app.R;
import e.C0153a;
import h.C0182a;
import j.C0248m;
import j.D;
import j.E;
import j.Q;
import j.S;
import j.T;
import j.U;
import j.V;
import j.W;
import j.X;
import j.Y;
import j.Z;
import j.a0;
import j.b0;
import j.c0;
import j.e0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends D implements C0182a {

    /* renamed from: l0  reason: collision with root package name */
    public static final X f2167l0;

    /* renamed from: A  reason: collision with root package name */
    public final ImageView f2168A;

    /* renamed from: B  reason: collision with root package name */
    public final ImageView f2169B;

    /* renamed from: C  reason: collision with root package name */
    public final View f2170C;

    /* renamed from: D  reason: collision with root package name */
    public c0 f2171D;

    /* renamed from: E  reason: collision with root package name */
    public final Rect f2172E;

    /* renamed from: F  reason: collision with root package name */
    public final Rect f2173F;

    /* renamed from: G  reason: collision with root package name */
    public final int[] f2174G;

    /* renamed from: H  reason: collision with root package name */
    public final int[] f2175H;

    /* renamed from: I  reason: collision with root package name */
    public final ImageView f2176I;
    public final Drawable J;

    /* renamed from: K  reason: collision with root package name */
    public final int f2177K;

    /* renamed from: L  reason: collision with root package name */
    public final int f2178L;

    /* renamed from: M  reason: collision with root package name */
    public final Intent f2179M;

    /* renamed from: N  reason: collision with root package name */
    public final Intent f2180N;

    /* renamed from: O  reason: collision with root package name */
    public final CharSequence f2181O;

    /* renamed from: P  reason: collision with root package name */
    public View.OnFocusChangeListener f2182P;

    /* renamed from: Q  reason: collision with root package name */
    public View.OnClickListener f2183Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f2184R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f2185S;

    /* renamed from: T  reason: collision with root package name */
    public c f2186T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f2187U;

    /* renamed from: V  reason: collision with root package name */
    public CharSequence f2188V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2189W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2190a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2191b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f2192d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2193e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2194f0;

    /* renamed from: g0  reason: collision with root package name */
    public SearchableInfo f2195g0;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f2196h0;
    public final S i0;

    /* renamed from: j0  reason: collision with root package name */
    public final S f2197j0;
    public final WeakHashMap k0;

    /* renamed from: u  reason: collision with root package name */
    public final SearchAutoComplete f2198u;
    public final View v;

    /* renamed from: w  reason: collision with root package name */
    public final View f2199w;

    /* renamed from: x  reason: collision with root package name */
    public final View f2200x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f2201y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f2202z;

    public static class SearchAutoComplete extends C0248m {

        /* renamed from: i  reason: collision with root package name */
        public int f2203i = getThreshold();

        /* renamed from: j  reason: collision with root package name */
        public SearchView f2204j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2205k;

        /* renamed from: l  reason: collision with root package name */
        public final c f2206l = new c(this);

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 >= 600) {
                return 192;
            }
            if (i3 < 640 || i4 < 480) {
                return 160;
            }
            return 192;
        }

        public final boolean enoughToFilter() {
            if (this.f2203i <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2205k) {
                c cVar = this.f2206l;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            SearchView searchView = this.f2204j;
            searchView.u(searchView.f2185S);
            searchView.post(searchView.i0);
            if (searchView.f2198u.hasFocus()) {
                searchView.j();
            }
        }

        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2204j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z3) {
            Method method;
            super.onWindowFocusChanged(z3);
            if (z3 && this.f2204j.hasFocus() && getVisibility() == 0) {
                this.f2205k = true;
                Context context = getContext();
                X x2 = SearchView.f2167l0;
                if (context.getResources().getConfiguration().orientation == 2 && (method = SearchView.f2167l0.f3650c) != null) {
                    try {
                        method.invoke(this, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f2206l;
            if (!z3) {
                this.f2205k = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2205k = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2205k = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2204j = searchView;
        }

        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f2203i = i3;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j.X, java.lang.Object] */
    static {
        Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
        ? obj = new Object();
        try {
            Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
            obj.f3648a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
            obj.f3649b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            obj.f3650c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f2167l0 = obj;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int i3;
        SearchAutoComplete searchAutoComplete = this.f2198u;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i3 = 0;
        } else {
            i3 = charSequence.length();
        }
        searchAutoComplete.setSelection(i3);
    }

    public final void clearFocus() {
        this.f2190a0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2198u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2190a0 = false;
    }

    public int getImeOptions() {
        return this.f2198u.getImeOptions();
    }

    public int getInputType() {
        return this.f2198u.getInputType();
    }

    public int getMaxWidth() {
        return this.f2191b0;
    }

    public CharSequence getQuery() {
        return this.f2198u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2188V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2195g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f2181O;
        }
        return getContext().getText(this.f2195g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2178L;
    }

    public int getSuggestionRowLayout() {
        return this.f2177K;
    }

    public c getSuggestionsAdapter() {
        return this.f2186T;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2192d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2196h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2195g0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i3;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2196h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i3 = searchableInfo.getVoiceMaxResults();
        } else {
            i3 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i3);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2198u;
        if (i3 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        X x2 = f2167l0;
        Method method = x2.f3648a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused) {
            }
        }
        Method method2 = x2.f3649b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f2198u;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2184R) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i3) {
        int i4;
        Uri uri;
        String h3;
        Cursor cursor = this.f2186T.f371h;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i5 = e0.f3667D;
                String h4 = e0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h4 == null) {
                    h4 = this.f2195g0.getSuggestIntentAction();
                }
                if (h4 == null) {
                    h4 = "android.intent.action.SEARCH";
                }
                String h5 = e0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h5 == null) {
                    h5 = this.f2195g0.getSuggestIntentData();
                }
                if (!(h5 == null || (h3 = e0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h5 = h5 + "/" + Uri.encode(h3);
                }
                if (h5 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h5);
                }
                intent = h(h4, uri, e0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), e0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i4 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i4 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2198u;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i3) {
        Editable text = this.f2198u.getText();
        Cursor cursor = this.f2186T.f371h;
        if (cursor != null) {
            if (cursor.moveToPosition(i3)) {
                String c3 = this.f2186T.c(cursor);
                if (c3 != null) {
                    setQuery(c3);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f2198u;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f2195g0 != null) {
                getContext().startActivity(h("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.f2197j0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            int[] iArr = this.f2174G;
            SearchAutoComplete searchAutoComplete = this.f2198u;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2175H;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            Rect rect = this.f2172E;
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f2173F;
            rect2.set(i9, 0, i10, i11);
            c0 c0Var = this.f2171D;
            if (c0Var == null) {
                c0 c0Var2 = new c0(rect2, rect, searchAutoComplete);
                this.f2171D = c0Var2;
                setTouchDelegate(c0Var2);
                return;
            }
            c0Var.f3657b.set(rect2);
            Rect rect3 = c0Var.f3659d;
            rect3.set(rect2);
            int i12 = -c0Var.f3660e;
            rect3.inset(i12, i12);
            c0Var.f3658c.set(rect);
        }
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f2185S) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f2191b0;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2191b0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f2191b0) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b0 b0Var = (b0) parcelable;
        super.onRestoreInstanceState(b0Var.f484a);
        u(b0Var.f3653c);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [j.b0, android.os.Parcelable, H.c] */
    public final Parcelable onSaveInstanceState() {
        ? cVar = new H.c(super.onSaveInstanceState());
        cVar.f3653c = this.f2185S;
        return cVar;
    }

    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.i0);
    }

    public final void p() {
        int i3;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f2198u.getText());
        if (!isEmpty || (this.f2184R && !this.f2193e0)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ImageView imageView = this.f2168A;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void q() {
        int[] iArr;
        if (this.f2198u.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f2199w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2200x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.f2184R;
        SearchAutoComplete searchAutoComplete = this.f2198u;
        if (z3 && (drawable = this.J) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f2190a0 || !isFocusable()) {
            return false;
        }
        if (this.f2185S) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f2198u.requestFocus(i3, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        int i3;
        if ((this.f2187U || this.c0) && !this.f2185S && (this.f2202z.getVisibility() == 0 || this.f2169B.getVisibility() == 0)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f2200x.setVisibility(i3);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2196h0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f2198u;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2183Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f2184R != z3) {
            this.f2184R = z3;
            u(z3);
            r();
        }
    }

    public void setImeOptions(int i3) {
        this.f2198u.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f2198u.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f2191b0 = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2182P = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2183Q = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2188V = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        int i3;
        this.f2189W = z3;
        c cVar = this.f2186T;
        if (cVar instanceof e0) {
            e0 e0Var = (e0) cVar;
            if (z3) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            e0Var.v = i3;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i3;
        this.f2195g0 = searchableInfo;
        Intent intent = null;
        boolean z3 = true;
        SearchAutoComplete searchAutoComplete = this.f2198u;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f2195g0.getImeOptions());
            int inputType = this.f2195g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f2195g0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            c cVar = this.f2186T;
            if (cVar != null) {
                cVar.b((Cursor) null);
            }
            if (this.f2195g0.getSuggestAuthority() != null) {
                e0 e0Var = new e0(getContext(), this, this.f2195g0, this.k0);
                this.f2186T = e0Var;
                searchAutoComplete.setAdapter(e0Var);
                e0 e0Var2 = (e0) this.f2186T;
                if (this.f2189W) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                e0Var2.v = i3;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f2195g0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f2195g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2179M;
            } else if (this.f2195g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2180N;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z3 = false;
                }
                z4 = z3;
            }
        }
        this.c0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2185S);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f2187U = z3;
        u(this.f2185S);
    }

    public void setSuggestionsAdapter(c cVar) {
        this.f2186T = cVar;
        this.f2198u.setAdapter(cVar);
    }

    public final void t(boolean z3) {
        int i3;
        boolean z4 = this.f2187U;
        if (!z4 || ((!z4 && !this.c0) || this.f2185S || !hasFocus() || (!z3 && this.c0))) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.f2202z.setVisibility(i3);
    }

    public final void u(boolean z3) {
        int i3;
        int i4;
        int i5;
        this.f2185S = z3;
        int i6 = 8;
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f2198u.getText());
        this.f2201y.setVisibility(i3);
        t(!isEmpty);
        if (z3) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        this.v.setVisibility(i4);
        ImageView imageView = this.f2176I;
        if (imageView.getDrawable() == null || this.f2184R) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        imageView.setVisibility(i5);
        p();
        if (this.c0 && !this.f2185S && isEmpty) {
            this.f2202z.setVisibility(8);
            i6 = 0;
        }
        this.f2169B.setVisibility(i6);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Context context2 = context;
        this.f2172E = new Rect();
        this.f2173F = new Rect();
        this.f2174G = new int[2];
        this.f2175H = new int[2];
        this.i0 = new S(this, 0);
        this.f2197j0 = new S(this, 1);
        this.k0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        V v3 = new V(this);
        W w3 = new W(this);
        E e2 = new E(1, this);
        Q q3 = new Q(this);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0153a.f2933q, i3, 0);
        f fVar = new f(context2, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2198u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2199w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2200x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2201y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2202z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2168A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2169B = imageView4;
        b bVar2 = bVar;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2176I = imageView5;
        E e3 = e2;
        Drawable I3 = fVar.I(10);
        Field field = A.f0a;
        findViewById.setBackground(I3);
        findViewById2.setBackground(fVar.I(14));
        imageView.setImageDrawable(fVar.I(13));
        imageView2.setImageDrawable(fVar.I(7));
        imageView3.setImageDrawable(fVar.I(4));
        imageView4.setImageDrawable(fVar.I(16));
        imageView5.setImageDrawable(fVar.I(13));
        this.J = fVar.I(12);
        a.Q(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2177K = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2178L = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(q3);
        searchAutoComplete.setOnEditorActionListener(v3);
        searchAutoComplete.setOnItemClickListener(w3);
        searchAutoComplete.setOnItemSelectedListener(e3);
        searchAutoComplete.setOnKeyListener(bVar2);
        searchAutoComplete.setOnFocusChangeListener(new T(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2181O = obtainStyledAttributes.getText(6);
        this.f2188V = obtainStyledAttributes.getText(11);
        int i4 = obtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        fVar.T();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2179M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2180N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2170C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new U(this));
        }
        u(this.f2184R);
        r();
    }

    public void setOnCloseListener(Y y2) {
    }

    public void setOnQueryTextListener(Z z3) {
    }

    public void setOnSuggestionListener(a0 a0Var) {
    }
}
