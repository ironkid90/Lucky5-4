package A2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f79a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<i> cls = i.class;
            String name = cls.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f(nullPointerException, cls.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void g(String str) {
        RuntimeException runtimeException = new RuntimeException("lateinit property " + str + " has not been initialized");
        f(runtimeException, i.class.getName());
        throw runtimeException;
    }

    public static final Object[] h(Collection collection) {
        int size = collection.size();
        Object[] objArr = f79a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            objArr2[i3] = it.next();
            if (i4 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i5 = ((i4 * 3) + 1) >>> 1;
                if (i5 <= i4) {
                    i5 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i5);
                d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i4);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i3 = i4;
        }
    }

    public static final Object[] i(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i4 = i3 + 1;
                    objArr2[i3] = it.next();
                    if (i4 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i5 = ((i4 * 3) + 1) >>> 1;
                        if (i5 <= i4) {
                            i5 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i5);
                        d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i4] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i4);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i3 = i4;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
