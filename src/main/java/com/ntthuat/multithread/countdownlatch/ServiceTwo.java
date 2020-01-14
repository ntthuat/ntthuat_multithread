package com.ntthuat.multithread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author ntthuat
 */
public class ServiceTwo implements Runnable {

    private final CountDownLatch latch;

    public ServiceTwo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started service Two");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service Two");
        latch.countDown();
    }
}
