package A2;

import p2.C0361a;
import z2.a;
import z2.l;
import z2.p;
import z2.q;

public abstract class t {
    public static void a(int i3, Object obj) {
        if (obj != null && !c(i3, obj)) {
            e(obj, "kotlin.jvm.functions.Function" + i3);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0211, code lost:
        if (r9.equals("java.lang.Long") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022c, code lost:
        if (r9.equals("java.lang.Byte") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0239, code lost:
        if (r9.equals("java.lang.Boolean") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0254, code lost:
        if (r9.equals("java.lang.Character") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0261, code lost:
        if (r9.equals("short") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x026e, code lost:
        if (r9.equals("float") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0297, code lost:
        if (r9.equals("boolean") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02a1, code lost:
        if (r9.equals("long") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ab, code lost:
        if (r9.equals("char") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02b5, code lost:
        if (r9.equals("byte") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02f3, code lost:
        if (r9.equals("java.lang.Short") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02fd, code lost:
        if (r9.equals("java.lang.Float") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x032f, code lost:
        if (r9.equals("double") == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return "kotlin.Double";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        return "kotlin.Long";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        return "kotlin.Byte";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return "kotlin.Boolean";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return "kotlin.Char";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        return "kotlin.Short";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return "kotlin.Float";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cc, code lost:
        if (r9.equals("java.lang.Double") == false) goto L_0x037f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x037f A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r9) {
        /*
            int r0 = r9.hashCode()
            java.lang.String r1 = "kotlin.Int"
            java.lang.String r2 = "kotlin.Float"
            java.lang.String r3 = "kotlin.Short"
            java.lang.String r4 = "kotlin.Char"
            java.lang.String r5 = "kotlin.Boolean"
            java.lang.String r6 = "kotlin.Byte"
            java.lang.String r7 = "kotlin.Long"
            java.lang.String r8 = "kotlin.Double"
            switch(r0) {
                case -2061550653: goto L_0x0377;
                case -2056817302: goto L_0x036e;
                case -2034166429: goto L_0x0362;
                case -1979556166: goto L_0x0356;
                case -1571515090: goto L_0x034a;
                case -1383349348: goto L_0x033e;
                case -1383343454: goto L_0x0332;
                case -1325958191: goto L_0x0329;
                case -1182275604: goto L_0x031d;
                case -1062240117: goto L_0x030f;
                case -688322466: goto L_0x0301;
                case -527879800: goto L_0x02f7;
                case -515992664: goto L_0x02ed;
                case -246476834: goto L_0x02df;
                case -207262728: goto L_0x02d1;
                case -165139126: goto L_0x02c3;
                case 104431: goto L_0x02b9;
                case 3039496: goto L_0x02af;
                case 3052374: goto L_0x02a5;
                case 3327612: goto L_0x029b;
                case 64711720: goto L_0x0291;
                case 65821278: goto L_0x0283;
                case 77230534: goto L_0x0275;
                case 97526364: goto L_0x0268;
                case 109413500: goto L_0x025b;
                case 155276373: goto L_0x024e;
                case 226173651: goto L_0x0240;
                case 344809556: goto L_0x0233;
                case 398507100: goto L_0x0226;
                case 398585941: goto L_0x0218;
                case 398795216: goto L_0x020b;
                case 482629606: goto L_0x01fd;
                case 499831342: goto L_0x01ef;
                case 577341676: goto L_0x01e1;
                case 599019395: goto L_0x01d3;
                case 761287205: goto L_0x01c6;
                case 1052881309: goto L_0x01b8;
                case 1063877011: goto L_0x01aa;
                case 1195259493: goto L_0x019c;
                case 1275614662: goto L_0x018e;
                case 1383693018: goto L_0x0180;
                case 1630335596: goto L_0x0172;
                case 1877171123: goto L_0x0164;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r0) {
                case -1811142716: goto L_0x0156;
                case -1811142715: goto L_0x0148;
                case -1811142714: goto L_0x013a;
                case -1811142713: goto L_0x012c;
                case -1811142712: goto L_0x011e;
                case -1811142711: goto L_0x0110;
                case -1811142710: goto L_0x0102;
                case -1811142709: goto L_0x00f4;
                case -1811142708: goto L_0x00e6;
                case -1811142707: goto L_0x00d8;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r0) {
                case -1811142685: goto L_0x00ca;
                case -1811142684: goto L_0x00bc;
                case -1811142683: goto L_0x00ae;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r0) {
                case 80123371: goto L_0x00a0;
                case 80123372: goto L_0x0092;
                case 80123373: goto L_0x0084;
                case 80123374: goto L_0x0076;
                case 80123375: goto L_0x0068;
                case 80123376: goto L_0x005a;
                case 80123377: goto L_0x004c;
                case 80123378: goto L_0x003e;
                case 80123379: goto L_0x0030;
                case 80123380: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x037f
        L_0x0022:
            java.lang.String r0 = "kotlin.jvm.functions.Function9"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x002c
            goto L_0x037f
        L_0x002c:
            java.lang.String r1 = "kotlin.Function9"
            goto L_0x0383
        L_0x0030:
            java.lang.String r0 = "kotlin.jvm.functions.Function8"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003a
            goto L_0x037f
        L_0x003a:
            java.lang.String r1 = "kotlin.Function8"
            goto L_0x0383
        L_0x003e:
            java.lang.String r0 = "kotlin.jvm.functions.Function7"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0048
            goto L_0x037f
        L_0x0048:
            java.lang.String r1 = "kotlin.Function7"
            goto L_0x0383
        L_0x004c:
            java.lang.String r0 = "kotlin.jvm.functions.Function6"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0056
            goto L_0x037f
        L_0x0056:
            java.lang.String r1 = "kotlin.Function6"
            goto L_0x0383
        L_0x005a:
            java.lang.String r0 = "kotlin.jvm.functions.Function5"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0064
            goto L_0x037f
        L_0x0064:
            java.lang.String r1 = "kotlin.Function5"
            goto L_0x0383
        L_0x0068:
            java.lang.String r0 = "kotlin.jvm.functions.Function4"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0072
            goto L_0x037f
        L_0x0072:
            java.lang.String r1 = "kotlin.Function4"
            goto L_0x0383
        L_0x0076:
            java.lang.String r0 = "kotlin.jvm.functions.Function3"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0080
            goto L_0x037f
        L_0x0080:
            java.lang.String r1 = "kotlin.Function3"
            goto L_0x0383
        L_0x0084:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x008e
            goto L_0x037f
        L_0x008e:
            java.lang.String r1 = "kotlin.Function2"
            goto L_0x0383
        L_0x0092:
            java.lang.String r0 = "kotlin.jvm.functions.Function1"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x009c
            goto L_0x037f
        L_0x009c:
            java.lang.String r1 = "kotlin.Function1"
            goto L_0x0383
        L_0x00a0:
            java.lang.String r0 = "kotlin.jvm.functions.Function0"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00aa
            goto L_0x037f
        L_0x00aa:
            java.lang.String r1 = "kotlin.Function0"
            goto L_0x0383
        L_0x00ae:
            java.lang.String r0 = "kotlin.jvm.functions.Function22"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b8
            goto L_0x037f
        L_0x00b8:
            java.lang.String r1 = "kotlin.Function22"
            goto L_0x0383
        L_0x00bc:
            java.lang.String r0 = "kotlin.jvm.functions.Function21"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00c6
            goto L_0x037f
        L_0x00c6:
            java.lang.String r1 = "kotlin.Function21"
            goto L_0x0383
        L_0x00ca:
            java.lang.String r0 = "kotlin.jvm.functions.Function20"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00d4
            goto L_0x037f
        L_0x00d4:
            java.lang.String r1 = "kotlin.Function20"
            goto L_0x0383
        L_0x00d8:
            java.lang.String r0 = "kotlin.jvm.functions.Function19"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00e2
            goto L_0x037f
        L_0x00e2:
            java.lang.String r1 = "kotlin.Function19"
            goto L_0x0383
        L_0x00e6:
            java.lang.String r0 = "kotlin.jvm.functions.Function18"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f0
            goto L_0x037f
        L_0x00f0:
            java.lang.String r1 = "kotlin.Function18"
            goto L_0x0383
        L_0x00f4:
            java.lang.String r0 = "kotlin.jvm.functions.Function17"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00fe
            goto L_0x037f
        L_0x00fe:
            java.lang.String r1 = "kotlin.Function17"
            goto L_0x0383
        L_0x0102:
            java.lang.String r0 = "kotlin.jvm.functions.Function16"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x010c
            goto L_0x037f
        L_0x010c:
            java.lang.String r1 = "kotlin.Function16"
            goto L_0x0383
        L_0x0110:
            java.lang.String r0 = "kotlin.jvm.functions.Function15"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x011a
            goto L_0x037f
        L_0x011a:
            java.lang.String r1 = "kotlin.Function15"
            goto L_0x0383
        L_0x011e:
            java.lang.String r0 = "kotlin.jvm.functions.Function14"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0128
            goto L_0x037f
        L_0x0128:
            java.lang.String r1 = "kotlin.Function14"
            goto L_0x0383
        L_0x012c:
            java.lang.String r0 = "kotlin.jvm.functions.Function13"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0136
            goto L_0x037f
        L_0x0136:
            java.lang.String r1 = "kotlin.Function13"
            goto L_0x0383
        L_0x013a:
            java.lang.String r0 = "kotlin.jvm.functions.Function12"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0144
            goto L_0x037f
        L_0x0144:
            java.lang.String r1 = "kotlin.Function12"
            goto L_0x0383
        L_0x0148:
            java.lang.String r0 = "kotlin.jvm.functions.Function11"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0152
            goto L_0x037f
        L_0x0152:
            java.lang.String r1 = "kotlin.Function11"
            goto L_0x0383
        L_0x0156:
            java.lang.String r0 = "kotlin.jvm.functions.Function10"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0160
            goto L_0x037f
        L_0x0160:
            java.lang.String r1 = "kotlin.Function10"
            goto L_0x0383
        L_0x0164:
            java.lang.String r0 = "kotlin.jvm.internal.IntCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x016e
            goto L_0x037f
        L_0x016e:
            java.lang.String r1 = "kotlin.Int.Companion"
            goto L_0x0383
        L_0x0172:
            java.lang.String r0 = "java.lang.Throwable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x017c
            goto L_0x037f
        L_0x017c:
            java.lang.String r1 = "kotlin.Throwable"
            goto L_0x0383
        L_0x0180:
            java.lang.String r0 = "kotlin.jvm.internal.BooleanCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x018a
            goto L_0x037f
        L_0x018a:
            java.lang.String r1 = "kotlin.Boolean.Companion"
            goto L_0x0383
        L_0x018e:
            java.lang.String r0 = "java.lang.Iterable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0198
            goto L_0x037f
        L_0x0198:
            java.lang.String r1 = "kotlin.collections.Iterable"
            goto L_0x0383
        L_0x019c:
            java.lang.String r0 = "java.lang.String"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01a6
            goto L_0x037f
        L_0x01a6:
            java.lang.String r1 = "kotlin.String"
            goto L_0x0383
        L_0x01aa:
            java.lang.String r0 = "java.lang.Object"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01b4
            goto L_0x037f
        L_0x01b4:
            java.lang.String r1 = "kotlin.Any"
            goto L_0x0383
        L_0x01b8:
            java.lang.String r0 = "java.lang.Number"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01c2
            goto L_0x037f
        L_0x01c2:
            java.lang.String r1 = "kotlin.Number"
            goto L_0x0383
        L_0x01c6:
            java.lang.String r0 = "java.lang.Double"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01d0
            goto L_0x037f
        L_0x01d0:
            r1 = r8
            goto L_0x0383
        L_0x01d3:
            java.lang.String r0 = "kotlin.jvm.internal.StringCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01dd
            goto L_0x037f
        L_0x01dd:
            java.lang.String r1 = "kotlin.String.Companion"
            goto L_0x0383
        L_0x01e1:
            java.lang.String r0 = "java.util.ListIterator"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01eb
            goto L_0x037f
        L_0x01eb:
            java.lang.String r1 = "kotlin.collections.ListIterator"
            goto L_0x0383
        L_0x01ef:
            java.lang.String r0 = "java.util.Iterator"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01f9
            goto L_0x037f
        L_0x01f9:
            java.lang.String r1 = "kotlin.collections.Iterator"
            goto L_0x0383
        L_0x01fd:
            java.lang.String r0 = "kotlin.jvm.internal.FloatCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0207
            goto L_0x037f
        L_0x0207:
            java.lang.String r1 = "kotlin.Float.Companion"
            goto L_0x0383
        L_0x020b:
            java.lang.String r0 = "java.lang.Long"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0215
            goto L_0x037f
        L_0x0215:
            r1 = r7
            goto L_0x0383
        L_0x0218:
            java.lang.String r0 = "java.lang.Enum"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0222
            goto L_0x037f
        L_0x0222:
            java.lang.String r1 = "kotlin.Enum"
            goto L_0x0383
        L_0x0226:
            java.lang.String r0 = "java.lang.Byte"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0230
            goto L_0x037f
        L_0x0230:
            r1 = r6
            goto L_0x0383
        L_0x0233:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x023d
            goto L_0x037f
        L_0x023d:
            r1 = r5
            goto L_0x0383
        L_0x0240:
            java.lang.String r0 = "kotlin.jvm.internal.EnumCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x024a
            goto L_0x037f
        L_0x024a:
            java.lang.String r1 = "kotlin.Enum.Companion"
            goto L_0x0383
        L_0x024e:
            java.lang.String r0 = "java.lang.Character"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0258
            goto L_0x037f
        L_0x0258:
            r1 = r4
            goto L_0x0383
        L_0x025b:
            java.lang.String r0 = "short"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0265
            goto L_0x037f
        L_0x0265:
            r1 = r3
            goto L_0x0383
        L_0x0268:
            java.lang.String r0 = "float"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0272
            goto L_0x037f
        L_0x0272:
            r1 = r2
            goto L_0x0383
        L_0x0275:
            java.lang.String r0 = "kotlin.jvm.internal.ShortCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x027f
            goto L_0x037f
        L_0x027f:
            java.lang.String r1 = "kotlin.Short.Companion"
            goto L_0x0383
        L_0x0283:
            java.lang.String r0 = "java.util.List"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x028d
            goto L_0x037f
        L_0x028d:
            java.lang.String r1 = "kotlin.collections.List"
            goto L_0x0383
        L_0x0291:
            java.lang.String r0 = "boolean"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x023d
            goto L_0x037f
        L_0x029b:
            java.lang.String r0 = "long"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0215
            goto L_0x037f
        L_0x02a5:
            java.lang.String r0 = "char"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0258
            goto L_0x037f
        L_0x02af:
            java.lang.String r0 = "byte"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0230
            goto L_0x037f
        L_0x02b9:
            java.lang.String r0 = "int"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0383
            goto L_0x037f
        L_0x02c3:
            java.lang.String r0 = "java.util.Map$Entry"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02cd
            goto L_0x037f
        L_0x02cd:
            java.lang.String r1 = "kotlin.collections.Map.Entry"
            goto L_0x0383
        L_0x02d1:
            java.lang.String r0 = "kotlin.jvm.internal.LongCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02db
            goto L_0x037f
        L_0x02db:
            java.lang.String r1 = "kotlin.Long.Companion"
            goto L_0x0383
        L_0x02df:
            java.lang.String r0 = "kotlin.jvm.internal.CharCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02e9
            goto L_0x037f
        L_0x02e9:
            java.lang.String r1 = "kotlin.Char.Companion"
            goto L_0x0383
        L_0x02ed:
            java.lang.String r0 = "java.lang.Short"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0265
            goto L_0x037f
        L_0x02f7:
            java.lang.String r0 = "java.lang.Float"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0272
            goto L_0x037f
        L_0x0301:
            java.lang.String r0 = "java.util.Collection"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x030b
            goto L_0x037f
        L_0x030b:
            java.lang.String r1 = "kotlin.collections.Collection"
            goto L_0x0383
        L_0x030f:
            java.lang.String r0 = "java.lang.CharSequence"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0319
            goto L_0x037f
        L_0x0319:
            java.lang.String r1 = "kotlin.CharSequence"
            goto L_0x0383
        L_0x031d:
            java.lang.String r0 = "kotlin.jvm.internal.ByteCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0326
            goto L_0x037f
        L_0x0326:
            java.lang.String r1 = "kotlin.Byte.Companion"
            goto L_0x0383
        L_0x0329:
            java.lang.String r0 = "double"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01d0
            goto L_0x037f
        L_0x0332:
            java.lang.String r0 = "java.util.Set"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x033b
            goto L_0x037f
        L_0x033b:
            java.lang.String r1 = "kotlin.collections.Set"
            goto L_0x0383
        L_0x033e:
            java.lang.String r0 = "java.util.Map"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0347
            goto L_0x037f
        L_0x0347:
            java.lang.String r1 = "kotlin.collections.Map"
            goto L_0x0383
        L_0x034a:
            java.lang.String r0 = "java.lang.Comparable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0353
            goto L_0x037f
        L_0x0353:
            java.lang.String r1 = "kotlin.Comparable"
            goto L_0x0383
        L_0x0356:
            java.lang.String r0 = "java.lang.annotation.Annotation"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x035f
            goto L_0x037f
        L_0x035f:
            java.lang.String r1 = "kotlin.Annotation"
            goto L_0x0383
        L_0x0362:
            java.lang.String r0 = "java.lang.Cloneable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x036b
            goto L_0x037f
        L_0x036b:
            java.lang.String r1 = "kotlin.Cloneable"
            goto L_0x0383
        L_0x036e:
            java.lang.String r0 = "java.lang.Integer"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0383
            goto L_0x037f
        L_0x0377:
            java.lang.String r0 = "kotlin.jvm.internal.DoubleCompanionObject"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0381
        L_0x037f:
            r1 = 0
            goto L_0x0383
        L_0x0381:
            java.lang.String r1 = "kotlin.Double.Companion"
        L_0x0383:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.t.b(java.lang.String):java.lang.String");
    }

    public static boolean c(int i3, Object obj) {
        int i4;
        if (!(obj instanceof C0361a)) {
            return false;
        }
        if (obj instanceof f) {
            i4 = ((f) obj).d();
        } else if (obj instanceof a) {
            i4 = 0;
        } else if (obj instanceof l) {
            i4 = 1;
        } else if (obj instanceof p) {
            i4 = 2;
        } else if (obj instanceof q) {
            i4 = 3;
        } else {
            i4 = -1;
        }
        if (i4 == i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fc, code lost:
        if (r10.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0206, code lost:
        if (r10.equals("java.lang.Long") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0221, code lost:
        if (r10.equals("java.lang.Byte") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022e, code lost:
        if (r10.equals("java.lang.Boolean") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023b, code lost:
        if (r10.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0245, code lost:
        if (r10.equals("java.lang.Character") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0252, code lost:
        if (r10.equals("short") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x025f, code lost:
        if (r10.equals("float") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026c, code lost:
        if (r10.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0284, code lost:
        if (r10.equals("boolean") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x028e, code lost:
        if (r10.equals("long") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0298, code lost:
        if (r10.equals("char") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02a2, code lost:
        if (r10.equals("byte") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02c4, code lost:
        if (r10.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ce, code lost:
        if (r10.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d8, code lost:
        if (r10.equals("java.lang.Short") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e2, code lost:
        if (r10.equals("java.lang.Float") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0308, code lost:
        if (r10.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0311, code lost:
        if (r10.equals("double") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x035f, code lost:
        if (r10.equals("kotlin.jvm.internal.DoubleCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return "Companion";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return "Double";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return "Long";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return "Byte";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return "Boolean";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return "Char";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return "Short";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return "Float";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        if (r10.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        if (r10.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c9, code lost:
        if (r10.equals("java.lang.Double") == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d6, code lost:
        if (r10.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L_0x0361;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0361 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.String r10) {
        /*
            int r0 = r10.hashCode()
            java.lang.String r1 = "Int"
            java.lang.String r2 = "Float"
            java.lang.String r3 = "Short"
            java.lang.String r4 = "Char"
            java.lang.String r5 = "Boolean"
            java.lang.String r6 = "Byte"
            java.lang.String r7 = "Long"
            java.lang.String r8 = "Double"
            java.lang.String r9 = "Companion"
            switch(r0) {
                case -2061550653: goto L_0x0359;
                case -2056817302: goto L_0x0350;
                case -2034166429: goto L_0x0344;
                case -1979556166: goto L_0x0338;
                case -1571515090: goto L_0x032c;
                case -1383349348: goto L_0x0320;
                case -1383343454: goto L_0x0314;
                case -1325958191: goto L_0x030b;
                case -1182275604: goto L_0x0302;
                case -1062240117: goto L_0x02f4;
                case -688322466: goto L_0x02e6;
                case -527879800: goto L_0x02dc;
                case -515992664: goto L_0x02d2;
                case -246476834: goto L_0x02c8;
                case -207262728: goto L_0x02be;
                case -165139126: goto L_0x02b0;
                case 104431: goto L_0x02a6;
                case 3039496: goto L_0x029c;
                case 3052374: goto L_0x0292;
                case 3327612: goto L_0x0288;
                case 64711720: goto L_0x027e;
                case 65821278: goto L_0x0270;
                case 77230534: goto L_0x0266;
                case 97526364: goto L_0x0259;
                case 109413500: goto L_0x024c;
                case 155276373: goto L_0x023f;
                case 226173651: goto L_0x0235;
                case 344809556: goto L_0x0228;
                case 398507100: goto L_0x021b;
                case 398585941: goto L_0x020d;
                case 398795216: goto L_0x0200;
                case 482629606: goto L_0x01f6;
                case 499831342: goto L_0x01e8;
                case 577341676: goto L_0x01da;
                case 599019395: goto L_0x01d0;
                case 761287205: goto L_0x01c3;
                case 1052881309: goto L_0x01b5;
                case 1063877011: goto L_0x01a7;
                case 1195259493: goto L_0x0199;
                case 1275614662: goto L_0x018b;
                case 1383693018: goto L_0x0181;
                case 1630335596: goto L_0x0173;
                case 1877171123: goto L_0x0166;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r0) {
                case -1811142716: goto L_0x0158;
                case -1811142715: goto L_0x014a;
                case -1811142714: goto L_0x013c;
                case -1811142713: goto L_0x012e;
                case -1811142712: goto L_0x0120;
                case -1811142711: goto L_0x0112;
                case -1811142710: goto L_0x0104;
                case -1811142709: goto L_0x00f6;
                case -1811142708: goto L_0x00e8;
                case -1811142707: goto L_0x00da;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r0) {
                case -1811142685: goto L_0x00cc;
                case -1811142684: goto L_0x00be;
                case -1811142683: goto L_0x00b0;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r0) {
                case 80123371: goto L_0x00a2;
                case 80123372: goto L_0x0094;
                case 80123373: goto L_0x0086;
                case 80123374: goto L_0x0078;
                case 80123375: goto L_0x006a;
                case 80123376: goto L_0x005c;
                case 80123377: goto L_0x004e;
                case 80123378: goto L_0x0040;
                case 80123379: goto L_0x0032;
                case 80123380: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0361
        L_0x0024:
            java.lang.String r0 = "kotlin.jvm.functions.Function9"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x002e
            goto L_0x0361
        L_0x002e:
            java.lang.String r1 = "Function9"
            goto L_0x0362
        L_0x0032:
            java.lang.String r0 = "kotlin.jvm.functions.Function8"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x003c
            goto L_0x0361
        L_0x003c:
            java.lang.String r1 = "Function8"
            goto L_0x0362
        L_0x0040:
            java.lang.String r0 = "kotlin.jvm.functions.Function7"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x004a
            goto L_0x0361
        L_0x004a:
            java.lang.String r1 = "Function7"
            goto L_0x0362
        L_0x004e:
            java.lang.String r0 = "kotlin.jvm.functions.Function6"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0058
            goto L_0x0361
        L_0x0058:
            java.lang.String r1 = "Function6"
            goto L_0x0362
        L_0x005c:
            java.lang.String r0 = "kotlin.jvm.functions.Function5"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0066
            goto L_0x0361
        L_0x0066:
            java.lang.String r1 = "Function5"
            goto L_0x0362
        L_0x006a:
            java.lang.String r0 = "kotlin.jvm.functions.Function4"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0074
            goto L_0x0361
        L_0x0074:
            java.lang.String r1 = "Function4"
            goto L_0x0362
        L_0x0078:
            java.lang.String r0 = "kotlin.jvm.functions.Function3"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0082
            goto L_0x0361
        L_0x0082:
            java.lang.String r1 = "Function3"
            goto L_0x0362
        L_0x0086:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0090
            goto L_0x0361
        L_0x0090:
            java.lang.String r1 = "Function2"
            goto L_0x0362
        L_0x0094:
            java.lang.String r0 = "kotlin.jvm.functions.Function1"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x009e
            goto L_0x0361
        L_0x009e:
            java.lang.String r1 = "Function1"
            goto L_0x0362
        L_0x00a2:
            java.lang.String r0 = "kotlin.jvm.functions.Function0"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0361
        L_0x00ac:
            java.lang.String r1 = "Function0"
            goto L_0x0362
        L_0x00b0:
            java.lang.String r0 = "kotlin.jvm.functions.Function22"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00ba
            goto L_0x0361
        L_0x00ba:
            java.lang.String r1 = "Function22"
            goto L_0x0362
        L_0x00be:
            java.lang.String r0 = "kotlin.jvm.functions.Function21"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00c8
            goto L_0x0361
        L_0x00c8:
            java.lang.String r1 = "Function21"
            goto L_0x0362
        L_0x00cc:
            java.lang.String r0 = "kotlin.jvm.functions.Function20"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00d6
            goto L_0x0361
        L_0x00d6:
            java.lang.String r1 = "Function20"
            goto L_0x0362
        L_0x00da:
            java.lang.String r0 = "kotlin.jvm.functions.Function19"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00e4
            goto L_0x0361
        L_0x00e4:
            java.lang.String r1 = "Function19"
            goto L_0x0362
        L_0x00e8:
            java.lang.String r0 = "kotlin.jvm.functions.Function18"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00f2
            goto L_0x0361
        L_0x00f2:
            java.lang.String r1 = "Function18"
            goto L_0x0362
        L_0x00f6:
            java.lang.String r0 = "kotlin.jvm.functions.Function17"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0100
            goto L_0x0361
        L_0x0100:
            java.lang.String r1 = "Function17"
            goto L_0x0362
        L_0x0104:
            java.lang.String r0 = "kotlin.jvm.functions.Function16"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x010e
            goto L_0x0361
        L_0x010e:
            java.lang.String r1 = "Function16"
            goto L_0x0362
        L_0x0112:
            java.lang.String r0 = "kotlin.jvm.functions.Function15"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x011c
            goto L_0x0361
        L_0x011c:
            java.lang.String r1 = "Function15"
            goto L_0x0362
        L_0x0120:
            java.lang.String r0 = "kotlin.jvm.functions.Function14"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x012a
            goto L_0x0361
        L_0x012a:
            java.lang.String r1 = "Function14"
            goto L_0x0362
        L_0x012e:
            java.lang.String r0 = "kotlin.jvm.functions.Function13"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0138
            goto L_0x0361
        L_0x0138:
            java.lang.String r1 = "Function13"
            goto L_0x0362
        L_0x013c:
            java.lang.String r0 = "kotlin.jvm.functions.Function12"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0146
            goto L_0x0361
        L_0x0146:
            java.lang.String r1 = "Function12"
            goto L_0x0362
        L_0x014a:
            java.lang.String r0 = "kotlin.jvm.functions.Function11"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0154
            goto L_0x0361
        L_0x0154:
            java.lang.String r1 = "Function11"
            goto L_0x0362
        L_0x0158:
            java.lang.String r0 = "kotlin.jvm.functions.Function10"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0162
            goto L_0x0361
        L_0x0162:
            java.lang.String r1 = "Function10"
            goto L_0x0362
        L_0x0166:
            java.lang.String r0 = "kotlin.jvm.internal.IntCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x0170:
            r1 = r9
            goto L_0x0362
        L_0x0173:
            java.lang.String r0 = "java.lang.Throwable"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x017d
            goto L_0x0361
        L_0x017d:
            java.lang.String r1 = "Throwable"
            goto L_0x0362
        L_0x0181:
            java.lang.String r0 = "kotlin.jvm.internal.BooleanCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x018b:
            java.lang.String r0 = "java.lang.Iterable"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0195
            goto L_0x0361
        L_0x0195:
            java.lang.String r1 = "Iterable"
            goto L_0x0362
        L_0x0199:
            java.lang.String r0 = "java.lang.String"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01a3
            goto L_0x0361
        L_0x01a3:
            java.lang.String r1 = "String"
            goto L_0x0362
        L_0x01a7:
            java.lang.String r0 = "java.lang.Object"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01b1
            goto L_0x0361
        L_0x01b1:
            java.lang.String r1 = "Any"
            goto L_0x0362
        L_0x01b5:
            java.lang.String r0 = "java.lang.Number"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01bf
            goto L_0x0361
        L_0x01bf:
            java.lang.String r1 = "Number"
            goto L_0x0362
        L_0x01c3:
            java.lang.String r0 = "java.lang.Double"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01cd
            goto L_0x0361
        L_0x01cd:
            r1 = r8
            goto L_0x0362
        L_0x01d0:
            java.lang.String r0 = "kotlin.jvm.internal.StringCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x01da:
            java.lang.String r0 = "java.util.ListIterator"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01e4
            goto L_0x0361
        L_0x01e4:
            java.lang.String r1 = "ListIterator"
            goto L_0x0362
        L_0x01e8:
            java.lang.String r0 = "java.util.Iterator"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01f2
            goto L_0x0361
        L_0x01f2:
            java.lang.String r1 = "Iterator"
            goto L_0x0362
        L_0x01f6:
            java.lang.String r0 = "kotlin.jvm.internal.FloatCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x0200:
            java.lang.String r0 = "java.lang.Long"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x020a
            goto L_0x0361
        L_0x020a:
            r1 = r7
            goto L_0x0362
        L_0x020d:
            java.lang.String r0 = "java.lang.Enum"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0217
            goto L_0x0361
        L_0x0217:
            java.lang.String r1 = "Enum"
            goto L_0x0362
        L_0x021b:
            java.lang.String r0 = "java.lang.Byte"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0225
            goto L_0x0361
        L_0x0225:
            r1 = r6
            goto L_0x0362
        L_0x0228:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0232
            goto L_0x0361
        L_0x0232:
            r1 = r5
            goto L_0x0362
        L_0x0235:
            java.lang.String r0 = "kotlin.jvm.internal.EnumCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x023f:
            java.lang.String r0 = "java.lang.Character"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0249
            goto L_0x0361
        L_0x0249:
            r1 = r4
            goto L_0x0362
        L_0x024c:
            java.lang.String r0 = "short"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0256
            goto L_0x0361
        L_0x0256:
            r1 = r3
            goto L_0x0362
        L_0x0259:
            java.lang.String r0 = "float"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0263
            goto L_0x0361
        L_0x0263:
            r1 = r2
            goto L_0x0362
        L_0x0266:
            java.lang.String r0 = "kotlin.jvm.internal.ShortCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x0270:
            java.lang.String r0 = "java.util.List"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x027a
            goto L_0x0361
        L_0x027a:
            java.lang.String r1 = "List"
            goto L_0x0362
        L_0x027e:
            java.lang.String r0 = "boolean"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0232
            goto L_0x0361
        L_0x0288:
            java.lang.String r0 = "long"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x020a
            goto L_0x0361
        L_0x0292:
            java.lang.String r0 = "char"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0249
            goto L_0x0361
        L_0x029c:
            java.lang.String r0 = "byte"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0225
            goto L_0x0361
        L_0x02a6:
            java.lang.String r0 = "int"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0362
            goto L_0x0361
        L_0x02b0:
            java.lang.String r0 = "java.util.Map$Entry"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x02ba
            goto L_0x0361
        L_0x02ba:
            java.lang.String r1 = "Entry"
            goto L_0x0362
        L_0x02be:
            java.lang.String r0 = "kotlin.jvm.internal.LongCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x02c8:
            java.lang.String r0 = "kotlin.jvm.internal.CharCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x02d2:
            java.lang.String r0 = "java.lang.Short"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0256
            goto L_0x0361
        L_0x02dc:
            java.lang.String r0 = "java.lang.Float"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0263
            goto L_0x0361
        L_0x02e6:
            java.lang.String r0 = "java.util.Collection"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x02f0
            goto L_0x0361
        L_0x02f0:
            java.lang.String r1 = "Collection"
            goto L_0x0362
        L_0x02f4:
            java.lang.String r0 = "java.lang.CharSequence"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x02fe
            goto L_0x0361
        L_0x02fe:
            java.lang.String r1 = "CharSequence"
            goto L_0x0362
        L_0x0302:
            java.lang.String r0 = "kotlin.jvm.internal.ByteCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
            goto L_0x0361
        L_0x030b:
            java.lang.String r0 = "double"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x01cd
            goto L_0x0361
        L_0x0314:
            java.lang.String r0 = "java.util.Set"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x031d
            goto L_0x0361
        L_0x031d:
            java.lang.String r1 = "Set"
            goto L_0x0362
        L_0x0320:
            java.lang.String r0 = "java.util.Map"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0329
            goto L_0x0361
        L_0x0329:
            java.lang.String r1 = "Map"
            goto L_0x0362
        L_0x032c:
            java.lang.String r0 = "java.lang.Comparable"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0335
            goto L_0x0361
        L_0x0335:
            java.lang.String r1 = "Comparable"
            goto L_0x0362
        L_0x0338:
            java.lang.String r0 = "java.lang.annotation.Annotation"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0341
            goto L_0x0361
        L_0x0341:
            java.lang.String r1 = "Annotation"
            goto L_0x0362
        L_0x0344:
            java.lang.String r0 = "java.lang.Cloneable"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x034d
            goto L_0x0361
        L_0x034d:
            java.lang.String r1 = "Cloneable"
            goto L_0x0362
        L_0x0350:
            java.lang.String r0 = "java.lang.Integer"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0362
            goto L_0x0361
        L_0x0359:
            java.lang.String r0 = "kotlin.jvm.internal.DoubleCompanionObject"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0170
        L_0x0361:
            r1 = 0
        L_0x0362:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.t.d(java.lang.String):java.lang.String");
    }

    public static void e(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(str2 + " cannot be cast to " + str);
        i.f(classCastException, t.class.getName());
        throw classCastException;
    }
}
