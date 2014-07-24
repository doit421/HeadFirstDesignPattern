package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 鸭子抽象类
 */
public abstract class Duck {
    FlyBehavior fly;
    QuackBehavior quack;

    public abstract void display();

    public void performFly() {
        fly.fly();
    }

    public void performQuack() {
        quack.quack();
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }
}
