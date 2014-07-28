package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(){
        this.description="浓缩咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
