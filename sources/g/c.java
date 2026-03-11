package G;

import A2.h;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import j.e0;

public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: f  reason: collision with root package name */
    public boolean f369f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f370g;

    /* renamed from: h  reason: collision with root package name */
    public Cursor f371h;

    /* renamed from: i  reason: collision with root package name */
    public Context f372i;

    /* renamed from: j  reason: collision with root package name */
    public int f373j;

    /* renamed from: k  reason: collision with root package name */
    public a f374k;

    /* renamed from: l  reason: collision with root package name */
    public b f375l;

    /* renamed from: m  reason: collision with root package name */
    public d f376m;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f371h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f374k;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f375l;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f371h = cursor;
            if (cursor != null) {
                a aVar2 = this.f374k;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f375l;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f373j = cursor.getColumnIndexOrThrow("_id");
                this.f369f = true;
                notifyDataSetChanged();
            } else {
                this.f373j = -1;
                this.f369f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f369f || (cursor = this.f371h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f369f) {
            return null;
        }
        this.f371h.moveToPosition(i3);
        if (view == null) {
            e0 e0Var = (e0) this;
            view = e0Var.f3673p.inflate(e0Var.f3672o, viewGroup, false);
        }
        a(view, this.f371h);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.Filter, G.d] */
    public final Filter getFilter() {
        if (this.f376m == null) {
            ? filter = new Filter();
            filter.f377a = this;
            this.f376m = filter;
        }
        return this.f376m;
    }

    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f369f || (cursor = this.f371h) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f371h;
    }

    public final long getItemId(int i3) {
        Cursor cursor;
        if (!this.f369f || (cursor = this.f371h) == null || !cursor.moveToPosition(i3)) {
            return 0;
        }
        return this.f371h.getLong(this.f373j);
    }

    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f369f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f371h.moveToPosition(i3)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.f371h);
            return view;
        } else {
            throw new IllegalStateException(h.e("couldn't move cursor to position ", i3));
        }
    }
}
