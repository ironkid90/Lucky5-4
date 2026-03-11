package j1;

import A2.i;
import L.k;
import Q.a;
import R2.b;
import R2.l;
import a1.C0096a;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b2.f;
import c2.o;
import c2.p;
import com.ai9poker.app.R;
import com.google.firebase.components.ComponentRegistrar;
import i2.C0224e;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import y1.m;

public final class e implements a, R.e, o, m {

    /* renamed from: g  reason: collision with root package name */
    public static e f3847g;

    /* renamed from: h  reason: collision with root package name */
    public static e f3848h;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3849f;

    public /* synthetic */ e(int i3) {
        this.f3849f = i3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [R2.a, java.lang.Object] */
    public static l a(String str, boolean z3) {
        i.e(str, "<this>");
        b bVar = S2.b.f1528a;
        ? obj = new Object();
        obj.p(str);
        return S2.b.d(obj, z3);
    }

    public static l c(File file) {
        String str = l.f1393g;
        String file2 = file.toString();
        i.d(file2, "toString()");
        return a(file2, false);
    }

    public void b(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case k.FLOAT_FIELD_NUMBER:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k.INTEGER_FIELD_NUMBER:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case k.LONG_FIELD_NUMBER:
                str = "RESULT_NOT_WRITABLE";
                break;
            case k.STRING_FIELD_NUMBER:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case k.STRING_SET_FIELD_NUMBER:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k.DOUBLE_FIELD_NUMBER:
                str = "RESULT_IO_EXCEPTION";
                break;
            case k.BYTES_FIELD_NUMBER:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public CharSequence d(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            return editTextPreference.f2563f.getString(R.string.not_set);
        }
        return null;
    }

    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0096a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f1996a;
            if (str != null) {
                C0224e eVar = new C0224e(5, str, aVar);
                aVar = new C0096a(str, aVar.f1997b, aVar.f1998c, aVar.f1999d, aVar.f2000e, eVar, aVar.f2002g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public void onMethodCall(c2.m mVar, p pVar) {
        ((f) pVar).b((Object) null);
    }

    public Object r() {
        switch (this.f3849f) {
            case 16:
                return new TreeMap();
            case 17:
                return new TreeSet();
            default:
                return new ArrayList();
        }
    }

    public /* synthetic */ e(int i3, Object obj) {
        this.f3849f = i3;
    }

    public e(C0.f fVar) {
        this.f3849f = 3;
        i.e(fVar, "fragmentManager");
        new CopyOnWriteArrayList();
    }
}
