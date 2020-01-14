package com.ntthuat.multithread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author ntthuat
 */
public class ServiceOne implements Runnable {

    private final CountDownLatch latch;

    public ServiceOne(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started service One");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service One");
        latch.countDown();
    }
}
