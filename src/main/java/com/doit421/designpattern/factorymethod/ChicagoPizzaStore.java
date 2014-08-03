package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 芝加哥披萨商店，继承于披萨商店抽象类
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        if(type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
