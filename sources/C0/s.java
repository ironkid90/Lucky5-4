package C0;

import H1.a;
import W0.i;
import android.os.Bundle;
import android.util.Log;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f162a;

    /* renamed from: b  reason: collision with root package name */
    public final i f163b = new i();

    /* renamed from: c  reason: collision with root package name */
    public final int f164c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f165d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f166e;

    public s(int i3, int i4, Bundle bundle, int i5) {
        this.f166e = i5;
        this.f162a = i3;
        this.f164c = i4;
        this.f165d = bundle;
    }

    public final boolean a() {
        switch (this.f166e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(a aVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String sVar = toString();
            String obj = aVar.toString();
            Log.d("MessengerIpcClient", "Failing " + sVar + " with " + obj);
        }
        this.f163b.a(aVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String sVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + sVar + " with " + valueOf);
        }
        this.f163b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f164c + " id=" + this.f162a + " oneWay=" + a() + "}";
    }
}
