package D0;

import A2.h;
import F0.z;
import G0.j;
import G0.k;
import G0.o;
import K0.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.ai9poker.app.R;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;
import q.C0380j;
import q.C0384n;
import q.C0386p;
import q.Z;

public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f199b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final d f200c = new Object();

    public static AlertDialog d(Activity activity, int i3, k kVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(j.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i3 == 1) {
            str = resources.getString(R.string.common_google_play_services_install_button);
        } else if (i3 == 2) {
            str = resources.getString(R.string.common_google_play_services_update_button);
        } else if (i3 != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(R.string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, kVar);
        }
        String c3 = j.c(activity, i3);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", h.e("Creating dialog for Google Play services availability issue. ConnectionResult=", i3), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.app.DialogFragment, D0.b] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        o.f(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.f193f = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f194g = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog d3 = d(googleApiActivity, i3, new k(super.a(i3, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d3 != null) {
            e(googleApiActivity, d3, "GooglePlayServicesErrorDialog", googleApiActivity2);
        }
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i4;
        int i5;
        Context context2 = context;
        int i6 = i3;
        PendingIntent pendingIntent2 = pendingIntent;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i6 + ", tag=null", new IllegalArgumentException());
        if (i6 == 18) {
            new i(this, context2).sendEmptyMessageDelayed(1, 120000);
            return;
        }
        if (pendingIntent2 != null) {
            if (i6 == 6) {
                str = j.e(context2, "common_google_play_services_resolution_required_title");
            } else {
                str = j.c(context, i3);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i6 == 6 || i6 == 19) {
                str2 = j.d(context2, "common_google_play_services_resolution_required_text", j.a(context));
            } else {
                str2 = j.b(context, i3);
            }
            Resources resources = context.getResources();
            Object systemService = context2.getSystemService("notification");
            o.e(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C0386p pVar = new C0386p(context2, (String) null);
            pVar.f4295u = true;
            pVar.c(16, true);
            pVar.f4279e = C0386p.b(str);
            C0384n nVar = new C0384n(0);
            nVar.f4265f = C0386p.b(str2);
            pVar.f(nVar);
            PackageManager packageManager = context.getPackageManager();
            if (b.f853b == null) {
                b.f853b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (b.f853b.booleanValue()) {
                pVar.f4272G.icon = context.getApplicationInfo().icon;
                pVar.f4285k = 2;
                if (b.c(context)) {
                    String string = resources.getString(R.string.common_open_on_phone);
                    ArrayList arrayList = pVar.f4276b;
                    C0380j jVar = r2;
                    i4 = 2;
                    C0380j jVar2 = new C0380j(IconCompat.e((Resources) null, "", R.drawable.common_full_open_on_phone), string, pendingIntent, new Bundle(), (Z[]) null, (Z[]) null, true, true, false);
                    arrayList.add(jVar);
                } else {
                    i4 = 2;
                    pVar.f4281g = pendingIntent2;
                }
            } else {
                i4 = 2;
                pVar.f4272G.icon = 17301642;
                pVar.f4272G.tickerText = C0386p.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                pVar.f4272G.when = System.currentTimeMillis();
                pVar.f4281g = pendingIntent2;
                pVar.f4280f = C0386p.b(str2);
            }
            if (b.b()) {
                if (b.b()) {
                    synchronized (f199b) {
                    }
                    NotificationChannel d3 = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string2 = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (d3 == null) {
                        notificationManager.createNotificationChannel(B.d.e(string2));
                    } else if (!string2.contentEquals(d3.getName())) {
                        d3.setName(string2);
                        notificationManager.createNotificationChannel(d3);
                    }
                    pVar.f4267B = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification a2 = pVar.a();
            if (i6 == 1 || i6 == i4 || i6 == 3) {
                f.f202a.set(false);
                i5 = 10436;
            } else {
                i5 = 39789;
            }
            notificationManager.notify(i5, a2);
        } else if (i6 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final void g(Activity activity, z zVar, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d3 = d(activity, i3, new k(super.a(i3, activity, "d"), zVar, 1), onCancelListener);
        if (d3 != null) {
            e(activity, d3, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
