package h2;

import c2.v;
import c2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public final class n extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final n f3101d = new Object();

    /* JADX WARNING: type inference failed for: r7v1, types: [h2.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v6, types: [h2.i, java.lang.Object] */
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 == -127) {
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            ? obj = new Object();
            String str = (String) arrayList.get(0);
            if (str != null) {
                obj.f3078a = str;
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    obj.f3079b = str2;
                    String str3 = (String) arrayList.get(2);
                    if (str3 != null) {
                        obj.f3080c = str3;
                        String str4 = (String) arrayList.get(3);
                        if (str4 != null) {
                            obj.f3081d = str4;
                            obj.f3082e = (String) arrayList.get(4);
                            obj.f3083f = (String) arrayList.get(5);
                            obj.f3084g = (String) arrayList.get(6);
                            obj.f3085h = (String) arrayList.get(7);
                            obj.f3086i = (String) arrayList.get(8);
                            obj.f3087j = (String) arrayList.get(9);
                            obj.f3088k = (String) arrayList.get(10);
                            obj.f3089l = (String) arrayList.get(11);
                            obj.f3090m = (String) arrayList.get(12);
                            obj.f3091n = (String) arrayList.get(13);
                            return obj;
                        }
                        throw new IllegalStateException("Nonnull field \"projectId\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        } else if (b3 != -126) {
            return super.f(b3, byteBuffer);
        } else {
            ArrayList arrayList2 = (ArrayList) e(byteBuffer);
            ? obj2 = new Object();
            String str5 = (String) arrayList2.get(0);
            if (str5 != null) {
                obj2.f3092a = str5;
                C0194h hVar = (C0194h) arrayList2.get(1);
                if (hVar != null) {
                    obj2.f3093b = hVar;
                    obj2.f3094c = (Boolean) arrayList2.get(2);
                    Map map = (Map) arrayList2.get(3);
                    if (map != null) {
                        obj2.f3095d = map;
                        return obj2;
                    }
                    throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
    }

    public final void k(v vVar, Object obj) {
        if (obj instanceof C0194h) {
            vVar.write(129);
            C0194h hVar = (C0194h) obj;
            hVar.getClass();
            ArrayList arrayList = new ArrayList(14);
            arrayList.add(hVar.f3078a);
            arrayList.add(hVar.f3079b);
            arrayList.add(hVar.f3080c);
            arrayList.add(hVar.f3081d);
            arrayList.add(hVar.f3082e);
            arrayList.add(hVar.f3083f);
            arrayList.add(hVar.f3084g);
            arrayList.add(hVar.f3085h);
            arrayList.add(hVar.f3086i);
            arrayList.add(hVar.f3087j);
            arrayList.add(hVar.f3088k);
            arrayList.add(hVar.f3089l);
            arrayList.add(hVar.f3090m);
            arrayList.add(hVar.f3091n);
            k(vVar, arrayList);
        } else if (obj instanceof C0195i) {
            vVar.write(130);
            C0195i iVar = (C0195i) obj;
            iVar.getClass();
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(iVar.f3092a);
            arrayList2.add(iVar.f3093b);
            arrayList2.add(iVar.f3094c);
            arrayList2.add(iVar.f3095d);
            k(vVar, arrayList2);
        } else {
            super.k(vVar, obj);
        }
    }
}
