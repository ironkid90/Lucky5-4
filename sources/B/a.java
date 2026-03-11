package B;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f88a;

    /* renamed from: b  reason: collision with root package name */
    public final l f89b;

    /* renamed from: c  reason: collision with root package name */
    public final int f90c;

    public a(int i3, l lVar, int i4) {
        this.f88a = i3;
        this.f89b = lVar;
        this.f90c = i4;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f88a);
        this.f89b.f98a.performAction(this.f90c, bundle);
    }
}
