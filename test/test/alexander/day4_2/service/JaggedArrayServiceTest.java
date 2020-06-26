package test.alexander.day4_2.service;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import com.alexander.day4_2.exception.ProgramException;
import com.alexander.day4_2.service.JaggedArraySortService;
import com.alexander.day4_2.type.SortType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JaggedArrayServiceTest {
    private JaggedArraySortService service;

    @BeforeClass
    public void setUp() {
        service = new JaggedArraySortService();
    }

    @Test (expectedExceptions = ProgramException.class)
    public void sortExceptionTest() throws ProgramException {
        service.sort(null, null);
    }

    @Test
    public void bubbleSortRowSumPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 7},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {4, 8, 3},
                {5, 6, 3, 2, 7}
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_ROW_SUM);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortRowSumNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 7},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {5, 6, 3, 2, 7},
                {4, 8, 3},
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_ROW_SUM);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortMaxElementInRowPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {4, 8, 3},
                {5, 6, 3, 2, 11}
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_MAX_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortMaxElementInRowNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {5, 6, 3, 2, 11},
                {4, 8, 3},
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_MAX_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortMinElementInRowPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 3},
                {4, 8, 1}
        };
        int[][] sortMatrix = {
                {4, 8, 1},
                {5, 6, 3, 2, 11},
                {7, 3},
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_MIN_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortMinElementInRowNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 3},
                {4, 8, 1}
        };
        int[][] sortMatrix = {
                {7, 3},
                {4, 8, 1},
                {5, 6, 3, 2, 11}
        };
        try {
            service.sort(matrix, SortType.BUBBLE_SORT_MIN_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test (expectedExceptions = ProgramException.class)
    public void sortReverseExceptionTest() throws ProgramException {
        service.sort(null, null);
    }

    @Test
    public void bubbleSortReverseRowSumPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 7},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {5, 6, 3, 2, 7},
                {4, 8, 3},
                {7, 2}
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_ROW_SUM);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortReverseRowSumNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 7},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {5, 6, 3, 2, 7},
                {4, 8, 3},
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_ROW_SUM);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortReverseMaxElementInRowPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {5, 6, 3, 2, 11},
                {4, 8, 3},
                {7, 2}
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_MAX_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortReverseMaxElementInRowNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 2},
                {4, 8, 3}
        };
        int[][] sortMatrix = {
                {7, 2},
                {5, 6, 3, 2, 11},
                {4, 8, 3},
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_MAX_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortReverseMinElementInRowPositiveTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 3},
                {4, 8, 1}
        };
        int[][] sortMatrix = {
                {7, 3},
                {5, 6, 3, 2, 11},
                {4, 8, 1},
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_MIN_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertTrue(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    @Test
    public void bubbleSortReverseMinElementInRowNegativeTest() {
        int[][] matrix = {
                {5, 6, 3, 2, 11},
                {7, 3},
                {4, 8, 1}
        };
        int[][] sortMatrix = {
                {7, 3},
                {4, 8, 1},
                {5, 6, 3, 2, 11}
        };
        try {
            service.sortReverse(matrix, SortType.BUBBLE_SORT_MIN_ELEMENT_IN_ROW);
            boolean condition = isMatrixEquals(matrix, sortMatrix);
            assertFalse(condition, "fail test");
        } catch (ProgramException e) {
            fail("fail test");
        }
    }

    private boolean isMatrixEquals(int[][] matrix1, int[][] matrix2) {
        boolean isEquals = true;
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i].length != matrix2[i].length) {
                    isEquals = false;
                } else {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        if (matrix1[i][j] != matrix2[i][j]) {
                            isEquals = false;
                        }
                    }
                }
            }
        } else {
            isEquals = false;
        }
        return isEquals;
    }
}
