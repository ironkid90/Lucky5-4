package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<l> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<l, Integer> originToFlutterId;
    private final k reflectionAccessors = new k();
    private final View rootAccessibilityView;

    public AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i3;
        Long l3;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            k kVar = this.reflectionAccessors;
            Method method = kVar.f3559f;
            Long l4 = null;
            Field field = kVar.f3558e;
            Method method2 = kVar.f3557d;
            if (!(method2 == null && (field == null || method == null))) {
                if (method2 != null) {
                    try {
                        l3 = (Long) method2.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i4)});
                    } catch (IllegalAccessException e2) {
                        Log.w(TAG, "Failed to access getChildId method.", e2);
                    } catch (InvocationTargetException e3) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e3);
                    }
                } else {
                    try {
                        l3 = (Long) method.invoke(field.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i4)});
                        l3.getClass();
                    } catch (IllegalAccessException e4) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e4);
                    } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e5) {
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e5);
                    }
                }
                l4 = l3;
            }
            if (l4 != null) {
                int longValue = (int) (l4.longValue() >> 32);
                l lVar = new l(view, longValue);
                if (this.originToFlutterId.containsKey(lVar)) {
                    i3 = this.originToFlutterId.get(lVar).intValue();
                } else {
                    int i5 = this.nextFlutterId;
                    this.nextFlutterId = i5 + 1;
                    cacheVirtualIdMappings(view, longValue, i5);
                    i3 = i5;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i3);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i3, int i4) {
        l lVar = new l(view, i3);
        this.originToFlutterId.put(lVar, Integer.valueOf(i4));
        this.flutterIdToOrigin.put(i4, lVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i3);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i3 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i3 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            io.flutter.view.k r0 = r5.reflectionAccessors
            java.lang.reflect.Method r0 = r0.f3555b
            r1 = 0
            java.lang.String r2 = "AccessibilityBridge"
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.invoke(r6, r1)     // Catch:{ IllegalAccessException -> 0x0015, InvocationTargetException -> 0x0013 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalAccessException -> 0x0015, InvocationTargetException -> 0x0013 }
            r0.getClass()     // Catch:{ IllegalAccessException -> 0x0015, InvocationTargetException -> 0x0013 }
            goto L_0x0074
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            r0 = move-exception
            goto L_0x001d
        L_0x0017:
            java.lang.String r3 = "The getParentNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r3, r0)
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = "Failed to access getParentNodeId method."
            android.util.Log.w(r2, r3, r0)
        L_0x0022:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 >= r3) goto L_0x002e
            java.lang.String r6 = "Unexpected Android version. Unable to find the parent ID."
            android.util.Log.w(r2, r6)
            goto L_0x0073
        L_0x002e:
            android.view.accessibility.AccessibilityNodeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.obtain(r6)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r2 = 0
            r0.setDataPosition(r2)
            r6.writeToParcel(r0, r2)
            r0.setDataPosition(r2)
            long r3 = r0.readLong()
            boolean r6 = io.flutter.view.k.b(r3, r2)
            if (r6 == 0) goto L_0x004d
            r0.readInt()
        L_0x004d:
            r6 = 1
            boolean r6 = io.flutter.view.k.b(r3, r6)
            if (r6 == 0) goto L_0x0057
            r0.readLong()
        L_0x0057:
            r6 = 2
            boolean r6 = io.flutter.view.k.b(r3, r6)
            if (r6 == 0) goto L_0x0061
            r0.readInt()
        L_0x0061:
            r6 = 3
            boolean r6 = io.flutter.view.k.b(r3, r6)
            if (r6 == 0) goto L_0x0070
            long r1 = r0.readLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0070:
            r0.recycle()
        L_0x0073:
            r0 = r1
        L_0x0074:
            if (r0 != 0) goto L_0x0077
            return
        L_0x0077:
            long r0 = r0.longValue()
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            java.util.Map<io.flutter.view.l, java.lang.Integer> r0 = r5.originToFlutterId
            io.flutter.view.l r1 = new io.flutter.view.l
            r1.<init>(r7, r6)
            java.lang.Object r6 = r0.get(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0097
            android.view.View r7 = r5.rootAccessibilityView
            int r6 = r6.intValue()
            r8.setParent(r7, r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        l lVar = this.flutterIdToOrigin.get(i3);
        if (lVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = lVar.f3560a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(lVar.f3561b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i3, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a2 = k.a(this.reflectionAccessors, accessibilityRecord);
        if (a2 == null) {
            return null;
        }
        return this.originToFlutterId.get(new l(view, (int) (a2.longValue() >> 32)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            io.flutter.view.k r1 = r5.reflectionAccessors
            java.lang.String r2 = "AccessibilityBridge"
            java.lang.reflect.Method r1 = r1.f3554a
            r3 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            r1 = r3
            goto L_0x0026
        L_0x000f:
            java.lang.Object r1 = r1.invoke(r0, r3)     // Catch:{ IllegalAccessException -> 0x0018, InvocationTargetException -> 0x0016 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalAccessException -> 0x0018, InvocationTargetException -> 0x0016 }
            goto L_0x0026
        L_0x0016:
            r1 = move-exception
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            goto L_0x0020
        L_0x001a:
            java.lang.String r4 = "The getSourceNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r4, r1)
            goto L_0x000d
        L_0x0020:
            java.lang.String r4 = "Failed to access getSourceNodeId method."
            android.util.Log.w(r2, r4, r1)
            goto L_0x000d
        L_0x0026:
            if (r1 != 0) goto L_0x0029
            return r3
        L_0x0029:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.embeddedViewToDisplayBounds
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.cacheVirtualIdMappings(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.convertToFlutterNode(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        l lVar = this.flutterIdToOrigin.get(i3);
        if (lVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = lVar.f3560a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i4] = pointerProperties;
            motionEvent2.getPointerProperties(i4, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i4, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i4] = pointerCoords2;
            pointerCoords2.x -= (float) rect.left;
            pointerCoords2.y -= (float) rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        l lVar = this.flutterIdToOrigin.get(i3);
        if (lVar == null || (accessibilityNodeProvider = lVar.f3560a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(lVar.f3561b, i4, bundle);
    }

    public View platformViewOfNode(int i3) {
        l lVar = this.flutterIdToOrigin.get(i3);
        if (lVar == null) {
            return null;
        }
        return lVar.f3560a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a2 = k.a(this.reflectionAccessors, accessibilityEvent);
        if (a2 == null) {
            return false;
        }
        int longValue = (int) (a2.longValue() >> 32);
        Integer num = this.originToFlutterId.get(new l(view, longValue));
        if (num == null) {
            int i3 = this.nextFlutterId;
            this.nextFlutterId = i3 + 1;
            Integer valueOf = Integer.valueOf(i3);
            cacheVirtualIdMappings(view, longValue, i3);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i4 = 0; i4 < obtain.getRecordCount(); i4++) {
            AccessibilityRecord record = obtain.getRecord(i4);
            Long a3 = k.a(this.reflectionAccessors, record);
            if (a3 == null) {
                return false;
            }
            l lVar = new l(view, (int) (a3.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(lVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(lVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
