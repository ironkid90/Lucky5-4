package io.flutter.view;

import android.view.View;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final View f3560a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3561b;

    public l(View view, int i3) {
        this.f3560a = view;
        this.f3561b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3561b != lVar.f3561b || !this.f3560a.equals(lVar.f3560a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3560a.hashCode() + 31) * 31) + this.f3561b;
    }
}
