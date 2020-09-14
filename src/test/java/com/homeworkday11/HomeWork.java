package com.homeworkday11;

import org.testng.annotations.*;

public class HomeWork {
    //1、用代码说明 @BeforeSuite  @BeforeTest @BeforeClass @BeforeMethod 执行顺序
    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("com.homeworkday11.HomeWork.BeforeSuite");

    }//
    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("com.homeworkday11.HomeWork.BeforeTest");

    }
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("com.homeworkday11.HomeWork.BeforeClass");

    }
    @Test
    public void f1()
    {

        System.out.println("com.homeworkday11.HomeWork.f1.Test");
    }
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("com.homeworkday11.HomeWork.BeforeMethod");

    }

}
