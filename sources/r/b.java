package R;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f1324a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1325b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f1326c;

    /* renamed from: d  reason: collision with root package name */
    public final File f1327d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1328e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1329f = false;

    /* renamed from: g  reason: collision with root package name */
    public c[] f1330g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f1331h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f1324a = executor;
        this.f1325b = eVar;
        this.f1328e = str;
        this.f1327d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = f.f1348h;
                    break;
                case 26:
                    bArr = f.f1347g;
                    break;
                case 27:
                    bArr = f.f1346f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f1345e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f1344d;
                    break;
            }
        }
        this.f1326c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1325b.e();
            }
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f1324a.execute(new a(this, i3, serializable));
    }
}
