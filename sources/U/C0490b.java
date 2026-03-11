package u;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: u.b  reason: case insensitive filesystem */
public abstract class C0490b {
    public static int a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0492d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public static String b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0492d.b(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static int c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0492d.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        }
    }

    public static Uri d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0492d.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public static Drawable e(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            int r0 = r7.f2296a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x0156;
                case 0: goto L_0x0008;
                case 1: goto L_0x013d;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00e2;
                case 5: goto L_0x00c7;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unknown type"
            r7.<init>(r8)
            throw r7
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L_0x0020
            android.net.Uri r8 = r7.g()
            android.graphics.drawable.Icon r8 = u.C0493e.a(r8)
            goto L_0x0145
        L_0x0020:
            if (r8 == 0) goto L_0x00af
            android.net.Uri r3 = r7.g()
            java.lang.String r4 = r3.getScheme()
            java.lang.String r5 = "content"
            boolean r5 = r5.equals(r4)
            java.lang.String r6 = "IconCompat"
            if (r5 != 0) goto L_0x005f
            java.lang.String r5 = "file"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003d
            goto L_0x005f
        L_0x003d:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004c }
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004c }
            java.lang.Object r5 = r7.f2297b     // Catch:{ FileNotFoundException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x004c }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004c }
            r8.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004c }
            goto L_0x007b
        L_0x004c:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from path: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3, r8)
            goto L_0x007a
        L_0x005f:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0068 }
            java.io.InputStream r8 = r8.openInputStream(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x007b
        L_0x0068:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from URI: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3, r8)
        L_0x007a:
            r8 = 0
        L_0x007b:
            if (r8 == 0) goto L_0x0097
            if (r0 < r2) goto L_0x0089
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.drawable.Icon r8 = u.C0491c.b(r8)
            goto L_0x0145
        L_0x0089:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.c(r8, r1)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x0145
        L_0x0097:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.g()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00af:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.g()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00c7:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L_0x00d5
            java.lang.Object r8 = r7.f2297b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = u.C0491c.b(r8)
            goto L_0x0145
        L_0x00d5:
            java.lang.Object r8 = r7.f2297b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.c(r8, r1)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x0145
        L_0x00e2:
            java.lang.Object r8 = r7.f2297b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto L_0x0145
        L_0x00eb:
            java.lang.Object r8 = r7.f2297b
            byte[] r8 = (byte[]) r8
            int r0 = r7.f2300e
            int r1 = r7.f2301f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto L_0x0145
        L_0x00f8:
            int r8 = r7.f2296a
            r0 = -1
            if (r8 != r0) goto L_0x0104
            java.lang.Object r8 = r7.f2297b
            java.lang.String r8 = b(r8)
            goto L_0x0122
        L_0x0104:
            r1 = 2
            if (r8 != r1) goto L_0x0129
            java.lang.String r8 = r7.f2305j
            if (r8 == 0) goto L_0x0115
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            java.lang.String r8 = r7.f2305j
            goto L_0x0122
        L_0x0115:
            java.lang.Object r8 = r7.f2297b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r8.split(r1, r0)
            r0 = 0
            r8 = r8[r0]
        L_0x0122:
            int r0 = r7.f2300e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r8, r0)
            goto L_0x0145
        L_0x0129:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "called getResPackage() on "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x013d:
            java.lang.Object r8 = r7.f2297b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        L_0x0145:
            android.content.res.ColorStateList r0 = r7.f2302g
            if (r0 == 0) goto L_0x014c
            r8.setTintList(r0)
        L_0x014c:
            android.graphics.PorterDuff$Mode r7 = r7.f2303h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2295k
            if (r7 == r0) goto L_0x0155
            r8.setTintMode(r7)
        L_0x0155:
            return r8
        L_0x0156:
            java.lang.Object r7 = r7.f2297b
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0490b.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
