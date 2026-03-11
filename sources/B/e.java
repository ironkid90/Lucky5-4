package B;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f91c = new e((Object) null, 4096, (Class) null);

    /* renamed from: d  reason: collision with root package name */
    public static final e f92d = new e((Object) null, 8192, (Class) null);

    /* renamed from: e  reason: collision with root package name */
    public static final e f93e = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (Class) null);

    /* renamed from: f  reason: collision with root package name */
    public static final e f94f = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (Class) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f95a;

    /* renamed from: b  reason: collision with root package name */
    public final int f96b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        new e((Object) null, 1, (Class) null);
        new e((Object) null, 2, (Class) null);
        new e((Object) null, 4, (Class) null);
        new e((Object) null, 8, (Class) null);
        new e((Object) null, 16, (Class) null);
        new e((Object) null, 32, (Class) null);
        new e((Object) null, 64, (Class) null);
        new e((Object) null, 128, (Class) null);
        Class<n> cls = n.class;
        new e((Object) null, 256, cls);
        new e((Object) null, 512, cls);
        Class<o> cls2 = o.class;
        new e((Object) null, 1024, cls2);
        new e((Object) null, 2048, cls2);
        new e((Object) null, 16384, (Class) null);
        new e((Object) null, 32768, (Class) null);
        new e((Object) null, 65536, (Class) null);
        new e((Object) null, 131072, s.class);
        new e((Object) null, 262144, (Class) null);
        new e((Object) null, 524288, (Class) null);
        new e((Object) null, 1048576, (Class) null);
        new e((Object) null, 2097152, t.class);
        int i3 = Build.VERSION.SDK_INT;
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, q.class);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (Class) null);
        if (i3 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new e(accessibilityAction, 16908358, (Class) null);
        if (i3 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new e(accessibilityAction2, 16908359, (Class) null);
        if (i3 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new e(accessibilityAction3, 16908360, (Class) null);
        if (i3 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new e(accessibilityAction4, 16908361, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, r.class);
        if (i3 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new e(accessibilityAction5, 16908354, p.class);
        if (i3 >= 28) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction6 = null;
        }
        new e(accessibilityAction6, 16908356, (Class) null);
        if (i3 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new e(accessibilityAction7, 16908357, (Class) null);
        if (i3 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new e(accessibilityAction8, 16908362, (Class) null);
        if (i3 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction9 = null;
        }
        new e(accessibilityAction9, 16908372, (Class) null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new e(accessibilityAction10, 16908373, (Class) null);
        if (i3 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new e(accessibilityAction11, 16908374, (Class) null);
        if (i3 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction12 = null;
        }
        new e(accessibilityAction12, 16908375, (Class) null);
        if (i3 >= 33) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction13 = null;
        }
        new e(accessibilityAction13, 16908376, (Class) null);
        if (i3 >= 34) {
            accessibilityAction14 = j.a();
        } else {
            accessibilityAction14 = null;
        }
        new e(accessibilityAction14, 16908382, (Class) null);
    }

    public e(Object obj, int i3, Class cls) {
        this.f96b = i3;
        if (obj == null) {
            this.f95a = new AccessibilityNodeInfo.AccessibilityAction(i3, (CharSequence) null);
        } else {
            this.f95a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f95a;
        Object obj3 = this.f95a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f95a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b3 = l.b(this.f96b);
        if (b3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f95a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b3);
        return sb.toString();
    }
}
