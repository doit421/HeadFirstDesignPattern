package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 纽约奶酪披萨，继承于披萨类
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name="纽约奶酪披萨";
        dough="薄饼";
        sauce="大蒜番茄酱";
        toppings.add("意大利高级干酪");
    }
}
