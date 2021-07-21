package com.leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Main {

    volatile static  List<Integer> list = new LinkedList<>();
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    
    
    Thread thread =
        new Thread(
            () -> {
                for (int i = 0; i < 100000; i++) {
                    list.add(i);
                    
                }
            });
    Thread thread2 =
        new Thread(
            () -> {
    
                for (int i = 0; i < 100000; i++) {
                    list.add(i);
        
                }
//                thread.join();
            });
    thread.start();
    thread2.start();
    thread.join();
    thread2.join();
    System.out.println(list.size());
  }
}
