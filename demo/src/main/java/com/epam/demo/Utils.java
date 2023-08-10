package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        if (args == null || args.isEmpty()) {
            return false;
        }

        try {
            for (String arg : args) {
                if (Float.parseFloat(arg) <= 0) return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}