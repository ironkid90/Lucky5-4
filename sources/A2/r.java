package A2;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final s f87a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: A2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: A2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: A2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: A2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: A2.s} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            A2.s r1 = (A2.s) r1     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            A2.s r0 = new A2.s
            r0.<init>()
        L_0x0016:
            f87a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.r.<clinit>():void");
    }

    public static e a(Class cls) {
        f87a.getClass();
        return new e(cls);
    }
}
