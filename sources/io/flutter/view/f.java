package io.flutter.view;

import A2.h;
import L.j;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class f {

    /* renamed from: A  reason: collision with root package name */
    public String f3475A;

    /* renamed from: B  reason: collision with root package name */
    public String f3476B;

    /* renamed from: C  reason: collision with root package name */
    public int f3477C;

    /* renamed from: D  reason: collision with root package name */
    public int f3478D = -1;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3479E = false;

    /* renamed from: F  reason: collision with root package name */
    public long f3480F;

    /* renamed from: G  reason: collision with root package name */
    public int f3481G;

    /* renamed from: H  reason: collision with root package name */
    public int f3482H;

    /* renamed from: I  reason: collision with root package name */
    public int f3483I;
    public float J;

    /* renamed from: K  reason: collision with root package name */
    public String f3484K;

    /* renamed from: L  reason: collision with root package name */
    public String f3485L;

    /* renamed from: M  reason: collision with root package name */
    public float f3486M;

    /* renamed from: N  reason: collision with root package name */
    public float f3487N;

    /* renamed from: O  reason: collision with root package name */
    public float f3488O;

    /* renamed from: P  reason: collision with root package name */
    public float f3489P;

    /* renamed from: Q  reason: collision with root package name */
    public float[] f3490Q;

    /* renamed from: R  reason: collision with root package name */
    public f f3491R;

    /* renamed from: S  reason: collision with root package name */
    public final ArrayList f3492S = new ArrayList();

    /* renamed from: T  reason: collision with root package name */
    public final ArrayList f3493T = new ArrayList();

    /* renamed from: U  reason: collision with root package name */
    public ArrayList f3494U;

    /* renamed from: V  reason: collision with root package name */
    public e f3495V;

    /* renamed from: W  reason: collision with root package name */
    public e f3496W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3497X = true;

    /* renamed from: Y  reason: collision with root package name */
    public float[] f3498Y;
    public boolean Z = true;

    /* renamed from: a  reason: collision with root package name */
    public final g f3499a;

    /* renamed from: a0  reason: collision with root package name */
    public float[] f3500a0;

    /* renamed from: b  reason: collision with root package name */
    public int f3501b = -1;

    /* renamed from: b0  reason: collision with root package name */
    public Rect f3502b0;

    /* renamed from: c  reason: collision with root package name */
    public long f3503c;

    /* renamed from: d  reason: collision with root package name */
    public int f3504d;

    /* renamed from: e  reason: collision with root package name */
    public int f3505e;

    /* renamed from: f  reason: collision with root package name */
    public int f3506f;

    /* renamed from: g  reason: collision with root package name */
    public int f3507g;

    /* renamed from: h  reason: collision with root package name */
    public int f3508h;

    /* renamed from: i  reason: collision with root package name */
    public int f3509i;

    /* renamed from: j  reason: collision with root package name */
    public int f3510j;

    /* renamed from: k  reason: collision with root package name */
    public int f3511k;

    /* renamed from: l  reason: collision with root package name */
    public float f3512l;

    /* renamed from: m  reason: collision with root package name */
    public float f3513m;

    /* renamed from: n  reason: collision with root package name */
    public float f3514n;

    /* renamed from: o  reason: collision with root package name */
    public String f3515o;

    /* renamed from: p  reason: collision with root package name */
    public String f3516p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f3517q;

    /* renamed from: r  reason: collision with root package name */
    public String f3518r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f3519s;

    /* renamed from: t  reason: collision with root package name */
    public String f3520t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f3521u;
    public String v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f3522w;

    /* renamed from: x  reason: collision with root package name */
    public String f3523x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f3524y;

    /* renamed from: z  reason: collision with root package name */
    public String f3525z;

    public f(g gVar) {
        this.f3499a = gVar;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [io.flutter.view.j, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [io.flutter.view.h, io.flutter.view.j, java.lang.Object] */
    public static ArrayList C(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = j.c(2)[byteBuffer.getInt()];
            int b3 = j.b(i7);
            if (b3 == 0) {
                byteBuffer.getInt();
                ? obj = new Object();
                obj.f3551a = i5;
                obj.f3552b = i6;
                obj.f3553c = i7;
                arrayList.add(obj);
            } else if (b3 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                ? obj2 = new Object();
                obj2.f3551a = i5;
                obj2.f3552b = i6;
                obj2.f3553c = i7;
                obj2.f3550d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void G(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f3 = fArr[3];
        fArr[0] = fArr[0] / f3;
        fArr[1] = fArr[1] / f3;
        fArr[2] = fArr[2] / f3;
        fArr[3] = 0.0f;
    }

    public static Rect d(f fVar) {
        return fVar.f3502b0;
    }

    public static boolean j(f fVar, d dVar) {
        if ((fVar.f3504d & dVar.f3469f) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, s1.y] */
    public static SpannableString r(f fVar) {
        ? obj = new Object();
        obj.f4622f = fVar.f3518r;
        obj.f4623g = fVar.f3519s;
        obj.f4624h = fVar.A();
        return obj.c();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, s1.y] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, s1.y] */
    public static CharSequence s(f fVar) {
        ? obj = new Object();
        obj.f4622f = fVar.f3516p;
        obj.f4623g = fVar.f3517q;
        obj.f4625i = fVar.f3475A;
        obj.f4624h = fVar.A();
        CharSequence c3 = obj.c();
        ? obj2 = new Object();
        obj2.f4622f = fVar.f3523x;
        obj2.f4623g = fVar.f3524y;
        obj2.f4624h = fVar.A();
        CharSequence[] charSequenceArr = {c3, obj2.c()};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 2; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence == null || charSequence.length() == 0) {
                    charSequence = charSequence2;
                } else {
                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                }
            }
        }
        return charSequence;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, s1.y] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, s1.y] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, s1.y] */
    public static CharSequence t(f fVar) {
        ? obj = new Object();
        obj.f4622f = fVar.f3518r;
        obj.f4623g = fVar.f3519s;
        obj.f4624h = fVar.A();
        CharSequence c3 = obj.c();
        ? obj2 = new Object();
        obj2.f4622f = fVar.f3516p;
        obj2.f4623g = fVar.f3517q;
        obj2.f4625i = fVar.f3475A;
        obj2.f4624h = fVar.A();
        CharSequence c4 = obj2.c();
        ? obj3 = new Object();
        obj3.f4622f = fVar.f3523x;
        obj3.f4623g = fVar.f3524y;
        obj3.f4624h = fVar.A();
        CharSequence[] charSequenceArr = {c3, c4, obj3.c()};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence == null || charSequence.length() == 0) {
                    charSequence = charSequence2;
                } else {
                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                }
            }
        }
        return charSequence;
    }

    public static boolean y(f fVar, d dVar) {
        if ((fVar.f3481G & dVar.f3469f) != 0) {
            return true;
        }
        return false;
    }

    public final String A() {
        String str = this.f3476B;
        if (str == null || str.isEmpty()) {
            return this.f3499a.f3538l;
        }
        return this.f3476B;
    }

    public final String B() {
        String str;
        if (D(13) && (str = this.f3516p) != null && !str.isEmpty()) {
            return this.f3516p;
        }
        Iterator it = this.f3492S.iterator();
        while (it.hasNext()) {
            String B3 = ((f) it.next()).B();
            if (B3 != null && !B3.isEmpty()) {
                return B3;
            }
        }
        return null;
    }

    public final boolean D(int i3) {
        if ((this.f3503c & ((long) h.d(i3))) != 0) {
            return true;
        }
        return false;
    }

    public final f E(float[] fArr, boolean z3) {
        float f3 = fArr[3];
        boolean z4 = false;
        float f4 = fArr[0] / f3;
        float f5 = fArr[1] / f3;
        if (f4 < this.f3486M || f4 >= this.f3488O || f5 < this.f3487N || f5 >= this.f3489P) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f3493T.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!fVar.D(14)) {
                if (fVar.f3497X) {
                    fVar.f3497X = false;
                    if (fVar.f3498Y == null) {
                        fVar.f3498Y = new float[16];
                    }
                    if (!Matrix.invertM(fVar.f3498Y, 0, fVar.f3490Q, 0)) {
                        Arrays.fill(fVar.f3498Y, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, fVar.f3498Y, 0, fArr, 0);
                f E3 = fVar.E(fArr2, z3);
                if (E3 != null) {
                    return E3;
                }
            }
        }
        if (z3 && this.f3509i != -1) {
            z4 = true;
        }
        if (F() || z4) {
            return this;
        }
        return null;
    }

    public final boolean F() {
        String str;
        String str2;
        String str3;
        if (D(12)) {
            return false;
        }
        if (D(22)) {
            return true;
        }
        int i3 = this.f3504d;
        int i4 = g.f3526y;
        if ((i3 & -61) == 0 && (this.f3503c & ((long) 10682871)) == 0 && (((str = this.f3516p) == null || str.isEmpty()) && (((str2 = this.f3518r) == null || str2.isEmpty()) && ((str3 = this.f3523x) == null || str3.isEmpty())))) {
            return false;
        }
        return true;
    }

    public final void H(float[] fArr, HashSet hashSet, boolean z3) {
        hashSet.add(this);
        if (this.Z) {
            z3 = true;
        }
        if (z3) {
            if (this.f3500a0 == null) {
                this.f3500a0 = new float[16];
            }
            if (this.f3490Q == null) {
                this.f3490Q = new float[16];
            }
            Matrix.multiplyMM(this.f3500a0, 0, fArr, 0, this.f3490Q, 0);
            float[] fArr2 = new float[4];
            fArr2[2] = 0.0f;
            fArr2[3] = 1.0f;
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            fArr2[0] = this.f3486M;
            fArr2[1] = this.f3487N;
            G(fArr3, this.f3500a0, fArr2);
            fArr2[0] = this.f3488O;
            fArr2[1] = this.f3487N;
            G(fArr4, this.f3500a0, fArr2);
            fArr2[0] = this.f3488O;
            fArr2[1] = this.f3489P;
            G(fArr5, this.f3500a0, fArr2);
            fArr2[0] = this.f3486M;
            fArr2[1] = this.f3489P;
            G(fArr6, this.f3500a0, fArr2);
            if (this.f3502b0 == null) {
                this.f3502b0 = new Rect();
            }
            this.f3502b0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.Z = false;
        }
        Iterator it = this.f3492S.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.f3478D = i3;
            i3 = fVar.f3501b;
            fVar.H(this.f3500a0, hashSet, z3);
        }
    }

    public final void z(ArrayList arrayList) {
        if (D(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f3492S.iterator();
        while (it.hasNext()) {
            ((f) it.next()).z(arrayList);
        }
    }
}
