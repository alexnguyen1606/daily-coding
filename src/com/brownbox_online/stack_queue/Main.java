package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 *     <p>2:49 PM ,August 17,2021
 */
public class Main {
  public static void main(String[] args) {
    MyCircularQueue queue = new MyCircularQueue(8);
    queue.enQueue(3);
    queue.enQueue(9);
    queue.enQueue(5);
    queue.enQueue(0);
    queue.deQueue();
    queue.deQueue();
    System.out.println(queue.Rear());
    System.out.println(queue.Rear());
  }
}
