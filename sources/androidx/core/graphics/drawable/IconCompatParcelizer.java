package androidx.core.graphics.drawable;

import L.k;
import Y.a;
import Y.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2296a = aVar.f(iconCompat.f2296a, 1);
        byte[] bArr = iconCompat.f2298c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1957e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2298c = bArr;
        iconCompat.f2299d = aVar.g(iconCompat.f2299d, 3);
        iconCompat.f2300e = aVar.f(iconCompat.f2300e, 4);
        iconCompat.f2301f = aVar.f(iconCompat.f2301f, 5);
        iconCompat.f2302g = (ColorStateList) aVar.g(iconCompat.f2302g, 6);
        String str = iconCompat.f2304i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1957e.readString();
        }
        iconCompat.f2304i = str;
        String str2 = iconCompat.f2305j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1957e.readString();
        }
        iconCompat.f2305j = str2;
        iconCompat.f2303h = PorterDuff.Mode.valueOf(iconCompat.f2304i);
        switch (iconCompat.f2296a) {
            case -1:
                Parcelable parcelable = iconCompat.f2299d;
                if (parcelable != null) {
                    iconCompat.f2297b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case k.STRING_FIELD_NUMBER:
                Parcelable parcelable2 = iconCompat.f2299d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.f2298c;
                    iconCompat.f2297b = bArr3;
                    iconCompat.f2296a = 3;
                    iconCompat.f2300e = 0;
                    iconCompat.f2301f = bArr3.length;
                    break;
                } else {
                    iconCompat.f2297b = parcelable2;
                    break;
                }
            case k.FLOAT_FIELD_NUMBER:
            case k.LONG_FIELD_NUMBER:
            case k.STRING_SET_FIELD_NUMBER:
                String str3 = new String(iconCompat.f2298c, Charset.forName("UTF-16"));
                iconCompat.f2297b = str3;
                if (iconCompat.f2296a == 2 && iconCompat.f2305j == null) {
                    iconCompat.f2305j = str3.split(":", -1)[0];
                    break;
                }
            case k.INTEGER_FIELD_NUMBER:
                iconCompat.f2297b = iconCompat.f2298c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2304i = iconCompat.f2303h.name();
        switch (iconCompat.f2296a) {
            case -1:
                iconCompat.f2299d = (Parcelable) iconCompat.f2297b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER:
                iconCompat.f2299d = (Parcelable) iconCompat.f2297b;
                break;
            case k.FLOAT_FIELD_NUMBER:
                iconCompat.f2298c = ((String) iconCompat.f2297b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER:
                iconCompat.f2298c = (byte[]) iconCompat.f2297b;
                break;
            case k.LONG_FIELD_NUMBER:
            case k.STRING_SET_FIELD_NUMBER:
                iconCompat.f2298c = iconCompat.f2297b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f2296a;
        if (-1 != i3) {
            aVar.j(i3, 1);
        }
        byte[] bArr = iconCompat.f2298c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1957e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2299d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i4 = iconCompat.f2300e;
        if (i4 != 0) {
            aVar.j(i4, 4);
        }
        int i5 = iconCompat.f2301f;
        if (i5 != 0) {
            aVar.j(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f2302g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f2304i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f1957e.writeString(str);
        }
        String str2 = iconCompat.f2305j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f1957e.writeString(str2);
        }
    }
}
