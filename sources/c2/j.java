package c2;

import a.C0094a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class j implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final j f2783a = new Object();

    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            y.f2800b.getClass();
            JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object O2 = C0094a.O(obj);
        if (O2 instanceof String) {
            y yVar = y.f2800b;
            String quote = JSONObject.quote((String) O2);
            yVar.getClass();
            return y.d(quote);
        }
        y yVar2 = y.f2800b;
        String obj2 = O2.toString();
        yVar2.getClass();
        return y.d(obj2);
    }
}
