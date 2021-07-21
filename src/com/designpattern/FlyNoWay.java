package com.designpattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:59 PM ,January 06,2021
 */
public class FlyNoWay implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
