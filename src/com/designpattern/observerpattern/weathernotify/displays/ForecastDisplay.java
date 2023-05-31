package com.designpattern.observerpattern.weathernotify.displays;

import com.designpattern.observerpattern.weathernotify.Observer;
import com.designpattern.observerpattern.weathernotify.Subjects;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:15 PM ,January 11,2021
 */
public class ForecastDisplay implements Observer, ElementDisplay {
    private Integer temperature;
    private Integer humidity;
    private Subjects weatherSubject;
    
    public ForecastDisplay(Subjects weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Forecast display ");
        System.out.println("Temperature:"+temperature);
        System.out.println("Humidity:"+humidity);
        System.out.println("--------");
    }

    @Override
    public void update(Integer temp, Integer humidity) {
       this.humidity = humidity;
       this.temperature = temp;
       display();
    }

    @Override
    public void disconnect() {
        weatherSubject.removerObserver(this);
    }
}
