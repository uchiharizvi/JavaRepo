package Threads.ExtendThreadClass;

public class Client {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
