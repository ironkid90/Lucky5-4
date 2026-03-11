package A;

import C.a;
import android.view.View;
import android.view.autofill.AutofillId;
import com.ai9poker.app.R;
import java.util.Objects;
import n.k;

/* renamed from: A.w  reason: case insensitive filesystem */
public abstract class C0021w {
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, z zVar) {
        k kVar = (k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(zVar);
        ? obj = new Object();
        kVar.put(zVar, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, z zVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        k kVar = (k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(zVar, (Object) null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i3) {
        return view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, a aVar) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
