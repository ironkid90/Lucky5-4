package o1;

import L1.l;
import android.content.Context;
import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import l1.C0313a;
import m1.C0331e;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4154d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f4155e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f4156a;

    /* renamed from: b  reason: collision with root package name */
    public final C0313a f4157b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4158c = new d();

    public c(Context context, C0313a aVar) {
        this.f4156a = context;
        this.f4157b = aVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            throw new C0331e(e2.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.io.InputStream r0 = r5.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0048
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f4155e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r0.<init>()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            r0.append(r3)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            goto L_0x0019
        L_0x0028:
            r5 = move-exception
            goto L_0x0044
        L_0x002a:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            int r4 = r5.getResponseCode()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r5 = r5.getResponseMessage()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r0}     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r1 = java.lang.String.format(r3, r5)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0044:
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r5
        L_0x0048:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x007c
            java.lang.String r5 = "Firebase-Installations"
            android.util.Log.w(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ", "
            if (r0 == 0) goto L_0x005e
            java.lang.String r6 = ""
            goto L_0x0062
        L_0x005e:
            java.lang.String r6 = A2.h.g(r1, r6)
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Firebase options used while communicating with Firebase server APIs: "
            r0.<init>(r2)
            r0.append(r7)
            r0.append(r1)
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r5, r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        if (!f4154d.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid Expiration Timestamp.");
        } else if (str == null || str.length() == 0) {
            return 0;
        } else {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
    }

    public static C0358a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4155e));
        l a2 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.f965b = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.f966c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b a3 = a2.a();
                jsonReader.endObject();
                bVar = a3;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C0358a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f4155e));
        l a2 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.f965b = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.f966c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.f964a = 1;
        return a2.a();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9 A[Catch:{ NameNotFoundException -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4 A[Catch:{ NameNotFoundException -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection c(java.net.URL r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get heartbeats header"
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ IOException -> 0x010c }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x010c }
            r1 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r1)
            r2 = 0
            r10.setUseCaches(r2)
            r10.setReadTimeout(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/json"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Accept"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.addRequestProperty(r1, r3)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            r10.addRequestProperty(r1, r3)
            android.content.Context r1 = r9.f4156a
            java.lang.String r3 = r1.getPackageName()
            java.lang.String r4 = "X-Android-Package"
            r10.addRequestProperty(r4, r3)
            l1.a r3 = r9.f4157b
            java.lang.Object r3 = r3.get()
            j1.f r3 = (j1.f) r3
            java.lang.String r4 = "ContentValues"
            if (r3 == 0) goto L_0x0069
            java.lang.String r5 = "x-firebase-client"
            j1.d r3 = (j1.d) r3     // Catch:{ ExecutionException -> 0x0059, InterruptedException -> 0x0057 }
            W0.p r3 = r3.a()     // Catch:{ ExecutionException -> 0x0059, InterruptedException -> 0x0057 }
            java.lang.Object r3 = android.support.v4.media.session.a.d(r3)     // Catch:{ ExecutionException -> 0x0059, InterruptedException -> 0x0057 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ExecutionException -> 0x0059, InterruptedException -> 0x0057 }
            r10.addRequestProperty(r5, r3)     // Catch:{ ExecutionException -> 0x0059, InterruptedException -> 0x0057 }
            goto L_0x0069
        L_0x0057:
            r3 = move-exception
            goto L_0x005b
        L_0x0059:
            r3 = move-exception
            goto L_0x0066
        L_0x005b:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            android.util.Log.w(r4, r0, r3)
            goto L_0x0069
        L_0x0066:
            android.util.Log.w(r4, r0, r3)
        L_0x0069:
            r0 = 0
            java.lang.String r3 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c2 }
            M0.b r5 = M0.c.a(r1)     // Catch:{ NameNotFoundException -> 0x00c2 }
            android.content.Context r5 = r5.f1087a     // Catch:{ NameNotFoundException -> 0x00c2 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c2 }
            r6 = 64
            android.content.pm.PackageInfo r3 = r5.getPackageInfo(r3, r6)     // Catch:{ NameNotFoundException -> 0x00c2 }
            android.content.pm.Signature[] r5 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00c2 }
            if (r5 == 0) goto L_0x00a6
            int r5 = r5.length     // Catch:{ NameNotFoundException -> 0x00c2 }
            r6 = 1
            if (r5 != r6) goto L_0x00a6
            java.lang.String r5 = "SHA1"
            r6 = r2
        L_0x0089:
            r7 = 2
            if (r6 >= r7) goto L_0x0095
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0092 }
            if (r7 != 0) goto L_0x0096
        L_0x0092:
            int r6 = r6 + 1
            goto L_0x0089
        L_0x0095:
            r7 = r0
        L_0x0096:
            if (r7 != 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00c2 }
            r3 = r3[r2]     // Catch:{ NameNotFoundException -> 0x00c2 }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x00c2 }
            byte[] r3 = r7.digest(r3)     // Catch:{ NameNotFoundException -> 0x00c2 }
            goto L_0x00a7
        L_0x00a6:
            r3 = r0
        L_0x00a7:
            if (r3 != 0) goto L_0x00c4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00c2 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x00c2 }
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x00c2 }
            java.lang.String r3 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c2 }
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x00c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ NameNotFoundException -> 0x00c2 }
            android.util.Log.e(r4, r2)     // Catch:{ NameNotFoundException -> 0x00c2 }
            goto L_0x0101
        L_0x00c2:
            r2 = move-exception
            goto L_0x00ec
        L_0x00c4:
            int r5 = r3.length     // Catch:{ NameNotFoundException -> 0x00c2 }
            int r6 = r5 + r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00c2 }
            r7.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00c2 }
        L_0x00cc:
            if (r2 >= r5) goto L_0x00e7
            char[] r6 = K0.b.f852a     // Catch:{ NameNotFoundException -> 0x00c2 }
            byte r8 = r3[r2]     // Catch:{ NameNotFoundException -> 0x00c2 }
            r8 = r8 & 240(0xf0, float:3.36E-43)
            int r8 = r8 >>> 4
            char r8 = r6[r8]     // Catch:{ NameNotFoundException -> 0x00c2 }
            r7.append(r8)     // Catch:{ NameNotFoundException -> 0x00c2 }
            byte r8 = r3[r2]     // Catch:{ NameNotFoundException -> 0x00c2 }
            r8 = r8 & 15
            char r6 = r6[r8]     // Catch:{ NameNotFoundException -> 0x00c2 }
            r7.append(r6)     // Catch:{ NameNotFoundException -> 0x00c2 }
            int r2 = r2 + 1
            goto L_0x00cc
        L_0x00e7:
            java.lang.String r0 = r7.toString()     // Catch:{ NameNotFoundException -> 0x00c2 }
            goto L_0x0101
        L_0x00ec:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1, r2)
        L_0x0101:
            java.lang.String r1 = "X-Android-Cert"
            r10.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r10.addRequestProperty(r0, r11)
            return r10
        L_0x010c:
            m1.e r10 = new m1.e
            java.lang.String r11 = "Firebase Installations Service is unavailable. Please try again later."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
