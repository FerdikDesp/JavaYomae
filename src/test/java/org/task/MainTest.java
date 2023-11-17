package org.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMatrixSum1() {
        Assertions.assertTrue(MatrixData.TestSum1.MatrixTotal.equals(MatrixMath.sum(MatrixData.TestSum1.Matrix1, MatrixData.TestSum1.Matrix2)));
    }

    @Test
    public void testMatrixSum2() {
        Assertions.assertTrue(MatrixData.TestSum2.MatrixTotal.equals(MatrixMath.sum(MatrixData.TestSum2.Matrix1, MatrixData.TestSum2.Matrix2)));
    }

    @Test
    public void testMatrixMulti1() {
        Assertions.assertTrue(MatrixData.TestMulti1.MatrixTotal.equals(MatrixMath.multi(MatrixData.TestMulti1.Matrix1, MatrixData.TestMulti1.Matrix2)));
    }

    @Test
    public void testMatrixMulti2() {
        Assertions.assertTrue(MatrixData.TestMulti2.MatrixTotal.equals(MatrixMath.multi(MatrixData.TestMulti2.Matrix1, MatrixData.TestMulti2.Matrix2)));
    }

    @Test
    public void testMatrixPower1() {
        Assertions.assertTrue(MatrixData.TestPower1.MatrixTotal.equals(MatrixMath.multi(MatrixData.TestPower1.Matrix1, MatrixData.TestPower1.Matrix1)));
    }

    @Test
    public void testMatrixPower2() {
        Assertions.assertTrue(MatrixData.TestPower2.MatrixTotal.equals(MatrixMath.multi(MatrixData.TestPower2.Matrix1, MatrixData.TestPower2.Matrix1)));
    }

}
