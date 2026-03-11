package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class A extends IOException {

    /* renamed from: f  reason: collision with root package name */
    public boolean f2335f;

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.io.IOException] */
    public static A a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.io.IOException] */
    public static C0121z b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.io.IOException] */
    public static A c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.io.IOException] */
    public static A d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.io.IOException] */
    public static A e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
