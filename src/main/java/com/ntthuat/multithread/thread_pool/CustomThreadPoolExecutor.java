package com.ntthuat.multithread.thread_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ntthuat
 */
public class CustomThreadPoolExecutor extends ThreadPoolExecutor {

    private BlockingQueue blockingQueue;

    public CustomThreadPoolExecutor(int corePoolSize,
                                    int maximumPoolSize,
                                    long keepAliveTime,
                                    TimeUnit unit,
                                    BlockingQueue<Runnable> blockingQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, blockingQueue);
        this.blockingQueue = blockingQueue;
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println("Perform beforeExecute() logic");
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        if (t != null) {
            System.out.println("Perform exception handler logic");
        }
        System.out.println("Perform afterExecute() logic");
    }

    @Override
    public void execute(Runnable r) {
        System.out.println("Blocking Queue size: " + blockingQueue.size());
        super.execute(r);
    }

}
