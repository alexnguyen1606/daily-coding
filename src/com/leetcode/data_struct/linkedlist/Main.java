package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:10 AM ,November 27,2020
 */
public class Main {

  public static void main(String[] args) {
    SingleLinkedList<Integer> single = new SingleLinkedList<>();
    single.add(0);
    single.add(1);
    single.add(2);
    Integer[] array = single.toArray();
  }
}
