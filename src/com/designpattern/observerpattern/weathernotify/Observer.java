package com.designpattern.observerpattern.weathernotify;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:10 PM ,January 11,2021
 */
public interface Observer {
    void update(Integer temp,Integer humidity);
    default void disconnect() {
        throw new UnsupportedOperationException("Operator not support");
    }
    
}
