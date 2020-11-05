package com.leetcode.designparttern.factorymethod.randomlucky;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 11,2020
 */
public class Factories {


  public static void main(String[] args) {
   Tossing factory = Dice.factory.getTossing();
   factory.tossing();
   factory = Coin.factory.getTossing();
   factory.tossing();

  }
}
