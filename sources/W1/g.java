package w1;

import java.lang.reflect.Field;

public enum g {
    ;

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length() - 1;
        int i3 = 0;
        while (!Character.isLetter(str.charAt(i3)) && i3 < length) {
            i3++;
        }
        char charAt = str.charAt(i3);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i3 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i3) + upperCase + str.substring(i3 + 1);
    }

    public abstract String b(Field field);
}
