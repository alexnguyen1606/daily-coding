package designpattern.observerpattern.weathernotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:11 PM ,January 11,2021
 */
public class WeatherSubject implements Subjects {
    
    private Integer temperature;
    private Integer humidity;
    private final List<Observer> observers = new ArrayList<>();
    
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
        for (Observer observer : observers){
            observer.update(temperature,humidity);
        }
    }
    
    
    
    public void setMeasurements(Integer temperature,Integer humidity){
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }
    
    public void measurementChanged(){
        notifyObservers();
    }
    
}
