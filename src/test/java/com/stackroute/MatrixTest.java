package com.stackroute;

import org.junit.Test;


import static org.junit.Assert.*;

public class MatrixTest {

    Matrix m=new Matrix();

    @Test
    public void sumOfMatrix()
    {
        int[][] result = m.sumOfMatrix(new int[][]{{1, 2},{3,4},{ 5, 6}}, new int[][]{{9, 8},{ 7,6},{ 5, 4}});
        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},result);
    }
    @Test
    public void sumOfMatrix2()
    {
        int[][] result = m.sumOfMatrix(new int[][]{{1, 2},{3,4},{ 5, 6}}, new int[][]{{9, 8},{ 7,6},{ 5, 4}});
        assertArrayEquals(new int[][]{{10,10},{8,10},{7,10}},result);
    }

}
