package com.doit421.designpattern.strategy;

/**
 * Created by czb on 2014/7/24.
 * 吱吱叫，实现叫接口
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱");
    }
}
