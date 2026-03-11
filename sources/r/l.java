package R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f1354a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1355b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1356c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1357d;

    public l(int i3, int i4, long j3, long j4) {
        this.f1354a = i3;
        this.f1355b = i4;
        this.f1356c = j3;
        this.f1357d = j4;
    }

    public static l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l lVar = new l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return lVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1354a);
            dataOutputStream.writeInt(this.f1355b);
            dataOutputStream.writeLong(this.f1356c);
            dataOutputStream.writeLong(this.f1357d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f1355b == lVar.f1355b && this.f1356c == lVar.f1356c && this.f1354a == lVar.f1354a && this.f1357d == lVar.f1357d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f1355b), Long.valueOf(this.f1356c), Integer.valueOf(this.f1354a), Long.valueOf(this.f1357d)});
    }
}
