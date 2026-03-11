package M;

import A2.i;
import A2.j;
import java.util.Map;
import z2.l;

public final class a extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1070g = new j(1);

    public final Object j(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int i3 = 0;
            for (byte b3 : bArr) {
                i3++;
                if (i3 > 1) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(b3));
            }
            sb.append("]");
            str = sb.toString();
        } else {
            str = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f1078a + " = " + str;
    }
}
