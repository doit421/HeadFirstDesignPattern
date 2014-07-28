package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 摩卡，装饰者
 */
public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost()+5;
    }
}
