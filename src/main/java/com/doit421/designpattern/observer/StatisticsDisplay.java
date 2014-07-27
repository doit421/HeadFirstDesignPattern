package com.doit421.designpattern.observer;

/**
 * Created by czb on 2014/7/27.
 * 观察者，显示天气统计信息
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private Subject weatherData;
    private float maxTemp = 0;
    private float minTemp = 50;
    private float sumTemp = 0;
    private int num = 0;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("最高/最低/平均 温度" + maxTemp + "/" + minTemp + "/" + sumTemp / num);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        num++;
        sumTemp += temp;
        if (temp > this.maxTemp) {
            maxTemp = temp;
        }
        if (temp <= minTemp) {
            minTemp = temp;
        }
        display();
    }
}
