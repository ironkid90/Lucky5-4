package com.google.android.gms.common.api;

import D0.a;
import F0.d;
import G0.o;
import O0.e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f2822g = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2823f = 0;

    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2823f = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                d d3 = d.d(this);
                if (i4 == -1) {
                    e eVar = d3.f319m;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i4 == 0) {
                    d3.e(new a(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f2823f = 0;
            setResult(i4, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f2823f = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2823f = bundle.getInt("resolution");
        }
        if (this.f2823f != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f2823f = 1;
                } catch (ActivityNotFoundException e2) {
                    if (extras.getBoolean("notify_manager", true)) {
                        d.d(this).e(new a(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                        if (Build.FINGERPRINT.contains("generic")) {
                            str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", str, e2);
                    }
                    this.f2823f = 1;
                    finish();
                } catch (IntentSender.SendIntentException e3) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
                    finish();
                }
            } else {
                o.e(num);
                D0.d.f200c.c(this, num.intValue(), this);
                this.f2823f = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2823f);
        super.onSaveInstanceState(bundle);
    }
}
