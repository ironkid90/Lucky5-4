package G0;

import F0.z;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f424b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f425c;

    public /* synthetic */ k(Intent intent, Object obj, int i3) {
        this.f423a = i3;
        this.f424b = intent;
        this.f425c = obj;
    }

    public final void a() {
        switch (this.f423a) {
            case 0:
                Intent intent = this.f424b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f425c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f424b;
                if (intent2 != null) {
                    ((z) this.f425c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
