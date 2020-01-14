package com.ntthuat.multithread;

/**
 * @author ntthuat
 */
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("MyRunnable running " + Thread.currentThread().getName());
    }
}

