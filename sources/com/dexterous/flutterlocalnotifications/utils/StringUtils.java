package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;

@Keep
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        boolean z3;
        if (str == null || str.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
