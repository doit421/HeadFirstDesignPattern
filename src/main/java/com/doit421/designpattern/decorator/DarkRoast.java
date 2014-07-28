package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="深焙咖啡";
    }

    @Override
    public double cost() {
        return 12;
    }
}
