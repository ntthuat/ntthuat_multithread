package com.ntthuat.multithread;

/**
 * @author ntthuat
 */
public class MyThread extends Thread {

    public void run() {
        System.out.println("MyThread Running " + Thread.currentThread().getName());
    }
}
