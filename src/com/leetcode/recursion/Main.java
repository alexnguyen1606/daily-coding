package com.leetcode.recursion;

import com.leetcode.designparttern.factorymethod.Excersice25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:10 PM ,November 16,2020
 */
public class Main extends Excersice25 {
    
    Excersice25 excersice25 = new Excersice25();
    public void A (){
    
    }
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Excersice25 excersice25 = new Excersice25();
      Method[] methods = excersice25.getClass().getDeclaredMethods();
      
      Method method = excersice25.getClass().getDeclaredMethod("printInPrivate",String.class);
      
      method.setAccessible(true);
      
     
  }
}
