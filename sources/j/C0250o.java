package j;

import U.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.ai9poker.app.R;

/* renamed from: j.o  reason: case insensitive filesystem */
public final class C0250o {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f3740b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0250o f3741c;

    /* renamed from: a  reason: collision with root package name */
    public N f3742a;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, j.o] */
    /* JADX WARNING: type inference failed for: r2v1, types: [T1.d, java.lang.Object] */
    public static synchronized void b() {
        synchronized (C0250o.class) {
            if (f3741c == null) {
                ? obj = new Object();
                f3741c = obj;
                obj.f3742a = N.b();
                N n3 = f3741c.f3742a;
                ? obj2 = new Object();
                obj2.f1703a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f1704b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f1705c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
                obj2.f1706d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f1707e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f1708f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (n3) {
                    n3.f3632e = obj2;
                }
            }
        }
    }

    public static void c(Drawable drawable, d dVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = N.f3625f;
        if (!C0258x.a(drawable) || drawable.mutate() == drawable) {
            boolean z3 = dVar.f1753b;
            if (z3 || dVar.f1752a) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z3) {
                    colorStateList = (ColorStateList) dVar.f1754c;
                } else {
                    colorStateList = null;
                }
                if (dVar.f1752a) {
                    mode = (PorterDuff.Mode) dVar.f1755d;
                } else {
                    mode = N.f3625f;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = N.e(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f3742a.c(context, i3);
    }
}
