package com.ntthuat.multithread.future_task;

import java.util.concurrent.Callable;

/**
 * @author ntthuat
 */
public class MyCallable implements Callable<String> {

    private long waitTime;

    public MyCallable(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        System.out.println("Done Thread: " + Thread.currentThread().getName());
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

}
