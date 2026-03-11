package t;

import a.C0094a;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.media.session.a;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import n.k;
import x.g;

/* renamed from: t.f  reason: case insensitive filesystem */
public final class C0472f extends C0094a {

    /* renamed from: l  reason: collision with root package name */
    public static final Class f4647l;

    /* renamed from: m  reason: collision with root package name */
    public static final Constructor f4648m;

    /* renamed from: n  reason: collision with root package name */
    public static final Method f4649n;

    /* renamed from: o  reason: collision with root package name */
    public static final Method f4650o;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            Constructor<?> constructor3 = constructor2;
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor3;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        f4648m = constructor;
        f4647l = cls;
        f4649n = method;
        f4650o = method2;
    }

    public static boolean Z(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f4649n.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface a0(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4647l, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4650o.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface h(android.content.Context r17, s.c r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = f4648m     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            r2 = r0
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            if (r2 != 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r18
            s.d[] r3 = r0.f4458a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L_0x0014:
            if (r5 >= r4) goto L_0x0071
            r6 = r3[r5]
            int r0 = r6.f4464f
            java.io.File r7 = android.support.v4.media.session.a.w(r17)
            if (r7 != 0) goto L_0x0024
            r8 = r19
        L_0x0022:
            r0 = r1
            goto L_0x0059
        L_0x0024:
            r8 = r19
            boolean r0 = android.support.v4.media.session.a.m(r7, r8, r0)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0030
            r7.delete()
            goto L_0x0022
        L_0x0030:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0055 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0049 }
            long r14 = r10.size()     // Catch:{ all -> 0x0049 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0049 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0049 }
            r9.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0049:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r10     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r1
        L_0x0056:
            r7.delete()
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            return r1
        L_0x005c:
            int r7 = r6.f4460b
            boolean r9 = r6.f4461c
            int r6 = r6.f4463e
            boolean r0 = Z(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L_0x0069
            return r1
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x006c:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0071:
            android.graphics.Typeface r0 = a0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0472f.h(android.content.Context, s.c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface i(Context context, g[] gVarArr, int i3) {
        Object obj;
        try {
            obj = f4648m.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        k kVar = new k();
        for (g gVar : gVarArr) {
            Uri uri = gVar.f4759a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, (Object) null);
            if (byteBuffer == null) {
                byteBuffer = a.z(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!Z(obj, byteBuffer, gVar.f4760b, gVar.f4761c, gVar.f4762d)) {
                return null;
            }
        }
        Typeface a02 = a0(obj);
        if (a02 == null) {
            return null;
        }
        return Typeface.create(a02, i3);
    }
}
