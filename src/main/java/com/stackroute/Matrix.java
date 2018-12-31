package com.stackroute;

public class Matrix {

    public int[][] sumOfMatrix(int a[][], int b[][],int row,int col) {
        int c[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                c[i][j] = a[i][j] + b[i][j];    //use - for subtraction
                System.out.print(c[i][j] + " ");
            }
        }
        return c;
    }
}

