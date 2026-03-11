package androidx.core.graphics.drawable;

import L.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import u.C0490b;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f2295k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2296a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2297b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2298c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2299d;

    /* renamed from: e  reason: collision with root package name */
    public int f2300e;

    /* renamed from: f  reason: collision with root package name */
    public int f2301f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2302g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2303h;

    /* renamed from: i  reason: collision with root package name */
    public String f2304i;

    /* renamed from: j  reason: collision with root package name */
    public String f2305j;

    public IconCompat() {
        this.f2296a = -1;
        this.f2298c = null;
        this.f2299d = null;
        this.f2300e = 0;
        this.f2301f = 0;
        this.f2302g = null;
        this.f2303h = f2295k;
        this.f2304i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i3 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i3);
        iconCompat.f2300e = bundle.getInt("int1");
        iconCompat.f2301f = bundle.getInt("int2");
        iconCompat.f2305j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f2302g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f2303h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i3) {
            case -1:
            case 1:
            case k.STRING_FIELD_NUMBER:
                iconCompat.f2297b = bundle.getParcelable("obj");
                break;
            case k.FLOAT_FIELD_NUMBER:
            case k.LONG_FIELD_NUMBER:
            case k.STRING_SET_FIELD_NUMBER:
                iconCompat.f2297b = bundle.getString("obj");
                break;
            case k.INTEGER_FIELD_NUMBER:
                iconCompat.f2297b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i3);
                return null;
        }
        return iconCompat;
    }

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int c3 = C0490b.c(icon);
        if (c3 == 2) {
            return e((Resources) null, C0490b.b(icon), C0490b.a(icon));
        }
        if (c3 == 4) {
            Uri d3 = C0490b.d(icon);
            d3.getClass();
            String uri = d3.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f2297b = uri;
            return iconCompat;
        } else if (c3 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f2297b = icon;
            return iconCompat2;
        } else {
            Uri d4 = C0490b.d(icon);
            d4.getClass();
            String uri2 = d4.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(6);
            iconCompat3.f2297b = uri2;
            return iconCompat3;
        }
    }

    public static Bitmap c(Bitmap bitmap, boolean z3) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = (float) min;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z3) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2297b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Resources resources, String str, int i3) {
        str.getClass();
        if (i3 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2300e = i3;
            if (resources != null) {
                try {
                    iconCompat.f2297b = resources.getResourceName(i3);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2297b = str;
            }
            iconCompat.f2305j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int f() {
        int i3 = this.f2296a;
        if (i3 == -1) {
            return C0490b.a(this.f2297b);
        }
        if (i3 == 2) {
            return this.f2300e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri g() {
        int i3 = this.f2296a;
        if (i3 == -1) {
            return C0490b.d(this.f2297b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f2297b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2296a == -1) {
            return String.valueOf(this.f2297b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2296a) {
            case 1:
                str = "BITMAP";
                break;
            case k.FLOAT_FIELD_NUMBER:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2296a) {
            case 1:
            case k.STRING_FIELD_NUMBER:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2297b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2297b).getHeight());
                break;
            case k.FLOAT_FIELD_NUMBER:
                sb.append(" pkg=");
                sb.append(this.f2305j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(f())}));
                break;
            case k.INTEGER_FIELD_NUMBER:
                sb.append(" len=");
                sb.append(this.f2300e);
                if (this.f2301f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2301f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER:
            case k.STRING_SET_FIELD_NUMBER:
                sb.append(" uri=");
                sb.append(this.f2297b);
                break;
        }
        if (this.f2302g != null) {
            sb.append(" tint=");
            sb.append(this.f2302g);
        }
        if (this.f2303h != f2295k) {
            sb.append(" mode=");
            sb.append(this.f2303h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i3) {
        this.f2298c = null;
        this.f2299d = null;
        this.f2300e = 0;
        this.f2301f = 0;
        this.f2302g = null;
        this.f2303h = f2295k;
        this.f2304i = null;
        this.f2296a = i3;
    }
}
