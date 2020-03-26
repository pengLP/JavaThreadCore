package test;

import com.mythread.MyThread;

public class Test {

    public static void main(String[] args) {
        MyThread a = new MyThread();
        MyThread b = new MyThread();
        a.start();
        b.start();

        /*for (int i = 0;i < 5; i++) {
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(50000000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();;
                    }
                }
            }.start();
        }*/

//        MyThread thread = new MyThread();
//        thread.setName("myThread");
//        thread.start();
//        for (int i = 0;i < 10000; i++) {
//            System.out.println("main=" + Thread.currentThread().getName());
//        }

/*        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread , "A");
        Thread b = new Thread(myThread , "B");
        Thread c = new Thread(myThread , "C");
        Thread d = new Thread(myThread , "D");
        Thread e = new Thread(myThread , "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();*/

//        MyThread thread = new MyThread("1");
//        thread.start();
    }

}
