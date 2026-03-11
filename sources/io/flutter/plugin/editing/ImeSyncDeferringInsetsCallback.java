package io.flutter.plugin.editing;

import A.A;
import A.C0018t;
import A.I;
import A.Q;
import A.V;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import b2.h;
import java.lang.reflect.Field;
import java.util.List;

@SuppressLint({"NewApi", "Override"})
@Keep
class ImeSyncDeferringInsetsCallback {
    /* access modifiers changed from: private */
    public boolean animating = false;
    private AnimationCallback animationCallback;
    /* access modifiers changed from: private */
    public final int deferredInsetTypes = WindowInsets.Type.ime();
    /* access modifiers changed from: private */
    public b imeVisibilityListener;
    private c insetsListener;
    /* access modifiers changed from: private */
    public WindowInsets lastWindowInsets;
    /* access modifiers changed from: private */
    public boolean needsSave = false;
    /* access modifiers changed from: private */
    public View view;

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = false;
                if (!(ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null)) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
            View access$400 = ImeSyncDeferringInsetsCallback.this.view;
            Field field = A.f0a;
            V a2 = C0018t.a(access$400);
            if (a2 != null && ImeSyncDeferringInsetsCallback.this.imeVisibilityListener != null) {
                boolean m3 = a2.f31a.m(8);
                h hVar = (h) ImeSyncDeferringInsetsCallback.this.imeVisibilityListener;
                if (!m3) {
                    j jVar = (j) hVar.f2743g;
                    jVar.f3357b.restartInput(jVar.f3356a);
                    return;
                }
                hVar.getClass();
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            boolean unused = ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused2 = ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i3;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z3 = false;
                for (WindowInsetsAnimation i4 : list) {
                    if ((Q.i(i4).getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z3 = true;
                    }
                }
                if (!z3) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                if ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                    i3 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
                } else {
                    i3 = 0;
                }
                I.n();
                WindowInsets.Builder k3 = I.k(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                k3.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i3, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(k3.build());
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(View view2) {
        this.view = view2;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new c(this);
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public b getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback((WindowInsetsAnimation$Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }

    public void setImeVisibilityListener(b bVar) {
        this.imeVisibilityListener = bVar;
    }
}
