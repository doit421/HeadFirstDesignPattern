package com.doit421.designpattern.adapter;

/**
 * Created by czb on 2014/8/11.
 */
public class Test {
    public static void main(String[] args) {
        Adaptee adaptee=new Adapted();
        Target target=new Adapter(adaptee);
        target.request();
    }
}
