package test.alexander.day4_1.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day4_1.entity.CustomArray;
import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.service.ArraySearchService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySearchServiceTest {
    private ArraySearchService service;

    @BeforeClass
    public void setUp() {
        service = new ArraySearchService();
    }

    @Test
    public void binarySearchPositiveTest() {
        int[] numbers = {1, 2, 3, 5, 8};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.binarySearch(2, array);
            int expected = 1;
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void binarySearchNegativeTest() {
        int[] numbers = {1, 2, 3, 5, 8};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.binarySearch(4, array);
            int expected = -1;
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void binarySearchExceptionTest() throws ArrayException {
        service.binarySearch(1, null);
    }

    @Test
    public void findMaxPositiveTest() {
        int[] numbers = {2, 6, 4, 8, 1};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.findMax(array);
            int expected = 8;
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void findMaxNegativeTest() {
        int[] numbers = {2, 6, 4, 8, 1};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.findMax(array);
            int expected = 20;
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void findMaxExceptionTest() throws ArrayException {
        service.findMax(null);
    }

    @Test
    public void findMinPositiveTest() {
        int[] numbers = {2, 6, 4, 8, 1};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.findMin(array);
            int expected = 1;
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void findMinNegativeTest() {
        int[] numbers = {2, 6, 4, 8, 1};
        try {
            CustomArray array = new CustomArray(numbers);
            int actual = service.findMin(array);
            int expected = 6;
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void findMinExceptionTest() throws ArrayException {
        service.findMax(null);
    }

    @Test
    public void findSimpleNumbersPositiveTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findSimpleNumbers(array);
            int[] expected = {1, 2, 3, 5, 7};
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void findSimpleNumbersNegativeTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findSimpleNumbers(array);
            int[] expected = {1, 2, 3, 6, 7};
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void findSimpleNumbersExceptionTest() throws ArrayException {
        service.findSimpleNumbers(null);
    }

    @Test
    public void findFibonacciNumbersPositiveTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findFibonacciNumbers(array);
            int[] expected = {1, 2, 3, 5};
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void findFibonacciNumbersNegativeTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findFibonacciNumbers(array);
            int[] expected = {1, 2, 3, 6};
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void findFibonacciNumbersExceptionTest() throws ArrayException {
        service.findFibonacciNumbers(null);
    }

    @Test
    public void findDifferentNumeralsPositiveTest() {
        int[] numbers = {145, 223, 356, 43, 578, 622, 711};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findDifferentNumerals(array);
            int[] expected = {145, 356, 578};
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void findDifferentNumeralsNegativeTest() {
        int[] numbers = {145, 223, 356, 43, 578, 622, 711};
        try {
            CustomArray array = new CustomArray(numbers);
            int[] actual = service.findDifferentNumerals(array);
            int[] expected = {145, 356, 43};
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void findDifferentNumeralsExceptionTest() throws ArrayException {
        service.findDifferentNumerals(null);
    }
}
