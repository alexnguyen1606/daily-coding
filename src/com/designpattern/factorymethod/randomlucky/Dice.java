package com.designpattern.factorymethod.randomlucky;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Dice implements Tossing {
  private Dice() {}

  @Override
  public void tossing() {
    System.out.println("Tossing Dice");
  }

  public static TossingFactory factory = Dice::new;
}
