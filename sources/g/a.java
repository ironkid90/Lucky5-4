package G;

import L.k;
import S1.o;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import j.e0;

public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f365a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f366b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i3) {
        super(handler);
        this.f365a = i3;
        this.f366b = obj;
    }

    public boolean deliverSelfNotifications() {
        switch (this.f365a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public void onChange(boolean z3, Uri uri) {
        switch (this.f365a) {
            case k.FLOAT_FIELD_NUMBER /*2*/:
                g gVar = (g) this.f366b;
                if (!gVar.f3546t) {
                    if (Settings.Global.getFloat(gVar.f3532f, "transition_animation_scale", 1.0f) == 0.0f) {
                        gVar.f3537k |= 4;
                    } else {
                        gVar.f3537k &= -5;
                    }
                    ((FlutterJNI) gVar.f3528b.f127g).setAccessibilityFeatures(gVar.f3537k);
                    return;
                }
                return;
            default:
                super.onChange(z3, uri);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e0 e0Var) {
        super(new Handler());
        this.f365a = 0;
        this.f366b = e0Var;
    }

    public final void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f365a) {
            case 0:
                e0 e0Var = (e0) this.f366b;
                if (e0Var.f370g && (cursor = e0Var.f371h) != null && !cursor.isClosed()) {
                    e0Var.f369f = e0Var.f371h.requery();
                    return;
                }
                return;
            case 1:
                super.onChange(z3);
                o oVar = (o) this.f366b;
                if (oVar.f1492m != null) {
                    oVar.d();
                    return;
                }
                return;
            default:
                onChange(z3, (Uri) null);
                return;
        }
    }
}
