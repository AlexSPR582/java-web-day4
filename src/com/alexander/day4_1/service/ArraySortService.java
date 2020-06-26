package com.alexander.day4_1.service;

import com.alexander.day4_1.entity.CustomArray;
import com.alexander.day4_1.exception.ArrayException;

public class ArraySortService {
    public void bubbleSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        int size = array.getSize();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array.getElement(i) > array.getElement(j)) {
                    int buffer = array.getElement(i);
                    array.setElement(i, array.getElement(j));
                    array.setElement(j, buffer);
                }
            }
        }
    }

    public void reverseBubbleSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        bubbleSort(array);
        reverse(array);
    }

    public void insertionSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        int size = array.getSize();
        for (int i = 1; i < size; i++) {
            int value = array.getElement(i);
            int j = i - 1;
            while (j >= 0 && array.getElement(j) > value) {
                array.setElement(j + 1, array.getElement(j));
                j--;
            }
            array.setElement(j + 1, value);
        }
    }

    public void reverseInsertionSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        insertionSort(array);
        reverse(array);
    }

    public void selectionSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        int size = array.getSize();
        for (int i = 0; i < size; i++) {
            int minInd = i;
            for (int j = i + 1; j < size; j++) {
                if (array.getElement(j) < array.getElement(minInd)) {
                    minInd = j;
                }
            }
            int buffer = array.getElement(minInd);
            array.setElement(minInd, array.getElement(i));
            array.setElement(i, buffer);
        }
    }

    public void reverseSelectionSort(CustomArray array) throws ArrayException {
        if (array == null) {
            throw new ArrayException("Invalid customArray");
        }
        selectionSort(array);
        reverse(array);
    }

    private void reverse(CustomArray array) {
        int size = array.getSize();
        for (int i = 0; i < size / 2; i++) {
            int buffer = array.getElement(i);
            array.setElement(i, array.getElement(size - i - 1));
            array.setElement(size - i - 1, buffer);
        }
    }
}
