package com.dexterous.flutterlocalnotifications;

import D1.a;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import w1.i;
import w1.k;
import w1.r;
import w1.s;

@Keep
public final class RuntimeTypeAdapterFactory<T> implements s {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> r create(k kVar, a aVar) {
        if (aVar.f220a != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            r d3 = kVar.d(this, new a((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), d3);
            linkedHashMap2.put((Class) next.getValue(), d3);
        }
        return new i(new i(this, linkedHashMap, linkedHashMap2), 2);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
