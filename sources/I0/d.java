package I0;

import C0.f;
import D0.c;
import F0.l;
import G0.i;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

public final class d extends a {

    /* renamed from: y  reason: collision with root package name */
    public final i f705y;

    public d(Context context, Looper looper, f fVar, i iVar, l lVar, l lVar2) {
        super(context, looper, 270, fVar, lVar, lVar2);
        this.f705y = iVar;
    }

    public final int n() {
        return 203400000;
    }

    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final c[] p() {
        return O0.c.f1236b;
    }

    public final Bundle q() {
        this.f705y.getClass();
        return new Bundle();
    }

    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean t() {
        return true;
    }
}
