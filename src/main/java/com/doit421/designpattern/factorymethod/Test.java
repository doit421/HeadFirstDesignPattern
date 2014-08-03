package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        nyStore.orderPizza("pepperoni");

        PizzaStore chicagoStore=new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
    }
}
