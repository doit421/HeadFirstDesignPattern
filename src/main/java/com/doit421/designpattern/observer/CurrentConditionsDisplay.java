package com.doit421.designpattern.observer;

/**
 * Created by czb on 2014/7/27.
 * 观察者，显示当天天气
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private Subject weatherData;
    private float temp;
    private float humidity;

    //构造器需要一个主题，用来向主题注册自己
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + this.temp + "，当前湿度：" + this.humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
