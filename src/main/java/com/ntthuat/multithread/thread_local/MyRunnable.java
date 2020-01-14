package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class MyRunnable implements Runnable {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        threadLocal.set((int) (Math.random() * 50D));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(threadLocal.get());
    }
}
