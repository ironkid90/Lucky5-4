package j$.time.chrono;

import L.k;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.h;
import j$.time.l;
import j$.time.temporal.a;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class E implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f4995a;

    /* renamed from: b  reason: collision with root package name */
    private Object f4996b;

    public E() {
    }

    E(byte b3, Object obj) {
        this.f4995a = b3;
        this.f4996b = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f4995a;
        Object obj = this.f4996b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                objectOutput.writeUTF(((C0527a) obj).s());
                return;
            case k.FLOAT_FIELD_NUMBER:
                ((C0533g) obj).writeExternal(objectOutput);
                return;
            case k.INTEGER_FIELD_NUMBER:
                ((k) obj).writeExternal(objectOutput);
                return;
            case k.LONG_FIELD_NUMBER:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(xVar.i(a.YEAR));
                objectOutput.writeByte(xVar.i(a.MONTH_OF_YEAR));
                objectOutput.writeByte(xVar.i(a.DAY_OF_MONTH));
                return;
            case k.STRING_FIELD_NUMBER:
                ((y) obj).C(objectOutput);
                return;
            case k.STRING_SET_FIELD_NUMBER:
                ((q) obj).writeExternal(objectOutput);
                return;
            case k.DOUBLE_FIELD_NUMBER:
                C c3 = (C) obj;
                c3.getClass();
                objectOutput.writeInt(c3.i(a.YEAR));
                objectOutput.writeByte(c3.i(a.MONTH_OF_YEAR));
                objectOutput.writeByte(c3.i(a.DAY_OF_MONTH));
                return;
            case k.BYTES_FIELD_NUMBER:
                I i3 = (I) obj;
                i3.getClass();
                objectOutput.writeInt(i3.i(a.YEAR));
                objectOutput.writeByte(i3.i(a.MONTH_OF_YEAR));
                objectOutput.writeByte(i3.i(a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0534h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        byte readByte = objectInput.readByte();
        this.f4995a = readByte;
        switch (readByte) {
            case 1:
                int i3 = C0527a.f5004c;
                obj = C0527a.r(objectInput.readUTF());
                break;
            case k.FLOAT_FIELD_NUMBER:
                obj = ((C0528b) objectInput.readObject()).K((l) objectInput.readObject());
                break;
            case k.INTEGER_FIELD_NUMBER:
                obj = ((C0531e) objectInput.readObject()).H((ZoneOffset) objectInput.readObject()).I((ZoneId) objectInput.readObject());
                break;
            case k.LONG_FIELD_NUMBER:
                h hVar = x.f5043d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                v.f5041d.getClass();
                obj = new x(h.g0(readInt, readByte2, readByte3));
                break;
            case k.STRING_FIELD_NUMBER:
                y yVar = y.f5047d;
                obj = y.w(objectInput.readByte());
                break;
            case k.STRING_SET_FIELD_NUMBER:
                o oVar = (o) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                oVar.getClass();
                obj = q.Z(oVar, readInt2, readByte4, readByte5);
                break;
            case k.DOUBLE_FIELD_NUMBER:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                A.f4991d.getClass();
                obj = new C(h.g0(readInt3 + 1911, readByte6, readByte7));
                break;
            case k.BYTES_FIELD_NUMBER:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                G.f4998d.getClass();
                obj = new I(h.g0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i4 = C0534h.f5009e;
                obj = new C0534h(C0527a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f4996b = obj;
    }

    private Object readResolve() {
        return this.f4996b;
    }
}
