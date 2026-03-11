package h1;

import A2.h;
import e1.C0157c;
import e1.C0158d;
import e1.e;
import g1.C0180a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f3040f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final C0157c f3041g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0157c f3042h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0180a f3043i = new C0180a(1);

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f3044a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3045b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f3046c;

    /* renamed from: d  reason: collision with root package name */
    public final C0180a f3047d;

    /* renamed from: e  reason: collision with root package name */
    public final h f3048e = new h(this);

    static {
        Class<e> cls = e.class;
        f3041g = new C0157c("key", h.i(h.h(cls, new C0186a(1))));
        f3042h = new C0157c("value", h.i(h.h(cls, new C0186a(2))));
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C0180a aVar) {
        this.f3044a = byteArrayOutputStream;
        this.f3045b = hashMap;
        this.f3046c = hashMap2;
        this.f3047d = aVar;
    }

    public static int g(C0157c cVar) {
        e eVar = (e) ((Annotation) cVar.f2939b.get(e.class));
        if (eVar != null) {
            return ((C0186a) eVar).f3036a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void a(C0157c cVar, int i3, boolean z3) {
        if (!z3 || i3 != 0) {
            e eVar = (e) ((Annotation) cVar.f2939b.get(e.class));
            if (eVar != null) {
                h(((C0186a) eVar).f3036a << 3);
                h(i3);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void b(C0157c cVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    h((g(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f3040f);
                    h(bytes.length);
                    this.f3044a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object b3 : (Collection) obj) {
                    b(cVar, b3, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry f3 : ((Map) obj).entrySet()) {
                    f(f3043i, cVar, f3, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z3 || doubleValue != 0.0d) {
                    h((g(cVar) << 3) | 1);
                    this.f3044a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z3 || floatValue != 0.0f) {
                    h((g(cVar) << 3) | 5);
                    this.f3044a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z3 || longValue != 0) {
                    e eVar = (e) ((Annotation) cVar.f2939b.get(e.class));
                    if (eVar != null) {
                        h(((C0186a) eVar).f3036a << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                a(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z3 || bArr.length != 0) {
                    h((g(cVar) << 3) | 2);
                    h(bArr.length);
                    this.f3044a.write(bArr);
                }
            } else {
                C0158d dVar = (C0158d) this.f3045b.get(obj.getClass());
                if (dVar != null) {
                    f(dVar, cVar, obj, z3);
                    return;
                }
                e1.f fVar = (e1.f) this.f3046c.get(obj.getClass());
                if (fVar != null) {
                    h hVar = this.f3048e;
                    hVar.f3050a = false;
                    hVar.f3052c = cVar;
                    hVar.f3051b = z3;
                    fVar.a(obj, hVar);
                } else if (obj instanceof c) {
                    a(cVar, ((c) obj).a(), true);
                } else if (obj instanceof Enum) {
                    a(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    f(this.f3047d, cVar, obj, z3);
                }
            }
        }
    }

    public final e c(C0157c cVar, long j3) {
        if (j3 != 0) {
            e eVar = (e) ((Annotation) cVar.f2939b.get(e.class));
            if (eVar != null) {
                h(((C0186a) eVar).f3036a << 3);
                i(j3);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final e d(C0157c cVar, int i3) {
        a(cVar, i3, true);
        return this;
    }

    public final e e(C0157c cVar, Object obj) {
        b(cVar, obj, true);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, h1.b] */
    public final void f(C0158d dVar, C0157c cVar, Object obj, boolean z3) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.f3037f = 0;
        try {
            outputStream = this.f3044a;
            this.f3044a = outputStream2;
            dVar.a(obj, this);
            this.f3044a = outputStream;
            long j3 = outputStream2.f3037f;
            outputStream2.close();
            if (!z3 || j3 != 0) {
                h((g(cVar) << 3) | 2);
                i(j3);
                dVar.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void h(int i3) {
        while (((long) (i3 & -128)) != 0) {
            this.f3044a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f3044a.write(i3 & 127);
    }

    public final void i(long j3) {
        while ((-128 & j3) != 0) {
            this.f3044a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f3044a.write(((int) j3) & 127);
    }
}
