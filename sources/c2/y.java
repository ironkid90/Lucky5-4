package c2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class y implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2799a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final y f2800b = new Object();

    public static String c(ByteBuffer byteBuffer) {
        int i3;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i3 = 0;
        }
        return new String(bArr, i3, remaining, f2799a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f2799a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
