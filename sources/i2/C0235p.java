package i2;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: i2.p  reason: case insensitive filesystem */
public abstract class C0235p {

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f3275a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3276b;

    /* renamed from: c  reason: collision with root package name */
    public int f3277c;

    public C0235p(ComponentName componentName) {
        this.f3275a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i3) {
        if (!this.f3276b) {
            this.f3276b = true;
            this.f3277c = i3;
        } else if (this.f3277c != i3) {
            throw new IllegalArgumentException("Given job ID " + i3 + " is different than previous " + this.f3277c);
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
