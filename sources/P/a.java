package P;

import android.app.Notification;
import io.flutter.plugin.platform.f;
import q.C0391v;
import q.D;

public final class a extends D {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1239e;

    public /* synthetic */ a(int i3) {
        this.f1239e = i3;
    }

    public final void b(f fVar) {
        switch (this.f1239e) {
            case 0:
                ((Notification.Builder) fVar.f3380c).setStyle(new Notification.MediaStyle());
                return;
            default:
                ((Notification.Builder) fVar.f3380c).setStyle(C0391v.a());
                return;
        }
    }

    public String c() {
        switch (this.f1239e) {
            case 1:
                return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
            default:
                return super.c();
        }
    }
}
