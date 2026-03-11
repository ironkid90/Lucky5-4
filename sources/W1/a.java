package W1;

import android.content.res.XmlResourceParser;
import org.json.JSONArray;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1894a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f1895b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f1896c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f1897d;

    static {
        Class<f> cls = f.class;
        f1894a = cls.getName().concat(".aot-shared-library-name");
        f1895b = cls.getName().concat(".vm-snapshot-data");
        f1896c = cls.getName().concat(".isolate-snapshot-data");
        f1897d = cls.getName().concat(".flutter-assets-dir");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static W1.b a(android.content.Context r10) {
        /*
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0099 }
            java.lang.String r1 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x0099 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0099 }
            W1.b r7 = new W1.b
            android.os.Bundle r1 = r0.metaData
            r2 = 0
            if (r1 != 0) goto L_0x0017
            r3 = r2
            goto L_0x001e
        L_0x0017:
            java.lang.String r3 = f1894a
            java.lang.String r1 = r1.getString(r3, r2)
            r3 = r1
        L_0x001e:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            java.lang.String r4 = f1895b
            r1.getString(r4, r2)
        L_0x0028:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            java.lang.String r4 = f1896c
            r1.getString(r4, r2)
        L_0x0032:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L_0x0038
            r4 = r2
            goto L_0x003f
        L_0x0038:
            java.lang.String r4 = f1897d
            java.lang.String r1 = r1.getString(r4, r2)
            r4 = r1
        L_0x003f:
            android.os.Bundle r1 = r0.metaData
            r5 = 1
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r10 = r2
            goto L_0x0081
        L_0x0046:
            java.lang.String r6 = "io.flutter.network-policy"
            r8 = 0
            int r1 = r1.getInt(r6, r8)
            if (r1 > 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            android.content.res.XmlResourceParser r10 = r10.getXml(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            r10.next()     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            int r1 = r10.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
        L_0x0064:
            if (r1 == r5) goto L_0x007d
            r9 = 2
            if (r1 != r9) goto L_0x0078
            java.lang.String r1 = r10.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            java.lang.String r9 = "domain-config"
            boolean r1 = r1.equals(r9)     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            if (r1 == 0) goto L_0x0078
            b(r10, r6, r8)     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
        L_0x0078:
            int r1 = r10.next()     // Catch:{ IOException | XmlPullParserException -> 0x0044 }
            goto L_0x0064
        L_0x007d:
            java.lang.String r10 = r6.toString()
        L_0x0081:
            java.lang.String r6 = r0.nativeLibraryDir
            android.os.Bundle r0 = r0.metaData
            if (r0 != 0) goto L_0x0089
            r0 = r5
            goto L_0x008f
        L_0x0089:
            java.lang.String r1 = "io.flutter.automatically-register-plugins"
            boolean r0 = r0.getBoolean(r1, r5)
        L_0x008f:
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r10
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L_0x0099:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.a.a(android.content.Context):W1.b");
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z3) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z3);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (!xmlResourceParser.getName().equals("domain")) {
                    if (!xmlResourceParser.getName().equals("domain-config")) {
                        String name = xmlResourceParser.getName();
                        int eventType = xmlResourceParser.getEventType();
                        while (true) {
                            if (eventType == 3 && xmlResourceParser.getName() == name) {
                                break;
                            }
                            eventType = xmlResourceParser.next();
                        }
                    } else {
                        b(xmlResourceParser, jSONArray, attributeBooleanValue);
                    }
                } else {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() == 4) {
                        String trim = xmlResourceParser.getText().trim();
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(trim);
                        jSONArray2.put(attributeBooleanValue2);
                        jSONArray2.put(attributeBooleanValue);
                        jSONArray.put(jSONArray2);
                        xmlResourceParser.next();
                        if (xmlResourceParser.getEventType() != 3) {
                            throw new IllegalStateException("Expected end of domain tag");
                        }
                    } else {
                        throw new IllegalStateException("Expected text");
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
