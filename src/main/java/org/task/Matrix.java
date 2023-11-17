package org.task;

import java.util.Arrays;

public class Matrix {

    private int[][] matrixArray;
    private int row;
    private int column;

    public int[][] getMatrixArray() {
        return matrixArray;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Matrix(int row, int column) {
        this.matrixArray = new int[row][column];
        this.row = row;
        this.column = column;
        this.init();
    }

    public Matrix(int[][] matrixArray) {
        this.matrixArray = matrixArray;
        this.row = matrixArray.length;
        this.column = matrixArray[0].length;
    }

    public void init() {
        for (int i = 0; i < this.matrixArray.length; i++) {
            Arrays.fill(this.matrixArray[i], 0);
        }
    }

    public int getCell(int row, int column) {
        return this.matrixArray[row][column];
    }

    public void editCell(int row, int column, int value) {
        this.matrixArray[row][column] = value;
    }

    public boolean equals(Matrix matrixToEqual) {
        if (this.getRow() != matrixToEqual.getRow() || this.getColumn() != matrixToEqual.getColumn()) {
            return false;
        }
        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].length; j++) {
                if (this.getCell(i, j) != matrixToEqual.getCell(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
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