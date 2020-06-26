package com.alexander.day4_2.service;

import com.alexander.day4_2.exception.ProgramException;
import com.alexander.day4_2.type.SortType;

public class JaggedArraySortService {
    public void sort(int[][] jagArr, SortType type) throws ProgramException {
        if (jagArr == null || type == null) {
            throw new ProgramException("Invalid matrix");
        }
        switch (type) {
            case BUBBLE_SORT_ROW_SUM:
                bubbleSortRowSum(jagArr);
                break;
            case BUBBLE_SORT_MAX_ELEMENT_IN_ROW:
                bubbleSortMaxInRow(jagArr);
                break;
            case BUBBLE_SORT_MIN_ELEMENT_IN_ROW:
                bubbleSortMinInRow(jagArr);
                break;
        }
    }

    public void sortReverse(int[][] jagArr, SortType type) throws ProgramException {
        if (jagArr == null || type == null) {
            throw new ProgramException("Invalid matrix");
        }
        switch (type) {
            case BUBBLE_SORT_ROW_SUM:
                bubbleSortRowSumReverse(jagArr);
                break;
            case BUBBLE_SORT_MAX_ELEMENT_IN_ROW:
                bubbleSortMaxInRowReverse(jagArr);
                break;
            case BUBBLE_SORT_MIN_ELEMENT_IN_ROW:
                bubbleSortMinInRowReverse(jagArr);
                break;
        }
    }

    private void bubbleSortRowSum(int[][] jagArr) {
        for (int i = 0; i < jagArr.length - 1; i++) {
            for (int j = i + 1; j < jagArr.length; j++) {
                try {
                    if (sum(jagArr[i]) > sum(jagArr[j])) {
                        int[] buffer = jagArr[i];
                        jagArr[i] = jagArr[j];
                        jagArr[j] = buffer;
                    }
                } catch (ProgramException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void bubbleSortRowSumReverse(int[][] jagArr){
        bubbleSortRowSum(jagArr);
        reverseMatrixRow(jagArr);
    }

    private int sum(int[] array) throws ProgramException {
        if (array == null) {
            throw new ProgramException("Invalid array");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private void bubbleSortMaxInRow(int[][] jagArr) {
        for (int i = 0; i < jagArr.length - 1; i++) {
            for (int j = i + 1; j < jagArr.length; j++) {
                try {
                    if (findMax(jagArr[i]) > findMax(jagArr[j])) {
                        int[] buffer = jagArr[i];
                        jagArr[i] = jagArr[j];
                        jagArr[j] = buffer;
                    }
                } catch (ProgramException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void bubbleSortMaxInRowReverse(int[][] jagArr) {
        bubbleSortMaxInRow(jagArr);
        reverseMatrixRow(jagArr);
    }

    private int findMax(int[] array) throws ProgramException {
        if (array == null || array.length < 1) {
            throw new ProgramException("Invalid array");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private void bubbleSortMinInRow(int[][] jagArr) {
        for (int i = 0; i < jagArr.length - 1; i++) {
            for (int j = i + 1; j < jagArr.length; j++) {
                try {
                    if (findMin(jagArr[i]) > findMin(jagArr[j])) {
                        int[] buffer = jagArr[i];
                        jagArr[i] = jagArr[j];
                        jagArr[j] = buffer;
                    }
                } catch (ProgramException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void bubbleSortMinInRowReverse(int[][] jagArr) {
        bubbleSortMinInRow(jagArr);
        reverseMatrixRow(jagArr);
    }

    private int findMin(int[] array) throws ProgramException {
        if (array == null || array.length < 1) {
            throw new ProgramException("Invalid array");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private void reverseMatrixRow(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] buffer = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = buffer;
        }
    }
}
