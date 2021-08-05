package com.designpattern.templatemethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * July 21,2021
 */
public interface Inteface < T> {
    void print();
    default void callOut(T t){
        if (t instanceof String){
      System.out.println(t);
        }
    }
}
