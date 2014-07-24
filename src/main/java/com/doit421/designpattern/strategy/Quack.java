package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 呱呱叫，实现叫的接口
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱");
    }
}
