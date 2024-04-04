package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s: args) {
            double aboba=Double.parseDouble(s);
            if (aboba < 0) {
                return false;
            }
        }
        return true;
    }
}