package y1;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f4841a = new Type[0];

    public static void a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C0520a(b(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0521b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0520a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void c(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Type type) {
        boolean z3;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z3 = true;
        } else {
            z3 = false;
        }
        c(z3);
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2 || (type != null && type.equals(type2))) {
            return true;
        }
        return false;
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type g(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i3 = 0; i3 < length; i3++) {
                Class cls3 = interfaces[i3];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i3];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return g(cls.getGenericInterfaces()[i3], interfaces[i3], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class h(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return h(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return w1.o.f4741f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000b A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000d A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f A[ExcHandler: d (r2v4 'e' E1.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static w1.m j(E1.b r2) {
        /*
            r2.w()     // Catch:{ EOFException -> 0x0025, d -> 0x000f, IOException -> 0x000d, NumberFormatException -> 0x000b }
            r0 = 0
            z1.r r1 = z1.u.f4940a     // Catch:{ EOFException -> 0x0011, d -> 0x000f, IOException -> 0x000d, NumberFormatException -> 0x000b }
            w1.m r2 = z1.k.c(r2)     // Catch:{ EOFException -> 0x0011, d -> 0x000f, IOException -> 0x000d, NumberFormatException -> 0x000b }
            return r2
        L_0x000b:
            r2 = move-exception
            goto L_0x0013
        L_0x000d:
            r2 = move-exception
            goto L_0x0019
        L_0x000f:
            r2 = move-exception
            goto L_0x001f
        L_0x0011:
            r2 = move-exception
            goto L_0x0027
        L_0x0013:
            w1.n r0 = new w1.n
            r0.<init>(r2)
            throw r0
        L_0x0019:
            w1.n r0 = new w1.n
            r0.<init>(r2)
            throw r0
        L_0x001f:
            w1.n r0 = new w1.n
            r0.<init>(r2)
            throw r0
        L_0x0025:
            r2 = move-exception
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            w1.o r2 = w1.o.f4741f
            return r2
        L_0x002c:
            w1.n r0 = new w1.n
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.d.j(E1.b):w1.m");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: y1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: y1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013e A[EDGE_INSN: B:80:0x013e->B:74:0x013e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type k(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = r2
        L_0x0004:
            boolean r4 = r11 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L_0x005f
            r4 = r11
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.Object r5 = r12.get(r4)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            if (r5 == 0) goto L_0x001a
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r5 != r9) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r11 = r5
        L_0x0019:
            return r11
        L_0x001a:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r4, r11)
            if (r3 != 0) goto L_0x0022
            r3 = r4
        L_0x0022:
            java.lang.reflect.GenericDeclaration r11 = r4.getGenericDeclaration()
            boolean r5 = r11 instanceof java.lang.Class
            if (r5 == 0) goto L_0x002d
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002e
        L_0x002d:
            r11 = r2
        L_0x002e:
            if (r11 != 0) goto L_0x0032
        L_0x0030:
            r11 = r4
            goto L_0x005b
        L_0x0032:
            java.lang.reflect.Type r5 = g(r9, r10, r11)
            boolean r6 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0030
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r6 = r11.length
            r7 = r0
        L_0x0040:
            if (r7 >= r6) goto L_0x0055
            r8 = r11[r7]
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0053
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r11 = r5.getActualTypeArguments()
            r11 = r11[r7]
            goto L_0x005b
        L_0x0053:
            int r7 = r7 + r1
            goto L_0x0040
        L_0x0055:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x005b:
            if (r11 != r4) goto L_0x0004
            goto L_0x013e
        L_0x005f:
            boolean r2 = r11 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0085
            r2 = r11
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r4 = r2.isArray()
            if (r4 == 0) goto L_0x0085
            java.lang.Class r11 = r2.getComponentType()
            java.lang.reflect.Type r9 = k(r9, r10, r11, r12)
            boolean r10 = e(r11, r9)
            if (r10 == 0) goto L_0x007d
            r11 = r2
            goto L_0x013e
        L_0x007d:
            y1.a r10 = new y1.a
            r10.<init>(r9)
        L_0x0082:
            r11 = r10
            goto L_0x013e
        L_0x0085:
            boolean r2 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L_0x00a1
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = k(r9, r10, r0, r12)
            boolean r10 = e(r0, r9)
            if (r10 == 0) goto L_0x009b
            goto L_0x013e
        L_0x009b:
            y1.a r10 = new y1.a
            r10.<init>(r9)
            goto L_0x0082
        L_0x00a1:
            boolean r2 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x00e3
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r2 = r11.getOwnerType()
            java.lang.reflect.Type r4 = k(r9, r10, r2, r12)
            boolean r2 = e(r4, r2)
            r2 = r2 ^ r1
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b9:
            if (r0 >= r6) goto L_0x00d7
            r7 = r5[r0]
            java.lang.reflect.Type r7 = k(r9, r10, r7, r12)
            r8 = r5[r0]
            boolean r8 = e(r7, r8)
            if (r8 != 0) goto L_0x00d5
            if (r2 != 0) goto L_0x00d3
            java.lang.Object r2 = r5.clone()
            r5 = r2
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r2 = r1
        L_0x00d3:
            r5[r0] = r7
        L_0x00d5:
            int r0 = r0 + r1
            goto L_0x00b9
        L_0x00d7:
            if (r2 == 0) goto L_0x013e
            java.lang.reflect.Type r9 = r11.getRawType()
            y1.b r10 = new y1.b
            r10.<init>(r4, r9, r5)
            goto L_0x0082
        L_0x00e3:
            boolean r2 = r11 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L_0x013e
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r2 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r2.length
            if (r5 != r1) goto L_0x011a
            r4 = r2[r0]
            java.lang.reflect.Type r9 = k(r9, r10, r4, r12)
            r10 = r2[r0]
            if (r9 == r10) goto L_0x013e
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0109
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getLowerBounds()
            goto L_0x010e
        L_0x0109:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r0] = r9
            r9 = r10
        L_0x010e:
            y1.c r11 = new y1.c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r10[r0] = r1
            r11.<init>(r10, r9)
            goto L_0x013e
        L_0x011a:
            int r2 = r4.length
            if (r2 != r1) goto L_0x013e
            r2 = r4[r0]
            java.lang.reflect.Type r9 = k(r9, r10, r2, r12)
            r10 = r4[r0]
            if (r9 == r10) goto L_0x013e
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0132
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getUpperBounds()
            goto L_0x0137
        L_0x0132:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r0] = r9
            r9 = r10
        L_0x0137:
            y1.c r11 = new y1.c
            java.lang.reflect.Type[] r10 = f4841a
            r11.<init>(r9, r10)
        L_0x013e:
            if (r3 == 0) goto L_0x0143
            r12.put(r3, r11)
        L_0x0143:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.d.k(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static String l(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public abstract Object i(Class cls);
}
