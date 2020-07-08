package com.lemon;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Testng 提供了日志功能：记录测试程序的执行步骤和测试出错时的异常信息
public class TestngReporter {

    @Test
    public void OpenBrowser()
    {
        System.out.println("TestngReporter.OpenBrowser方法被调用");
        Reporter.log("调用打开浏览器的方法");
    }
    @Test
    public void SingIn()
    {
        System.out.println("TestngReporter.SingIn被调用");
        Reporter.log("调用登录方法");
    }
    @Test
    public void LogOut()
    {
        System.out.println("TestngReporter.LogOut被调用");
        Reporter.log("调用注销方法");
    }
}

