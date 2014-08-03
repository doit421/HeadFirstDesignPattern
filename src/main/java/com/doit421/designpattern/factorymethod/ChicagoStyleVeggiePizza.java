package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 芝加哥素披萨，继承于披萨抽象类
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name="芝加哥素披萨";
        dough="厚饼";
        sauce="小番茄酱";
        toppings.add("意大利白干酪");
    }
}
