package test.alexander.day4_1.validator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.alexander.day4_1.validator.ArrayValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private ArrayValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new ArrayValidator();
    }

    @Test
    public void arrayValidationPositiveTest() {
        boolean condition = validator.arrayValidation(5);
        assertTrue(condition);
    }

    @Test
    public void arrayValidationNegativeTest() {
        boolean condition = validator.arrayValidation(-5);
        assertFalse(condition);
    }
}
