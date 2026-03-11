package a0;

import A2.e;
import f0.C0161b;
import java.lang.reflect.InvocationHandler;

public final class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final e f1978a;

    /* renamed from: b  reason: collision with root package name */
    public final C0161b f1979b;

    public c(e eVar, C0161b bVar) {
        this.f1978a = eVar;
        this.f1979b = bVar;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "obj"
            A2.i.e(r7, r0)
            java.lang.String r0 = "method"
            A2.i.e(r8, r0)
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = "accept"
            boolean r0 = A2.i.a(r0, r1)
            f0.b r1 = r6.f1979b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00b8
            if (r9 == 0) goto L_0x00b8
            int r0 = r9.length
            if (r0 != r3) goto L_0x00b8
            r7 = r9[r4]
            A2.e r8 = r6.f1978a
            java.lang.Class r8 = r8.f76a
            java.lang.String r9 = "jClass"
            A2.i.e(r8, r9)
            java.util.Map r9 = A2.e.f75b
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            A2.i.c(r9, r0)
            java.lang.Object r9 = r9.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0043
            int r9 = r9.intValue()
            boolean r9 = A2.t.c(r9, r7)
            goto L_0x0057
        L_0x0043:
            boolean r9 = r8.isPrimitive()
            if (r9 == 0) goto L_0x0052
            A2.e r9 = A2.r.a(r8)
            java.lang.Class r9 = a.C0094a.v(r9)
            goto L_0x0053
        L_0x0052:
            r9 = r8
        L_0x0053:
            boolean r9 = r9.isInstance(r7)
        L_0x0057:
            if (r9 != 0) goto L_0x00ac
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Value cannot be cast to "
            r9.<init>(r0)
            boolean r0 = r8.isAnonymousClass()
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r8.isLocalClass()
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r8.isArray()
            if (r0 == 0) goto L_0x0093
            java.lang.Class r8 = r8.getComponentType()
            boolean r0 = r8.isPrimitive()
            if (r0 == 0) goto L_0x008e
            java.lang.String r8 = r8.getName()
            java.lang.String r8 = A2.t.b(r8)
            if (r8 == 0) goto L_0x008e
            java.lang.String r0 = "Array"
            java.lang.String r2 = r8.concat(r0)
        L_0x008e:
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = "kotlin.Array"
            goto L_0x00a1
        L_0x0093:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = A2.t.b(r0)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = r8.getCanonicalName()
        L_0x00a1:
            r9.append(r2)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L_0x00ac:
            java.lang.String r8 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast"
            A2.i.c(r7, r8)
            r1.j(r7)
            p2.h r7 = p2.C0368h.f4194a
            goto L_0x0131
        L_0x00b8:
            java.lang.String r0 = r8.getName()
            java.lang.String r5 = "equals"
            boolean r0 = A2.i.a(r0, r5)
            if (r0 == 0) goto L_0x00d7
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00d7
            if (r9 == 0) goto L_0x00d7
            int r0 = r9.length
            if (r0 != r3) goto L_0x00d7
            r0 = r3
            goto L_0x00d8
        L_0x00d7:
            r0 = r4
        L_0x00d8:
            if (r0 == 0) goto L_0x00e7
            if (r9 == 0) goto L_0x00de
            r2 = r9[r4]
        L_0x00de:
            if (r7 != r2) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r3 = r4
        L_0x00e2:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            goto L_0x0131
        L_0x00e7:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = "hashCode"
            boolean r0 = A2.i.a(r0, r2)
            if (r0 == 0) goto L_0x0103
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0103
            if (r9 != 0) goto L_0x0103
            r0 = r3
            goto L_0x0104
        L_0x0103:
            r0 = r4
        L_0x0104:
            if (r0 == 0) goto L_0x010f
            int r7 = r1.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0131
        L_0x010f:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = "toString"
            boolean r0 = A2.i.a(r0, r2)
            if (r0 == 0) goto L_0x012a
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x012a
            if (r9 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r3 = r4
        L_0x012b:
            if (r3 == 0) goto L_0x0132
            java.lang.String r7 = r1.toString()
        L_0x0131:
            return r7
        L_0x0132:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected method call object:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ", method: "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = ", args: "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
