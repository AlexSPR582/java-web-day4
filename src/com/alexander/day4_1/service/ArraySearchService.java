package com.alexander.day4_1.service;

import com.alexander.day4_1.entity.CustomArray;
import com.alexander.day4_1.exception.ArrayException;

public class ArraySearchService {
    public int binarySearch(int number, CustomArray array)
            throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        int left = 0;
        int right = array.getSize() - 1;
        int index = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array.getElement(middle) < number) {
                left = middle + 1;
            } else if (array.getElement(middle) > number) {
                right = middle - 1;
            } else {
                index = middle;
                break;
            }
        }
        return index;
    }

    public int findMax(CustomArray array) throws ArrayException {
        if (array == null || array.getSize() < 1) {
            throw new ArrayException("Invalid input");
        }
        int max = array.getElement(0);
        for (int i = 1; i < array.getSize(); i++) {
            if (max < array.getElement(i)) {
                max = array.getElement(i);
            }
        }
        return max;
    }

    public int findMin(CustomArray array) throws ArrayException {
        if (array == null || array.getSize() < 1) {
            throw new ArrayException("Invalid input");
        }
        int min = array.getElement(0);
        for (int i = 1; i < array.getSize(); i++) {
            if (min > array.getElement(i)) {
                min = array.getElement(i);
            }
        }
        return min;
    }

    public int[] findSimpleNumbers(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid input");
        }
        int size = simpleNumbersSize(array);
        NumberService service = new NumberService();
        int[] simpleNumbers = new int[size];
        int ind = 0;
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.isSimpleNumber(number)) {
                simpleNumbers[ind] = number;
                ind++;
            }
        }
        return simpleNumbers;
    }

    private int simpleNumbersSize(CustomArray array) {
        int size = 0;
        NumberService service = new NumberService();
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.isSimpleNumber(number)) {
                size++;
            }
        }
        return size;
    }

    public int[] findFibonacciNumbers(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid input");
        }
        int size = fibonacciNumbersSize(array);
        NumberService service = new NumberService();
        int[] fibonacciNumbers = new int[size];
        int ind = 0;
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.isFibonacciNumber(number)) {
                fibonacciNumbers[ind] = number;
                ind++;
            }
        }
        return fibonacciNumbers;
    }

    private int fibonacciNumbersSize(CustomArray array) {
        int size = 0;
        NumberService service = new NumberService();
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.isFibonacciNumber(number)) {
                size++;
            }
        }
        return size;
    }

    public int[] findDifferentNumerals(CustomArray array)
            throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid input");
        }
        int size = differentNumeralsSize(array);
        int[] diffNum = new int[size];
        int ind = 0;
        NumberService service = new NumberService();
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.amountNumerals(number) == 3 &&
                    service.isDifferentNumerals(number)) {
                diffNum[ind] = number;
                ind++;
            }
        }
        return diffNum;
    }

    private int differentNumeralsSize(CustomArray array) {
        int size = 0;
        NumberService service = new NumberService();
        for (int i = 0; i < array.getSize(); i++) {
            int number = array.getElement(i);
            if (service.amountNumerals(number) == 3 &&
                    service.isDifferentNumerals(number)) {
                size++;
            }
        }
        return size;
    }
}
