package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 饮料抽象类
 */
public abstract class Beverage {
    String description="饮料";
    public String getDescription(){
        return  description;
    }
    public abstract double cost();
}
