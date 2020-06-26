package test.alexander.day4_1.service;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.alexander.day4_1.service.NumberService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NumberServiceTest {
    private NumberService service;

    @BeforeClass
    public void setUp() {
        service = new NumberService();
    }

    @Test
    public void isSimpleNumberPositiveTest() {
        boolean condition = service.isSimpleNumber(5);
        assertTrue(condition, "fail test");
    }

    @Test
    public void isSimpleNumberNegativeTest() {
        boolean condition = service.isSimpleNumber(6);
        assertFalse(condition, "fail test");
    }

    @Test
    public void isFibonacciNumberPositiveTest() {
        boolean condition = service.isFibonacciNumber(5);
        assertTrue(condition, "fail test");
    }

    @Test
    public void isFibonacciNumberNegativeTest() {
        boolean condition = service.isFibonacciNumber(6);
        assertFalse(condition, "fail test");
    }

    @Test
    public void isDifferentNumeralsPositiveTest() {
        boolean condition = service.isDifferentNumerals(123);
        assertTrue(condition, "fail test");
    }

    @Test
    public void isDifferentNumeralsNegativeTest() {
        boolean condition = service.isDifferentNumerals(122);
        assertFalse(condition, "fail test");
    }

    @Test
    public void amountNumeralsPositiveTest() {
        int actual = service.amountNumerals(456);
        int expected = 3;
        assertEquals(actual, expected, "fail test");
    }

    @Test
    public void amountNumeralsNegativeTest() {
        int actual = service.amountNumerals(456);
        int expected = 2;
        assertNotEquals(actual, expected, "fail test");
    }
}
