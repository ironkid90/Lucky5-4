package R2;

import A2.i;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1385a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: R2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: R2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: R2.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000b }
            R2.j r0 = new R2.j     // Catch:{ ClassNotFoundException -> 0x000b }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x000b }
            goto L_0x0010
        L_0x000b:
            R2.i r0 = new R2.i
            r0.<init>()
        L_0x0010:
            f1385a = r0
            java.lang.String r0 = R2.l.f1393g
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "getProperty(\"java.io.tmpdir\")"
            A2.i.d(r0, r1)
            r1 = 0
            j1.e.a(r0, r1)
            S2.c r0 = new S2.c
            java.lang.Class<S2.c> r1 = S2.c.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.String r2 = "ResourceFileSystem::class.java.classLoader"
            A2.i.d(r1, r2)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.f.<clinit>():void");
    }

    public final boolean a(l lVar) {
        i.e(lVar, "path");
        if (b(lVar) != null) {
            return true;
        }
        return false;
    }

    public abstract e b(l lVar);
}
