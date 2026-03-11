package R;

import A2.h;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final G0.f f1341a = new G0.f(5);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1342b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1343c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f1344d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f1345e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1346f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f1347g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f1348h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f1349i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f1350j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i3 = 0;
        for (c cVar : cVarArr) {
            i3 += ((((cVar.f1338g * 2) + 7) & -8) / 8) + (cVar.f1336e * 2) + d(cVar.f1332a, cVar.f1333b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1337f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f1346f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f1332a, cVar2.f1333b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f1339h;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f1332a, cVar3.f1333b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f1339h;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File c3 : listFiles) {
                if (!c(c3) || !z3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = f1348h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1347g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                sb.append(str4);
                sb.append(str2);
                return sb.toString();
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read >= 0) {
                i4 += read;
            } else {
                throw new IllegalStateException(h.e("Not enough bytes to read: ", i3));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int i6 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i6 += inflater.inflate(bArr, i6, i4 - i6);
                    i5 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
            }
            if (i5 != i3) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f1349i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f1344d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m3 = (int) m(fileInputStream, 1);
                byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                    try {
                        c[] j3 = j(byteArrayInputStream, m3, cVarArr);
                        byteArrayInputStream.close();
                        return j3;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f1350j)) {
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
                try {
                    c[] k3 = k(byteArrayInputStream2, bArr2, m4, cVarArr);
                    byteArrayInputStream2.close();
                    return k3;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            String[] strArr = new String[i3];
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = (int) m(byteArrayInputStream, 2);
                strArr[i5] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i4 < i3) {
                c cVar = cVarArr[i4];
                if (cVar.f1333b.equals(strArr[i4])) {
                    int i6 = iArr[i4];
                    cVar.f1336e = i6;
                    cVar.f1339h = g(byteArrayInputStream, i6);
                    i4++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            int i4 = 0;
            while (i4 < i3) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m3 = m(byteArrayInputStream, 4);
                int m4 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i5].f1333b.equals(str)) {
                            cVar = cVarArr[i5];
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                if (cVar != null) {
                    cVar.f1335d = m3;
                    int[] g2 = g(byteArrayInputStream, m4);
                    if (Arrays.equals(bArr, f1348h)) {
                        cVar.f1336e = m4;
                        cVar.f1339h = g2;
                    }
                    i4++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f1345e)) {
            int m3 = (int) m(fileInputStream, 1);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                try {
                    c[] n3 = n(byteArrayInputStream, str, m3);
                    byteArrayInputStream.close();
                    return n3;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += ((long) (f3[i4] & 255)) << (i4 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        int i4;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i5 = i3;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m3 = (int) m(byteArrayInputStream2, 2);
            long m4 = m(byteArrayInputStream2, 4);
            String str2 = str;
            cVarArr[i6] = new c(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m3, (int) m4, (int) m(byteArrayInputStream2, 4), new int[m3], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i5) {
            c cVar = cVarArr[i7];
            int available = byteArrayInputStream.available() - cVar.f1337f;
            int i8 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f1340i;
                if (available2 <= available) {
                    break;
                }
                i8 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                for (int m5 = (int) m(byteArrayInputStream2, 2); m5 > 0; m5--) {
                    m(byteArrayInputStream2, 2);
                    int m6 = (int) m(byteArrayInputStream2, 1);
                    if (!(m6 == 6 || m6 == 7)) {
                        while (m6 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m7 = (int) m(byteArrayInputStream2, 1); m7 > 0; m7--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                cVar.f1339h = g(byteArrayInputStream2, cVar.f1336e);
                int i9 = cVar.f1338g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i9 * 2) + 7) & -8) / 8));
                for (int i10 = 0; i10 < i9; i10++) {
                    if (valueOf.get(i10)) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    if (valueOf.get(i10 + i9)) {
                        i4 |= 4;
                    }
                    if (i4 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i10));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i10), Integer.valueOf(i4 | num.intValue()));
                    }
                }
                i7++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j3;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        c[] cVarArr2 = cVarArr;
        byte[] bArr3 = f1344d;
        int i3 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream5, cVarArr2.length);
                int i4 = 2;
                int i5 = 2;
                for (c cVar : cVarArr2) {
                    t(byteArrayOutputStream5, cVar.f1334c, 4);
                    t(byteArrayOutputStream5, cVar.f1335d, 4);
                    t(byteArrayOutputStream5, (long) cVar.f1338g, 4);
                    String d3 = d(cVar.f1332a, cVar.f1333b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d3.getBytes(charset).length;
                    u(byteArrayOutputStream5, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream5.write(d3.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i5 == byteArray.length) {
                    n nVar = new n(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(nVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < cVarArr2.length) {
                        try {
                            c cVar2 = cVarArr2[i6];
                            u(byteArrayOutputStream6, i6);
                            u(byteArrayOutputStream6, cVar2.f1336e);
                            i7 = i7 + 4 + (cVar2.f1336e * 2);
                            int[] iArr = cVar2.f1339h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                u(byteArrayOutputStream6, i9 - i8);
                                i3++;
                                i8 = i9;
                            }
                            i6++;
                            i3 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i7 == byteArray2.length) {
                        n nVar2 = new n(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(nVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < cVarArr2.length) {
                            try {
                                c cVar3 = cVarArr2[i10];
                                int i12 = 0;
                                for (Map.Entry value : cVar3.f1340i.entrySet()) {
                                    i12 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream2, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                u(byteArrayOutputStream7, i10);
                                int length4 = byteArray3.length + i4 + byteArray4.length;
                                int i13 = i11 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream7, (long) length4, 4);
                                u(byteArrayOutputStream7, i12);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i11 = i13 + length4;
                                i10++;
                                arrayList3 = arrayList4;
                                i4 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i11 == byteArray5.length) {
                            n nVar3 = new n(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(nVar3);
                            long j4 = (long) 4;
                            long size = j4 + j4 + 4 + ((long) (arrayList2.size() * 16));
                            t(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i14 = 0;
                            while (i14 < arrayList2.size()) {
                                n nVar4 = (n) arrayList2.get(i14);
                                int i15 = nVar4.f1361a;
                                if (i15 == 1) {
                                    j3 = 0;
                                } else if (i15 == 2) {
                                    j3 = 1;
                                } else if (i15 == 3) {
                                    j3 = 2;
                                } else if (i15 == 4) {
                                    j3 = 3;
                                } else if (i15 == 5) {
                                    j3 = 4;
                                } else {
                                    throw null;
                                }
                                t(byteArrayOutputStream4, j3, 4);
                                t(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = nVar4.f1362b;
                                if (nVar4.f1363c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a2 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    t(byteArrayOutputStream4, (long) a2.length, 4);
                                    t(byteArrayOutputStream4, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    t(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    t(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i14++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i16));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = f1345e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b3 = b(cVarArr2, bArr5);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream4, (long) a3.length, 4);
                byteArrayOutputStream4.write(a3);
                return true;
            }
            byte[] bArr6 = f1347g;
            if (Arrays.equals(bArr2, bArr6)) {
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (c cVar4 : cVarArr2) {
                    String d4 = d(cVar4.f1332a, cVar4.f1333b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream4, d4.getBytes(charset2).length);
                    u(byteArrayOutputStream4, cVar4.f1339h.length);
                    t(byteArrayOutputStream4, (long) (cVar4.f1340i.size() * 4), 4);
                    t(byteArrayOutputStream4, cVar4.f1334c, 4);
                    byteArrayOutputStream4.write(d4.getBytes(charset2));
                    for (Integer intValue : cVar4.f1340i.keySet()) {
                        u(byteArrayOutputStream4, intValue.intValue());
                        u(byteArrayOutputStream4, 0);
                    }
                    for (int u3 : cVar4.f1339h) {
                        u(byteArrayOutputStream4, u3);
                    }
                }
                return true;
            }
            byte[] bArr7 = f1346f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b4 = b(cVarArr2, bArr7);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b4.length, 4);
                byte[] a4 = a(b4);
                t(byteArrayOutputStream4, (long) a4.length, 4);
                byteArrayOutputStream4.write(a4);
                return true;
            }
            byte[] bArr8 = f1348h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            u(byteArrayOutputStream4, cVarArr2.length);
            for (c cVar5 : cVarArr2) {
                String d5 = d(cVar5.f1332a, cVar5.f1333b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream4, d5.getBytes(charset3).length);
                TreeMap treeMap = cVar5.f1340i;
                u(byteArrayOutputStream4, treeMap.size());
                u(byteArrayOutputStream4, cVar5.f1339h.length);
                t(byteArrayOutputStream4, cVar5.f1334c, 4);
                byteArrayOutputStream4.write(d5.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    u(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int u4 : cVar5.f1339h) {
                    u(byteArrayOutputStream4, u4);
                }
            }
            return true;
        }
        throw th2;
        throw th;
        throw th4;
        throw th5;
        throw th3;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f1336e);
        t(byteArrayOutputStream, (long) cVar.f1337f, 4);
        t(byteArrayOutputStream, cVar.f1334c, 4);
        t(byteArrayOutputStream, (long) cVar.f1338g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[((((cVar.f1338g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : cVar.f1340i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i4 = intValue + cVar.f1338g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (Map.Entry entry : cVar.f1340i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c6, code lost:
        if (r5 == null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0261, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x026e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:189:0x024d, B:205:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017b A[SYNTHETIC, Splitter:B:105:0x017b] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b0 A[Catch:{ all -> 0x019d, all -> 0x01aa, FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102 A[SYNTHETIC, Splitter:B:54:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, R.e r21, boolean r22) {
        /*
            r1 = r19
            r8 = r21
            android.content.Context r0 = r19.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r19.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x02b5 }
            java.io.File r13 = r19.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r14 = 0
            r15 = 1
            if (r22 != 0) goto L_0x008b
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r0 = r11
            goto L_0x006e
        L_0x0041:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x003f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x003f }
            r4.<init>(r5)     // Catch:{ IOException -> 0x003f }
            long r16 = r4.readLong()     // Catch:{ all -> 0x0062 }
            r4.close()     // Catch:{ IOException -> 0x003f }
            long r4 = r12.lastUpdateTime
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = r15
            goto L_0x005b
        L_0x005a:
            r0 = r11
        L_0x005b:
            if (r0 == 0) goto L_0x006e
            r4 = 2
            r8.b(r4, r14)
            goto L_0x006e
        L_0x0062:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x003f }
        L_0x006d:
            throw r5     // Catch:{ IOException -> 0x003f }
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r19.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            R.m.c(r1, r11)
            goto L_0x02b4
        L_0x008b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Installing profile for "
            r0.<init>(r4)
            java.lang.String r4 = r19.getPackageName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            R.b r5 = new R.b
            java.lang.String r4 = "dexopt/baseline.prof"
            r2 = r5
            r3 = r9
            r11 = r4
            r4 = r20
            r10 = r5
            r5 = r21
            r18 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r2 = r10.f1326c
            if (r2 != 0) goto L_0x00d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r10.b(r2, r0)
        L_0x00cd:
            r6 = r15
            goto L_0x02a9
        L_0x00d0:
            boolean r0 = r18.exists()
            r3 = 4
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r18.canWrite()
            if (r0 != 0) goto L_0x00e4
            r10.b(r3, r14)
            goto L_0x00cd
        L_0x00e1:
            r18.createNewFile()     // Catch:{ IOException -> 0x02a5 }
        L_0x00e4:
            r10.f1329f = r15
            byte[] r4 = f1342b
            r5 = 6
            java.io.FileInputStream r0 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00ef }
            r6 = r0
            goto L_0x00fc
        L_0x00ef:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.b(r7, r6)
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            r6 = r0
            r8.b(r5, r6)
        L_0x00fb:
            r6 = r14
        L_0x00fc:
            java.lang.String r7 = "Invalid magic"
            r11 = 8
            if (r6 == 0) goto L_0x015b
            byte[] r0 = f(r6, r3)     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            if (r0 == 0) goto L_0x012b
            byte[] r0 = f(r6, r3)     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            java.lang.String r5 = r10.f1328e     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            R.c[] r5 = l(r6, r0, r5)     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            r6.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x014d
        L_0x011a:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.b(r15, r6)
            goto L_0x014d
        L_0x0121:
            r1 = r0
            goto L_0x0150
        L_0x0123:
            r15 = 7
            goto L_0x0142
        L_0x0125:
            r0 = move-exception
            goto L_0x0121
        L_0x0127:
            r0 = move-exception
            goto L_0x0131
        L_0x0129:
            r0 = move-exception
            goto L_0x0123
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
            throw r0     // Catch:{ IOException -> 0x0129, IllegalStateException -> 0x0127 }
        L_0x0131:
            r8.b(r11, r0)     // Catch:{ all -> 0x013f }
            r6.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x014c
        L_0x0138:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x013b:
            r8.b(r15, r5)
            goto L_0x014c
        L_0x013f:
            r0 = move-exception
            r15 = 7
            goto L_0x0121
        L_0x0142:
            r8.b(r15, r0)     // Catch:{ all -> 0x0125 }
            r6.close()     // Catch:{ IOException -> 0x0149 }
            goto L_0x014c
        L_0x0149:
            r0 = move-exception
            r5 = r0
            goto L_0x013b
        L_0x014c:
            r5 = r14
        L_0x014d:
            r10.f1330g = r5
            goto L_0x015b
        L_0x0150:
            r6.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x015a
        L_0x0154:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
        L_0x015a:
            throw r1
        L_0x015b:
            R.c[] r0 = r10.f1330g
            if (r0 == 0) goto L_0x01c9
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 <= r6) goto L_0x0167
            goto L_0x01c9
        L_0x0167:
            r6 = 24
            if (r5 == r6) goto L_0x0173
            r6 = 25
            if (r5 == r6) goto L_0x0173
            switch(r5) {
                case 31: goto L_0x0173;
                case 32: goto L_0x0173;
                case 33: goto L_0x0173;
                case 34: goto L_0x0173;
                default: goto L_0x0172;
            }
        L_0x0172:
            goto L_0x01c9
        L_0x0173:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r10.a(r9, r5)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }
            if (r5 == 0) goto L_0x01b0
            byte[] r6 = f1343c     // Catch:{ all -> 0x019d }
            byte[] r9 = f(r5, r3)     // Catch:{ all -> 0x019d }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x019d }
            if (r6 == 0) goto L_0x01a0
            byte[] r3 = f(r5, r3)     // Catch:{ all -> 0x019d }
            R.c[] r0 = i(r5, r3, r2, r0)     // Catch:{ all -> 0x019d }
            r10.f1330g = r0     // Catch:{ all -> 0x019d }
            r5.close()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }
            r5 = r10
            goto L_0x01c6
        L_0x0196:
            r0 = move-exception
            goto L_0x01b6
        L_0x0198:
            r0 = move-exception
            r2 = 7
            goto L_0x01bc
        L_0x019b:
            r0 = move-exception
            goto L_0x01c0
        L_0x019d:
            r0 = move-exception
            r2 = r0
            goto L_0x01a6
        L_0x01a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x019d }
            r0.<init>(r7)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ all -> 0x019d }
        L_0x01a6:
            r5.close()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x01aa:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }
        L_0x01af:
            throw r2     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }
        L_0x01b0:
            if (r5 == 0) goto L_0x01c5
            r5.close()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0198, IllegalStateException -> 0x0196 }
            goto L_0x01c5
        L_0x01b6:
            r10.f1330g = r14
            r8.b(r11, r0)
            goto L_0x01c5
        L_0x01bc:
            r8.b(r2, r0)
            goto L_0x01c5
        L_0x01c0:
            r2 = 9
            r8.b(r2, r0)
        L_0x01c5:
            r5 = r14
        L_0x01c6:
            if (r5 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r5 = r10
        L_0x01ca:
            R.e r2 = r5.f1325b
            R.c[] r0 = r5.f1330g
            java.lang.String r3 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0222
            byte[] r6 = r5.f1326c
            if (r6 != 0) goto L_0x01d7
            goto L_0x0222
        L_0x01d7:
            boolean r7 = r5.f1329f
            if (r7 == 0) goto L_0x021c
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
            r7.<init>()     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
            r7.write(r4)     // Catch:{ all -> 0x01fb }
            r7.write(r6)     // Catch:{ all -> 0x01fb }
            boolean r0 = o(r7, r6, r0)     // Catch:{ all -> 0x01fb }
            if (r0 != 0) goto L_0x01fe
            r0 = 5
            r2.b(r0, r14)     // Catch:{ all -> 0x01fb }
            r5.f1330g = r14     // Catch:{ all -> 0x01fb }
            r7.close()     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
            goto L_0x0222
        L_0x01f6:
            r0 = move-exception
            goto L_0x0212
        L_0x01f8:
            r0 = move-exception
            r4 = 7
            goto L_0x0216
        L_0x01fb:
            r0 = move-exception
            r4 = r0
            goto L_0x0208
        L_0x01fe:
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01fb }
            r5.f1331h = r0     // Catch:{ all -> 0x01fb }
            r7.close()     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
            goto L_0x0219
        L_0x0208:
            r7.close()     // Catch:{ all -> 0x020c }
            goto L_0x0211
        L_0x020c:
            r0 = move-exception
            r6 = r0
            r4.addSuppressed(r6)     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
        L_0x0211:
            throw r4     // Catch:{ IOException -> 0x01f8, IllegalStateException -> 0x01f6 }
        L_0x0212:
            r2.b(r11, r0)
            goto L_0x0219
        L_0x0216:
            r2.b(r4, r0)
        L_0x0219:
            r5.f1330g = r14
            goto L_0x0222
        L_0x021c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0222:
            byte[] r0 = r5.f1331h
            if (r0 != 0) goto L_0x022a
            r0 = 0
            r6 = 1
            goto L_0x0294
        L_0x022a:
            boolean r2 = r5.f1329f
            if (r2 == 0) goto L_0x029f
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0284, IOException -> 0x0281 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0284, IOException -> 0x0281 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0274 }
            java.io.File r0 = r5.f1327d     // Catch:{ all -> 0x0274 }
            r3.<init>(r0)     // Catch:{ all -> 0x0274 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0267 }
        L_0x023e:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0267 }
            if (r4 <= 0) goto L_0x0249
            r6 = 0
            r3.write(r0, r6, r4)     // Catch:{ all -> 0x0267 }
            goto L_0x023e
        L_0x0249:
            r6 = 1
            r5.b(r6, r14)     // Catch:{ all -> 0x0264 }
            r3.close()     // Catch:{ all -> 0x0261 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x025e, IOException -> 0x025b }
            r5.f1331h = r14
            r5.f1330g = r14
            r0 = r6
            goto L_0x0294
        L_0x0259:
            r0 = move-exception
            goto L_0x029a
        L_0x025b:
            r0 = move-exception
        L_0x025c:
            r2 = 7
            goto L_0x0287
        L_0x025e:
            r0 = move-exception
        L_0x025f:
            r2 = 6
            goto L_0x028f
        L_0x0261:
            r0 = move-exception
        L_0x0262:
            r3 = r0
            goto L_0x0277
        L_0x0264:
            r0 = move-exception
        L_0x0265:
            r4 = r0
            goto L_0x026a
        L_0x0267:
            r0 = move-exception
            r6 = 1
            goto L_0x0265
        L_0x026a:
            r3.close()     // Catch:{ all -> 0x026e }
            goto L_0x0273
        L_0x026e:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0261 }
        L_0x0273:
            throw r4     // Catch:{ all -> 0x0261 }
        L_0x0274:
            r0 = move-exception
            r6 = 1
            goto L_0x0262
        L_0x0277:
            r2.close()     // Catch:{ all -> 0x027b }
            goto L_0x0280
        L_0x027b:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x025e, IOException -> 0x025b }
        L_0x0280:
            throw r3     // Catch:{ FileNotFoundException -> 0x025e, IOException -> 0x025b }
        L_0x0281:
            r0 = move-exception
            r6 = 1
            goto L_0x025c
        L_0x0284:
            r0 = move-exception
            r6 = 1
            goto L_0x025f
        L_0x0287:
            r5.b(r2, r0)     // Catch:{ all -> 0x0259 }
        L_0x028a:
            r5.f1331h = r14
            r5.f1330g = r14
            goto L_0x0293
        L_0x028f:
            r5.b(r2, r0)     // Catch:{ all -> 0x0259 }
            goto L_0x028a
        L_0x0293:
            r0 = 0
        L_0x0294:
            if (r0 == 0) goto L_0x02aa
            e(r12, r13)
            goto L_0x02aa
        L_0x029a:
            r5.f1331h = r14
            r5.f1330g = r14
            throw r0
        L_0x029f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02a5:
            r6 = r15
            r10.b(r3, r14)
        L_0x02a9:
            r0 = 0
        L_0x02aa:
            if (r0 == 0) goto L_0x02b0
            if (r22 == 0) goto L_0x02b0
            r11 = r6
            goto L_0x02b1
        L_0x02b0:
            r11 = 0
        L_0x02b1:
            R.m.c(r1, r11)
        L_0x02b4:
            return
        L_0x02b5:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
            r2 = 0
            R.m.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R.f.s(android.content.Context, java.util.concurrent.Executor, R.e, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((int) ((j3 >> (i4 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, (long) i3, 2);
    }
}
