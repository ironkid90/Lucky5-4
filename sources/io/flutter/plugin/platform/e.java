package io.flutter.plugin.platform;

import android.view.View;

public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3376a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f3377b;

    public e(f fVar, View view) {
        this.f3377b = fVar;
        this.f3376a = view;
    }

    public final void onSystemUiVisibilityChange(int i3) {
        this.f3376a.post(new d(this, i3));
    }
}
