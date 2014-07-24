package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 模型呀，继承于鸭子超类
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        this.fly=new FlyNoWay();
        this.quack=new Squeak();
    }
    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
