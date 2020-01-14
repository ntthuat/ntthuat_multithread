package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        MyRunnable runnableInstance = new MyRunnable();

        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance);
        // this will call run() method
        t1.start();
        t2.start();
    }
}
