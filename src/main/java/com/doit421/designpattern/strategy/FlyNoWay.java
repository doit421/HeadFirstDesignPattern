package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 不会飞，实现飞行接口
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
