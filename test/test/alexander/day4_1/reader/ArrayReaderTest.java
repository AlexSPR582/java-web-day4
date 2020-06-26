package test.alexander.day4_1.reader;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import com.alexander.day4_1.exception.ArrayException;
import com.alexander.day4_1.reader.ArrayReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayReaderTest {
    private ArrayReader reader;

    @BeforeClass
    public void setUp() {
        reader = new ArrayReader();
    }

    @Test
    public void readPositiveTest() {
        String fileName = "resourse/array.txt";
        try {
            String strArr = reader.readFromFile(fileName);
            String expected = "1 3 4 5 6 7 8";
            assertEquals(strArr, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void readFileNotExistTest() {
        String fileName = "data/array.txt";
        try {
            String strArr = reader.readFromFile(fileName);
            String expected = "1 3 4 5 6 7 8";
            assertEquals(strArr, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test
    public void readNegativeTest() {
        String fileName = "resourse/array.txt";
        try {
            String strArr = reader.readFromFile(fileName);
            String expected = "1 3 4 9 6 7 8";
            assertNotEquals(strArr, expected, "fail test");
        } catch (ArrayException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ArrayException.class)
    public void readExceptionTest() throws ArrayException {
        reader.readFromFile(null);
    }
}
