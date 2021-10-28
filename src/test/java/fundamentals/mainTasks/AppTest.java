package fundamentals.mainTasks;

import fundamentals.optionalTask2.Matrix;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldSumElementsTreeMatrix() {
        int[][] inputMatrix = {
                {0, -1, 4},
                {-1, 4, -4},
                {0, -1, -1}};
        int expectedResult = -1;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSumElements5Matrix() {
        int[][] inputMatrix = {
                {0, -1, 4, 3, 4},
                {-1, 4, -4, -1, -2},
                {0, -1, -1, -2, 0},
                {1, 9, -4, 8, 9}};
        int expectedResult = -9;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSumElements6Matrix() {
        int[][] inputMatrix = {
                {0, -1, 4, 5, 6, 7},
                {-1, 4, -4, 7, 8, 8},
                {0, -1, -1, 7, 6, 5}
        };
        int expectedResult = -7;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSumElements7Matrix() {
        int[][] inputMatrix = {
                {0, 0, 4, 5, 2, -1, 4},
                {-1, 2, 3, 4, 5, -4, -4},
                {0, -1, -1, -4, 5, -6, 7}
        };
        int expectedResult = -7;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSumElementsMatrixWithNull() {
        int[][] inputMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedResult = 0;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void shouldSumElementsMatrixEpam() {
        int[][] inputMatrix = {
                {5, -10, -3, -1, -3, -5, 4},
                {-1, -10, 4, 2, -4, 6, 3},
                {3, -6, 6, -8, 7, 5, 6},
                {3, -5, 2, 2, -2, -3, 4},
                {7, 1, 1, -5, 6, -8, 4},
                {7, 6, -10, -4, -9, 4, -1},
                {5, 7, -2, 5, -4, 2, 7}
        };
        int expectedResult = -67;
        int actualResult = Matrix.thirdSumElements(inputMatrix);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDeleteRowColumnWithMaxNumber() {
        int[][] inputMatrix =
                {{9, -6, -6, 4, -6, 6},
                        {-5, 2, -5, 4, -6, 2},
                        {-5, -2, -4, 1, -1, 0},
                        {-9, 7, 4, 4, -2, -7},
                        {8, -2, 5, -4, 4, -5},
                        {4, -9, 4, -9, -9, 8}};
        int[][] expectedMatrix =
                {{2, -5, 4, -6, 2},
                        {-2, -4, 1, -1, 0},
                        {7, 4, 4, -2, -7},
                        {-2, 5, -4, 4, -5},
                        {-9, 4, -9, -9, 8}};

        int[][] actualMatrix = Matrix.fourthDeleteRowColumnMatrix(inputMatrix);
        Assertions.assertArrayEquals(expectedMatrix, actualMatrix);
    }
}
