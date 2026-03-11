package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
public abstract class C0120y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2497a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2498b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2498b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0104h(bArr, 0, 0, false).e(0);
        } catch (A e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
