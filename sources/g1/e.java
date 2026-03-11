package g1;

import android.util.Base64;
import android.util.JsonWriter;
import e1.C0157c;
import e1.C0158d;
import e1.f;
import e1.g;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class e implements e1.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2991a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f2992b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2993c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f2994d;

    /* renamed from: e  reason: collision with root package name */
    public final C0180a f2995e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2996f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C0180a aVar, boolean z3) {
        this.f2992b = new JsonWriter(bufferedWriter);
        this.f2993c = hashMap;
        this.f2994d = hashMap2;
        this.f2995e = aVar;
        this.f2996f = z3;
    }

    public final g a(String str) {
        h();
        this.f2992b.value(str);
        return this;
    }

    public final g b(boolean z3) {
        h();
        this.f2992b.value(z3);
        return this;
    }

    public final e1.e c(C0157c cVar, long j3) {
        String str = cVar.f2938a;
        h();
        JsonWriter jsonWriter = this.f2992b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j3);
        return this;
    }

    public final e1.e d(C0157c cVar, int i3) {
        String str = cVar.f2938a;
        h();
        JsonWriter jsonWriter = this.f2992b;
        jsonWriter.name(str);
        h();
        jsonWriter.value((long) i3);
        return this;
    }

    public final e1.e e(C0157c cVar, Object obj) {
        g(obj, cVar.f2938a);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f2992b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i3 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i3 < length) {
                    jsonWriter.value((long) iArr[i3]);
                    i3++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i3 < length2) {
                    long j3 = jArr[i3];
                    h();
                    jsonWriter.value(j3);
                    i3++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i3 < length3) {
                    jsonWriter.value(dArr[i3]);
                    i3++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i3 < length4) {
                    jsonWriter.value(zArr[i3]);
                    i3++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i3 < length5) {
                    f(numberArr[i3]);
                    i3++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i3 < length6) {
                    f(objArr[i3]);
                    i3++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object f3 : (Collection) obj) {
                f(f3);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e2) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            C0158d dVar = (C0158d) this.f2993c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f2994d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.f2995e.a(obj, this);
                throw null;
            }
        }
    }

    public final e g(Object obj, String str) {
        boolean z3 = this.f2996f;
        JsonWriter jsonWriter = this.f2992b;
        if (z3) {
            if (obj != null) {
                h();
                jsonWriter.name(str);
                f(obj);
            }
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
        return this;
    }

    public final void h() {
        if (!this.f2991a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
