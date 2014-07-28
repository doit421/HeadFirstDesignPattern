package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 奶泡，装饰者
 */
public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，奶泡";
    }

    @Override
    public double cost() {
        return beverage.cost()+2;
    }
}
