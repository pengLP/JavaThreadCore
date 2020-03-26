package com.mythread;

public class MyThread extends Thread{

    @Override
    public void run() {

        for (int i = 0;i < 5; i++) {
            System.out.println(i);
            if (i == 2){
                if (interrupted())
                    return;
            }
        }


    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("myThread.isInterrupted():" + myThread.isInterrupted());
    }
}

/*        while (true){
            System.out.println(count++);
            if (this.isInterrupted()) {
                break;
            }
        }*/