package io.flutter.view;

import C0.f;
import F0.h;
import G.a;
import S1.o;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c2.C0135c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.C0464y;

public final class g extends AccessibilityNodeProvider {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3526y = 0;

    /* renamed from: a  reason: collision with root package name */
    public final o f3527a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3528b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f3529c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f3530d;

    /* renamed from: e  reason: collision with root package name */
    public final i f3531e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f3532f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f3533g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3534h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public f f3535i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f3536j;

    /* renamed from: k  reason: collision with root package name */
    public int f3537k = 0;

    /* renamed from: l  reason: collision with root package name */
    public String f3538l;

    /* renamed from: m  reason: collision with root package name */
    public f f3539m;

    /* renamed from: n  reason: collision with root package name */
    public f f3540n;

    /* renamed from: o  reason: collision with root package name */
    public f f3541o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f3542p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public int f3543q = 0;

    /* renamed from: r  reason: collision with root package name */
    public h f3544r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3545s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3546t = false;

    /* renamed from: u  reason: collision with root package name */
    public final a f3547u = new a(this);
    public final b v;

    /* renamed from: w  reason: collision with root package name */
    public final c f3548w;

    /* renamed from: x  reason: collision with root package name */
    public final a f3549x;

    public g(o oVar, f fVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, i iVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(oVar, 65536);
        b bVar = new b(this);
        this.v = bVar;
        a aVar = new a(this, new Handler(), 2);
        this.f3549x = aVar;
        this.f3527a = oVar;
        this.f3528b = fVar;
        this.f3529c = accessibilityManager;
        this.f3532f = contentResolver;
        this.f3530d = accessibilityViewEmbedder;
        this.f3531e = iVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f3548w = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f3537k |= 128;
        aVar.onChange(false, (Uri) null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (!(Build.VERSION.SDK_INT < 31 || oVar == null || oVar.getResources() == null)) {
            int a2 = oVar.getResources().getConfiguration().fontWeightAdjustment;
            if (a2 == Integer.MAX_VALUE || a2 < 300) {
                this.f3537k &= -9;
            } else {
                this.f3537k |= 8;
            }
            ((FlutterJNI) fVar.f127g).setAccessibilityFeatures(this.f3537k);
        }
        iVar.b(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        return strArr[i3];
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, io.flutter.view.e] */
    public final e a(int i3) {
        HashMap hashMap = this.f3534h;
        e eVar = (e) hashMap.get(Integer.valueOf(i3));
        if (eVar != null) {
            return eVar;
        }
        ? obj = new Object();
        obj.f3472c = -1;
        obj.f3471b = i3;
        obj.f3470a = 267386881 + i3;
        hashMap.put(Integer.valueOf(i3), obj);
        return obj;
    }

    public final f b(int i3) {
        HashMap hashMap = this.f3533g;
        f fVar = (f) hashMap.get(Integer.valueOf(i3));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f3501b = i3;
        hashMap.put(Integer.valueOf(i3), fVar2);
        return fVar2;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        boolean z7;
        int i6 = i3;
        boolean z8 = true;
        i(true);
        if (i6 >= 65536) {
            return this.f3530d.createAccessibilityNodeInfo(i6);
        }
        HashMap hashMap = this.f3533g;
        o oVar = this.f3527a;
        if (i6 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(oVar);
            oVar.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(oVar, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        f fVar = (f) hashMap.get(Integer.valueOf(i3));
        if (fVar == null) {
            return null;
        }
        int c3 = fVar.f3509i;
        i iVar = this.f3531e;
        if (c3 == -1 || !iVar.c(fVar.f3509i)) {
            AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(oVar, i6);
            int i7 = Build.VERSION.SDK_INT;
            if (!fVar.D(12) && !(f.t(fVar) == null && fVar.f3504d == 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            obtain2.setImportantForAccessibility(z3);
            String str = "";
            obtain2.setViewIdResourceName(str);
            if (fVar.f3515o != null) {
                obtain2.setViewIdResourceName(fVar.f3515o);
            }
            obtain2.setPackageName(oVar.getContext().getPackageName());
            obtain2.setClassName("android.view.View");
            obtain2.setSource(oVar, i6);
            obtain2.setFocusable(fVar.F());
            f fVar2 = this.f3539m;
            if (fVar2 != null) {
                if (fVar2.f3501b == i6) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                obtain2.setFocused(z7);
            }
            f fVar3 = this.f3535i;
            if (fVar3 != null) {
                if (fVar3.f3501b == i6) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                obtain2.setAccessibilityFocused(z6);
            }
            if (fVar.D(5)) {
                obtain2.setPassword(fVar.D(11));
                if (!fVar.D(21)) {
                    obtain2.setClassName("android.widget.EditText");
                }
                obtain2.setEditable(!fVar.D(21));
                if (!(fVar.f3507g == -1 || fVar.f3508h == -1)) {
                    obtain2.setTextSelection(fVar.f3507g, fVar.f3508h);
                }
                f fVar4 = this.f3535i;
                if (fVar4 != null && fVar4.f3501b == i6) {
                    obtain2.setLiveRegion(1);
                }
                if (f.j(fVar, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    obtain2.addAction(256);
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (f.j(fVar, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    obtain2.addAction(512);
                    i4 = 1;
                }
                if (f.j(fVar, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    obtain2.addAction(256);
                    i4 |= 2;
                }
                if (f.j(fVar, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    obtain2.addAction(512);
                    i4 |= 2;
                }
                obtain2.setMovementGranularities(i4);
                if (fVar.f3505e >= 0) {
                    if (fVar.f3518r == null) {
                        i5 = 0;
                    } else {
                        i5 = fVar.f3518r.length();
                    }
                    obtain2.setMaxTextLength(fVar.f3505e + (i5 - fVar.f3506f));
                }
            }
            if (f.j(fVar, d.SET_SELECTION)) {
                obtain2.addAction(131072);
            }
            if (f.j(fVar, d.COPY)) {
                obtain2.addAction(16384);
            }
            if (f.j(fVar, d.CUT)) {
                obtain2.addAction(65536);
            }
            if (f.j(fVar, d.PASTE)) {
                obtain2.addAction(32768);
            }
            if (f.j(fVar, d.SET_TEXT)) {
                obtain2.addAction(2097152);
            }
            if (fVar.D(4)) {
                obtain2.setClassName("android.widget.Button");
            }
            if (fVar.D(15)) {
                obtain2.setClassName("android.widget.ImageView");
            }
            if (f.j(fVar, d.DISMISS)) {
                obtain2.setDismissable(true);
                obtain2.addAction(1048576);
            }
            if (fVar.f3491R != null) {
                obtain2.setParent(oVar, fVar.f3491R.f3501b);
            } else {
                obtain2.setParent(oVar);
            }
            if (fVar.f3478D != -1) {
                obtain2.setTraversalAfter(oVar, fVar.f3478D);
            }
            Rect d3 = f.d(fVar);
            if (fVar.f3491R != null) {
                Rect d4 = f.d(fVar.f3491R);
                Rect rect = new Rect(d3);
                rect.offset(-d4.left, -d4.top);
                obtain2.setBoundsInParent(rect);
            } else {
                obtain2.setBoundsInParent(d3);
            }
            Rect rect2 = new Rect(d3);
            int[] iArr = new int[2];
            oVar.getLocationOnScreen(iArr);
            rect2.offset(iArr[0], iArr[1]);
            obtain2.setBoundsInScreen(rect2);
            obtain2.setVisibleToUser(true);
            if (!fVar.D(7) || fVar.D(8)) {
                z4 = true;
            } else {
                z4 = false;
            }
            obtain2.setEnabled(z4);
            if (f.j(fVar, d.TAP)) {
                if (fVar.f3495V != null) {
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, fVar.f3495V.f3474e));
                    obtain2.setClickable(true);
                } else {
                    obtain2.addAction(16);
                    obtain2.setClickable(true);
                }
            } else if (fVar.D(24)) {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
            if (f.j(fVar, d.LONG_PRESS)) {
                if (fVar.f3496W != null) {
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, fVar.f3496W.f3474e));
                    obtain2.setLongClickable(true);
                } else {
                    obtain2.addAction(32);
                    obtain2.setLongClickable(true);
                }
            }
            d dVar = d.SCROLL_LEFT;
            boolean j3 = f.j(fVar, dVar);
            d dVar2 = d.SCROLL_DOWN;
            d dVar3 = d.SCROLL_UP;
            d dVar4 = d.SCROLL_RIGHT;
            if (j3 || f.j(fVar, dVar3) || f.j(fVar, dVar4) || f.j(fVar, dVar2)) {
                obtain2.setScrollable(true);
                if (fVar.D(19)) {
                    if (f.j(fVar, dVar) || f.j(fVar, dVar4)) {
                        if (j(fVar)) {
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, fVar.f3510j, false));
                        } else {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        }
                    } else if (j(fVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(fVar.f3510j, 0, false));
                    } else {
                        obtain2.setClassName("android.widget.ScrollView");
                    }
                }
                if (f.j(fVar, dVar) || f.j(fVar, dVar3)) {
                    obtain2.addAction(4096);
                }
                if (f.j(fVar, dVar4) || f.j(fVar, dVar2)) {
                    obtain2.addAction(8192);
                }
            }
            d dVar5 = d.INCREASE;
            boolean j4 = f.j(fVar, dVar5);
            d dVar6 = d.DECREASE;
            if (j4 || f.j(fVar, dVar6)) {
                obtain2.setClassName("android.widget.SeekBar");
                if (f.j(fVar, dVar5)) {
                    obtain2.addAction(4096);
                }
                if (f.j(fVar, dVar6)) {
                    obtain2.addAction(8192);
                }
            }
            if (fVar.D(16)) {
                obtain2.setLiveRegion(1);
            }
            if (fVar.D(5)) {
                obtain2.setText(f.r(fVar));
                if (i7 >= 28) {
                    obtain2.setHintText(f.s(fVar));
                }
            } else if (!fVar.D(12)) {
                CharSequence t3 = f.t(fVar);
                String str2 = t3;
                if (i7 < 28) {
                    str2 = t3;
                    if (fVar.f3525z != null) {
                        if (t3 != null) {
                            str = t3;
                        }
                        str2 = str + "\n" + fVar.f3525z;
                    }
                }
                if (str2 != null) {
                    obtain2.setContentDescription(str2);
                }
            }
            if (i7 >= 28 && fVar.f3525z != null) {
                obtain2.setTooltipText(fVar.f3525z);
                if (f.t(fVar) == null) {
                    obtain2.setContentDescription(fVar.f3525z);
                }
            }
            boolean g2 = fVar.D(1);
            boolean g3 = fVar.D(17);
            if (g2 || g3) {
                z5 = true;
            } else {
                z5 = false;
            }
            obtain2.setCheckable(z5);
            if (g2) {
                obtain2.setChecked(fVar.D(2));
                if (fVar.D(9)) {
                    obtain2.setClassName("android.widget.RadioButton");
                } else {
                    obtain2.setClassName("android.widget.CheckBox");
                }
            } else if (g3) {
                obtain2.setChecked(fVar.D(18));
                obtain2.setClassName("android.widget.Switch");
            }
            int i8 = 3;
            obtain2.setSelected(fVar.D(3));
            if (i7 >= 36 && fVar.D(27)) {
                if (!fVar.D(28)) {
                    i8 = 1;
                }
                obtain2.setExpandedState(i8);
                if (f.j(fVar, d.EXPAND)) {
                    obtain2.addAction(262144);
                }
                if (f.j(fVar, d.COLLAPSE)) {
                    obtain2.addAction(524288);
                }
            }
            if (i7 >= 28) {
                if (fVar.f3477C <= 0) {
                    z8 = false;
                }
                obtain2.setHeading(z8);
            }
            f fVar5 = this.f3535i;
            if (fVar5 == null || fVar5.f3501b != i6) {
                obtain2.addAction(64);
            } else {
                obtain2.addAction(128);
            }
            if (fVar.f3494U != null) {
                Iterator it = fVar.f3494U.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f3470a, eVar.f3473d));
                }
            }
            Iterator it2 = fVar.f3492S.iterator();
            while (it2.hasNext()) {
                f fVar6 = (f) it2.next();
                if (!fVar6.D(14)) {
                    if (fVar6.f3509i != -1) {
                        iVar.d(fVar6.f3509i);
                        if (!iVar.c(fVar6.f3509i)) {
                            throw null;
                        }
                    }
                    obtain2.addChild(oVar, fVar6.f3501b);
                }
            }
            return obtain2;
        }
        iVar.d(fVar.f3509i);
        return null;
    }

    public final AccessibilityEvent d(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        o oVar = this.f3527a;
        obtain.setPackageName(oVar.getContext().getPackageName());
        obtain.setSource(oVar, i3);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z3) {
        f E3;
        if (!this.f3529c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f3533g;
        if (hashMap.isEmpty()) {
            return false;
        }
        f E4 = ((f) hashMap.get(0)).E(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
        if (E4 == null || E4.f3509i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (!hashMap.isEmpty() && (E3 = ((f) hashMap.get(0)).E(new float[]{x2, y2, 0.0f, 1.0f}, z3)) != this.f3541o) {
                    if (E3 != null) {
                        g(E3.f3501b, 128);
                    }
                    f fVar = this.f3541o;
                    if (fVar != null) {
                        g(fVar.f3501b, 256);
                    }
                    this.f3541o = E3;
                }
            } else if (motionEvent.getAction() == 10) {
                f fVar2 = this.f3541o;
                if (fVar2 != null) {
                    g(fVar2.f3501b, 256);
                    this.f3541o = null;
                }
            } else {
                motionEvent.toString();
                return false;
            }
            return true;
        } else if (z3) {
            return false;
        } else {
            return this.f3530d.onAccessibilityHoverEvent(E4.f3501b, motionEvent);
        }
    }

    public final boolean f(f fVar, int i3, Bundle bundle, boolean z3) {
        int i4;
        f fVar2 = fVar;
        int i5 = i3;
        Bundle bundle2 = bundle;
        int i6 = bundle2.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle2.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i7 = fVar2.f3507g;
        int i8 = fVar2.f3508h;
        if (i8 >= 0 && i7 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z3) {
                                fVar2.f3508h = fVar2.f3518r.length();
                            } else {
                                fVar2.f3508h = 0;
                            }
                        }
                    } else if (z3 && i8 < fVar2.f3518r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar2.f3518r.substring(fVar2.f3508h));
                        if (matcher.find()) {
                            fVar2.f3508h += matcher.start(1);
                        } else {
                            fVar2.f3508h = fVar2.f3518r.length();
                        }
                    } else if (!z3 && fVar2.f3508h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar2.f3518r.substring(0, fVar2.f3508h));
                        if (matcher2.find()) {
                            fVar2.f3508h = matcher2.start(1);
                        } else {
                            fVar2.f3508h = 0;
                        }
                    }
                } else if (z3 && i8 < fVar2.f3518r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar2.f3518r.substring(fVar2.f3508h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar2.f3508h += matcher3.start(1);
                    } else {
                        fVar2.f3508h = fVar2.f3518r.length();
                    }
                } else if (!z3 && fVar2.f3508h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar2.f3518r.substring(0, fVar2.f3508h));
                    if (matcher4.find()) {
                        fVar2.f3508h = matcher4.start(1);
                    }
                }
            } else if (z3 && i8 < fVar2.f3518r.length()) {
                fVar2.f3508h++;
            } else if (!z3 && (i4 = fVar2.f3508h) > 0) {
                fVar2.f3508h = i4 - 1;
            }
            if (!z4) {
                fVar2.f3507g = fVar2.f3508h;
            }
        }
        if (!(i7 == fVar2.f3507g && i8 == fVar2.f3508h)) {
            String str = fVar2.f3518r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d3 = d(fVar2.f3501b, 8192);
            d3.getText().add(str);
            d3.setFromIndex(fVar2.f3507g);
            d3.setToIndex(fVar2.f3508h);
            d3.setItemCount(str.length());
            h(d3);
        }
        f fVar3 = this.f3528b;
        if (i6 == 1) {
            if (z3) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (f.j(fVar2, dVar)) {
                    fVar3.B(i5, dVar, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (f.j(fVar2, dVar2)) {
                    fVar3.B(i5, dVar2, Boolean.valueOf(z4));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z3) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (f.j(fVar2, dVar3)) {
                    fVar3.B(i5, dVar3, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (f.j(fVar2, dVar4)) {
                    fVar3.B(i5, dVar4, Boolean.valueOf(z4));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            f fVar = this.f3539m;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f3501b);
            }
        } else if (i3 != 2) {
            return null;
        }
        f fVar2 = this.f3535i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f3501b);
        }
        Integer num = this.f3536j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i3, int i4) {
        if (this.f3529c.isEnabled()) {
            h(d(i3, i4));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f3529c.isEnabled()) {
            o oVar = this.f3527a;
            oVar.getParent().requestSendAccessibilityEvent(oVar, accessibilityEvent);
        }
    }

    public final void i(boolean z3) {
        if (this.f3545s != z3) {
            this.f3545s = z3;
            if (z3) {
                this.f3537k |= 1;
            } else {
                this.f3537k &= -2;
            }
            ((FlutterJNI) this.f3528b.f127g).setAccessibilityFeatures(this.f3537k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(io.flutter.view.f r3) {
        /*
            r2 = this;
            int r0 = r3.f3510j
            if (r0 <= 0) goto L_0x0031
            io.flutter.view.f r0 = r2.f3535i
            r1 = 0
            if (r0 == 0) goto L_0x0017
            io.flutter.view.f r0 = r0.f3491R
        L_0x000b:
            if (r0 == 0) goto L_0x0013
            if (r0 != r3) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            io.flutter.view.f r0 = r0.f3491R
            goto L_0x000b
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            goto L_0x002f
        L_0x0017:
            io.flutter.view.f r3 = r2.f3535i
            if (r3 == 0) goto L_0x002f
            io.flutter.view.f r3 = r3.f3491R
        L_0x001d:
            if (r3 == 0) goto L_0x002c
            r0 = 19
            boolean r0 = r3.D(r0)
            if (r0 == 0) goto L_0x0029
            r1 = r3
            goto L_0x002c
        L_0x0029:
            io.flutter.view.f r3 = r3.f3491R
            goto L_0x001d
        L_0x002c:
            if (r1 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.g.j(io.flutter.view.f):boolean");
    }

    public final boolean performAction(int i3, int i4, Bundle bundle) {
        String str;
        if (i3 >= 65536) {
            boolean performAction = this.f3530d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f3536j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f3533g;
        f fVar = (f) hashMap.get(Integer.valueOf(i3));
        if (fVar == null) {
            return false;
        }
        d dVar = d.INCREASE;
        d dVar2 = d.DECREASE;
        f fVar2 = this.f3528b;
        switch (i4) {
            case 16:
                fVar2.A(i3, d.TAP);
                return true;
            case 32:
                fVar2.A(i3, d.LONG_PRESS);
                return true;
            case 64:
                if (this.f3535i == null) {
                    this.f3527a.invalidate();
                }
                this.f3535i = fVar;
                fVar2.A(i3, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(fVar.f3501b));
                ((C0464y) fVar2.f128h).k(hashMap2, (C0135c) null);
                g(i3, 32768);
                if (f.j(fVar, dVar) || f.j(fVar, dVar2)) {
                    g(i3, 4);
                }
                return true;
            case 128:
                f fVar3 = this.f3535i;
                if (fVar3 != null && fVar3.f3501b == i3) {
                    this.f3535i = null;
                }
                Integer num = this.f3536j;
                if (num != null && num.intValue() == i3) {
                    this.f3536j = null;
                }
                fVar2.A(i3, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i3, 65536);
                return true;
            case 256:
                return f(fVar, i3, bundle, true);
            case 512:
                return f(fVar, i3, bundle, false);
            case 4096:
                d dVar3 = d.SCROLL_UP;
                if (f.j(fVar, dVar3)) {
                    fVar2.A(i3, dVar3);
                } else {
                    d dVar4 = d.SCROLL_LEFT;
                    if (f.j(fVar, dVar4)) {
                        fVar2.A(i3, dVar4);
                    } else if (!f.j(fVar, dVar)) {
                        return false;
                    } else {
                        fVar.f3518r = fVar.f3520t;
                        fVar.f3519s = fVar.f3521u;
                        g(i3, 4);
                        fVar2.A(i3, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.SCROLL_DOWN;
                if (f.j(fVar, dVar5)) {
                    fVar2.A(i3, dVar5);
                } else {
                    d dVar6 = d.SCROLL_RIGHT;
                    if (f.j(fVar, dVar6)) {
                        fVar2.A(i3, dVar6);
                    } else if (!f.j(fVar, dVar2)) {
                        return false;
                    } else {
                        fVar.f3518r = fVar.v;
                        fVar.f3519s = fVar.f3522w;
                        g(i3, 4);
                        fVar2.A(i3, dVar2);
                    }
                }
                return true;
            case 16384:
                fVar2.A(i3, d.COPY);
                return true;
            case 32768:
                fVar2.A(i3, d.PASTE);
                return true;
            case 65536:
                fVar2.A(i3, d.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(fVar.f3508h));
                    hashMap3.put("extent", Integer.valueOf(fVar.f3508h));
                } else {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                }
                fVar2.B(i3, d.SET_SELECTION, hashMap3);
                f fVar4 = (f) hashMap.get(Integer.valueOf(i3));
                fVar4.f3507g = ((Integer) hashMap3.get("base")).intValue();
                fVar4.f3508h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                fVar2.A(i3, d.EXPAND);
                return true;
            case 524288:
                fVar2.A(i3, d.COLLAPSE);
                return true;
            case 1048576:
                fVar2.A(i3, d.DISMISS);
                return true;
            case 2097152:
                if (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    str = "";
                } else {
                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                }
                fVar2.B(i3, d.SET_TEXT, str);
                fVar.f3518r = str;
                fVar.f3519s = null;
                return true;
            case 16908342:
                fVar2.A(i3, d.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f3534h.get(Integer.valueOf(i4 - 267386881));
                if (eVar == null) {
                    return false;
                }
                fVar2.B(i3, d.CUSTOM_ACTION, Integer.valueOf(eVar.f3471b));
                return true;
        }
    }
}
