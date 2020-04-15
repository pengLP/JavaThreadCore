package com.mythread;

public class DaemonThread extends Thread {

    public DaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        for (int i = 0; i < 1000; ++i) {
            System.out.println(Thread.currentThread().getName() + " output #" + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " end");
    }
}
