package c2;

import L.k;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class w implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final w f2795a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2796b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f2797c = Charset.forName("UTF8");

    /* JADX WARNING: type inference failed for: r0v0, types: [c2.w, java.lang.Object] */
    static {
        boolean z3;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z3 = true;
        } else {
            z3 = false;
        }
        f2796b = z3;
    }

    public static final void c(ByteBuffer byteBuffer, int i3) {
        int position = byteBuffer.position() % i3;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b3 = byteBuffer.get() & 255;
            if (b3 < 254) {
                return b3;
            }
            if (b3 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void g(v vVar, int i3) {
        int size = vVar.size() % i3;
        if (size != 0) {
            for (int i4 = 0; i4 < i3 - size; i4++) {
                vVar.write(0);
            }
        }
    }

    public static final void h(v vVar, int i3) {
        if (f2796b) {
            vVar.write(i3);
            vVar.write(i3 >>> 8);
            vVar.write(i3 >>> 16);
            vVar.write(i3 >>> 24);
            return;
        }
        vVar.write(i3 >>> 24);
        vVar.write(i3 >>> 16);
        vVar.write(i3 >>> 8);
        vVar.write(i3);
    }

    public static final void i(v vVar, long j3) {
        if (f2796b) {
            vVar.write((byte) ((int) j3));
            vVar.write((byte) ((int) (j3 >>> 8)));
            vVar.write((byte) ((int) (j3 >>> 16)));
            vVar.write((byte) ((int) (j3 >>> 24)));
            vVar.write((byte) ((int) (j3 >>> 32)));
            vVar.write((byte) ((int) (j3 >>> 40)));
            vVar.write((byte) ((int) (j3 >>> 48)));
            vVar.write((byte) ((int) (j3 >>> 56)));
            return;
        }
        vVar.write((byte) ((int) (j3 >>> 56)));
        vVar.write((byte) ((int) (j3 >>> 48)));
        vVar.write((byte) ((int) (j3 >>> 40)));
        vVar.write((byte) ((int) (j3 >>> 32)));
        vVar.write((byte) ((int) (j3 >>> 24)));
        vVar.write((byte) ((int) (j3 >>> 16)));
        vVar.write((byte) ((int) (j3 >>> 8)));
        vVar.write((byte) ((int) j3));
    }

    public static final void j(v vVar, int i3) {
        if (i3 < 254) {
            vVar.write(i3);
        } else if (i3 <= 65535) {
            vVar.write(254);
            if (f2796b) {
                vVar.write(i3);
                vVar.write(i3 >>> 8);
                return;
            }
            vVar.write(i3 >>> 8);
            vVar.write(i3);
        } else {
            vVar.write(255);
            h(vVar, i3);
        }
    }

    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e2 = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e2;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, c2.v] */
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b3, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f2797c;
        int i3 = 0;
        switch (b3) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case k.FLOAT_FIELD_NUMBER:
                return Boolean.FALSE;
            case k.INTEGER_FIELD_NUMBER:
                return Integer.valueOf(byteBuffer.getInt());
            case k.LONG_FIELD_NUMBER:
                return Long.valueOf(byteBuffer.getLong());
            case k.STRING_FIELD_NUMBER:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case k.STRING_SET_FIELD_NUMBER:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case k.DOUBLE_FIELD_NUMBER:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case k.BYTES_FIELD_NUMBER:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d3 = d(byteBuffer);
                int[] iArr = new int[d3];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d3 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d4 = d(byteBuffer);
                long[] jArr = new long[d4];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d5 = d(byteBuffer);
                double[] dArr = new double[d5];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d5 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d6 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d6);
                while (i3 < d6) {
                    arrayList.add(e(byteBuffer));
                    i3++;
                }
                return arrayList;
            case 13:
                int d7 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i3 < d7) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i3++;
                }
                return hashMap;
            case 14:
                int d8 = d(byteBuffer);
                float[] fArr = new float[d8];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d8 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(v vVar, Object obj) {
        int i3;
        int i4 = 0;
        if (obj == null || obj.equals((Object) null)) {
            vVar.write(0);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            vVar.write(i3);
        } else {
            boolean z3 = obj instanceof Number;
            Charset charset = f2797c;
            if (z3) {
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    vVar.write(3);
                    h(vVar, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    vVar.write(4);
                    i(vVar, ((Long) obj).longValue());
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    vVar.write(6);
                    g(vVar, 8);
                    i(vVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                } else if (obj instanceof BigInteger) {
                    vVar.write(5);
                    byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                    j(vVar, bytes.length);
                    vVar.write(bytes, 0, bytes.length);
                } else {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
            } else if (obj instanceof CharSequence) {
                vVar.write(7);
                byte[] bytes2 = obj.toString().getBytes(charset);
                j(vVar, bytes2.length);
                vVar.write(bytes2, 0, bytes2.length);
            } else if (obj instanceof byte[]) {
                vVar.write(8);
                byte[] bArr = (byte[]) obj;
                j(vVar, bArr.length);
                vVar.write(bArr, 0, bArr.length);
            } else if (obj instanceof int[]) {
                vVar.write(9);
                int[] iArr = (int[]) obj;
                j(vVar, iArr.length);
                g(vVar, 4);
                int length = iArr.length;
                while (i4 < length) {
                    h(vVar, iArr[i4]);
                    i4++;
                }
            } else if (obj instanceof long[]) {
                vVar.write(10);
                long[] jArr = (long[]) obj;
                j(vVar, jArr.length);
                g(vVar, 8);
                int length2 = jArr.length;
                while (i4 < length2) {
                    i(vVar, jArr[i4]);
                    i4++;
                }
            } else if (obj instanceof double[]) {
                vVar.write(11);
                double[] dArr = (double[]) obj;
                j(vVar, dArr.length);
                g(vVar, 8);
                int length3 = dArr.length;
                while (i4 < length3) {
                    i(vVar, Double.doubleToLongBits(dArr[i4]));
                    i4++;
                }
            } else if (obj instanceof List) {
                vVar.write(12);
                List<Object> list = (List) obj;
                j(vVar, list.size());
                for (Object k3 : list) {
                    k(vVar, k3);
                }
            } else if (obj instanceof Map) {
                vVar.write(13);
                Map map = (Map) obj;
                j(vVar, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    k(vVar, entry.getKey());
                    k(vVar, entry.getValue());
                }
            } else if (obj instanceof float[]) {
                vVar.write(14);
                float[] fArr = (float[]) obj;
                j(vVar, fArr.length);
                g(vVar, 4);
                int length4 = fArr.length;
                while (i4 < length4) {
                    h(vVar, Float.floatToIntBits(fArr[i4]));
                    i4++;
                }
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
            }
        }
    }
}
