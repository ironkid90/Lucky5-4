package j1;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import u1.C0495b;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3841b;

    public /* synthetic */ c(d dVar, int i3) {
        this.f3840a = i3;
        this.f3841b = dVar;
    }

    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.f3840a) {
            case 0:
                d dVar = this.f3841b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f3842a.get();
                        ArrayList c3 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < c3.size(); i3++) {
                            C0262a aVar = (C0262a) c3.get(i3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f3836a);
                            jSONObject.put("dates", new JSONArray(aVar.f3837b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f3841b;
                synchronized (dVar2) {
                    ((h) dVar2.f3842a.get()).h(System.currentTimeMillis(), ((C0495b) dVar2.f3844c.get()).a());
                }
                return null;
        }
        throw th;
        throw th;
    }
}
