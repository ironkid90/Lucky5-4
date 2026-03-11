package R2;

import A2.i;
import j1.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public final class j extends i {
    public static Long g(FileTime fileTime) {
        long c3 = fileTime.toMillis();
        Long valueOf = Long.valueOf(c3);
        if (c3 != 0) {
            return valueOf;
        }
        return null;
    }

    public final e b(l lVar) {
        Path path;
        Long l3;
        Long l4;
        i.e(lVar, "path");
        Path f3 = lVar.f();
        Long l5 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f3, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if (readAttributes.isSymbolicLink()) {
                path = Files.readSymbolicLink(f3);
            } else {
                path = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path != null) {
                String str = l.f1393g;
                e.a(path.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l3 = g(creationTime);
            } else {
                l3 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l4 = g(lastModifiedTime);
            } else {
                l4 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l5 = g(lastAccessTime);
            }
            return new e(isRegularFile, isDirectory, valueOf, l3, l4, l5);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public final void c(l lVar, l lVar2) {
        i.e(lVar2, "target");
        try {
            Files.move(lVar.f(), lVar2.f(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public final String toString() {
        return "NioSystemFileSystem";
    }
}
