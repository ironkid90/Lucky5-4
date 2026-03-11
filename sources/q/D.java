package q;

import android.os.Bundle;
import io.flutter.plugin.platform.f;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public C0386p f4206a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f4207b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f4208c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4209d = false;

    public void a(Bundle bundle) {
        if (this.f4209d) {
            bundle.putCharSequence("android.summaryText", this.f4208c);
        }
        CharSequence charSequence = this.f4207b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c3 = c();
        if (c3 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
        }
    }

    public abstract void b(f fVar);

    public String c() {
        return null;
    }

    public void d(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f4208c = bundle.getCharSequence("android.summaryText");
            this.f4209d = true;
        }
        this.f4207b = bundle.getCharSequence("android.title.big");
    }
}
