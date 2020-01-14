package com.ntthuat.multithread.run;

/**
 * @author ntthuat
 */
public class ServiceTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("Started service Two");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service Two");
    }
}
