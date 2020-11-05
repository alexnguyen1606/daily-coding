package com.leetcode.designparttern.factorymethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 01,2020
 */
public abstract class Abstract {
    private String a;
    
    public Abstract(String a) {
        this.a = a;
    }
    
    public Abstract() {
    }
    
    public abstract void print();
}
