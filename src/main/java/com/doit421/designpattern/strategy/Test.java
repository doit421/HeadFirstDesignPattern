package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 */
public class Test {
    public static void main(String[] args) {
        Duck modelDuck =new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();


        Duck superDuck=new SuperDuck();
        superDuck.display();
        superDuck.performQuack();
        superDuck.performFly();
        System.out.println("装上火箭动力装置");
        superDuck.setFly(new FlyRocket());
        superDuck.performFly();
    }
}
