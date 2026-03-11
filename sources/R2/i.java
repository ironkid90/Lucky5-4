package R2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

public class i extends f {
    public e b(l lVar) {
        A2.i.e(lVar, "path");
        File e2 = lVar.e();
        boolean isFile = e2.isFile();
        boolean isDirectory = e2.isDirectory();
        long lastModified = e2.lastModified();
        long length = e2.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e2.exists()) {
            return null;
        }
        return new e(isFile, isDirectory, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null);
    }

    public void c(l lVar, l lVar2) {
        A2.i.e(lVar2, "target");
        if (!lVar.e().renameTo(lVar2.e())) {
            throw new IOException("failed to move " + lVar + " to " + lVar2);
        }
    }

    public final void d(l lVar) {
        if (!Thread.interrupted()) {
            File e2 = lVar.e();
            if (!e2.delete() && e2.exists()) {
                throw new IOException("failed to delete " + lVar);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public final h e(l lVar) {
        return new h(false, new RandomAccessFile(lVar.e(), "r"));
    }

    public final t f(l lVar) {
        A2.i.e(lVar, "file");
        File e2 = lVar.e();
        int i3 = k.f1392a;
        return new g(new FileInputStream(e2));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
