package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

public enum B {
    VOID(Void.class, (int) null),
    INT(r6, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0103g.class, C0103g.f2423h),
    ENUM(r6, (int) null),
    MESSAGE(Object.class, (int) null);

    /* access modifiers changed from: public */
    B(Class cls, Serializable serializable) {
    }
}
