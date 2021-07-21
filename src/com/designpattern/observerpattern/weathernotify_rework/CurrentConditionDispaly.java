package designpattern.observerpattern.weathernotify_rework;

import designpattern.observerpattern.weathernotify.displays.ElementDisplay;

import java.util.Observable;
import java.util.Observer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:25 AM ,January 12,2021
 */
public class CurrentConditionDispaly implements Observer, ElementDisplay {
    private int humidity;
    private int temp;
    private int presure;
    private Observable observable;
    
    public CurrentConditionDispaly(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    @Override
    public void display() {
        this.toString();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temp = weatherData.getTemp();
            humidity = weatherData.getHumidity();
            presure = weatherData.getPresure();
        }
        display();
    }
}
