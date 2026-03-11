package q2;

import A2.i;
import android.support.v4.media.session.a;
import java.util.NoSuchElementException;

/* renamed from: q2.c  reason: case insensitive filesystem */
public abstract class C0400c extends a {
    public static void I(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        i.e(bArr, "<this>");
        i.e(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }

    public static final void J(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        i.e(objArr, "<this>");
        i.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static Object K(Object[] objArr) {
        i.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int L(Object[] objArr, Object obj) {
        i.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }
}
