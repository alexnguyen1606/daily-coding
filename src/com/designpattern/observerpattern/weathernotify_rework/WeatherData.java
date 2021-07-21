package designpattern.observerpattern.weathernotify_rework;

import java.util.Observable;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:22 AM ,January 12,2021
 */
public class WeatherData extends Observable {
    private int humidity;
    private int temp;
    private int presure;
    
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(int humidity, int temp, int presure) {
        this.humidity = humidity;
        this.presure = presure;
        this.temp = temp;
        measurementsChanged();
    }
    
    public int getHumidity() {
        return humidity;
    }
    
    public int getTemp() {
        return temp;
    }
    
    public int getPresure() {
        return presure;
    }
}
