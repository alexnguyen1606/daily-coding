package com.leetcode.designparttern.factorymethod.randomlucky;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Coin implements Tossing {
  private Coin() {}

  @Override
  public void tossing() {
    System.out.println("Tossing coin");
  }

  public static TossingFactory factory = Coin::new;
}
