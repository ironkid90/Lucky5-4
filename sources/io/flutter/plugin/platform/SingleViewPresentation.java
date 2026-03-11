package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private n rootView;
    private boolean startFocused = false;
    private final q state;
    private int viewId;

    /* JADX WARNING: type inference failed for: r2v1, types: [io.flutter.plugin.platform.q, java.lang.Object] */
    public SingleViewPresentation(Context context, Display display, g gVar, a aVar, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new o(context, (InputMethodManager) null), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new Object();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public q detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        this.state.getClass();
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        q qVar = this.state;
        if (qVar.f3423b == null) {
            qVar.f3423b = new m(getContext());
        }
        if (this.state.f3422a == null) {
            q qVar2 = this.state;
            qVar2.f3422a = new s((WindowManager) getContext().getSystemService("window"), qVar2.f3423b);
        }
        this.container = new FrameLayout(getContext());
        new p(getContext(), this.state.f3422a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, q qVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new o(context, (InputMethodManager) null), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = qVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}
