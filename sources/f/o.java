package F;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class o implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f289a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f290b;

    /* renamed from: c  reason: collision with root package name */
    public Class f291c;

    /* renamed from: d  reason: collision with root package name */
    public Method f292d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f293e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f294f = false;

    public o(ActionMode.Callback callback, TextView textView) {
        this.f289a = callback;
        this.f290b = textView;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f289a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f289a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f289a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z3;
        TextView textView = this.f290b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f294f) {
            this.f294f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f291c = cls;
                this.f292d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.f293e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f291c = null;
                this.f292d = null;
                this.f293e = false;
            }
        }
        try {
            if (!this.f293e || !this.f291c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            } else {
                method = this.f292d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, new Object[]{Integer.valueOf(size)});
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(next.activityInfo.packageName)) {
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i3);
                MenuItem add = menu.add(0, 0, i3 + 100, resolveInfo.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z3);
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f289a.onPrepareActionMode(actionMode, menu);
    }
}
