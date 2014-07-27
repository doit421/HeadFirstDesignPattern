package com.doit421.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by czb on 2014/7/27.
 * 气象站主题，实现主题接口
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;//记录所有观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);//添加观察者
    }

    @Override
    public void removeObserver(Observer o) {
        //移除观察者
        int i=observers.indexOf(o);
        if(i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        //通知所有观察者
        for(Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    //更新数据，通知观察者
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
