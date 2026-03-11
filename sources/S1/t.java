package S1;

import G0.z;
import android.util.Log;
import c2.C0137e;
import java.nio.ByteBuffer;

public final /* synthetic */ class t implements C0137e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f1514a;

    public /* synthetic */ t(z zVar) {
        this.f1514a = zVar;
    }

    public final void a(ByteBuffer byteBuffer) {
        boolean z3;
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                if (byteBuffer.get() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            }
        } else {
            Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        this.f1514a.a(bool.booleanValue());
    }
}
