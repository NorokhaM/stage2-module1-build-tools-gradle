package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args.isEmpty() || args==null) {
            return false;
        }
        for (String s : args) {
            if (s.isEmpty() || s==null) {
                return false;
            }
            try {
                if (Double.parseDouble(s)<=0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}