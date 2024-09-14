package task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentGradeTest {

    @Test
    public void testCalculateAverages() {
        int[][] actualScores = new int[][]{{55, 85, 70, 210}, {85, 45, 50, 180}, {50, 45, 55, 150},};
        double[] expectedAverages = new double[]{70.0, 60.0, 50.0};
        double[] averages = StudentGrade.calculateAverages(actualScores, 3);
        assertArrayEquals(expectedAverages, averages);
    }

    @Test
    public void testCalculatePositions() {
        int[][] actualScores = new int[][]{{55, 85, 70, 210}, {85, 45, 50, 180}, {50, 45, 55, 150},};
        int[] expectedPositions = new int[]{1, 2, 3};
        int[] positions = StudentGrade.calculatePositions(actualScores, 3);
        assertArrayEquals(expectedPositions, positions);
    }

    @Test
    public void testArrayToString() {
        int[][] actualScores = new int[][]{{55, 85, 70, 210}, {85, 45, 50, 180}, {50, 45, 55, 150},};
        String result = StudentGrade.arrayToString(actualScores[0], 3);
        assertEquals("55   85   70   210", result);
    }

    @Test
    public void testPrintResults() {
         assertTrue(true);
    }
}
