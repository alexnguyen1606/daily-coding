package com.leetcode.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * @author:Nguyen Anh Tuan
 *     <p>12:49 AM ,February 01,2022
 */
public class PrintInOrder_1114 {

  public static class Foo {
  	CountDownLatch latchSecond = new CountDownLatch(1);
  	CountDownLatch latchThird = new CountDownLatch(1);
    public Foo() {}

    public void first(Runnable printFirst) throws InterruptedException {
      // printFirst.run() outputs "first". Do not change or remove this line.
      printFirst.run();
      latchSecond.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
      latchSecond.await();
      // printSecond.run() outputs "second". Do not change or remove this line.
      printSecond.run();
      latchThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
    	latchSecond.await();
    	latchThird.await();
      // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        notify();
    }
  }
  
  public static class Second {
    
      private volatile boolean second;
      private volatile boolean third;
      
      public void first(Runnable printFirst) throws InterruptedException {
          // printFirst.run() outputs "first". Do not change or remove this line.
          printFirst.run();
          second = true;
      }
    
      public void second(Runnable printSecond) throws InterruptedException {
          while (!second);
          // printSecond.run() outputs "second". Do not change or remove this line.
          printSecond.run();
          third = true;
      }
    
      public void third(Runnable printThird) throws InterruptedException {
          while (!third);
          // printThird.run() outputs "third". Do not change or remove this line.
          printThird.run();
      }
      
  }

  public static void main(String[] args) throws InterruptedException {
    Foo foo = new Foo();
    Thread first =
        new Thread(
            () -> {
              try {
                foo.first(() -> System.out.println("first "));
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
    first.setName("First");
    Thread second =
        new Thread(
            () -> {
              try {
                foo.second(() -> System.out.println("second "));
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
    second.setName("Second");
    Thread third =
        new Thread(
            () -> {
	            try {
		            foo.third(() -> System.out.println("Third"));
	            } catch (InterruptedException e) {
		            e.printStackTrace();
	            }
            });
    third.setName("Third");
    third.start();
    first.start();
    second.start();
    first.join();
    second.join();
    third.join();
  }
}
