package j$.time;

import j$.time.zone.f;
import j$.time.zone.g;
import j$.time.zone.j;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;

final class y extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f5199d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f5200b;

    /* renamed from: c  reason: collision with root package name */
    private final transient f f5201c;

    static y W(String str, boolean z3) {
        f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i3 == 0) && ((charAt < '0' || charAt > '9' || i3 == 0) && ((charAt != '~' || i3 == 0) && ((charAt != '.' || i3 == 0) && ((charAt != '_' || i3 == 0) && ((charAt != '+' || i3 == 0) && (charAt != '-' || i3 == 0))))))))) {
                    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j.b(str, true);
            } catch (g e2) {
                if (!z3) {
                    fVar = null;
                } else {
                    throw e2;
                }
            }
            return new y(str, fVar);
        }
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    y(String str, f fVar) {
        this.f5200b = str;
        this.f5201c = fVar;
    }

    public final String s() {
        return this.f5200b;
    }

    public final f r() {
        f fVar = this.f5201c;
        return fVar != null ? fVar : j.b(this.f5200b, false);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void T(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f5200b);
    }

    /* access modifiers changed from: package-private */
    public final void Z(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f5200b);
    }
}
