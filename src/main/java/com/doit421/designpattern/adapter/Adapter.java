package com.doit421.designpattern.adapter;

/**
 * Created by czb on 2014/8/11.
 * 适配器，把客户期望的Target接口转换为被适配者Adaptee的实现
 */
public class Adapter implements Target {
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
