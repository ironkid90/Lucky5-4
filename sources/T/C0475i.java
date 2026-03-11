package t;

import a.C0094a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import s.c;
import s.d;
import x.g;

/* renamed from: t.i  reason: case insensitive filesystem */
public final class C0475i extends C0094a {
    public static Font Z(FontFamily fontFamily, int i3) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 700;
        } else {
            i4 = 400;
        }
        if ((i3 & 2) != 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        FontStyle fontStyle = new FontStyle(i4, i5);
        Font font = fontFamily.getFont(0);
        int a02 = a0(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int a03 = a0(fontStyle, font2.getStyle());
            if (a03 < a02) {
                font = font2;
                a02 = a03;
            }
        }
        return font;
    }

    public static int a0(FontStyle fontStyle, FontStyle fontStyle2) {
        int i3;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        return abs + i3;
    }

    public final Typeface h(Context context, c cVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (d dVar : cVar.f4458a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f4464f).setWeight(dVar.f4460b).setSlant(dVar.f4461c ? 1 : 0).setTtcIndex(dVar.f4463e).setFontVariationSettings(dVar.f4462d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(Z(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface i(Context context, g[] gVarArr, int i3) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (g gVar : gVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f4759a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f4761c).setSlant(gVar.f4762d ? 1 : 0).setTtcIndex(gVar.f4760b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(Z(build2, i3).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface j(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface k(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final g s(g[] gVarArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
