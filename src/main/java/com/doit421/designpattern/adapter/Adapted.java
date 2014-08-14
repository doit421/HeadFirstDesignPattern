package com.doit421.designpattern.adapter;

/**
 * Created by czb on 2014/8/11.
 * 被适配者
 */
public class Adapted implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("我是被适配者");
    }
}
