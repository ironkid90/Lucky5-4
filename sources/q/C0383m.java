package q;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugin.platform.f;
import u.C0490b;

/* renamed from: q.m  reason: case insensitive filesystem */
public final class C0383m extends D {

    /* renamed from: e  reason: collision with root package name */
    public IconCompat f4260e;

    /* renamed from: f  reason: collision with root package name */
    public IconCompat f4261f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4262g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4263h;

    public static IconCompat e(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.b((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.d((Bitmap) parcelable);
        }
        return null;
    }

    public final void b(f fVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) fVar.f3380c).setBigContentTitle(this.f4207b);
        IconCompat iconCompat = this.f4260e;
        Context context = fVar.f3379b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C0382l.a(bigContentTitle, C0490b.f(iconCompat, context));
            } else {
                int i3 = iconCompat.f2296a;
                if (i3 == -1) {
                    i3 = C0490b.c(iconCompat.f2297b);
                }
                if (i3 == 1) {
                    IconCompat iconCompat2 = this.f4260e;
                    int i4 = iconCompat2.f2296a;
                    if (i4 == -1) {
                        Object obj = iconCompat2.f2297b;
                        if (obj instanceof Bitmap) {
                            bitmap = (Bitmap) obj;
                        } else {
                            bitmap = null;
                        }
                    } else if (i4 == 1) {
                        bitmap = (Bitmap) iconCompat2.f2297b;
                    } else if (i4 == 5) {
                        bitmap = IconCompat.c((Bitmap) iconCompat2.f2297b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f4262g) {
            IconCompat iconCompat3 = this.f4261f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                C0381k.a(bigContentTitle, C0490b.f(iconCompat3, context));
            }
        }
        if (this.f4209d) {
            bigContentTitle.setSummaryText(this.f4208c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            C0382l.c(bigContentTitle, this.f4263h);
            C0382l.b(bigContentTitle, (CharSequence) null);
        }
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void d(Bundle bundle) {
        IconCompat iconCompat;
        super.d(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f4261f = e(bundle.getParcelable("android.largeIcon.big"));
            this.f4262g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable != null) {
            iconCompat = e(parcelable);
        } else {
            iconCompat = e(bundle.getParcelable("android.pictureIcon"));
        }
        this.f4260e = iconCompat;
        this.f4263h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
