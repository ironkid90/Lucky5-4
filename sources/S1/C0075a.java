package S1;

import C0.r;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.h;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: S1.a  reason: case insensitive filesystem */
public final class C0075a {

    /* renamed from: f  reason: collision with root package name */
    public static final Matrix f1432f = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final h f1433a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1434b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1435c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1436d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f1437e;

    public C0075a(h hVar, boolean z3) {
        this.f1433a = hVar;
        if (r.f158i == null) {
            r.f158i = new r(14);
        }
        this.f1434b = r.f158i;
        this.f1435c = z3;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 8) {
            return 3;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        long j3;
        int i6;
        int i7;
        int i8;
        long j4;
        double d3;
        double d4;
        int i9;
        MotionEvent motionEvent2;
        double d5;
        double d6;
        double d7;
        float f3;
        C0075a aVar;
        float f4;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent3 = motionEvent;
        int i10 = i3;
        int i11 = i4;
        ByteBuffer byteBuffer2 = byteBuffer;
        Context context2 = context;
        if (i11 != -1) {
            int i12 = 3;
            int pointerId = (motionEvent.getPointerId(i3) << 3) | (motionEvent.getToolType(i3) & 7);
            int toolType = motionEvent.getToolType(i3);
            if (toolType == 1) {
                i12 = 0;
            } else if (toolType == 2) {
                i12 = 2;
            } else if (toolType == 3) {
                i12 = 1;
            } else if (toolType != 4) {
                i12 = 5;
            }
            float[] fArr = {motionEvent.getX(i3), motionEvent.getY(i3)};
            matrix.mapPoints(fArr);
            HashMap hashMap = this.f1436d;
            if (i12 == 1) {
                j3 = (long) (motionEvent.getButtonState() & 31);
                if (j3 == 0 && motionEvent.getSource() == 8194) {
                    i6 = 4;
                    if (i11 == 4) {
                        hashMap.put(Integer.valueOf(pointerId), fArr);
                    }
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 4;
                j3 = i12 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
            if (containsKey) {
                i7 = i11 == i6 ? 7 : i11 == 5 ? 8 : (i11 == 6 || i11 == 0) ? 9 : -1;
                if (i7 == -1) {
                    return;
                }
            } else {
                i7 = -1;
            }
            if (this.f1435c) {
                r rVar = this.f1434b;
                rVar.getClass();
                i8 = pointerId;
                j4 = B.f1423b.incrementAndGet();
                ((LongSparseArray) rVar.f160g).put(j4, MotionEvent.obtain(motionEvent));
                ((PriorityQueue) rVar.f161h).add(Long.valueOf(j4));
            } else {
                i8 = pointerId;
                j4 = 0;
            }
            int i13 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(j4);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) i7);
                byteBuffer2.putLong(4);
            } else {
                byteBuffer2.putLong((long) i11);
                byteBuffer2.putLong((long) i12);
            }
            byteBuffer2.putLong((long) i13);
            int i14 = i8;
            byteBuffer2.putLong((long) i14);
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(i14));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j3);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i3));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d3 = 0.0d;
                d4 = 1.0d;
            } else {
                d3 = (double) motionRange.getMin();
                d4 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble(d4);
            if (i12 == 2) {
                motionEvent2 = motionEvent;
                i9 = i3;
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i9));
                byteBuffer2.putDouble(0.0d);
            } else {
                motionEvent2 = motionEvent;
                i9 = i3;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i3));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i3));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i3));
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i9));
            if (i12 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i9));
            } else {
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putLong((long) i5);
            if (i13 == 1) {
                Context context3 = context;
                if (context3 != null) {
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 26) {
                        f3 = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                        aVar = this;
                    } else {
                        aVar = this;
                        f3 = (float) aVar.c(context3);
                    }
                    d6 = (double) f3;
                    if (i15 >= 26) {
                        f4 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
                    } else {
                        f4 = (float) aVar.c(context3);
                    }
                    d7 = (double) f4;
                } else {
                    d6 = 48.0d;
                    d7 = 48.0d;
                }
                byteBuffer2.putDouble(d6 * ((double) (-motionEvent2.getAxisValue(10, i9))));
                byteBuffer2.putDouble(d7 * ((double) (-motionEvent2.getAxisValue(9, i9))));
            } else {
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            if (containsKey) {
                float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(i14));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d5 = 0.0d;
            } else {
                d5 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d5);
            byteBuffer2.putDouble(d5);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d5);
            byteBuffer2.putLong(0);
            if (containsKey && i7 == 9) {
                hashMap.remove(Integer.valueOf(i14));
            }
        }
    }

    public final int c(Context context) {
        if (this.f1437e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.f1437e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1437e;
    }
}
