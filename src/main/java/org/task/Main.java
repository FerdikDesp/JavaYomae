package org.task;

public class Main {
    public static void main(String[] args) {
        Matrix test1_matrix1 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix test1_matrix2 = new Matrix(new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});

        System.out.println(test1_matrix1.toString());
        System.out.println(test1_matrix2.toString());

        Matrix test1_matrixTotal = MatrixMath.sum(test1_matrix1, test1_matrix2);

        System.out.println(test1_matrixTotal.toString());
    }
}