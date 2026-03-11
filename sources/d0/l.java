package D0;

import G0.m;
import O0.a;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class l extends a implements m {

    /* renamed from: d  reason: collision with root package name */
    public final int f214d;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length == 25) {
            this.f214d = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            N0.a aVar = new N0.a(f());
            parcel2.writeNoException();
            int i4 = Q0.a.f1297a;
            parcel2.writeStrongBinder(aVar);
        } else if (i3 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.f214d);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            try {
                m mVar = (m) obj;
                if (((l) mVar).f214d != this.f214d) {
                    return false;
                }
                return Arrays.equals(f(), new N0.a(((l) mVar).f()).f1170d);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f214d;
    }
}
