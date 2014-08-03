package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 芝加哥奶酪披萨，继承于披萨抽象类
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name="芝加哥奶酪披萨";
        dough="厚饼";
        sauce="小番茄酱";
        toppings.add("意大利白干酪");
    }

    void cut(){
        System.out.println("切片，切成方片");
    }
}
