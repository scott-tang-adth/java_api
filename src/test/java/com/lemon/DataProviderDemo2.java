package com.lemon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {

    @Test(dataProvider = "datas2")

    public void register(String username,String password,String type,String sex)
    {
        System.out.println("username = " + username + ", password = " + password + ", type = " + type + ", sex = " + sex);
    }
    @DataProvider
    public Object[][]datas2()
    {

        Object[][]datas2={{"第一次name","第一次password","第一次type","第一次 sex"},{"第二次name","第二次password","第二次type","第二次 sex"},
                {"第三次name","第三次password","第三次type","第三次 sex"},{"第四次name","第四次password","第四次type","第四次 sex"},
                {"第五次name","第五次password","第五次type","第五次 sex"}};
        return datas2;
    }
}
