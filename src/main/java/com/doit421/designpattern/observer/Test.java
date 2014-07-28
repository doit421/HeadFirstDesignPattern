package com.doit421.designpattern.observer;

/**
 * Created by czb on 2014/7/27.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        Observer current=new CurrentConditionsDisplay(weatherData);
        Observer statistics=new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(26,65,30.4f);
        weatherData.setMeasurements(22,65,30.4f);
        weatherData.setMeasurements(22,65,30.4f);
    }
}
