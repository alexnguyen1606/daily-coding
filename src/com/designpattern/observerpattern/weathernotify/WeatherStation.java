package com.designpattern.observerpattern.weathernotify;

import com.designpattern.observerpattern.weathernotify.displays.CurrentConditionDisplay;
import com.designpattern.observerpattern.weathernotify.displays.ForecastDisplay;
import com.designpattern.observerpattern.weathernotify.displays.ThirdPartyDisplay;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:00 PM ,January 11,2021
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherSubject subjects = new WeatherSubject();
        Observer current = new CurrentConditionDisplay(subjects);
        Observer forecast = new ForecastDisplay(subjects);
        Observer thirdParty = new ThirdPartyDisplay(subjects);
        
        subjects.setMeasurements(10,100);
        System.out.println();
        current.disconnect();
        subjects.setMeasurements(25,70);
        System.out.println();

        subjects.setMeasurements(40,90);
        
        
    }
}
