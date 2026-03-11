package q;

import S1.C0078d;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import r.C0414g;

/* renamed from: q.d  reason: case insensitive filesystem */
public abstract class C0374d extends C0414g {
    public static void c(Activity activity, String[] strArr, int i3) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i4 = 0;
        while (i4 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i4])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i4));
                }
                i4++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i5 = 0;
                for (int i6 = 0; i6 < strArr.length; i6++) {
                    if (!hashSet.contains(Integer.valueOf(i6))) {
                        strArr2[i5] = strArr[i6];
                        i5++;
                    }
                }
            } else {
                return;
            }
        }
        C0371a.b(activity, strArr, i3);
    }

    public static boolean d(C0078d dVar, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i3 >= 32) {
            return C0373c.a(dVar, str);
        }
        if (i3 == 31) {
            return C0372b.b(dVar, str);
        }
        return C0371a.c(dVar, str);
    }
}
