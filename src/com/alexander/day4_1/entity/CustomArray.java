package com.alexander.day4_1.entity;

import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.validator.ArrayValidator;

public class CustomArray {
    private int[] numbers;
    private int size;

    public CustomArray(int size) throws ArrayException {
        ArrayValidator validator = new ArrayValidator();
        if (!validator.arrayValidation(size)) {
            throw new ArrayException("Invalid size");
        }
        numbers = new int[size];
        this.size = size;
    }

    public CustomArray(int[] numbers) throws ArrayException {
        if (numbers == null) {
            throw new ArrayException("Invalid array");
        }
        this.numbers = numbers;
        this.size = numbers.length;
    }

    private boolean indexValidation(int index) throws ArrayException {
        if (index < 0 || index >= size) {
            throw new ArrayException("Invalid index");
        }
        return true;
    }

    public void setElement(int index, int num) {
        try {
            if (indexValidation(index)) {
                numbers[index] = num;
            }
        } catch (ArrayException e) {
            e.printStackTrace();
        }
    }

    public void setNumbers(int[] array) throws ArrayException {
        if (numbers == null) {
            throw new ArrayException("Invalid array");
        }
        this.numbers = array;
        this.size = array.length;
    }

    public int getElement(int index) {
        try {
            indexValidation(index);
        } catch (ArrayException e) {
            e.printStackTrace();
        }
        return numbers[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomArray array = (CustomArray) obj;
        if (array.size != size) {
            return false;
        }
        for (int i = 0; i < array.size; i++) {
            if (array.numbers[i] != numbers[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = size * 31;
        for (int i = 0; i < size; i++) {
            result += i * 3 + numbers[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("numbers=[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(numbers[i]).append(", ");
        }
        sb.append(numbers[size - 1]);
        sb.append("], size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
