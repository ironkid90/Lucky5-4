package n0;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: n0.a  reason: case insensitive filesystem */
public final class C0344a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4096a;

    public C0344a(String str) {
        this.f4096a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f4096a);
    }
}
