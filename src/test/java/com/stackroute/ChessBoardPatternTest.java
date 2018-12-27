package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    //Test case 1:- count the number of columns,it's always 8,less than or greater than 8 is an error
    public void TestCase1()
    {
        assertEquals("Number of Columns is 8",ChessBoardPattern.CountColumns(7));
    }

    @Test
    //Test case 2:- count the number of rows,it's always 8,less than or greater than 8 is an error
    public void TestCase2()
    {
        assertEquals("Number of Rows is 8",ChessBoardPattern.CountRows(6));
    }

    @Test
    //Test case 3:- Check the first cell of the matrix,i.e it is always "WW".
    public void TestCase3()
    {
        assertEquals("Number of Rows is 8",ChessBoardPattern.CheckFirstCell("BW"));
    }
}