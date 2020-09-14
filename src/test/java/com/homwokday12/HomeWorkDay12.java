package com.homwokday12;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author by Scott.Tang
 * @Description ADTH
 * @date 2020/9/7.
 * @Copyright 精宇（上海）电子科技有限公司。 All rights reserved
 */
public class HomeWorkDay12 {


    //1、使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
        @Test(dataProvider = "datas")
        public  void register(User user){

            System.out.println(user);

        }
        @DataProvider
       public Object []datas(){

            //将user对象放入datas数组保存

            //Object [][]datas=new Object[5][4];//麻痹了
                Object[]datas=new Object[5];
                datas[0]=new User("scott","123456","adth","男");
                datas[1]=new  User("tiger","123456","adth","男");
                datas[2]=new  User("dog","123456","adth","男");
                datas[3]=new  User("sha","123456","adth","男");
                datas[4]=new  User("shan","123456","adth","男");
                return datas;
            }


    //方法二 不封装类直接用二维数组
    @Test(dataProvider = "datas2")

    public void register2(String username,String password,String type,String sex)
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

