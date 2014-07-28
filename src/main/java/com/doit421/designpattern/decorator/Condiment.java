package com.doit421.designpattern.decorator;

/**
 * Created by czb on 2014/7/28.
 * 调料抽象类，装饰者，必须要能够替代Beverage，所以扩展饮料类
 */
public abstract class Condiment extends Beverage {
    public abstract String getDescription();
}
