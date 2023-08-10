package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        try {
            if (str.length() > 1 && str.charAt(0) == '0') return false;
            return Float.parseFloat(str) > 0;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }
}
