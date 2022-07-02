package techproed;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day15_Annotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Mrethod");
    }
    @Test
    public void ztest1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("Test 3");
    }
    @Test @Ignore
    public void test4(){
        System.out.println("Test 4");
    }
    @Test(priority = 3)
    public void atest5(){
        System.out.println("Test 5");
    }

    //test(piority = 0)
    @Test
    public void test6(){
        System.out.println("Test 6");
    }

    //@Test(priority = 0)
    @Test
    public void test7(){
        System.out.println("Test 7");
    }
}
