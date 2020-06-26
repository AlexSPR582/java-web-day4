package com.alexander.day4_1.parser;

import com.alexander.day4_1.exception.ArrayException;

public class ArrayParser {
    public int[] parse(String strArr) throws ArrayException {
        if (strArr == null) {
            throw new ArrayException("Invalid string");
        }
        String[] strNum = strArr.split(" ");
        int[] intNum = new int[strNum.length];
        for (int i = 0; i < strNum.length; i++) {
            try {
                intNum[i] = Integer.parseInt(strNum[i]);
            } catch (NumberFormatException e) {
                throw new ArrayException("Invalid argument");
            }
        }
        return intNum;
    }
}
