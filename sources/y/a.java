package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0335b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0335b f1953a;

    /* renamed from: b  reason: collision with root package name */
    public final C0335b f1954b;

    /* renamed from: c  reason: collision with root package name */
    public final C0335b f1955c;

    public a(C0335b bVar, C0335b bVar2, C0335b bVar3) {
        this.f1953a = bVar;
        this.f1954b = bVar2;
        this.f1955c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0335b bVar = this.f1955c;
        Class cls2 = (Class) bVar.getOrDefault(name, (Object) null);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0335b bVar = this.f1953a;
        Method method = (Method) bVar.getOrDefault(str, (Object) null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0335b bVar = this.f1954b;
        Method method = (Method) bVar.getOrDefault(name, (Object) null);
        if (method != null) {
            return method;
        }
        Class b3 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b3.getDeclaredMethod("write", new Class[]{cls, a.class});
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i4) {
        if (!e(i4)) {
            return i3;
        }
        return ((b) this).f1957e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f1957e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f1957e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i4) {
        i(i4);
        ((b) this).f1957e.writeInt(i3);
    }

    public final void k(Parcelable parcelable, int i3) {
        i(i3);
        ((b) this).f1957e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f1957e.writeString((String) null);
            return;
        }
        try {
            ((b) this).f1957e.writeString(b(cVar.getClass()).getName());
            b a2 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a2});
                int i3 = a2.f1961i;
                if (i3 >= 0) {
                    int i4 = a2.f1956d.get(i3);
                    Parcel parcel = a2.f1957e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e3.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
