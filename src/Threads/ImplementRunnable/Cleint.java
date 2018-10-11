package Threads.ImplementRunnable;

public class Cleint {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //one extra line in case of runnable interface
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
