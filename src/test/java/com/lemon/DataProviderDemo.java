package com.lemon;

//用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviderDemo {

    //方法1 将方法里的四个参数封装成register类的对象

    @Test(dataProvider = "datas1")//注意datas和 public Object[] datas()中的必须一致

    public void register(register user)
    {

        System.out.println("user = " + user);
    }
    @DataProvider

    public Object[] datas1() {

        Object[]datas=new Object[5];
        datas[0]=new register("scott","123456","adth","男");
        datas[1]=new register("tiger","123456","adth","男");
        datas[2]=new register("dog","123456","adth","男");
        datas[3]=new register("sha","123456","adth","男");
        datas[4]=new register("shan","123456","adth","男");
        return datas;
    }
    //方法二 不封装类直接用二维数组
    @Test(dataProvider = "datas2")

    public void register(String username,String password,String type,String sex)
    {
        System.out.println("username = " + username + ", password = " + password + ", type = " + type + ", sex = " + sex);
    }
    @DataProvider
    public Object[][]datas2()
    {
        //也可以用数组的动态定义  Object[][]datas2=new[次数][register方法的参数个数];
        Object[][]datas2={{"第一次name","第一次password","第一次type","第一次 sex"},{"第二次name","第二次password","第二次type","第二次 sex"},
                {"第三次name","第三次password","第三次type","第三次 sex"},{"第四次name","第四次password","第四次type","第四次 sex"},
                {"第五次name","第五次password","第五次type","第五次 sex"}};
        return datas2;
    }
}
