package designpattern.observerpattern.weathernotify_rework;

import designpattern.observerpattern.weathernotify.displays.ElementDisplay;

import java.util.Observable;
import java.util.Observer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:30 AM ,January 12,2021
 */
public class ThirdPartyDisplay implements Observer, ElementDisplay {
    private int humidity;
    private int temp;
    private int presure;
    private Observable observable;
    
    public ThirdPartyDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Third party:");
        this.toString();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            humidity = weatherData.getHumidity();
            temp = weatherData.getTemp();
            presure = weatherData.getPresure();
        }
    }
}
