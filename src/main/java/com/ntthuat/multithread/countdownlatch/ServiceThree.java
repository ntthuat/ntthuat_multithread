package com.ntthuat.multithread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author ntthuat
 */
public class ServiceThree implements Runnable {

    private final CountDownLatch latch;

    public ServiceThree(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started service Three");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service Three");
        latch.countDown();
    }
}
