package test.alexander.day4_1.service;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import com.alexander.day4_1.entity.CustomArray;
import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.service.ArraySortService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySortServiceTest {
    private ArraySortService service;

    @BeforeClass
    public void setUp() {
        service = new ArraySortService();
    }

    @Test
    public void bubbleSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.bubbleSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 4, 6, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void bubbleSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.bubbleSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void bubbleSortExceptionTest() throws ArrayException {
        service.bubbleSort(null);
    }

    @Test
    public void reverseBubbleSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseBubbleSort(actualArray);
            int[] numbersExpected = {7, 6, 4, 4, 3, 2, 1};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void reverseBubbleSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseBubbleSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void reverseBubbleSortExceptionTest() throws ArrayException {
        service.reverseBubbleSort(null);
    }

    @Test
    public void insertionSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.insertionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 4, 6, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void insertionSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.insertionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void insertionSortExceptionTest() throws ArrayException {
        service.insertionSort(null);
    }

    @Test
    public void reverseInsertionSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseInsertionSort(actualArray);
            int[] numbersExpected = {7, 6, 4, 4, 3, 2, 1};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void reverseInsertionSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseInsertionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void reverseInsertionSortExceptionTest() throws ArrayException {
        service.reverseInsertionSort(null);
    }

    @Test
    public void selectionSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.selectionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 4, 6, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void selectionSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.selectionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void selectionSortExceptionTest() throws ArrayException {
        service.selectionSort(null);
    }

    @Test
    public void reverseSelectionSortPositiveTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseSelectionSort(actualArray);
            int[] numbersExpected = {7, 6, 4, 4, 3, 2, 1};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test
    public void reverseSelectionSortNegativeTest() {
        int[] numbersActual = {4, 6, 4, 3, 1, 7, 2};
        try {
            CustomArray actualArray = new CustomArray(numbersActual);
            service.reverseSelectionSort(actualArray);
            int[] numbersExpected = {1, 2, 3, 4, 6, 4, 7};
            CustomArray expectedArray = new CustomArray(numbersExpected);
            assertNotEquals(actualArray, expectedArray, "fail test");
        } catch (ArrayException e) {
            fail();
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void reverseSelectionSortExceptionTest() throws ArrayException {
        service.reverseSelectionSort(null);
    }
}
