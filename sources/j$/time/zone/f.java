package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.h;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public final class f implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f5220i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final e[] f5221j = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f5222k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f5223l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f5224a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f5225b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f5226c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f5227d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f5228e;

    /* renamed from: f  reason: collision with root package name */
    private final e[] f5229f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f5230g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f5231h = new ConcurrentHashMap();

    public static f h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f5224a = jArr;
        this.f5225b = zoneOffsetArr;
        this.f5226c = jArr2;
        this.f5228e = zoneOffsetArr2;
        this.f5229f = eVarArr;
        if (jArr2.length == 0) {
            this.f5227d = f5222k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < jArr2.length) {
                int i4 = i3 + 1;
                b bVar = new b(jArr2[i3], zoneOffsetArr2[i3], zoneOffsetArr2[i4]);
                if (bVar.W()) {
                    arrayList.add(bVar.r());
                    arrayList.add(bVar.p());
                } else {
                    arrayList.add(bVar.p());
                    arrayList.add(bVar.r());
                }
                i3 = i4;
            }
            this.f5227d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f5230g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f5225b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f5220i;
        this.f5224a = jArr;
        this.f5226c = jArr;
        this.f5227d = f5222k;
        this.f5228e = zoneOffsetArr;
        this.f5229f = f5221j;
        this.f5230g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f5225b = zoneOffsetArr;
        zoneOffsetArr[0] = i(timeZone.getRawOffset());
        long[] jArr = f5220i;
        this.f5224a = jArr;
        this.f5226c = jArr;
        this.f5227d = f5222k;
        this.f5228e = zoneOffsetArr;
        this.f5229f = f5221j;
        this.f5230g = timeZone;
    }

    private static ZoneOffset i(int i3) {
        return ZoneOffset.c0(i3 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f5230g != null ? (byte) 100 : 1, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.f5224a;
        objectOutput.writeInt(jArr.length);
        for (long c3 : jArr) {
            a.c(c3, objectOutput);
        }
        for (ZoneOffset d3 : this.f5225b) {
            a.d(d3, objectOutput);
        }
        long[] jArr2 = this.f5226c;
        objectOutput.writeInt(jArr2.length);
        for (long c4 : jArr2) {
            a.c(c4, objectOutput);
        }
        for (ZoneOffset d4 : this.f5228e) {
            a.d(d4, objectOutput);
        }
        e[] eVarArr = this.f5229f;
        objectOutput.writeByte(eVarArr.length);
        for (e writeExternal : eVarArr) {
            writeExternal.writeExternal(objectOutput);
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f5230g.getID());
    }

    static f j(ObjectInput objectInput) {
        long[] jArr;
        int readInt = objectInput.readInt();
        long[] jArr2 = f5220i;
        if (readInt == 0) {
            jArr = jArr2;
        } else {
            jArr = new long[readInt];
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            jArr[i3] = a.a(objectInput);
        }
        int i4 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zoneOffsetArr[i5] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr2 = new long[readInt2];
        }
        long[] jArr3 = jArr2;
        for (int i6 = 0; i6 < readInt2; i6++) {
            jArr3[i6] = a.a(objectInput);
        }
        int i7 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            zoneOffsetArr2[i8] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        e[] eVarArr = readByte == 0 ? f5221j : new e[readByte];
        for (int i9 = 0; i9 < readByte; i9++) {
            eVarArr[i9] = e.b(objectInput);
        }
        return new f(jArr, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f5230g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f5226c;
        if (jArr.length == 0) {
            return this.f5225b[0];
        }
        long C3 = instant.C();
        int length = this.f5229f.length;
        ZoneOffset[] zoneOffsetArr = this.f5228e;
        if (length <= 0 || C3 <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, C3);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        b[] b3 = b(c(C3, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i3 = 0; i3 < b3.length; i3++) {
            bVar = b3[i3];
            if (C3 < bVar.O()) {
                return bVar.S();
            }
        }
        return bVar.J();
    }

    public final List g(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        if (e2 instanceof b) {
            return ((b) e2).T();
        }
        return Collections.singletonList((ZoneOffset) e2);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        if (e2 instanceof b) {
            return (b) e2;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f5225b;
        int i3 = 0;
        TimeZone timeZone = this.f5230g;
        if (timeZone != null) {
            b[] b3 = b(localDateTime.c0());
            if (b3.length == 0) {
                return i(timeZone.getOffset(localDateTime.Y(zoneOffsetArr[0]) * 1000));
            }
            int length = b3.length;
            while (i3 < length) {
                b bVar = b3[i3];
                Object a2 = a(localDateTime, bVar);
                if ((a2 instanceof b) || a2.equals(bVar.S())) {
                    return a2;
                }
                i3++;
                obj = a2;
            }
            return obj;
        } else if (this.f5226c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f5229f.length;
            LocalDateTime[] localDateTimeArr = this.f5227d;
            if (length2 <= 0 || !localDateTime.d0(localDateTimeArr[localDateTimeArr.length - 1])) {
                int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
                ZoneOffset[] zoneOffsetArr2 = this.f5228e;
                if (binarySearch == -1) {
                    return zoneOffsetArr2[0];
                }
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                } else if (binarySearch < localDateTimeArr.length - 1) {
                    int i4 = binarySearch + 1;
                    if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i4])) {
                        binarySearch = i4;
                    }
                }
                if ((binarySearch & 1) != 0) {
                    return zoneOffsetArr2[(binarySearch / 2) + 1];
                }
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i5 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr2[i5];
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i5 + 1];
                if (zoneOffset2.Z() > zoneOffset.Z()) {
                    return new b(localDateTime2, zoneOffset, zoneOffset2);
                }
                return new b(localDateTime3, zoneOffset, zoneOffset2);
            }
            b[] b4 = b(localDateTime.c0());
            int length3 = b4.length;
            while (i3 < length3) {
                b bVar2 = b4[i3];
                Object a3 = a(localDateTime, bVar2);
                if ((a3 instanceof b) || a3.equals(bVar2.S())) {
                    return a3;
                }
                i3++;
                obj = a3;
            }
            return obj;
        }
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime r3 = bVar.r();
        if (bVar.W()) {
            if (localDateTime.e0(r3)) {
                return bVar.S();
            }
            if (localDateTime.e0(bVar.p())) {
                return bVar;
            }
            return bVar.J();
        } else if (!localDateTime.e0(r3)) {
            return bVar.J();
        } else {
            return localDateTime.e0(bVar.p()) ? bVar.S() : bVar;
        }
    }

    private b[] b(int i3) {
        long j3;
        int i4 = i3;
        Integer valueOf = Integer.valueOf(i3);
        ConcurrentHashMap concurrentHashMap = this.f5231h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f5230g;
        if (timeZone != null) {
            b[] bVarArr2 = f5223l;
            if (i4 < 1800) {
                return bVarArr2;
            }
            long Y2 = LocalDateTime.f0(i4 - 1).Y(this.f5225b[0]);
            int offset = timeZone.getOffset(Y2 * 1000);
            long j4 = 31968000 + Y2;
            while (Y2 < j4) {
                long j5 = 7776000 + Y2;
                long j6 = Y2;
                if (offset != timeZone.getOffset(j5 * 1000)) {
                    Y2 = j6;
                    while (j5 - Y2 > 1) {
                        long j7 = j4;
                        long floorDiv = Math.floorDiv(j5 + Y2, 2);
                        int i5 = offset;
                        if (timeZone.getOffset(floorDiv * 1000) == i5) {
                            Y2 = floorDiv;
                        } else {
                            j5 = floorDiv;
                        }
                        offset = i5;
                        j4 = j7;
                    }
                    j3 = j4;
                    int i6 = offset;
                    if (timeZone.getOffset(Y2 * 1000) == i6) {
                        Y2 = j5;
                    }
                    ZoneOffset i7 = i(i6);
                    offset = timeZone.getOffset(Y2 * 1000);
                    ZoneOffset i8 = i(offset);
                    if (c(Y2, i8) == i4) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(Y2, i7, i8);
                    }
                } else {
                    j3 = j4;
                    int i9 = offset;
                    Y2 = j5;
                }
                j4 = j3;
            }
            if (1916 <= i4 && i4 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f5229f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            bVarArr3[i10] = eVarArr[i10].a(i4);
        }
        if (i4 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j3, ZoneOffset zoneOffset) {
        return h.i0(Math.floorDiv(j3 + ((long) zoneOffset.Z()), (long) 86400)).b0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Objects.equals(this.f5230g, fVar.f5230g) || !Arrays.equals(this.f5224a, fVar.f5224a) || !Arrays.equals(this.f5225b, fVar.f5225b) || !Arrays.equals(this.f5226c, fVar.f5226c) || !Arrays.equals(this.f5228e, fVar.f5228e) || !Arrays.equals(this.f5229f, fVar.f5229f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f5230g) ^ Arrays.hashCode(this.f5224a)) ^ Arrays.hashCode(this.f5225b)) ^ Arrays.hashCode(this.f5226c)) ^ Arrays.hashCode(this.f5228e)) ^ Arrays.hashCode(this.f5229f);
    }

    public final String toString() {
        TimeZone timeZone = this.f5230g;
        if (timeZone != null) {
            String id = timeZone.getID();
            return "ZoneRules[timeZone=" + id + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f5225b;
        ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
        return "ZoneRules[currentStandardOffset=" + zoneOffset + "]";
    }
}
