package m1;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final byte f4039a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final byte f4040b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b3 = array[0];
        array[16] = b3;
        array[0] = (byte) ((b3 & f4040b) | f4039a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
