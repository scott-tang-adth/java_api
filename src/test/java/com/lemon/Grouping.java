package com.lemon;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"人"})
    public void student()
    {
        System.out.println("Grouping.student被调用");
    }
    @Test(groups = {"人"})
    public void teacher()
    {
        System.out.println("Grouping.teacher被调用");
    }
    @Test(groups = {"动物"})
    public void cat()
    {
        System.out.println("Grouping.cat被调用");
    }
    @Test(groups = {"动物"})
    public void dog()
    {
        System.out.println("Grouping.dog被调用");
    }
    @Test(groups = {"动物","人"})
    public void feeder()
    {
        System.out.println("Grouping.feeder被调用");
    }
}
