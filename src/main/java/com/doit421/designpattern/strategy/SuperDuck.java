package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 超级鸭子，继承于鸭子抽象类
 */
public class SuperDuck extends Duck {
    public SuperDuck(){
        this.fly=new FlyWithWings();
        this.quack=new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是超级鸭子");
    }
}
