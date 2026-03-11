package F;

import A.C0001b;
import B.e;
import B.l;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class g extends C0001b {
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z3;
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    public final void b(View view, l lVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f37a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f98a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) e.f92d.f95a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) e.f93e.f95a);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) e.f91c.f95a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) e.f94f.f95a);
            }
        }
    }

    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i3 != 4096) {
            if (i3 == 8192 || i3 == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            } else if (i3 != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
