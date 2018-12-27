import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionDemoTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    //Test case1 to check the NegativeArraySizeException
    public void TestCase1()
    {
        assertEquals("Negative Array size Exception generated",ExceptionDemo.CheckNegativeArray());
    }

    @Test
    //Test case2 to check the IndexOutOfBoundException
    public void TestCase2()
    {
        assertEquals("ArrayIndexOutOfBounds Exception generated",ExceptionDemo.CheckIndexOutOfBounds());
    }

    @Test
    //Test case3 to check the NullPointerException
    public void TestCase3()
    {
        assertEquals("Null Pointer Exception Generated",ExceptionDemo.CheckNullPointer());
    }
    /*
    In this case I created one java file,named ExceptionDemo.java, but you can created any other java file,to call the implemented methods.
     */
}