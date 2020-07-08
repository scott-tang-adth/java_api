package com.lemon;

import org.testng.annotations.Test;

public class SequenceTest {

    @Test(priority = 2)
    public void test3()
    {
        System.out.println("SequenceTest.test3被调用");
    }
    @Test(priority = 0)
    public void test1()
    {
        System.out.println("SequenceTest.test1被调用");
    }
    @Test(priority = 1,enabled = false)
    public void test2()
    {
        System.out.println("SequenceTest.test2被调用");
    }
}
