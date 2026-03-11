package q0;

public final class h extends C0396a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f4347a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4348b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4349c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4350d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4351e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4352f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4353g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4354h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4355i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4356j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4357k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4358l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f4347a = num;
        this.f4348b = str;
        this.f4349c = str2;
        this.f4350d = str3;
        this.f4351e = str4;
        this.f4352f = str5;
        this.f4353g = str6;
        this.f4354h = str7;
        this.f4355i = str8;
        this.f4356j = str9;
        this.f4357k = str10;
        this.f4358l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0396a)) {
            return false;
        }
        C0396a aVar = (C0396a) obj;
        Integer num = this.f4347a;
        if (num != null ? num.equals(((h) aVar).f4347a) : ((h) aVar).f4347a == null) {
            String str = this.f4348b;
            if (str != null ? str.equals(((h) aVar).f4348b) : ((h) aVar).f4348b == null) {
                String str2 = this.f4349c;
                if (str2 != null ? str2.equals(((h) aVar).f4349c) : ((h) aVar).f4349c == null) {
                    String str3 = this.f4350d;
                    if (str3 != null ? str3.equals(((h) aVar).f4350d) : ((h) aVar).f4350d == null) {
                        String str4 = this.f4351e;
                        if (str4 != null ? str4.equals(((h) aVar).f4351e) : ((h) aVar).f4351e == null) {
                            String str5 = this.f4352f;
                            if (str5 != null ? str5.equals(((h) aVar).f4352f) : ((h) aVar).f4352f == null) {
                                String str6 = this.f4353g;
                                if (str6 != null ? str6.equals(((h) aVar).f4353g) : ((h) aVar).f4353g == null) {
                                    String str7 = this.f4354h;
                                    if (str7 != null ? str7.equals(((h) aVar).f4354h) : ((h) aVar).f4354h == null) {
                                        String str8 = this.f4355i;
                                        if (str8 != null ? str8.equals(((h) aVar).f4355i) : ((h) aVar).f4355i == null) {
                                            String str9 = this.f4356j;
                                            if (str9 != null ? str9.equals(((h) aVar).f4356j) : ((h) aVar).f4356j == null) {
                                                String str10 = this.f4357k;
                                                if (str10 != null ? str10.equals(((h) aVar).f4357k) : ((h) aVar).f4357k == null) {
                                                    String str11 = this.f4358l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f4358l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f4358l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        Integer num = this.f4347a;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i15 = (i3 ^ 1000003) * 1000003;
        String str = this.f4348b;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i16 = (i15 ^ i4) * 1000003;
        String str2 = this.f4349c;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = str2.hashCode();
        }
        int i17 = (i16 ^ i5) * 1000003;
        String str3 = this.f4350d;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        int i18 = (i17 ^ i6) * 1000003;
        String str4 = this.f4351e;
        if (str4 == null) {
            i7 = 0;
        } else {
            i7 = str4.hashCode();
        }
        int i19 = (i18 ^ i7) * 1000003;
        String str5 = this.f4352f;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int i20 = (i19 ^ i8) * 1000003;
        String str6 = this.f4353g;
        if (str6 == null) {
            i9 = 0;
        } else {
            i9 = str6.hashCode();
        }
        int i21 = (i20 ^ i9) * 1000003;
        String str7 = this.f4354h;
        if (str7 == null) {
            i10 = 0;
        } else {
            i10 = str7.hashCode();
        }
        int i22 = (i21 ^ i10) * 1000003;
        String str8 = this.f4355i;
        if (str8 == null) {
            i11 = 0;
        } else {
            i11 = str8.hashCode();
        }
        int i23 = (i22 ^ i11) * 1000003;
        String str9 = this.f4356j;
        if (str9 == null) {
            i12 = 0;
        } else {
            i12 = str9.hashCode();
        }
        int i24 = (i23 ^ i12) * 1000003;
        String str10 = this.f4357k;
        if (str10 == null) {
            i13 = 0;
        } else {
            i13 = str10.hashCode();
        }
        int i25 = (i24 ^ i13) * 1000003;
        String str11 = this.f4358l;
        if (str11 != null) {
            i14 = str11.hashCode();
        }
        return i14 ^ i25;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f4347a + ", model=" + this.f4348b + ", hardware=" + this.f4349c + ", device=" + this.f4350d + ", product=" + this.f4351e + ", osBuild=" + this.f4352f + ", manufacturer=" + this.f4353g + ", fingerprint=" + this.f4354h + ", locale=" + this.f4355i + ", country=" + this.f4356j + ", mccMnc=" + this.f4357k + ", applicationBuild=" + this.f4358l + "}";
    }
}
