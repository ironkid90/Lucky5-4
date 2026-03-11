package androidx.media;

import A2.h;
import L.k;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2556a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2557b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2558c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2559d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2557b == audioAttributesImplBase.f2557b) {
            int i4 = this.f2558c;
            int i5 = audioAttributesImplBase.f2558c;
            int i6 = audioAttributesImplBase.f2559d;
            if (i6 == -1) {
                int i7 = audioAttributesImplBase.f2556a;
                int i8 = AudioAttributesCompat.f2552b;
                if ((i5 & 1) != 1) {
                    if ((i5 & 4) != 4) {
                        switch (i7) {
                            case k.FLOAT_FIELD_NUMBER:
                                i3 = 0;
                                break;
                            case k.INTEGER_FIELD_NUMBER:
                                i3 = 8;
                                break;
                            case k.LONG_FIELD_NUMBER:
                                i3 = 4;
                                break;
                            case k.STRING_FIELD_NUMBER:
                            case k.DOUBLE_FIELD_NUMBER:
                            case k.BYTES_FIELD_NUMBER:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case k.STRING_SET_FIELD_NUMBER:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                            default:
                                i3 = 3;
                                break;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 7;
                }
            } else {
                i3 = i6;
            }
            if (i3 == 6) {
                i5 |= 4;
            } else if (i3 == 7) {
                i5 |= 1;
            }
            if (i4 == (i5 & 273) && this.f2556a == audioAttributesImplBase.f2556a && this.f2559d == i6) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2557b), Integer.valueOf(this.f2558c), Integer.valueOf(this.f2556a), Integer.valueOf(this.f2559d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2559d != -1) {
            sb.append(" stream=");
            sb.append(this.f2559d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f2556a;
        int i4 = AudioAttributesCompat.f2552b;
        switch (i3) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case k.FLOAT_FIELD_NUMBER:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case k.INTEGER_FIELD_NUMBER:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case k.LONG_FIELD_NUMBER:
                str = "USAGE_ALARM";
                break;
            case k.STRING_FIELD_NUMBER:
                str = "USAGE_NOTIFICATION";
                break;
            case k.STRING_SET_FIELD_NUMBER:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case k.DOUBLE_FIELD_NUMBER:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case k.BYTES_FIELD_NUMBER:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = h.e("unknown usage ", i3);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f2557b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2558c).toUpperCase());
        return sb.toString();
    }
}
