package q;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ai9poker.app.R;
import io.flutter.plugin.platform.f;
import java.util.ArrayList;

/* renamed from: q.p  reason: case insensitive filesystem */
public final class C0386p {

    /* renamed from: A  reason: collision with root package name */
    public int f4266A = 0;

    /* renamed from: B  reason: collision with root package name */
    public String f4267B;

    /* renamed from: C  reason: collision with root package name */
    public String f4268C;

    /* renamed from: D  reason: collision with root package name */
    public long f4269D;

    /* renamed from: E  reason: collision with root package name */
    public int f4270E = 0;

    /* renamed from: F  reason: collision with root package name */
    public final boolean f4271F;

    /* renamed from: G  reason: collision with root package name */
    public final Notification f4272G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f4273H;

    /* renamed from: I  reason: collision with root package name */
    public final ArrayList f4274I;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4275a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4276b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4277c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f4278d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f4279e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4280f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f4281g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f4282h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f4283i;

    /* renamed from: j  reason: collision with root package name */
    public int f4284j;

    /* renamed from: k  reason: collision with root package name */
    public int f4285k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4286l = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4287m;

    /* renamed from: n  reason: collision with root package name */
    public D f4288n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f4289o;

    /* renamed from: p  reason: collision with root package name */
    public int f4290p;

    /* renamed from: q  reason: collision with root package name */
    public int f4291q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4292r;

    /* renamed from: s  reason: collision with root package name */
    public String f4293s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4294t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4295u = false;
    public boolean v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4296w;

    /* renamed from: x  reason: collision with root package name */
    public String f4297x;

    /* renamed from: y  reason: collision with root package name */
    public Bundle f4298y;

    /* renamed from: z  reason: collision with root package name */
    public int f4299z = 0;

    public C0386p(Context context, String str) {
        Notification notification = new Notification();
        this.f4272G = notification;
        this.f4275a = context;
        this.f4267B = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f4285k = 0;
        this.f4274I = new ArrayList();
        this.f4271F = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        f fVar = new f(this);
        C0386p pVar = (C0386p) fVar.f3381d;
        D d3 = pVar.f4288n;
        if (d3 != null) {
            d3.b(fVar);
        }
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) fVar.f3380c;
        if (i3 >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i4 = fVar.f3378a;
            if (i4 != 0) {
                if (!(E.f(build) == null || (build.flags & 512) == 0 || i4 != 2)) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (E.f(build) != null && (build.flags & 512) == 0 && i4 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (d3 != null) {
            pVar.f4288n.getClass();
        }
        if (!(d3 == null || (bundle = notification.extras) == null)) {
            d3.a(bundle);
        }
        return notification;
    }

    public final void c(int i3, boolean z3) {
        Notification notification = this.f4272G;
        if (z3) {
            notification.flags = i3 | notification.flags;
            return;
        }
        notification.flags = (~i3) & notification.flags;
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f4275a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            iconCompat = IconCompat.d(bitmap);
        }
        this.f4283i = iconCompat;
    }

    public final void e(Uri uri) {
        Notification notification = this.f4272G;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = C0385o.a(C0385o.e(C0385o.c(C0385o.b(), 4), 5));
    }

    public final void f(D d3) {
        if (this.f4288n != d3) {
            this.f4288n = d3;
            if (d3 != null && d3.f4206a != this) {
                d3.f4206a = this;
                f(d3);
            }
        }
    }
}
