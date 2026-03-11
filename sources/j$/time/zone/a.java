package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f5203a;

    /* renamed from: b  reason: collision with root package name */
    private Serializable f5204b;

    public a() {
    }

    a(byte b3, Serializable serializable) {
        this.f5203a = b3;
        this.f5204b = serializable;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f5203a;
        Serializable serializable = this.f5204b;
        objectOutput.writeByte(b3);
        if (b3 == 1) {
            ((f) serializable).writeExternal(objectOutput);
        } else if (b3 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b3 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else if (b3 == 100) {
            ((f) serializable).k(objectOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        Serializable serializable;
        byte readByte = objectInput.readByte();
        this.f5203a = readByte;
        if (readByte == 1) {
            serializable = f.j(objectInput);
        } else if (readByte == 2) {
            long a2 = a(objectInput);
            ZoneOffset b3 = b(objectInput);
            ZoneOffset b4 = b(objectInput);
            if (!b3.equals(b4)) {
                serializable = new b(a2, b3, b4);
            } else {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
        } else if (readByte == 3) {
            serializable = e.b(objectInput);
        } else if (readByte == 100) {
            serializable = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        } else {
            throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f5204b = serializable;
    }

    private Object readResolve() {
        return this.f5204b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int Z = zoneOffset.Z();
        int i3 = Z % 900 == 0 ? Z / 900 : 127;
        objectOutput.writeByte(i3);
        if (i3 == 127) {
            objectOutput.writeInt(Z);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0(readByte * 900);
    }

    static void c(long j3, ObjectOutput objectOutput) {
        if (j3 < -4575744000L || j3 >= 10413792000L || j3 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j3);
            return;
        }
        int i3 = (int) ((j3 + 4575744000L) / 900);
        objectOutput.writeByte((i3 >>> 16) & 255);
        objectOutput.writeByte((i3 >>> 8) & 255);
        objectOutput.writeByte(i3 & 255);
    }

    static long a(ObjectInput objectInput) {
        byte readByte = objectInput.readByte() & 255;
        if (readByte == 255) {
            return objectInput.readLong();
        }
        return (((long) (((readByte << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
