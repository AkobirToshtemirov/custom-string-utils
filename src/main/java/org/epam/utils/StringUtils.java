package org.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}