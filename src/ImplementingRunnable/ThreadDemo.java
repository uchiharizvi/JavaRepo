package ImplementingRunnable;

import MultiThreading.ExtendingThread.Threads.MyThread;

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
