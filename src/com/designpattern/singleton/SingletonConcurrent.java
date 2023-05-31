package com.designpattern.singleton;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:13 AM ,July 19,2021
 */
public class SingletonConcurrent {
    static {
        System.out.println("Check");
    }

    private static SingletonConcurrent instance;

    {
        System.out.println("end");
    }

    private SingletonConcurrent() {
    }


    // double check locking
    public static SingletonConcurrent getInstance() {
        if (instance == null) {
            synchronized (SingletonConcurrent.class) {
                if (instance == null) {
                    System.out.println("Create");
                    instance = new SingletonConcurrent();
                }
            }
        }
        return instance;
    }

    public final void print() {
        System.out.println("Hello world");
    }


    public static void main(String[] args) {
        SingletonConcurrent singletonConcurrent = SingletonConcurrent.getInstance();
        singletonConcurrent.print();
    }
}
