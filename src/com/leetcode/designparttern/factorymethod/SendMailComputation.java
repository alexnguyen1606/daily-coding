package com.leetcode.designparttern.factorymethod;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 23,2020
 */
public class SendMailComputation extends RecursiveTask<Integer> {
  private int number;

  public SendMailComputation(int number) {
    this.number = number;
  }

  @Override
  protected Integer compute() {
    if (number <= 1) {
      return number;
    }
    SendMailComputation sendMailComputation = new SendMailComputation(number - 1);
    sendMailComputation.fork();
    SendMailComputation sendMailComputation1 = new SendMailComputation(number - 2);
    return sendMailComputation.join() + sendMailComputation1.compute();
  }
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

  public static void main(String[] args) {
    ForkJoinPool pool = ForkJoinPool.commonPool();
    long beforeTime = System.currentTimeMillis();
    int x = pool.invoke(new SendMailComputation(40));
    System.out.println(x);
    System.out.println(System.currentTimeMillis() - beforeTime);
     Long beforeTime2 = System.currentTimeMillis();
    Integer x2 = fibonacci(40);
    System.out.println(x2);
    System.out.println(System.currentTimeMillis()-beforeTime2);
  }
}
