package t;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.a;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s.c;
import s.d;
import x.g;

/* renamed from: t.g  reason: case insensitive filesystem */
public class C0473g extends C0471e {

    /* renamed from: q  reason: collision with root package name */
    public final Class f4651q;

    /* renamed from: r  reason: collision with root package name */
    public final Constructor f4652r;

    /* renamed from: s  reason: collision with root package name */
    public final Method f4653s;

    /* renamed from: t  reason: collision with root package name */
    public final Method f4654t;

    /* renamed from: u  reason: collision with root package name */
    public final Method f4655u;
    public final Method v;

    /* renamed from: w  reason: collision with root package name */
    public final Method f4656w;

    public C0473g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = h0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = i0(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4651q = cls;
        this.f4652r = constructor;
        this.f4653s = method4;
        this.f4654t = method3;
        this.f4655u = method2;
        this.v = method;
        this.f4656w = method5;
    }

    public static Method h0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final void b0(Object obj) {
        try {
            this.v.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean c0(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f4653s.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface d0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4651q, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4656w.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean e0(Object obj) {
        try {
            return ((Boolean) this.f4655u.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean f0() {
        Method method = this.f4653s;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object g0() {
        try {
            return this.f4652r.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Typeface h(Context context, c cVar, Resources resources, int i3) {
        if (!f0()) {
            return super.h(context, cVar, resources, i3);
        }
        Object g02 = g0();
        if (g02 == null) {
            return null;
        }
        for (d dVar : cVar.f4458a) {
            if (!c0(context, g02, dVar.f4459a, dVar.f4463e, dVar.f4460b, dVar.f4461c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f4462d))) {
                b0(g02);
                return null;
            }
        }
        if (!e0(g02)) {
            return null;
        }
        return d0(g02);
    }

    public final Typeface i(Context context, g[] gVarArr, int i3) {
        Typeface d02;
        boolean z3;
        ParcelFileDescriptor openFileDescriptor;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!f0()) {
            g s3 = s(gVarArr, i3);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(s3.f4759a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(s3.f4761c).setItalic(s3.f4762d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (g gVar : gVarArr) {
                if (gVar.f4763e == 0) {
                    Uri uri = gVar.f4759a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, a.z(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object g02 = g0();
            if (g02 == null) {
                return null;
            }
            boolean z4 = false;
            for (g gVar2 : gVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f4759a);
                if (byteBuffer != null) {
                    try {
                        z3 = ((Boolean) this.f4654t.invoke(g02, new Object[]{byteBuffer, Integer.valueOf(gVar2.f4760b), null, Integer.valueOf(gVar2.f4761c), Integer.valueOf(gVar2.f4762d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z3 = false;
                    }
                    if (!z3) {
                        b0(g02);
                        return null;
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                b0(g02);
                return null;
            } else if (e0(g02) && (d02 = d0(g02)) != null) {
                return Typeface.create(d02, i3);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Method i0(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface k(Context context, Resources resources, int i3, String str, int i4) {
        if (!f0()) {
            return super.k(context, resources, i3, str, i4);
        }
        Object g02 = g0();
        if (g02 == null) {
            return null;
        }
        if (!c0(context, g02, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            b0(g02);
            return null;
        } else if (!e0(g02)) {
            return null;
        } else {
            return d0(g02);
        }
    }
}
