package A;

import B.e;
import B.l;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ai9poker.app.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: A.b  reason: case insensitive filesystem */
public class C0001b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f36c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f37a = f36c;

    /* renamed from: b  reason: collision with root package name */
    public final C0000a f38b = new C0000a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f37a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, l lVar) {
        this.f37a.onInitializeAccessibilityNodeInfo(view, lVar.f98a);
    }

    public boolean c(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i4 = 0;
        while (i4 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((e) list.get(i4)).f95a).getId() != i3) {
            i4++;
        }
        boolean performAccessibilityAction = this.f37a.performAccessibilityAction(view, i3, bundle);
        if (performAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                } else if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                } else {
                    i6++;
                }
            }
        }
        return z3;
    }
}
