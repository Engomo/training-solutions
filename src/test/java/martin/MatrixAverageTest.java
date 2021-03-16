package martin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAverageTest {

    MatrixAverage matrixAverage = new MatrixAverage();

    @Test
    void matrixMaxAverageByRow() {
        assertEquals(20.86, matrixAverage.matrixMaxAverageByRow(TestData.MATRIX));
    }
}