package androidx.profileinstaller;

import B.m;
import R.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARNING: type inference failed for: r7v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                f.s(context, new Object(), new m(12, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        m mVar = new m(12, (Object) this);
                        try {
                            f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            mVar.b(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e2) {
                            mVar.b(7, e2);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                m mVar2 = new m(12, (Object) this);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    mVar2.b(16, (Serializable) null);
                } else if (f.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    mVar2.b(14, (Serializable) null);
                } else {
                    mVar2.b(15, (Serializable) null);
                }
            }
        }
    }
}
