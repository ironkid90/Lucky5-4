package q0;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final long f4374a;

    public m(long j3) {
        this.f4374a = j3;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new m(Long.parseLong(jsonReader.nextString()));
                } else {
                    m mVar = new m(jsonReader.nextLong());
                    jsonReader.close();
                    return mVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        if (this.f4374a == ((m) obj).f4374a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4374a;
        return ((int) ((j3 >>> 32) ^ j3)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f4374a + "}";
    }
}
