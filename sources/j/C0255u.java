package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j.u  reason: case insensitive filesystem */
public final class C0255u {

    /* renamed from: k  reason: collision with root package name */
    public static final RectF f3798k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public static final ConcurrentHashMap f3799l = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f3800a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3801b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f3802c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f3803d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f3804e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3805f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f3806g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f3807h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f3808i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f3809j;

    static {
        new ConcurrentHashMap();
    }

    public C0255u(TextView textView) {
        this.f3808i = textView;
        this.f3809j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3799l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r3 + "() method", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r3)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x0027
        L_0x000a:
            r2 = move-exception
            goto L_0x000e
        L_0x000c:
            r2 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r2
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "() method"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0255u.e(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        boolean z3;
        int i3;
        if (this.f3800a != 0) {
            if (this.f3801b) {
                if (this.f3808i.getMeasuredHeight() > 0 && this.f3808i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z3 = this.f3808i.isHorizontallyScrollable();
                    } else {
                        z3 = ((Boolean) e(this.f3808i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (z3) {
                        i3 = 1048576;
                    } else {
                        i3 = (this.f3808i.getMeasuredWidth() - this.f3808i.getTotalPaddingLeft()) - this.f3808i.getTotalPaddingRight();
                    }
                    int height = (this.f3808i.getHeight() - this.f3808i.getCompoundPaddingBottom()) - this.f3808i.getCompoundPaddingTop();
                    if (i3 > 0 && height > 0) {
                        RectF rectF = f3798k;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i3;
                                rectF.bottom = (float) height;
                                float c3 = (float) c(rectF);
                                if (c3 != this.f3808i.getTextSize()) {
                                    f(0, c3);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f3801b = true;
        }
    }

    public final int c(RectF rectF) {
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f3805f.length;
        if (length != 0) {
            int i4 = length - 1;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i4) {
                int i7 = (i5 + i4) / 2;
                int i8 = this.f3805f[i7];
                TextView textView = this.f3808i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int i9 = Build.VERSION.SDK_INT;
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f3807h;
                if (textPaint == null) {
                    this.f3807h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f3807h.set(textView.getPaint());
                this.f3807h.setTextSize((float) i8);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f3807h, Math.round(rectF.right));
                StaticLayout.Builder hyphenationFrequency = obtain.setAlignment((Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                if (maxLines == -1) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = maxLines;
                }
                hyphenationFrequency.setMaxLines(i3);
                if (i9 >= 29) {
                    try {
                        textDirectionHeuristic = textView.getTextDirectionHeuristic();
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                } else {
                    textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                }
                obtain.setTextDirection(textDirectionHeuristic);
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i10 = i7 + 1;
                    i6 = i5;
                    i5 = i10;
                } else {
                    i6 = i7 - 1;
                    i4 = i6;
                }
            }
            return this.f3805f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i3, float f3) {
        Resources resources;
        Context context = this.f3809j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i3, f3, resources.getDisplayMetrics());
        TextView textView = this.f3808i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3801b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f3800a == 1) {
            if (!this.f3806g || this.f3805f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f3804e - this.f3803d) / this.f3802c))) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((((float) i3) * this.f3802c) + this.f3803d);
                }
                this.f3805f = b(iArr);
            }
            this.f3801b = true;
        } else {
            this.f3801b = false;
        }
        return this.f3801b;
    }

    public final boolean h() {
        boolean z3;
        int[] iArr = this.f3805f;
        int length = iArr.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3806g = z3;
        if (z3) {
            this.f3800a = 1;
            this.f3803d = (float) iArr[0];
            this.f3804e = (float) iArr[length - 1];
            this.f3802c = -1.0f;
        }
        return z3;
    }

    public final void i(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        } else if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        } else if (f5 > 0.0f) {
            this.f3800a = 1;
            this.f3803d = f3;
            this.f3804e = f4;
            this.f3802c = f5;
            this.f3806g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
    }
}
