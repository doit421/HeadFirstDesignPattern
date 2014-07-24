package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 使用翅膀飞行，实现飞行接口
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用翅膀飞行");
    }
}
