package com.leetcode.concurrency;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:46 PM ,February 01,2022
 */
public class PrintFooBarAlternately_1115 {

  public static class FooBar {
    private final int n;
    private volatile boolean foo = true;
    private volatile boolean bar;

    public FooBar(int n) {
      this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

      for (int i = 0; i < n; i++) {
        while (isWaitingBar()) ;
        // printFoo.run() outputs "foo". Do not change or remove this line.
        printFoo.run();
        reverseFoo();
        reverseBar();
      }
    }

    public void bar(Runnable printBar) throws InterruptedException {

      for (int i = 0; i < n; i++) {
        while (isWaitingFoo()) ;
        // printBar.run() outputs "bar". Do not change or remove this line.
        printBar.run();
        reverseBar();
        reverseFoo();
      }
    }

    private boolean isWaitingFoo() {
      return foo;
    }

    private boolean isWaitingBar() {
      return bar;
    }

    private void reverseFoo() {
      foo = !foo;
    }

    private void reverseBar() {
      bar = !bar;
    }
  }
}
