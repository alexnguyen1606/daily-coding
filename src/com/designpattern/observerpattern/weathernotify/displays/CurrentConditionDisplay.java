package designpattern.observerpattern.weathernotify.displays;

import designpattern.observerpattern.weathernotify.Observer;
import designpattern.observerpattern.weathernotify.Subjects;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:14 PM ,January 11,2021
 */
public class CurrentConditionDisplay implements Observer, ElementDisplay {
    private Integer temperature;
    private Integer humidity;
    private Subjects weatherSubject;
    
    public CurrentConditionDisplay(Subjects weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current display ");
        System.out.println("Temp :"+temperature+" humidity: "+humidity);
    }
    
    
    @Override
    public void update(Integer temp, Integer humidity) {
        this.humidity = humidity;
        this.temperature = temp;
        display();
    }
    
}
