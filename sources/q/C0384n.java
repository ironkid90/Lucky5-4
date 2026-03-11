package q;

import android.app.Notification;
import android.os.Bundle;
import io.flutter.plugin.platform.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: q.n  reason: case insensitive filesystem */
public final class C0384n extends D {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4264e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4265f;

    public C0384n(int i3) {
        this.f4264e = i3;
        switch (i3) {
            case 1:
                this.f4265f = new ArrayList();
                return;
            default:
                return;
        }
    }

    public final void b(f fVar) {
        switch (this.f4264e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) fVar.f3380c).setBigContentTitle(this.f4207b).bigText((CharSequence) this.f4265f);
                if (this.f4209d) {
                    bigText.setSummaryText(this.f4208c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) fVar.f3380c).setBigContentTitle(this.f4207b);
                if (this.f4209d) {
                    bigContentTitle.setSummaryText(this.f4208c);
                }
                Iterator it = ((ArrayList) this.f4265f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                return;
        }
    }

    public final String c() {
        switch (this.f4264e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public final void d(Bundle bundle) {
        switch (this.f4264e) {
            case 0:
                super.d(bundle);
                this.f4265f = bundle.getCharSequence("android.bigText");
                return;
            default:
                super.d(bundle);
                ArrayList arrayList = (ArrayList) this.f4265f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                    return;
                }
                return;
        }
    }
}
