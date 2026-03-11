package k2;

import D0.g;
import Y1.a;
import Y1.b;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import c2.C0134b;
import c2.f;
import j1.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s1.C0464y;

/* renamed from: k2.a  reason: case insensitive filesystem */
public class C0286a implements b {

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f3905f;

    /* renamed from: g  reason: collision with root package name */
    public final g f3906g = new g(13, false);

    public static void d(f fVar, C0286a aVar) {
        e h3 = fVar.h();
        C0287b bVar = C0287b.f3907e;
        C0464y yVar = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", bVar, h3);
        if (aVar != null) {
            yVar.l(new C0288c(aVar, 0));
        } else {
            yVar.l((C0134b) null);
        }
        C0464y yVar2 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", bVar, h3);
        if (aVar != null) {
            yVar2.l(new C0288c(aVar, 1));
        } else {
            yVar2.l((C0134b) null);
        }
        C0464y yVar3 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", bVar, h3);
        if (aVar != null) {
            yVar3.l(new C0288c(aVar, 2));
        } else {
            yVar3.l((C0134b) null);
        }
        C0464y yVar4 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", bVar, h3);
        if (aVar != null) {
            yVar4.l(new C0288c(aVar, 3));
        } else {
            yVar4.l((C0134b) null);
        }
        C0464y yVar5 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", bVar, h3);
        if (aVar != null) {
            yVar5.l(new C0288c(aVar, 4));
        } else {
            yVar5.l((C0134b) null);
        }
        C0464y yVar6 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", bVar, h3);
        if (aVar != null) {
            yVar6.l(new C0288c(aVar, 5));
        } else {
            yVar6.l((C0134b) null);
        }
        C0464y yVar7 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", bVar, h3);
        if (aVar != null) {
            yVar7.l(new C0288c(aVar, 6));
        } else {
            yVar7.l((C0134b) null);
        }
        C0464y yVar8 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", bVar, h3);
        if (aVar != null) {
            yVar8.l(new C0288c(aVar, 7));
        } else {
            yVar8.l((C0134b) null);
        }
        C0464y yVar9 = new C0464y(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", bVar, h3);
        if (aVar != null) {
            yVar9.l(new C0288c(aVar, 8));
        } else {
            yVar9.l((C0134b) null);
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f3905f.edit();
        Map<String, ?> all = this.f3905f.getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (list == null || list.contains(next))) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        HashSet hashSet;
        BigInteger bigInteger;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        Map<String, ?> all = this.f3905f.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (hashSet == null || hashSet.contains(next))) {
                Object obj = all.get(next);
                Objects.requireNonNull(obj);
                boolean z3 = obj instanceof String;
                g gVar = this.f3906g;
                if (z3) {
                    String str2 = (String) obj;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str2.substring(40);
                            gVar.getClass();
                            try {
                                obj = (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str2.substring(44), 36);
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(next, obj);
                } else {
                    if (obj instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        SharedPreferences.Editor remove = this.f3905f.edit().remove(next);
                        remove.putString(next, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + gVar.g(arrayList)).apply();
                        bigInteger = arrayList;
                    }
                    hashMap.put(next, obj);
                }
                obj = bigInteger;
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final Boolean c(String str, String str2) {
        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return Boolean.valueOf(this.f3905f.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    public final void onAttachedToEngine(a aVar) {
        f fVar = aVar.f1965b;
        this.f3905f = aVar.f1964a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }

    public final void onDetachedFromEngine(a aVar) {
        d(aVar.f1965b, (C0286a) null);
    }
}
