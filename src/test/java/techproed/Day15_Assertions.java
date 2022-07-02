package techproed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day15_Assertions {

    @Test
    public void hardAssert(){
//        When an assertion fails, then that test case stops execution
//        And rest of the test case will not execute
        System.out.println("Line 11");//runs
        System.out.println("Line 12");//runs
        Assert.assertEquals(3,4);//runs. FAILS AND STOPS EXECUTION THE REST OF THE CODE IN THIS TEST CASE
        System.out.println("Line 15");//no runs
        Assert.assertEquals("apple","samsung");//no
        System.out.println("Line 16");//no runs

    }

    @Test
    public void testCase(){
        System.out.println("line 23");//runs
        System.out.println("line 24");//runs
    }


    //By default, all methods are independent
    //We can make the methods dependent using dependsOnMethods
    //What is the connection between,
    @Test(dependsOnMethods = "hardAssert")
    public void dependentMethodDemo(){
        System.out.println("line 29");//runs
        System.out.println("line 30");//runs
    }

    @Test
    public void softAssert(){

    }
}