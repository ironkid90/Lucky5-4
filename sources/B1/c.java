package B1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f104d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f105b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f106c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f104d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f105b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.f106c = field;
    }

    public final void a(AccessibleObject accessibleObject) {
        Field field;
        Object obj = this.f105b;
        if (!(obj == null || (field = this.f106c) == null)) {
            try {
                Long l3 = (Long) f104d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(obj, new Object[]{field});
                l3.getClass();
                f104d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(obj, new Object[]{accessibleObject, l3, Boolean.TRUE});
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new RuntimeException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
