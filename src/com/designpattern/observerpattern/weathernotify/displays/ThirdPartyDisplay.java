package com.designpattern.observerpattern.weathernotify.displays;

import com.designpattern.observerpattern.weathernotify.Observer;
import com.designpattern.observerpattern.weathernotify.Subjects;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:16 PM ,January 11,2021
 */
public class ThirdPartyDisplay implements Observer, ElementDisplay {
    private Integer temperature;
    private Integer humidity;
    private final Subjects weatherSubject;
    
    public ThirdPartyDisplay(Subjects weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Third party display ");
        System.out.println("Temp: "+temperature+" --- Humidity:"+humidity);
        System.out.println("--------");
    }
    
    @Override
    public void update(Integer temp, Integer humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void disconnect() {
        weatherSubject.removerObserver(this);
    }

}
