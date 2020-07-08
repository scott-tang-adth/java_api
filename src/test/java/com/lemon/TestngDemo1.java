package com.lemon;

import org.testng.annotations.*;

public class TestngDemo1 {

        @BeforeSuite
        public void beforesuite() {
            System.out.println("TestngDemo1-beforesuite");
        }
        @AfterSuite
        public void aftersuite() {
            System.out.println("TestngDemo1-aftersuite");
        }

        @BeforeTest
        public void beforetest() {
            System.out.println("TestngDemo1-beforeTest");
        }
        @AfterTest
        public void AfterTest() {
            System.out.println("TestngDemo1-aftertest");
        }

        @BeforeClass
        public void beforeclass() {
            System.out.println("TestngDemo1-beforeclass's ");
        }

        @AfterClass
        public void aftertclass() {
            System.out.println("TestngDemo1-afterclass's TestNG2");
        }

        @BeforeMethod
        public void beforemethod() {
            System.out.println("TestngDemo1-TestNG2's beforemethod");
        }

        @AfterMethod
        public void aftertmethod() {
            System.out.println("TestngDemo1-TestNG2's aftermethod");
        }

        @BeforeGroups
        public void beforegroups() {
            System.out.println("TestngDemo1-s beforegroups");
        }

        @AfterGroups
        public void aftergroups() {
            System.out.println("TestngDemo1-TestNG2's aftergroups");
        }

        @Test
        public void test1() {
            System.out.println("TestngDemo1-TestNG2's testt1");
        }

        @Test(groups="gr")
        public void test2() {
            System.out.println("TestngDemo1Test(groups=\"gr testt2");
        }

        public void ff() {
            System.out.println("TestngDemo1--nothing");
        }
    }

