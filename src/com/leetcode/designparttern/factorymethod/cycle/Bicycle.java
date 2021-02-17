package com.leetcode.designparttern.factorymethod.cycle;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Bicycle implements Cycle {
  private Bicycle() {}

  @Override
  public void run() {
    System.out.println("Bicycle run");
  }

  public static CycleFactory factory = Bicycle::new;
}
