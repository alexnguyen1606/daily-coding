package com.leetcode.data_struct.doublylinkedlist;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:50 PM ,November 13,2020
 */
public class Test {
  public static void main(String[] args) {
    DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.addAtHead(0);
    list.deleteAtIndex(4);
    
    list.print();
    
  
  }
}
