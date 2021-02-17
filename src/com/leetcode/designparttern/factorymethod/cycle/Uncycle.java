package com.leetcode.designparttern.factorymethod.cycle;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Uncycle implements Cycle {
  private Uncycle() {}

  @Override
  public void run() {
    System.out.println("uncycel cant run");
  }

  public static CycleFactory factory = () -> new Uncycle();
}
