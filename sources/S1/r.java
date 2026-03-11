package S1;

import A.C0002c;
import G0.z;
import W0.a;
import W0.c;
import W0.p;
import a.C0094a;
import a1.d;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import b2.h;
import c2.C0135c;
import e1.C0156b;
import g1.e;
import h2.C0191e;
import h2.C0194h;
import h2.C0195i;
import h2.C0197k;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p0.b;
import q0.m;
import s1.C0436I;
import s1.C0438K;
import s1.C0454o;
import x0.j;
import x0.k;
import y0.g;
import y0.i;
import z0.C0523b;

public final /* synthetic */ class r implements d, C0135c, c, a, C0523b, g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1505f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1506g;

    public /* synthetic */ r(int i3, Object obj) {
        this.f1505f = i3;
        this.f1506g = obj;
    }

    public Object a(T1.d dVar) {
        return this.f1506g;
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        i iVar = (i) this.f1506g;
        iVar.getClass();
        while (cursor.moveToNext()) {
            int i3 = cursor.getInt(0);
            iVar.e((long) i3, u0.c.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, s1.y] */
    public Object b() {
        Object obj = this.f1506g;
        switch (this.f1505f) {
            case 12:
                i iVar = (i) ((y0.c) obj);
                iVar.getClass();
                int i3 = u0.a.f4689e;
                ? obj2 = new Object();
                obj2.f4623g = null;
                obj2.f4624h = new ArrayList();
                obj2.f4625i = null;
                obj2.f4622f = "";
                HashMap hashMap = new HashMap();
                SQLiteDatabase a2 = iVar.a();
                a2.beginTransaction();
                try {
                    u0.a aVar = (u0.a) i.i(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0454o(iVar, hashMap, obj2, 4));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                    a2.endTransaction();
                }
            case 13:
                i iVar2 = (i) ((y0.d) obj);
                long c3 = iVar2.f4825g.c() - iVar2.f4827i.f4813d;
                SQLiteDatabase a3 = iVar2.a();
                a3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(c3)};
                    i.i(a3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new r(16, iVar2));
                    int delete = a3.delete("events", "timestamp_ms < ?", strArr);
                    a3.setTransactionSuccessful();
                    a3.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    a3.endTransaction();
                    throw th;
                }
            case 14:
                i iVar3 = (i) ((j) obj).f4800i;
                SQLiteDatabase a4 = iVar3.a();
                a4.beginTransaction();
                try {
                    a4.compileStatement("DELETE FROM log_event_dropped").execute();
                    a4.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.f4825g.c()).execute();
                    a4.setTransactionSuccessful();
                    return null;
                } finally {
                    a4.endTransaction();
                }
            default:
                k kVar = (k) obj;
                for (r0.i a5 : (Iterable) ((i) kVar.f4802b).c(new C0002c(17))) {
                    kVar.f4803c.a(a5, 1, false);
                }
                return null;
        }
    }

    public p0.c c(Object obj) {
        OutputStream outputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        e eVar;
        Throwable th3;
        InputStream inputStream;
        Throwable th4;
        b bVar = (b) obj;
        p0.d dVar = (p0.d) this.f1506g;
        URL url = bVar.f4172a;
        String B3 = C0094a.B("CctTransportBackend");
        if (Log.isLoggable(B3, 4)) {
            Log.i(B3, String.format("Making request to: %s", new Object[]{url}));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f4172a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f4184g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f4174c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            h hVar = dVar.f4178a;
            q0.i iVar = bVar.f4173b;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
            g1.d dVar2 = (g1.d) hVar.f2743g;
            new e(bufferedWriter, dVar2.f2987a, dVar2.f2988b, dVar2.f2989c, dVar2.f2990d);
            e eVar2 = eVar;
            eVar2.f(iVar);
            eVar2.h();
            eVar2.f2992b.flush();
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Integer valueOf = Integer.valueOf(responseCode);
            String B4 = C0094a.B("CctTransportBackend");
            if (Log.isLoggable(B4, 4)) {
                Log.i(B4, String.format("Status Code: %d", new Object[]{valueOf}));
            }
            C0094a.l("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            C0094a.l("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new p0.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new p0.c(responseCode, (URL) null, 0);
            }
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                    inputStream = new GZIPInputStream(inputStream2);
                } else {
                    inputStream = inputStream2;
                }
                p0.c cVar = new p0.c(responseCode, (URL) null, m.a(new BufferedReader(new InputStreamReader(inputStream))).f4374a);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return cVar;
            } catch (Throwable th5) {
                th3.addSuppressed(th5);
            }
            throw th3;
            throw th;
            throw th4;
            throw th2;
        } catch (ConnectException | UnknownHostException e2) {
            C0094a.q("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new p0.c(500, (URL) null, 0);
        } catch (C0156b | IOException e3) {
            C0094a.q("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new p0.c(400, (URL) null, 0);
        } catch (Throwable th6) {
            th.addSuppressed(th6);
        }
    }

    public Object o(W0.h hVar) {
        Object obj;
        ((T1.d) this.f1506g).getClass();
        Class<IOException> cls = IOException.class;
        p pVar = (p) hVar;
        synchronized (pVar.f1888a) {
            if (!pVar.f1890c) {
                throw new IllegalStateException("Task is not yet complete");
            } else if (pVar.f1891d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(pVar.f1893f)) {
                Exception exc = pVar.f1893f;
                if (exc == null) {
                    obj = pVar.f1892e;
                } else {
                    throw new RuntimeException(exc);
                }
            } else {
                throw cls.cast(pVar.f1893f);
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public void p(W0.h hVar) {
        Object obj = this.f1506g;
        switch (this.f1505f) {
            case L.k.INTEGER_FIELD_NUMBER:
                HashMap hashMap = C0191e.f3070h;
                C0197k kVar = (C0197k) obj;
                if (hVar.e()) {
                    switch (kVar.f3098a) {
                        case 0:
                            ArrayList arrayList = kVar.f3099b;
                            arrayList.add(0, (Object) null);
                            kVar.f3100c.q(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = kVar.f3099b;
                            arrayList2.add(0, (Object) null);
                            kVar.f3100c.q(arrayList2);
                            return;
                        default:
                            ArrayList arrayList3 = kVar.f3099b;
                            arrayList3.add(0, (Object) null);
                            kVar.f3100c.q(arrayList3);
                            return;
                    }
                } else {
                    kVar.a(hVar.b());
                    return;
                }
            case L.k.LONG_FIELD_NUMBER:
                HashMap hashMap2 = C0191e.f3070h;
                C0197k kVar2 = (C0197k) obj;
                if (hVar.e()) {
                    Object c3 = hVar.c();
                    switch (kVar2.f3098a) {
                        case L.k.INTEGER_FIELD_NUMBER:
                            ArrayList arrayList4 = kVar2.f3099b;
                            arrayList4.add(0, (C0195i) c3);
                            kVar2.f3100c.q(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER:
                            ArrayList arrayList5 = kVar2.f3099b;
                            arrayList5.add(0, (List) c3);
                            kVar2.f3100c.q(arrayList5);
                            return;
                        default:
                            ArrayList arrayList6 = kVar2.f3099b;
                            arrayList6.add(0, (C0194h) c3);
                            kVar2.f3100c.q(arrayList6);
                            return;
                    }
                } else {
                    kVar2.a(hVar.b());
                    return;
                }
            case 9:
                C0436I.b((Intent) obj);
                return;
            case 10:
                ((C0438K) obj).f4527b.d((Object) null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    public void q(Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((z) ((r) this.f1506g).f1506g).a(z3);
    }
}
