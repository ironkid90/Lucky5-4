package j$.time;

import L.k;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f5157a;

    /* renamed from: b  reason: collision with root package name */
    private Object f5158b;

    public t() {
    }

    t(byte b3, Object obj) {
        this.f5157a = b3;
        this.f5158b = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f5157a;
        Object obj = this.f5158b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case k.FLOAT_FIELD_NUMBER:
                ((Instant) obj).b0(objectOutput);
                return;
            case k.INTEGER_FIELD_NUMBER:
                ((h) obj).u0(objectOutput);
                return;
            case k.LONG_FIELD_NUMBER:
                ((l) obj).p0(objectOutput);
                return;
            case k.STRING_FIELD_NUMBER:
                ((LocalDateTime) obj).q0(objectOutput);
                return;
            case k.STRING_SET_FIELD_NUMBER:
                ((ZonedDateTime) obj).b0(objectOutput);
                return;
            case k.DOUBLE_FIELD_NUMBER:
                ((y) obj).Z(objectOutput);
                return;
            case k.BYTES_FIELD_NUMBER:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((v) obj).T(objectOutput);
                return;
            case 12:
                ((x) obj).a0(objectOutput);
                return;
            case 13:
                ((p) obj).C(objectOutput);
                return;
            case 14:
                ((s) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f5157a = readByte;
        this.f5158b = b(readByte, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b3, ObjectInput objectInput) {
        switch (b3) {
            case 1:
                Duration duration = Duration.f4967c;
                return Duration.T(objectInput.readLong(), (long) objectInput.readInt());
            case k.FLOAT_FIELD_NUMBER:
                Instant instant = Instant.f4970c;
                return Instant.W(objectInput.readLong(), (long) objectInput.readInt());
            case k.INTEGER_FIELD_NUMBER:
                h hVar = h.f5128d;
                return h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case k.LONG_FIELD_NUMBER:
                return l.k0(objectInput);
            case k.STRING_FIELD_NUMBER:
                LocalDateTime localDateTime = LocalDateTime.f4973c;
                h hVar2 = h.f5128d;
                return LocalDateTime.h0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.k0(objectInput));
            case k.STRING_SET_FIELD_NUMBER:
                return ZonedDateTime.T(objectInput);
            case k.DOUBLE_FIELD_NUMBER:
                int i3 = y.f5199d;
                return ZoneId.C(objectInput.readUTF(), false);
            case k.BYTES_FIELD_NUMBER:
                return ZoneOffset.e0(objectInput);
            case 9:
                return r.J(objectInput);
            case 10:
                return OffsetDateTime.S(objectInput);
            case 11:
                int i4 = v.f5193b;
                return v.r(objectInput.readInt());
            case 12:
                return x.T(objectInput);
            case 13:
                return p.r(objectInput);
            case 14:
                return s.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f5158b;
    }
}
