package com.mythread;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " get start!!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*****
         注释的几行演示 线程的join用法： 调用线程会使得其他线程等待自己完成后  其他线程才会继续执行

         /*********************************/
/*        MyThread thread = new MyThread("MyThread");
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        /******************************************
         //主线程的守护线程，在主线程结束后，守护线程会立即停止
         *****************************/
        DaemonThread daemonThread = new DaemonThread("DaemonThread");
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName() + " end!!!!!");
    }

}
