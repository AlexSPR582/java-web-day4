package test.alexander.day4_1.parcer;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.parser.ArrayParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayParserTest {
    private ArrayParser parser;

    @BeforeClass
    public void setUp() {
        parser = new ArrayParser();
    }

    @Test
    public void parsePositiveTest() {
        String numbers = "1 2 3 4 5 6 7";
        try {
            int[] actual = parser.parse(numbers);
            int[] expected = {1, 2, 3, 4, 5, 6, 7};
            assertEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void parseNegativeTest() {
        String numbers = "1 2 3 4 5 6 7";
        try {
            int[] actual = parser.parse(numbers);
            int[] expected = {1, 2, 3, 8, 5, 6, 7};
            assertNotEquals(actual, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void parseExceptionTest() throws ArrayException {
        String numbers = "1 2 3 d 5 t 7";
        parser.parse(numbers);
    }
}
