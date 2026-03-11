package p0;

import a.C0094a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o0.C0355c;

/* renamed from: p0.a  reason: case insensitive filesystem */
public final class C0360a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f4166c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f4167d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C0355c[]{new C0355c("proto"), new C0355c("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final C0360a f4168e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0360a f4169f;

    /* renamed from: a  reason: collision with root package name */
    public final String f4170a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4171b;

    static {
        String H3 = C0094a.H("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4166c = H3;
        String H4 = C0094a.H("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String H5 = C0094a.H("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4168e = new C0360a(H3, (String) null);
        f4169f = new C0360a(H4, H5);
    }

    public C0360a(String str, String str2) {
        this.f4170a = str;
        this.f4171b = str2;
    }

    public static C0360a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C0360a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
