package org.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)) {
            Number parsedNumber = NumberUtils.createNumber(str);
            return parsedNumber.doubleValue() > 0;
        }
        return false;
    }
}