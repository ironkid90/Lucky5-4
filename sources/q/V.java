package q;

import L.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f4232a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f4233b;

    /* renamed from: c  reason: collision with root package name */
    public String f4234c;

    /* renamed from: d  reason: collision with root package name */
    public String f4235d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4236e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4237f;

    /* JADX WARNING: type inference failed for: r5v1, types: [q.V, java.lang.Object] */
    public static V a(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.a(bundle2);
        } else {
            iconCompat = null;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z3 = bundle.getBoolean("isBot");
        boolean z4 = bundle.getBoolean("isImportant");
        ? obj = new Object();
        obj.f4232a = charSequence;
        obj.f4233b = iconCompat;
        obj.f4234c = string;
        obj.f4235d = string2;
        obj.f4236e = z3;
        obj.f4237f = z4;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f4232a);
        IconCompat iconCompat = this.f4233b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f2296a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f2297b);
                    break;
                case 1:
                case k.STRING_FIELD_NUMBER:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f2297b);
                    break;
                case k.FLOAT_FIELD_NUMBER:
                case k.LONG_FIELD_NUMBER:
                case k.STRING_SET_FIELD_NUMBER:
                    bundle.putString("obj", (String) iconCompat.f2297b);
                    break;
                case k.INTEGER_FIELD_NUMBER:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f2297b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle.putInt("type", iconCompat.f2296a);
            bundle.putInt("int1", iconCompat.f2300e);
            bundle.putInt("int2", iconCompat.f2301f);
            bundle.putString("string1", iconCompat.f2305j);
            ColorStateList colorStateList = iconCompat.f2302g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2303h;
            if (mode != IconCompat.f2295k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f4234c);
        bundle2.putString("key", this.f4235d);
        bundle2.putBoolean("isBot", this.f4236e);
        bundle2.putBoolean("isImportant", this.f4237f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        String str = this.f4235d;
        String str2 = v.f4235d;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (!Objects.equals(Objects.toString(this.f4232a), Objects.toString(v.f4232a)) || !Objects.equals(this.f4234c, v.f4234c) || !Boolean.valueOf(this.f4236e).equals(Boolean.valueOf(v.f4236e)) || !Boolean.valueOf(this.f4237f).equals(Boolean.valueOf(v.f4237f))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f4235d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(new Object[]{this.f4232a, this.f4234c, Boolean.valueOf(this.f4236e), Boolean.valueOf(this.f4237f)});
    }
}
