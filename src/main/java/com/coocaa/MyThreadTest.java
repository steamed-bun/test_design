package com.coocaa;

import java.util.concurrent.CountDownLatch;

public class MyThreadTest implements Runnable{

    private CountDownLatch countDownLatch;

    private MyThreadTest(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("thread in...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("thread exit...");
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for(int i = 0; i < 5; i++){
            Thread thread1 = new Thread(new MyThreadTest(countDownLatch));
            thread1.start();
            System.out.println(thread1.getName());
        }
        System.out.println("main...");
        countDownLatch.await();
        System.out.println("main exit...");
    }

}
