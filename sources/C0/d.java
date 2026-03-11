package C0;

import W0.a;
import W0.g;
import W0.h;
import W0.p;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

public final /* synthetic */ class d implements a, g {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ d f119g = new d(0);

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ d f120h = new d(1);

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ d f121i = new d(2);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f122f;

    public /* synthetic */ d(int i3) {
        this.f122f = i3;
    }

    public p a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i3 = b.f108h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return android.support.v4.media.session.a.r(bundle);
        }
        return android.support.v4.media.session.a.r((Object) null);
    }

    public Object o(h hVar) {
        switch (this.f122f) {
            case 0:
                if (hVar.e()) {
                    return (Bundle) hVar.c();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(hVar.b())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", hVar.b());
            default:
                Intent intent = (Intent) ((Bundle) hVar.c()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
