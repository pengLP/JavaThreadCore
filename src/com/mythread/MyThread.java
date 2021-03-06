package com.mythread;

import java.util.concurrent.ConcurrentHashMap;

class MyThread extends Thread{

    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        for (int i=0; i < 50; ++i)
        {
            System.out.println(Thread.currentThread().getName() + " output #"+ i);
            try {
                sleep(500);//这里的延时是为了能使效果更明显
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " end");
    }
}