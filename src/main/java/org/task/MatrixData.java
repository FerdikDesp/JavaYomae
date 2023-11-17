package org.task;

public class MatrixData {

    public class TestSum1 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        public static Matrix Matrix2 = new Matrix(new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{10, 10, 10}, {10, 10, 10}, {10, 10, 10}});
    }

    public class TestSum2 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{3, -5}, {7, 1}, {-4, 6}});
        public static Matrix Matrix2 = new Matrix(new int[][]{{-2, 5}, {10, -5}, {8, -3}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{1, 0}, {17, -4}, {4, 3}});
    }

    public class TestMulti1 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        public static Matrix Matrix2 = new Matrix(new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{30, 24, 18}, {84, 69, 54}, {138, 114, 90}});
    }

    public class TestMulti2 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{3, -5}, {7, 1}});
        public static Matrix Matrix2 = new Matrix(new int[][]{{-2, 5}, {10, -5}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{-56, 40}, {-4, 30}});
    }

    public class TestPower1 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{30, 36, 42}, {66, 81, 96}, {102, 126, 150}});
    }

    public class TestPower2 {
        public static Matrix Matrix1 = new Matrix(new int[][]{{3, -5}, {7, 1}});
        public static Matrix MatrixTotal = new Matrix(new int[][]{{-26, -20}, {28, -34}});
    }
}
