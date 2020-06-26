package com.alexander.day4_1.generator;

import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.validator.ArrayValidator;

import java.util.Random;

public class ArrayGenerator {
    public int[] generate(int size) throws ArrayException {
        ArrayValidator validator = new ArrayValidator();
        if (validator.arrayValidation(size)) {
            throw new ArrayException("Invalid size");
        }
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(20);
        }
        return array;
    }

    public int[] generate(int[] array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid array");
        }
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
        }
        return array;
    }
}
