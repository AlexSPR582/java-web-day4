package com.alexander.day4_1.validator;

public class ArrayValidator {
    public static final int minSize = 0;

    public boolean arrayValidation(int size) {
        if (size >= minSize) {
            return true;
        }
        return false;
    }
}
