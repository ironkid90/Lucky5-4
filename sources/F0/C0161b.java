package f0;

import A2.g;
import A2.i;
import androidx.window.extensions.layout.WindowLayoutInfo;
import p2.C0368h;
import z2.l;

/* renamed from: f0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0161b extends g implements l {
    public C0161b(C0165f fVar) {
        super(1, fVar, C0165f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    public final Object j(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        i.e(windowLayoutInfo, "p0");
        ((C0165f) this.f70g).accept(windowLayoutInfo);
        return C0368h.f4194a;
    }
}
