package org.task;

public class MatrixMath {

    public static Matrix sum(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getRow(), matrix2.getColumn());
        if (matrix1.getRow() != matrix2.getRow() || matrix1.getColumn() != matrix2.getColumn()) {
            return resultMatrix;
        }
        for (int i = 0; i < resultMatrix.getRow(); i++) {
            for (int j = 0; j < resultMatrix.getColumn(); j++) {
                resultMatrix.editCell(i, j, matrix1.getCell(i, j) + matrix2.getCell(i, j));
            }
        }

        return resultMatrix;
    }

    public static Matrix multi(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getRow(), matrix2.getColumn());
        if (matrix1.getColumn() != matrix2.getRow()) {
            return resultMatrix;
        }
        for (int i = 0; i < resultMatrix.getRow(); i++) {
            for (int j = 0; j < resultMatrix.getColumn(); j++) {
                int resultCell = 0;
                for (int k = 0; k < matrix1.getMatrixArray()[0].length; k++) {
                    resultCell += (matrix1.getCell(i, k) * matrix2.getCell(k, j));
                }
                resultMatrix.editCell(i, j, resultCell);
            }
        }
        return resultMatrix;
    }

}
