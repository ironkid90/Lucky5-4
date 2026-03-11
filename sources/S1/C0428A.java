package s1;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s1.A  reason: case insensitive filesystem */
public final class C0428A {

    /* renamed from: d  reason: collision with root package name */
    public static final long f4484d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a  reason: collision with root package name */
    public final String f4485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4486b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4487c;

    public C0428A(String str, String str2, long j3) {
        this.f4485a = str;
        this.f4486b = str2;
        this.f4487c = j3;
    }

    public static String a(String str, String str2, long j3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j3);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
            return null;
        }
    }

    public static C0428A b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C0428A(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C0428A(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
            return null;
        }
    }
}
