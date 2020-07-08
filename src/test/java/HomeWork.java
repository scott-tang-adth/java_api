import org.testng.annotations.*;

public class HomeWork {
    //1、用代码说明 @BeforeSuite  @BeforeTest @BeforeClass @BeforeMethod 执行顺序
    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("HomeWork.BeforeSuite");

    }//
    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("HomeWork.BeforeTest");

    }
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("HomeWork.BeforeClass");

    }
    @Test
    public void f1()
    {

        System.out.println("HomeWork.f1.Test");
    }
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("HomeWork.BeforeMethod");

    }


}
