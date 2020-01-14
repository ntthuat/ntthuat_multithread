package com.ntthuat.multithread.exception;

import java.util.concurrent.CountDownLatch;

/**
 * @author ntthuat
 */
public class ServiceOne implements Runnable {

    @Override
    public void run() {
        System.out.println("Started service One");
        throw new RuntimeException();
    }
}
