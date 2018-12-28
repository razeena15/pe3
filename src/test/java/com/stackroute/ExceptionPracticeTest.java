package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionPracticeTest {


    ExceptionPractice exceptionPractice = null;
    @Before
    public void setUp() throws Exception {
        exceptionPractice = new ExceptionPractice();
    }

    @After
    public void tearDown() throws Exception {
        exceptionPractice = null;
    }

  /*  @Test
    public void testMain1(){
        String msg = "Exception caught";
        assertEquals(msg,exceptionPractice.main());
    }*/


    @Test
    public void testMain1(){
        //act
        String expected = "executed finally block";
        //arrange
        String result = exceptionPractice.main();
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testMain2(){
        //act
        String expected = "i am in a finally";
        //arrange
        String result = exceptionPractice.main();
        //assert
        assertEquals(expected,result);
    }

}