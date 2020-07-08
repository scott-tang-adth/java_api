package com.lemon;

import org.testng.annotations.Test;

public class DependentTest {

    @Test(dependsOnMethods = {"OpenBrowser"})

    public void SignIn()
    {

        System.out.println("DependentTest.SignIn被调用");
    }
    @Test
    public void OpenBrowser()
    {
        System.out.println("DependentTest.OpenBrowser被调用");

    }
    @Test(dependsOnMethods = {"SignIn"})
    public void LogOut()
    {

        System.out.println("DependentTest.LogOut被调用");
    }
}
