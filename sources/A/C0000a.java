package A;

import B.e;
import B.f;
import B.l;
import B.m;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ai9poker.app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: A.a  reason: case insensitive filesystem */
public final class C0000a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0001b f35a;

    public C0000a(C0001b bVar) {
        this.f35a = bVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f35a.f37a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        m mVar;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f35a.f37a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            mVar = new m(0, (Object) accessibilityNodeProvider);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return (AccessibilityNodeProvider) mVar.f100g;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f35a.a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        boolean z3;
        Object obj2;
        boolean z4;
        Object obj3;
        Object obj4;
        ClickableSpan[] clickableSpanArr;
        int i3;
        int i4;
        View view2 = view;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i5 = 1;
        l lVar = new l(accessibilityNodeInfo2);
        Field field = A.f0a;
        int i6 = Build.VERSION.SDK_INT;
        Class<Boolean> cls = Boolean.class;
        if (i6 >= 28) {
            obj = Boolean.valueOf(C0021w.d(view));
        } else {
            obj = view2.getTag(R.id.tag_screen_reader_focusable);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        int i7 = 0;
        if (bool == null || !bool.booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i6 >= 28) {
            accessibilityNodeInfo2.setScreenReaderFocusable(z3);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z3 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & true) ? 1 : 0);
            }
        }
        if (i6 >= 28) {
            obj2 = Boolean.valueOf(C0021w.c(view));
        } else {
            Object tag = view2.getTag(R.id.tag_accessibility_heading);
            if (cls.isInstance(tag)) {
                obj2 = tag;
            } else {
                obj2 = null;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null || !bool2.booleanValue()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i6 >= 28) {
            accessibilityNodeInfo2.setHeading(z4);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                int i8 = extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -3;
                if (z4) {
                    i4 = 2;
                } else {
                    i4 = 0;
                }
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i8);
            }
        }
        Class<CharSequence> cls2 = CharSequence.class;
        if (i6 >= 28) {
            obj3 = C0021w.b(view);
        } else {
            obj3 = view2.getTag(R.id.tag_accessibility_pane_title);
            if (!cls2.isInstance(obj3)) {
                obj3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj3;
        if (i6 >= 28) {
            accessibilityNodeInfo2.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i6 >= 30) {
            obj4 = C0023y.b(view);
        } else {
            Object tag2 = view2.getTag(R.id.tag_state_description);
            if (cls2.isInstance(tag2)) {
                obj4 = tag2;
            } else {
                obj4 = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) obj4;
        if (i6 >= 30) {
            f.c(accessibilityNodeInfo2, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f35a.b(view2, lVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i6 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                    if (((WeakReference) sparseArray.valueAt(i9)).get() == null) {
                        arrayList.add(Integer.valueOf(i9));
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sparseArray.remove(((Integer) arrayList.get(i10)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i11 = 0;
                while (i11 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i11];
                    int i12 = i7;
                    while (true) {
                        if (i12 >= sparseArray2.size()) {
                            i3 = l.f97b;
                            l.f97b = i3 + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i12)).get())) {
                            i3 = sparseArray2.keyAt(i12);
                            break;
                        } else {
                            i12 += i5;
                        }
                    }
                    sparseArray2.put(i3, new WeakReference(clickableSpanArr[i11]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i11];
                    Spanned spanned = (Spanned) text;
                    lVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    lVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    lVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    lVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i3));
                    i5 = 1;
                    i11++;
                    i7 = 0;
                }
            }
        }
        List list = (List) view2.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            lVar.f98a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((e) list.get(i13)).f95a);
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f35a.f37a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f35a.f37a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        return this.f35a.c(view, i3, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i3) {
        this.f35a.f37a.sendAccessibilityEvent(view, i3);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f35a.f37a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
