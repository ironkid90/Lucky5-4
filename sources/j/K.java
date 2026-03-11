package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import i.C0205g;
import i.C0207i;
import i.C0208j;

public final class K extends C0260z {

    /* renamed from: s  reason: collision with root package name */
    public final int f3620s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3621t;

    /* renamed from: u  reason: collision with root package name */
    public J f3622u;
    public C0208j v;

    public K(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3620s = 21;
            this.f3621t = 22;
            return;
        }
        this.f3620s = 22;
        this.f3621t = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i3;
        C0205g gVar;
        C0208j jVar;
        int pointToPosition;
        int i4;
        if (this.f3622u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                gVar = (C0205g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (C0205g) adapter;
                i3 = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= gVar.getCount()) {
                jVar = null;
            } else {
                jVar = gVar.getItem(i4);
            }
            C0208j jVar2 = this.v;
            if (jVar2 != jVar) {
                C0207i iVar = gVar.f3144f;
                if (jVar2 != null) {
                    this.f3622u.b(iVar, jVar2);
                }
                this.v = jVar;
                if (jVar != null) {
                    this.f3622u.a(iVar, jVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f3620s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i3 != this.f3621t) {
            return super.onKeyDown(i3, keyEvent);
        } else {
            setSelection(-1);
            ((C0205g) getAdapter()).f3144f.c(false);
            return true;
        }
    }

    public void setHoverListener(J j3) {
        this.f3622u = j3;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
