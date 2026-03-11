package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public final class s implements WindowManager {

    /* renamed from: f  reason: collision with root package name */
    public final WindowManager f3424f;

    /* renamed from: g  reason: collision with root package name */
    public final m f3425g;

    public s(WindowManager windowManager, m mVar) {
        this.f3424f = windowManager;
        this.f3425g = mVar;
    }

    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f3424f.addCrossWindowBlurEnabledListener(consumer);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f3425g;
        if (mVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            mVar.addView(view, layoutParams);
        }
    }

    public final WindowMetrics getCurrentWindowMetrics() {
        return this.f3424f.getCurrentWindowMetrics();
    }

    public final Display getDefaultDisplay() {
        return this.f3424f.getDefaultDisplay();
    }

    public final WindowMetrics getMaximumWindowMetrics() {
        return this.f3424f.getMaximumWindowMetrics();
    }

    public final boolean isCrossWindowBlurEnabled() {
        return this.f3424f.isCrossWindowBlurEnabled();
    }

    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f3424f.removeCrossWindowBlurEnabledListener(consumer);
    }

    public final void removeView(View view) {
        m mVar = this.f3425g;
        if (mVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            mVar.removeView(view);
        }
    }

    public final void removeViewImmediate(View view) {
        m mVar = this.f3425g;
        if (mVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        mVar.removeView(view);
    }

    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f3425g;
        if (mVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            mVar.updateViewLayout(view, layoutParams);
        }
    }

    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f3424f.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
