package com.doit421.designpattern.observer;

/**
 * Created by czb on 2014/7/27.
 * 主题接口
 */
public interface Subject {
    public void registerObserver(Observer o);//注册观察者
    public void removeObserver(Observer o);//移除观察者
    public void notifyObservers();//主题状态更新时，通知所有观察者
}
