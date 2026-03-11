package androidx.core.app;

import Y.a;
import Y.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f2289a;
        boolean z3 = true;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        remoteActionCompat.f2289a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f2290b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1957e);
        }
        remoteActionCompat.f2290b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2291c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1957e);
        }
        remoteActionCompat.f2291c = charSequence2;
        remoteActionCompat.f2292d = (PendingIntent) aVar.g(remoteActionCompat.f2292d, 4);
        boolean z4 = remoteActionCompat.f2293e;
        if (aVar.e(5)) {
            if (((b) aVar).f1957e.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        remoteActionCompat.f2293e = z4;
        boolean z5 = remoteActionCompat.f2294f;
        if (aVar.e(6)) {
            if (((b) aVar).f1957e.readInt() == 0) {
                z3 = false;
            }
            z5 = z3;
        }
        remoteActionCompat.f2294f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2289a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2290b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f1957e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2291c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f2292d, 4);
        boolean z3 = remoteActionCompat.f2293e;
        aVar.i(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f2294f;
        aVar.i(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
