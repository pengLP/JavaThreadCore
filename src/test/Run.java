package test;

import com.mythread.MyThread;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
    }
}

/*Thread.sleep(2000);
        myThread.interrupt();
        System.out.println(myThread.isInterrupted());*/