package b2;

import java.util.Locale;
import s1.C0464y;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2749a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2750b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2751c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2752d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2753e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2754f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2755g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f2756h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2757i;

    /* renamed from: j  reason: collision with root package name */
    public final C0464y f2758j;

    /* renamed from: k  reason: collision with root package name */
    public final String[] f2759k;

    /* renamed from: l  reason: collision with root package name */
    public final k[] f2760l;

    /* renamed from: m  reason: collision with root package name */
    public final Locale[] f2761m;

    public k(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, l lVar, Integer num, String str, C0464y yVar, String[] strArr, k[] kVarArr, Locale[] localeArr) {
        this.f2749a = z3;
        this.f2750b = z4;
        this.f2751c = z5;
        this.f2752d = z6;
        this.f2753e = z7;
        this.f2754f = i3;
        this.f2755g = lVar;
        this.f2756h = num;
        this.f2757i = str;
        this.f2758j = yVar;
        this.f2759k = strArr;
        this.f2760l = kVarArr;
        this.f2761m = localeArr;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, s1.y] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e9, code lost:
        r30 = "TextInputType.datetime";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ec, code lost:
        r30 = "TextInputType.text";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f3, code lost:
        if (r30.equals(r15) == false) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f5, code lost:
        r11 = new b2.l(r13, r10.optBoolean("signed", false), r10.optBoolean("decimal", false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020b, code lost:
        if (r0.isNull("actionLabel") == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0210, code lost:
        r9 = r0.getString("actionLabel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021a, code lost:
        if (r0.isNull("autofill") == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021c, code lost:
        r35 = r9;
        r39 = r11;
        r34 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0224, code lost:
        r0 = r0.getJSONObject("autofill");
        r10 = r0.getString("uniqueIdentifier");
        r13 = r0.getJSONArray("hints");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023a, code lost:
        if (r0.isNull("hintText") == false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023c, code lost:
        r15 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023f, code lost:
        r17 = r0.getString("hintText");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0244, code lost:
        r0 = r0.getJSONObject("editingValue");
        r14 = new java.lang.String[r13.length()];
        r35 = r9;
        r39 = r11;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0259, code lost:
        if (r9 >= r13.length()) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025b, code lost:
        r11 = r13.getString(r9);
        r40 = r13;
        r17 = r15;
        r15 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0267, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0269, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026d, code lost:
        r11.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0274, code lost:
        switch(r11.hashCode()) {
            case -2058889126: goto L_0x043e;
            case -1917283616: goto L_0x0431;
            case -1844815832: goto L_0x0426;
            case -1825589953: goto L_0x0418;
            case -1821235109: goto L_0x040c;
            case -1757573738: goto L_0x03ff;
            case -1682373820: goto L_0x03f3;
            case -1658955742: goto L_0x03e5;
            case -1567118045: goto L_0x03d7;
            case -1476752575: goto L_0x03ca;
            case -1413737489: goto L_0x03bd;
            case -1377792129: goto L_0x03b0;
            case -1249512767: goto L_0x03a5;
            case -1186060294: goto L_0x0397;
            case -1151034798: goto L_0x038c;
            case -835992323: goto L_0x037f;
            case -818219584: goto L_0x0371;
            case -747304516: goto L_0x0363;
            case -613980922: goto L_0x0357;
            case -613352043: goto L_0x034b;
            case -549230602: goto L_0x033d;
            case -265713450: goto L_0x0331;
            case 3373707: goto L_0x0325;
            case 96619420: goto L_0x0317;
            case 253202685: goto L_0x0309;
            case 588174851: goto L_0x02fb;
            case 798554127: goto L_0x02f1;
            case 892233837: goto L_0x02e4;
            case 991032982: goto L_0x02d7;
            case 1069376125: goto L_0x02ca;
            case 1216985755: goto L_0x02bd;
            case 1469046696: goto L_0x02b0;
            case 1662667945: goto L_0x02a3;
            case 1921869058: goto L_0x0296;
            case 2011152728: goto L_0x0289;
            case 2011773919: goto L_0x027c;
            default: goto L_0x0277;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0277, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0279, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0282, code lost:
        if (r11.equals("birthdayDay") != false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0285, code lost:
        r13 = '#';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028f, code lost:
        if (r11.equals("postalCode") != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0292, code lost:
        r13 = '\"';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029c, code lost:
        if (r11.equals("postalAddressExtended") != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r13 = '!';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a9, code lost:
        if (r11.equals("postalAddress") != false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ac, code lost:
        r13 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b6, code lost:
        if (r11.equals("givenName") != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b9, code lost:
        r13 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c3, code lost:
        if (r11.equals("password") != false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c6, code lost:
        r13 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d0, code lost:
        if (r11.equals("birthday") != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d3, code lost:
        r13 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        if (r11.equals("newUsername") != false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e0, code lost:
        r13 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ea, code lost:
        if (r11.equals("telephoneNumber") != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ed, code lost:
        r13 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f7, code lost:
        if (r11.equals("familyName") != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0301, code lost:
        if (r11.equals("birthdayMonth") != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0305, code lost:
        r13 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030f, code lost:
        if (r11.equals("addressState") != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0313, code lost:
        r13 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x031d, code lost:
        if (r11.equals("email") != false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0321, code lost:
        r13 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0329, code lost:
        if (r11.equals("name") != false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x032d, code lost:
        r13 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0335, code lost:
        if (r11.equals("username") != false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0339, code lost:
        r13 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0343, code lost:
        if (r11.equals("telephoneNumberCountryCode") != false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0347, code lost:
        r13 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034f, code lost:
        if (r11.equals("creditCardExpirationYear") != false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0353, code lost:
        r13 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035b, code lost:
        if (r11.equals("creditCardExpirationDate") != false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x035f, code lost:
        r13 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0369, code lost:
        if (r11.equals("nameSuffix") != false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036d, code lost:
        r13 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0377, code lost:
        if (r11.equals("middleName") != false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x037b, code lost:
        r13 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0385, code lost:
        if (r11.equals("namePrefix") != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0389, code lost:
        r13 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0390, code lost:
        if (r11.equals("creditCardNumber") != false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0394, code lost:
        r13 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x039d, code lost:
        if (r11.equals("postalAddressExtendedPostalCode") != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a1, code lost:
        r15 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a9, code lost:
        if (r11.equals("gender") != false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ad, code lost:
        r13 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03b6, code lost:
        if (r11.equals("addressCity") != false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03ba, code lost:
        r13 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03c3, code lost:
        if (r11.equals("middleInitial") != false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03c7, code lost:
        r13 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03d0, code lost:
        if (r11.equals("countryName") != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03d4, code lost:
        r13 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03dd, code lost:
        if (r11.equals("telephoneNumberDevice") != false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03e1, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03e3, code lost:
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03eb, code lost:
        if (r11.equals("fullStreetAddress") != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03ef, code lost:
        r13 = r34;
        r15 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03f7, code lost:
        if (r11.equals("creditCardExpirationDay") != false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03fb, code lost:
        r13 = r34;
        r15 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0403, code lost:
        if (r11.equals("creditCardSecurityCode") != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0407, code lost:
        r15 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0409, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0410, code lost:
        if (r11.equals("newPassword") != false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0414, code lost:
        r13 = r34;
        r15 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x041e, code lost:
        if (r11.equals("telephoneNumberNational") != false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0422, code lost:
        r13 = r34;
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0426, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x042c, code lost:
        if (r11.equals(r13) != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x042f, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0431, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0439, code lost:
        if (r11.equals("oneTimeCode") != false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043c, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x043e, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0446, code lost:
        if (r11.equals("birthdayYear") != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x044a, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x044b, code lost:
        switch(r15) {
            case 0: goto L_0x04bc;
            case 1: goto L_0x04b9;
            case L.k.FLOAT_FIELD_NUMBER :int: goto L_0x04b7;
            case L.k.INTEGER_FIELD_NUMBER :int: goto L_0x04b4;
            case L.k.LONG_FIELD_NUMBER :int: goto L_0x04b2;
            case L.k.STRING_FIELD_NUMBER :int: goto L_0x04b0;
            case L.k.STRING_SET_FIELD_NUMBER :int: goto L_0x04ae;
            case L.k.DOUBLE_FIELD_NUMBER :int: goto L_0x04ab;
            case L.k.BYTES_FIELD_NUMBER :int: goto L_0x04a8;
            case 9: goto L_0x04a5;
            case 10: goto L_0x04a2;
            case 11: goto L_0x049f;
            case 12: goto L_0x049d;
            case 13: goto L_0x049a;
            case 14: goto L_0x0498;
            case 15: goto L_0x0495;
            case 16: goto L_0x0492;
            case 17: goto L_0x048f;
            case 18: goto L_0x048d;
            case 19: goto L_0x048b;
            case 20: goto L_0x0488;
            case 21: goto L_0x0486;
            case 22: goto L_0x0483;
            case 23: goto L_0x0480;
            case 24: goto L_0x047c;
            case 25: goto L_0x0478;
            case 26: goto L_0x0474;
            case 27: goto L_0x0470;
            case 28: goto L_0x046c;
            case 29: goto L_0x0468;
            case 30: goto L_0x0464;
            case 31: goto L_0x0460;
            case 32: goto L_0x045c;
            case 33: goto L_0x0458;
            case 34: goto L_0x0454;
            case 35: goto L_0x0450;
            default: goto L_0x044e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0450, code lost:
        r11 = "birthDateDay";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0454, code lost:
        r11 = "postalCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0458, code lost:
        r11 = "extendedAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045c, code lost:
        r11 = "postalAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0460, code lost:
        r11 = "personGivenName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0464, code lost:
        r11 = "password";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0468, code lost:
        r11 = "birthDateFull";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x046c, code lost:
        r11 = "newUsername";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0470, code lost:
        r11 = "phoneNumber";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0474, code lost:
        r11 = "personFamilyName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0478, code lost:
        r11 = "birthDateMonth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047c, code lost:
        r11 = "addressRegion";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0480, code lost:
        r11 = "emailAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0483, code lost:
        r11 = "personName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0486, code lost:
        r11 = "username";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0488, code lost:
        r11 = "phoneCountryCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x048b, code lost:
        r11 = "creditCardExpirationYear";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x048d, code lost:
        r11 = "creditCardExpirationDate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x048f, code lost:
        r11 = "personNameSuffix";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0492, code lost:
        r11 = "personMiddleName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0495, code lost:
        r11 = "personNamePrefix";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0498, code lost:
        r11 = "creditCardNumber";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x049a, code lost:
        r11 = "extendedPostalCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x049d, code lost:
        r11 = "gender";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x049f, code lost:
        r11 = "addressLocality";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04a2, code lost:
        r11 = "personMiddleInitial";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04a5, code lost:
        r11 = "addressCountry";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04a8, code lost:
        r11 = "phoneNumberDevice";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04ab, code lost:
        r11 = "streetAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04ae, code lost:
        r11 = "creditCardExpirationDay";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04b0, code lost:
        r11 = "creditCardSecurityCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04b2, code lost:
        r11 = "newPassword";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04b4, code lost:
        r11 = "phoneNational";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04b7, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04b9, code lost:
        r11 = "smsOTPCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04bc, code lost:
        r11 = "birthDateYear";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04be, code lost:
        r14[r9] = r11;
        r9 = r9 + 1;
        r34 = r13;
        r15 = r17;
        r13 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04ca, code lost:
        r0 = b2.m.a(r0);
        r1 = new java.lang.Object();
        r1.f4622f = r10;
        r1.f4623g = r14;
        r1.f4625i = r15;
        r1.f4624h = r0;
        r34 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04e1, code lost:
        r24 = new b2.k(r25, r26, r27, r28, r29, r20, r39, r32, r35, r34, (java.lang.String[]) r33.toArray(new java.lang.String[r33.size()]), r36, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04fc, code lost:
        return r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04fd, code lost:
        r14 = r33;
        r13 = r34;
        r9 = r9 + 1;
        r15 = r15;
        r13 = r24;
        r14 = r35;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x051b, code lost:
        throw new java.lang.NoSuchFieldException(A2.h.g("No such TextInputType: ", r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x051c, code lost:
        r14 = r13;
        r13 = "creditCardExpirationMonth";
        r10 = r10 + 1;
        r13 = r14;
        r14 = r24;
        r15 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0534, code lost:
        throw new java.lang.NoSuchFieldException(A2.h.g("No such TextCapitalization: ", r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        r32 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r13 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        if (r0.isNull("contentCommitMimeTypes") == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r14 = r0.getJSONArray("contentCommitMimeTypes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        if (r14 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0107, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        if (r15 >= r14.length()) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010e, code lost:
        r13.add(r14.optString(r15));
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
        if (r0.isNull("hintLocales") != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        r10 = r0.getJSONArray("hintLocales");
        r14 = new java.util.Locale[r10.length()];
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012f, code lost:
        if (r15 >= r10.length()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0131, code lost:
        r14[r15] = java.util.Locale.forLanguageTag(r10.optString(r15));
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013e, code lost:
        r11 = true;
        r37 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0142, code lost:
        r11 = true;
        r37 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0145, code lost:
        r25 = r0.optBoolean("obscureText");
        r26 = r0.optBoolean("autocorrect", r11);
        r27 = r0.optBoolean("enableSuggestions");
        r28 = r0.optBoolean("enableIMEPersonalizedLearning");
        r29 = r0.optBoolean("enableDeltaModel");
        r11 = r0.getString("textCapitalization");
        r15 = L.j.c(4);
        r14 = r15.length;
        r38 = r24;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0174, code lost:
        if (r10 >= r14) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0176, code lost:
        r24 = r14;
        r14 = r15[r10];
        r30 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        if (r14 == 1) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0180, code lost:
        if (r14 == 2) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
        if (r14 == 3) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0186, code lost:
        if (r14 != 4) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0188, code lost:
        r20 = "TextCapitalization.none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        r20 = "TextCapitalization.sentences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        r20 = "TextCapitalization.words";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0196, code lost:
        r20 = "TextCapitalization.characters";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019e, code lost:
        if (r20.equals(r11) == false) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        r10 = r0.getJSONObject("inputType");
        r15 = r10.getString("name");
        r20 = r14;
        r14 = L.j.c(13);
        r33 = r13;
        r13 = r14.length;
        r34 = "creditCardExpirationMonth";
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ba, code lost:
        if (r9 >= r13) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bc, code lost:
        r24 = r13;
        r13 = r14[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c0, code lost:
        switch(r13) {
            case 1: goto L_0x01ec;
            case L.k.FLOAT_FIELD_NUMBER :int: goto L_0x01e9;
            case L.k.INTEGER_FIELD_NUMBER :int: goto L_0x01e6;
            case L.k.LONG_FIELD_NUMBER :int: goto L_0x01e3;
            case L.k.STRING_FIELD_NUMBER :int: goto L_0x01e0;
            case L.k.STRING_SET_FIELD_NUMBER :int: goto L_0x01dd;
            case L.k.DOUBLE_FIELD_NUMBER :int: goto L_0x01da;
            case L.k.BYTES_FIELD_NUMBER :int: goto L_0x01d7;
            case 9: goto L_0x01d4;
            case 10: goto L_0x01d1;
            case 11: goto L_0x01ce;
            case 12: goto L_0x01cb;
            case 13: goto L_0x01c4;
            default: goto L_0x01c3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c3, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c4, code lost:
        r30 = "TextInputType.twitter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c6, code lost:
        r35 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cb, code lost:
        r30 = "TextInputType.webSearch";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        r30 = "TextInputType.none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d1, code lost:
        r30 = "TextInputType.visiblePassword";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d4, code lost:
        r30 = "TextInputType.url";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d7, code lost:
        r30 = "TextInputType.emailAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01da, code lost:
        r30 = "TextInputType.multiline";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01dd, code lost:
        r30 = "TextInputType.phone";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e0, code lost:
        r30 = "TextInputType.number";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e3, code lost:
        r30 = "TextInputType.address";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e6, code lost:
        r30 = "TextInputType.name";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b2.k a(org.json.JSONObject r40) {
        /*
            r0 = r40
            java.lang.String r1 = "username"
            java.lang.String r2 = "creditCardExpirationYear"
            java.lang.String r3 = "creditCardExpirationDate"
            java.lang.String r4 = "creditCardNumber"
            java.lang.String r5 = "gender"
            java.lang.String r6 = "creditCardExpirationDay"
            java.lang.String r7 = "creditCardSecurityCode"
            java.lang.String r8 = "newPassword"
            java.lang.String r9 = "creditCardExpirationMonth"
            java.lang.String r12 = "name"
            r16 = 5
            r17 = 0
            java.lang.String r10 = "inputAction"
            java.lang.String r10 = r0.getString(r10)
            if (r10 == 0) goto L_0x0535
            java.lang.String r11 = "fields"
            boolean r21 = r0.isNull(r11)
            if (r21 != 0) goto L_0x004b
            org.json.JSONArray r11 = r0.getJSONArray(r11)
            int r14 = r11.length()
            b2.k[] r13 = new b2.k[r14]
            r15 = 0
        L_0x0035:
            if (r15 >= r14) goto L_0x0046
            org.json.JSONObject r24 = r11.getJSONObject(r15)
            b2.k r24 = a(r24)
            r13[r15] = r24
            r23 = 1
            int r15 = r15 + 1
            goto L_0x0035
        L_0x0046:
            r23 = 1
            r36 = r13
            goto L_0x004f
        L_0x004b:
            r23 = 1
            r36 = r17
        L_0x004f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r23)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            int r13 = r10.hashCode()
            switch(r13) {
                case -737377923: goto L_0x00b0;
                case -737089298: goto L_0x00a5;
                case -737080013: goto L_0x009a;
                case -736940669: goto L_0x008f;
                case 469250275: goto L_0x0084;
                case 1241689507: goto L_0x0078;
                case 1539450297: goto L_0x006d;
                case 2110497650: goto L_0x0062;
                default: goto L_0x005f;
            }
        L_0x005f:
            r10 = -1
            goto L_0x00ba
        L_0x0062:
            java.lang.String r13 = "TextInputAction.previous"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x006b
            goto L_0x005f
        L_0x006b:
            r10 = 7
            goto L_0x00ba
        L_0x006d:
            java.lang.String r13 = "TextInputAction.newline"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x0076
            goto L_0x005f
        L_0x0076:
            r10 = 6
            goto L_0x00ba
        L_0x0078:
            java.lang.String r13 = "TextInputAction.go"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x0081
            goto L_0x005f
        L_0x0081:
            r10 = r16
            goto L_0x00ba
        L_0x0084:
            java.lang.String r13 = "TextInputAction.search"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x008d
            goto L_0x005f
        L_0x008d:
            r10 = 4
            goto L_0x00ba
        L_0x008f:
            java.lang.String r13 = "TextInputAction.send"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x0098
            goto L_0x005f
        L_0x0098:
            r10 = 3
            goto L_0x00ba
        L_0x009a:
            java.lang.String r13 = "TextInputAction.none"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x00a3
            goto L_0x005f
        L_0x00a3:
            r10 = 2
            goto L_0x00ba
        L_0x00a5:
            java.lang.String r13 = "TextInputAction.next"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x00ae
            goto L_0x005f
        L_0x00ae:
            r10 = 1
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r13 = "TextInputAction.done"
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x00b9
            goto L_0x005f
        L_0x00b9:
            r10 = 0
        L_0x00ba:
            switch(r10) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00c2;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            r32 = r14
            r10 = 7
        L_0x00c0:
            r11 = 6
            goto L_0x00f1
        L_0x00c2:
            r10 = 7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
        L_0x00c7:
            r32 = r11
            goto L_0x00c0
        L_0x00ca:
            r10 = 7
            goto L_0x00c7
        L_0x00cc:
            r10 = 7
            r11 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
        L_0x00d2:
            r32 = r13
            goto L_0x00c0
        L_0x00d5:
            r10 = 7
            r11 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            goto L_0x00d2
        L_0x00dc:
            r10 = 7
            r11 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            goto L_0x00d2
        L_0x00e3:
            r10 = 7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            goto L_0x00c7
        L_0x00e9:
            r10 = 7
            r11 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r32 = r13
        L_0x00f1:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r14 = "contentCommitMimeTypes"
            boolean r15 = r0.isNull(r14)
            if (r15 == 0) goto L_0x0101
            r14 = r17
            goto L_0x0105
        L_0x0101:
            org.json.JSONArray r14 = r0.getJSONArray(r14)
        L_0x0105:
            if (r14 == 0) goto L_0x0118
            r15 = 0
        L_0x0108:
            int r10 = r14.length()
            if (r15 >= r10) goto L_0x0118
            java.lang.String r10 = r14.optString(r15)
            r13.add(r10)
            r10 = 1
            int r15 = r15 + r10
            goto L_0x0108
        L_0x0118:
            java.lang.String r10 = "hintLocales"
            boolean r14 = r0.isNull(r10)
            if (r14 != 0) goto L_0x0142
            org.json.JSONArray r10 = r0.getJSONArray(r10)
            int r14 = r10.length()
            java.util.Locale[] r14 = new java.util.Locale[r14]
            r15 = 0
        L_0x012b:
            int r11 = r10.length()
            if (r15 >= r11) goto L_0x013e
            java.lang.String r11 = r10.optString(r15)
            java.util.Locale r11 = java.util.Locale.forLanguageTag(r11)
            r14[r15] = r11
            r11 = 1
            int r15 = r15 + r11
            goto L_0x012b
        L_0x013e:
            r11 = 1
            r37 = r14
            goto L_0x0145
        L_0x0142:
            r11 = 1
            r37 = r17
        L_0x0145:
            b2.k r10 = new b2.k
            java.lang.String r14 = "obscureText"
            boolean r25 = r0.optBoolean(r14)
            java.lang.String r14 = "autocorrect"
            boolean r26 = r0.optBoolean(r14, r11)
            java.lang.String r11 = "enableSuggestions"
            boolean r27 = r0.optBoolean(r11)
            java.lang.String r11 = "enableIMEPersonalizedLearning"
            boolean r28 = r0.optBoolean(r11)
            java.lang.String r11 = "enableDeltaModel"
            boolean r29 = r0.optBoolean(r11)
            java.lang.String r11 = "textCapitalization"
            java.lang.String r11 = r0.getString(r11)
            r14 = 4
            int[] r15 = L.j.c(r14)
            int r14 = r15.length
            r38 = r10
            r10 = 0
        L_0x0174:
            if (r10 >= r14) goto L_0x0529
            r24 = r14
            r14 = r15[r10]
            r30 = r15
            r15 = 1
            if (r14 == r15) goto L_0x0196
            r15 = 2
            if (r14 == r15) goto L_0x0192
            r15 = 3
            if (r14 == r15) goto L_0x018e
            r15 = 4
            if (r14 != r15) goto L_0x018d
            java.lang.String r20 = "TextCapitalization.none"
        L_0x018a:
            r15 = r20
            goto L_0x019a
        L_0x018d:
            throw r17
        L_0x018e:
            r15 = 4
            java.lang.String r20 = "TextCapitalization.sentences"
            goto L_0x018a
        L_0x0192:
            r15 = 4
            java.lang.String r20 = "TextCapitalization.words"
            goto L_0x018a
        L_0x0196:
            r15 = 4
            java.lang.String r20 = "TextCapitalization.characters"
            goto L_0x018a
        L_0x019a:
            boolean r15 = r15.equals(r11)
            if (r15 == 0) goto L_0x051c
            java.lang.String r10 = "inputType"
            org.json.JSONObject r10 = r0.getJSONObject(r10)
            b2.l r11 = new b2.l
            java.lang.String r15 = r10.getString(r12)
            r20 = r14
            r19 = 13
            int[] r14 = L.j.c(r19)
            r33 = r13
            int r13 = r14.length
            r34 = r9
            r9 = 0
        L_0x01ba:
            if (r9 >= r13) goto L_0x050f
            r24 = r13
            r13 = r14[r9]
            switch(r13) {
                case 1: goto L_0x01ec;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01e6;
                case 4: goto L_0x01e3;
                case 5: goto L_0x01e0;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01da;
                case 8: goto L_0x01d7;
                case 9: goto L_0x01d4;
                case 10: goto L_0x01d1;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01cb;
                case 13: goto L_0x01c4;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            throw r17
        L_0x01c4:
            java.lang.String r30 = "TextInputType.twitter"
        L_0x01c6:
            r35 = r14
            r14 = r30
            goto L_0x01ef
        L_0x01cb:
            java.lang.String r30 = "TextInputType.webSearch"
            goto L_0x01c6
        L_0x01ce:
            java.lang.String r30 = "TextInputType.none"
            goto L_0x01c6
        L_0x01d1:
            java.lang.String r30 = "TextInputType.visiblePassword"
            goto L_0x01c6
        L_0x01d4:
            java.lang.String r30 = "TextInputType.url"
            goto L_0x01c6
        L_0x01d7:
            java.lang.String r30 = "TextInputType.emailAddress"
            goto L_0x01c6
        L_0x01da:
            java.lang.String r30 = "TextInputType.multiline"
            goto L_0x01c6
        L_0x01dd:
            java.lang.String r30 = "TextInputType.phone"
            goto L_0x01c6
        L_0x01e0:
            java.lang.String r30 = "TextInputType.number"
            goto L_0x01c6
        L_0x01e3:
            java.lang.String r30 = "TextInputType.address"
            goto L_0x01c6
        L_0x01e6:
            java.lang.String r30 = "TextInputType.name"
            goto L_0x01c6
        L_0x01e9:
            java.lang.String r30 = "TextInputType.datetime"
            goto L_0x01c6
        L_0x01ec:
            java.lang.String r30 = "TextInputType.text"
            goto L_0x01c6
        L_0x01ef:
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x04fd
            java.lang.String r9 = "signed"
            r14 = 0
            boolean r9 = r10.optBoolean(r9, r14)
            java.lang.String r15 = "decimal"
            boolean r10 = r10.optBoolean(r15, r14)
            r11.<init>(r13, r9, r10)
            java.lang.String r9 = "actionLabel"
            boolean r10 = r0.isNull(r9)
            if (r10 == 0) goto L_0x0210
            r9 = r17
            goto L_0x0214
        L_0x0210:
            java.lang.String r9 = r0.getString(r9)
        L_0x0214:
            java.lang.String r10 = "autofill"
            boolean r13 = r0.isNull(r10)
            if (r13 == 0) goto L_0x0224
            r35 = r9
            r39 = r11
            r34 = r17
            goto L_0x04e1
        L_0x0224:
            org.json.JSONObject r0 = r0.getJSONObject(r10)
            java.lang.String r10 = "uniqueIdentifier"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r13 = "hints"
            org.json.JSONArray r13 = r0.getJSONArray(r13)
            java.lang.String r15 = "hintText"
            boolean r22 = r0.isNull(r15)
            if (r22 == 0) goto L_0x023f
        L_0x023c:
            r15 = r17
            goto L_0x0244
        L_0x023f:
            java.lang.String r17 = r0.getString(r15)
            goto L_0x023c
        L_0x0244:
            java.lang.String r14 = "editingValue"
            org.json.JSONObject r0 = r0.getJSONObject(r14)
            int r14 = r13.length()
            java.lang.String[] r14 = new java.lang.String[r14]
            r35 = r9
            r39 = r11
            r9 = 0
        L_0x0255:
            int r11 = r13.length()
            if (r9 >= r11) goto L_0x04ca
            java.lang.String r11 = r13.getString(r9)
            r40 = r13
            int r13 = android.os.Build.VERSION.SDK_INT
            r17 = r15
            r15 = 26
            if (r13 >= r15) goto L_0x026d
            r13 = r34
            goto L_0x04be
        L_0x026d:
            r11.getClass()
            int r13 = r11.hashCode()
            switch(r13) {
                case -2058889126: goto L_0x043e;
                case -1917283616: goto L_0x0431;
                case -1844815832: goto L_0x0426;
                case -1825589953: goto L_0x0418;
                case -1821235109: goto L_0x040c;
                case -1757573738: goto L_0x03ff;
                case -1682373820: goto L_0x03f3;
                case -1658955742: goto L_0x03e5;
                case -1567118045: goto L_0x03d7;
                case -1476752575: goto L_0x03ca;
                case -1413737489: goto L_0x03bd;
                case -1377792129: goto L_0x03b0;
                case -1249512767: goto L_0x03a5;
                case -1186060294: goto L_0x0397;
                case -1151034798: goto L_0x038c;
                case -835992323: goto L_0x037f;
                case -818219584: goto L_0x0371;
                case -747304516: goto L_0x0363;
                case -613980922: goto L_0x0357;
                case -613352043: goto L_0x034b;
                case -549230602: goto L_0x033d;
                case -265713450: goto L_0x0331;
                case 3373707: goto L_0x0325;
                case 96619420: goto L_0x0317;
                case 253202685: goto L_0x0309;
                case 588174851: goto L_0x02fb;
                case 798554127: goto L_0x02f1;
                case 892233837: goto L_0x02e4;
                case 991032982: goto L_0x02d7;
                case 1069376125: goto L_0x02ca;
                case 1216985755: goto L_0x02bd;
                case 1469046696: goto L_0x02b0;
                case 1662667945: goto L_0x02a3;
                case 1921869058: goto L_0x0296;
                case 2011152728: goto L_0x0289;
                case 2011773919: goto L_0x027c;
                default: goto L_0x0277;
            }
        L_0x0277:
            r13 = r34
        L_0x0279:
            r15 = -1
            goto L_0x044b
        L_0x027c:
            java.lang.String r13 = "birthdayDay"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0285
            goto L_0x0277
        L_0x0285:
            r13 = 35
            goto L_0x03e3
        L_0x0289:
            java.lang.String r13 = "postalCode"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0292
            goto L_0x0277
        L_0x0292:
            r13 = 34
            goto L_0x03e3
        L_0x0296:
            java.lang.String r13 = "postalAddressExtended"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x029f
            goto L_0x0277
        L_0x029f:
            r13 = 33
            goto L_0x03e3
        L_0x02a3:
            java.lang.String r13 = "postalAddress"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02ac
            goto L_0x0277
        L_0x02ac:
            r13 = 32
            goto L_0x03e3
        L_0x02b0:
            java.lang.String r13 = "givenName"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02b9
            goto L_0x0277
        L_0x02b9:
            r13 = 31
            goto L_0x03e3
        L_0x02bd:
            java.lang.String r13 = "password"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02c6
            goto L_0x0277
        L_0x02c6:
            r13 = 30
            goto L_0x03e3
        L_0x02ca:
            java.lang.String r13 = "birthday"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02d3
            goto L_0x0277
        L_0x02d3:
            r13 = 29
            goto L_0x03e3
        L_0x02d7:
            java.lang.String r13 = "newUsername"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02e0
            goto L_0x0277
        L_0x02e0:
            r13 = 28
            goto L_0x03e3
        L_0x02e4:
            java.lang.String r13 = "telephoneNumber"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x02ed
            goto L_0x0277
        L_0x02ed:
            r13 = 27
            goto L_0x03e3
        L_0x02f1:
            java.lang.String r13 = "familyName"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0409
            goto L_0x0277
        L_0x02fb:
            java.lang.String r13 = "birthdayMonth"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0305
            goto L_0x0277
        L_0x0305:
            r13 = 25
            goto L_0x03e3
        L_0x0309:
            java.lang.String r13 = "addressState"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0313
            goto L_0x0277
        L_0x0313:
            r13 = 24
            goto L_0x03e3
        L_0x0317:
            java.lang.String r13 = "email"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0321
            goto L_0x0277
        L_0x0321:
            r13 = 23
            goto L_0x03e3
        L_0x0325:
            boolean r13 = r11.equals(r12)
            if (r13 != 0) goto L_0x032d
            goto L_0x0277
        L_0x032d:
            r13 = 22
            goto L_0x03e3
        L_0x0331:
            boolean r13 = r11.equals(r1)
            if (r13 != 0) goto L_0x0339
            goto L_0x0277
        L_0x0339:
            r13 = 21
            goto L_0x03e3
        L_0x033d:
            java.lang.String r13 = "telephoneNumberCountryCode"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0347
            goto L_0x0277
        L_0x0347:
            r13 = 20
            goto L_0x03e3
        L_0x034b:
            boolean r13 = r11.equals(r2)
            if (r13 != 0) goto L_0x0353
            goto L_0x0277
        L_0x0353:
            r13 = 19
            goto L_0x03e3
        L_0x0357:
            boolean r13 = r11.equals(r3)
            if (r13 != 0) goto L_0x035f
            goto L_0x0277
        L_0x035f:
            r13 = 18
            goto L_0x03e3
        L_0x0363:
            java.lang.String r13 = "nameSuffix"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x036d
            goto L_0x0277
        L_0x036d:
            r13 = 17
            goto L_0x03e3
        L_0x0371:
            java.lang.String r13 = "middleName"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x037b
            goto L_0x0277
        L_0x037b:
            r13 = 16
            goto L_0x03e3
        L_0x037f:
            java.lang.String r13 = "namePrefix"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0389
            goto L_0x0277
        L_0x0389:
            r13 = 15
            goto L_0x03e3
        L_0x038c:
            boolean r13 = r11.equals(r4)
            if (r13 != 0) goto L_0x0394
            goto L_0x0277
        L_0x0394:
            r13 = 14
            goto L_0x03e3
        L_0x0397:
            java.lang.String r13 = "postalAddressExtendedPostalCode"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03a1
            goto L_0x0277
        L_0x03a1:
            r15 = r19
            goto L_0x0409
        L_0x03a5:
            boolean r13 = r11.equals(r5)
            if (r13 != 0) goto L_0x03ad
            goto L_0x0277
        L_0x03ad:
            r13 = 12
            goto L_0x03e3
        L_0x03b0:
            java.lang.String r13 = "addressCity"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03ba
            goto L_0x0277
        L_0x03ba:
            r13 = 11
            goto L_0x03e3
        L_0x03bd:
            java.lang.String r13 = "middleInitial"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03c7
            goto L_0x0277
        L_0x03c7:
            r13 = 10
            goto L_0x03e3
        L_0x03ca:
            java.lang.String r13 = "countryName"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03d4
            goto L_0x0277
        L_0x03d4:
            r13 = 9
            goto L_0x03e3
        L_0x03d7:
            java.lang.String r13 = "telephoneNumberDevice"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03e1
            goto L_0x0277
        L_0x03e1:
            r13 = 8
        L_0x03e3:
            r15 = r13
            goto L_0x0409
        L_0x03e5:
            java.lang.String r13 = "fullStreetAddress"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x03ef
            goto L_0x0277
        L_0x03ef:
            r13 = r34
            r15 = 7
            goto L_0x044b
        L_0x03f3:
            boolean r13 = r11.equals(r6)
            if (r13 != 0) goto L_0x03fb
            goto L_0x0277
        L_0x03fb:
            r13 = r34
            r15 = 6
            goto L_0x044b
        L_0x03ff:
            boolean r13 = r11.equals(r7)
            if (r13 != 0) goto L_0x0407
            goto L_0x0277
        L_0x0407:
            r15 = r16
        L_0x0409:
            r13 = r34
            goto L_0x044b
        L_0x040c:
            boolean r13 = r11.equals(r8)
            if (r13 != 0) goto L_0x0414
            goto L_0x0277
        L_0x0414:
            r13 = r34
            r15 = 4
            goto L_0x044b
        L_0x0418:
            java.lang.String r13 = "telephoneNumberNational"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0422
            goto L_0x0277
        L_0x0422:
            r13 = r34
            r15 = 3
            goto L_0x044b
        L_0x0426:
            r13 = r34
            boolean r18 = r11.equals(r13)
            if (r18 != 0) goto L_0x042f
            goto L_0x0448
        L_0x042f:
            r15 = 2
            goto L_0x044b
        L_0x0431:
            r13 = r34
            java.lang.String r15 = "oneTimeCode"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x043c
            goto L_0x0448
        L_0x043c:
            r15 = 1
            goto L_0x044b
        L_0x043e:
            r13 = r34
            java.lang.String r15 = "birthdayYear"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x044a
        L_0x0448:
            goto L_0x0279
        L_0x044a:
            r15 = 0
        L_0x044b:
            switch(r15) {
                case 0: goto L_0x04bc;
                case 1: goto L_0x04b9;
                case 2: goto L_0x04b7;
                case 3: goto L_0x04b4;
                case 4: goto L_0x04b2;
                case 5: goto L_0x04b0;
                case 6: goto L_0x04ae;
                case 7: goto L_0x04ab;
                case 8: goto L_0x04a8;
                case 9: goto L_0x04a5;
                case 10: goto L_0x04a2;
                case 11: goto L_0x049f;
                case 12: goto L_0x049d;
                case 13: goto L_0x049a;
                case 14: goto L_0x0498;
                case 15: goto L_0x0495;
                case 16: goto L_0x0492;
                case 17: goto L_0x048f;
                case 18: goto L_0x048d;
                case 19: goto L_0x048b;
                case 20: goto L_0x0488;
                case 21: goto L_0x0486;
                case 22: goto L_0x0483;
                case 23: goto L_0x0480;
                case 24: goto L_0x047c;
                case 25: goto L_0x0478;
                case 26: goto L_0x0474;
                case 27: goto L_0x0470;
                case 28: goto L_0x046c;
                case 29: goto L_0x0468;
                case 30: goto L_0x0464;
                case 31: goto L_0x0460;
                case 32: goto L_0x045c;
                case 33: goto L_0x0458;
                case 34: goto L_0x0454;
                case 35: goto L_0x0450;
                default: goto L_0x044e;
            }
        L_0x044e:
            goto L_0x04be
        L_0x0450:
            java.lang.String r11 = "birthDateDay"
            goto L_0x04be
        L_0x0454:
            java.lang.String r11 = "postalCode"
            goto L_0x04be
        L_0x0458:
            java.lang.String r11 = "extendedAddress"
            goto L_0x04be
        L_0x045c:
            java.lang.String r11 = "postalAddress"
            goto L_0x04be
        L_0x0460:
            java.lang.String r11 = "personGivenName"
            goto L_0x04be
        L_0x0464:
            java.lang.String r11 = "password"
            goto L_0x04be
        L_0x0468:
            java.lang.String r11 = "birthDateFull"
            goto L_0x04be
        L_0x046c:
            java.lang.String r11 = "newUsername"
            goto L_0x04be
        L_0x0470:
            java.lang.String r11 = "phoneNumber"
            goto L_0x04be
        L_0x0474:
            java.lang.String r11 = "personFamilyName"
            goto L_0x04be
        L_0x0478:
            java.lang.String r11 = "birthDateMonth"
            goto L_0x04be
        L_0x047c:
            java.lang.String r11 = "addressRegion"
            goto L_0x04be
        L_0x0480:
            java.lang.String r11 = "emailAddress"
            goto L_0x04be
        L_0x0483:
            java.lang.String r11 = "personName"
            goto L_0x04be
        L_0x0486:
            r11 = r1
            goto L_0x04be
        L_0x0488:
            java.lang.String r11 = "phoneCountryCode"
            goto L_0x04be
        L_0x048b:
            r11 = r2
            goto L_0x04be
        L_0x048d:
            r11 = r3
            goto L_0x04be
        L_0x048f:
            java.lang.String r11 = "personNameSuffix"
            goto L_0x04be
        L_0x0492:
            java.lang.String r11 = "personMiddleName"
            goto L_0x04be
        L_0x0495:
            java.lang.String r11 = "personNamePrefix"
            goto L_0x04be
        L_0x0498:
            r11 = r4
            goto L_0x04be
        L_0x049a:
            java.lang.String r11 = "extendedPostalCode"
            goto L_0x04be
        L_0x049d:
            r11 = r5
            goto L_0x04be
        L_0x049f:
            java.lang.String r11 = "addressLocality"
            goto L_0x04be
        L_0x04a2:
            java.lang.String r11 = "personMiddleInitial"
            goto L_0x04be
        L_0x04a5:
            java.lang.String r11 = "addressCountry"
            goto L_0x04be
        L_0x04a8:
            java.lang.String r11 = "phoneNumberDevice"
            goto L_0x04be
        L_0x04ab:
            java.lang.String r11 = "streetAddress"
            goto L_0x04be
        L_0x04ae:
            r11 = r6
            goto L_0x04be
        L_0x04b0:
            r11 = r7
            goto L_0x04be
        L_0x04b2:
            r11 = r8
            goto L_0x04be
        L_0x04b4:
            java.lang.String r11 = "phoneNational"
            goto L_0x04be
        L_0x04b7:
            r11 = r13
            goto L_0x04be
        L_0x04b9:
            java.lang.String r11 = "smsOTPCode"
            goto L_0x04be
        L_0x04bc:
            java.lang.String r11 = "birthDateYear"
        L_0x04be:
            r14[r9] = r11
            r11 = 1
            int r9 = r9 + r11
            r34 = r13
            r15 = r17
            r13 = r40
            goto L_0x0255
        L_0x04ca:
            r17 = r15
            s1.y r1 = new s1.y
            b2.m r0 = b2.m.a(r0)
            r1.<init>()
            r1.f4622f = r10
            r1.f4623g = r14
            r2 = r17
            r1.f4625i = r2
            r1.f4624h = r0
            r34 = r1
        L_0x04e1:
            int r0 = r33.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r14 = r33
            java.lang.Object[] r0 = r14.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r24 = r38
            r30 = r20
            r31 = r39
            r33 = r35
            r35 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r38
        L_0x04fd:
            r39 = r11
            r11 = r15
            r14 = r33
            r13 = r34
            r15 = 1
            int r9 = r9 + r15
            r15 = r11
            r13 = r24
            r14 = r35
            r11 = r39
            goto L_0x01ba
        L_0x050f:
            r11 = r15
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.String r1 = "No such TextInputType: "
            java.lang.String r1 = A2.h.g(r1, r11)
            r0.<init>(r1)
            throw r0
        L_0x051c:
            r14 = r13
            r15 = 1
            r19 = 13
            r13 = r9
            int r10 = r10 + r15
            r13 = r14
            r14 = r24
            r15 = r30
            goto L_0x0174
        L_0x0529:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.String r1 = "No such TextCapitalization: "
            java.lang.String r1 = A2.h.g(r1, r11)
            r0.<init>(r1)
            throw r0
        L_0x0535:
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r1 = "Configuration JSON missing 'inputAction' property."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.k.a(org.json.JSONObject):b2.k");
    }
}
