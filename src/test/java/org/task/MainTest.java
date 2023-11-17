package org.task;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testMatrixSum1() {
        //assertEquals(Main.sum1().toString(), "8 10 12\n5 7 9\n11 13 15");
        assertTrue(MatrixData.test1MatrixTotal.equals(MatrixMath.sum(MatrixData.test1Matrix1, MatrixData.test1Matrix2)));
    }

}
