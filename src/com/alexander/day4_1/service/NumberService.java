package com.alexander.day4_1.service;

import java.util.HashSet;
import java.util.Set;

public class NumberService {
    public boolean isSimpleNumber(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFibonacciNumber(int number) {
        int first = 0;
        int second = 1;
        while (first + second <= number) {
            if (first + second == number) {
                return true;
            } else {
                int buffer = first;
                first = second;
                second += buffer;
            }
        }
        return false;
    }

    public boolean isDifferentNumerals(int number) {
        Set<Integer> numeralSet = new HashSet<>();
        int numerals = 0;
        while (number != 0) {
            int numeral = number % 10;
            numeralSet.add(numeral);
            numerals++;
            number = number / 10;
        }
        return numeralSet.size() == numerals;
    }

    public int amountNumerals(int number) {
        int numerals = 0;
        while (number != 0) {
            numerals++;
            number = number / 10;
        }
        return numerals;
    }
}
