package org.task;

import java.util.Arrays;

public class Matrix {

    private int[][] matrixArray;
    private int row;
    private int column;
    private int error;

    public int[][] getMatrixArray() {
        return matrixArray;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public Matrix(int row, int column) {
        this.matrixArray = new int[row][column];
        for (int i = 0; i < this.matrixArray.length; i++) {
            Arrays.fill(this.matrixArray[i], 0);
        }
        this.row = row;
        this.column = column;
        this.error = -1;
    }

    public Matrix(int[][] matrixArray) {
        this.matrixArray = matrixArray;
        this.row = matrixArray.length;
        this.column = matrixArray[0].length;
        this.error = -1;
    }

    public int getCell(int row, int column) {
        return this.matrixArray[row][column];
    }

    public void editCell(int row, int column, int value) {
        this.matrixArray[row][column] = value;
    }

    /*public void print() {
        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].length; j++) {
                System.out.print(this.matrixArray[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }*/

    public String toString() {
        if (this.error != -1) {
            return MatrixErrors.getErrorByID(this.error).toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].length; j++) {
                sb.append(this.matrixArray[i][j]);
                if (j != this.matrixArray[i].length - 1) {
                    sb.append(" ");
                }
            }
            if (i != this.matrixArray.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}