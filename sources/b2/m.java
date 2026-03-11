package b2;

import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f2765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2766b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2767c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2768d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2769e;

    public m(String str, int i3, int i4, int i5, int i6) {
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
        } else if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
        } else if (i6 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
        } else if (i3 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
        } else if (i4 <= str.length()) {
            this.f2765a = str;
            this.f2766b = i3;
            this.f2767c = i4;
            this.f2768d = i5;
            this.f2769e = i6;
        } else {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
        }
    }

    public static m a(JSONObject jSONObject) {
        return new m(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
