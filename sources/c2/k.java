package c2;

import a.C0094a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class k implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2784a = new Object();

    public ByteBuffer a(m mVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", mVar.f2785a);
            jSONObject.put("args", C0094a.O(mVar.f2786b));
            Object O2 = C0094a.O(jSONObject);
            if (O2 instanceof String) {
                y yVar = y.f2800b;
                String quote = JSONObject.quote((String) O2);
                yVar.getClass();
                return y.d(quote);
            }
            y yVar2 = y.f2800b;
            String obj = O2.toString();
            yVar2.getClass();
            return y.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(C0094a.O(obj));
        if (put == null) {
            return null;
        }
        Object O2 = C0094a.O(put);
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

    public m c(ByteBuffer byteBuffer) {
        Object obj;
        Object obj2 = null;
        if (byteBuffer == null) {
            obj = null;
        } else {
            try {
                y.f2800b.getClass();
                JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
                obj = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Invalid JSON", e2);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Object obj3 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj2 = opt;
            }
            if (obj3 instanceof String) {
                return new m(obj2, (String) obj3);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + obj);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Invalid envelope: "
            r1 = 0
            java.lang.String r2 = "Invalid JSON"
            if (r9 != 0) goto L_0x0009
            r9 = r1
            goto L_0x0021
        L_0x0009:
            c2.y r3 = c2.y.f2800b     // Catch:{ JSONException -> 0x0086 }
            r3.getClass()     // Catch:{ JSONException -> 0x0086 }
            java.lang.String r9 = c2.y.c(r9)     // Catch:{ JSONException -> 0x0086 }
            org.json.JSONTokener r3 = new org.json.JSONTokener     // Catch:{ JSONException -> 0x0086 }
            r3.<init>(r9)     // Catch:{ JSONException -> 0x0086 }
            java.lang.Object r9 = r3.nextValue()     // Catch:{ JSONException -> 0x0086 }
            boolean r3 = r3.more()     // Catch:{ JSONException -> 0x0086 }
            if (r3 != 0) goto L_0x0080
        L_0x0021:
            boolean r3 = r9 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x003b }
            if (r3 == 0) goto L_0x006e
            r3 = r9
            org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch:{ JSONException -> 0x003b }
            int r4 = r3.length()     // Catch:{ JSONException -> 0x003b }
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x003d
            java.lang.Object r9 = r3.opt(r5)     // Catch:{ JSONException -> 0x003b }
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x003b }
            if (r9 != r0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r9
        L_0x003a:
            return r1
        L_0x003b:
            r9 = move-exception
            goto L_0x008d
        L_0x003d:
            int r4 = r3.length()     // Catch:{ JSONException -> 0x003b }
            r7 = 3
            if (r4 != r7) goto L_0x006e
            java.lang.Object r4 = r3.get(r5)     // Catch:{ JSONException -> 0x003b }
            java.lang.Object r5 = r3.opt(r6)     // Catch:{ JSONException -> 0x003b }
            java.lang.Object r6 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x003b }
            if (r5 != r6) goto L_0x0051
            r5 = r1
        L_0x0051:
            r7 = 2
            java.lang.Object r3 = r3.opt(r7)     // Catch:{ JSONException -> 0x003b }
            if (r3 != r6) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = r3
        L_0x005a:
            boolean r3 = r4 instanceof java.lang.String     // Catch:{ JSONException -> 0x003b }
            if (r3 == 0) goto L_0x006e
            if (r5 == 0) goto L_0x0064
            boolean r3 = r5 instanceof java.lang.String     // Catch:{ JSONException -> 0x003b }
            if (r3 == 0) goto L_0x006e
        L_0x0064:
            c2.i r9 = new c2.i     // Catch:{ JSONException -> 0x003b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x003b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x003b }
            r9.<init>(r4, r5, r1)     // Catch:{ JSONException -> 0x003b }
            throw r9     // Catch:{ JSONException -> 0x003b }
        L_0x006e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x003b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x003b }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x003b }
            r3.append(r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r9 = r3.toString()     // Catch:{ JSONException -> 0x003b }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x003b }
            throw r1     // Catch:{ JSONException -> 0x003b }
        L_0x0080:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0086 }
            r9.<init>(r2)     // Catch:{ JSONException -> 0x0086 }
            throw r9     // Catch:{ JSONException -> 0x0086 }
        L_0x0086:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x003b }
            r0.<init>(r2, r9)     // Catch:{ JSONException -> 0x003b }
            throw r0     // Catch:{ JSONException -> 0x003b }
        L_0x008d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.k.d(java.nio.ByteBuffer):java.lang.Object");
    }

    public ByteBuffer e(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(C0094a.O(str)).put(JSONObject.NULL).put(C0094a.O(str2));
        if (put == null) {
            return null;
        }
        Object O2 = C0094a.O(put);
        if (O2 instanceof String) {
            y yVar = y.f2800b;
            String quote = JSONObject.quote((String) O2);
            yVar.getClass();
            return y.d(quote);
        }
        y yVar2 = y.f2800b;
        String obj = O2.toString();
        yVar2.getClass();
        return y.d(obj);
    }

    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(C0094a.O(str2)).put(C0094a.O(obj));
        if (put == null) {
            return null;
        }
        Object O2 = C0094a.O(put);
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
