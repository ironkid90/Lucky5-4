package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2360a;

    static {
        char[] cArr = new char[80];
        f2360a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f2360a, 0, i4);
            i3 -= i4;
        }
    }

    public static void b(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b3 : (List) obj) {
                b(sb, i3, str, b3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b4 : ((Map) obj).entrySet()) {
                b(sb, i3, str, b4);
            }
        } else {
            sb.append(10);
            a(i3, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C0103g gVar = C0103g.f2423h;
                sb.append(a.q(new C0103g(((String) obj).getBytes(C0120y.f2497a))));
                sb.append('\"');
            } else if (obj instanceof C0103g) {
                sb.append(": \"");
                sb.append(a.q((C0103g) obj));
                sb.append('\"');
            } else if (obj instanceof C0118w) {
                sb.append(" {");
                c((C0118w) obj, sb, i3 + 2);
                sb.append("\n");
                a(i3, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i3 + 2;
                b(sb, i5, "key", entry.getKey());
                b(sb, i5, "value", entry.getValue());
                sb.append("\n");
                a(i3, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(androidx.datastore.preferences.protobuf.C0118w r20, java.lang.StringBuilder r21, int r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r20.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0211
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e9
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e9
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x00e9
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C0118w.g(r14, r0, r9)
            b(r1, r2, r7, r9)
        L_0x00e7:
            r13 = 3
            goto L_0x0094
        L_0x00e9:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x0131
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x0131
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x0131
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0131
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x0131
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x0131
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C0118w.g(r13, r0, r9)
            b(r1, r2, r7, r9)
            goto L_0x00e7
        L_0x0131:
            java.lang.String r13 = r12.concat(r9)
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x013c
        L_0x013b:
            goto L_0x00e7
        L_0x013c:
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x0161
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            int r14 = r9.length()
            int r14 = r14 + -5
            java.lang.String r14 = r9.substring(r8, r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 == 0) goto L_0x0161
            goto L_0x013b
        L_0x0161:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r13 = r11.concat(r9)
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x00e7
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.C0118w.g(r7, r0, r14)
            if (r13 != 0) goto L_0x01fe
            boolean r13 = r7 instanceof java.lang.Boolean
            r14 = 1
            if (r13 == 0) goto L_0x018a
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r13 = r13 ^ r14
            goto L_0x01f9
        L_0x018a:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x0199
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x01f8
        L_0x0197:
            r13 = r14
            goto L_0x01f9
        L_0x0199:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L_0x01ab
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 != 0) goto L_0x01f8
            goto L_0x0197
        L_0x01ab:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L_0x01c1
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r16 = r13.doubleValue()
            long r16 = java.lang.Double.doubleToRawLongBits(r16)
            r18 = 0
            int r13 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x01f8
            goto L_0x0197
        L_0x01c1:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L_0x01cc
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L_0x01f9
        L_0x01cc:
            boolean r13 = r7 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r13 == 0) goto L_0x01d7
            androidx.datastore.preferences.protobuf.g r13 = androidx.datastore.preferences.protobuf.C0103g.f2423h
            boolean r13 = r7.equals(r13)
            goto L_0x01f9
        L_0x01d7:
            boolean r13 = r7 instanceof androidx.datastore.preferences.protobuf.C0097a
            if (r13 == 0) goto L_0x01ea
            r13 = r7
            androidx.datastore.preferences.protobuf.a r13 = (androidx.datastore.preferences.protobuf.C0097a) r13
            androidx.datastore.preferences.protobuf.w r13 = (androidx.datastore.preferences.protobuf.C0118w) r13
            r15 = 6
            java.lang.Object r13 = r13.e(r15)
            androidx.datastore.preferences.protobuf.w r13 = (androidx.datastore.preferences.protobuf.C0118w) r13
            if (r7 != r13) goto L_0x01f8
            goto L_0x0197
        L_0x01ea:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L_0x01f8
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 != 0) goto L_0x01f8
            goto L_0x0197
        L_0x01f8:
            r13 = r8
        L_0x01f9:
            if (r13 != 0) goto L_0x01fc
            goto L_0x020a
        L_0x01fc:
            r14 = r8
            goto L_0x020a
        L_0x01fe:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C0118w.g(r13, r0, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r14 = r13.booleanValue()
        L_0x020a:
            if (r14 == 0) goto L_0x00e7
            b(r1, r2, r9, r7)
            goto L_0x00e7
        L_0x0211:
            androidx.datastore.preferences.protobuf.c0 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x022d
        L_0x0215:
            int r3 = r0.f2411a
            if (r8 >= r3) goto L_0x022d
            int[] r3 = r0.f2412b
            r3 = r3[r8]
            r4 = 3
            int r3 = r3 >>> r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r5 = r0.f2413c
            r5 = r5[r8]
            b(r1, r2, r3, r5)
            int r8 = r8 + 1
            goto L_0x0215
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.c(androidx.datastore.preferences.protobuf.w, java.lang.StringBuilder, int):void");
    }
}
