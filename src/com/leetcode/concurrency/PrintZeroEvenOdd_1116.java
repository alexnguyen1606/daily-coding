package com.leetcode.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * @author: Nguyen Anh Tuan
 * @created: 8/12/2022
 */

public class PrintZeroEvenOdd_1116 {

    static class ZeroEvenOdd {
        private int n;
        private AtomicInteger index = new AtomicInteger(0);

        Lock lockZero = new ReentrantLock();
        Lock lockEven = new ReentrantLock();
        Lock lockOdd = new ReentrantLock();

        public ZeroEvenOdd(int n) {
            this.n = n;
            initLock();
        }

        private void initLock() {
            lockEven.lock();
            lockOdd.lock();
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            lockZero.lock();
            try {
                printNumber.accept(0);
            } finally {
                lockEven.unlock();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            lockEven.lock();
            try {
                printNumber.accept(index.get());
                index.incrementAndGet();
            } finally {
                lockOdd.unlock();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            lockOdd.lock();
            try {
                printNumber.accept(index.get());
                index.incrementAndGet();
            } finally {
                lockZero.unlock();
            }
        }

        private boolean isEven() {
            return this.index.get() % 2 == 0;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(10);
        Thread thread = new Thread(runZero(zeroEvenOdd));
        Thread thread2 = new Thread(runEven(zeroEvenOdd));
        Thread thread3 = new Thread(runOdd(zeroEvenOdd));

        thread.start();
        thread2.start();
        thread3.start();

        thread.join();
        thread2.join();
        thread3.join();
    }

    private static Runnable runZero(ZeroEvenOdd zeroEvenOdd) {
        return () -> {
            try {
                zeroEvenOdd.zero(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    private static Runnable runEven(ZeroEvenOdd zeroEvenOdd) {
        return () -> {
            try {
                zeroEvenOdd.even(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    private static Runnable runOdd(ZeroEvenOdd zeroEvenOdd) {
        return () -> {
            try {
                zeroEvenOdd.odd(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

}
