package ExecutorFramework.Program2;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) {

        BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandelerImpl();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectedExecutionHandler);
        threadPoolExecutor.prestartAllCoreThreads();
    }
}
