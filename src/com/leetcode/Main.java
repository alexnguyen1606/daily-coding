package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<Integer> list = new LinkedList<>();
    Thread thread =
        new Thread(
            () -> {
              for (int i = 0; i < 100000000; i++) {
                list.add(i);
              }
            });
    Thread thread2 =
        new Thread(
            () -> {
              for (int i = 0; i < 100000000; i++) {
                list.add(i);
              }
            });
    thread.start();
    thread2.start();
    thread.join();
    System.out.println(list.size());
  }
}
