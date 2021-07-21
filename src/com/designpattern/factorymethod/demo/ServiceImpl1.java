package com.designpattern.factorymethod.demo;

/**
 * @author:Nguyen Anh Tuan
 * <p>September 11,2020
 */
public class ServiceImpl1 implements Service {
    @Override
    public void method1() {
        System.out.println("Service imple 1,method 1");
    }
    
    @Override
    public void method2() {
        System.out.println("Service imple 1,method 2");
    }
    
    private ServiceImpl1() {
    }
    
    public static FactoryService factory = ServiceImpl1::new;
}
