package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 */
public class Test {
    public static void main(String[] args) {
        Beverage espresso=new Espresso();
        espresso=new Mocha(espresso);
        System.out.println(espresso.getDescription()+"：￥"+espresso.cost());

        Beverage darkRoast=new DarkRoast();
        darkRoast=new Mocha(darkRoast);
        darkRoast=new Whip(darkRoast);
        System.out.println(darkRoast.getDescription()+"：￥"+darkRoast.cost());

    }
}
