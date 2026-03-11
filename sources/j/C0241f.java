package j;

import android.content.Context;
import android.view.View;
import b2.h;
import com.ai9poker.app.R;
import i.C0207i;
import i.C0209k;
import i.C0211m;
import i.C0217s;

/* renamed from: j.f  reason: case insensitive filesystem */
public final class C0241f extends C0211m {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3683l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0244i f3684m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0241f(C0244i iVar, Context context, C0207i iVar2, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, iVar2, true);
        this.f3684m = iVar;
        this.f3205f = 8388613;
        h hVar = iVar.f3695A;
        this.f3207h = hVar;
        C0209k kVar = this.f3208i;
        if (kVar != null) {
            kVar.f(hVar);
        }
    }

    public final void c() {
        switch (this.f3683l) {
            case 0:
                C0244i iVar = this.f3684m;
                iVar.f3713x = null;
                iVar.getClass();
                super.c();
                return;
            default:
                C0244i iVar2 = this.f3684m;
                C0207i iVar3 = iVar2.f3698h;
                if (iVar3 != null) {
                    iVar3.c(true);
                }
                iVar2.f3712w = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0241f(C0244i iVar, Context context, C0217s sVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, sVar, false);
        this.f3684m = iVar;
        if (!sVar.f3229w.d()) {
            View view2 = iVar.f3703m;
            this.f3204e = view2 == null ? iVar.f3702l : view2;
        }
        h hVar = iVar.f3695A;
        this.f3207h = hVar;
        C0209k kVar = this.f3208i;
        if (kVar != null) {
            kVar.f(hVar);
        }
    }
}
