package designpattern.observerpattern.weathernotify.displays;

import designpattern.observerpattern.weathernotify.Observer;
import designpattern.observerpattern.weathernotify.Subjects;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:16 PM ,January 11,2021
 */
public class ThirdPartyDisplay implements Observer, ElementDisplay {
    private Integer temperature;
    private Integer humidity;
    private Subjects weatherSubject;
    
    public ThirdPartyDisplay(Subjects weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Third party display ");
        System.out.println("Temp: "+temperature+" --- Humidity:"+humidity);
    }
    
    @Override
    public void update(Integer temp, Integer humidity) {
        temperature = temp;
        this.humidity = humidity;
        display();
        
        
    }
}
