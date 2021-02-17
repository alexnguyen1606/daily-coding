package com.leetcode.designparttern.factorymethod.cycle;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:55 PM ,January 13,2021
 */
public class Main {
    public static void main(String[] args) {
        Cycle cycle = Bicycle.factory.getCycle();
        cycle.run();
    }
}
