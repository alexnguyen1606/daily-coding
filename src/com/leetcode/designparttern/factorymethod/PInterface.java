package com.leetcode.designparttern.factorymethod;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 13,2020
 */
public interface PInterface {


    void create();

    class common implements PInterface {
    public static void update(PInterface pInterface){
        pInterface.create();
    }
    @Override
    public void create() {
      System.out.println("common create2");
    }
  }
}
