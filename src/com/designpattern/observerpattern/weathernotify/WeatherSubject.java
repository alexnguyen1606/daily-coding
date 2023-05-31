package com.designpattern.observerpattern.weathernotify;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:11 PM ,January 11,2021
 */
public class WeatherSubject implements Subjects {

    private Integer temperature;
    private Integer humidity;
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }


    public void setMeasurements(Integer temperature, Integer humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }

    public void measurementChanged() {
        notifyObservers();
    }

}
