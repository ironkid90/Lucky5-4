package y;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import io.flutter.plugin.platform.c;
import java.util.Objects;

/* renamed from: y.a  reason: case insensitive filesystem */
public final class C0517a {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4805a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f4806b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4807c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4808d;

    public C0517a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.g(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i4).setTextDirection(textDirectionHeuristic).build();
        }
        this.f4805a = textPaint;
        this.f4806b = textDirectionHeuristic;
        this.f4807c = i3;
        this.f4808d = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r7 = (y.C0517a) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof y.C0517a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            y.a r7 = (y.C0517a) r7
            int r1 = r7.f4807c
            int r3 = r6.f4807c
            if (r3 == r1) goto L_0x0014
            goto L_0x0099
        L_0x0014:
            int r1 = r6.f4808d
            int r3 = r7.f4808d
            if (r1 == r3) goto L_0x001c
            goto L_0x0099
        L_0x001c:
            android.text.TextPaint r1 = r6.f4805a
            float r3 = r1.getTextSize()
            android.text.TextPaint r4 = r7.f4805a
            float r5 = r4.getTextSize()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            goto L_0x0099
        L_0x002e:
            float r3 = r1.getTextScaleX()
            float r5 = r4.getTextScaleX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x003b
            goto L_0x0099
        L_0x003b:
            float r3 = r1.getTextSkewX()
            float r5 = r4.getTextSkewX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0048
            goto L_0x0099
        L_0x0048:
            float r3 = r1.getLetterSpacing()
            float r5 = r4.getLetterSpacing()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0055
            goto L_0x0099
        L_0x0055:
            java.lang.String r3 = r1.getFontFeatureSettings()
            java.lang.String r5 = r4.getFontFeatureSettings()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L_0x0064
            goto L_0x0099
        L_0x0064:
            int r3 = r1.getFlags()
            int r5 = r4.getFlags()
            if (r3 == r5) goto L_0x006f
            goto L_0x0099
        L_0x006f:
            android.os.LocaleList r3 = r1.getTextLocales()
            android.os.LocaleList r5 = r4.getTextLocales()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x007e
            goto L_0x0099
        L_0x007e:
            android.graphics.Typeface r3 = r1.getTypeface()
            if (r3 != 0) goto L_0x008b
            android.graphics.Typeface r1 = r4.getTypeface()
            if (r1 == 0) goto L_0x009a
            goto L_0x0099
        L_0x008b:
            android.graphics.Typeface r1 = r1.getTypeface()
            android.graphics.Typeface r3 = r4.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
        L_0x0099:
            return r2
        L_0x009a:
            android.text.TextDirectionHeuristic r1 = r6.f4806b
            android.text.TextDirectionHeuristic r7 = r7.f4806b
            if (r1 != r7) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r0 = r2
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C0517a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.f4805a;
        return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4806b, Integer.valueOf(this.f4807c), Integer.valueOf(this.f4808d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4805a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i3 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i3 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f4806b);
        sb.append(", breakStrategy=" + this.f4807c);
        sb.append(", hyphenationFrequency=" + this.f4808d);
        sb.append("}");
        return sb.toString();
    }

    public C0517a(PrecomputedText.Params params) {
        this.f4805a = params.getTextPaint();
        this.f4806b = params.getTextDirection();
        this.f4807c = params.getBreakStrategy();
        this.f4808d = params.getHyphenationFrequency();
    }
}
