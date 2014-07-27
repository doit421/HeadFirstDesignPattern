package com.doit421.designpattern.observer;

/**
 * Created by czb on 2014/7/27.
 * 观察者接口
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);//主题数据更新时，传递给观察者
}
