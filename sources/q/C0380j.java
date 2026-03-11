package q;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import u.C0490b;

/* renamed from: q.j  reason: case insensitive filesystem */
public final class C0380j {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f4251a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f4252b;

    /* renamed from: c  reason: collision with root package name */
    public final Z[] f4253c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4254d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4255e = true;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4256f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4257g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f4258h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f4259i;

    public C0380j(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Z[] zArr, Z[] zArr2, boolean z3, boolean z4, boolean z5) {
        this.f4252b = iconCompat;
        if (iconCompat != null) {
            int i3 = iconCompat.f2296a;
            if ((i3 == -1 ? C0490b.c(iconCompat.f2297b) : i3) == 2) {
                this.f4257g = iconCompat.f();
            }
        }
        this.f4258h = C0386p.b(charSequence);
        this.f4259i = pendingIntent;
        this.f4251a = bundle == null ? new Bundle() : bundle;
        this.f4253c = zArr;
        this.f4254d = z3;
        this.f4255e = z4;
        this.f4256f = z5;
    }

    public final IconCompat a() {
        int i3;
        if (this.f4252b == null && (i3 = this.f4257g) != 0) {
            this.f4252b = IconCompat.e((Resources) null, "", i3);
        }
        return this.f4252b;
    }
}
