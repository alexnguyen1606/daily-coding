package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:49 PM ,August 17,2021
 */
public class Main {
  public static void main(String[] args) {
    IStackQueue stack = new MyStackLinkedList(10);
    stack.push(0);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.push(5);
    stack.print();
  }
}
