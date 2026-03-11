package androidx.appcompat.view.menu;

import A.A;
import C0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ai9poker.app.R;
import e.C0153a;
import i.C0208j;
import i.C0214p;
import java.lang.reflect.Field;

public class ListMenuItemView extends LinearLayout implements C0214p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f  reason: collision with root package name */
    public C0208j f2088f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f2089g;

    /* renamed from: h  reason: collision with root package name */
    public RadioButton f2090h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f2091i;

    /* renamed from: j  reason: collision with root package name */
    public CheckBox f2092j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f2093k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f2094l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f2095m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f2096n;

    /* renamed from: o  reason: collision with root package name */
    public final Drawable f2097o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2098p;

    /* renamed from: q  reason: collision with root package name */
    public final Context f2099q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2100r;

    /* renamed from: s  reason: collision with root package name */
    public final Drawable f2101s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2102t;

    /* renamed from: u  reason: collision with root package name */
    public LayoutInflater f2103u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f P3 = f.P(getContext(), attributeSet, C0153a.f2930n, R.attr.listMenuViewStyle);
        this.f2097o = P3.I(5);
        TypedArray typedArray = (TypedArray) P3.f127g;
        this.f2098p = typedArray.getResourceId(1, -1);
        this.f2100r = typedArray.getBoolean(7, false);
        this.f2099q = context;
        this.f2101s = P3.I(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f2102t = obtainStyledAttributes.hasValue(0);
        P3.T();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2103u == null) {
            this.f2103u = LayoutInflater.from(getContext());
        }
        return this.f2103u;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int i3;
        ImageView imageView = this.f2094l;
        if (imageView != null) {
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2095m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2095m.getLayoutParams();
            rect.top = this.f2095m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(i.C0208j r11) {
        /*
            r10 = this;
            r10.f2088f = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f3177e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            i.i r0 = r11.f3186n
            boolean r0 = r0.n()
            r3 = 1
            if (r0 == 0) goto L_0x0037
            i.i r0 = r11.f3186n
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0031
            char r0 = r11.f3182j
            goto L_0x0033
        L_0x0031:
            char r0 = r11.f3180h
        L_0x0033:
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            i.i r4 = r11.f3186n
            r4.m()
            if (r0 == 0) goto L_0x005e
            i.j r0 = r10.f2088f
            i.i r4 = r0.f3186n
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x005a
            i.i r4 = r0.f3186n
            boolean r4 = r4.m()
            if (r4 == 0) goto L_0x0054
            char r0 = r0.f3182j
            goto L_0x0056
        L_0x0054:
            char r0 = r0.f3180h
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r1
        L_0x005f:
            if (r2 != 0) goto L_0x011d
            android.widget.TextView r0 = r10.f2093k
            i.j r4 = r10.f2088f
            i.i r5 = r4.f3186n
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x0070
            char r5 = r4.f3182j
            goto L_0x0072
        L_0x0070:
            char r5 = r4.f3180h
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            java.lang.String r1 = ""
            goto L_0x011a
        L_0x0078:
            i.i r6 = r4.f3186n
            android.content.Context r7 = r6.f3151a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f3151a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009b
            r9 = 2131623953(0x7f0e0011, float:1.8875072E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009b:
            boolean r6 = r6.m()
            if (r6 == 0) goto L_0x00a4
            int r4 = r4.f3183k
            goto L_0x00a6
        L_0x00a4:
            int r4 = r4.f3181i
        L_0x00a6:
            r6 = 2131623949(0x7f0e000d, float:1.8875064E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            i.C0208j.a(r8, r4, r9, r6)
            r6 = 2131623945(0x7f0e0009, float:1.8875056E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            i.C0208j.a(r8, r4, r9, r6)
            r6 = 2131623944(0x7f0e0008, float:1.8875054E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            i.C0208j.a(r8, r4, r9, r6)
            r6 = 2131623950(0x7f0e000e, float:1.8875066E38)
            java.lang.String r6 = r7.getString(r6)
            i.C0208j.a(r8, r4, r3, r6)
            r3 = 2131623952(0x7f0e0010, float:1.887507E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            i.C0208j.a(r8, r4, r6, r3)
            r3 = 2131623948(0x7f0e000c, float:1.8875062E38)
            java.lang.String r3 = r7.getString(r3)
            i.C0208j.a(r8, r4, r1, r3)
            if (r5 == r1) goto L_0x010c
            r1 = 10
            if (r5 == r1) goto L_0x0101
            r1 = 32
            if (r5 == r1) goto L_0x00f6
            r8.append(r5)
            goto L_0x0116
        L_0x00f6:
            r1 = 2131623951(0x7f0e000f, float:1.8875068E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0116
        L_0x0101:
            r1 = 2131623947(0x7f0e000b, float:1.887506E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0116
        L_0x010c:
            r1 = 2131623946(0x7f0e000a, float:1.8875058E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x0116:
            java.lang.String r1 = r8.toString()
        L_0x011a:
            r0.setText(r1)
        L_0x011d:
            android.widget.TextView r0 = r10.f2093k
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x012a
            android.widget.TextView r0 = r10.f2093k
            r0.setVisibility(r2)
        L_0x012a:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f3189q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(i.j):void");
    }

    public C0208j getItemData() {
        return this.f2088f;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = A.f0a;
        setBackground(this.f2097o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2091i = textView;
        int i3 = this.f2098p;
        if (i3 != -1) {
            textView.setTextAppearance(this.f2099q, i3);
        }
        this.f2093k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2094l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2101s);
        }
        this.f2095m = (ImageView) findViewById(R.id.group_divider);
        this.f2096n = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i3, int i4) {
        if (this.f2089g != null && this.f2100r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2089g.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        View view;
        CompoundButton compoundButton;
        if (z3 || this.f2090h != null || this.f2092j != null) {
            if ((this.f2088f.f3195x & 4) != 0) {
                if (this.f2090h == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f2090h = radioButton;
                    LinearLayout linearLayout = this.f2096n;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f2090h;
                view = this.f2092j;
            } else {
                if (this.f2092j == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f2092j = checkBox;
                    LinearLayout linearLayout2 = this.f2096n;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f2092j;
                view = this.f2090h;
            }
            if (z3) {
                compoundButton.setChecked(this.f2088f.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f2092j;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f2090h;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f2088f.f3195x & 4) != 0) {
            if (this.f2090h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f2090h = radioButton;
                LinearLayout linearLayout = this.f2096n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2090h;
        } else {
            if (this.f2092j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f2092j = checkBox;
                LinearLayout linearLayout2 = this.f2096n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2092j;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.v = z3;
        this.f2100r = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int i3;
        ImageView imageView = this.f2095m;
        if (imageView != null) {
            if (this.f2102t || !z3) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2088f.f3186n.getClass();
        boolean z3 = this.v;
        if (z3 || this.f2100r) {
            ImageView imageView = this.f2089g;
            if (imageView != null || drawable != null || this.f2100r) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f2089g = imageView2;
                    LinearLayout linearLayout = this.f2096n;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f2100r) {
                    ImageView imageView3 = this.f2089g;
                    if (!z3) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f2089g.getVisibility() != 0) {
                        this.f2089g.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f2089g.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2091i.setText(charSequence);
            if (this.f2091i.getVisibility() != 0) {
                this.f2091i.setVisibility(0);
            }
        } else if (this.f2091i.getVisibility() != 8) {
            this.f2091i.setVisibility(8);
        }
    }
}
